package HomeWork.UrlBuilderClass;

public class MainClass {


    public static void main(String[] args) {
        String url = new Url.UrlBuilder("facebook.com")
                .withHttps(true)
                .withResource("Dima")
                .withIsQa(true)

                .build().getUrl();
        System.out.println(url);
    }
}
