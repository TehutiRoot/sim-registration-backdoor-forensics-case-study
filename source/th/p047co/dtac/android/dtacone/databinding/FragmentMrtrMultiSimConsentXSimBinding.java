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

/* renamed from: th.co.dtac.android.dtacone.databinding.FragmentMrtrMultiSimConsentXSimBinding */
/* loaded from: classes7.dex */
public final class FragmentMrtrMultiSimConsentXSimBinding implements ViewBinding {

    /* renamed from: a */
    public final FrameLayout f83801a;
    @NonNull
    public final ZIncludeBlackListConsentBinding incBlackListConsent;

    public FragmentMrtrMultiSimConsentXSimBinding(FrameLayout frameLayout, ZIncludeBlackListConsentBinding zIncludeBlackListConsentBinding) {
        this.f83801a = frameLayout;
        this.incBlackListConsent = zIncludeBlackListConsentBinding;
    }

    @NonNull
    public static FragmentMrtrMultiSimConsentXSimBinding bind(@NonNull View view) {
        int i = R.id.incBlackListConsent;
        View findChildViewById = ViewBindings.findChildViewById(view, i);
        if (findChildViewById != null) {
            return new FragmentMrtrMultiSimConsentXSimBinding((FrameLayout) view, ZIncludeBlackListConsentBinding.bind(findChildViewById));
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static FragmentMrtrMultiSimConsentXSimBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentMrtrMultiSimConsentXSimBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_mrtr_multi_sim_consent_x_sim, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public FrameLayout getRoot() {
        return this.f83801a;
    }
}
