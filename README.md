# Kafka Producer & Consumer Demo

## Overview
This project demonstrates a Kafka-based event-driven architecture with a producer that streams Wikimedia data to a Kafka topic and a consumer that processes the messages.

## Technologies Used
- Java 21
- Spring Boot 3.4.2
- Spring Kafka
- WebClient
- Apache Kafka

## Project Structure
### **Producer Service (`producer`)**
- Streams Wikimedia data and publishes it to the `WIKIMEDIA-STREAM` Kafka topic.
- Exposes a REST API to trigger the stream.
- Uses `KafkaTemplate` for message publishing.

### **Consumer Service (`consumer`)**
- Listens to the `WIKIMEDIA-STREAM` Kafka topic.
- Processes incoming messages.

## How to Run
### **Start Kafka**
1. Download and extract Apache Kafka.
2. Start Zookeeper:
   ```sh
   bin/zookeeper-server-start.sh config/zookeeper.properties
   ```
3. Start Kafka Broker:
   ```sh
   bin/kafka-server-start.sh config/server.properties
   ```

### **Start Services**
1. Run the `producer` service:
### **Run the Producer**
```sh
cd producer
./mvnw spring-boot:run
```

2. Run the `consumer` service:
### **Run the Consumer**
```sh
cd consumer
./mvnw spring-boot:run
```

