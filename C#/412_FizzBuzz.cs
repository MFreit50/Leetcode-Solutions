public class Solution {
    public IList<string> FizzBuzz(int n) {
        IList<string> solution = new List<string>();
        for(int i = 1; i <= n; i++){
            if(i % 3 == 0 && i % 5 == 0){
                solution.Add("FizzBuzz");
            }else if(i % 3 == 0){
                solution.Add("Fizz");
            }else if(i % 5 == 0){
                solution.Add("Buzz");
            }else{
                solution.Add(i.ToString());
            }
        }
        return solution;
    }
}