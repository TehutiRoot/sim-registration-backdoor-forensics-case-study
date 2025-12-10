package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import th.p047co.dtac.android.dtacone.R;

/* renamed from: th.co.dtac.android.dtacone.databinding.FragmentDeviceSaleBlackListConsentBinding */
/* loaded from: classes7.dex */
public final class FragmentDeviceSaleBlackListConsentBinding implements ViewBinding {

    /* renamed from: a */
    public final LinearLayout f83784a;
    @NonNull
    public final ZIncludeBlackListConsentBinding incConsent;

    public FragmentDeviceSaleBlackListConsentBinding(LinearLayout linearLayout, ZIncludeBlackListConsentBinding zIncludeBlackListConsentBinding) {
        this.f83784a = linearLayout;
        this.incConsent = zIncludeBlackListConsentBinding;
    }

    @NonNull
    public static FragmentDeviceSaleBlackListConsentBinding bind(@NonNull View view) {
        int i = R.id.incConsent;
        View findChildViewById = ViewBindings.findChildViewById(view, i);
        if (findChildViewById != null) {
            return new FragmentDeviceSaleBlackListConsentBinding((LinearLayout) view, ZIncludeBlackListConsentBinding.bind(findChildViewById));
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static FragmentDeviceSaleBlackListConsentBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentDeviceSaleBlackListConsentBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_device_sale_black_list_consent, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayout getRoot() {
        return this.f83784a;
    }
}