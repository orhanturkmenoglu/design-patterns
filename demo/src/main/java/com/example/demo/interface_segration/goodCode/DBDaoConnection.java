package com.example.demo.interface_segration.goodCode;

public class DBDaoConnection implements DaoInterface,DBInterface{
    @Override
    public void createRecord() {
        System.out.println("DBDaoConnection::createRecord");
    }

    @Override
    public void deleteRecord() {
        System.out.println("DBDaoConnection::deleteRecord");
    }

    @Override
    public void openConnection() {
        System.out.println("DBDaoConnection::openConnection");
    }
}
