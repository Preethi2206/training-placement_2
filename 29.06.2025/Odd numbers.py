start = int(input("Start of range: "))
end = int(input("End of range: "))
for i in range(start, end + 1):
    if i % 2 != 0:
        print(i, end=' ')
