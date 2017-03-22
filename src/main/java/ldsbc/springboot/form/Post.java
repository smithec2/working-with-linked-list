package ldsbc.springboot.form;

import org.hibernate.validator.constraints.NotEmpty;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class Post {
	
	private String result;

	String textIn = "What lies behind us and what lies before us are tiny matters compared to what lies within us.";
  
  public String getResult() {
    return result;
  }
  
  public void setResult(String result) {
    this.result = result;
  }
  
  public String getTextIn() {
    return textIn;
  }
  
  public void setTextIn(String textIn) {
    this.textIn = textIn;
  }
}
