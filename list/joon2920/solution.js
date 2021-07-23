const solution = input => {
    const list = input[0].split(' ').map(i => parseInt(i));
    let asc = true;
    let desc = true;
    list.reduce((prev, cur) => {
        if (prev > cur) asc = false;
        if (prev < cur) desc = false;
        return cur;
    });

    if (asc) {
        console.log('ascending');
    } else if (desc) {
        console.log('descending');
    } else {
        console.log('mixed');
    }
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
