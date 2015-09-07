package rt.mitacho.licensing.model;

public enum Role {

	USER("USER"), 
	DBA("DBA"),
	ADMIN("ADMIN");

	private String role;

	private Role(final String role) {
		this.role = role;
	}

	@Override
	public String toString() {
		return this.role;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

}
