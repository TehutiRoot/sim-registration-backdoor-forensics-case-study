package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import th.p047co.dtac.android.dtacone.R;

/* renamed from: th.co.dtac.android.dtacone.databinding.FragmentMrtrPre2postChooseWithDeviceBinding */
/* loaded from: classes7.dex */
public final class FragmentMrtrPre2postChooseWithDeviceBinding implements ViewBinding {

    /* renamed from: a */
    public final FrameLayout f83850a;

    public FragmentMrtrPre2postChooseWithDeviceBinding(FrameLayout frameLayout) {
        this.f83850a = frameLayout;
    }

    @NonNull
    public static FragmentMrtrPre2postChooseWithDeviceBinding bind(@NonNull View view) {
        if (view != null) {
            return new FragmentMrtrPre2postChooseWithDeviceBinding((FrameLayout) view);
        }
        throw new NullPointerException("rootView");
    }

    @NonNull
    public static FragmentMrtrPre2postChooseWithDeviceBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentMrtrPre2postChooseWithDeviceBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_mrtr_pre2post_choose_with_device, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public FrameLayout getRoot() {
        return this.f83850a;
    }
}
