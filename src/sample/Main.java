package sample;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import javax.swing.text.TableView;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        // Demo setup
        parentCompany PC = new parentCompany("Example");
        PC.addSupplier("Supplier1", "China");
        PC.addSupplier("Supplier2", "Brazil");
        supplier s1 = PC.getSupplier("Supplier1");
        supplier s2 = PC.getSupplier("Supplier2");
        s2.addWorker("Fred", 24, 7.4f, "123456789");
        s2.addWorker("Doug", 19, 4.2f, "987654321");
        s2.addWorker("Gregor The Elder", 204, 102.3f, "7");
        s2.addWorker("Tokyo Drift", 2, 2.0f, "2");
        s2.addBank("Pasta Bank");
        bank bsb = s2.getBank("Pasta Bank");
        bsb.addClient("7");
        bsb.addClient("123456789");
        bsb.addClient("987654321");
        bsb.addClient("2");
        s2.getWorker("7").setMonthlyHours(9);
        s2.getWorker("123456789").setMonthlyHours(9);
        s2.getWorker("987654321").setMonthlyHours(9);
        s2.getWorker("2").setMonthlyHours(2);





        //



    
        // set preferred width
        VBox vBox = new VBox();
        vBox.setPrefWidth(100);
        
        GridPane gridMainMenu = new GridPane();
        gridMainMenu.setAlignment( Pos.CENTER );
        gridMainMenu.setHgap( 10 );
        gridMainMenu.setVgap( 10 );
        gridMainMenu.setPadding( new Insets( 25, 25, 25, 25 ) );
    
        Text sceneMenuTitle = new Text("Main Menu");
        sceneMenuTitle.setFont( Font.font("Tahoma", FontWeight.NORMAL, 20));
        gridMainMenu.add(sceneMenuTitle, 0, 0, 2, 1);
    
        Button btnMenuBank = new Button("Bank Menu");
        HBox hbBtnMenuBank = new HBox(10);
        hbBtnMenuBank.setAlignment(Pos.CENTER_LEFT);
        hbBtnMenuBank.getChildren().add(btnMenuBank);
        gridMainMenu.add(hbBtnMenuBank, 0, 7);
    
        Button btnMenuSupplier = new Button("Supplier Menu");
        HBox hbBtnMenuSupplier = new HBox(10);
        hbBtnMenuSupplier.setAlignment(Pos.CENTER_LEFT);
        hbBtnMenuSupplier.getChildren().add(btnMenuSupplier);
        hbBtnMenuSupplier.setMaxWidth(200);
        gridMainMenu.add(hbBtnMenuSupplier, 0, 8);
    
        Button btnMenuParent = new Button("Parent Company Menu");
        btnMenuParent.setMinWidth(vBox.getPrefWidth());
        HBox hbBtnMenuParent = new HBox(10);
        hbBtnMenuParent.setAlignment(Pos.CENTER_LEFT);
        hbBtnMenuParent.getChildren().add(btnMenuParent);
        gridMainMenu.add(hbBtnMenuParent, 0, 9);
    
       
        
        // --------- Bank Scenes --------- //
            // ---------------------------------------- Bank Main Scene --- //
            GridPane gridBankMain = new GridPane();
            gridBankMain.setAlignment( Pos.CENTER );
            gridBankMain.setHgap( 10 );
            gridBankMain.setVgap( 10 );
            gridBankMain.setPadding( new Insets( 25, 25, 25, 25 ) );
        
            Text sceneBankMenuTitle = new Text("Bank Menu");
            sceneMenuTitle.setFont( Font.font("Tahoma", FontWeight.NORMAL, 20));
            gridBankMain.add(sceneBankMenuTitle, 0, 0, 2, 1);
    
            Label id = new Label( "ID:" );
            gridBankMain.add( id, 0, 2 );

            TextField idInput = new TextField();
            gridBankMain.add(idInput, 1,2);

        
            Button btnBankBack = new Button("Back");
            HBox hbBtnBankBack = new HBox(10);
            hbBtnBankBack.setAlignment(Pos.BOTTOM_RIGHT);
            hbBtnBankBack.getChildren().add(btnBankBack);
            gridBankMain.add(hbBtnBankBack, 0, 7);

            Button btnBankAddWorker = new Button("Add Worker");
            HBox hbBtnBankAddWorker = new HBox(10);
            hbBtnBankAddWorker.setAlignment(Pos.CENTER);
            hbBtnBankAddWorker.getChildren().add(btnBankAddWorker);
            gridBankMain.add(hbBtnBankAddWorker, 1, 7);
            
            Button btnBankContinue = new Button("Continue");
            HBox hbBtnBankContinue = new HBox(10);
            hbBtnBankContinue.setAlignment(Pos.BOTTOM_RIGHT);
            hbBtnBankContinue.getChildren().add(btnBankContinue);
            gridBankMain.add(hbBtnBankContinue, 2, 7);
            // ---------------------------------------- END Bank Main Scene --- //
        // ---------------------------------------------------- Bank Add Worker Scene --- //
            GridPane gridBankMainAddWorker = new GridPane();
            gridBankMainAddWorker.setAlignment( Pos.CENTER );
            gridBankMainAddWorker.setHgap( 10 );
            gridBankMainAddWorker.setVgap( 10 );
            gridBankMainAddWorker.setPadding( new Insets( 25, 25, 25, 25 ) );

            Text sceneBankAddWorkerTitle = new Text("Add Worker");
            sceneMenuTitle.setFont( Font.font("Tahoma", FontWeight.NORMAL, 20));
            gridBankMainAddWorker.add(sceneBankAddWorkerTitle,0,0,2,1);

            Label idLabel = new Label( "ID:" );
            gridBankMainAddWorker.add( idLabel, 0, 2 );

            TextField idAdd = new TextField();
            gridBankMainAddWorker.add(idAdd, 1,2);

            /*
            Label nameLabel = new Label( "Name:" );
            gridBankMainAddWorker.add( nameLabel, 0, 3 );

            TextField nameAdd = new TextField();
            gridBankMainAddWorker.add(nameAdd, 1,3);

            Label ageLabel = new Label( "Age:" );
            gridBankMainAddWorker.add( ageLabel, 0, 4 );

            TextField ageAdd = new TextField();
            gridBankMainAddWorker.add(ageAdd, 1,4);
            */

            Button btnBankAddWorkerSubmit = new Button("Submit");
            HBox hbBtnBankAddWorkerSubmit = new HBox(10);
            hbBtnBankAddWorkerSubmit.setAlignment(Pos.BOTTOM_RIGHT);
            hbBtnBankAddWorkerSubmit.getChildren().add(btnBankAddWorkerSubmit);
            gridBankMainAddWorker.add(hbBtnBankAddWorkerSubmit, 2, 7);

            Button btnBankAddWorkerBack = new Button("Back");
            HBox hbBtnBankAddWorkerBack = new HBox(10);
            hbBtnBankAddWorkerBack.setAlignment(Pos.BOTTOM_LEFT);
            hbBtnBankAddWorkerBack.getChildren().add(btnBankAddWorkerBack);
            gridBankMainAddWorker.add(hbBtnBankAddWorkerBack, 0, 7);



            // ---------------------------------------------------- END Bank Add Worker Scene --- //

                // ---------------------------------------------------- Bank Continue Scene --- //
                GridPane gridBankContinued = new GridPane();
                gridBankContinued.setAlignment( Pos.CENTER );
                gridBankContinued.setHgap( 10 );
                gridBankContinued.setVgap( 10 );
                gridBankContinued.setPadding( new Insets( 25, 25, 25, 25 ) );
    
                Text sceneBankContinuedTitle = new Text("Bank Menu");
                sceneBankContinuedTitle.setFont( Font.font("Tahoma", FontWeight.NORMAL, 16));
                gridBankContinued.add(sceneBankContinuedTitle, 0, 0, 2, 1);
    
                Label ageDisplay = new Label( "Age:" );
                gridBankContinued.add( ageDisplay, 0, 2 );
    
                Label id1 = new Label( "dob1" );
                gridBankContinued.add( id1, 1, 2 );
            
