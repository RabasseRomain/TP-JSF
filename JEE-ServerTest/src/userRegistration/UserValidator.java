package userRegistration;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.component.UIInput;
import javax.faces.context.FacesContext;
import javax.faces.validator.FacesValidator;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;

@FacesValidator
public class UserValidator implements Validator {
	
	String stringValue = null;

	@Override
	public void validate(FacesContext fC, UIComponent uiC, Object value) throws ValidatorException {
		
		stringValue = (String) value;
		
		// 4 Inputs to Check
		switch(uiC.getId()) {
		case "firstName":
			if(stringValue.length() < 2) {
				throw new ValidatorException(new FacesMessage("It's Too Short!"));
			}
		break;
		case "lastName":
			if(stringValue.length() < 2) {
				throw new ValidatorException(new FacesMessage("It's Too Short!"));
			}
			// Get value from the f:attibute
			UIInput uiFirstName = (UIInput) uiC.getAttributes().get("firstNameSave");
			if(uiFirstName.getValue().equals(stringValue)) {
				throw new ValidatorException(new FacesMessage("First And Last Name Must Be Different!"));
			}
		break;
		case "eMail":

		break;
		case "password":

		break;
		default:
			
		break;
		}

		
//		if (valueIsInvalid) {
//            
        
	}

}
 