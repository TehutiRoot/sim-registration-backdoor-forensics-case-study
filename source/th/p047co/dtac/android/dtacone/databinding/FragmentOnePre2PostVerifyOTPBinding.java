package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import th.p047co.dtac.android.dtacone.R;

/* renamed from: th.co.dtac.android.dtacone.databinding.FragmentOnePre2PostVerifyOTPBinding */
/* loaded from: classes7.dex */
public final class FragmentOnePre2PostVerifyOTPBinding implements ViewBinding {

    /* renamed from: a */
    public final ConstraintLayout f84067a;

    public FragmentOnePre2PostVerifyOTPBinding(ConstraintLayout constraintLayout) {
        this.f84067a = constraintLayout;
    }

    @NonNull
    public static FragmentOnePre2PostVerifyOTPBinding bind(@NonNull View view) {
        if (view != null) {
            return new FragmentOnePre2PostVerifyOTPBinding((ConstraintLayout) view);
        }
        throw new NullPointerException("rootView");
    }

    @NonNull
    public static FragmentOnePre2PostVerifyOTPBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentOnePre2PostVerifyOTPBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_one_pre2_post_verify_o_t_p, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.f84067a;
    }
}
