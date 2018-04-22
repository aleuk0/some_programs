import random

def cf():
    list_of_films = []

    # лист с фильмами из файла
    first_file = open("films.txt", "r")
    list_of_films = first_file.read().split('\n')
    first_file.close()

    #for film in list_of_films:
    #    print(film)

    # случайное число для выбора фильма
    while True:
        number_of_rand_film = random.randint(0, len(list_of_films) - 1)
        # print(number_of_rand_film, len(list_of_films)-1)
        if (list_of_films[number_of_rand_film] != " " and not list_of_films[number_of_rand_film].endswith("+++")): 
            print(list_of_films[number_of_rand_film] + "\n")
            break

    # удаляем выбраный фильм из основного списка
    first_file = open("films.txt", "w")
    #del(list_of_films[number_of_rand_film]) #удаляем значение
    list_of_films[number_of_rand_film] += " +++"
    list_of_films.pop() #удаляем пустую строку
    # print(len(list_of_films))

    for film in list_of_films:
        # print(film)
        first_file.write(str(film) + "\n")
    first_file.close()

while(True):
    cf()
    if not input("to chouse another film press 'y' \n") == "y": break
