package com.twcts.mvvm.databinding;
import com.twcts.mvvm.R;
import com.twcts.mvvm.BR;
import android.view.View;
public class ActivityFormBinding extends android.databinding.ViewDataBinding  {

    private static final android.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.textView4, 6);
        sViewsWithIds.put(R.id.textView1, 7);
        sViewsWithIds.put(R.id.textView, 8);
        sViewsWithIds.put(R.id.textView2, 9);
        sViewsWithIds.put(R.id.textView3, 10);
    }
    // views
    private final android.widget.LinearLayout mboundView0;
    private final android.widget.EditText mboundView1;
    private final android.widget.EditText mboundView2;
    private final android.widget.EditText mboundView3;
    private final android.widget.EditText mboundView4;
    private final android.widget.Button mboundView5;
    public final android.widget.TextView textView;
    public final android.widget.TextView textView1;
    public final android.widget.TextView textView2;
    public final android.widget.TextView textView3;
    public final android.widget.TextView textView4;
    // variables
    private com.twcts.handler.FormHandler mFormHandler;
    private com.twcts.ViewModel.FormViewModel mForm;
    // values
    // listeners
    private OnClickListenerImpl mAndroidViewViewOnCl;
    // Inverse Binding Event Handlers

    public ActivityFormBinding(android.databinding.DataBindingComponent bindingComponent, View root) {
        super(bindingComponent, root, 1);
        final Object[] bindings = mapBindings(bindingComponent, root, 11, sIncludes, sViewsWithIds);
        this.mboundView0 = (android.widget.LinearLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView1 = (android.widget.EditText) bindings[1];
        this.mboundView1.setTag(null);
        this.mboundView2 = (android.widget.EditText) bindings[2];
        this.mboundView2.setTag(null);
        this.mboundView3 = (android.widget.EditText) bindings[3];
        this.mboundView3.setTag(null);
        this.mboundView4 = (android.widget.EditText) bindings[4];
        this.mboundView4.setTag(null);
        this.mboundView5 = (android.widget.Button) bindings[5];
        this.mboundView5.setTag(null);
        this.textView = (android.widget.TextView) bindings[8];
        this.textView1 = (android.widget.TextView) bindings[7];
        this.textView2 = (android.widget.TextView) bindings[9];
        this.textView3 = (android.widget.TextView) bindings[10];
        this.textView4 = (android.widget.TextView) bindings[6];
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x200L;
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
            case BR.formHandler :
                setFormHandler((com.twcts.handler.FormHandler) variable);
                return true;
            case BR.form :
                setForm((com.twcts.ViewModel.FormViewModel) variable);
                return true;
        }
        return false;
    }

    public void setFormHandler(com.twcts.handler.FormHandler formHandler) {
        this.mFormHandler = formHandler;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.formHandler);
        super.requestRebind();
    }
    public com.twcts.handler.FormHandler getFormHandler() {
        return mFormHandler;
    }
    public void setForm(com.twcts.ViewModel.FormViewModel form) {
        updateRegistration(0, form);
        this.mForm = form;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.form);
        super.requestRebind();
    }
    public com.twcts.ViewModel.FormViewModel getForm() {
        return mForm;
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeForm((com.twcts.ViewModel.FormViewModel) object, fieldId);
        }
        return false;
    }
    private boolean onChangeForm(com.twcts.ViewModel.FormViewModel form, int fieldId) {
        switch (fieldId) {
            case BR.name: {
                synchronized(this) {
                        mDirtyFlags |= 0x4L;
                }
                return true;
            }
            case BR.nameError: {
                synchronized(this) {
                        mDirtyFlags |= 0x8L;
                }
                return true;
            }
            case BR.id: {
                synchronized(this) {
                        mDirtyFlags |= 0x10L;
                }
                return true;
            }
            case BR.idError: {
                synchronized(this) {
                        mDirtyFlags |= 0x20L;
                }
                return true;
            }
            case BR.password: {
                synchronized(this) {
                        mDirtyFlags |= 0x40L;
                }
                return true;
            }
            case BR.passwordError: {
                synchronized(this) {
                        mDirtyFlags |= 0x80L;
                }
                return true;
            }
            case BR.age: {
                synchronized(this) {
                        mDirtyFlags |= 0x100L;
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
        java.lang.String passwordForm = null;
        java.lang.String nameForm = null;
        android.view.View.OnClickListener androidViewViewOnCli = null;
        android.view.View.OnFocusChangeListener idFocusChangeListene = null;
        android.view.View.OnFocusChangeListener nameFocusChangeListe = null;
        java.lang.String passwordErrorForm = null;
        android.text.TextWatcher passwordWatcherForm = null;
        com.twcts.handler.FormHandler formHandler = mFormHandler;
        android.view.View.OnFocusChangeListener passwordFocusChangeL = null;
        java.lang.String idErrorForm = null;
        android.text.TextWatcher idWatcherForm = null;
        java.lang.String ageForm = null;
        java.lang.String nameErrorForm = null;
        java.lang.String idForm = null;
        com.twcts.ViewModel.FormViewModel form = mForm;
        android.text.TextWatcher nameWatcherForm = null;

        if ((dirtyFlags & 0x202L) != 0) {



                if (formHandler != null) {
                    // read formHandler::addNewOne
                    androidViewViewOnCli = (((mAndroidViewViewOnCl == null) ? (mAndroidViewViewOnCl = new OnClickListenerImpl()) : mAndroidViewViewOnCl).setValue(formHandler));
                }
        }
        if ((dirtyFlags & 0x3fdL) != 0) {


            if ((dirtyFlags & 0x241L) != 0) {

                    if (form != null) {
                        // read form.password
                        passwordForm = form.getPassword();
                    }
            }
            if ((dirtyFlags & 0x205L) != 0) {

                    if (form != null) {
                        // read form.name
                        nameForm = form.getName();
                    }
            }
            if ((dirtyFlags & 0x201L) != 0) {

                    if (form != null) {
                        // read form.idFocusChangeListener
                        idFocusChangeListene = form.idFocusChangeListener();
                        // read form.nameFocusChangeListener
                        nameFocusChangeListe = form.nameFocusChangeListener();
                        // read form.passwordWatcher
                        passwordWatcherForm = form.passwordWatcher();
                        // read form.passwordFocusChangeListener
                        passwordFocusChangeL = form.passwordFocusChangeListener();
                        // read form.idWatcher
                        idWatcherForm = form.idWatcher();
                        // read form.nameWatcher
                        nameWatcherForm = form.nameWatcher();
                    }
            }
            if ((dirtyFlags & 0x281L) != 0) {

                    if (form != null) {
                        // read form.passwordError
                        passwordErrorForm = form.getPasswordError();
                    }
            }
            if ((dirtyFlags & 0x221L) != 0) {

                    if (form != null) {
                        // read form.idError
                        idErrorForm = form.getIdError();
                    }
            }
            if ((dirtyFlags & 0x301L) != 0) {

                    if (form != null) {
                        // read form.age
                        ageForm = form.getAge();
                    }
            }
            if ((dirtyFlags & 0x209L) != 0) {

                    if (form != null) {
                        // read form.nameError
                        nameErrorForm = form.getNameError();
                    }
            }
            if ((dirtyFlags & 0x211L) != 0) {

                    if (form != null) {
                        // read form.id
                        idForm = form.getId();
                    }
            }
        }
        // batch finished
        if ((dirtyFlags & 0x205L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView1, nameForm);
        }
        if ((dirtyFlags & 0x209L) != 0) {
            // api target 1

            this.mboundView1.setError(nameErrorForm);
        }
        if ((dirtyFlags & 0x201L) != 0) {
            // api target 1

            this.mboundView1.addTextChangedListener(nameWatcherForm);
            this.mboundView1.setOnFocusChangeListener(nameFocusChangeListe);
            this.mboundView2.addTextChangedListener(idWatcherForm);
            this.mboundView2.setOnFocusChangeListener(idFocusChangeListene);
            this.mboundView3.addTextChangedListener(passwordWatcherForm);
            this.mboundView3.setOnFocusChangeListener(passwordFocusChangeL);
        }
        if ((dirtyFlags & 0x211L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView2, idForm);
        }
        if ((dirtyFlags & 0x221L) != 0) {
            // api target 1

            this.mboundView2.setError(idErrorForm);
        }
        if ((dirtyFlags & 0x241L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView3, passwordForm);
        }
        if ((dirtyFlags & 0x281L) != 0) {
            // api target 1

            this.mboundView3.setError(passwordErrorForm);
        }
        if ((dirtyFlags & 0x301L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView4, ageForm);
        }
        if ((dirtyFlags & 0x202L) != 0) {
            // api target 1

            this.mboundView5.setOnClickListener(androidViewViewOnCli);
        }
    }
    // Listener Stub Implementations
    public static class OnClickListenerImpl implements android.view.View.OnClickListener{
        private com.twcts.handler.FormHandler value;
        public OnClickListenerImpl setValue(com.twcts.handler.FormHandler value) {
            this.value = value;
            return value == null ? null : this;
        }
        @Override
        public void onClick(android.view.View arg0) {
            this.value.addNewOne(arg0);
        }
    }
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;

    public static ActivityFormBinding inflate(android.view.LayoutInflater inflater, android.view.ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    public static ActivityFormBinding inflate(android.view.LayoutInflater inflater, android.view.ViewGroup root, boolean attachToRoot, android.databinding.DataBindingComponent bindingComponent) {
        return android.databinding.DataBindingUtil.<ActivityFormBinding>inflate(inflater, com.twcts.mvvm.R.layout.activity_form, root, attachToRoot, bindingComponent);
    }
    public static ActivityFormBinding inflate(android.view.LayoutInflater inflater) {
        return inflate(inflater, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    public static ActivityFormBinding inflate(android.view.LayoutInflater inflater, android.databinding.DataBindingComponent bindingComponent) {
        return bind(inflater.inflate(com.twcts.mvvm.R.layout.activity_form, null, false), bindingComponent);
    }
    public static ActivityFormBinding bind(android.view.View view) {
        return bind(view, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    public static ActivityFormBinding bind(android.view.View view, android.databinding.DataBindingComponent bindingComponent) {
        if (!"layout/activity_form_0".equals(view.getTag())) {
            throw new RuntimeException("view tag isn't correct on view:" + view.getTag());
        }
        return new ActivityFormBinding(bindingComponent, view);
    }
    /* flag mapping
        flag 0 (0x1L): form
        flag 1 (0x2L): formHandler
        flag 2 (0x3L): form.name
        flag 3 (0x4L): form.nameError
        flag 4 (0x5L): form.id
        flag 5 (0x6L): form.idError
        flag 6 (0x7L): form.password
        flag 7 (0x8L): form.passwordError
        flag 8 (0x9L): form.age
        flag 9 (0xaL): null
    flag mapping end*/
    //end
}