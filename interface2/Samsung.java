public class Samsung implements Phone {

    private int volume;

    public Samsung() {
        // set volume awal
        this.volume = 50;
    }

    @Override
    public void powerOn() {
        System.out.println("Handphone menyala...");
    }

    @Override
    public void powerOff() {
        System.out.println("Handphone dimatikan");
    }

    @Override
    public void volumeUp() {
        {
            System.out.println("Suara ditingkatkan dengan volume " + getVolume());
        }
    }

    @Override
    public void volumeDown() {
        {
            System.out.println("Suara dikurangi");
        }
    }

    public int getVolume() {
        return this.volume;
    }

}
