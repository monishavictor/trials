
/*
 * Complete the function below.
 */

// -3--1,5-7,9,11-13,15,16
// Debug Output

// [ -3, -2, -1, 5, 6, 7, 9, 11, 12, 13, 15, 16 ]
// --15-75-13

function solution(array) {
    let soln = "";
    let i = 1, temp = array[0].toString(), curLength = 0, start = array[0];
    
    while(i < array.length) {
        start = array[i-1];
        while(array[i] - array[i-1] == 1) {
            temp += "," + array[i].toString();
            curLength += 1;
            i += 1;
        }
        if (curLength >= 2) {
            soln = soln ? soln + "," : soln;
            soln += start.toString() + "-" + array[i-1].toString();    
        }
        else {
            soln = soln ? soln + "," : soln;
            soln += temp;
        }
        if (i >= array.length) {
            return soln;
        }
        curLength = 0;
        temp = array[i].toString();
        start = array[i];
        i+=1;
    }
    return soln;
}
