package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.percentlayout.widget.PercentRelativeLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.app_one.widget.OneFontTextView;

/* renamed from: th.co.dtac.android.dtacone.databinding.OneIncludeScanBarcodeBinding */
/* loaded from: classes7.dex */
public final class OneIncludeScanBarcodeBinding implements ViewBinding {

    /* renamed from: a */
    public final PercentRelativeLayout f84485a;
    @NonNull
    public final FrameLayout contentCamera;
    @NonNull
    public final CardView scanBarCodeCardView;
    @NonNull
    public final OneFontTextView scanBarCodeDetailTextView;
    @NonNull
    public final OneFontTextView scanBarCodeErrorCodeTextView;
    @NonNull
    public final OneFontTextView scanBarCodeTimeTextView;
    @NonNull
    public final OneFontTextView tvScanHelper;

    public OneIncludeScanBarcodeBinding(PercentRelativeLayout percentRelativeLayout, FrameLayout frameLayout, CardView cardView, OneFontTextView oneFontTextView, OneFontTextView oneFontTextView2, OneFontTextView oneFontTextView3, OneFontTextView oneFontTextView4) {
        this.f84485a = percentRelativeLayout;
        this.contentCamera = frameLayout;
        this.scanBarCodeCardView = cardView;
        this.scanBarCodeDetailTextView = oneFontTextView;
        this.scanBarCodeErrorCodeTextView = oneFontTextView2;
        this.scanBarCodeTimeTextView = oneFontTextView3;
        this.tvScanHelper = oneFontTextView4;
    }

    @NonNull
    public static OneIncludeScanBarcodeBinding bind(@NonNull View view) {
        int i = R.id.contentCamera;
        FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, i);
        if (frameLayout != null) {
            i = R.id.scanBarCodeCardView;
            CardView cardView = (CardView) ViewBindings.findChildViewById(view, i);
            if (cardView != null) {
                i = R.id.scanBarCodeDetailTextView;
                OneFontTextView oneFontTextView = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                if (oneFontTextView != null) {
                    i = R.id.scanBarCodeErrorCodeTextView;
                    OneFontTextView oneFontTextView2 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                    if (oneFontTextView2 != null) {
                        i = R.id.scanBarCodeTimeTextView;
                        OneFontTextView oneFontTextView3 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                        if (oneFontTextView3 != null) {
                            i = R.id.tvScanHelper;
                            OneFontTextView oneFontTextView4 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                            if (oneFontTextView4 != null) {
                                return new OneIncludeScanBarcodeBinding((PercentRelativeLayout) view, frameLayout, cardView, oneFontTextView, oneFontTextView2, oneFontTextView3, oneFontTextView4);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static OneIncludeScanBarcodeBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static OneIncludeScanBarcodeBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.one_include_scan_barcode, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public PercentRelativeLayout getRoot() {
        return this.f84485a;
    }
}
