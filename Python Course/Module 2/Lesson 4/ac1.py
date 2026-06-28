input_sequence = input("Please enter the target word: ")
target_character = input("Please enter the character to track: ")

iterator_index = 0
occurrence_tally = 0

while(iterator_index < len(input_sequence)):
    if(input_sequence[iterator_index] == target_character):
        occurrence_tally = occurrence_tally + 1
    iterator_index = iterator_index + 1

print("Total frequency of character '", target_character, "' detected in sequence: ", occurrence_tally)