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

/* renamed from: th.co.dtac.android.dtacone.databinding.FragmentMrtrPostpaidBlacklistSharingConsentBinding */
/* loaded from: classes7.dex */
public final class FragmentMrtrPostpaidBlacklistSharingConsentBinding implements ViewBinding {

    /* renamed from: a */
    public final FrameLayout f83914a;
    @NonNull
    public final ZIncludeBlackListConsentBinding incBlackListConsent;

    public FragmentMrtrPostpaidBlacklistSharingConsentBinding(FrameLayout frameLayout, ZIncludeBlackListConsentBinding zIncludeBlackListConsentBinding) {
        this.f83914a = frameLayout;
        this.incBlackListConsent = zIncludeBlackListConsentBinding;
    }

    @NonNull
    public static FragmentMrtrPostpaidBlacklistSharingConsentBinding bind(@NonNull View view) {
        int i = R.id.incBlackListConsent;
        View findChildViewById = ViewBindings.findChildViewById(view, i);
        if (findChildViewById != null) {
            return new FragmentMrtrPostpaidBlacklistSharingConsentBinding((FrameLayout) view, ZIncludeBlackListConsentBinding.bind(findChildViewById));
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static FragmentMrtrPostpaidBlacklistSharingConsentBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentMrtrPostpaidBlacklistSharingConsentBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_mrtr_postpaid_blacklist_sharing_consent, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public FrameLayout getRoot() {
        return this.f83914a;
    }
}