function reverseString(str) {
  console.log("hello");

  // var strArr = str.split("");
  // console.log(strArr);
  // var reverseStrArray = strArr.reverse();
  // console.log(reverseStrArray);
  // var reverseString = reverseStrArray.join("");
  // console.log(reverseString);

  // return str.split("").reverse().join("")

  var final = "";
  for (var i = str.length - 1; i >= 0; i--) {
    final += str[i];
  }
  return final;
  
}

console.log(reverseString("hello"));
