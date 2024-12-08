const names = [];

function submitName(event) {
    event.preventDefault();
    const nameInput = document.querySelector('#name');
    const numberInput = document.querySelector('#number');
    const namesList = document.querySelector('#namesList');

    const name = nameInput.value;
    const number = parseInt(numberInput.value);

    if (name && !names.includes(name)) {
        names[number] = name;
        nameInput.value = '';
        numberInput.value = '';

        displayNames();
    } else {
        alert('Name is already used or invalid input.');
    }
}

function displayNames() {
    const namesList = document.querySelector('#namesList');
    namesList.innerHTML = '';

    names.forEach((name, index) => {
        if (name) {
            const nameElement = document.createElement('div');
            nameElement.textContent = `Number ${index}: ${name}`;
            namesList.appendChild(nameElement);
        }
    });
}

document.querySelector('form').addEventListener('submit', submitName);
