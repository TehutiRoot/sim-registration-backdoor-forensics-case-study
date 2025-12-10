package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.percentlayout.widget.PercentRelativeLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.widget.view.DtacFontTextView;

/* renamed from: th.co.dtac.android.dtacone.databinding.ZIncludeScanBarcodeBinding */
/* loaded from: classes7.dex */
public final class ZIncludeScanBarcodeBinding implements ViewBinding {

    /* renamed from: a */
    public final PercentRelativeLayout f84653a;
    @NonNull
    public final FrameLayout contentCamera;
    @NonNull
    public final DtacFontTextView tvScanHelper;

    public ZIncludeScanBarcodeBinding(PercentRelativeLayout percentRelativeLayout, FrameLayout frameLayout, DtacFontTextView dtacFontTextView) {
        this.f84653a = percentRelativeLayout;
        this.contentCamera = frameLayout;
        this.tvScanHelper = dtacFontTextView;
    }

    @NonNull
    public static ZIncludeScanBarcodeBinding bind(@NonNull View view) {
        int i = R.id.contentCamera;
        FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, i);
        if (frameLayout != null) {
            i = R.id.tvScanHelper;
            DtacFontTextView dtacFontTextView = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
            if (dtacFontTextView != null) {
                return new ZIncludeScanBarcodeBinding((PercentRelativeLayout) view, frameLayout, dtacFontTextView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static ZIncludeScanBarcodeBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ZIncludeScanBarcodeBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.z_include_scan_barcode, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public PercentRelativeLayout getRoot() {
        return this.f84653a;
    }
}
