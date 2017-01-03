echo "Unzip here"
mvn clean package
mvn exec:java -Dexec.mainClass="com.drastin.MainApp"
