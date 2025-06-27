import time
n = int(input("Enter countdown time in seconds: "))
while n > 0:
    print(n)
    time.sleep(1)
    n -= 1
print("Time's up!")
