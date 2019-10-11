//criando variaveis
var nome = "Leonardo";

let nome2 = "Leonardo Faria";

const nome3 = "Leonardo Faria dos Santos"; //quando definida não pode ser alterada

/**
 * Demonstração diferenca var e let
 */
for (var i = 0; i < 10; i++) {}

//console.log(i);//funciona fora do escopo

for (let f = 0; f < 10; f++) {}

//console.log(f);//não funciona fora do escopo.

/**
 * demonstracao da imutabilidade do const
 */
//nome3 = "Carro";//erro de compilação, variável não pode ser alterada pois é do tipo constante.

//console.log(nome3);

/**
 * Demonstracao da excecao da imutabilidade do const
 */
const casa = {
  cor: "cinza",
  dono: nome2
};
//console.log(casa);

casa.cor = "azul";
//console.log(casa);

let a = "a"; //string
let a1 = "a1"; //string
let a2 = `a2
          blabla`; //string, com possibilidade de  usar em multiplas linhas
let b = 1; //number
let c = 1.0; //number
let d = true; //boolean
let e = {}; //object
let f = []; //array
let g = function() {}; //function

//verificando o tipo de dado
//console.log(typeof g);

/**
 * Site para visualizacao das especificacoes
 * https://jsonformatter.curiousconcept.com/
 */

/**
 * diferencas entre as funcoes
 */
//hoisting
//pesquisar();//nesse caso, imprime o conteúdo
//consultar();// não é método, é variável que não recebe a function
//console.log(obter);// valor armazenado na variável. não compila
//console.log(obter);//não compila

//let pessoa = new Pessoa();
//console.log(pessoa);

/**
 * Function named
 */
function pesquisar() {
  console.log("function named");
}

/**
 * Function anonymous
 */
let consultar = function() {
  console.log("funciton anonymous");
};

/**
 * Function named expressed
 */
let obter = function obter() {
  console.log("function named expressed");
};

/**
 * Function arrow function
 */
let filtrar = () => {
  console.log("Function arrow function");
};

/**
 * Function constructor
 */
function Pessoa() {
  console.log("function constructor");
  return {
    nome: nome3
  };
}
/**
 * TODO
 */
function inserir() {
  let p = new Pessoa();

  return function imprimir() {
    console.log(p);
  };
}

//console.log(inserir()());

function calcular(valor, imposto) {
  console.log(imposto(valor));
}

function impostoIR(valor) {
  return valor * 0.6;
}

function impostoIOF(valor) {
  return valor * 0.1;
}

//calcular(450, impostoIR);
//calcular(100, impostoIOF);

this.teste = "a";

function deletar() {
  console.log(this);
}

//deletar();

function imprimir() {
  this.modelo;
}

let carro = {
  modelo: "cruze",
  marca: "chevrolet",
  getModelo: function() {
    return this;
  }
};

//imprimir();

let carros = [];
//function add na ultima posicao do array
carros.push("Camaro");
carros.push("Dodge");
carros.push("Cruze");
carros.push("Uno");

//add na primeira posicao do array
carros.unshift("Up");

//remove ultimo item do array
//carros.pop();

//remove primeiro item do array
//carros.shift();

//adiciona e remove de acordo com os parametros informados
carros.splice(0, 2);

//faz uma copia do array principal a partir do index informado até a quantidade informada - 1
carros.slice(1, 2);

//console.log(carros);
