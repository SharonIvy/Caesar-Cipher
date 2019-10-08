import models.CeaserCipher;
import models.Decrypt;
import models.Encrypt;

import java.util.Scanner;

public class App {
    public static void main (String[] args){
        System.out.println("\t===========================");
        System.out.println("\t\tCAESER CIPHER");
        System.out.println("\t===========================");
        boolean run = true;
        while (run){
            Scanner myScanner = new Scanner(System.in);
            System.out.println("\t Enter 1 to encrypt\n\t Enter 2 to decrypt\n\t Enter 0 to exit ");
            Integer branch = Integer.parseInt(myScanner.nextLine());

            if (branch.equals(1)) {
                System.out.println("\n Enter text to encrypt");
                String stringWord = myScanner.nextLine();
                System.out.println("\n Enter the key to encrypt with");
                int intKey = myScanner.nextInt();
                CeaserCipher testCeaser = new CeaserCipher(stringWord, intKey);
                Encrypt encrypt = new Encrypt();
                encrypt.setWord(testCeaser.getmWord());
                encrypt.setKey(testCeaser.getmKey());
                System.out.println("\t--------------------------------");
                System.out.println("\t| Your encrypted text is: "+ encrypt.encrypter());
                System.out.println("\t--------------------------------");
            }else if (branch.equals(2)) {
                System.out.println("\n Enter text to Decrypt");
                String stringWord = myScanner.nextLine();
                System.out.println("\n Enter the key to Decrypt with");
                int intKey = myScanner.nextInt();
                CeaserCipher testCeaser = new CeaserCipher(stringWord,intKey);
                Decrypt decrypt = new Decrypt();
                decrypt.setWord(testCeaser.getmWord());
                decrypt.setKey(testCeaser.getmKey());
                System.out.println("\t---------------------------------");
                System.out.println("\t| Your decrypted text is: "+ decrypt.decrypter());
                System.out.println("\t---------------------------------");

            }else if(branch.equals(0)){
                run = false;
            }else {
                System.out.println("Invalid input. Please enter 1, 2 or 3");
            }
        }
    }
}
