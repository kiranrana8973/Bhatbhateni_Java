package controller;

import database.DbConnection;
import model.Customer;

public class CustomerController {
    
    DbConnection db;

    public int registerCustomer(Customer customer){
        String query;
        query = "insert into customer(custFname,custLname,gender,phoneNo,address,username,password) values('" + 
            customer.getCustFname() + "','" + 
            customer.getCustLname() + "','" + 
            customer.getGender() + "','" +
            customer.getPhoneNo() + "','" +
            customer.getAddress() + "','" +
            customer.getUsername() + "','" +
            customer.getPassword() + "');" ;
        db = new DbConnection();
        return db.insert(query);
    }
}
