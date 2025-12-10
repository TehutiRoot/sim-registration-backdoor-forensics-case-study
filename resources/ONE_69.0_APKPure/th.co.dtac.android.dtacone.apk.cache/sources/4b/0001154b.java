package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import th.p047co.dtac.android.dtacone.R;

/* renamed from: th.co.dtac.android.dtacone.databinding.FragmentEsimPostpaidInputSimBinding */
/* loaded from: classes7.dex */
public final class FragmentEsimPostpaidInputSimBinding implements ViewBinding {

    /* renamed from: a */
    public final LinearLayout f83833a;

    public FragmentEsimPostpaidInputSimBinding(LinearLayout linearLayout) {
        this.f83833a = linearLayout;
    }

    @NonNull
    public static FragmentEsimPostpaidInputSimBinding bind(@NonNull View view) {
        if (view != null) {
            return new FragmentEsimPostpaidInputSimBinding((LinearLayout) view);
        }
        throw new NullPointerException("rootView");
    }

    @NonNull
    public static FragmentEsimPostpaidInputSimBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentEsimPostpaidInputSimBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_esim_postpaid_input_sim, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayout getRoot() {
        return this.f83833a;
    }
}