package person.lhh.test.lineartable.linklist.bean;

public class Point {
    private Integer data;
    private Point prior;
    private Point next;

    public Integer getData() {
        return data;
    }

    public void setData(Integer data) {
        this.data = data;
    }

    public Point getPrior() {
        return prior;
    }

    public void setPrior(Point prior) {
        this.prior = prior;
    }

    public Point getNext() {
        return next;
    }

    public void setNext(Point next) {
        this.next = next;
    }
}
