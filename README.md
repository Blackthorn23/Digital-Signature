# 🚀 Digital Signature System  

This project implements a **Digital Signature System** using **RSA cryptography** to ensure **data authenticity, integrity, and non-repudiation**.  
The system provides a secure way to **sign and verify digital files** using **SHA-256 hashing** and **RSA key pairs**.  

---

## ✨ Features  
✔ **Role-Based Access** – Admins generate keys & sign files, while Clients verify signatures.  
✔ **Secure Hashing** – Uses **SHA-256** to generate file hashes.  
✔ **Digital Signature** – RSA **private key** signs hashed files.  
✔ **Signature Verification** – Clients verify authenticity using the **RSA public key**.  
✔ **Graphical User Interface (GUI)** – Built using **Java Swing** for an interactive experience.  

---

## 📜 Usage Guide  

### 🔹 **Login**  
- **Admin Credentials:**  
  - **Username:** `admin`  
  - **Password:** `admin123`  
  - **Access:** Generate keys, sign files, and manage security settings.  
- **Client Credentials:**  
  - **Username:** `client`  
  - **Password:** `client123`  
  - **Access:** Verify signatures using the public key.  

### 🔹 **Generate Keys (Admin Only)**  
- The Admin can generate **RSA key pairs** (public & private keys).  
- Keys are saved as:  
  - `public_key.txt`  
  - `private_key.txt`  

### 🔹 **Hash a File (Admin Only)**  
- The Admin selects a file, and the system generates a **SHA-256 hash**.  
- The hash is saved in `hashed_file.txt`.  

### 🔹 **Sign a File (Admin Only)**  
- The Admin signs `hashed_file.txt` using `private_key.txt`.  
- The digital signature is saved in `signature.txt`.  

### 🔹 **Verify a Signature (Client Only)**  
- The Client selects the original file, `signature.txt`, and `public_key.txt`.  
- The system checks if the file has been **modified or tampered with**.  
  - ✅ **Match** – The signature is **valid** (file integrity confirmed).  
  - ❌ **Mismatch** – The file has been **tampered with**.  

---

## 🛠️ Setup Instructions  

### 1️⃣ **Clone the Repository**  
```sh
git clone https://github.com/Blackthorn23/Digital-Signature.git
cd Digital-Signature
```

### 2️⃣ **Compile the Java Files**  
```sh
javac *.java
```

### 3️⃣ **Run the System**  
```sh
java Login
```
---

## ⚠️ Security Notes
### ⚠ Never share private_key.txt – it must remain confidential.
### ⚠ Ensure public_key.txt is distributed securely to clients.
### ⚠ The system uses SHA-256 hashing & RSA encryption for security.
---

## 📜 License & Credits
### This project was developed as part of the Applied Cryptography (TAC6223) course. 🚀
