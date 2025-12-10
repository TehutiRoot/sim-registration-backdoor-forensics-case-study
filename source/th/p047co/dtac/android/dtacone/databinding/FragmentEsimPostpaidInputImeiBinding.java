package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import th.p047co.dtac.android.dtacone.R;

/* renamed from: th.co.dtac.android.dtacone.databinding.FragmentEsimPostpaidInputImeiBinding */
/* loaded from: classes7.dex */
public final class FragmentEsimPostpaidInputImeiBinding implements ViewBinding {

    /* renamed from: a */
    public final LinearLayout f83734a;

    public FragmentEsimPostpaidInputImeiBinding(LinearLayout linearLayout) {
        this.f83734a = linearLayout;
    }

    @NonNull
    public static FragmentEsimPostpaidInputImeiBinding bind(@NonNull View view) {
        if (view != null) {
            return new FragmentEsimPostpaidInputImeiBinding((LinearLayout) view);
        }
        throw new NullPointerException("rootView");
    }

    @NonNull
    public static FragmentEsimPostpaidInputImeiBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentEsimPostpaidInputImeiBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_esim_postpaid_input_imei, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayout getRoot() {
        return this.f83734a;
    }
}
