const increasingTriplet = (nums) => {
  let firstNumber = Infinity;
  let secondNumber = Infinity;

  for (const number of nums) {
    if (number <= firstNumber) {
      firstNumber = number;
    } else if (number <= secondNumber) {
      secondNumber = number;
    } else {
      return true;
    }
  }
  return false;
};
