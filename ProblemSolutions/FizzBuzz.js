// JavaScript source code
// <script>
const mixedArray = [];
let userInput = prompt("enter a number and type stop to stop");
mixedArray.push(userInput);
while (userInput !== 'stop') {
    userInput = prompt("enter a Number");
    mixedArray.push(userInput);
}

for (let i = 0; i < mixedArray.length; i++) {
    if (mixedArray[i] % 3 && mixedArray[i] % 5 == 0) {
        mixedArray.splice(i, 1, "FizzBuzz");
    } else if (mixedArray[i] % 3 == 0) {
        mixedArray.splice(i, 1, "Fizz");
    } else if (mixedArray[i] % 5 == 0) {
        mixedArray.splice(i, 1, "Buzz");
    }
}
console.log(mixedArray);
// </script>
