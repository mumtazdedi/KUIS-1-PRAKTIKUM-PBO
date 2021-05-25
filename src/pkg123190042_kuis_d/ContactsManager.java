/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg123190042_kuis_d;

/**
 *
 * @author mumta
 */
public class ContactsManager {
    // Fields
    Contact[] myFriends;
    int friendsCount;
    
    // Constructor
    ContactsManager() {
    myFriends = new Contact[500];
    friendsCount = 0;
    }
    
    
    void addContact(Contact contact){
      myFriends[friendsCount] = contact;
      friendsCount++;
    }
    Contact searchContact(String searchName){
       
    Contact result = new Contact(null, null, null);
    for(int j=0; j<friendsCount; j++){
            if(myFriends[j].getNama().equals(searchName)){
                result.setNama(myFriends[j].getNama());
                result.setEmail(myFriends[j].getEmail());
                result.setNomorHandphone(myFriends[j].getNomorHandphone());
            }
        }
        return result;
    }
}
