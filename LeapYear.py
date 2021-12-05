
# Program to determine whether a year is a leap year
# or a normal year by inputting the year

# @author: Oudone PKL


# Function for check a year is a leap year or not
def checkLeapYear():

    # variables
    year = 2020
    leap = False

    # if the year is divided by 4, 100 and 400
    if year % 4 == 0:
        if year % 100 == 0:
            if year % 400 == 0:
                leap = True
            else:
                leap = False
        else:
            leap = True
    else:
        leap = False

    # check to display to screen
    if leap == True:
        print(year, "is a leap year.")
    else:
        print(year, "is not a leap year.")


# call the funcion
checkLeapYear()
