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
public class Contact {
    private String nama;
    private String email;
    private String nomorHandphone;

    public Contact(String nama, String email, String nomorHandphone) {
        this.nama = nama;
        this.email = email;
        this.nomorHandphone = nomorHandphone;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNomorHandphone() {
        return nomorHandphone;
    }

    public void setNomorHandphone(String nomorHandphone) {
        this.nomorHandphone = nomorHandphone;
    }
    
    
}
