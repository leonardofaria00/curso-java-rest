# curso-java-rest

# EndPoint


# PESSOA 

LIST GET / ADD POST

http://localhost:8080/curso-java-rest/pessoa

{
	"nome":"Leonardo",
	"cpf":"12345678900"
}


http://localhost:8080/curso-java-rest/pessoa/multi

[
   {
	"nome":"Leonardo",
	"cpf":"12345678900"
	},
   {
	"nome":"Roberta",
	"cpf":"12345678901"
	}
]


GET LIST BY CPF

http://localhost:8080/curso-java-rest/pessoa/12345678900


PUT

http://localhost:8080/curso-java-rest/pessoa/12345678900

{
	"nome":"Leonardo Faria"
}


PESSOA DELETE

http://localhost:8080/curso-java-rest/pessoa/?cpf=12345678900

or

http://localhost:8080/curso-java-rest/pessoa/12345678900


# CONTA 

LIST GET / ADD POST

http://localhost:8080/curso-java-rest/conta

{
	"id":"021185",
	"agencia":"2222",
	"conta":"33333",
	"senha":"123456"
}


GET LIST BY ID

http://localhost:8080/curso-java-rest/conta/021185


PUT

http://localhost:8080/curso-java-rest/conta/021185

{
	"id":"021185",
	"agencia":"44444",
	"conta":"555555",
	"senha":"123456789"
}


CONTA DELETE

http://localhost:8080/curso-java-rest/conta/021185


# ASSICIAR

PUT

http://localhost:8080/curso-java-rest/conta/associar/12345678900/021185