const solution = input => {
    const [[count, max], list] = input
        .map(i => i.split(' ').map(a => parseInt(a)));

    let result = 0;

    for (let i = 0; i < count; i++) {
        for (let j = i + 1; j < count; j++) {
            for (let k = j + 1; k < count; k++) {
                const sum = list[i] + list[j] + list[k];
                if (max === sum) {
                    return console.log(sum);
                } else if (sum <= max && result < sum) {
                    result = sum;
                }
            }
        }
    }
    console.log(result);
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