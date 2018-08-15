var num = 11;

lookandsay(num,2);

function lookandsay(num, n) {
  var j = 0;

  while (j < n) {
    var i = 0, prev = 0;
    num = num.toString();
    var value = [];

    while(i < num.toString().length) {
      while(num[i] == num[i+1] && i < num.toString().length) {
        i++;
      }
      i++;
      value = value.concat(i-prev);
      value = value.concat(parseInt(num[i-1]))
      prev = i;
    }
    console.log(value.toString().replace(/,/g, ''))
    j++;
    num = value.toString().replace(/,/g, '');
  }
}

