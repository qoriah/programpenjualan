/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Tika
 */
class pelanggan {

    public pelanggan() {
    private  String kode;
    private  String nama;
    private  String alamat;
    private  String tlpn;
    
    public void setkode(String kode){
        this.kode = kode;
    }
    
    public String getkode(){
        return kode;
    }
    public void setnama(String nama){
        this.nama= nama;
    }
    
    public String getnama(){
        return nama;
    }
    
     public void setalamat(String alamat){
        this.alamat=alamat;
    }
    
    public String getalamat(){
        return alamat;
    }
    
     public void settlpn(String tlpn){
        this.tlpn=tlpn;
    }
    
    public String gettlpn(){
        return tlpn;
    }
   
    }
    
}
