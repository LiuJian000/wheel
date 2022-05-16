

/**
 * ClassName: Animal
 * Description:
 * date: 2022/4/20 15:25
 *
 * @author liujian
 * @apiNote
 * @since JDK 1.8
 */
public abstract class Animal {
    public Animal(){
        System.out.println("animal");
    }
    private String name;
    public void setName(String name){
        this.name = name;
    }
    protected abstract void speak(String s);
}

class Cat extends Animal{

    @Override
    public void speak(String s) {
        System.out.println("mew");
    }
    public void speaks(Cat... o) {
        System.out.println("o = " + o);
        System.out.println(o.length);
        System.out.println(o.getClass().getName());
        System.out.println(o.getClass().getClassLoader());
        System.out.println("mew mew ");
    }
}
class Test {
    public static void main(String[] args){
        Cat cat = new Cat();
        cat.setName("cat");
        cat.speaks(null);
    }
}
