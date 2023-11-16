const url = "http://localhost:8080/contact/3";

function hideLoader() {
    document.getElementById("loading").style.display = "none";
}

function show(Contact) {
    let tab = `<thead>
            <th scope="col">#</th>
            <th scope="col">name</th>
            <th scope="col">phoneNumber</th>
            <th scope="col">email</th>
        </thead>`;

    for (let contacts of contact) {
        tab += `
            <tr>
                <td scope="row">${Contact.id}</td>
                <td>${Contact.name}</td>
                <td>${Contact.contacts}</td>
                <td>${Contact.email.email}</td>
            </tr>
        `;
    }

    document.getElementById("Contacts").innerHTML = tab;
}

async function getAPI(url) {
    const response = await fetch(url, { method: "GET" });

    var data = await response.json();
    console.log(data);
    if (response) hideLoader();
    show(data);
}

getAPI(url);