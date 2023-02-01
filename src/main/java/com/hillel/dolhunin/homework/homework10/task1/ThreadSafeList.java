package com.hillel.dolhunin.homework.homework10.task1;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class ThreadSafeList {
    List<Object> list = new ArrayList<>();

    public void add(Object obj) {
        synchronized (list) {
            list.add(obj);
        }
    }

    public boolean remove(Object obj) {
        synchronized (list) {
            if (list.contains(obj) && !list.isEmpty()) {
                return list.remove(obj);
            }
            return false;
        }
    }

    public List<Object> get(Objects obj) {
        return list;
    }
}
