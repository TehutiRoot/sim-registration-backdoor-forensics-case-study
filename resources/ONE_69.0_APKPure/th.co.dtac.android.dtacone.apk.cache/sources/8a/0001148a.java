package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.compose.p003ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import th.p047co.dtac.android.dtacone.R;

/* renamed from: th.co.dtac.android.dtacone.databinding.ActivityOneDeviceSaleTrueBinding */
/* loaded from: classes7.dex */
public final class ActivityOneDeviceSaleTrueBinding implements ViewBinding {

    /* renamed from: a */
    public final ConstraintLayout f83637a;
    @NonNull
    public final ComposeView composeView;
    @NonNull
    public final OneToolbarBinding includeToolbar;
    @NonNull
    public final ConstraintLayout main;
    @NonNull
    public final FrameLayout oneDeviceSaleContainer;

    public ActivityOneDeviceSaleTrueBinding(ConstraintLayout constraintLayout, ComposeView composeView, OneToolbarBinding oneToolbarBinding, ConstraintLayout constraintLayout2, FrameLayout frameLayout) {
        this.f83637a = constraintLayout;
        this.composeView = composeView;
        this.includeToolbar = oneToolbarBinding;
        this.main = constraintLayout2;
        this.oneDeviceSaleContainer = frameLayout;
    }

    @NonNull
    public static ActivityOneDeviceSaleTrueBinding bind(@NonNull View view) {
        View findChildViewById;
        int i = R.id.composeView;
        ComposeView composeView = (ComposeView) ViewBindings.findChildViewById(view, i);
        if (composeView != null && (findChildViewById = ViewBindings.findChildViewById(view, (i = R.id.include_toolbar))) != null) {
            OneToolbarBinding bind = OneToolbarBinding.bind(findChildViewById);
            ConstraintLayout constraintLayout = (ConstraintLayout) view;
            i = R.id.oneDeviceSaleContainer;
            FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, i);
            if (frameLayout != null) {
                return new ActivityOneDeviceSaleTrueBinding(constraintLayout, composeView, bind, constraintLayout, frameLayout);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static ActivityOneDeviceSaleTrueBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ActivityOneDeviceSaleTrueBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.activity_one_device_sale_true, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.f83637a;
    }
}