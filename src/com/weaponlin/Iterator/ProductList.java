package com.weaponlin.Iterator;

import java.util.List;

/**
 * //商品数据类：具体聚合类
 * Created by Weapon Lin on 2017/1/15.
 */
public class ProductList extends AbstractObjectList{
    public ProductList(List objects) {
        super(objects);
    }

    @Override
    public AbstractIterator createIterator() {
        return new ProductIterator();
    }

    //商品迭代器：具体迭代器，内部类实现
    private class ProductIterator implements AbstractIterator{
        private int cursor1;
        private int cursor2;

        public ProductIterator(){
            cursor1 = 0;
            cursor2 = objects.size() - 1;
        }

        @Override
        public boolean hasNext() {
            return cursor1 != objects.size();
        }

        @Override
        public boolean isLast() {
            return cursor1 == objects.size();
        }

        @Override
        public void previous() {
            if(cursor2 > -1){
                cursor2--;
            }
        }

        @Override
        public boolean isFirst() {
            return cursor2 == -1;
        }

        @Override
        public Object getNextItem() {
            if(cursor1 >= objects.size()){
                throw new ArrayIndexOutOfBoundsException("索引越界");
            }
            return objects.get(cursor1++);
        }

        @Override
        public Object getPreviousItem() {
            return objects.get(cursor2);
        }
    }
}
