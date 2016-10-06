package converter;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

import dao.AppClassificationDao;
import model.AppClassification;
import model.AuthMethod;

@FacesConverter("appClassificationConverter")
public class AppClassificationConverter implements Converter {

	AppClassificationDao dao = new AppClassificationDao();

	@Override
	public Object getAsObject(FacesContext context, UIComponent component, String value) {
		if (value != null && !value.equals("")) {

			  return (AppClassification) component.getAttributes().get(value);
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
