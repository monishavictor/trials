/*
min operations required so that adj chars are not same..
*/

function minimalOperations(words) {
    let arr = [];
    words.forEach((word) => {
      console.log(word);
      let i = 0;
      let dup = 0;
      for(i = 0; i < word.length; i++) {
        let count = 1;
        if (word[i] == word[i+1]) {
          while((word[i+1] == word[i]) || (i == word.length)) {
            count++;
            i++;
          }
        }
        dup = dup + Math.floor(count / 2);
      }
      arr = arr.concat(dup);
      
    })
    return arr;
}



words = [ "keyhbmeknckfavrpqyyfjxjjmivtsftikovkcdcwefctqrqjryhtlcvstm",
          "rpqipvntglpsbmoyxpjhkfufrxgnqjvhtizxn",
          "sddpeibedjk",
          "dkxqcthvgmzymoohniertqanrbkfdolfwfaalwolqpipngsaquxurvzwjpfejkfyys",
          "jdzsnpejkyqktrdlljfuozlfsvrhqrwgtojnxllzmbfvoexxxttzcbprwzyztsovcxootxoswbffcokhtosfvn",
          "hwqfvaiqxdksxvbtcr",
          "bsdmsblyvzulromgbvteqxqahed",
          "geptwdurphheydbyxrm",
          "rplpqbzsnpotqwmcrdyckzfyghzz"];

let res = minimalOperations(words);
console.log(res);

words = [ "ab",
          "aab",
          "abb",
          "abab",
          "abaaaaaaba"];

res = minimalOperations(words);
console.log(res);