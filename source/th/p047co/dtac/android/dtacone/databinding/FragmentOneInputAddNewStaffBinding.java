package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.app_one.widget.OneFontTextView;
import th.p047co.dtac.android.dtacone.app_one.widget.OneTextInputLayoutPhone;
import th.p047co.dtac.android.dtacone.app_one.widget.OneTextInputLayoutText;

/* renamed from: th.co.dtac.android.dtacone.databinding.FragmentOneInputAddNewStaffBinding */
/* loaded from: classes7.dex */
public final class FragmentOneInputAddNewStaffBinding implements ViewBinding {

    /* renamed from: a */
    public final FrameLayout f83954a;
    @NonNull
    public final OneFontTextView btnConfirm;
    @NonNull
    public final OneTextInputLayoutText edtConfirmNewPassword;
    @NonNull
    public final OneTextInputLayoutText edtName;
    @NonNull
    public final OneTextInputLayoutText edtNewPassword;
    @NonNull
    public final OneTextInputLayoutPhone edtPhoneNumber;
    @NonNull
    public final LinearLayoutCompat layoutInputAddNewStaff;
    @NonNull
    public final RelativeLayout layoutSubTitle;
    @NonNull
    public final RelativeLayout rootLayout;
    @NonNull
    public final OneFontTextView tvSubTitle;

    public FragmentOneInputAddNewStaffBinding(FrameLayout frameLayout, OneFontTextView oneFontTextView, OneTextInputLayoutText oneTextInputLayoutText, OneTextInputLayoutText oneTextInputLayoutText2, OneTextInputLayoutText oneTextInputLayoutText3, OneTextInputLayoutPhone oneTextInputLayoutPhone, LinearLayoutCompat linearLayoutCompat, RelativeLayout relativeLayout, RelativeLayout relativeLayout2, OneFontTextView oneFontTextView2) {
        this.f83954a = frameLayout;
        this.btnConfirm = oneFontTextView;
        this.edtConfirmNewPassword = oneTextInputLayoutText;
        this.edtName = oneTextInputLayoutText2;
        this.edtNewPassword = oneTextInputLayoutText3;
        this.edtPhoneNumber = oneTextInputLayoutPhone;
        this.layoutInputAddNewStaff = linearLayoutCompat;
        this.layoutSubTitle = relativeLayout;
        this.rootLayout = relativeLayout2;
        this.tvSubTitle = oneFontTextView2;
    }

    @NonNull
    public static FragmentOneInputAddNewStaffBinding bind(@NonNull View view) {
        int i = R.id.btnConfirm;
        OneFontTextView oneFontTextView = (OneFontTextView) ViewBindings.findChildViewById(view, i);
        if (oneFontTextView != null) {
            i = R.id.edtConfirmNewPassword;
            OneTextInputLayoutText oneTextInputLayoutText = (OneTextInputLayoutText) ViewBindings.findChildViewById(view, i);
            if (oneTextInputLayoutText != null) {
                i = R.id.edtName;
                OneTextInputLayoutText oneTextInputLayoutText2 = (OneTextInputLayoutText) ViewBindings.findChildViewById(view, i);
                if (oneTextInputLayoutText2 != null) {
                    i = R.id.edtNewPassword;
                    OneTextInputLayoutText oneTextInputLayoutText3 = (OneTextInputLayoutText) ViewBindings.findChildViewById(view, i);
                    if (oneTextInputLayoutText3 != null) {
                        i = R.id.edtPhoneNumber;
                        OneTextInputLayoutPhone oneTextInputLayoutPhone = (OneTextInputLayoutPhone) ViewBindings.findChildViewById(view, i);
                        if (oneTextInputLayoutPhone != null) {
                            i = R.id.layoutInputAddNewStaff;
                            LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i);
                            if (linearLayoutCompat != null) {
                                i = R.id.layoutSubTitle;
                                RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, i);
                                if (relativeLayout != null) {
                                    i = R.id.rootLayout;
                                    RelativeLayout relativeLayout2 = (RelativeLayout) ViewBindings.findChildViewById(view, i);
                                    if (relativeLayout2 != null) {
                                        i = R.id.tvSubTitle;
                                        OneFontTextView oneFontTextView2 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                        if (oneFontTextView2 != null) {
                                            return new FragmentOneInputAddNewStaffBinding((FrameLayout) view, oneFontTextView, oneTextInputLayoutText, oneTextInputLayoutText2, oneTextInputLayoutText3, oneTextInputLayoutPhone, linearLayoutCompat, relativeLayout, relativeLayout2, oneFontTextView2);
                                        }
                                    }
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
    public static FragmentOneInputAddNewStaffBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentOneInputAddNewStaffBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_one_input_add_new_staff, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public FrameLayout getRoot() {
        return this.f83954a;
    }
}
