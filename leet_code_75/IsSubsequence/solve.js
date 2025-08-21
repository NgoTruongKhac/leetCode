const isSubsequence = (s, t) => {
  let i = 0,
    j = 0;

  while (i < s.length && j < t.length) {
    if (s[i] == t[j]) {
      i++;
    }
    j++;
  }

  return s.length == i;
};
