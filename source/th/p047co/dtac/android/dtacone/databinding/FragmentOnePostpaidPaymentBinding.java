package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import th.p047co.dtac.android.dtacone.R;

/* renamed from: th.co.dtac.android.dtacone.databinding.FragmentOnePostpaidPaymentBinding */
/* loaded from: classes7.dex */
public final class FragmentOnePostpaidPaymentBinding implements ViewBinding {

    /* renamed from: a */
    public final ConstraintLayout f84036a;
    @NonNull
    public final ConstraintLayout layoutRoot;
    @NonNull
    public final NestedScrollView layoutScrollView;

    public FragmentOnePostpaidPaymentBinding(ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2, NestedScrollView nestedScrollView) {
        this.f84036a = constraintLayout;
        this.layoutRoot = constraintLayout2;
        this.layoutScrollView = nestedScrollView;
    }

    @NonNull
    public static FragmentOnePostpaidPaymentBinding bind(@NonNull View view) {
        ConstraintLayout constraintLayout = (ConstraintLayout) view;
        int i = R.id.layoutScrollView;
        NestedScrollView nestedScrollView = (NestedScrollView) ViewBindings.findChildViewById(view, i);
        if (nestedScrollView != null) {
            return new FragmentOnePostpaidPaymentBinding(constraintLayout, constraintLayout, nestedScrollView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static FragmentOnePostpaidPaymentBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentOnePostpaidPaymentBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_one_postpaid_payment, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.f84036a;
    }
}
