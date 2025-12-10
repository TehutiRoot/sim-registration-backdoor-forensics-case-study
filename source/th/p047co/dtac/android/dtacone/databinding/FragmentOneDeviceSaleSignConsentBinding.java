package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import th.p047co.dtac.android.dtacone.R;

/* renamed from: th.co.dtac.android.dtacone.databinding.FragmentOneDeviceSaleSignConsentBinding */
/* loaded from: classes7.dex */
public final class FragmentOneDeviceSaleSignConsentBinding implements ViewBinding {

    /* renamed from: a */
    public final LinearLayout f83934a;

    public FragmentOneDeviceSaleSignConsentBinding(LinearLayout linearLayout) {
        this.f83934a = linearLayout;
    }

    @NonNull
    public static FragmentOneDeviceSaleSignConsentBinding bind(@NonNull View view) {
        if (view != null) {
            return new FragmentOneDeviceSaleSignConsentBinding((LinearLayout) view);
        }
        throw new NullPointerException("rootView");
    }

    @NonNull
    public static FragmentOneDeviceSaleSignConsentBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentOneDeviceSaleSignConsentBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_one_device_sale_sign_consent, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayout getRoot() {
        return this.f83934a;
    }
}
