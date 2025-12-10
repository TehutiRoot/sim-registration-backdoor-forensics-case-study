package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import th.p047co.dtac.android.dtacone.R;

/* renamed from: th.co.dtac.android.dtacone.databinding.FragmentOneMnpTruePackageBinding */
/* loaded from: classes7.dex */
public final class FragmentOneMnpTruePackageBinding implements ViewBinding {

    /* renamed from: a */
    public final FrameLayout f84085a;

    public FragmentOneMnpTruePackageBinding(FrameLayout frameLayout) {
        this.f84085a = frameLayout;
    }

    @NonNull
    public static FragmentOneMnpTruePackageBinding bind(@NonNull View view) {
        if (view != null) {
            return new FragmentOneMnpTruePackageBinding((FrameLayout) view);
        }
        throw new NullPointerException("rootView");
    }

    @NonNull
    public static FragmentOneMnpTruePackageBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentOneMnpTruePackageBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_one_mnp_true_package, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public FrameLayout getRoot() {
        return this.f84085a;
    }
}