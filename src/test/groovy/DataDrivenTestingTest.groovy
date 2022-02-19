import com.basic.spock.demo.Calculator
import spock.lang.Specification

class DataDrivenTestingTest extends Specification {

  def calculator = new Calculator()

  def "should return #result when call multiply given #a*#b"() {
    expect:
    calculator.multiply(a, b) == result

    where:
    a   | b  | result
    4   | 5  | 20
    3   | 5  | 15
    6   | 5  | 30
  }

  def "should return #result when call multiply given #a*#b using data pipes"() {
    expect:
    calculator.multiply(a, b) == result

    where:
    a << [4, 3, 6]
    b << [5, 5, 5]
    result << [20, 15, 30]
  }

  def "should return true when string contains spock given string=#name"() {
    expect:
    name.toLowerCase().contains("spock")

    where:
    name << ["spock", "SPOCK", "I like spock"]
  }
}
