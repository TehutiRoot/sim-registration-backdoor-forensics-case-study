package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.widget.NestedScrollView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import th.p047co.dtac.android.dtacone.R;

/* renamed from: th.co.dtac.android.dtacone.databinding.FragmentChangeSimSmartCardBinding */
/* loaded from: classes7.dex */
public final class FragmentChangeSimSmartCardBinding implements ViewBinding {

    /* renamed from: a */
    public final NestedScrollView f83775a;
    @NonNull
    public final ZIncludeReadIdCardBinding incIdCardReader;

    public FragmentChangeSimSmartCardBinding(NestedScrollView nestedScrollView, ZIncludeReadIdCardBinding zIncludeReadIdCardBinding) {
        this.f83775a = nestedScrollView;
        this.incIdCardReader = zIncludeReadIdCardBinding;
    }

    @NonNull
    public static FragmentChangeSimSmartCardBinding bind(@NonNull View view) {
        int i = R.id.incIdCardReader;
        View findChildViewById = ViewBindings.findChildViewById(view, i);
        if (findChildViewById != null) {
            return new FragmentChangeSimSmartCardBinding((NestedScrollView) view, ZIncludeReadIdCardBinding.bind(findChildViewById));
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static FragmentChangeSimSmartCardBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentChangeSimSmartCardBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_change_sim_smart_card, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public NestedScrollView getRoot() {
        return this.f83775a;
    }
}