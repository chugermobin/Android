package com.twcts.mvvm.databinding;
import com.twcts.mvvm.R;
import com.twcts.mvvm.BR;
import android.view.View;
public class ActivityMainBinding extends android.databinding.ViewDataBinding  {

    private static final android.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.textView, 5);
        sViewsWithIds.put(R.id.textView2, 6);
    }
    // views
    public final android.widget.Button btnLogin;
    public final android.widget.Button button;
    private final android.widget.LinearLayout mboundView0;
    private final android.widget.EditText mboundView1;
    private final android.widget.EditText mboundView2;
    public final android.widget.TextView textView;
    public final android.widget.TextView textView2;
    // variables
    private com.twcts.handler.UserHandler mUserHandler;
    private com.twcts.ViewModel.UserViewModel mUser;
    // values
    // listeners
    private OnClickListenerImpl mAndroidViewViewOnCl;
    private OnClickListenerImpl1 mAndroidViewViewOnCl1;
    // Inverse Binding Event Handlers
    private android.databinding.InverseBindingListener mboundView1androidTe = new android.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of user.id
            //         is user.setId((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = android.databinding.adapters.TextViewBindingAdapter.getTextString(mboundView1);
            // localize variables for thread safety
            // user
            com.twcts.ViewModel.UserViewModel user = mUser;
            // user.id
            java.lang.String idUser = null;
            // user != null
            boolean userObjectnull = false;



            userObjectnull = (user) != (null);
            if (userObjectnull) {




                user.setId((java.lang.String) (callbackArg_0));
            }
        }
    };
    private android.databinding.InverseBindingListener mboundView2androidTe = new android.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of user.password
            //         is user.setPassword((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = android.databinding.adapters.TextViewBindingAdapter.getTextString(mboundView2);
            // localize variables for thread safety
            // user
            com.twcts.ViewModel.UserViewModel user = mUser;
            // user.password
            java.lang.String passwordUser = null;
            // user != null
            boolean userObjectnull = false;



            userObjectnull = (user) != (null);
            if (userObjectnull) {




                user.setPassword((java.lang.String) (callbackArg_0));
            }
        }
    };

    public ActivityMainBinding(android.databinding.DataBindingComponent bindingComponent, View root) {
        super(bindingComponent, root, 1);
        final Object[] bindings = mapBindings(bindingComponent, root, 7, sIncludes, sViewsWithIds);
        this.btnLogin = (android.widget.Button) bindings[3];
        this.btnLogin.setTag(null);
        this.button = (android.widget.Button) bindings[4];
        this.button.setTag(null);
        this.mboundView0 = (android.widget.LinearLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView1 = (android.widget.EditText) bindings[1];
        this.mboundView1.setTag(null);
        this.mboundView2 = (android.widget.EditText) bindings[2];
        this.mboundView2.setTag(null);
        this.textView = (android.widget.TextView) bindings[5];
        this.textView2 = (android.widget.TextView) bindings[6];
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x10L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    public boolean setVariable(int variableId, Object variable) {
        switch(variableId) {
            case BR.userHandler :
                setUserHandler((com.twcts.handler.UserHandler) variable);
                return true;
            case BR.user :
                setUser((com.twcts.ViewModel.UserViewModel) variable);
                return true;
        }
        return false;
    }

    public void setUserHandler(com.twcts.handler.UserHandler userHandler) {
        this.mUserHandler = userHandler;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.userHandler);
        super.requestRebind();
    }
    public com.twcts.handler.UserHandler getUserHandler() {
        return mUserHandler;
    }
    public void setUser(com.twcts.ViewModel.UserViewModel user) {
        updateRegistration(0, user);
        this.mUser = user;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.user);
        super.requestRebind();
    }
    public com.twcts.ViewModel.UserViewModel getUser() {
        return mUser;
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeUser((com.twcts.ViewModel.UserViewModel) object, fieldId);
        }
        return false;
    }
    private boolean onChangeUser(com.twcts.ViewModel.UserViewModel user, int fieldId) {
        switch (fieldId) {
            case BR.id: {
                synchronized(this) {
                        mDirtyFlags |= 0x4L;
                }
                return true;
            }
            case BR.password: {
                synchronized(this) {
                        mDirtyFlags |= 0x8L;
                }
                return true;
            }
            case BR._all: {
                synchronized(this) {
                        mDirtyFlags |= 0x1L;
                }
                return true;
            }
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        com.twcts.handler.UserHandler userHandler = mUserHandler;
        java.lang.String passwordUser = null;
        android.view.View.OnClickListener androidViewViewOnCli = null;
        java.lang.String idUser = null;
        com.twcts.ViewModel.UserViewModel user = mUser;
        android.view.View.OnClickListener androidViewViewOnCli1 = null;

        if ((dirtyFlags & 0x12L) != 0) {



                if (userHandler != null) {
                    // read userHandler::onClickLogin
                    androidViewViewOnCli = (((mAndroidViewViewOnCl == null) ? (mAndroidViewViewOnCl = new OnClickListenerImpl()) : mAndroidViewViewOnCl).setValue(userHandler));
                    // read userHandler::onClickRegister
                    androidViewViewOnCli1 = (((mAndroidViewViewOnCl1 == null) ? (mAndroidViewViewOnCl1 = new OnClickListenerImpl1()) : mAndroidViewViewOnCl1).setValue(userHandler));
                }
        }
        if ((dirtyFlags & 0x1dL) != 0) {


            if ((dirtyFlags & 0x19L) != 0) {

                    if (user != null) {
                        // read user.password
                        passwordUser = user.getPassword();
                    }
            }
            if ((dirtyFlags & 0x15L) != 0) {

                    if (user != null) {
                        // read user.id
                        idUser = user.getId();
                    }
            }
        }
        // batch finished
        if ((dirtyFlags & 0x12L) != 0) {
            // api target 1

            this.btnLogin.setOnClickListener(androidViewViewOnCli);
            this.button.setOnClickListener(androidViewViewOnCli1);
        }
        if ((dirtyFlags & 0x15L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView1, idUser);
        }
        if ((dirtyFlags & 0x10L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.mboundView1, (android.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (android.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (android.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, mboundView1androidTe);
            android.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.mboundView2, (android.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (android.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (android.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, mboundView2androidTe);
        }
        if ((dirtyFlags & 0x19L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView2, passwordUser);
        }
    }
    // Listener Stub Implementations
    public static class OnClickListenerImpl implements android.view.View.OnClickListener{
        private com.twcts.handler.UserHandler value;
        public OnClickListenerImpl setValue(com.twcts.handler.UserHandler value) {
            this.value = value;
            return value == null ? null : this;
        }
        @Override
        public void onClick(android.view.View arg0) {
            this.value.onClickLogin(arg0);
        }
    }
    public static class OnClickListenerImpl1 implements android.view.View.OnClickListener{
        private com.twcts.handler.UserHandler value;
        public OnClickListenerImpl1 setValue(com.twcts.handler.UserHandler value) {
            this.value = value;
            return value == null ? null : this;
        }
        @Override
        public void onClick(android.view.View arg0) {
            this.value.onClickRegister(arg0);
        }
    }
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;

    public static ActivityMainBinding inflate(android.view.LayoutInflater inflater, android.view.ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    public static ActivityMainBinding inflate(android.view.LayoutInflater inflater, android.view.ViewGroup root, boolean attachToRoot, android.databinding.DataBindingComponent bindingComponent) {
        return android.databinding.DataBindingUtil.<ActivityMainBinding>inflate(inflater, com.twcts.mvvm.R.layout.activity_main, root, attachToRoot, bindingComponent);
    }
    public static ActivityMainBinding inflate(android.view.LayoutInflater inflater) {
        return inflate(inflater, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    public static ActivityMainBinding inflate(android.view.LayoutInflater inflater, android.databinding.DataBindingComponent bindingComponent) {
        return bind(inflater.inflate(com.twcts.mvvm.R.layout.activity_main, null, false), bindingComponent);
    }
    public static ActivityMainBinding bind(android.view.View view) {
        return bind(view, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    public static ActivityMainBinding bind(android.view.View view, android.databinding.DataBindingComponent bindingComponent) {
        if (!"layout/activity_main_0".equals(view.getTag())) {
            throw new RuntimeException("view tag isn't correct on view:" + view.getTag());
        }
        return new ActivityMainBinding(bindingComponent, view);
    }
    /* flag mapping
        flag 0 (0x1L): user
        flag 1 (0x2L): userHandler
        flag 2 (0x3L): user.id
        flag 3 (0x4L): user.password
        flag 4 (0x5L): null
    flag mapping end*/
    //end
}