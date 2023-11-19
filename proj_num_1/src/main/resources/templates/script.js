const formulario = document.querySelector("form");

console.log(formulario);
const inome = document.querySelector(".nome");

function cadastrar() {
    fetch("http://localhost:8080/users", {

        headers: {
            'Accept': 'application/json',
            'Content-Type': 'application/json'
        },

        method: "POST",
        body: JSON.stringify({nome: inome.value})
    })

        .then(function (res) {
            console.log(res)
        })
        .catch(function (res) {
            console.log(res)
        })

}




formulario.addEventListener('submit', function (event) {
    event.preventDefault();

    cadastrar();

});


