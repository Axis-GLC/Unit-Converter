
function insert(char) {
    document.getElementById('result').value += char;
}

function clearScreen() {
    document.getElementById('result').value = '';
}

function backspace() {
    let result = document.getElementById('result').value;
    document.getElementById('result').value = result.slice(0, -1);
}

function calculate() {
    let result = document.getElementById('result').value;
    try {
        let answer = eval(result);
        document.getElementById('result').value = answer;
    } catch (e) {
        document.getElementById('result').value = 'Error';
    }
}
