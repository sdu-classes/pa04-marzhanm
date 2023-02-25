abstract class Animal {
    protected int legs;
    
    protected Animal (int legs) {
        this.legs = legs;
    }

    protected void walk(){
        System.out.println("This animal walks with " + this.legs + " legs");
    }
    abstract void eat();
}
