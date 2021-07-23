const solution = input => {
    const [n, ...list] = input.map(i => parseInt(i));
    let cur = 0;
    const stack = [];
    const result = [];

    for (let i = 0; i < list.length; i++) {
        while (++cur <= list[i]) {
            stack.push(cur);
            result.push('+');
        }

        if (stack[stack.length - 1] === list[i]) {
            stack.pop();
            result.push('-')
        } else {
            return console.log('NO');
        }
    }
    console.log(result.join('\n'));
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