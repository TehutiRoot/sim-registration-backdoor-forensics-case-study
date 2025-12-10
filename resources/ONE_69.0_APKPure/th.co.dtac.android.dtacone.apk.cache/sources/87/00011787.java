package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.widget.view.DtacFontTextView;

/* renamed from: th.co.dtac.android.dtacone.databinding.InfoWindowDtacAtHomeBinding */
/* loaded from: classes7.dex */
public final class InfoWindowDtacAtHomeBinding implements ViewBinding {

    /* renamed from: a */
    public final LinearLayout f84406a;
    @NonNull
    public final ImageView ivIconCheck;
    @NonNull
    public final DtacFontTextView tvCheckDistance;
    @NonNull
    public final DtacFontTextView tvCheckPlaceTitle;
    @NonNull
    public final DtacFontTextView tvCheckPlaceValue;

    public InfoWindowDtacAtHomeBinding(LinearLayout linearLayout, ImageView imageView, DtacFontTextView dtacFontTextView, DtacFontTextView dtacFontTextView2, DtacFontTextView dtacFontTextView3) {
        this.f84406a = linearLayout;
        this.ivIconCheck = imageView;
        this.tvCheckDistance = dtacFontTextView;
        this.tvCheckPlaceTitle = dtacFontTextView2;
        this.tvCheckPlaceValue = dtacFontTextView3;
    }

    @NonNull
    public static InfoWindowDtacAtHomeBinding bind(@NonNull View view) {
        int i = R.id.ivIconCheck;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
        if (imageView != null) {
            i = R.id.tvCheckDistance;
            DtacFontTextView dtacFontTextView = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
            if (dtacFontTextView != null) {
                i = R.id.tvCheckPlaceTitle;
                DtacFontTextView dtacFontTextView2 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                if (dtacFontTextView2 != null) {
                    i = R.id.tvCheckPlaceValue;
                    DtacFontTextView dtacFontTextView3 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                    if (dtacFontTextView3 != null) {
                        return new InfoWindowDtacAtHomeBinding((LinearLayout) view, imageView, dtacFontTextView, dtacFontTextView2, dtacFontTextView3);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static InfoWindowDtacAtHomeBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static InfoWindowDtacAtHomeBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.info_window_dtac_at_home, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayout getRoot() {
        return this.f84406a;
    }
}