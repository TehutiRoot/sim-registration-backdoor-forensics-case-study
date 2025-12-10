package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import th.p047co.dtac.android.dtacone.R;

/* renamed from: th.co.dtac.android.dtacone.databinding.FragmentOneChangeOwnerReadSmartCardBinding */
/* loaded from: classes7.dex */
public final class FragmentOneChangeOwnerReadSmartCardBinding implements ViewBinding {

    /* renamed from: a */
    public final ConstraintLayout f84008a;
    @NonNull
    public final OneIncludeReadIdCardBinding includeSmartCard;

    public FragmentOneChangeOwnerReadSmartCardBinding(ConstraintLayout constraintLayout, OneIncludeReadIdCardBinding oneIncludeReadIdCardBinding) {
        this.f84008a = constraintLayout;
        this.includeSmartCard = oneIncludeReadIdCardBinding;
    }

    @NonNull
    public static FragmentOneChangeOwnerReadSmartCardBinding bind(@NonNull View view) {
        int i = R.id.include_smart_card;
        View findChildViewById = ViewBindings.findChildViewById(view, i);
        if (findChildViewById != null) {
            return new FragmentOneChangeOwnerReadSmartCardBinding((ConstraintLayout) view, OneIncludeReadIdCardBinding.bind(findChildViewById));
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static FragmentOneChangeOwnerReadSmartCardBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentOneChangeOwnerReadSmartCardBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_one_change_owner_read_smart_card, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.f84008a;
    }
}