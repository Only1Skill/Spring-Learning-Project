# Библиотека
 
## Описание
Проект выполнен в рамках курса Spring - Полный курс. Boot, Hibernate, Security, REST.

## Задача
В местной библиотеке хотят перейти на цифровой учет книг. Вам необходимо реализовать веб-приложение для них. Библиотекари должны иметь возможность регистрировать читателей, выдавать им книги и освобождать книги (после того, как читатель возвращает книгу обратно в библиотеку).

## Необходимый функционал
- **Страницы добавления**, изменения и удаления человека.
- **Страницы добавления**, изменения и удаления книги
- **Страница со списком всех людей** (люди кликабельные - при клике осуществляется переход на страницу человека).
- **Страница со списком всех книг** (книги кликабельные - при клике осуществляется переход на страницу книги).
- **Страница человека**, на которой показаны значения его полей и список книг, которые он взял. Если человек не взял ни одной книги, вместо списка должен быть текст "Человек пока не взял ни одной книги".
- **Страница книги**, на которой показаны значения полей этой книги и имя человека,который взял эту книгу. Если эта книга не была никем взята, должен быть текст "Эта книга свободна".
- **На странице книги**, если книга взята человеком, рядом с его именем должна быть кнопка "Освободить книгу". Эта кнопка нажимается библиотекарем тогда, когда читатель возвращает эту книгу обратно в библиотеку. После нажатия на эту кнопку книга снова становится свободно и пропадает из списка книг человека.
- **На странице книги**, если книга свободна, должен быть выпадающий список (select) со всеми людьми и кнопка "Назначить книгу". Эта кнопка нажимается библиотекарем тогда, когда читатель хочет забрать эту книгу домой. После нажатия на эту кнопку, книга должна начать принадлежать выбранному человеку и должна появится в его списке книг.
- **Все поля должны валидироваться** - с помощью @Valid и Spring Validator, если это требуется.
## Установка и запуск
### Требования
Для запуска приложения необходима установка следующих зависимостей:
- Java 22+
- Maven (для сборки проекта)
- Docker 

### Установка
1. Склонируйте репозиторий с проектом:
    ```bash
    git clone https://github.com/Only1Skill/Library-Spring-Learning-Project.git
    ```
2. Перейдите в директорию проекта:
    ```bash
    cd Library-Spring-Learning-Project
    ```
3. Запустите проект с помощью Docker:
   ```bash
   docker-compose up
    ```
## Взаимодействие
### С сайтом
- Для взаимодействия со страницей **пользователей**, нужно перейти по адресу http://localhost:8080/people
- Для взаимодействия со страницей **книг**, нужно перейти по адресу http://localhost:8080/books

### С базой данных
Для удобства был добавлен контейнер с Adminer для взаимодействия с базой данных: http://localhost:8081
#### Данные для входа:
- **Движок**: PostgreSQL
- **Сервер**: db
- **Имя пользователя**: postgres
- **Пароль**: postgres
- **База данных**: project1
## Скриншоты работы
### Страница со всеми людьми(главная)
![image](https://github.com/user-attachments/assets/107a27a5-c53d-4b69-9dfb-2bb21f5c3b4a)

### Общая страница всех книг
![image](https://github.com/user-attachments/assets/375faa04-5d14-49cb-976b-155c163c90dd)


### Страница создания пользователя
![image](https://github.com/user-attachments/assets/cbe4afd6-633e-4857-9d70-a2c2b9d516e6)


### Страница пользователя
![image](https://github.com/user-attachments/assets/06a09992-0ea8-4789-a710-3d67705ee272)

### Страница редактирования пользователя
![image](https://github.com/user-attachments/assets/79e9a7f2-0aba-47df-ab2f-85013a941e82)


### Страница создания книги
![image](https://github.com/user-attachments/assets/7dcd87c6-9d34-4b36-ac50-b738fcda0d43)


### Страница книги
![image](https://github.com/user-attachments/assets/ce1901fc-92cc-4ae9-a6c9-faf3361abc00)


### Страница книги
![image](https://github.com/user-attachments/assets/4443c4ea-33cc-43fc-9dc7-ee78cf982bd7)


### Страница пользователя с добавленными книгам
![image](https://github.com/user-attachments/assets/dd2acd6a-e207-4ab2-947d-f046f9306c41)

