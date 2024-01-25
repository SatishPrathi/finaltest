package finaltest

class Employee {
    String first_Name
    String last_Name
    Integer age
    String sex
    String highest_Education
    String blood_Group
    Date joining_Date
    String status

    static belongsTo = [address: Address, department: Department]

    static constraints = {
        sex(inList: ['M', 'F'])
        status(inList: ['active', 'inactive', 'hold'])
    }
}
