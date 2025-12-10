package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.widget.NestedScrollView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import th.p047co.dtac.android.dtacone.R;

/* renamed from: th.co.dtac.android.dtacone.databinding.FragmentMrtrPrepaidReregistRequestOtpBinding */
/* loaded from: classes7.dex */
public final class FragmentMrtrPrepaidReregistRequestOtpBinding implements ViewBinding {

    /* renamed from: a */
    public final NestedScrollView f83870a;
    @NonNull
    public final ZIncludeMrtrRequestOtpBinding incRequestOtp;

    public FragmentMrtrPrepaidReregistRequestOtpBinding(NestedScrollView nestedScrollView, ZIncludeMrtrRequestOtpBinding zIncludeMrtrRequestOtpBinding) {
        this.f83870a = nestedScrollView;
        this.incRequestOtp = zIncludeMrtrRequestOtpBinding;
    }

    @NonNull
    public static FragmentMrtrPrepaidReregistRequestOtpBinding bind(@NonNull View view) {
        int i = R.id.incRequestOtp;
        View findChildViewById = ViewBindings.findChildViewById(view, i);
        if (findChildViewById != null) {
            return new FragmentMrtrPrepaidReregistRequestOtpBinding((NestedScrollView) view, ZIncludeMrtrRequestOtpBinding.bind(findChildViewById));
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static FragmentMrtrPrepaidReregistRequestOtpBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentMrtrPrepaidReregistRequestOtpBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_mrtr_prepaid_reregist_request_otp, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public NestedScrollView getRoot() {
        return this.f83870a;
    }
}
