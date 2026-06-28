medical_cause = input("Enter medical status status (Y/N): ").strip().upper()

if medical_cause == 'Y':
    print("Eligibility status: Approved via medical exemption.")
else:
    attendance_percentage = int(input("Enter minimum recorded attendance: "))

    if attendance_percentage >= 75:
        print("Eligibility status: Approved via standard attendance metrics.")
    else:
        print("Eligibility status: Denied. Academic criteria requirements not satisfied.")