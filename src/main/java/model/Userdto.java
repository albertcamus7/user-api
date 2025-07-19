package model;
import jakarta.validation.constraints.*;

public class Userdto {
    private Integer id;

    @NotBlank(message = "Name is required")
    private String name;

    @Email(message = "Email format is invalid")
    private String email;

    // Getters and Setters
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}



