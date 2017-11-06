package intermediate._2Nullability;

import org.jetbrains.annotations.Nullable;

import java.util.ArrayList;
import java.util.List;

public class JavaTypes {
    static List<Boolean> getAList() {
        ArrayList<Boolean> list = new ArrayList<Boolean>();
        list.add(true);
        list.add(false);

        return list;
    }

    static List<Boolean> dangerousList() {
        return null;
    }
}
