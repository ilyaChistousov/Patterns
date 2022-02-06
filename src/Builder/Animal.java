package Builder;

public class Animal {

    private String head;
    private String body;
    private String tail;

    public void setHead(String head) {
        this.head = head;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public void setTail(String tail) {
        this.tail = tail;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "head='" + head + '\'' +
                ", body='" + body + '\'' +
                ", tail='" + tail + '\'' +
                '}';
    }
}
