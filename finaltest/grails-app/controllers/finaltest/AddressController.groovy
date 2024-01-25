package finaltest

class AddressController {
static scaffold = Address
    
    def create() {
        def address = new Address(params)
        if (address.save()) {
            redirect(action: 'index')
        } else {
            render(view: 'create', model: [address: address])
        }
    }

    def edit(Long id) {
        def address = Address.get(id)
        render(view: 'edit', model: [address: address])
    }

    def update(Long id) {
        def address = Address.get(id)
        address.properties = params
        if (address.save()) {
            redirect(action: 'index')
        } else {
            render(view: 'edit', model: [address: address])
        }
    }

    def delete(Long id) {
        def address = Address.get(id)
        address.delete()
        redirect(action: 'index')
    }
}
