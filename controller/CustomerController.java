package controller;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import database.DbConnection;
import model.Customer;

public class CustomerController {

    DbConnection db;

    // Register customer;
    public int registerCustomer(Customer customer) {
        String query;
        query = "insert into customer(custFname,custLname,gender,phoneNo," +
                "address,username,password) values('" +
                customer.getCustFname() + "','" +
                customer.getCustLname() + "','" +
                customer.getGender() + "','" +
                customer.getPhoneNo() + "','" +
                customer.getAddress() + "','" +
                customer.getUsername() + "','" +
                customer.getPassword() + "');";

        db = new DbConnection();
        return db.maniulate(query);
    }

    // Login customer
    public Customer loginCustomer(String username, String password) {
        String query;
        query = "select * from customer where username = '" + username +
                "' and password = '" + password + "';";
        db = new DbConnection();
        ResultSet rs = db.retrieve(query);
        Customer customer = null;

        try {
            while (rs.next()) {
                customer = new Customer();
                customer.setCustId(rs.getInt("custId"));
                customer.setCustFname(rs.getString("custFname"));
                customer.setCustLname(rs.getString("custLname"));
                customer.setGender(rs.getString("gender").charAt(0));
                customer.setAddress(rs.getString("address"));
                customer.setUsername(rs.getString("username"));
            }
        } catch (Exception ex) {
            System.out.println("Error" + ex);
        }

        return customer;
    }

    public List<Customer> getAllCustomers() {
        String query;
        query = "select * from customer";
        db = new DbConnection();
        ResultSet rs = db.retrieve(query);
        List<Customer> lstCustomers = new ArrayList<Customer>();

        try {
            while (rs.next()) {
                Customer customer = new Customer();
                customer.setCustId(rs.getInt("custId"));
                customer.setCustFname(rs.getString("custFname"));
                customer.setCustLname(rs.getString("custLname"));
                customer.setGender(rs.getString("gender").charAt(0));
                customer.setPhoneNo(rs.getString("phoneNo"));
                customer.setAddress(rs.getString("address"));
                customer.setUsername(rs.getString("username"));

                lstCustomers.add(customer);
            }
        } catch (Exception ex) {
            System.out.println("Error" + ex);
        }

        return lstCustomers;
    }
}


