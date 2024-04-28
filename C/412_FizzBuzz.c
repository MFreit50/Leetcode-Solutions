/**
 * Note: The returned array must be malloced, assume caller calls free().
 */
char** fizzBuzz(int n, int* returnSize) {
    *returnSize = n;
    char** result = malloc(sizeof(*result) * n);
    if(!result){
        return (result);
    }
    for(int i = 1; i <= n; i++){
        if(i % 15 == 0){
            result[i - 1] = "FizzBuzz";
        }else if(i % 3 == 0){
            result[i - 1] = "Fizz";
        }else if(i % 5 == 0){
            result[i - 1] = "Buzz";
        }else{
            char* num_str = (char*)malloc(sizeof(char) * 12);
            sprintf(num_str, "%d", i);
            result[i - 1] = num_str;
        }
    }
    return result;
}