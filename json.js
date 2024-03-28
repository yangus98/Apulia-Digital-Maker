const json = {
    "nome": "Nicolò",
    "cognome": "De Rosa",
    "età": 25,
    "altezza": 180
}

console.log("json stringa: "+ JSON.stringify(json));

console.log(JSON.parse(JSON.stringify(json)));

