public class FizzBuzz {
    public String replace(Integer number) {
        if (number % 15 == 0) {
            return "FizzBuzz";
        } else if (number % 3 == 0){
            return "Fizz";
        } else if (number % 5 == 0) {
            return "Buzz";
        }

        return number.toString();
    }

    public String generate(Integer upto) {
        String answer = "1";
        for (int i = 1; i <= upto; i++) {
            if (i == 1) {
                answer = replace(i);
            } else {
                answer += ", " + replace(i);
            }
        }
        return answer;
    }
}
