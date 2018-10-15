# SpringBootWithElasticSearch

ElasticSearch is used for indexing and seaching the data.
SpringBoot Application uses Spring data ElasticSearch dependency
Maven Build is used


Install elasticSearch locally and insert data 
index: fooditem
type: search

create index using
PUT : localhost:9200/fooditems

create data structure using below json format
POST: localhost:9200/fooditems/search
    Request Body: 
    {
    "name": "Eggs ",
    "region": "Zambia",
    "mealtype": "Breakfast"
    }

Run the application and search using below URLs:
Get All Data: localhost:8080/foodItems/search/_search
Get Data using Id: localhost:8080/foodItems/id/{id}
Get Data using Id: localhost:8080/foodItems/name/{name}
