const solution = input => {
    const [n, nListStr, m, mListStr] = input;
    const nList = new Set(nListStr.split(' '));
    mListStr.split(' ').forEach(v => {
        console.log(nList.has(v) ? 1 : 0);
    });
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