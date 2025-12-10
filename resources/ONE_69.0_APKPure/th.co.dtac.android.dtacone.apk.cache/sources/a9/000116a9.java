package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.app_one.widget.OneCustomClearableEditText;
import th.p047co.dtac.android.dtacone.app_one.widget.OneFontButton;
import th.p047co.dtac.android.dtacone.app_one.widget.OneFontTextView;

/* renamed from: th.co.dtac.android.dtacone.databinding.FragmentOnePrepaidChangeOwnerInputDocumentBinding */
/* loaded from: classes7.dex */
public final class FragmentOnePrepaidChangeOwnerInputDocumentBinding implements ViewBinding {

    /* renamed from: a */
    public final FrameLayout f84184a;
    @NonNull
    public final OneFontButton btnOk;
    @NonNull
    public final OneCustomClearableEditText edtName;
    @NonNull
    public final OneCustomClearableEditText edtPersonId;
    @NonNull
    public final OneCustomClearableEditText edtSureName;
    @NonNull
    public final OneFontTextView tvPhoneNumber;
    @NonNull
    public final OneFontTextView tvPhoneNumberRegister;
    @NonNull
    public final OneFontTextView tvTitleEdit;

    public FragmentOnePrepaidChangeOwnerInputDocumentBinding(FrameLayout frameLayout, OneFontButton oneFontButton, OneCustomClearableEditText oneCustomClearableEditText, OneCustomClearableEditText oneCustomClearableEditText2, OneCustomClearableEditText oneCustomClearableEditText3, OneFontTextView oneFontTextView, OneFontTextView oneFontTextView2, OneFontTextView oneFontTextView3) {
        this.f84184a = frameLayout;
        this.btnOk = oneFontButton;
        this.edtName = oneCustomClearableEditText;
        this.edtPersonId = oneCustomClearableEditText2;
        this.edtSureName = oneCustomClearableEditText3;
        this.tvPhoneNumber = oneFontTextView;
        this.tvPhoneNumberRegister = oneFontTextView2;
        this.tvTitleEdit = oneFontTextView3;
    }

    @NonNull
    public static FragmentOnePrepaidChangeOwnerInputDocumentBinding bind(@NonNull View view) {
        int i = R.id.btnOk;
        OneFontButton oneFontButton = (OneFontButton) ViewBindings.findChildViewById(view, i);
        if (oneFontButton != null) {
            i = R.id.edtName;
            OneCustomClearableEditText oneCustomClearableEditText = (OneCustomClearableEditText) ViewBindings.findChildViewById(view, i);
            if (oneCustomClearableEditText != null) {
                i = R.id.edtPersonId;
                OneCustomClearableEditText oneCustomClearableEditText2 = (OneCustomClearableEditText) ViewBindings.findChildViewById(view, i);
                if (oneCustomClearableEditText2 != null) {
                    i = R.id.edtSureName;
                    OneCustomClearableEditText oneCustomClearableEditText3 = (OneCustomClearableEditText) ViewBindings.findChildViewById(view, i);
                    if (oneCustomClearableEditText3 != null) {
                        i = R.id.tvPhoneNumber;
                        OneFontTextView oneFontTextView = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                        if (oneFontTextView != null) {
                            i = R.id.tvPhoneNumberRegister;
                            OneFontTextView oneFontTextView2 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                            if (oneFontTextView2 != null) {
                                i = R.id.tvTitleEdit;
                                OneFontTextView oneFontTextView3 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                if (oneFontTextView3 != null) {
                                    return new FragmentOnePrepaidChangeOwnerInputDocumentBinding((FrameLayout) view, oneFontButton, oneCustomClearableEditText, oneCustomClearableEditText2, oneCustomClearableEditText3, oneFontTextView, oneFontTextView2, oneFontTextView3);
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static FragmentOnePrepaidChangeOwnerInputDocumentBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentOnePrepaidChangeOwnerInputDocumentBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_one_prepaid_change_owner_input_document, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public FrameLayout getRoot() {
        return this.f84184a;
    }
}