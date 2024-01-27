package Day4;

public abstract class Department {
    public abstract int getDepartmentSize();
}


class Employees extends Department {
    private int departmentSize;

    public Employees(int departmentSize) {
        this.departmentSize = departmentSize;
    }

    @Override
    public int getDepartmentSize() {
        return departmentSize;
    }
}
