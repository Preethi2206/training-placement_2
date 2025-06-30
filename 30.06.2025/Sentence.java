sentence = input("Enter a sentence: ")
word = input("Enter a word to count: ")
count = sentence.split().count(word)
print(f"'{word}' appears {count} times.")
