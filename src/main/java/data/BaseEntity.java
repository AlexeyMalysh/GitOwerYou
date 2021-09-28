package data;

public class BaseEntity {
    private String id;

    @Override
    public String toString() {
        return "BaseEntity{" +
                "id='" + id + '\'' +
                '}';
    }

    public void setId(String id) {
        this.id = id;
    }

    public BaseEntity(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }
}
