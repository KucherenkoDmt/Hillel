package HomeWork.UrlBuilderClass;

import java.util.HashMap;
import java.util.Map;

public class Url {
    private String serverName;
    private String http;
    private String resource="";
    private String isQa="";
    private HashMap<String, String> param=new HashMap<>();

    private Url(UrlBuilder urlBuilder){
        this.serverName=urlBuilder.serverName;
        this.http=urlBuilder.http;
        this.resource=urlBuilder.resource;
        this.isQa=urlBuilder.isQa;
        this.param=urlBuilder.param;
    }

    private String url;

    public String getUrl() {
        this.url= http + "://"+"www." + serverName+"/"+resource+params();
        return this.url.concat("&"+isQa);
    }
    private String params(){
        String params="";
        String firstSumbol;
        int counter = 0;
        for (Map.Entry<String,String> entry: param.entrySet()){
            firstSumbol = counter>0 ? "&" : "?";
            params+=firstSumbol+entry.getKey()+"="+entry.getValue();
            counter++;
        }
        return params;
    }


    public static class UrlBuilder{
        private String serverName;
        private String http="http";
        private String resource;
        private String isQa="";
        private HashMap<String, String> param=new HashMap<>();


        public UrlBuilder(String serverName){
            this.serverName=serverName;
        }
        public UrlBuilder withHttps(boolean isHttps){
            http = isHttps ? "https" : "http";
            return this;
        }
        public UrlBuilder withResource(String resource){
            this.resource=resource;
            return this;
        }
        public UrlBuilder withIsQa(boolean isQa){
            String part= "isQa=";
            this.isQa=part+isQa;
            return this;
        }
        public UrlBuilder withParam(String key, String value){
           this.param.put(key, value);
           return this;
        }

        public Url build(){
            return new Url(this);
        }
    }
}
