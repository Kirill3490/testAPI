# testAPI

#To star application just run Demo.jar
#Only if you have PostgreSql database with user: postgres and password: 1831970po
#In other case you need in code(file name src->main->resources->application.proproperties) change user and password on your own data
#And build project using ide or maven console command


#The application allows using RestAPI to receive information about films and directors in JSON format

#Find information by Directors ID
#[GET] localhost:8080/api/film/director/{directorId}

#Find information by film release date
#[GET] localhost:8080/api/films/release/{date}

#Find information by Directors ID and release date
#[GET] localhost:8080/api//film/director{directorId}/release{releaseDate}
