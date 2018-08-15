var num = 7792875;
var array = []

getBase7(num);

function getBase7(num) {
  
  var rem, div;
  while (num != 0) {
    rem = num % 7;
    num = Math.floor(num / 7);
    console.log(rem);
    array = array.concat(rem);
  }
  array = array.reverse();

  console.log(array);
}