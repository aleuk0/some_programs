import random

list_of_films = []

# лист с фильмами из файла
first_file = open("films.txt", "r")
list_of_films = first_file.read().split('\n')
first_file.close()

# случайное число для выбора фильма
number_of_rand_film = random.randint(0, len(list_of_films) - 1)
print(number_of_rand_film, len(list_of_films)-1)
print(list_of_films[number_of_rand_film])
print()

# записываем этот фильм во второй файл
second_file = open("films_s.txt", "a")
second_file.write(str(list_of_films[number_of_rand_film]) + "\n")
second_file.close()

# удаляем выбраный фильм из основного списка
first_file = open("films.txt", "w")
list_of_films.pop(number_of_rand_film)

#first_file.write("")
for film in list_of_films:
    print(film)
    first_file.write(str(film) + "\n")
first_file.close()
