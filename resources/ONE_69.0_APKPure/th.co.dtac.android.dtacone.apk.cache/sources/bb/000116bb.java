package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import th.p047co.dtac.android.dtacone.R;

/* renamed from: th.co.dtac.android.dtacone.databinding.FragmentOneRegisterTrueOnlineDiscountListBinding */
/* loaded from: classes7.dex */
public final class FragmentOneRegisterTrueOnlineDiscountListBinding implements ViewBinding {

    /* renamed from: a */
    public final FrameLayout f84202a;

    public FragmentOneRegisterTrueOnlineDiscountListBinding(FrameLayout frameLayout) {
        this.f84202a = frameLayout;
    }

    @NonNull
    public static FragmentOneRegisterTrueOnlineDiscountListBinding bind(@NonNull View view) {
        if (view != null) {
            return new FragmentOneRegisterTrueOnlineDiscountListBinding((FrameLayout) view);
        }
        throw new NullPointerException("rootView");
    }

    @NonNull
    public static FragmentOneRegisterTrueOnlineDiscountListBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentOneRegisterTrueOnlineDiscountListBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_one_register_true_online_discount_list, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public FrameLayout getRoot() {
        return this.f84202a;
    }
}