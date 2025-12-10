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
import th.p047co.dtac.android.dtacone.app_one.widget.OneFontButton;

/* renamed from: th.co.dtac.android.dtacone.databinding.IncludeOneLayoutConfirmCancleButtonBinding */
/* loaded from: classes7.dex */
public final class IncludeOneLayoutConfirmCancleButtonBinding implements ViewBinding {

    /* renamed from: a */
    public final LinearLayout f84372a;
    @NonNull
    public final OneFontButton btnCancel;
    @NonNull
    public final OneFontButton btnOk;
    @NonNull
    public final LinearLayout okCancelBox;

    public IncludeOneLayoutConfirmCancleButtonBinding(LinearLayout linearLayout, OneFontButton oneFontButton, OneFontButton oneFontButton2, LinearLayout linearLayout2) {
        this.f84372a = linearLayout;
        this.btnCancel = oneFontButton;
        this.btnOk = oneFontButton2;
        this.okCancelBox = linearLayout2;
    }

    @NonNull
    public static IncludeOneLayoutConfirmCancleButtonBinding bind(@NonNull View view) {
        int i = R.id.btnCancel;
        OneFontButton oneFontButton = (OneFontButton) ViewBindings.findChildViewById(view, i);
        if (oneFontButton != null) {
            i = R.id.btnOk;
            OneFontButton oneFontButton2 = (OneFontButton) ViewBindings.findChildViewById(view, i);
            if (oneFontButton2 != null) {
                LinearLayout linearLayout = (LinearLayout) view;
                return new IncludeOneLayoutConfirmCancleButtonBinding(linearLayout, oneFontButton, oneFontButton2, linearLayout);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static IncludeOneLayoutConfirmCancleButtonBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static IncludeOneLayoutConfirmCancleButtonBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.include_one_layout_confirm_cancle_button, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayout getRoot() {
        return this.f84372a;
    }
}