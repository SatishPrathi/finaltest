package finaltest

class Address {
    String building_Name
    String street1
    String street2
    String city_Name
    String district
    String state
    String country
    String zip

    static constraints = {
        street1(nullable: false)
    }
}