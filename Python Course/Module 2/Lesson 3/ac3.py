target_number = int(input("Enter integer to test for Armstrong property: "))

running_cube_sum = 0
temporary_container = target_number

while temporary_container > 0:
    extracted_digit = temporary_container % 10
    running_cube_sum += extracted_digit ** 3
    temporary_container //= 10

if target_number == running_cube_sum:
    print(target_number, "is an identified Armstrong number")
else:
    print(target_number, "is not an Armstrong number")