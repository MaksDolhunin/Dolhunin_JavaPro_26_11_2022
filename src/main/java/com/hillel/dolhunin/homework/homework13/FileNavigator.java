package com.hillel.dolhunin.homework.homework13;

import java.util.*;

public class FileNavigator {

    Map<String, List<FileData>> listMap = new HashMap<>();

    public void add(String path, FileData fileData) {
        if(fileData.getPath().equals(path) && listMap.containsKey(path)) {
            listMap.get(path).add(fileData);
        } else if (fileData.getPath().equals(path)) {
            List<FileData> fileDataList = new ArrayList<>();
            fileDataList.add(fileData);
            listMap.put(path, fileDataList);
        } else {
            System.out.println("Шлях не існує");
        }
    }

    public List<FileData> find(String path) {
        return listMap.getOrDefault(path, null);
    }

    public List<FileData> filterBySize(Integer size) {
        List<FileData> listForReturn = new ArrayList<>();
        Collection<List<FileData>> listCollection = listMap.values();

        for (List<FileData> fileData : listCollection) {
            for(FileData file : fileData) {
                if(file.getSize() < size) {
                    listForReturn.add(file);
                }
            }
        }
        return listForReturn;
    }

    public void remove(String path) {
        if(listMap.containsKey(path)) {
            listMap.remove(path);
        } else {
            System.out.println("Шлях не знайдено");
        }
    }

    public List<FileData> sortBySize() {
        List<FileData> listForReturn = new ArrayList<>();
        Collection<List<FileData>> listCollection = listMap.values();

        for (List<FileData> fileData : listCollection) {
            listForReturn.addAll(fileData);
        }
        listForReturn.sort(Comparator.comparing(FileData::getSize));
        return listForReturn;
    }

    @Override
    public String toString() {
        return "FileNavigator{" + " listMap = " + listMap + "}";
    }
}