//                Label id2 = new Label( "dob2" );
//                gridBankContinued.add( id2, 3, 2 );
                
                // ------------------------------------------
                Label paid = new Label( "Amount paid:" );
                gridBankContinued.add( paid, 0, 3 );
            
                Label paid1 = new Label( "$$$");
                gridBankContinued.add( paid1, 1, 3 );
            
//                Label paid2 = new Label( "£££" );
//                gridBankContinued.add( paid2, 3, 3 );
                // ------------------------------------------
                Label datePaid = new Label( "Date Last Paid:" );
                gridBankContinued.add( datePaid, 0, 4 );
            
                Label datePaid1 = new Label( "like a month ago ish" );
                gridBankContinued.add( datePaid1, 1, 4 );

                /*
                Label datePaid2 = new Label( "///" );
                gridBankContinued.add( datePaid2, 3, 4 );
                */
                
                CheckBox cb1 = new CheckBox( "Over 18" );
                CheckBox cb2 = new CheckBox( "Paid" );
                CheckBox cb3 = new CheckBox( "Paid On Time" );
                
                gridBankContinued.add( cb1, 4, 2 );
                gridBankContinued.add( cb2, 4, 3 );
                gridBankContinued.add( cb3, 4, 4 );
    
                Button btnBankContinuedBack = new Button("Back");
                HBox hbBtnBankContinuedBack = new HBox(10);
                hbBtnBankContinuedBack.setAlignment(Pos.BOTTOM_RIGHT);
                hbBtnBankContinuedBack.getChildren().add(btnBankContinuedBack);
                gridBankContinued.add(hbBtnBankContinuedBack, 0, 7);
    
                Button btnBankSumbit = new Button("Submit");
                HBox hbBtnBankSumbit = new HBox(10);
                hbBtnBankSumbit.setAlignment(Pos.BOTTOM_RIGHT);
                hbBtnBankSumbit.getChildren().add(btnBankSumbit);
                gridBankContinued.add(hbBtnBankSumbit, 3, 7);
                
                // ---------------------------------------------------- END Bank Continue Scene --- //
        // --------- END Bank Scenes --------- //

        // --------- Supplier Scene(s) --------- //

        // --------- Supplier Scene MAIN --------- //
        GridPane gridSupplier = new GridPane();
        gridSupplier.setAlignment( Pos.CENTER );
        gridSupplier.setHgap( 10 );
        gridSupplier.setVgap( 10 );
        gridSupplier.setPadding( new Insets( 25, 25, 25, 25 ) );

        Text sceneSupplier1 = new Text("Supplier Menu");
        sceneSupplier1.setFont( Font.font("Tahoma", FontWeight.NORMAL, 20));
        gridSupplier.add(sceneSupplier1, 0, 0, 2, 1);

        Button btnSupplierOption1 = new Button("Add Worker");
        HBox hbBtnSupplierOption1 = new HBox(10);
        hbBtnSupplierOption1.setAlignment(Pos.CENTER);
        hbBtnSupplierOption1.getChildren().add(btnSupplierOption1);
        gridSupplier.add(hbBtnSupplierOption1, 1, 4);

        Button btnSupplierOption2 = new Button("Search for Worker");
        HBox hbBtnSupplierOption2 = new HBox(10);
        hbBtnSupplierOption2.setAlignment(Pos.CENTER);
        hbBtnSupplierOption2.getChildren().add(btnSupplierOption2);
        gridSupplier.add(hbBtnSupplierOption2, 2, 4);

        Button btnSupplierBack = new Button("Back");
        HBox hbBtnSupplierBack = new HBox(10);
        hbBtnSupplierBack.setAlignment(Pos.CENTER_LEFT);
        hbBtnSupplierBack.getChildren().add(btnSupplierBack);
        gridSupplier.add(hbBtnSupplierBack, 3, 4);
        // --------- END Supplier Scene MAIN --------- //
        // --------- Supplier Search For Worker  --------- //
        GridPane gridSupplierSearch = new GridPane();
        gridSupplierSearch.setAlignment( Pos.CENTER );
        gridSupplierSearch.setHgap( 10 );
        gridSupplierSearch.setVgap( 10 );
        gridSupplierSearch.setPadding( new Insets( 25, 25, 25, 25 ) );

        Text sceneSupplier2 = new Text("Supplier Menu");
        sceneSupplier2.setFont( Font.font("Tahoma", FontWeight.NORMAL, 20));
        gridSupplier.add(sceneSupplier2, 0, 0, 2, 1);

        TextField userTextField = new TextField();
        gridSupplierSearch.add(userTextField, 0, 0);

        Button btnSupplierSearch = new Button("Search Worker by ID");
        HBox hbBtnSupplierSearch = new HBox(10);
        hbBtnSupplierSearch.setAlignment(Pos.CENTER_LEFT);
        hbBtnSupplierSearch.getChildren().add(btnSupplierSearch);
        gridSupplierSearch.add(hbBtnSupplierSearch, 0, 1);

        Button btnSupplierSearchBack = new Button("Back");
        HBox hbBtnSupplierSearchBack = new HBox(10);
        hbBtnSupplierSearchBack.setAlignment(Pos.CENTER_LEFT);
        hbBtnSupplierSearchBack.getChildren().add(btnSupplierSearchBack);
        gridSupplierSearch.add(hbBtnSupplierSearchBack, 0, 2);
        // --------- END Supplier Search For Worker  --------- //
