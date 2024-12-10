import string
import random
import time

letters = string.ascii_letters + " !.':()<>0123456789"
print(letters)
result = ""
target = "hello"

for letter in target:
    while True:
        i = random.choice(letters)
        print(chr(27) + "[2J")
        print(result + i)

        if i == letter:
            result += i
            break
        time.sleep(0.05)
