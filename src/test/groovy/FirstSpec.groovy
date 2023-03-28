import spock.lang.Specification


class FirstSpec extends Specification {
    def "should return correct count of elements in a list"() {
        given:
        def inputList = [1, 2, 3, 2, 1, 3, 1]
        def expectedCounts = [1:3, 2:2, 3:2]

        when:
        def result = Main.countElements(inputList)

        then:
        result == expectedCounts
    }

    def "test countElements with empty list"() {
        given:
        def list = []

        when:
        def result = Main.countElements(list)

        then:
        result.isEmpty()
    }
}
