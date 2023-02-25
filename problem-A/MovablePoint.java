class MovablePoint implements Movable {
    protected int x;
    protected int y;
    protected int xSpeed;
    protected int ySpeed;

    public MovablePoint(int x, int y, int xSpeed, int ySpeed) {
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    @Override
    public void moveUp(){
        this.y -= ySpeed;
    }

    @Override
    public void moveDown(){
        y += ySpeed;
    }

    @Override
    public void moveLeft(){
        x -= xSpeed;
    }

    @Override
    public void moveRight(){
        x += xSpeed;
    }
    
    public String toString() {
        return String.format("(%d, %d), speed=(%d, %d)", x, y, xSpeed, ySpeed);
    }
}
