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
import th.p047co.dtac.android.dtacone.widget.view.DtacFontTextView;

/* renamed from: th.co.dtac.android.dtacone.databinding.FragmentMrtrPostpaidScanSimBinding */
/* loaded from: classes7.dex */
public final class FragmentMrtrPostpaidScanSimBinding implements ViewBinding {

    /* renamed from: a */
    public final ConstraintLayout f83939a;
    @NonNull
    public final FrameLayout contentCamera;
    @NonNull
    public final Guideline guidelineTextHelper;
    @NonNull
    public final IncludeSwitchModeWithDeviceBinding incSwitchMode;
    @NonNull
    public final DtacFontTextView tvScanHelper;

    public FragmentMrtrPostpaidScanSimBinding(ConstraintLayout constraintLayout, FrameLayout frameLayout, Guideline guideline, IncludeSwitchModeWithDeviceBinding includeSwitchModeWithDeviceBinding, DtacFontTextView dtacFontTextView) {
        this.f83939a = constraintLayout;
        this.contentCamera = frameLayout;
        this.guidelineTextHelper = guideline;
        this.incSwitchMode = includeSwitchModeWithDeviceBinding;
        this.tvScanHelper = dtacFontTextView;
    }

    @NonNull
    public static FragmentMrtrPostpaidScanSimBinding bind(@NonNull View view) {
        View findChildViewById;
        int i = R.id.contentCamera;
        FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, i);
        if (frameLayout != null) {
            i = R.id.guidelineTextHelper;
            Guideline guideline = (Guideline) ViewBindings.findChildViewById(view, i);
            if (guideline != null && (findChildViewById = ViewBindings.findChildViewById(view, (i = R.id.incSwitchMode))) != null) {
                IncludeSwitchModeWithDeviceBinding bind = IncludeSwitchModeWithDeviceBinding.bind(findChildViewById);
                i = R.id.tvScanHelper;
                DtacFontTextView dtacFontTextView = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                if (dtacFontTextView != null) {
                    return new FragmentMrtrPostpaidScanSimBinding((ConstraintLayout) view, frameLayout, guideline, bind, dtacFontTextView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static FragmentMrtrPostpaidScanSimBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentMrtrPostpaidScanSimBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_mrtr_postpaid_scan_sim, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.f83939a;
    }
}