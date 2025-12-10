package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.widget.NestedScrollView;
import androidx.viewbinding.ViewBinding;
import th.p047co.dtac.android.dtacone.R;

/* renamed from: th.co.dtac.android.dtacone.databinding.FragmentPostpaidRegisSmartCardBinding */
/* loaded from: classes7.dex */
public final class FragmentPostpaidRegisSmartCardBinding implements ViewBinding {

    /* renamed from: a */
    public final NestedScrollView f84143a;

    public FragmentPostpaidRegisSmartCardBinding(NestedScrollView nestedScrollView) {
        this.f84143a = nestedScrollView;
    }

    @NonNull
    public static FragmentPostpaidRegisSmartCardBinding bind(@NonNull View view) {
        if (view != null) {
            return new FragmentPostpaidRegisSmartCardBinding((NestedScrollView) view);
        }
        throw new NullPointerException("rootView");
    }

    @NonNull
    public static FragmentPostpaidRegisSmartCardBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentPostpaidRegisSmartCardBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_postpaid_regis_smart_card, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public NestedScrollView getRoot() {
        return this.f84143a;
    }
}
