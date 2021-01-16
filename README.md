## Oveview
spring-elastic. This is a sample test project to test elastic integration from spring boot. This revolves around the idea of storing the interview candidates in elastic as a cache. Thought process around this is to have this in cache and then whoever are selected, those can be persisted in the database later as the next enhancement or step.

The application is 2 folds
* Initialization and loading of sample candidates in the elasticsearch
* Exposing the list of candidates to be fetched from elasticsearch as a rest endpoint GET /candidates

## Setup
This assume that elasticsearch is running on localhost 9200 (default) port. If this is changed, please update the application.properties file accordingly.

## Testing
Run the application as standard spring boot application

## Enhancements
### CR_1: API to add candidate
This should update elasticsearch to add new entries. 

### CR_2: API to mark a candidate as "REJECT" or "ACCEPT"
This should move the record to the database with the status and then accordingly delete the same from elasticsearch.