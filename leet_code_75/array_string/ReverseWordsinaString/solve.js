const reverseWords = (s) => {
  let words = s.split(" ");
  let res = [];

  for (let i = words.length - 1; i >= 0; i--) {
    if (words[i]) {
      res.push(words[i]);
    }
  }

  return res.join(" ");
};

const s1 = "the sky is blue";
const s2 = "  hello world  ";
const s3 = "a good   example";

console.log(reverseWords(s1));
console.log(reverseWords(s2));
console.log(reverseWords(s3));
