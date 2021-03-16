import java.util.List;

public class Root {
    private String name;
    private List<MyFiles> files;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<MyFiles> getFiles() {
        return files;
    }

    public void setFiles(List<MyFiles> files) {
        this.files = files;
    }

    @Override
    public String toString() {
        return "Root{" +
                "name='" + name + '\'' +
                ", people=" + files +
                '}';
    }
}
