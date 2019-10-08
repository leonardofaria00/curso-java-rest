# curso-java-rest

# EndPoint


# PESSOA 

LIST GET / ADD POST
http://localhost:8080/curso-java-rest/pessoa
{
	"nome":"Leonardo",
	"cpf":"12345678900"
}

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
	"id":"1",
	"agencia":"36013",
	"conta":"424641",
	"senha":"123456"
}

GET LIST BY ID
http://localhost:8080/curso-java-rest/conta/1

PUT
http://localhost:8080/curso-java-rest/conta/1
{
	"id":"1",
	"agencia":"1111",
	"conta":"2222",
	"senha":"3333"
}

CONTA DELETE
http://localhost:8080/curso-java-rest/conta/1

# ASSICIAR
http://localhost:8080/curso-java-rest/associar