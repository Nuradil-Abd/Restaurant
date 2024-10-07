
# RestaurantAPP

Добро пожаловать в **RestaurantAPP**! Это приложение предназначено для ["создания базы ресторанов"].
## Пожалуйста, прочтите до конца, в конце есть распределение задач и примечания
## Оглавление

- [Установка](#установка)
- [Использование](#использование)
- [Контрибьюция](#контрибьюция)
- [Команды Git](#команды-git)
- [Распределение задач](#распределение задач)
- [Примечания](#примечания)

## Установка
Следуйте этим инструкциям, чтобы установить и запустить проект на вашем локальном компьютере:

1. Клонируйте репозиторий:

   git clone https://github.com/Nuradil-Abd?tab=repositories

2. перейдите в папку проекта:

cd https://github.com/Nuradil-Abd/Restaurant.git

3. Убедитесь, что у вас установлены все зависимости:

   [команда для установки зависимостей, например: mvn install для Maven проектов]
4. Использование

Для запуска приложения используйте команду:

[команда для запуска, например: java -jar ваш_файл.jar]

- [Контрибьюция](#контрибьюция)

Мы рады любому вкладу в проект! Если вы хотите внести изменения, пожалуйста, следуйте этим шагам:


1. Создайте новую ветку:

git checkout -b ваша_ветка
2. Сделайте ваши изменения и закоммитьте их: commit

git commit -m "Описание изменений"

3. Отправьте ваши изменения в форк: fork
 
git push origin ваша_ветка
 
4. Создайте Pull Request.

- [Команды Git](#команды-git)

Чтобы избежать ошибок при слиянии, следуйте этим командам:

1. Проверьте текущую ветку:

git branch
2. Получите последние изменения из удаленного репозитория:

git fetch origin

3. Сделайте переключение на ветку разработки (например, develop):

git checkout develop
4. Сделайте слияние изменений из удаленной ветки:

git pull origin develop
5. Сделайте переключение на вашу рабочую ветку:

git checkout ваша_ветка
6. Обновите вашу рабочую ветку с основными изменениями:

git merge develop
7. Если возникли конфликты, разрешите их, затем добавьте измененные файлы:

git add .
8. Закоммитьте разрешенные конфликты:

git commit -m "Разрешены конфликты при слиянии с develop"
9. Отправьте вашу ветку на удаленный репозиторий:
   
git push origin ваша_ветка

10. Создайте Pull Request в интерфейсе GitHub, чтобы инициировать слияние.

git init

Git status

Git add ссылка

Git add . (Добавить все)

Git commit  -m «название изменений» (сохранить версию)

Git branch -m feature/название обновлений (добавление новой ветки)

Git checkout  -b feature/название обновлений (добавление новой ветки и переход к нему сразу)

Git push (для добавления в гит либо по ссылке, либо origin main)

Feature (для добавления обновлений)

Refactor (для изменения)

Bugfix (для исправления багов)
- [Распределение задач](#распределение задач)

1. Baysalbek
написать методы



    String save(Restaurant restaurant);

    String deleteByIds(Set<Long> ids);

    String save (List<Restaurant> restaurants);

2. Asylbek



    String deleteById(Long id);

    List<Restaurant> getAll();

    String updateById (Long id, Restaurant restaurant);


3. Elchibek


    Restaurant findById(Long id);

    List<Restaurant> getRestaurantsByType(String type);

    String save(MenuItem menuItem);
4. Omurzak


    String deleteById(Long id);

    List<MenuItem> getAll();

    String updateById(Long id,MenuItem menuItem);
5. Nuradil


    MenuItem findById(Long id);

    MenuItem findByName(String name);

проверить все пулы и внести в главный бренч

- [Примечания](#примечания)

// todo стринг написал чтоб в сервисе можно было возвращать текст (successfully saved or deleted)

//если будут вопросы напишите вместе, подумаем как решить

// если что есть вариант возвращать через Exceptions

//добавил класс database где будем хранить все рестораны






