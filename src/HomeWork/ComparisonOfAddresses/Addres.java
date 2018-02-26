package HomeWork.ComparisonOfAddresses;

public class Addres {
    String street = "";
    String city = "";
    int houseNumber = 0;
    String state = "";
    int zipCode = 0;

    Addres(String street, String city, int houseNumber, String state, int zipCode) {
        setHouseNumber(houseNumber);
        setStreet(street);
        setCity(city);
        setState(state);
        setZipCode(zipCode);
    }
    public Addres duplicate(){
        return new Addres(this.street, this.city, this.houseNumber, this.state, this.zipCode);
    }

    public void setStreet(String street) {
        if (street == null || street.equals("")) {
            this.street = "Unknow";
        } else this.street = street;
    }
    public void setHouseNumber(int houseNumber) {
        if (houseNumber > 0) {
            this.houseNumber = houseNumber;
        } else {
            this.houseNumber = 0;
        }
    }
    public void setCity(String city) {
        if (city == null || city.equals("")) {
            this.city = "Unknow";
        } else this.city = city;
    }
    public void setState(String state) {
        if (state == null || state.equals("")) {
            this.state = "Unknow";
        } else this.state = state;
    }
    public void setZipCode(int zipCode) {
        if (zipCode > 0) {
            this.zipCode = zipCode;
        } else this.zipCode = 0;
    }

    @Override
    public String toString() {
        return " Street is: " + street + ",city: " + city + ", house number: " + houseNumber + ", state " + state + ", zip Code: " + zipCode;
    }
}
