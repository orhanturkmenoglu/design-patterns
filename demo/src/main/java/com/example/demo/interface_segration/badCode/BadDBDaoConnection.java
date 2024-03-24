package com.example.demo.interface_segration.badCode;

public class BadDBDaoConnection implements BadDaoInterface{
    @Override
    public void openConnection() {
        System.out.println("BadDBDaoConnection:openConnection");
    }

    @Override
    public void createRecord() {
        System.out.println("BadDBDaoConnection:createRecord");
    }

    @Override
    public void openFile() {
        System.out.println("BadDBDaoConnection:openFile");
    }

    @Override
    public void deleteRecord() {
        System.out.println("BadDBDaoConnection:deleteRecord");
    }
}
