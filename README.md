# PerfectMatch
Exercise to match male name to female

# Build
mvn clean package -Dspring-boot.run.profiles=testQivos,dockerTest
# Run
java -jar -Dspring.profiles.active=testQivos target/PerfectMatch.jar
