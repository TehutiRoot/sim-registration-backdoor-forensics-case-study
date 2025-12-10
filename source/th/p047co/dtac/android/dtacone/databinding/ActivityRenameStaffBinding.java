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
import th.p047co.dtac.android.dtacone.widget.view.DtacEditText;
import th.p047co.dtac.android.dtacone.widget.view.DtacFontButton;
import th.p047co.dtac.android.dtacone.widget.view.DtacFontTextView;

/* renamed from: th.co.dtac.android.dtacone.databinding.ActivityRenameStaffBinding */
/* loaded from: classes7.dex */
public final class ActivityRenameStaffBinding implements ViewBinding {

    /* renamed from: a */
    public final CoordinatorLayout f83578a;
    @NonNull
    public final DtacFontButton btnConfirm;
    @NonNull
    public final ZToolbarBinding incToolbar;
    @NonNull
    public final LinearLayout rootLayout;
    @NonNull
    public final DtacClearableEditText staffDetailEdtName;
    @NonNull
    public final DtacEditText staffDetailPhoneNumber;
    @NonNull
    public final DtacFontTextView staffDetailTvTitle;

    public ActivityRenameStaffBinding(CoordinatorLayout coordinatorLayout, DtacFontButton dtacFontButton, ZToolbarBinding zToolbarBinding, LinearLayout linearLayout, DtacClearableEditText dtacClearableEditText, DtacEditText dtacEditText, DtacFontTextView dtacFontTextView) {
        this.f83578a = coordinatorLayout;
        this.btnConfirm = dtacFontButton;
        this.incToolbar = zToolbarBinding;
        this.rootLayout = linearLayout;
        this.staffDetailEdtName = dtacClearableEditText;
        this.staffDetailPhoneNumber = dtacEditText;
        this.staffDetailTvTitle = dtacFontTextView;
    }

    @NonNull
    public static ActivityRenameStaffBinding bind(@NonNull View view) {
        View findChildViewById;
        int i = R.id.btn_confirm;
        DtacFontButton dtacFontButton = (DtacFontButton) ViewBindings.findChildViewById(view, i);
        if (dtacFontButton != null && (findChildViewById = ViewBindings.findChildViewById(view, (i = R.id.incToolbar))) != null) {
            ZToolbarBinding bind = ZToolbarBinding.bind(findChildViewById);
            i = R.id.rootLayout;
            LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i);
            if (linearLayout != null) {
                i = R.id.staff_detail_edt_name;
                DtacClearableEditText dtacClearableEditText = (DtacClearableEditText) ViewBindings.findChildViewById(view, i);
                if (dtacClearableEditText != null) {
                    i = R.id.staff_detail_phone_number;
                    DtacEditText dtacEditText = (DtacEditText) ViewBindings.findChildViewById(view, i);
                    if (dtacEditText != null) {
                        i = R.id.staff_detail_tv_title;
                        DtacFontTextView dtacFontTextView = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                        if (dtacFontTextView != null) {
                            return new ActivityRenameStaffBinding((CoordinatorLayout) view, dtacFontButton, bind, linearLayout, dtacClearableEditText, dtacEditText, dtacFontTextView);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static ActivityRenameStaffBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ActivityRenameStaffBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.activity_rename_staff, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public CoordinatorLayout getRoot() {
        return this.f83578a;
    }
}
