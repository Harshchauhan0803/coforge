package coforge.com.model;

import lombok.Data;
import org.hibernate.validator.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Data

public class Customer {

  @NotNull (message="id is null")
  private Integer id;

  @NotEmpty(message="name is empty")
  private String name;

  @NotNull (message="salary is empty")
  private Float salary;
  
  @NotNull (message="password is empty")
  private String pass;
  
  @NotNull (message="gender is empty")
  private String gender[];
  
  @NotNull (message="hobbies is empty")
  private String hobbies[];
  
  @NotNull (message="city is empty")
  private String cities[];
}












