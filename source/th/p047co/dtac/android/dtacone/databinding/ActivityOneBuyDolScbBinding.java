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

/* renamed from: th.co.dtac.android.dtacone.databinding.ActivityOneBuyDolScbBinding */
/* loaded from: classes7.dex */
public final class ActivityOneBuyDolScbBinding implements ViewBinding {

    /* renamed from: a */
    public final ConstraintLayout f83534a;
    @NonNull
    public final FrameLayout oneBuyDolScbContainer;
    @NonNull
    public final OneToolbarBinding oneBuyDolScbToolbar;

    public ActivityOneBuyDolScbBinding(ConstraintLayout constraintLayout, FrameLayout frameLayout, OneToolbarBinding oneToolbarBinding) {
        this.f83534a = constraintLayout;
        this.oneBuyDolScbContainer = frameLayout;
        this.oneBuyDolScbToolbar = oneToolbarBinding;
    }

    @NonNull
    public static ActivityOneBuyDolScbBinding bind(@NonNull View view) {
        View findChildViewById;
        int i = R.id.oneBuyDolScbContainer;
        FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, i);
        if (frameLayout != null && (findChildViewById = ViewBindings.findChildViewById(view, (i = R.id.oneBuyDolScbToolbar))) != null) {
            return new ActivityOneBuyDolScbBinding((ConstraintLayout) view, frameLayout, OneToolbarBinding.bind(findChildViewById));
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static ActivityOneBuyDolScbBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ActivityOneBuyDolScbBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.activity_one_buy_dol_scb, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.f83534a;
    }
}