// --------- Supplier viewing worker scene ---------- //
        GridPane gridWorker = new GridPane();
        gridWorker.setAlignment( Pos.CENTER );
        gridWorker.setHgap( 10 );
        gridWorker.setVgap( 10 );
        gridWorker.setPadding( new Insets( 25, 25, 25, 25 ) );

        Text title = new Text("New worker");
        title.setFont( Font.font("Tahoma", FontWeight.NORMAL, 24));
        gridWorker.add(title, 0, 0);

        Text name = new Text("Name:");
        gridWorker.add(name, 0, 1);

        TextField nameField = new TextField();
        gridWorker.add(nameField, 1, 1);

        Text dateofBirth = new Text("Age:");
        gridWorker.add(dateofBirth, 0, 2);

        TextField birthdayField = new TextField();
        gridWorker.add(birthdayField, 1, 2);

        Text workHours = new Text("Work hours:");
        gridWorker.add(workHours, 0, 3);

        TextField hoursField = new TextField();
        gridWorker.add(hoursField, 1, 3);

        Text payRate = new Text("Pay rate:");
        gridWorker.add(payRate, 0, 4);

        TextField payField = new TextField();
        gridWorker.add(payField, 1, 4);

        Text bank = new Text("Bank Account:");
        gridWorker.add(bank, 0, 5);

        TextField accountField = new TextField();
        gridWorker.add(accountField, 1, 5);

        Button btnSubmitWorker = new Button("Submit");
        gridWorker.add(btnSubmitWorker, 0, 6);

        Button btnCancelWorker = new Button("Cancel");
        gridWorker.add(btnCancelWorker, 1,6);



