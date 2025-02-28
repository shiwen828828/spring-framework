package com.shiwen.propertyEditor;

import java.beans.PropertyEditorSupport;

public class AddressPropertyEditor extends PropertyEditorSupport {
	@Override
	public void setAsText(String text) {
		try {
			String[] adds = text.split("-");
			Address address = new Address();
			address.setProvince(adds[0]);
			address.setCity(adds[1]);
			address.setDistrict(adds[2]);
			this.setValue(address);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}