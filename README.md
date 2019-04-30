
# 	LoadTest (This is a POC to execute load tests)
For information regarding gatling, please visit https://gatling.io/docs/current/  


## 1. Pre-requisites:
* Java 1.8 or Above
* Scala 2.12.8


## 2. Testing the code:
- Execute the following maven command:   

```
mvn test
```

and this should produce the load test reports under /target/gatling  

- The class which gets executed when the aforementioned maven command is executed is "RecordedSimulation.scala".  
If you want to explore other simulation steps then please visit:  
https://gatling.io/docs/2.3/general/simulation_setup/  