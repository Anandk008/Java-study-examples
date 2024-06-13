package ContractEqualHashcode;

import java.util.Objects;

class Demo {
    int var = 1;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Demo demo = (Demo) o;
        return var == demo.var;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(var);
    }
}

public class EqualHashcode {

    public static void main(String[] args) {
        Demo d1 = new Demo();
        Demo d2 = new Demo();

        System.out.println(d1.equals(d2));
    }
}
