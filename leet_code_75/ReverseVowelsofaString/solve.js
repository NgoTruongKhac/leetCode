const reverseVowels = (s) => {
  const vowels = new Set(["a", "e", "i", "o", "u", "A", "E", "I", "O", "U"]);
  const chars = s.split("");

  const left = 0,
    right = s.lenght - 1;

  while (left < right) {
    while (left < right && !vowels.has(chars[left])) {
      left++;
    }
    while (left < right && !vowels.has(chars[right])) {
      right--;
    }

    if (left < right) {
      [chars[left], chars[right]] = [chars[right], chars[left]];
      left++;
      left--;
    }
  }

  return chars.join("");
};
