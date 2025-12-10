package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import th.p047co.dtac.android.dtacone.R;

/* renamed from: th.co.dtac.android.dtacone.databinding.FragmentOneMnpPreviewCustomerBinding */
/* loaded from: classes7.dex */
public final class FragmentOneMnpPreviewCustomerBinding implements ViewBinding {

    /* renamed from: a */
    public final FrameLayout f84075a;

    public FragmentOneMnpPreviewCustomerBinding(FrameLayout frameLayout) {
        this.f84075a = frameLayout;
    }

    @NonNull
    public static FragmentOneMnpPreviewCustomerBinding bind(@NonNull View view) {
        if (view != null) {
            return new FragmentOneMnpPreviewCustomerBinding((FrameLayout) view);
        }
        throw new NullPointerException("rootView");
    }

    @NonNull
    public static FragmentOneMnpPreviewCustomerBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentOneMnpPreviewCustomerBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_one_mnp_preview_customer, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public FrameLayout getRoot() {
        return this.f84075a;
    }
}