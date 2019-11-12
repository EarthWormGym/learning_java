import static org.junit.jupiter.api.Assertions.*;

class Fizz_BuzzTest {

    @org.junit.jupiter.api.Test
    void isMultipleOf3() {
        Fizz_Buzz fizzBuzz = new Fizz_Buzz();
        assertEquals(fizzBuzz.isMultipleOf3(3), true);
    }

    @org.junit.jupiter.api.Test
    void isMultipleOf5() {
        Fizz_Buzz fizzBuzz = new Fizz_Buzz();
        assertEquals(fizzBuzz.isMultipleOf5(5),true);
    }

    @org.junit.jupiter.api.Test
    void isMultipleOf3and5() {
        Fizz_Buzz fizzBuzz = new Fizz_Buzz();
        assertEquals(fizzBuzz.isMultipleOf3and5(15),true);
    }

    @org.junit.jupiter.api.Test
    void main() {
        Fizz_Buzz fizzBuzz = new Fizz_Buzz();
        assertEquals(fizzBuzz.main(), true);
    }
}