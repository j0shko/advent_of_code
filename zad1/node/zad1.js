const input = process.argv[2].split('');

const solveCaptcha = (input, distance) => {
  let sum = 0;
  for (let i = 0; i < input.length; i++) {
    const first = input[i];
    const second = input[(i + distance) % input.length];
    if (first === second) {
      sum += +first;
    }
  }
  return sum;
};

console.log("Part 1 : " + solveCaptcha(input, 1));
console.log("Part 2 : " + solveCaptcha(input, input.length / 2));
