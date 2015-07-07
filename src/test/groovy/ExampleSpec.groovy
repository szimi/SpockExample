import spock.lang.Specification

class ExampleSpec extends Specification {

    void 'sample test'() {
        given:
           int a = 1

        when:
            a++

        then:
           a == 2
    }
}
