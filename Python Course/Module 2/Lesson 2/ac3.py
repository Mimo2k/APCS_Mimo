upper_boundary = int(input("Enter start integer (must be > 1): "))

print("Sequence decrement from {0} to {1}: ".format(upper_boundary, 1))

for current_integer in range(upper_boundary, 0, -1):
    print(current_integer)