package domainmodel;

public class Door {

    private boolean closed;

    public void lock() {
        this.closed = true;
    }

    public void open() {
        this.closed = false;
    }

    public boolean isClosed() {
        return closed;
    }
}
