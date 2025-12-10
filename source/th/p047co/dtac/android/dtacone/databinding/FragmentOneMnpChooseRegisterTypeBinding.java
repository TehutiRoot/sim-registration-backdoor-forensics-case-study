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
import th.p047co.dtac.android.dtacone.app_one.widget.OneFontTextView;

/* renamed from: th.co.dtac.android.dtacone.databinding.FragmentOneMnpChooseRegisterTypeBinding */
/* loaded from: classes7.dex */
public final class FragmentOneMnpChooseRegisterTypeBinding implements ViewBinding {

    /* renamed from: a */
    public final ConstraintLayout f83964a;
    @NonNull
    public final OneFontButton btnRegisterWithDevice;
    @NonNull
    public final OneFontButton btnRegisterWithOutDevice;
    @NonNull
    public final OneFontTextView tvTitle;

    public FragmentOneMnpChooseRegisterTypeBinding(ConstraintLayout constraintLayout, OneFontButton oneFontButton, OneFontButton oneFontButton2, OneFontTextView oneFontTextView) {
        this.f83964a = constraintLayout;
        this.btnRegisterWithDevice = oneFontButton;
        this.btnRegisterWithOutDevice = oneFontButton2;
        this.tvTitle = oneFontTextView;
    }

    @NonNull
    public static FragmentOneMnpChooseRegisterTypeBinding bind(@NonNull View view) {
        int i = R.id.btn_register_with_device;
        OneFontButton oneFontButton = (OneFontButton) ViewBindings.findChildViewById(view, i);
        if (oneFontButton != null) {
            i = R.id.btn_register_with_out_device;
            OneFontButton oneFontButton2 = (OneFontButton) ViewBindings.findChildViewById(view, i);
            if (oneFontButton2 != null) {
                i = R.id.tvTitle;
                OneFontTextView oneFontTextView = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                if (oneFontTextView != null) {
                    return new FragmentOneMnpChooseRegisterTypeBinding((ConstraintLayout) view, oneFontButton, oneFontButton2, oneFontTextView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static FragmentOneMnpChooseRegisterTypeBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentOneMnpChooseRegisterTypeBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_one_mnp_choose_register_type, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.f83964a;
    }
}
