/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg123190042_kuis_d;
import java.util.Scanner;

/**
 *
 * @author mumta
 */
public class Main {
    public static void main(String[] args) {
        
        ContactsManager myContactsManager = new ContactsManager(); //instansiasi myContactsManager sebagai objek
        Scanner keyboard = new Scanner(System.in); //instansiasi keyboard sebagai objek untuk input nilai
        
        //kontak yang tersimpan
        Contact feri = new Contact("Feri", "yadi@gmail.com", "08765784993");
        myContactsManager.addContact(feri);
        Contact kuro = new Contact("Kuro", "oruk@gmail.com", "08579389993");
        myContactsManager.addContact(kuro);
        Contact dina = new Contact("Dina", "dimak@gmail.com", "086560788907");
        myContactsManager.addContact(dina);
        Contact rani = new Contact("Rani", "RI@gmail.com", "083456789098");
        myContactsManager.addContact(rani);
        Contact yono = new Contact("Yono", "yo@gmail.com", "087653219087");
        myContactsManager.addContact(rani);
        
        String ulangi, searchName;
        
        //Perulangan menggunakan do-while
        do{
            System.out.print("Cari Nama : ");
            searchName = keyboard.nextLine();
            System.out.println("Mencari....");
            if(myContactsManager.searchContact(searchName).getNama() == null){
                System.out.println("Kontak "+searchName +" Tidak Ditemukan!");
            }
            else{
                System.out.println("Nama     : "+myContactsManager.searchContact(searchName).getNama());
                System.out.println("Numor HP : "+myContactsManager.searchContact(searchName).getNomorHandphone());
                System.out.println("Email    : "+myContactsManager.searchContact(searchName).getEmail());
            }
            System.out.print("\nLanjut Cari ? (y/n) : ");
            ulangi = keyboard.nextLine();
        }while("y".equals(ulangi));
    }
    
}
