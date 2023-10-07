def caesar_encrypt(text, shift):
    encrypted_text = ""
    for char in text:
        if char.isalpha():
            if char.islower():
                encrypted_char = chr(((ord(char) - ord('a') + shift) % 26) + ord('a'))
            else:
                encrypted_char = chr(((ord(char) - ord('A') + shift) % 26) + ord('A'))
        else:
            encrypted_char = char
        encrypted_text += encrypted_char
    return encrypted_text

try:
    plain_text = input("Enter the plain text: ")
    shift = int(input("Enter the shift value: "))
    cipher_text = caesar_encrypt(plain_text, shift)
    print("Cipher Text:", cipher_text)
except ValueError:
    print("Invalid shift value. Please enter an integer.")
