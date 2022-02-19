import com.basic.spock.demo.Calculator
import spock.lang.Specification

class CalculatorTest extends Specification {

  def calculator = new Calculator()

  def "should return 300 when call multiply given a=15 b=20"() {
    given:
    def a = 15
    def b = 20

    when:
    def result = calculator.multiply(a, b)

    then:
    result == 300
  }

  def "should return 450 when call multiply given a=15 b=30"() {
    given:
    def a = 15
    def b = 30

    when:
    def result = calculator.multiply(a, b)

    then:
    result == 450
  }


  def "should return 300 when call multiply given a=15 b=20 using expect block"() {
    expect:
    calculator.multiply(15, 20) == 300
  }

  def "should return correct value when call multiply"() {
    expect:
    calculator.multiply(4, 5) == 20
    calculator.multiply(3, 5) == 15
    calculator.multiply(6, 5) == 30
  }

}
