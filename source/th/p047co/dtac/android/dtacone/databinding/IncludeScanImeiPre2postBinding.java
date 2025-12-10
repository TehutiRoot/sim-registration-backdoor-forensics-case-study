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

/* renamed from: th.co.dtac.android.dtacone.databinding.IncludeScanImeiPre2postBinding */
/* loaded from: classes7.dex */
public final class IncludeScanImeiPre2postBinding implements ViewBinding {

    /* renamed from: a */
    public final ConstraintLayout f84291a;
    @NonNull
    public final FrameLayout contentCamera;
    @NonNull
    public final Guideline guidelineTextHelper;
    @NonNull
    public final IncludeSwitchModeWithDeviceBinding incSwitchMode;
    @NonNull
    public final DtacFontTextView tvScanHelper;
    @NonNull
    public final DtacFontTextView tvSkipScanIMEI;

    public IncludeScanImeiPre2postBinding(ConstraintLayout constraintLayout, FrameLayout frameLayout, Guideline guideline, IncludeSwitchModeWithDeviceBinding includeSwitchModeWithDeviceBinding, DtacFontTextView dtacFontTextView, DtacFontTextView dtacFontTextView2) {
        this.f84291a = constraintLayout;
        this.contentCamera = frameLayout;
        this.guidelineTextHelper = guideline;
        this.incSwitchMode = includeSwitchModeWithDeviceBinding;
        this.tvScanHelper = dtacFontTextView;
        this.tvSkipScanIMEI = dtacFontTextView2;
    }

    @NonNull
    public static IncludeScanImeiPre2postBinding bind(@NonNull View view) {
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
                    i = R.id.tvSkipScanIMEI;
                    DtacFontTextView dtacFontTextView2 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                    if (dtacFontTextView2 != null) {
                        return new IncludeScanImeiPre2postBinding((ConstraintLayout) view, frameLayout, guideline, bind, dtacFontTextView, dtacFontTextView2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static IncludeScanImeiPre2postBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static IncludeScanImeiPre2postBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.include_scan_imei_pre2post, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.f84291a;
    }
}
