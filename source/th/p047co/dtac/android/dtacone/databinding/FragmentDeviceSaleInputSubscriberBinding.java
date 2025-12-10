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

/* renamed from: th.co.dtac.android.dtacone.databinding.FragmentDeviceSaleInputSubscriberBinding */
/* loaded from: classes7.dex */
public final class FragmentDeviceSaleInputSubscriberBinding implements ViewBinding {

    /* renamed from: a */
    public final NestedScrollView f83690a;
    @NonNull
    public final ZIncludeMrtrRequestOtpBinding incMrtrRequestOtp;

    public FragmentDeviceSaleInputSubscriberBinding(NestedScrollView nestedScrollView, ZIncludeMrtrRequestOtpBinding zIncludeMrtrRequestOtpBinding) {
        this.f83690a = nestedScrollView;
        this.incMrtrRequestOtp = zIncludeMrtrRequestOtpBinding;
    }

    @NonNull
    public static FragmentDeviceSaleInputSubscriberBinding bind(@NonNull View view) {
        int i = R.id.incMrtrRequestOtp;
        View findChildViewById = ViewBindings.findChildViewById(view, i);
        if (findChildViewById != null) {
            return new FragmentDeviceSaleInputSubscriberBinding((NestedScrollView) view, ZIncludeMrtrRequestOtpBinding.bind(findChildViewById));
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static FragmentDeviceSaleInputSubscriberBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentDeviceSaleInputSubscriberBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_device_sale_input_subscriber, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public NestedScrollView getRoot() {
        return this.f83690a;
    }
}
