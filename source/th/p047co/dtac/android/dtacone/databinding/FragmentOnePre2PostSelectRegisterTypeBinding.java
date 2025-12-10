package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.app_one.widget.OneFontButton;

/* renamed from: th.co.dtac.android.dtacone.databinding.FragmentOnePre2PostSelectRegisterTypeBinding */
/* loaded from: classes7.dex */
public final class FragmentOnePre2PostSelectRegisterTypeBinding implements ViewBinding {

    /* renamed from: a */
    public final ConstraintLayout f84064a;
    @NonNull
    public final OneFontButton withDeviceButton;
    @NonNull
    public final OneFontButton withoutDeviceButtonButton;

    public FragmentOnePre2PostSelectRegisterTypeBinding(ConstraintLayout constraintLayout, OneFontButton oneFontButton, OneFontButton oneFontButton2) {
        this.f84064a = constraintLayout;
        this.withDeviceButton = oneFontButton;
        this.withoutDeviceButtonButton = oneFontButton2;
    }

    @NonNull
    public static FragmentOnePre2PostSelectRegisterTypeBinding bind(@NonNull View view) {
        int i = R.id.withDeviceButton;
        OneFontButton oneFontButton = (OneFontButton) ViewBindings.findChildViewById(view, i);
        if (oneFontButton != null) {
            i = R.id.withoutDeviceButtonButton;
            OneFontButton oneFontButton2 = (OneFontButton) ViewBindings.findChildViewById(view, i);
            if (oneFontButton2 != null) {
                return new FragmentOnePre2PostSelectRegisterTypeBinding((ConstraintLayout) view, oneFontButton, oneFontButton2);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static FragmentOnePre2PostSelectRegisterTypeBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentOnePre2PostSelectRegisterTypeBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_one_pre2_post_select_register_type, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.f84064a;
    }
}
