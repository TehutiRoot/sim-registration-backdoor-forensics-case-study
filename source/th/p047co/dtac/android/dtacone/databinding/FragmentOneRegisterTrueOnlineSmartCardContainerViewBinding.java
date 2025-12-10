package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.FragmentContainerView;
import androidx.viewbinding.ViewBinding;
import th.p047co.dtac.android.dtacone.R;

/* renamed from: th.co.dtac.android.dtacone.databinding.FragmentOneRegisterTrueOnlineSmartCardContainerViewBinding */
/* loaded from: classes7.dex */
public final class FragmentOneRegisterTrueOnlineSmartCardContainerViewBinding implements ViewBinding {

    /* renamed from: a */
    public final FragmentContainerView f84110a;
    @NonNull
    public final FragmentContainerView fragmentOneRegisterTrueOnlineSmartCardContainerView;

    public FragmentOneRegisterTrueOnlineSmartCardContainerViewBinding(FragmentContainerView fragmentContainerView, FragmentContainerView fragmentContainerView2) {
        this.f84110a = fragmentContainerView;
        this.fragmentOneRegisterTrueOnlineSmartCardContainerView = fragmentContainerView2;
    }

    @NonNull
    public static FragmentOneRegisterTrueOnlineSmartCardContainerViewBinding bind(@NonNull View view) {
        if (view != null) {
            FragmentContainerView fragmentContainerView = (FragmentContainerView) view;
            return new FragmentOneRegisterTrueOnlineSmartCardContainerViewBinding(fragmentContainerView, fragmentContainerView);
        }
        throw new NullPointerException("rootView");
    }

    @NonNull
    public static FragmentOneRegisterTrueOnlineSmartCardContainerViewBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentOneRegisterTrueOnlineSmartCardContainerViewBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_one_register_true_online_smart_card_container_view, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public FragmentContainerView getRoot() {
        return this.f84110a;
    }
}
