process.stdin.resume();
process.stdin.setEncoding("utf8");

let z = "";
process.stdin.on("data", (chunk) => {
  z += chunk;
});

process.stdin.on("end", () => {
  console.log("Enter:");
  z = z.split("\n");
  console.log(z);
  let n = parseInt(z.shift());
  let k = 0;
  while (n--) {
    let num = parseInt(z[k].split(" "));
    let str = num.toString();
    let sum = 0;
    for (let i = 0; i < str.length; i++) {
      sum += parseInt(str[i]);
    }
    k++;
    console.log(sum);
  }
});
