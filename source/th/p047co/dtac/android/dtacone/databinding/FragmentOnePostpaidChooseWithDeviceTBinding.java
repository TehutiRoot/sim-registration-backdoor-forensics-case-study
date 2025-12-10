package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import th.p047co.dtac.android.dtacone.R;

/* renamed from: th.co.dtac.android.dtacone.databinding.FragmentOnePostpaidChooseWithDeviceTBinding */
/* loaded from: classes7.dex */
public final class FragmentOnePostpaidChooseWithDeviceTBinding implements ViewBinding {

    /* renamed from: a */
    public final FrameLayout f84019a;
    @NonNull
    public final OneIncludePostPaidSelectTypeTrueCompanyBinding incPostpaidSelectType;

    public FragmentOnePostpaidChooseWithDeviceTBinding(FrameLayout frameLayout, OneIncludePostPaidSelectTypeTrueCompanyBinding oneIncludePostPaidSelectTypeTrueCompanyBinding) {
        this.f84019a = frameLayout;
        this.incPostpaidSelectType = oneIncludePostPaidSelectTypeTrueCompanyBinding;
    }

    @NonNull
    public static FragmentOnePostpaidChooseWithDeviceTBinding bind(@NonNull View view) {
        int i = R.id.incPostpaidSelectType;
        View findChildViewById = ViewBindings.findChildViewById(view, i);
        if (findChildViewById != null) {
            return new FragmentOnePostpaidChooseWithDeviceTBinding((FrameLayout) view, OneIncludePostPaidSelectTypeTrueCompanyBinding.bind(findChildViewById));
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static FragmentOnePostpaidChooseWithDeviceTBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentOnePostpaidChooseWithDeviceTBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_one_postpaid_choose_with_device_t, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public FrameLayout getRoot() {
        return this.f84019a;
    }
}
