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

/* renamed from: th.co.dtac.android.dtacone.databinding.FragmentMrtrPostpaidChooseWithDeviceBinding */
/* loaded from: classes7.dex */
public final class FragmentMrtrPostpaidChooseWithDeviceBinding implements ViewBinding {

    /* renamed from: a */
    public final FrameLayout f83818a;
    @NonNull
    public final IncludeMrtrSelectTypeBinding incSelectType;

    public FragmentMrtrPostpaidChooseWithDeviceBinding(FrameLayout frameLayout, IncludeMrtrSelectTypeBinding includeMrtrSelectTypeBinding) {
        this.f83818a = frameLayout;
        this.incSelectType = includeMrtrSelectTypeBinding;
    }

    @NonNull
    public static FragmentMrtrPostpaidChooseWithDeviceBinding bind(@NonNull View view) {
        int i = R.id.incSelectType;
        View findChildViewById = ViewBindings.findChildViewById(view, i);
        if (findChildViewById != null) {
            return new FragmentMrtrPostpaidChooseWithDeviceBinding((FrameLayout) view, IncludeMrtrSelectTypeBinding.bind(findChildViewById));
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static FragmentMrtrPostpaidChooseWithDeviceBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentMrtrPostpaidChooseWithDeviceBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_mrtr_postpaid_choose_with_device, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public FrameLayout getRoot() {
        return this.f83818a;
    }
}
