# Java-Spring-Boot-Venda
Aplicação de venda de artesanato desenvolvida em Java utilizando Spring Boot

Para testes:

usuario
{
	"nome": "carol",
	"login": "admin",
	"senha": "admin"
}

cliente
{
	"nome": "maria"
}

venda
{
	"dia": 4,
	"mes": 4, 
	"ano": 2020,
	"cliente": 
	{
	"id": 1
	}
}

tecido
{
	"codigo": "AB3",
	"descricao": "Bolsa",
	"nome": "Lala",
	"preco": 3,
	"preco_material": 2,
	"venda": {
		"id": 1
	},
	"quilting_livre": true,
	"quilting_reto": false,
	"utilitarios": true,
	"tipo": "tecido"
}

cartonagem
{
	"codigo": "AB4",
	"descricao": "Bolsa2",
	"nome": "Lala",
	"preco": 3,
	"preco_material": 2,
	"venda": null,
	"sintetico": true,
	"tecido": false,
	"tecido_impermeabilizado": true,
	"tipo": "cartonagem"
}
