# Contacts WEB

## Описание

Веб-приложение «Контакты»

## Функции

* Выводить все контакты
* Добавлять новый контакт
* Редактировать существующие контакты
* Удалять контакт

## Сборка

Сборка производится с помощью Gradle

```shell
gradle build
```

## Запуск программы

### Поднять базу

```shell
cd ./docker; docker-compose up -d; cd ../
```

### Запустить приложение

```shell
java -jar .\build\libs\skillbox-contacts-web-0.0.1-SNAPSHOT.jar
```

### Открыть страницу приложения

[http://localhost:8080](http://localhost:8080)

