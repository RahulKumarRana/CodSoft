var select = document.getElementsByClassName('currency'),
    select1 = document.getElementsByClassName('currency1')
input_currency = document.getElementById('input_currency'),
    output_currency = document.getElementById('output_currency');

fetch(`https://api.frankfurter.app/currencies`)
    .then((data) => data.json())
    .then((data) => {
        const entries = Object.entries(data);
        console.log(data)
        for (var i = 0; i < entries.length; i++) {
            select[0].innerHTML += `<option value="${entries[i][0]}">${entries[i][0]}</option>`;
            select1[0].innerHTML += `<option value="${entries[i][0]}">${entries[i][0]}</option>`;
        }
    });

function convert() {
    input_val = input.value;
    if (select[0].value != select1[0].value) {
        const host = 'api.frankfurter.app';
        fetch(`https://${host}/latest?amount=${input_val}&from=${select[0].value}&to=${select1[0].value}`)
            .then((val) => val.json())
            .then((val) => {
                //alert(`10 GBP = ${data.rates.USD} USD`);
                output.value = Object.values(val.rates)[0]
                console.log(Object.values(val.rates)[0])
            });
    } else {
        alert("Peease select two different currencies")
    }
    var input2 = document.getElementById('input').value;
    setTimeout(() => {
        location.reload();
        input2 = 0;
        input.innerHTML = 0;
    }, 2000)
}