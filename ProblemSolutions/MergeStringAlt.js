/*
knew I had to toy with the values somehow especially since its in the front of each leter so its going by twos so I have to place the number in fron of every second index of the letter so for abc 
abc and pqr
index to insert = i = 0 += 1 so 1 so behind b;
apbc
qr
index to insert = i = 2 += 1 so 3 so behind c;
apbqc
r
index to insert = i = 4 += 1 so 5 so in front of c since no letter exist in front;
apbqcr
*/

/**
 * @param {string} word1
 * @param {string} word2
 * @return {string}
 */
var mergeAlternately = function(word1, word2) {
    word1Arr = word1.split("");
    word2Arr = word2.split("");
    let i = 0;
    while(word2Arr.length !== 0){
        console.log(word1Arr);
        word1Arr.splice(i += 1, 0, word2Arr[0]);
        word2Arr.splice(0, 1);
        i++;
    }
    return word1Arr.join("");
};
