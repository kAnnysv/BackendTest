## Чек-лист для CRUD-запросов


| метод                           | проверка                            | ожидание                                                                   |
|---------------------------------|-------------------------------------|----------------------------------------------------------------------------|
| createProductInFoodCategoryTest | Создание продукта                   | коды 200-300                                                               |
| tearDown                        | Удаление продукта по id             | коды 200-300                                                               |
| getProductId                    | Запрос парвметров продукта по id    | коды 200-300. Сравнение на эквивалентность- id, Категории, Названия, Цены. |
| getCategoryByIdPositiveTes      | Запрос категории продукта по id     | коды 200-300. Сравнение на эквивалентность- id, Категории.                 |
| getProducts                     | Запрос всех продуктов в бд          | коды 200-300                                                               |
| modifyProductTest               | Изменения парамтров продуктов по id | коды 200-300                                                               |


