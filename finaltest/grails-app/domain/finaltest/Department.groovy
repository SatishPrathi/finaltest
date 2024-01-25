package finaltest

class Department {
    String name
    String location
    String incharge
    Date established_Date

    static belongsTo = [address: Address]

    static constraints = {
        name(nullable: false)
        incharge(nullable: false)
        establishedDate(nullable: false)
   }
}