// --------- END Supplier Scene(s) --------- //

// --------- Parent Company Scene(s) --------- //
        GridPane gridParent = new GridPane();
        gridParent.setAlignment( Pos.CENTER );
        gridParent.setHgap( 10 );
        gridParent.setVgap( 10 );
        gridParent.setPadding( new Insets( 25, 25, 25, 25 ) );

        Text suppliersManage = new Text( "Manage suppliers" );
        suppliersManage.setFont( Font.font("Tahoma", FontWeight.NORMAL, 30));
        gridParent.add( suppliersManage, 0, 0, 3, 1);

        Button btnParentBack = new Button("Back");
        HBox hbBtnParentBack = new HBox();
        hbBtnParentBack.setAlignment(Pos.BOTTOM_RIGHT);
        hbBtnParentBack.getChildren().add(btnParentBack);
        gridParent.add(hbBtnParentBack, 3, 2);

        Button btnParentRemove = new Button("Remove");
        HBox hbBtnParentRemove = new HBox();
        hbBtnParentRemove.setAlignment(Pos.BOTTOM_CENTER);
        hbBtnParentRemove.getChildren().add(btnParentRemove);
        gridParent.add(hbBtnParentRemove, 2, 2);

        Button btnParentAdd = new Button("Add");
        HBox hbBtnParentAdd = new HBox();
        hbBtnParentAdd.setAlignment(Pos.BOTTOM_LEFT);
        hbBtnParentAdd.getChildren().add(btnParentAdd);
        gridParent.add(hbBtnParentAdd, 1, 2);

        TextField supplierTextfield = new TextField();
        supplierTextfield.setAlignment(Pos.TOP_LEFT);
        gridParent.add(supplierTextfield, 1, 1, 3, 1);
