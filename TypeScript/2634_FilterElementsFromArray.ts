type Fn = (n: number, i: number) => any
//@ts-ignore
function filter(arr: number[], fn: Fn): number[] {
    const filteredArr: number[] = [];
    for(let i : number = 0; i < arr.length; i++){
        if(fn(arr[i], i)){
            filteredArr.push(arr[i]);
        }
    }
    return filteredArr;
};