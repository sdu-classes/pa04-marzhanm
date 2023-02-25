public class Fish extends Animal implements Pet{
    String name;

    public Fish(String name){
        super(0);
        this.name=name;
    }

    public Fish(){
        this("Balyk");
    }

    @Override
    public String getName(){
        return name;
    }

    @Override
    public void setName(String name){
        this.name = name;
    }

    @Override
    public play(){
        System.out.println(this.name + " is playing.");
    }

    @Override
    public walk(){
        throw new Exception("Fishes do not have legs!");
    }

    @Override
    public eat(){
        System.out.println(this.name + "  eats other fishes, plants, insects, eggs.");
    }
}
