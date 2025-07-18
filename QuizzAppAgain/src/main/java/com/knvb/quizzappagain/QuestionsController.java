/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package com.knvb.quizzappagain;

import com.knvb.pojo.Category;
import com.knvb.service.CategoryServices;
import com.knvb.utils.JdbcConnector;
import java.net.URL;
import java.nio.channels.ConnectionPendingException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;

/**
 * FXML Controller class
 *
 * @author Admin
 */
public class QuestionsController implements Initializable {

        @FXML private ComboBox<Category> cbCates;
        private static final CategoryServices cateServices = new CategoryServices();
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        try {
            // B1: Nạp driver
            //Class.forName("com.mysql.cj.jdbc.Driver");
            
            //B2: Thiết lập kết nối
            //Connection conn = JdbcConnector.getInstance().connect();
               
               //B3: Xử lý truy vấn
//            Statement stm = conn.createStatement();
//            ResultSet rs = stm.executeQuery("Select * From category");
//            
//            List<Category> cates = new ArrayList<>();
//            while(rs.next()){
//                int id = rs.getInt("id");
//                String name = rs.getString("name");
//                Category c = new Category(id, name);
//                cates.add(c);
//            }
            
            //B4: Đóng kết nối 
//            conn.close();
              this.cbCates.setItems(FXCollections.observableList(cateServices.getCates()));
        } catch (SQLException ex) {
            ex.printStackTrace();
            
        }
    }    
    
}
