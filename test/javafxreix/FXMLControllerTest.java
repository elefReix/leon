/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxreix;

import static javafx.application.Application.launch;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import org.testfx.api.FxAssert;
import org.testfx.api.FxRobot;
import org.testfx.framework.junit5.ApplicationTest;
import static org.testfx.matcher.base.NodeMatchers.hasText;


/**
 *
 * @author elef
 */
public class FXMLControllerTest extends ApplicationTest /*implements  FxRobotInterface*/{
   
    FxRobot robot = new FxRobot();
    @Before
    public void setUp() {
        FXMLController control = new FXMLController();
        robot.clickOn("#elef").write("elef");
        robot.clickOn("#elefSU").write("2303");
        robot.clickOn("#elefield").write("elef@leon");
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of initialize method, of class FXMLController.
     */
    @Test
    public void testGo() {
        System.out.println("Go Test Run");
        robot.clickOn("#go");
        FxAssert.verifyThat("#elef", hasText("elef"));
        FxAssert.verifyThat("#elefSU", hasText("2303"));
        FxAssert.verifyThat("#elefield", hasText("elef@leon"));
       
        
    }
    @Test
    public void testClose() {
        System.out.println("Bye");
      
    }

    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("FXML.fxml"));
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.setTitle("FxElefApp");
        stage.show();
        stage.toFront();
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
