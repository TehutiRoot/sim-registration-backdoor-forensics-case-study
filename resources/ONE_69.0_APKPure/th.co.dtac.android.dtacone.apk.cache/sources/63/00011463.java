package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import th.p047co.dtac.android.dtacone.R;

/* renamed from: th.co.dtac.android.dtacone.databinding.ActivityBuyDolScbBinding */
/* loaded from: classes7.dex */
public final class ActivityBuyDolScbBinding implements ViewBinding {

    /* renamed from: a */
    public final ConstraintLayout f83598a;
    @NonNull
    public final FrameLayout fragmentContainer;
    @NonNull
    public final ZToolbarBinding include2;

    public ActivityBuyDolScbBinding(ConstraintLayout constraintLayout, FrameLayout frameLayout, ZToolbarBinding zToolbarBinding) {
        this.f83598a = constraintLayout;
        this.fragmentContainer = frameLayout;
        this.include2 = zToolbarBinding;
    }

    @NonNull
    public static ActivityBuyDolScbBinding bind(@NonNull View view) {
        View findChildViewById;
        int i = R.id.fragmentContainer;
        FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, i);
        if (frameLayout != null && (findChildViewById = ViewBindings.findChildViewById(view, (i = R.id.include2))) != null) {
            return new ActivityBuyDolScbBinding((ConstraintLayout) view, frameLayout, ZToolbarBinding.bind(findChildViewById));
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static ActivityBuyDolScbBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ActivityBuyDolScbBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.activity_buy_dol_scb, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.f83598a;
    }
}