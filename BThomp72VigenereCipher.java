import java.util.Scanner;

public class BThomp72VigenereCipher {

public static void main(String[] args) {

   Scanner in = new Scanner(System.in);
   
   System.out.println("Cipher\nEnter plain text to be encoded: ");
   String plainText = in.nextLine();
   System.out.println("Enter the pass phrase (no spaces allowed): ");
   String passPhrase = in.nextLine();

   public static String encrypt(String Message, String Key) {
		String EMessage = "";
		Message = Message.toUpperCase();
		for (int i = 0, j = 0; i < Message.length(); i++) {
			char letter = Message.charAt(i);
			EMessage += (char)(((letter - 65) + (Key.charAt(j)-65)) % 26 + 65);
			j = ++j % Key.length();
		}
		return EMessage;rText, listAlphabet);
   
   
   public static String decrypt(String Message, String Key) {
		String DMessage = "";
		Message = Message.toUpperCase();
		for (int i = 0, j = 0; i < Message.length(); i++) {
			char letter = Message.charAt(i);
			DMessage += (char)((letter - Key.charAt(j) + 26) % 26 + 65);
			j = ++j % Key.length();
		}
		return DMessage;
	}
       
   
   System.out.println("Encrypted Text: " + EMessage);
   System.out.println();
   
   System.out.println("Decipher\nEnter the encrypted text to be decrypted");
   String encodedText = in.nextLine();
   
   System.out.println("Enter the Pass Phrase (no spaces allowed): ");
   String passPhraseNew = in.nextLine();
   
   String cipherTextNew = generateCipherText(encodedText, passPhraseNew);
   String decryptText = decryptFunction(cipherTextNew, encodedText,listAlphabet);
   System.out.println("Decrypted Plain Text: " + DMessage);
}

/**
* Function to generate Vigenere Matrix
* @return
*/
public static char[][] createAlphaMatrix() {

char[][] arr = new char[26][26];
// Two for loops to generate the grid
for (int i = 0; i < 26; i++) {
for (int j = 0; j < 26; j++) {
int letter = i + j;
if (letter >= 26)
letter = letter - 26;
// Add 65 to the int so that the char will return letters and not ASCII symbols
letter = letter + 65;
// Cast the int to a char
char alphabet = (char) letter;
// Converting the characters to lowercase
char lowerCaseLetter = Character.toLowerCase(alphabet);
// Put the char into its respective place in the array
arr[i][j] = lowerCaseLetter;
}
}
return arr;
}


public static String generateCipherText(final String plainText, final String passPhrase) {

StringBuilder cipherKey = new StringBuilder();
for (int i = 0, keywordIndex = 0; i < plainText.length(); i++, keywordIndex++) {
if (keywordIndex >= passPhrase.length()) {
keywordIndex = 0;
}
if (plainText.charAt(i) == ' ') {
cipherKey.append(" ");
keywordIndex--;
}
else {
cipherKey.append(passPhrase.charAt(keywordIndex));
}
}
return cipherKey.toString();
}


public static String encryptFunction(String plaintext, String cipherText, char[][] alphaMatrix) {

StringBuilder encryptMessage = new StringBuilder();
for (int i = 0; i < cipherText.length(); i++) {
int ciphertxtInt = cipherText.charAt(i) - 97;
int plaintxtInt = plaintext.charAt(i) - 97;
//Checking for space in the cipher Text
if(cipherText.charAt(i) ==' ') {
encryptMessage.append(" ");
}
else {
encryptMessage.append(alphaMatrix[ciphertxtInt][plaintxtInt]);
}
}
return encryptMessage.toString();
}

/**
* Decrypt Function - Regenerates the plain text using the below paramaters
* @param cipherText - text formed with passphrase key
* @param encryptText - encoded text which need to be decoded
* @param alphaMatrix - vigenere matrix from which decoded text is generated
* @return
*/
public static String decryptFunction(String cipherText, String encryptText, char[][] alphaMatrix) {

StringBuilder message = new StringBuilder();
for (int i = 0; i < cipherText.length(); i++) {
int rowIndex = cipherText.charAt(i)-97;
if(cipherText.charAt(i) ==' ') {
message.append(" ");
}
else {
char[] row = alphaMatrix[rowIndex];
int colIndex = new String(row).indexOf(encryptText.charAt(i));
message.append((char)(colIndex+65));
}
}
return message.toString().toLowerCase();
}
}
