package com.company;

import java.util.ArrayList;

public class LambdaList<T> {
    private final ArrayList<T> arrayList = new ArrayList<>();

    void add(T item) {
        arrayList.add(item);
    }

    public T get(int i) {
       return arrayList.get(i);
    }

    void remove(int i) {
        arrayList.remove(i);
    }

    boolean all(IOrder<T> order) {
        for (int i = 0; i < arrayList.size(); i++) {
            if (!order.allbool(arrayList.get(i))) return true;
        }
        return false;
    }

    boolean any(IOrder<T> order) {
        for (int i = 0; i < arrayList.size(); i++) {
            if (order.allbool(arrayList.get(i))) return false;
        }
        return true;
    }

    LambdaList<T> filter(IOrder<T> order) {
        LambdaList list = new LambdaList();
        for (int i = 0; i < arrayList.size(); i++) {
            if (order.allbool(arrayList.get(i))) list.add(arrayList.get(i));
        }
        return list;}


        public T max(IOrders<T> comparator) {
            if (arrayList.isEmpty()) return null;
            T maxT = arrayList.get(0);
            for (int i = 0; i < arrayList.size(); i++) {
                if (comparator.orders(arrayList.get(i), maxT) > 0) maxT = arrayList.get(i);
            } return maxT;
        }

        public T min(IOrders<T> comparator) {
            if (arrayList.isEmpty()) return null;
            T minT = arrayList.get(0);
            for (int i = 0; i < arrayList.size(); i++) {
                if (comparator.orders(arrayList.get(i), minT) < 0) minT = arrayList.get(i);
            } return minT;
        }
    public <E> LambdaList<E> map(IModify<T, E> modify) {
        LambdaList<E> list = new LambdaList<>();
        for (int i = 0; i < arrayList.size(); i++) {
            list.add(modify.modify(arrayList.get(i)));
        } return list;
    }
    }

