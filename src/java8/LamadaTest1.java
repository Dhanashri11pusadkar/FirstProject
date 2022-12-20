package java8;
@FunctionalInterface
interface collage
{
    void collageDetailes();
    default void takeaddmission()
    {
        System.out.println("i m from addmission methos");
    }
}
class JSPM implements collage
{

    @Override
    public void collageDetailes() {
        System.out.println("this is JSPM collage");
    }
}
class AISSMS implements collage
{
    @Override
    public void collageDetailes() {
        System.out.println("this is AISSMS collage");
    }
}

public class LamadaTest1 {
    public static void main(String[] args) {
        collage c1=new JSPM();
        c1.collageDetailes();
        c1.takeaddmission();

        collage c2=new AISSMS();
        c2.collageDetailes();
        c2.takeaddmission();

        collage ITP=()->{
            System.out.println("this is ITP collage");
        };
        ITP.collageDetailes();
    }
}
