// Funções Globais
let entrada1 = "42";
console.log('resultado:', parseInt(entrada1));

let entrada2 = "42.42";
console.log('resultado:', parseFloat(entrada2));

let entrada3 = "abc";
console.log('resultado:', isNaN(entrada3));

let entrada4 = 42;
console.log('resultado:', isFinite(entrada4));

// Funções de String
let entrada5 = "JavaScript";
console.log('resultado:', entrada5.charAt(2));

let entrada6 = "Hello";
let entrada7 = "World";
console.log('resultado:', entrada6.concat(" ", entrada7));

let entrada8 = "JavaScript";
console.log('resultado:', entrada8.includes("Script"));

let entrada9 = "JavaScript";
console.log('resultado:', entrada9.indexOf("Script"));

let entrada10 = "JavaScript";
console.log('resultado:', entrada10.slice(0, 4));

let entrada11 = "JavaScript";
console.log('resultado:', entrada11.split(""));

let entrada12 = "JavaScript";
console.log('resultado:', entrada12.toLowerCase());

let entrada13 = "JavaScript";
console.log('resultado:', entrada13.toUpperCase());

let entrada14 = "  JavaScript  ";
console.log('resultado:', entrada14.trim());

let entrada15 = "JavaScript";
console.log('resultado:', entrada15.replace("Java", "Type"));

// Funções de Array
let entrada16 = [1, 2, 3];
entrada16.push(4);
console.log('resultado:', entrada16);

let entrada17 = [1, 2, 3, 4];
console.log('resultado:', entrada17.pop());

let entrada18 = [1, 2, 3];
console.log('resultado:', entrada18.shift());

let entrada19 = [2, 3, 4];
entrada19.unshift(1);
console.log('resultado:', entrada19);

let entrada20 = [1, 2, 3, 4];
console.log('resultado:', entrada20.slice(1, 3));

let entrada21 = [1, 2, 3, 4];
entrada21.splice(1, 2);
console.log('resultado:', entrada21);

let entrada22 = [1, 2];
console.log('resultado:', entrada22.concat([3, 4]));

let entrada23 = [1, 2, 3];
entrada23.forEach(function(item) { console.log('resultado:', item); });

let entrada24 = [1, 2, 3];
console.log('resultado:', entrada24.map(function(item) { return item * 2; }));

let entrada25 = [1, 2, 3, 4];
console.log('resultado:', entrada25.filter(function(item) { return item > 2; }));

let entrada26 = [1, 2, 3, 4];
console.log('resultado:', entrada26.reduce(function(acc, item) { return acc + item; }, 0));

let entrada27 = [1, 2, 3, 4];
console.log('resultado:', entrada27.find(function(item) { return item > 2; }));

let entrada28 = [1, 2, 3, 4];
console.log('resultado:', entrada28.includes(3));

// Funções de Objeto
let entrada29 = { a: 1, b: 2 };
console.log('resultado:', Object.keys(entrada29));

let entrada30 = { a: 1, b: 2 };
console.log('resultado:', Object.values(entrada30));

let entrada31 = { a: 1, b: 2 };
console.log('resultado:', Object.entries(entrada31));

let entrada32 = { a: 1 };
console.log('resultado:', Object.assign({ b: 2 }, entrada32));

let entrada33 = { a: 1 };
Object.freeze(entrada33);
entrada33.a = 2;
console.log('resultado:', entrada33.a);

let entrada34 = { a: 1 };
Object.seal(entrada34);
entrada34.b = 2;
console.log('resultado:', entrada34.b);

let entrada35 = Object.create({ a: 1 });
console.log('resultado:', entrada35.a);

let entrada36 = { a: 1 };
console.log('resultado:', entrada36.hasOwnProperty('a'));

// Funções de Matemática
let entrada37 = -5;
console.log('resultado:', Math.abs(entrada37));

let entrada38 = 1.7;
console.log('resultado:', Math.ceil(entrada38));

let entrada39 = 1.7;
console.log('resultado:', Math.floor(entrada39));

let entrada40 = 1.5;
console.log('resultado:', Math.round(entrada40));

console.log('resultado:', Math.max(1, 2, 3));

console.log('resultado:', Math.min(1, 2, 3));

console.log('resultado:', Math.random());

let entrada41 = 16;
console.log('resultado:', Math.sqrt(entrada41));

let entrada42 = 2;
console.log('resultado:', Math.pow(entrada42, 3));

// Funções de Data
console.log('resultado:', Date.now());

let entrada43 = "2024-08-20";
console.log('resultado:', Date.parse(entrada43));

let entrada44 = new Date();
console.log('resultado:', entrada44.getFullYear());

console.log('resultado:', entrada44.getMonth());

console.log('resultado:', entrada44.getDate());

console.log('resultado:', entrada44.getDay());

console.log('resultado:', entrada44.getHours());

console.log('resultado:', entrada44.getMinutes());

console.log('resultado:', entrada44.getSeconds());

console.log('resultado:', entrada44.toISOString());