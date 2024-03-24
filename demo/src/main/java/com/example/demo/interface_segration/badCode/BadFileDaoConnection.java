package com.example.demo.interface_segration.badCode;

import java.sql.Connection;

public class BadFileDaoConnection implements BadDaoInterface {

    // BU BAĞLANTI METHODU BURAYA AİT DEĞİL GEREKSİZ KODUN DA ÖNÜNE GEÇMELİYİZ.
    @Override
    public void openConnection() {
        System.out.println("BadFileDaoConnection::openConnection");
    }

    @Override
    public void createRecord() {
        System.out.println("BadFileDaoConnection::createRecord");
    }

    @Override
    public void openFile() {
        System.out.println("BadFileDaoConnection::openFile");
    }

    @Override
    public void deleteRecord() {
        System.out.println("BadFileDaoConnection::deleteRecord");
    }
}
