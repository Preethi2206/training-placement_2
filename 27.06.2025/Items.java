items = [1, 2, 3, 4, 5, 2]
if len(items) != len(set(items)):
    print("List has duplicates")
else:
    print("List has all unique items")
