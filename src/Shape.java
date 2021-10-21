public class Shape
{
    void draw ()
    {
        System.out.println("Drawing shapes");
    }
    void erase()
    {
        System.out.println("Erasing shapes");
    }
    public static void main(String[] args) {
        Shape sp=new Shape();
        sp.draw();
        sp.erase();
    }

}
