const solution = input => {
  const testCount = input.shift();
  let result = '';

  for (let i = 0; i < testCount; i++) {
    const friendsCount = input.shift();
    const root = {};
    const count = {};

    const findRoot = target => {
      if (root[target] === target) {
        return target;
      }
      const newRoot = findRoot(root[target]);
      return root[target] = newRoot;
    };

    for (let j = 0; j < friendsCount; j++) {
      const [first, second] = input.shift().split(' ');

      if (!root[first]) {
        count[first] = 1;
        root[first] = first;
      }

      if (!root[second]) {
        count[second] = 1;
        root[second] = second;
      }

      const rootForFirst = findRoot(first);
      const rootForSecond = findRoot(second);

      if (rootForFirst === rootForSecond) {
        result += count[rootForFirst]+ '\n';
        continue;
      }

      root[rootForSecond] = rootForFirst;
      count[rootForFirst] += count[rootForSecond];
      result += count[rootForFirst]+ '\n';
    }
  }

  console.log(result);
};

const path = process.platform === 'linux' ?
    '/dev/stdin' : '../../input.txt';
const fs = require('fs');
const input = fs.readFileSync(path)
.toString()
.split('\n');
solution(input);