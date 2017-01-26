def YesOrNo():
    print ("How are you?")
    answer = input("Type good or mas o menos and hit 'Enter'.").lower()
    if answer == "good" or answer == "g":
        print ("Thet's cool!")
    elif answer == "mas o menos" or answer == "m":
        print ("okey, your choise!")
    else:
        print ("You didn't pick anything! Try again.")
        YesOrNo()

YesOrNo();