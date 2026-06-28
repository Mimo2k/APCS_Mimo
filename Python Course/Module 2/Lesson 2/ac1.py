target_integer = int(input("Enter upper limit for calculation loop: "))
running_total = 0

for current_value in range(1, target_integer + 1): 
    running_total = running_total + current_value
    print("\nCurrent dynamic aggregate output =", running_total)