package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.widget.view.DtacClearableEditText;
import th.p047co.dtac.android.dtacone.widget.view.DtacFontButton;
import th.p047co.dtac.android.dtacone.widget.view.DtacFontTextView;

/* renamed from: th.co.dtac.android.dtacone.databinding.ActivityAddNewStaffBinding */
/* loaded from: classes7.dex */
public final class ActivityAddNewStaffBinding implements ViewBinding {

    /* renamed from: a */
    public final CoordinatorLayout f83498a;
    @NonNull
    public final DtacFontButton btnConfirm;
    @NonNull
    public final DtacFontTextView forgotPasswordTvPasswordLengthDescription;
    @NonNull
    public final DtacClearableEditText newStaffEdtConfirmNewPassword;
    @NonNull
    public final DtacClearableEditText newStaffEdtName;
    @NonNull
    public final DtacClearableEditText newStaffEdtNewPassword;
    @NonNull
    public final DtacClearableEditText newStaffEdtPhoneNumber;
    @NonNull
    public final LinearLayout rootLayout;
    @NonNull
    public final ZToolbarBinding toolbar;

    public ActivityAddNewStaffBinding(CoordinatorLayout coordinatorLayout, DtacFontButton dtacFontButton, DtacFontTextView dtacFontTextView, DtacClearableEditText dtacClearableEditText, DtacClearableEditText dtacClearableEditText2, DtacClearableEditText dtacClearableEditText3, DtacClearableEditText dtacClearableEditText4, LinearLayout linearLayout, ZToolbarBinding zToolbarBinding) {
        this.f83498a = coordinatorLayout;
        this.btnConfirm = dtacFontButton;
        this.forgotPasswordTvPasswordLengthDescription = dtacFontTextView;
        this.newStaffEdtConfirmNewPassword = dtacClearableEditText;
        this.newStaffEdtName = dtacClearableEditText2;
        this.newStaffEdtNewPassword = dtacClearableEditText3;
        this.newStaffEdtPhoneNumber = dtacClearableEditText4;
        this.rootLayout = linearLayout;
        this.toolbar = zToolbarBinding;
    }

    @NonNull
    public static ActivityAddNewStaffBinding bind(@NonNull View view) {
        View findChildViewById;
        int i = R.id.btn_confirm;
        DtacFontButton dtacFontButton = (DtacFontButton) ViewBindings.findChildViewById(view, i);
        if (dtacFontButton != null) {
            i = R.id.forgot_password_tv_password_length_description;
            DtacFontTextView dtacFontTextView = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
            if (dtacFontTextView != null) {
                i = R.id.new_staff_edt_confirm_new_password;
                DtacClearableEditText dtacClearableEditText = (DtacClearableEditText) ViewBindings.findChildViewById(view, i);
                if (dtacClearableEditText != null) {
                    i = R.id.new_staff_edt_name;
                    DtacClearableEditText dtacClearableEditText2 = (DtacClearableEditText) ViewBindings.findChildViewById(view, i);
                    if (dtacClearableEditText2 != null) {
                        i = R.id.new_staff_edt_new_password;
                        DtacClearableEditText dtacClearableEditText3 = (DtacClearableEditText) ViewBindings.findChildViewById(view, i);
                        if (dtacClearableEditText3 != null) {
                            i = R.id.new_staff_edt_phone_number;
                            DtacClearableEditText dtacClearableEditText4 = (DtacClearableEditText) ViewBindings.findChildViewById(view, i);
                            if (dtacClearableEditText4 != null) {
                                i = R.id.rootLayout;
                                LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i);
                                if (linearLayout != null && (findChildViewById = ViewBindings.findChildViewById(view, (i = R.id.toolbar))) != null) {
                                    return new ActivityAddNewStaffBinding((CoordinatorLayout) view, dtacFontButton, dtacFontTextView, dtacClearableEditText, dtacClearableEditText2, dtacClearableEditText3, dtacClearableEditText4, linearLayout, ZToolbarBinding.bind(findChildViewById));
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
    public static ActivityAddNewStaffBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ActivityAddNewStaffBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.activity_add_new_staff, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public CoordinatorLayout getRoot() {
        return this.f83498a;
    }
}
