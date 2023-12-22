package SystemParts;

import Enums.OrderType;

import java.util.Objects;

public class EmployeeOrder extends Order{
    private boolean signed;

    public void setSigned(boolean signed) {
        this.signed = signed;
    }

    public boolean isSigned() {
        return signed;
    }

    public EmployeeOrder() {

    }

    public EmployeeOrder(String title, String content,String idFrom, OrderType orderType) {
        super(title, content, idFrom, orderType);
        this.signed = false;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        EmployeeOrder that = (EmployeeOrder) o;
        return signed == that.signed;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), signed);
    }

    @Override
    public String toString() {
        return super.toString() +
                "EmployeeOrder{" +
                "signed=" + signed +
                '}';
    }
}
