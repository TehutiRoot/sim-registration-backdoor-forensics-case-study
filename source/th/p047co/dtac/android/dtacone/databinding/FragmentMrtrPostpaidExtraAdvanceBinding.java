package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import th.p047co.dtac.android.dtacone.R;

/* renamed from: th.co.dtac.android.dtacone.databinding.FragmentMrtrPostpaidExtraAdvanceBinding */
/* loaded from: classes7.dex */
public final class FragmentMrtrPostpaidExtraAdvanceBinding implements ViewBinding {

    /* renamed from: a */
    public final FrameLayout f83825a;

    public FragmentMrtrPostpaidExtraAdvanceBinding(FrameLayout frameLayout) {
        this.f83825a = frameLayout;
    }

    @NonNull
    public static FragmentMrtrPostpaidExtraAdvanceBinding bind(@NonNull View view) {
        if (view != null) {
            return new FragmentMrtrPostpaidExtraAdvanceBinding((FrameLayout) view);
        }
        throw new NullPointerException("rootView");
    }

    @NonNull
    public static FragmentMrtrPostpaidExtraAdvanceBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentMrtrPostpaidExtraAdvanceBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_mrtr_postpaid_extra_advance, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public FrameLayout getRoot() {
        return this.f83825a;
    }
}
