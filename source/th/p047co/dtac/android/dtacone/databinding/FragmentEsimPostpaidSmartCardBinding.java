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

/* renamed from: th.co.dtac.android.dtacone.databinding.FragmentEsimPostpaidSmartCardBinding */
/* loaded from: classes7.dex */
public final class FragmentEsimPostpaidSmartCardBinding implements ViewBinding {

    /* renamed from: a */
    public final FrameLayout f83738a;
    @NonNull
    public final ZIncludeReadIdCardBinding incIdCardReader;

    public FragmentEsimPostpaidSmartCardBinding(FrameLayout frameLayout, ZIncludeReadIdCardBinding zIncludeReadIdCardBinding) {
        this.f83738a = frameLayout;
        this.incIdCardReader = zIncludeReadIdCardBinding;
    }

    @NonNull
    public static FragmentEsimPostpaidSmartCardBinding bind(@NonNull View view) {
        int i = R.id.incIdCardReader;
        View findChildViewById = ViewBindings.findChildViewById(view, i);
        if (findChildViewById != null) {
            return new FragmentEsimPostpaidSmartCardBinding((FrameLayout) view, ZIncludeReadIdCardBinding.bind(findChildViewById));
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static FragmentEsimPostpaidSmartCardBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentEsimPostpaidSmartCardBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_esim_postpaid_smart_card, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public FrameLayout getRoot() {
        return this.f83738a;
    }
}
