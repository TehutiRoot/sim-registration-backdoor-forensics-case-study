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

/* renamed from: th.co.dtac.android.dtacone.databinding.OneIncludePostPaidSelectTypeBinding */
/* loaded from: classes7.dex */
public final class OneIncludePostPaidSelectTypeBinding implements ViewBinding {

    /* renamed from: a */
    public final LinearLayout f84477a;
    @NonNull
    public final OneFontButton btnNormalRegistration;
    @NonNull
    public final OneFontButton btnWithDevice;

    public OneIncludePostPaidSelectTypeBinding(LinearLayout linearLayout, OneFontButton oneFontButton, OneFontButton oneFontButton2) {
        this.f84477a = linearLayout;
        this.btnNormalRegistration = oneFontButton;
        this.btnWithDevice = oneFontButton2;
    }

    @NonNull
    public static OneIncludePostPaidSelectTypeBinding bind(@NonNull View view) {
        int i = R.id.btnNormalRegistration;
        OneFontButton oneFontButton = (OneFontButton) ViewBindings.findChildViewById(view, i);
        if (oneFontButton != null) {
            i = R.id.btnWithDevice;
            OneFontButton oneFontButton2 = (OneFontButton) ViewBindings.findChildViewById(view, i);
            if (oneFontButton2 != null) {
                return new OneIncludePostPaidSelectTypeBinding((LinearLayout) view, oneFontButton, oneFontButton2);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static OneIncludePostPaidSelectTypeBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static OneIncludePostPaidSelectTypeBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.one_include_post_paid_select_type, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayout getRoot() {
        return this.f84477a;
    }
}
