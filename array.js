/*
let persona = {
  nome: "Davide",
  cognome: "Dellaccio",
  eta: 20,
};

console.log(persona);
console.log(persona.cognome);

let arr = ["ciao", "test", 0, true];

arr.forEach((dato) => {
  console.log(dato);
});

let ora = new Date();
console.log(ora);

function sommaArray() {
  let risultato = 0;
  let arrNum = [];

  let volte = parseFloat(prompt("Quanti numeri vuoi sommare? "));

  for (let i = 1; i <= volte; i++) {
    arrNum.push(parseFloat(prompt("Inserisci i numeri: ")));
  }

  arrNum.forEach((dato) => {
    risultato = risultato + dato;
  });

  return risultato;
}

console.log(sommaArray());
*/
let arrStringhe = ["Davide", "GianFrancesco", "Anna", "Supercalifragilistichespiralidoso"];

function stringaLunga(arr){
  let corrente = "";

  arr.forEach(string => {
    if(string.length > corrente.length){
      corrente = string
    }
  });

  return corrente;
}

console.log(stringaLunga(arrStringhe));

function getRandomInt(max) {
  return Math.floor(Math.random() * max);
}

console.log(getRandomInt(7));


function getRandomIntMinMax(min, max) {
  return Math.floor(Math.random() * (max - min) + min);
}

console.log(getRandomIntMinMax(50, 100));

for(i = 0; i <= 4; i++){
  console.log(getRandomInt(7));
}
