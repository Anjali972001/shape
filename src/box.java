public class box {
    int w;
    int h;
    int l;


    box(int w,int h,int l)
    {
        this.w=w;
        this.h=h;
        this.l=l;

    }
    void area(){
        int area=2*(l*h+h*w+h*w);
        System.out.println(area);
    }
    void volume()
    {
        int volume=l*w*h;
        System.out.println(volume);
    }

    public static void main(String[] args)
    {
        box b=new box(10,20,30);
        b.area();
        b.volume();
    }
}
