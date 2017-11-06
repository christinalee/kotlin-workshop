package intermediate._1Types;


/**
 * You can see the Kotlin version of this class in {@link KotlinUnit}
 */
public class _3JavaVoid {
    private void one() {

    }

    private int two() {
       return 2;
    }

    private String three() {
        return "three";
    }

    public WrappedResult<?> getWrappedResult() {
        int randomInt = (int) (Math.random() * 3);

        WrappedResult<?> myResult;
        switch(randomInt) {
            // TODO: make this case compile
//            case 1:
//                myResult = new WrappedResult(one());
//                break;

            case 2:
                myResult = new WrappedResult<Integer>(two());
                break;

            default:
                myResult = new WrappedResult<String>(three());
                break;
        }

        return myResult;
    }
}
