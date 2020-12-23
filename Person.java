package ContactApp;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class Person {
   String  firstName;
   String lastname;
   String email;
   String phoneNumber;
   String imageView;

    public Person(String firstName, String lastname, String email, String phoneNumber, String image) {
        this.imageView =image;
        this.firstName = firstName;
        this.lastname = lastname;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public String getImageView() {
        return imageView;
    }

    public void setImageView(String imageView) {
        this.imageView = imageView;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return getFirstName()+" "+getLastname();
    }
}
