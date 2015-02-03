/**
 * Created by kevin on 15-2-3.
 */
public class CompareNumber {
    public String compare(String input, String answer) {
        int a_count = 0,b_count = 0;
        for(int x = 0; x < input.length(); x++){
            if(answer.contains(String.valueOf(input.charAt(x)))){
                b_count++;
            }

            if(input.charAt(x) == answer.charAt(x)){
                a_count++;
            }
        }
        return a_count + "A" + b_count + "B";
    }
}
