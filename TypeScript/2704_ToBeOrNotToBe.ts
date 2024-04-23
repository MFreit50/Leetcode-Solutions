type ToBeOrNotToBe = {
    toBe: (val: any) => boolean;
    notToBe: (val: any) => boolean;
};

function expectTS(val: any): ToBeOrNotToBe {
    return{
        toBe(val2){
            if(val === val2) return true;
            else throw new Error("Not Equal");
        },
        notToBe(val2){
            if(val !== val2) return true;
            else throw new Error("Equal");
        }
    }
};

/**
 * expect(5).toBe(5); // true
 * expect(5).notToBe(5); // throws "Equal"
 */