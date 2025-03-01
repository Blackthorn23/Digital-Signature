# Digital-Signature

Digital Signature System
This project implements a Digital Signature System using RSA cryptography to ensure data authenticity, integrity, and non-repudiation. The system provides a secure way to sign and verify digital files using SHA-256 hashing and RSA key pairs.

Features
✔ Role-Based Access – Admins generate keys & sign files, while Clients verify signatures.
✔ Secure Hashing – Uses SHA-256 to generate file hashes.
✔ Digital Signature – RSA private key signs hashed files.
✔ Signature Verification – Clients verify authenticity using the RSA public key.
✔ Graphical User Interface (GUI) – Built using Java Swing for an interactive experience.

Usage
Login – Admin (admin/admin123) or Client (client/client123).
Generate Keys – Admin generates RSA public & private keys.
Hash a File – Admin creates a SHA-256 hash of a selected file.
Sign a File – Admin signs the hash using the private key.
Verify a Signature – Clients verify file integrity using the signature & public key.
Setup
Clone the repository:
sh
Copy
Edit
git clone https://github.com/Blackthorn23/Digital-Signature.git
cd Digital-Signature
Compile the Java files:
sh
Copy
Edit
javac *.java
Run the system:
sh
Copy
Edit
java Login
Security Notes
⚠ Never share private_key.txt – it must remain confidential.
⚠ Ensure public_key.txt is distributed securely to clients.

This project was developed as part of the Applied Cryptography (TAC6223) course. 🚀
