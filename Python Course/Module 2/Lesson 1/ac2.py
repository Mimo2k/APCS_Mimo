consumed_units = int(input("Enter total consumed metrics: "))

if consumed_units < 50:
    base_charge = consumed_units * 2.60 
    service_tax = 25 

elif consumed_units <= 100:
    base_charge = 130 + ((consumed_units - 50) * 3.25)
    service_tax = 35

elif consumed_units <= 200:
    base_charge = 130 + 162.50 + ((consumed_units - 100) * 5.26)
    service_tax = 45

else:
    base_charge = 130 + 162.50 + 526 + ((consumed_units - 200) * 8.45)
    service_tax = 75

final_invoice = base_charge + service_tax
print("\nFinal Statement Balance = %.2f" % final_invoice)