package finaltest

class DepartmentController {
    def index() {
        def departments = Department.list()
        [departments: departments]
    }

    def create() {
        def department = new Department(params)
        if (department.save()) {
            redirect(action: 'index')
        } else {
            render(view: 'create', model: [department: department])
        }
    }

    def edit(Long id) {
        def department = Department.get(id)
        render(view: 'edit', model: [department: department])
    }

    def update(Long id) {
        def department = Department.get(id)
        department.properties = params
        if (department.save()) {
            redirect(action: 'index')
        } else {
            render(view: 'edit', model: [department: department])
        }
    }

    def delete(Long id) {
        def department = Department.get(id)
        department.delete()
        redirect(action: 'index')
    }
}
