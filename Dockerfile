FROM antweiss/mvnjunitexampe:master

COPY . /usr/src/myapp
WORKDIR /usr/src/myapp

# Modify per your build tool
RUN mvn clean deploy -Dmaven.repo.local=./.m2
CMD ["mvn", "run"]
