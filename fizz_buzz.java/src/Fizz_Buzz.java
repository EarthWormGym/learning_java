public class Fizz_Buzz {

    public boolean main() {
        for(int i = 0; i <= 100; i++) {
            if(i % 3 == 0 && i % 5 == 0) {
                isMultipleOf3and5(i);
            } else if(i % 3 == 0) {
                isMultipleOf3(i);
            } else if(i % 5 == 0) {
                isMultipleOf5(i);
            }
        }
        return true;
    }

    public boolean isMultipleOf3(int i) {
        if(i % 3 == 0){
            System.out.println("fizz");
            return true;
        }
        return false;
    }

    public boolean isMultipleOf5(int i) {
        if(i % 5 == 0){
            System.out.println("buzz");
            return true;
        }
        return false;
    }

    public boolean isMultipleOf3and5(int i) {
        if(i % 5 == 0 && i % 3 == 0){
            System.out.println("fizzbuzz");
            return true;
        }
        return false;
    }
}