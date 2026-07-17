bal = 1000;

while True:
    print(f"\nCurrent Balance : {bal}$\n\n");
    print("1. Deposit");
    print("2. Withdraw");
    print("3. Exit");

    choice = int(input("Enter choice: "));


    if choice == 1:
        amo = int(input("Enter deposit amount: "));
        if amo > 0:
            bal += amo;
            print(f"New Balance = {bal}");
        else:
            print("Invalid amount");

    elif choice == 2:
        amo = int(input("Enter withdraw amount: "));

        if amo > 0:
            if amo <= bal:
                bal -= amo;
                print(f"New Balance = {bal}");

            else:
                print("Insufficient Balance");
        else:
            print("Invalid amount");


    elif choice == 3:
        print("Thank You");
        break;

    else:
        print("Invalid Choice");