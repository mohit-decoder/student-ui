FROM maven as builder
COPY . /mnt/student-ui/.
WORKDIR /mnt/student-ui
RUN mvn package

FROM tomcat 
COPY --from=builder /mnt/student-ui/target/*.war webapps/.
