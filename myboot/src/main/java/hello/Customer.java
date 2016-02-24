package hello;

import javax.validation.constraints.Size;

/**
 * Created by huangzheng on 2016/1/17.
 */
public class Customer {
    @Size
    private long id;
    private String firstName,lastName;

    @Override
    public String toString() {
        return String.format( "Customer[id=%d,firstName=%s,lastName=%s]",
                id,firstName,lastName
                );
    }

    public Customer(long id, String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public long getId() {

        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
