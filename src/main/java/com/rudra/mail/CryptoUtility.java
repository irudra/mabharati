package com.rudra.mail;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.KeySpec;

import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.PBEParameterSpec;

class CryptoUtil{
	
	static Cipher ecipher;
    static Cipher dcipher;
    // 8-byte Salt
    static byte[] salt = {
        (byte) 0xA9, (byte) 0x9B, (byte) 0xC8, (byte) 0x32,
        (byte) 0x56, (byte) 0x35, (byte) 0xE3, (byte) 0x03
    };
    // Iteration count
    static int iterationCount = 19;
	
    /**
     * 
     * @param secretKey Key used to encrypt data
     * @param plainText Text input to be encrypted
     * @return Returns encrypted text
     * 
     */
    public String encrypt(String secretKey, String plainText) 
            throws NoSuchAlgorithmException, 
            InvalidKeySpecException, 
            NoSuchPaddingException, 
            InvalidKeyException,
            InvalidAlgorithmParameterException, 
            UnsupportedEncodingException, 
            IllegalBlockSizeException, 
            BadPaddingException{
        //Key generation for enc and desc
        KeySpec keySpec = new PBEKeySpec(secretKey.toCharArray(), salt, iterationCount);
        SecretKey key = SecretKeyFactory.getInstance("PBEWithMD5AndDES").generateSecret(keySpec);        
         // Prepare the parameter to the ciphers
        AlgorithmParameterSpec paramSpec = new PBEParameterSpec(salt, iterationCount);

        //Enc process
        ecipher = Cipher.getInstance(key.getAlgorithm());
        ecipher.init(Cipher.ENCRYPT_MODE, key, paramSpec);      
        String charSet="UTF-8";       
        byte[] in = plainText.getBytes(charSet);
        byte[] out = ecipher.doFinal(in);
        @SuppressWarnings("restriction")
		String encStr=new sun.misc.BASE64Encoder().encode(out);
        return encStr;
    }
     /**     
     * @param secretKey Key used to decrypt data
     * @param encryptedText encrypted text input to decrypt
     * @return Returns plain text after decryption
     */
    public String decrypt(String secretKey, String encryptedText)
     throws NoSuchAlgorithmException, 
            InvalidKeySpecException, 
            NoSuchPaddingException, 
            InvalidKeyException,
            InvalidAlgorithmParameterException, 
            UnsupportedEncodingException, 
            IllegalBlockSizeException, 
            BadPaddingException, 
            IOException{
         //Key generation for enc and desc
        KeySpec keySpec = new PBEKeySpec(secretKey.toCharArray(), salt, iterationCount);
        SecretKey key = SecretKeyFactory.getInstance("PBEWithMD5AndDES").generateSecret(keySpec);        
         // Prepare the parameter to the ciphers
        AlgorithmParameterSpec paramSpec = new PBEParameterSpec(salt, iterationCount);
        //Decryption process; same key will be used for decr
        dcipher=Cipher.getInstance(key.getAlgorithm());
        dcipher.init(Cipher.DECRYPT_MODE, key,paramSpec);
        @SuppressWarnings("restriction")
		byte[] enc = new sun.misc.BASE64Decoder().decodeBuffer(encryptedText);
        byte[] utf8 = dcipher.doFinal(enc);
        String charSet="UTF-8";     
        String plainStr = new String(utf8, charSet);
        return plainStr;
    }    
}
