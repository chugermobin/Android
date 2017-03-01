
package android.databinding;
import com.twcts.mvvm.BR;
class DataBinderMapper {
    final static int TARGET_MIN_SDK = 21;
    public DataBinderMapper() {
    }
    public android.databinding.ViewDataBinding getDataBinder(android.databinding.DataBindingComponent bindingComponent, android.view.View view, int layoutId) {
        switch(layoutId) {
                case com.twcts.mvvm.R.layout.activity_form:
                    return com.twcts.mvvm.databinding.ActivityFormBinding.bind(view, bindingComponent);
                case com.twcts.mvvm.R.layout.activity_main:
                    return com.twcts.mvvm.databinding.ActivityMainBinding.bind(view, bindingComponent);
        }
        return null;
    }
    android.databinding.ViewDataBinding getDataBinder(android.databinding.DataBindingComponent bindingComponent, android.view.View[] views, int layoutId) {
        switch(layoutId) {
        }
        return null;
    }
    int getLayoutId(String tag) {
        if (tag == null) {
            return 0;
        }
        final int code = tag.hashCode();
        switch(code) {
            case 236545472: {
                if(tag.equals("layout/activity_form_0")) {
                    return com.twcts.mvvm.R.layout.activity_form;
                }
                break;
            }
            case 423753077: {
                if(tag.equals("layout/activity_main_0")) {
                    return com.twcts.mvvm.R.layout.activity_main;
                }
                break;
            }
        }
        return 0;
    }
    String convertBrIdToString(int id) {
        if (id < 0 || id >= InnerBrLookup.sKeys.length) {
            return null;
        }
        return InnerBrLookup.sKeys[id];
    }
    private static class InnerBrLookup {
        static String[] sKeys = new String[]{
            "_all"
            ,"age"
            ,"ageError"
            ,"form"
            ,"formHandler"
            ,"id"
            ,"idError"
            ,"message"
            ,"name"
            ,"nameError"
            ,"password"
            ,"passwordError"
            ,"user"
            ,"userHandler"};
    }
}