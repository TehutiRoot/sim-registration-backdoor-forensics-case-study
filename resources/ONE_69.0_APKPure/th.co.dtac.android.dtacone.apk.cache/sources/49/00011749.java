package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.widget.view.DtacFontButton;

/* renamed from: th.co.dtac.android.dtacone.databinding.IncludeLayoutConfirmCancleButtonBinding */
/* loaded from: classes7.dex */
public final class IncludeLayoutConfirmCancleButtonBinding implements ViewBinding {

    /* renamed from: a */
    public final LinearLayout f84344a;
    @NonNull
    public final DtacFontButton btnCancel;
    @NonNull
    public final DtacFontButton btnOk;
    @NonNull
    public final LinearLayout okCancelBox;

    public IncludeLayoutConfirmCancleButtonBinding(LinearLayout linearLayout, DtacFontButton dtacFontButton, DtacFontButton dtacFontButton2, LinearLayout linearLayout2) {
        this.f84344a = linearLayout;
        this.btnCancel = dtacFontButton;
        this.btnOk = dtacFontButton2;
        this.okCancelBox = linearLayout2;
    }

    @NonNull
    public static IncludeLayoutConfirmCancleButtonBinding bind(@NonNull View view) {
        int i = R.id.btnCancel;
        DtacFontButton dtacFontButton = (DtacFontButton) ViewBindings.findChildViewById(view, i);
        if (dtacFontButton != null) {
            i = R.id.btnOk;
            DtacFontButton dtacFontButton2 = (DtacFontButton) ViewBindings.findChildViewById(view, i);
            if (dtacFontButton2 != null) {
                LinearLayout linearLayout = (LinearLayout) view;
                return new IncludeLayoutConfirmCancleButtonBinding(linearLayout, dtacFontButton, dtacFontButton2, linearLayout);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static IncludeLayoutConfirmCancleButtonBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static IncludeLayoutConfirmCancleButtonBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.include_layout_confirm_cancle_button, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayout getRoot() {
        return this.f84344a;
    }
}