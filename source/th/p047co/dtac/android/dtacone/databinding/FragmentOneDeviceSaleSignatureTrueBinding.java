package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import th.p047co.dtac.android.dtacone.R;

/* renamed from: th.co.dtac.android.dtacone.databinding.FragmentOneDeviceSaleSignatureTrueBinding */
/* loaded from: classes7.dex */
public final class FragmentOneDeviceSaleSignatureTrueBinding implements ViewBinding {

    /* renamed from: a */
    public final FrameLayout f83935a;

    public FragmentOneDeviceSaleSignatureTrueBinding(FrameLayout frameLayout) {
        this.f83935a = frameLayout;
    }

    @NonNull
    public static FragmentOneDeviceSaleSignatureTrueBinding bind(@NonNull View view) {
        if (view != null) {
            return new FragmentOneDeviceSaleSignatureTrueBinding((FrameLayout) view);
        }
        throw new NullPointerException("rootView");
    }

    @NonNull
    public static FragmentOneDeviceSaleSignatureTrueBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentOneDeviceSaleSignatureTrueBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_one_device_sale_signature_true, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public FrameLayout getRoot() {
        return this.f83935a;
    }
}
