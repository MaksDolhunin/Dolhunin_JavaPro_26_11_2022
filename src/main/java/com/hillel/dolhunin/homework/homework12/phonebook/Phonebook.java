package com.hillel.dolhunin.homework.homework12.phonebook;


import java.util.ArrayList;
import java.util.List;

public class Phonebook {
    private List<Record> records = new ArrayList<>();

    public void add(String name, String number){
        records.add(new Record(name, number));
    }

    public Record find(String name) {
        for (Record record : records) {
            if (record.getName().equals(name)) {
                return record;
            }
        }
        return null;
    }
    public List<Record> findAll(String name) {
        List<Record> result = new ArrayList<>();
        for (Record record : records) {
            if (record.getName().equals(name)) {
                result.add(record);
            }
        }

        if (result.isEmpty()) {
            return null;
        } else {
            return result;
        }
    }

}
