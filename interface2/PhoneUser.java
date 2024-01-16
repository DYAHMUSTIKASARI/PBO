public class PhoneUser {
    
    private Phone obyek_MerkHP;

    public PhoneUser(Phone obyek_MerkHP) {
        this.obyek_MerkHP = obyek_MerkHP;
    }
    
    void menyalakan(){
        this.obyek_MerkHP.powerOn();
    }
    
    void mematikan(){
        this.obyek_MerkHP.powerOff();
    }
    
    void mengeraskansuara(){
        this.obyek_MerkHP.volumeUp();
    }
    
    void mengecilkansuara(){
        this.obyek_MerkHP.volumeDown();
    }
}
