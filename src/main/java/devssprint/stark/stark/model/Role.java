package devssprint.stark.stark.model;

public enum Role {
    USER("USER"),
    ADMIN("ADMIN"),
    MODERATOR("MODERATOR");
    private final String role;
    Role(String role){
        this.role = role;
    }

    public String getRole() {
        return role;
    }
}
