package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import th.p047co.dtac.android.dtacone.R;

/* renamed from: th.co.dtac.android.dtacone.databinding.FragmentOnePostpaidInputImeiBinding */
/* loaded from: classes7.dex */
public final class FragmentOnePostpaidInputImeiBinding implements ViewBinding {

    /* renamed from: a */
    public final LinearLayout f84131a;

    public FragmentOnePostpaidInputImeiBinding(LinearLayout linearLayout) {
        this.f84131a = linearLayout;
    }

    @NonNull
    public static FragmentOnePostpaidInputImeiBinding bind(@NonNull View view) {
        if (view != null) {
            return new FragmentOnePostpaidInputImeiBinding((LinearLayout) view);
        }
        throw new NullPointerException("rootView");
    }

    @NonNull
    public static FragmentOnePostpaidInputImeiBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentOnePostpaidInputImeiBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_one_postpaid_input_imei, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayout getRoot() {
        return this.f84131a;
    }
}