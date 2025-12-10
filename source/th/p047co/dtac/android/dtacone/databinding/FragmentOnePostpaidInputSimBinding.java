package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import th.p047co.dtac.android.dtacone.R;

/* renamed from: th.co.dtac.android.dtacone.databinding.FragmentOnePostpaidInputSimBinding */
/* loaded from: classes7.dex */
public final class FragmentOnePostpaidInputSimBinding implements ViewBinding {

    /* renamed from: a */
    public final LinearLayout f84029a;

    public FragmentOnePostpaidInputSimBinding(LinearLayout linearLayout) {
        this.f84029a = linearLayout;
    }

    @NonNull
    public static FragmentOnePostpaidInputSimBinding bind(@NonNull View view) {
        if (view != null) {
            return new FragmentOnePostpaidInputSimBinding((LinearLayout) view);
        }
        throw new NullPointerException("rootView");
    }

    @NonNull
    public static FragmentOnePostpaidInputSimBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentOnePostpaidInputSimBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_one_postpaid_input_sim, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayout getRoot() {
        return this.f84029a;
    }
}
