package webrequestissue

import grails.testing.web.controllers.ControllerUnitTest
import spock.lang.Specification
import spock.lang.Unroll

class DemoControllerSpec extends Specification implements ControllerUnitTest<DemoController> {

    @Unroll('#x plus #y should be #sum')
    void "test index"() {
        when:
        params.x = x
        params.y = y
        controller.index()

        then:
        response.text == "$x plus $y is $sum"

        where:
        x  | y | sum
        4  | 5 | 9
        40 | 2 | controller.SOME_CONSTANT
    }
}
