package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.app_one.widget.OneFontTextView;

/* renamed from: th.co.dtac.android.dtacone.databinding.FragmentOnePostpaidScanSimBinding */
/* loaded from: classes7.dex */
public final class FragmentOnePostpaidScanSimBinding implements ViewBinding {

    /* renamed from: a */
    public final ConstraintLayout f84043a;
    @NonNull
    public final FrameLayout contentCamera;
    @NonNull
    public final Guideline guidelineTextHelper;
    @NonNull
    public final OneIncludeSwitchModeWithDeviceBinding includeSwitchMode;
    @NonNull
    public final OneFontTextView tvScanHelper;

    public FragmentOnePostpaidScanSimBinding(ConstraintLayout constraintLayout, FrameLayout frameLayout, Guideline guideline, OneIncludeSwitchModeWithDeviceBinding oneIncludeSwitchModeWithDeviceBinding, OneFontTextView oneFontTextView) {
        this.f84043a = constraintLayout;
        this.contentCamera = frameLayout;
        this.guidelineTextHelper = guideline;
        this.includeSwitchMode = oneIncludeSwitchModeWithDeviceBinding;
        this.tvScanHelper = oneFontTextView;
    }

    @NonNull
    public static FragmentOnePostpaidScanSimBinding bind(@NonNull View view) {
        View findChildViewById;
        int i = R.id.contentCamera;
        FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, i);
        if (frameLayout != null) {
            i = R.id.guidelineTextHelper;
            Guideline guideline = (Guideline) ViewBindings.findChildViewById(view, i);
            if (guideline != null && (findChildViewById = ViewBindings.findChildViewById(view, (i = R.id.includeSwitchMode))) != null) {
                OneIncludeSwitchModeWithDeviceBinding bind = OneIncludeSwitchModeWithDeviceBinding.bind(findChildViewById);
                i = R.id.tvScanHelper;
                OneFontTextView oneFontTextView = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                if (oneFontTextView != null) {
                    return new FragmentOnePostpaidScanSimBinding((ConstraintLayout) view, frameLayout, guideline, bind, oneFontTextView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static FragmentOnePostpaidScanSimBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentOnePostpaidScanSimBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_one_postpaid_scan_sim, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.f84043a;
    }
}
