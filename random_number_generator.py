import random


def get_random_number(min_num, max_num):
    return random.randint(min_num, max_num)


print(get_random_number(int(input("Minimum: ")), int(input("Maximum: "))))
