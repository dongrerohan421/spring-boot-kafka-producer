# spring-boot-kafka-producer
This Project covers how to use Spring Boot with Spring Kafka to Publish JSON/String message to a Kafka topic

Please feel free to modify the server port. The current state uses 8081 as server port.

Please follow this [URL](https://kafka.apache.org/quickstart) to download and start Zookeeper server.

## Start Zookeeper
- `bin/zookeeper-server-start.sh config/zookeeper.properties`

## Start Kafka Server
- `bin/kafka-server-start.sh config/server.properties`

## Create Kafka Topic
- `bin/kafka-topics.sh --create --zookeeper localhost:2181 --replication-factor 1 --partitions 1 --topic Kafka_Example`

## Consume from the Kafka Topic via Console
- `bin/kafka-console-consumer.sh --bootstrap-server localhost:9092 --topic Kafka_Example --from-beginning`

## Publish message via WebService
- `http://localhost:8081/kafka/publish/Sam`
- `http://localhost:8081/kafka/publish/Peter`

 - **To Build app:**
    ```$xslt
    ./gradlew clean build
    ```
- **To Start app:**
    ```$xslt
    ./gradlew bootRun
    ```

- **Swagger UI preview:**
![Alt text](SpringBoot-Kafka-Producer.png?raw=true "Swagger-UI")