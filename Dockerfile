FROM tomcat
LABEL maintainer = "tony@trivium.com"
RUN mv webapps.dist/* webapps
EXPOSE 8080
CMD ["catalina.sh","run"]
