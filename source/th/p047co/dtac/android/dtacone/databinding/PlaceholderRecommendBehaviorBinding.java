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

/* renamed from: th.co.dtac.android.dtacone.databinding.PlaceholderRecommendBehaviorBinding */
/* loaded from: classes7.dex */
public final class PlaceholderRecommendBehaviorBinding implements ViewBinding {

    /* renamed from: a */
    public final ConstraintLayout f84556a;
    @NonNull
    public final View line1;
    @NonNull
    public final View line2;
    @NonNull
    public final View oval;

    public PlaceholderRecommendBehaviorBinding(ConstraintLayout constraintLayout, View view, View view2, View view3) {
        this.f84556a = constraintLayout;
        this.line1 = view;
        this.line2 = view2;
        this.oval = view3;
    }

    @NonNull
    public static PlaceholderRecommendBehaviorBinding bind(@NonNull View view) {
        View findChildViewById;
        View findChildViewById2;
        int i = R.id.line1;
        View findChildViewById3 = ViewBindings.findChildViewById(view, i);
        if (findChildViewById3 != null && (findChildViewById = ViewBindings.findChildViewById(view, (i = R.id.line2))) != null && (findChildViewById2 = ViewBindings.findChildViewById(view, (i = R.id.oval))) != null) {
            return new PlaceholderRecommendBehaviorBinding((ConstraintLayout) view, findChildViewById3, findChildViewById, findChildViewById2);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static PlaceholderRecommendBehaviorBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static PlaceholderRecommendBehaviorBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.placeholder_recommend_behavior, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.f84556a;
    }
}
