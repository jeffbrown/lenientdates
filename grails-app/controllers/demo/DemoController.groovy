package demo

class DemoController {

    def index(SomeCommandObject co) {
        render "Date: ${co.someDate}, Errors: ${co.errors}"
    }
}

class SomeCommandObject {
    Date someDate
}
