import java.util.ArrayList;
import java.util.List;

public class Document {
    private List<String> nameDoc = new ArrayList<>();
    private List<String> phoneNumber = new ArrayList<>();
    private List<String> email = new ArrayList<>();

    public Document(List<String> nameDoc, List<String> phoneNumber, List<String> email) {
        this.nameDoc = nameDoc;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public Document() {
    }


    public void addNameDoc(String str) {
        nameDoc.add(str);
    }

    public void addPhoneNumb(String str) {
        phoneNumber.add(str);
    }

    public void addEmail(String str) {
        email.add(str);
    }


    public List<String> getNameDoc() {
        return nameDoc;
    }

    public List<String> getPhoneNumber() {
        return phoneNumber;
    }

    public List<String> getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return "Document: " +
                "nameDoc= " + nameDoc +
                ", phoneNumber= " + phoneNumber +
                ", email= " + email;
    }
}
