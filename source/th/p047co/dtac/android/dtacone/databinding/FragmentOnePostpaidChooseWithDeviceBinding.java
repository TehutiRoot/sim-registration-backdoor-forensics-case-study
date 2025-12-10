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

/* renamed from: th.co.dtac.android.dtacone.databinding.FragmentOnePostpaidChooseWithDeviceBinding */
/* loaded from: classes7.dex */
public final class FragmentOnePostpaidChooseWithDeviceBinding implements ViewBinding {

    /* renamed from: a */
    public final FrameLayout f84018a;
    @NonNull
    public final OneIncludePostPaidSelectTypeBinding incPostpaidSelectType;

    public FragmentOnePostpaidChooseWithDeviceBinding(FrameLayout frameLayout, OneIncludePostPaidSelectTypeBinding oneIncludePostPaidSelectTypeBinding) {
        this.f84018a = frameLayout;
        this.incPostpaidSelectType = oneIncludePostPaidSelectTypeBinding;
    }

    @NonNull
    public static FragmentOnePostpaidChooseWithDeviceBinding bind(@NonNull View view) {
        int i = R.id.incPostpaidSelectType;
        View findChildViewById = ViewBindings.findChildViewById(view, i);
        if (findChildViewById != null) {
            return new FragmentOnePostpaidChooseWithDeviceBinding((FrameLayout) view, OneIncludePostPaidSelectTypeBinding.bind(findChildViewById));
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static FragmentOnePostpaidChooseWithDeviceBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentOnePostpaidChooseWithDeviceBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_one_postpaid_choose_with_device, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public FrameLayout getRoot() {
        return this.f84018a;
    }
}
