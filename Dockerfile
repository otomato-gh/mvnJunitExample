FROM antweiss/mvnjunitexampe:latest

COPY . /usr/src/myapp
WORKDIR /usr/src/myapp

# Modify per your build tool
RUN mvn clean install -Dmaven.repo.local=./.m2
CMD ["mvn", "run"]
