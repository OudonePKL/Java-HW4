# Program that sets number 1 as dog, number 2 as cat, and chick as number 3 and 
# outputs the animal in English when you enter the number.
# When other numbers are entered, 'I don't know' is printed.

# @author: Oudone PKL

# function for sets the number to the animals
def setsNum(num):
    animal = ""
    if num == 1:
        animal = "Dog"
    elif num == 2:
        animal = "Cat"
    elif num == 3:
        animal = "Chicken"
    else:
        animal = "I don't know!"

    print(animal)

# input the value from user
num = int(input("Enter the number for animals: "))

# call the function
setsNum(num)
