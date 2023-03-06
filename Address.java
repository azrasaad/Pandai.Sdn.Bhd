public class Address {
    private String street;
    private String postcode;
    private String district;
    private String state;
    private String country;

    public Address(String street, String postcode, String district, String state, String country){
        this.street =street;
        this.postcode = postcode;
        this.district = district;
        this.state = state;
        this.country = country;
    }

    String getStreet(){
        return street;
    }
    String getPostcode(){
        return postcode;
    }
    String getDistrict(){
        return district;
    }
    String getState(){
        return state;
    }
    String getCountry(){
        return country;
    }
}
