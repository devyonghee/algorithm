const solution = input => {
    const [caseCount, ...cases] = input;

    Array.from({length: caseCount})
        .forEach(() => {
            const [_, m] = cases.shift().split(' ').map(i => parseInt(i));
            const documents = cases.shift().split(' ').map(i => parseInt(i));
            const sortedDocuments = [...documents].sort().reverse();
            const newDocuments = documents.map((v, i) => ([i, v]));

            const recursive = ([...newDocuments]) => {
                const [index, value] = newDocuments.shift();
                if (sortedDocuments[0] !== value) {
                    newDocuments.push([index, value]);
                    return recursive(newDocuments);
                }

                if (m === index) return 1;
                sortedDocuments.shift();
                return 1 + recursive(newDocuments);
            };
            console.log(recursive(newDocuments));
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