package br.com.snackbar;

public enum OrderType {

	DEFAULT("default"), CUSTOM("custom");

	private String type;

	private OrderType(String type) {
		this.setType(type);
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

}
