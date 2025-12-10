package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import th.p047co.dtac.android.dtacone.R;

/* renamed from: th.co.dtac.android.dtacone.databinding.FragmentMrtrPre2postSummaryBinding */
/* loaded from: classes7.dex */
public final class FragmentMrtrPre2postSummaryBinding implements ViewBinding {

    /* renamed from: a */
    public final FrameLayout f83954a;

    public FragmentMrtrPre2postSummaryBinding(FrameLayout frameLayout) {
        this.f83954a = frameLayout;
    }

    @NonNull
    public static FragmentMrtrPre2postSummaryBinding bind(@NonNull View view) {
        if (view != null) {
            return new FragmentMrtrPre2postSummaryBinding((FrameLayout) view);
        }
        throw new NullPointerException("rootView");
    }

    @NonNull
    public static FragmentMrtrPre2postSummaryBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentMrtrPre2postSummaryBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_mrtr_pre2post_summary, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public FrameLayout getRoot() {
        return this.f83954a;
    }
}