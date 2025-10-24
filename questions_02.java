 abstract class Monkey
{
    abstract void Jump();
    
    abstract void Bite();
}


interface BasicAnimal
{
     public void eat();
    public void sleep();
}
class Human extends Monkey implements BasicAnimal
{

    public void Jump()
    {
        System.out.println("Monkey is Jumping");
    }
    public void Bite()
    {
        System.out.println("Monkey is Biting");
    }
    public void eat()
    {
        System.out.println("Basic Animal is  Eating");
    }
    public void sleep()
    {
        System.out.println("Basic Animal is  Sleeping");
    }

    public static void main(String[] args)
    {
        Human h = new Human();
        h.Jump();
        h.Bite();
        h.eat();
        h.sleep();
    }

   
}