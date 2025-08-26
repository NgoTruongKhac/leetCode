const moveZeroes = (nums) => {
  const n = nums.length;

  let count = 0;

  for (let i = 0; i < n; i++) {
    if (nums[i] !== 0) {
      nums[count] = nums[i];
      count++;
    }
  }
  while (count < n) {
    nums[count] = 0;
    count++;
  }
};
