package Employee;
public class Boss extends Employee{
   
    @Override
    public void display (){
     System.out.println("\nNomor Induk pegawai :"+this.nip);
        System.out.println("Nama "+this.name);
        System.out.println("status :"+this.status);
        System.out.println("Waktu kerja :"+this.waktukerja+"jam");
        this.gaji+=bonus+potongan;
        System.out.println("Gaji boss : rp"+this.gaji);
        System.out.println("Gaji boss setelah kena pajak :"+this.pajak);   
    }
}