// --------- END Parent Company Scene(s) --------- //
        
                    // ---------- Main Menu Bank Button Action ------------- //
                
                    btnBankContinue.setOnAction(new EventHandler<ActionEvent>() {
                    
                        @Override
                        public void handle(ActionEvent event) {
                            System.out.println("PressedContinue");
                            String idIN = idInput.getText();
                            if (bsb.clientCheck(idIN)) {
                                bsb.setActiveWorker(idIN);           //  Check actual string input from text box here
                                System.out.println("Active worker set for Pasta Bank");
                                primaryStage.getScene().setRoot( gridBankContinued );
                                //        primaryStage.setScene(new Scene(grid, 300, 250));

                                worker current = bsb.getActiveWorker();

                                sceneBankContinuedTitle.setText(current.getName());
                                paid1.setText(Float.toString(current.getExpectedPay()) );
                                id1.setText(Integer.toString(current.getAge()));



                                primaryStage.show();
                            } else {
                                idInput.clear();
                            }

                            //System.out.println("Active worker set for Pasta Bank");



                        }
                    });
                
                    // ---------- END Main Menu Bank Button Action ------------- //
                    // ---------- Bank Menu 1 Back Button ----------------------//
                    btnBankBack.setOnAction(new EventHandler<ActionEvent>() {
                    
                        @Override
                        public void handle(ActionEvent event) {
                            System.out.println("PressedBack");
                        
                            primaryStage.getScene().setRoot( gridMainMenu );
            //        primaryStage.setScene(new Scene(grid, 300, 250));
                            primaryStage.show();
                        }
                    });
                    // ---------- END Bank Menu 1 Back Button ----------------------//
                    
                    // ---------- Main Menu Go to Bank Menu Button Action ------------- //
                
                    btnMenuBank.setOnAction(new EventHandler<ActionEvent>() {
                    
                        @Override
                        public void handle(ActionEvent event) {
                            System.out.println("Pressed");
                        
                            primaryStage.getScene().setRoot( gridBankMain );
            //        primaryStage.setScene(new Scene(grid, 300, 250));
                            primaryStage.show();
                        }
                    });
                    // --------- END Main Menu Go to Bank Menu Button Action ------------ //
    
                    // ---------- Bank Continued Menu BACK Button Action ------------- //
    
                    btnBankContinuedBack.setOnAction(new EventHandler<ActionEvent>() {
                    
                        @Override
                        public void handle(ActionEvent event) {
                            System.out.println("Pressedd");


                            primaryStage.getScene().setRoot( gridBankMain );
                            //        primaryStage.setScene(new Scene(grid, 300, 250));
                            primaryStage.show();
                        }
                    });
                    // --------- END Bank Continued Menu BACK Button Action ------------ //

                    // ---------- Bank Add Worker Button Action ------------- //

                    btnBankAddWorker.setOnAction(new EventHandler<ActionEvent>() {

                        @Override
                        public void handle(ActionEvent event) {
                            System.out.println("Pressedd");


                            primaryStage.getScene().setRoot( gridBankMainAddWorker );
                            //        primaryStage.setScene(new Scene(grid, 300, 250));
                            primaryStage.show();
                        }
                    });
                    // --------- END Bank Add Worker Button Action ------------ //

                    // ---------- SUPPLIER ADD WORKER BUTTON ACTION ----------- //
                    btnSupplierOption1.setOnAction(new EventHandler<ActionEvent>() {
                        @Override
                        public void handle(ActionEvent event) {
                            primaryStage.getScene().setRoot( gridBankMainAddWorker );
                            //        primaryStage.setScene(new Scene(grid, 300, 250));
                            primaryStage.show();
                        }
                    });

                    // ---------- END SUPPLIER ADD WORKER BUTTON ACTION --------- //

                    // ---------- Bank Add Worker Back Button ------------- //

                    btnBankAddWorkerBack.setOnAction(new EventHandler<ActionEvent>() {

                        @Override
                        public void handle(ActionEvent event) {
                            System.out.println("Pressedd");


                            primaryStage.getScene().setRoot( gridBankMain );
                            //        primaryStage.setScene(new Scene(grid, 300, 250));
                            primaryStage.show();
                        }
                    });
                    // --------- END Bank Add Worker Back Button Action ------------ //

                    // ---------- Bank Add Worker Submit Button ------------- //

                   btnBankAddWorkerSubmit.setOnAction(new EventHandler<ActionEvent>() {

                        @Override
                        public void handle(ActionEvent event) {
                           System.out.println("Pressedd");


                           bsb.addClient(idAdd.getText());


                           primaryStage.getScene().setRoot( gridMainMenu );
                            //        primaryStage.setScene(new Scene(grid, 300, 250));
                            primaryStage.show();
                        }
                    });
                    // --------- END Bank Add Worker Submit Button Action ------------ //
    
                    // ---------- Bank Submit Button Action ---------- //
                    btnBankSumbit.setOnAction(new EventHandler<ActionEvent>() {
                    
                        @Override
                        public void handle(ActionEvent event) {
                            System.out.println("Presseddd");
                            //if (s2.hasWorker("7")) System.out.println("Good so far");
                            //if (bsb.clientCheck("7")) System.out.println("aaaaaaaaa");


                            primaryStage.getScene().setRoot( gridBankMain );

                            bsb.validateWorker(cb1.isSelected(), cb2.isSelected(), cb3.isSelected());
                            /*
                                   CODE TO
                                   ENTER CHOICES
                                   TO THE DATABASE
                             */
                            System.out.println(bsb.getActiveWorker().overallVerity());
                            primaryStage.show();
                        }
                    });
                    // --------- END Bank Submit Button Action ------------ //

        // ---------- Suppliers: Click to Search Button Action ---------- //
        btnMenuSupplier.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                System.out.println("Pressed");

                primaryStage.getScene().setRoot( gridSupplier );
                                                    /*
                                                           CODE TO
                                                           ENTER CHOICES
                                                           TO THE DATABASE
                                                     */
                primaryStage.show();
            }
        });
        // --------- END Suppliers: Click to Search Button Action ------------ //
        // --------- Supplies: Click to Add Button Action -------------------- //
        btnSupplierOption1.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Pressedd");
                primaryStage.getScene().setRoot( gridWorker );
                primaryStage.show();
            }
        });
        // --------- END Supplies: Click to Add Button Action --------------- //


        // ---------- Supplier Button to Search Workers ---------- //
        btnSupplierOption2.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                System.out.println("Pressed");

                primaryStage.getScene().setRoot( gridSupplierSearch );
                                        /*
                                               CODE TO
                                               ENTER CHOICES
                                               TO THE DATABASE
                                         */
                primaryStage.show();
            }
        });
        // --------- END Supplier Buttono to Search Workers ------------ //

        // ---------- Supplier Search Back Button ---------- //
        btnSupplierSearchBack.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                System.out.println("Pressed");

                primaryStage.getScene().setRoot( gridSupplier );
                                                    /*
                                                           CODE TO
                                                           ENTER CHOICES
                                                           TO THE DATABASE
                                                     */
                primaryStage.show();
            }
        });
        // --------- END Supplier Search Back Button ------------ //



        // ---------- Supplier Search Back Button ---------- //
        btnSupplierBack.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                System.out.println("Pressed");

                primaryStage.getScene().setRoot( gridMainMenu );
                                                                /*
                                                                       CODE TO
                                                                       ENTER CHOICES
                                                                       TO THE DATABASE
                                                                 */
                primaryStage.show();
            }
        });
        // --------- END Supplier Search Back Button ------------ //

        // ---------- Supplier Submit Button ---------- //
        btnSubmitWorker.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                System.out.println("Pressed");

                s2.addWorker(nameField.getText(), Integer.parseInt(birthdayField.getText()), Float.valueOf(payField.getText()), accountField.getText());
                s2.getWorker(accountField.getText()).setMonthlyHours(Integer.parseInt(hoursField.getText()));

                primaryStage.getScene().setRoot( gridMainMenu );
                                /*
                                       CODE TO
                                       ENTER CHOICES
                                       TO THE DATABASE
                                 */
                primaryStage.show();
            }
        });
        // --------- END Supplier Submit Button ------------ //

        // --------- Supplier Cancel button ---------------- //
        btnCancelWorker.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Pressedd");
                primaryStage.getScene().setRoot( gridSupplier );
                primaryStage.show();
            }
        });
        // --------- END Supplier Cancel button -------------- //

        // ---------- Parent Company Main Button ---------- //
        btnMenuParent.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                System.out.println("Pressed");

                primaryStage.getScene().setRoot( gridParent );
                                            /*
                                                   CODE TO
                                                   ENTER CHOICES
                                                   TO THE DATABASE
                                             */
                primaryStage.show();
            }
        });
        // --------- END Parent Company Main Button ------------ //

        // ---------- Parent Company Back  Button ---------- //
        btnParentBack.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                System.out.println("Pressed");

                primaryStage.getScene().setRoot( gridMainMenu );
                                                        /*
                                                               CODE TO
                                                               ENTER CHOICES
                                                               TO THE DATABASE
                                                         */
                primaryStage.show();
            }
        });
        // --------- END Parent Company Back  Button ------------ //




        // --------- Prepare for display --------- //
    
        Scene sceneMenu = new Scene (gridMainMenu, 640,480);
        primaryStage.setScene(sceneMenu);
        primaryStage.show();
        
//        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
//        primaryStage.setTitle("Hello World");
//        primaryStage.setScene(new Scene(root, 300, 275));
//        primaryStage.show();
        
        // ----------------
        
    }
    

    

//        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
//        primaryStage.setTitle("Hello World");
//        primaryStage.setScene(new Scene(root, 300, 275));
//        primaryStage.show();
    


    public static void main(String[] args) {
        launch(args);
    }
}
