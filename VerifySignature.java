import java.math.BigInteger;
import java.nio.file.Files;
import java.nio.file.Paths;

public class VerifySignature {
    public static String verifySignature(String signatureFilePath, String publicKeyPath) {
        try {
          
            String signature = new String(Files.readAllBytes(Paths.get(signatureFilePath))).trim();
            String publicKey = new String(Files.readAllBytes(Paths.get(publicKeyPath)));
            
            BigInteger digitalSignature = new BigInteger(signature);
            BigInteger eKey = new BigInteger(publicKey.split("\n")[1].split("= ")[1].trim());
            BigInteger n = new BigInteger(publicKey.split("\n")[2].split("= ")[1].trim());
            BigInteger verifiedHash = digitalSignature.modPow(eKey, n);
            String verifiedHashHex = verifiedHash.toString(16);

            String fileHash = new String(Files.readAllBytes(Paths.get("hashed_file.txt"))).trim();


            // Compare the verified hash with the expected hash
            if (verifiedHash.toString(16).equals(fileHash)) {
                return "Decrypted Hash (from signature): \n" + verifiedHashHex + "\nSignature Verified: File integrity is verified.";
            } else {
                return "Signature Verification Failed: The file has been tampered.";
            }

        } catch (Exception ex) {
            return "Error Verifying Signature: " + ex.getMessage();
        }
    }
}
