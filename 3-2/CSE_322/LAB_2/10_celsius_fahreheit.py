def ConvertToFahrenheit(c):
    f = (c * 9/5) + 32
    print(f"Tempchar in Fahrenheit is {f:.2f}°F")

def ConvertToCelsius(f):
    c = (f - 32) * 5/9
    print(f"Tempchar in Celsius is {c:.2f}°C")

typ=input("Tempchar value type (C for Celsius, F for Fahrenheit: ")
tem= float(input("Enter Tempchar: "))

if(typ=='c'or typ=='C'):
  ConvertToFahrenheit(tem)
elif(typ=='f'or typ=='F'):
  ConvertToCelsius(tem)
else:
    print("Invalid temperature type")