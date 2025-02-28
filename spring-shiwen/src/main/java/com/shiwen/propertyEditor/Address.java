package com.shiwen.propertyEditor;

class Address {
	private String district;
	private String city;
	private String province;

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getProvince() {
		return province;
	}

	public void setProvince(String province) {
		this.province = province;
	}

	public String toString() {
		return this.province + "省" + this.city + "市" + this.district + "区";
	}
}