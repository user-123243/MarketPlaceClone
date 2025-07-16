# BuySell - Клон Авито

![Java](https://img.shields.io/badge/Java-17-red)
![Spring Boot](https://img.shields.io/badge/Spring_Boot-3.5.3-green)
![MySQL](https://img.shields.io/badge/MySQL-8.0-blue)

**BuySell** — упрощённый клон платформы Авито для размещения объявлений о продаже товаров с полным циклом аутентификации и управлением контентом.

## 🔍 Основные возможности
- 🔒 **Аутентификация** через Spring Security + BCrypt
- 📦 **CRUD для объявлений** с загрузкой до 3 изображений
- 👔 **Ролевая модель**: `ROLE_USER`, `ROLE_ADMIN`
- 🖼️ **Хранение изображений** в MySQL как BLOB
- 🔎 **Поиск** по названию товара
- 📱 **Адаптивный интерфейс** на FreeMarker + CSS

## 🛠️ Технологии
| Категория       | Технологии                          |
|-----------------|-------------------------------------|
| Бэкенд         | Java 17, Spring Boot 3.5.3          |
| Безопасность   | Spring Security, BCrypt             |
| База данных    | MySQL, Spring Data JPA              |
| Фронтенд      | FreeMarker, CSS                     |
| Инструменты    | Lombok, Maven                       |

## 🚀 Быстрый старт

### Предварительные требования
- JDK 17+
- MySQL 8.0+
- Maven 3.8+

### Установка
```
git clone https://github.com/romanWrest/buysell.git
cd buysell
```
Создайте БД:

```
CREATE DATABASE buysell;
```

Обновите настройки в ```application.properties```:
```
spring.datasource.url=jdbc:mysql://localhost:3306/buysell
spring.datasource.username=ваш_логин
spring.datasource.password=ваш_пароль
```

Запуск

```
mvn spring-boot:run
```

Откройте в браузере: ```http://localhost:8080```

📂 Структура проекта

```
buysell/
├── src/
│   ├── main/
│   │   ├── java/com/example/buysell/
│   │   │   ├── config/       # Конфигурация Spring
│   │   │   ├── controllers/  # MVC-контроллеры
│   │   │   ├── models/       # Сущности БД
│   │   │   ├── repositories/ # JPA-репозитории
│   │   │   └── services/     # Бизнес-логика
│   │   └── resources/
│   │       ├── static/       # CSS/изображения
│   │       ├── templates/    # FTL-шаблоны
│   │       └── application.properties
└── pom.xml                   # Maven-зависимости
```


⚠️ Важно

 - Для тестирования админ-функций создайте пользователя с ролью ```ROLE_ADMIN``` вручную в базе данных или через приложение.
 - Убедитесь, что переменная окружения DB_PASSWORD настроена или замените ```${DB_PASSWORD}``` в application.properties на реальный пароль от вашей базы данных MySQL.
