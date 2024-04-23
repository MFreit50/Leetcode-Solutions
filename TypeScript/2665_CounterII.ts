type Counter = {
    increment: () => number,
    decrement: () => number,
    reset: () => number,
}
//@ts-ignore
function createCounter(init: number): Counter {
    let input = init;
    return{
        increment(){
            return ++input;
        },
        decrement(){
            return --input;
        },
        reset(){
            return input = init;
        }
    }
};

/**
 * const counter = createCounter(5)
 * counter.increment(); // 6
 * counter.reset(); // 5
 * counter.decrement(); // 4
 */