//calcolare la somma di tutti i num da 1 a 10
/*let somma = 0; 

for(let i = 1; i<= 10; i++){
    somma = somma + i;
}

document.write("<p> La somma dei numeri da 1 a 10: "+somma+"</p>");

//calcolare la somma tutti i numeri dispari da 1 a 10
somma = 0;

for(let i = 1; i<= 10; i+=2){
    somma = somma + i;
}

document.write("<p> La somma dei numeri dispari da 1 a 10: "+somma+"</p>");

//calcolare il fattoriale di un numero a vostra scelta
let fattoriale = prompt("Inserisci il fattoriale da calcolare: ");
let molt = 1;

for(let i = fattoriale; i>= 1; i--){
    molt = molt * i;
}

document.write("<p> Il fattoriale di "+fattoriale+": "+molt+"</p>");

//dati 2 numeri, calcola il maggiore dei 2
let num1 = prompt("Inserisci il primo numero da calcolare: ");
let num2 = prompt("Inserisci il secondo numero da calcolare: ");

if(num1 > num2){
    document.write("<p> Il numero maggiore è "+num1+"</p>");
}else if(num2 > num1){
    document.write("<p> Il numero maggiore è "+num2+"</p>");
}else{
    document.write("<p> I numeri sono uguali!</p>");
}

// dato un numero, restituire se è positivo, negativo o zero
let num1 = prompt("Inserisci il numero: ");
if(num1 > 0){
    document.write("<p> Il numero è positivo</p>");
}else if(num1 < 0){
    document.write("<p> Il numero è negativo</p>");
}else{
    document.write("<p> Il numero è zero!</p>");
}

//dato un numero a vostra scelta, calcolare i suoi divisori
let divisori = [];
let num1 = prompt("Inserisci il numero: ");

for(let i = 1;i <= num1; i++){
    if(num1 % i === 0){
        divisori.push(i);
    }
}

document.write("<p>I divisori di "+num1+" sono: "+divisori+"</p>");

//

function sum(num1, num2){
    somma = num1+num2;
    return somma;
}

document.write("<p>"+sum(3,5)+"</p>");


// creare la funzione divisione che realizzi la divisione tra 2 numeri interi e controlla se da resto o meno

function divisione(num1, num2){
    while(num2 === 0 || !Number.isInteger(num2)){
        num2 = parseFloat(prompt("Reinserisci il divisore: "));
    }

    while(!Number.isInteger(num1)) {
        num1 = parseFloat(prompt("Reinserisci il dividendo: "));
    }

    if(num1 % num2 === 0){
        alert("La divisione non produce resto!");
    }else{
        alert("La divisione produce resto!");
    }

    return num1 / num2;
}

let num1 = parseFloat(prompt("Inserisci il dividendo: "));
let num2 = parseFloat(prompt("Inserisci il divisore: "));

document.write("<p>"+divisione(num1, num2)+"</p>");
*/