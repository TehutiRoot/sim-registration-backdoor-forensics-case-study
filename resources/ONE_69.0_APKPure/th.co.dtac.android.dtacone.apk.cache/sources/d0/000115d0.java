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

/* renamed from: th.co.dtac.android.dtacone.databinding.FragmentMrtrPrepaidReregistReadIdCardBinding */
/* loaded from: classes7.dex */
public final class FragmentMrtrPrepaidReregistReadIdCardBinding implements ViewBinding {

    /* renamed from: a */
    public final ConstraintLayout f83967a;
    @NonNull
    public final ZIncludeReadIdCardBinding incIdCardReader;

    public FragmentMrtrPrepaidReregistReadIdCardBinding(ConstraintLayout constraintLayout, ZIncludeReadIdCardBinding zIncludeReadIdCardBinding) {
        this.f83967a = constraintLayout;
        this.incIdCardReader = zIncludeReadIdCardBinding;
    }

    @NonNull
    public static FragmentMrtrPrepaidReregistReadIdCardBinding bind(@NonNull View view) {
        int i = R.id.incIdCardReader;
        View findChildViewById = ViewBindings.findChildViewById(view, i);
        if (findChildViewById != null) {
            return new FragmentMrtrPrepaidReregistReadIdCardBinding((ConstraintLayout) view, ZIncludeReadIdCardBinding.bind(findChildViewById));
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static FragmentMrtrPrepaidReregistReadIdCardBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentMrtrPrepaidReregistReadIdCardBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_mrtr_prepaid_reregist_read_id_card, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.f83967a;
    }
}