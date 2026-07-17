total = 0;

for i in range(5):
    mark = int(input(f"Enter {i+1}th subject mark: "));
    total += mark;
avg = total / 5;

print(f"Total = {total}");
print(f"Average = {avg}");

if avg >= 80:
    print("Grade = A+");
elif avg >= 70:
    print("Grade = A");
elif avg >= 60:
    print("Grade = B");
elif avg >= 50:
    print("Grade = C");
else:
    print("Grade = F");