package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import th.p047co.dtac.android.dtacone.R;

/* renamed from: th.co.dtac.android.dtacone.databinding.FragmentOnePostpaidSmartCardBinding */
/* loaded from: classes7.dex */
public final class FragmentOnePostpaidSmartCardBinding implements ViewBinding {

    /* renamed from: a */
    public final FrameLayout f84045a;
    @NonNull
    public final OneIncludeReadIdCardBinding incReadIdCard;

    public FragmentOnePostpaidSmartCardBinding(FrameLayout frameLayout, OneIncludeReadIdCardBinding oneIncludeReadIdCardBinding) {
        this.f84045a = frameLayout;
        this.incReadIdCard = oneIncludeReadIdCardBinding;
    }

    @NonNull
    public static FragmentOnePostpaidSmartCardBinding bind(@NonNull View view) {
        int i = R.id.incReadIdCard;
        View findChildViewById = ViewBindings.findChildViewById(view, i);
        if (findChildViewById != null) {
            return new FragmentOnePostpaidSmartCardBinding((FrameLayout) view, OneIncludeReadIdCardBinding.bind(findChildViewById));
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static FragmentOnePostpaidSmartCardBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentOnePostpaidSmartCardBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_one_postpaid_smart_card, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public FrameLayout getRoot() {
        return this.f84045a;
    }
}
