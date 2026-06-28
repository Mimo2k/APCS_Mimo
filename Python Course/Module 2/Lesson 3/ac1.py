total_terms = int(input("Enter total number of terms to process: "))

cumulative_sum = 0
iterator_index = 1

while iterator_index <= total_terms:
    cumulative_sum = cumulative_sum + iterator_index
    iterator_index = iterator_index + 1

print("\nFinal computed sum =", cumulative_sum)