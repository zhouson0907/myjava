package designModel.decorator;

//这是个具体主题分支上面的中间层
public  class Coffee extends Drink {

    @Override
    public float cost() { //在实现是直接返回价格即可，因为单品就单品一个，实现简单
        // TODO Auto-generated method stub
        return super.getPrice();
    }


}
