val1 = int(input("Enter your first number: " ));
val2 = int(input("Enter your second number: " ));

print("Select your arithmatic operation: \n"
      "1.Addition "
      "2.Substraction "
      "3.Multiplication "
      "4.Division "
      );
selection = int(input("Chose Option [0-4]: "));

def add(val1, val2):
  return val1 + val2

def sub(val1, val2):
  return val1 - val2

def mul(val1, val2):
  return val1 * val2

def div(val1, val2):
  return val1 / val2


if selection == 1:
  print(add(val1, val2))
elif selection == 2:
  print(sub(val1, val2))
elif selection == 3:
  print(mul(val1, val2))
elif selection == 4:
  print(div(val1, val2))
else:
  print("Unvalid Request!")