const gcd = (a, b) => {
  return b === 0 ? a : gcd(b, a % b);
};

const gcdOfString = (s1, s2) => {
  if (s1 + s2 !== s2 + s1) {
    return "";
  }

  return s1.slice(gcd(s1.lenght, s2.length));
};
