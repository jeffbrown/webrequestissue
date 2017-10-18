package webrequestissue

class DemoController {

    static final SOME_CONSTANT = 42

    def index(int x, int y) {
        int sum = x + y
        render "$x plus $y is $sum"
    }
}
