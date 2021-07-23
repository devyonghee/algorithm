const solution = input => {
    const [caseCount, ...cases] = input;

    Array.from({length: caseCount})
        .forEach(() => {
            const [_, m] = cases.shift().split(' ').map(i => parseInt(i));
            const documents = cases.shift().split(' ').map(i => parseInt(i));
            const sortedDocuments = [...documents].sort().reverse();
            const list = documents.map((v, i) => ([i, v]));

            let count = 0;
            while (true) {
                const out = list.shift();
                const index = out[0];
                const value = out[1];

                if (sortedDocuments[0] === value) {
                    count++;
                    if (index === m) {
                        console.log(count);
                        return;
                    }
                    sortedDocuments.shift();
                } else {
                    list.push(out);
                }
            }
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