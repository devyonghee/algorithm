const solution = input => {
    const [[n, max], list] = input
        .map(i => i.split(' ').map(a => parseInt(a)));

    let result = 0;

    const rec = ([...cards], pickedCount, sum) => {
        if (pickedCount >= 3) {
            if (sum <= max) result = Math.max(result, sum);
            return;
        }

        if (!cards.length) {
            return;
        }

        const number = cards.shift();
        rec(cards, pickedCount + 1, sum + number);
        rec(cards, pickedCount, sum);
    };

    rec(list, 0, 0);
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