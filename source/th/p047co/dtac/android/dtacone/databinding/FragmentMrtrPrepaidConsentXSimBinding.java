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

/* renamed from: th.co.dtac.android.dtacone.databinding.FragmentMrtrPrepaidConsentXSimBinding */
/* loaded from: classes7.dex */
public final class FragmentMrtrPrepaidConsentXSimBinding implements ViewBinding {

    /* renamed from: a */
    public final FrameLayout f83859a;
    @NonNull
    public final ZIncludeBlackListConsentBinding incBlackListConsent;

    public FragmentMrtrPrepaidConsentXSimBinding(FrameLayout frameLayout, ZIncludeBlackListConsentBinding zIncludeBlackListConsentBinding) {
        this.f83859a = frameLayout;
        this.incBlackListConsent = zIncludeBlackListConsentBinding;
    }

    @NonNull
    public static FragmentMrtrPrepaidConsentXSimBinding bind(@NonNull View view) {
        int i = R.id.incBlackListConsent;
        View findChildViewById = ViewBindings.findChildViewById(view, i);
        if (findChildViewById != null) {
            return new FragmentMrtrPrepaidConsentXSimBinding((FrameLayout) view, ZIncludeBlackListConsentBinding.bind(findChildViewById));
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static FragmentMrtrPrepaidConsentXSimBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentMrtrPrepaidConsentXSimBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_mrtr_prepaid_consent_x_sim, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public FrameLayout getRoot() {
        return this.f83859a;
    }
}
