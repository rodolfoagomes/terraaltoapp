package converter;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

import dao.AuthMethodDao;
import model.AuthMethod;

@FacesConverter("authMethodConverter")
public class AuthMethodConverter implements Converter {

	AuthMethodDao dao = new AuthMethodDao();

	@Override
	public Object getAsObject(FacesContext context, UIComponent component, String value) {
		if (value != null && !value.equals("")) {

			  return (AuthMethod) component.getAttributes().get(value);
		}
		return null;
	}

	@Override
	public String getAsString(FacesContext context, UIComponent component, Object value) {
		if (value instanceof AuthMethod) {
			AuthMethod authMethod = (AuthMethod) value;
			return String.valueOf(authMethod.getDescription());
		}
		return "";
	}

}
