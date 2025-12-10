package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.percentlayout.widget.PercentRelativeLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.widget.view.DtacFontButton;
import th.p047co.dtac.android.dtacone.widget.view.DtacFontTextView;

/* renamed from: th.co.dtac.android.dtacone.databinding.ZIncludeReadIdCardBinding */
/* loaded from: classes7.dex */
public final class ZIncludeReadIdCardBinding implements ViewBinding {

    /* renamed from: a */
    public final PercentRelativeLayout f84647a;
    @NonNull
    public final FrameLayout btnOpenCamera;
    @NonNull
    public final DtacFontButton btnSwitchMode;
    @NonNull
    public final ImageView ivSmartCard;
    @NonNull
    public final DtacFontButton tvCameraMode;
    @NonNull
    public final DtacFontTextView tvWarning;

    public ZIncludeReadIdCardBinding(PercentRelativeLayout percentRelativeLayout, FrameLayout frameLayout, DtacFontButton dtacFontButton, ImageView imageView, DtacFontButton dtacFontButton2, DtacFontTextView dtacFontTextView) {
        this.f84647a = percentRelativeLayout;
        this.btnOpenCamera = frameLayout;
        this.btnSwitchMode = dtacFontButton;
        this.ivSmartCard = imageView;
        this.tvCameraMode = dtacFontButton2;
        this.tvWarning = dtacFontTextView;
    }

    @NonNull
    public static ZIncludeReadIdCardBinding bind(@NonNull View view) {
        int i = R.id.btnOpenCamera;
        FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, i);
        if (frameLayout != null) {
            i = R.id.btnSwitchMode;
            DtacFontButton dtacFontButton = (DtacFontButton) ViewBindings.findChildViewById(view, i);
            if (dtacFontButton != null) {
                i = R.id.ivSmartCard;
                ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
                if (imageView != null) {
                    i = R.id.tvCameraMode;
                    DtacFontButton dtacFontButton2 = (DtacFontButton) ViewBindings.findChildViewById(view, i);
                    if (dtacFontButton2 != null) {
                        i = R.id.tvWarning;
                        DtacFontTextView dtacFontTextView = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                        if (dtacFontTextView != null) {
                            return new ZIncludeReadIdCardBinding((PercentRelativeLayout) view, frameLayout, dtacFontButton, imageView, dtacFontButton2, dtacFontTextView);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static ZIncludeReadIdCardBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ZIncludeReadIdCardBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.z_include_read_id_card, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public PercentRelativeLayout getRoot() {
        return this.f84647a;
    }
}
