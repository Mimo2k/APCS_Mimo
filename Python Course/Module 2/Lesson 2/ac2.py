user_input = input("Provide the character sequence to process: ")

processed_sequence = ('')

for character in user_input:
    processed_sequence = character + processed_sequence
    
print("\nPrimary input sequence = ", user_input)
print("Reversed transformation output = ", processed_sequence)