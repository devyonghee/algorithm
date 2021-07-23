// File System
const path = process.platform === 'linux' ?
    '/dev/stdin' : '../../input.txt';
const fs = require('fs');
const inputs = fs.readFileSync(path).split('\n');

// readline
const solution = input => {
  //풀이과정
};

const input = [];

const rl = require('readline')
    .createInterface({
        input: process.stdin
    });

rl.on('line', line => {
    if (line === 'exit') {
        rl.close();
        return;
    }
    input.push(line)
}).on('close', () => {
    solution(input);
    process.exit();
});
