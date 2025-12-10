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

/* renamed from: th.co.dtac.android.dtacone.databinding.ActivityOneBuyDol3DsBinding */
/* loaded from: classes7.dex */
public final class ActivityOneBuyDol3DsBinding implements ViewBinding {

    /* renamed from: a */
    public final ConstraintLayout f83629a;
    @NonNull
    public final FrameLayout buyDol3DsContainer;
    @NonNull
    public final OneToolbarBinding oneBuyDol3DsToolbar;

    public ActivityOneBuyDol3DsBinding(ConstraintLayout constraintLayout, FrameLayout frameLayout, OneToolbarBinding oneToolbarBinding) {
        this.f83629a = constraintLayout;
        this.buyDol3DsContainer = frameLayout;
        this.oneBuyDol3DsToolbar = oneToolbarBinding;
    }

    @NonNull
    public static ActivityOneBuyDol3DsBinding bind(@NonNull View view) {
        View findChildViewById;
        int i = R.id.buyDol3DsContainer;
        FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, i);
        if (frameLayout != null && (findChildViewById = ViewBindings.findChildViewById(view, (i = R.id.oneBuyDol3DsToolbar))) != null) {
            return new ActivityOneBuyDol3DsBinding((ConstraintLayout) view, frameLayout, OneToolbarBinding.bind(findChildViewById));
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static ActivityOneBuyDol3DsBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ActivityOneBuyDol3DsBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.activity_one_buy_dol3_ds, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.f83629a;
    }
}