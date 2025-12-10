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

/* renamed from: th.co.dtac.android.dtacone.databinding.FragmentOnePostpaidCheckBlacklistBinding */
/* loaded from: classes7.dex */
public final class FragmentOnePostpaidCheckBlacklistBinding implements ViewBinding {

    /* renamed from: a */
    public final FrameLayout f84120a;
    @NonNull
    public final OneIncludeBlackListConsentNewBinding blacklistContent;

    public FragmentOnePostpaidCheckBlacklistBinding(FrameLayout frameLayout, OneIncludeBlackListConsentNewBinding oneIncludeBlackListConsentNewBinding) {
        this.f84120a = frameLayout;
        this.blacklistContent = oneIncludeBlackListConsentNewBinding;
    }

    @NonNull
    public static FragmentOnePostpaidCheckBlacklistBinding bind(@NonNull View view) {
        int i = R.id.blacklistContent;
        View findChildViewById = ViewBindings.findChildViewById(view, i);
        if (findChildViewById != null) {
            return new FragmentOnePostpaidCheckBlacklistBinding((FrameLayout) view, OneIncludeBlackListConsentNewBinding.bind(findChildViewById));
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static FragmentOnePostpaidCheckBlacklistBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentOnePostpaidCheckBlacklistBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_one_postpaid_check_blacklist, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public FrameLayout getRoot() {
        return this.f84120a;
    }
}