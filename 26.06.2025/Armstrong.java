num = int(input("Enter a 3-digit number: "))
sum = sum(int(digit) ** 3 for digit in str(num))
if num == sum:
    print("Armstrong Number")
else:
    print("Not an Armstrong Number")
