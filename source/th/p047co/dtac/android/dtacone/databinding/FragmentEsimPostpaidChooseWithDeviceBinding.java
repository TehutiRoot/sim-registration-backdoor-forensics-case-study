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

/* renamed from: th.co.dtac.android.dtacone.databinding.FragmentEsimPostpaidChooseWithDeviceBinding */
/* loaded from: classes7.dex */
public final class FragmentEsimPostpaidChooseWithDeviceBinding implements ViewBinding {

    /* renamed from: a */
    public final FrameLayout f83727a;
    @NonNull
    public final IncludeMrtrSelectTypeBinding incSelectType;

    public FragmentEsimPostpaidChooseWithDeviceBinding(FrameLayout frameLayout, IncludeMrtrSelectTypeBinding includeMrtrSelectTypeBinding) {
        this.f83727a = frameLayout;
        this.incSelectType = includeMrtrSelectTypeBinding;
    }

    @NonNull
    public static FragmentEsimPostpaidChooseWithDeviceBinding bind(@NonNull View view) {
        int i = R.id.incSelectType;
        View findChildViewById = ViewBindings.findChildViewById(view, i);
        if (findChildViewById != null) {
            return new FragmentEsimPostpaidChooseWithDeviceBinding((FrameLayout) view, IncludeMrtrSelectTypeBinding.bind(findChildViewById));
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static FragmentEsimPostpaidChooseWithDeviceBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentEsimPostpaidChooseWithDeviceBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_esim_postpaid_choose_with_device, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public FrameLayout getRoot() {
        return this.f83727a;
    }
}
