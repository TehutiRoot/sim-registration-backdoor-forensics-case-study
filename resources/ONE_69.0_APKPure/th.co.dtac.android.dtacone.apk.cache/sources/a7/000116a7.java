package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import th.p047co.dtac.android.dtacone.R;

/* renamed from: th.co.dtac.android.dtacone.databinding.FragmentOnePre2postSelectPropositionBinding */
/* loaded from: classes7.dex */
public final class FragmentOnePre2postSelectPropositionBinding implements ViewBinding {

    /* renamed from: a */
    public final ConstraintLayout f84182a;
    @NonNull
    public final ConstraintLayout root;

    public FragmentOnePre2postSelectPropositionBinding(ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2) {
        this.f84182a = constraintLayout;
        this.root = constraintLayout2;
    }

    @NonNull
    public static FragmentOnePre2postSelectPropositionBinding bind(@NonNull View view) {
        if (view != null) {
            ConstraintLayout constraintLayout = (ConstraintLayout) view;
            return new FragmentOnePre2postSelectPropositionBinding(constraintLayout, constraintLayout);
        }
        throw new NullPointerException("rootView");
    }

    @NonNull
    public static FragmentOnePre2postSelectPropositionBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentOnePre2postSelectPropositionBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_one_pre2post_select_proposition, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.f84182a;
    }
}