const solution = input => {
    const testCount = input.shift();
    for (let i = 0; i < testCount; i++) {
        const parent = {};
        const number = {};
        const f = input.shift();

        const find = (x) => {
            let parent = parent;
            while(true){

            }
            if (parent[x] === x) return x;
            const p = find(parent[x]);
            parent[x] = p;
            return p;
        };

        const union = (a, b) => {
            const x = find(a);
            const y = find(b);
            if (x !== y) {
                parent[y] = x;
                number[x] += number[y];
            }
        };

        for (let j = 0; j < f; j++) {
            const [a, b] = input.shift().split(' ');
            if (!parent.hasOwnProperty(a)) {
                parent[a] = a;
                number[a] = 1;
            }

            if (!parent.hasOwnProperty(b)) {
                parent[b] = b;
                number[b] = 1;
            }

            union(a, b);
            console.log(number[find(a)]);
        }
    }
};

const path = process.platform === 'linux' ?
    '/dev/stdin' : '../../input.txt';
const fs = require('fs');
const input = fs.readFileSync(path)
    .toString()
    .split('\n');
solution(input);