package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import th.p047co.dtac.android.dtacone.R;

/* renamed from: th.co.dtac.android.dtacone.databinding.FragmentMrtrPostpaidSummaryBinding */
/* loaded from: classes7.dex */
public final class FragmentMrtrPostpaidSummaryBinding implements ViewBinding {

    /* renamed from: a */
    public final FrameLayout f83843a;

    public FragmentMrtrPostpaidSummaryBinding(FrameLayout frameLayout) {
        this.f83843a = frameLayout;
    }

    @NonNull
    public static FragmentMrtrPostpaidSummaryBinding bind(@NonNull View view) {
        if (view != null) {
            return new FragmentMrtrPostpaidSummaryBinding((FrameLayout) view);
        }
        throw new NullPointerException("rootView");
    }

    @NonNull
    public static FragmentMrtrPostpaidSummaryBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentMrtrPostpaidSummaryBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_mrtr_postpaid_summary, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public FrameLayout getRoot() {
        return this.f83843a;
    }
}
