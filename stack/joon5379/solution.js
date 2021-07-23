const solution = input => {
    const [_, ...tests] = input;

    tests.forEach(test => {
        const inputKeys = test.split('');
        const cursor_left = [];
        const cursor_right = [];

        inputKeys.forEach(key => {
            if (key === '<') {
                if (!cursor_left.length) return;
                cursor_right.push(cursor_left.pop());

            } else if (key === '>') {
                if (!cursor_right.length) return;
                cursor_left.push(cursor_right.pop());

            } else if (key === '-') {
                if (!cursor_left.length) return;
                cursor_left.pop();
            } else {
                cursor_left.push(key);
            }
        });
        console.log(cursor_left.concat(cursor_right.reverse()).join(''));
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