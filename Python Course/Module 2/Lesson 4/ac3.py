input_integer = int(input("Enter an integer (must be 4+ digits): "))
temporary_container = input_integer
total_length = 0

while temporary_container > 0: 
    total_length = total_length + 1
    temporary_container = int(temporary_container / 10)

if total_length >= 4:
    midpoint_index = int(total_length / 2)
    current_index = 0
    
    while input_integer > 0: 
        remainder = input_integer % 10
        if current_index == midpoint_index:
            mid_digit_one = remainder
        elif current_index == (midpoint_index - 1):
            mid_digit_two = remainder
        
        input_integer = int(input_integer / 10)
        current_index = current_index + 1
    
    calculated_product = mid_digit_one * mid_digit_two 
    
    print("\nProduct of central digits (" + str(mid_digit_one) + " * " + str(mid_digit_two) + ") = ", calculated_product)

else:
    print("\nError: Integer must contain at least 4 digits.")