public class Lamp implements Operable{
    private String name;
    private Boolean isOn;

    public Lamp(String name, Boolean isOn) {
        this.name = name;
        this.isOn = isOn;
    }

    public String getName() {
        return name;
    }

    @Override
    public void turnOff() {
        if(!this.isOn){
            System.out.println("Las luces ya estan apagadas");
        }else{
            this.isOn = false;
            System.out.println("Apagando luces!");
        }
    }

    @Override
    public void turnOn() {
        if(this.isOn){
            System.out.println("Las luces ya estan prendidas!!!");
        }else{
            this.isOn = true;
            System.out.println("Prendiendo luces!!");

        }
    }
}
