//Creamos 2 Arrays, para realizar el codigo
var primario = [1, 2, 3, 4, 5];
var secundario = [6, 7 ,8 ,9 ,10];

//En esta parte, a ambas array usamos el metodo join agregandole un caracter, todo dentro de un console.log para que se represente en la consola.
console.log(primario.join("-"));
console.log(secundario.join("_"));


//En esta linea, creamos una nueva array donde concatenamos ambos arreglos y se almacena dentro de la array definitiva
var definitiva = primario.concat(secundario);
console.log(definitiva);

//Aqui se usa el metodo pop, para eliminar el ultimo dato
definitiva.pop();
console.log(definitiva);