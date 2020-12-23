package ContactApp;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class ContactAppController {

        @FXML private ListView<Person> booksListView;
    @FXML
    private ImageView personImage;


    @FXML
    private TextField nameTextField;

    @FXML
    private TextField lastNameTextField;

    @FXML
    private TextField emailTextField;

    @FXML
    private TextField phoneNumberTextField;

    @FXML
    private Button updateButton;

    @FXML
    private Button deleteButton;
    @FXML
    private Button addButton;
    @FXML
    private TextField imagePathTextField;





    private final ObservableList<Person> info = FXCollections.observableArrayList();



    public void initialize(){
        info.add(new Person("James", "Davis", "nn@gmail.com", "12345", "ContactApp/images/im1.png"));
        info.add(new Person("Luke", "Lewis", "ll@gmail.com", "123456", "ContactApp/images/im2.png"));
        info.add(new Person("Dvid", "Bold", "mm@gmail.com", "123457", "ContactApp/images/im3.jpeg"));
        info.add(new Person("David", "Bold2", "nk@gmail.com", "1234578", "ContactApp/images/im4.jpeg"));
        info.add(new Person("James young", "Brown", "na@gmail.com", "123459", "ContactApp/images/im5.jpeg"));
        info.add(new Person("Kate", "Red", "pp@gmail.com", "1234556", "ContactApp/images/im1.png"));

        booksListView.setItems(info);

        booksListView.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<Person>() {

            @Override
            public void changed(ObservableValue<? extends Person> observableValue, Person person, Person t1) {
                nameTextField.setText(t1.getFirstName());
                lastNameTextField.setText(t1.getLastname());
                emailTextField.setText(t1.getEmail());
                phoneNumberTextField.setText(t1.getPhoneNumber());
                personImage.setImage(new Image(t1.getImageView()));
            }
        });
        }
    @FXML
    void deleteContact(ActionEvent event) {
        Person person =new Person(nameTextField.getText(), lastNameTextField.getText(), emailTextField.getText(),
                phoneNumberTextField.getText(), imagePathTextField.getText());
        info.removeIf(i->i.getFirstName().equals(person.getFirstName()) && i.getLastname().equals(person.getLastname()) && i.getEmail().equals(person.getEmail()) && i.getPhoneNumber().equals(person.getPhoneNumber()));
        booksListView.setItems(info);

    }

    @FXML
    void updateInfo(ActionEvent event) {
        Person p =new Person(nameTextField.getText(), lastNameTextField.getText(), emailTextField.getText(),
                phoneNumberTextField.getText(), imagePathTextField.getText());
        info.removeIf(i->i.getFirstName().equals(p.getFirstName()) || i.getLastname().equals(p.getLastname()) && i.getEmail().equals(p.getEmail()) && i.getPhoneNumber().equals(p.getPhoneNumber()));
        info.add(p);

        booksListView.setItems(info);



    }
    @FXML
    void addContact(ActionEvent event) {
        //Person person =new Person(nameTextField.getText(), lastNameTextField.getText(), emailTextField.getText(),
         //       phoneNumberTextField.getText());
//        String a =nameTextField.getText();
//        String b =lastNameTextField.getText();
//        String c =emailTextField.getText();
//        String d =phoneNumberTextField.getText();
//        info.add(new Person(a,b,c,d));
//        booksListView.setItems(info);
        info.add(new Person(nameTextField.getText(), lastNameTextField.getText(), emailTextField.getText(),
                phoneNumberTextField.getText(), imagePathTextField.getText()));
        booksListView.setItems(info);

    }
    }

