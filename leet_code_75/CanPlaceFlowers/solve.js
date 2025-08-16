const canPlaceFlowers = (flowerbed, n) => {
  const length = flowerbed.length;

  for (let i = 0; i < length && n > 0; i++) {
    if (flowerbed[i] === 0) {
      const prev = i === 0 ? 0 : flowerbed[i - 1];
      const next = i === length - 1 ? 0 : flowerbed[i + 1];

      if (next === 0 && prev === 0) {
        flowerbed[i] = 1;
        n--;
      }
    }
  }
  return n <= 0;
};
