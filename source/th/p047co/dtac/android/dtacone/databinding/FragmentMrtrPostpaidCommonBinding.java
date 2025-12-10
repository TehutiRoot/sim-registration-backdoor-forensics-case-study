package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import th.p047co.dtac.android.dtacone.R;

/* renamed from: th.co.dtac.android.dtacone.databinding.FragmentMrtrPostpaidCommonBinding */
/* loaded from: classes7.dex */
public final class FragmentMrtrPostpaidCommonBinding implements ViewBinding {

    /* renamed from: a */
    public final FrameLayout f83819a;

    public FragmentMrtrPostpaidCommonBinding(FrameLayout frameLayout) {
        this.f83819a = frameLayout;
    }

    @NonNull
    public static FragmentMrtrPostpaidCommonBinding bind(@NonNull View view) {
        if (view != null) {
            return new FragmentMrtrPostpaidCommonBinding((FrameLayout) view);
        }
        throw new NullPointerException("rootView");
    }

    @NonNull
    public static FragmentMrtrPostpaidCommonBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentMrtrPostpaidCommonBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_mrtr_postpaid_common, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public FrameLayout getRoot() {
        return this.f83819a;
    }
}
