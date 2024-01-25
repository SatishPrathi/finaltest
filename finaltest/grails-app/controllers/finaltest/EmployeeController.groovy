package finaltest

class EmployeeController {
    def index() {
        def employees = Employee.list()
        [employees: employees]
    }

    def create() {
        def employee = new Employee(params)
        if (employee.save()) {
            redirect(action: 'index')
        } else {
            render(view: 'create', model: [employee: employee])
        }
    }

    def edit(Long id) {
        def employee = Employee.get(id)
        render(view: 'edit', model: [employee: employee])
    }

    def update(Long id) {
        def employee = Employee.get(id)
        employee.properties = params
        if (employee.save()) {
            redirect(action: 'index')
        } else {
            render(view: 'edit', model: [employee: employee])
        }
    }

    def delete(Long id) {
        def employee = Employee.get(id)
        employee.delete()
        redirect(action: 'index')
    }
}
