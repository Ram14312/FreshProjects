  class Bike extends AbstractDemo {
    @Override
    public void statue(){
        System.out.println("bike is stopped");
    }
    @Override
    public void move(){
        System.out.println("bike is moving fastly");
    }
    public static void main(String[]args){
        AbstractDemo ad=new Bike();
        ad.move();
        ad.statue();

    }

}
