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

/* renamed from: th.co.dtac.android.dtacone.databinding.FragmentOneRegisterTrueOnlineSmartCardBinding */
/* loaded from: classes7.dex */
public final class FragmentOneRegisterTrueOnlineSmartCardBinding implements ViewBinding {

    /* renamed from: a */
    public final FrameLayout f84213a;
    @NonNull
    public final OneIncludeReadIdCardBinding incIdCardReader;

    public FragmentOneRegisterTrueOnlineSmartCardBinding(FrameLayout frameLayout, OneIncludeReadIdCardBinding oneIncludeReadIdCardBinding) {
        this.f84213a = frameLayout;
        this.incIdCardReader = oneIncludeReadIdCardBinding;
    }

    @NonNull
    public static FragmentOneRegisterTrueOnlineSmartCardBinding bind(@NonNull View view) {
        int i = R.id.incIdCardReader;
        View findChildViewById = ViewBindings.findChildViewById(view, i);
        if (findChildViewById != null) {
            return new FragmentOneRegisterTrueOnlineSmartCardBinding((FrameLayout) view, OneIncludeReadIdCardBinding.bind(findChildViewById));
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static FragmentOneRegisterTrueOnlineSmartCardBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentOneRegisterTrueOnlineSmartCardBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_one_register_true_online_smart_card, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public FrameLayout getRoot() {
        return this.f84213a;
    }
}