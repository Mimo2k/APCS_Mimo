print("Select your transport option: ")
print("1. Two-Wheeler Module")
print("2. Four-Wheeler Module")

primary_selection = int(input("Select option code (1 or 2): "))

if primary_selection == 1:
    print("Select vehicle classification:")
    print("1. Compact Model")
    print("2. Standard Model")

    secondary_selection = int(input("Select classification code: "))
    if secondary_selection == 1:
        print("Configuration validated: Compact Two-Wheeler allocated.")
    else:
        print("Configuration validated: Standard Two-Wheeler allocated.")

elif primary_selection == 2:
    print("Select vehicle classification:")
    print("1. Sedan Variant")
    print("2. Utility Variant")
    
    tertiary_selection = int(input("Select classification code: "))

    if tertiary_selection == 1:
        print("Configuration validated: Sedan Variant allocated.")
    else:
        print("Configuration validated: Utility Variant allocated.")

else:
    print("Execution Error: Invalid selection code detected.")