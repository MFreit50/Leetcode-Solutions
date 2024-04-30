//@ts-ignore
function numberOfSteps(num: number): number {
    let steps = 0;
    while(num != 0){
        num = ((num&1) == 0) ? num/2 : num-1;
        steps++;
    }
    return steps;
};