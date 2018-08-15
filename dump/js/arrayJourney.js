// [10,2,-10,5,20]
// k = 2

function journey(path, k) {
  var initialSum = path[0];
  var i = 0;
  partArray = path;
  while (partArray.length > 0) {
    partArray = partArray.slice(1, k+1);
    temp = partArray;
    partArray = partArray.sort();
    initialSum += partArray[k-1];
    index = temp.indexOf(partArray[k-1]);
    partArray = temp.splice(index+1)
    // console.log(partArray)
  }


  return initialSum;

}


console.log(journey([10,-20,-5], 2)) // 5
console.log(journey([100, -70,-90,-80,100], 3)) // 130
console.log(journey([3,-4,-3,-5,0], 2)) // 0