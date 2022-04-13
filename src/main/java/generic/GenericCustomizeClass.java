package generic;

/**
 * @author zhouson
 * @create 2019-05-01 20:32
 */
//定义带有泛型的类
public  class GenericCustomizeClass<E> {
    private E name;

    public E getName() {
        return name;
    }

    public void setName(E name) {
        this.name = name;
    }
}
