package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import th.p047co.dtac.android.dtacone.R;

/* renamed from: th.co.dtac.android.dtacone.databinding.FragmentMrtrPostpaidInputSimBinding */
/* loaded from: classes7.dex */
public final class FragmentMrtrPostpaidInputSimBinding implements ViewBinding {

    /* renamed from: a */
    public final LinearLayout f83831a;

    public FragmentMrtrPostpaidInputSimBinding(LinearLayout linearLayout) {
        this.f83831a = linearLayout;
    }

    @NonNull
    public static FragmentMrtrPostpaidInputSimBinding bind(@NonNull View view) {
        if (view != null) {
            return new FragmentMrtrPostpaidInputSimBinding((LinearLayout) view);
        }
        throw new NullPointerException("rootView");
    }

    @NonNull
    public static FragmentMrtrPostpaidInputSimBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentMrtrPostpaidInputSimBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_mrtr_postpaid_input_sim, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayout getRoot() {
        return this.f83831a;
    }
}
