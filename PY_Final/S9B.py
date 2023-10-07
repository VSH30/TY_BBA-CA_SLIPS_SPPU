import tkinter as tk
from tkinter import messagebox

def is_prime(num):
    if num <= 1:
        return False
    for i in range(2, int(num**0.5) + 1):
        if num % i == 0:
            return False
    return True

def is_perfect(num):
    if num <= 1:
        return False
    divisors = [i for i in range(1, num) if num % i == 0]
    return sum(divisors) == num

def is_armstrong(num):
    if num <= 0:
        return False
    temp = num
    num_digits = len(str(num))
    sum_of_powers = sum(int(digit) ** num_digits for digit in str(num))
    return sum_of_powers == temp

def check_number():
    num = int(entry.get())
    result_text = ""

    if is_prime(num):
        result_text += "Prime, "

    if is_perfect(num):
        result_text += "Perfect, "

    if is_armstrong(num):
        result_text += "Armstrong, "

    if result_text:
        result_label.config(text=result_text)
    else:
        result_label.config(text="Not Prime, Perfect, or Armstrong.")

# Create the main window
window = tk.Tk()
window.title("Number Checker")

# Create entry widget to accept the number
entry = tk.Entry(window)
entry.pack()

# Create a button to check the number
check_button = tk.Button(window, text="Check Number", command=check_number)
check_button.pack()

# Create a label to display the result
result_label = tk.Label(window, text="")
result_label.pack()

# Start the GUI event loop
window.mainloop()
