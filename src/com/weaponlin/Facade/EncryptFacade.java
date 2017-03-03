package com.weaponlin.Facade;

/**
 * Created by Weapon Lin on 2017/1/16.
 */
public class EncryptFacade {

    private FileReader fileReader;
    private CipherMachine cipherMachine;
    private FileWriter fileWriter;

    public EncryptFacade(){
        fileReader = new FileReader();
        cipherMachine = new CipherMachine();
        fileWriter = new FileWriter();
    }

    public void encryptFile(String fileName){
        //读取文件
        String source = fileReader.read(fileName);
        //加密文件
        String content = cipherMachine.encrypt(source);
        //写入文件
        fileWriter.write(content);
    }
}
