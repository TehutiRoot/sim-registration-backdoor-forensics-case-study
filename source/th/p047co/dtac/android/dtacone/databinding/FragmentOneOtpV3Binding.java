package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import th.p047co.dtac.android.dtacone.R;

/* renamed from: th.co.dtac.android.dtacone.databinding.FragmentOneOtpV3Binding */
/* loaded from: classes7.dex */
public final class FragmentOneOtpV3Binding implements ViewBinding {

    /* renamed from: a */
    public final ConstraintLayout f84009a;

    public FragmentOneOtpV3Binding(ConstraintLayout constraintLayout) {
        this.f84009a = constraintLayout;
    }

    @NonNull
    public static FragmentOneOtpV3Binding bind(@NonNull View view) {
        if (view != null) {
            return new FragmentOneOtpV3Binding((ConstraintLayout) view);
        }
        throw new NullPointerException("rootView");
    }

    @NonNull
    public static FragmentOneOtpV3Binding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentOneOtpV3Binding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_one_otp_v3, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.f84009a;
    }
}
