lower_boundary = int(input("Enter starting integer for range: "))
upper_boundary = int(input("Enter ending integer for range: "))

print("Identified prime numbers between", lower_boundary, "and", upper_boundary, ":")

for candidate_number in range(lower_boundary, upper_boundary + 1):
    if candidate_number > 1:
        for divisor in range(2, int(candidate_number**0.5) + 1):
            if (candidate_number % divisor) == 0:
                break
        else:
            print(candidate_number)