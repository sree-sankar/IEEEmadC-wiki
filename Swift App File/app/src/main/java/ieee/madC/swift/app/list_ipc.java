package ieee.madC.swift.app;

public class list_ipc {

    String name;
    String keyword;
    String description;


    public list_ipc(String name, String keyword, String description) {
        this.name = name;
        this.keyword=keyword;
        this.description=description;

    }

    public list_ipc() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }


}
