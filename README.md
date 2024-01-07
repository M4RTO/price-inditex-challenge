# Prices 

This code is the solution of challenge of INDITEX

## Run docker compose

This command generate a docker container up and running:
```
docker compose up -d
```

With CURL or postman send http POST request with this url:
```
curl --location 'localhost:8080/api/v1/prices/1?date=2020-06-1621:00&productId=35455'
```


This url you can show de DB to see al database in H2:

```
http://localhost:8080/h2-console/
```
In this database you can enter with these credentials:

```
JDBC URL: jdbc:h2:mem:prices
User Name:	sa
```
