public class Course1 {

    private String name;
    private int number;
    private int id;
    private long _id;

    public Course1() {//دالة بنائية

    }

    public Course1(String name, int number, int id) { //دالة بنائية
        this.name = name;
        this.number = number;
        this.id = id;
    }

    public Course1(String name, int number, int id, long _id) {//دالة بنائية
        this.name = name;
        this.id = id;
        this.number = number;
        this._id = _id;
    }

    public String getName() {
        return name;
    }

    public int getNumber() {
        return number;
    }

    public int getId() {
        return id;
    }

    public long get_id() {
        return _id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNumber(int number)
    {
        this.number = number;
    }


    public void setId(int id) {
        this.id = id;
    }

    public void set_id(long _id) {
        this._id = _id;
    }

    @Override
    public String toString() {
        return "Course1{" +
                "name='" + name + '\'' +
                ", number=" + number +
                ", id=" + id +
                ", _id=" + _id +
                '}';
    }
}