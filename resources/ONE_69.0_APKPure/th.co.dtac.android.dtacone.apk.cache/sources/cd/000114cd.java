package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.widget.view.DtacFontButton;
import th.p047co.dtac.android.dtacone.widget.view.DtacFontTextView;

/* renamed from: th.co.dtac.android.dtacone.databinding.CustomAlertDialogOneButtonWithImageBinding */
/* loaded from: classes7.dex */
public final class CustomAlertDialogOneButtonWithImageBinding implements ViewBinding {

    /* renamed from: a */
    public final RelativeLayout f83704a;
    @NonNull
    public final DtacFontButton btnPositive;
    @NonNull
    public final ImageView ivDialogImage;
    @NonNull
    public final DtacFontTextView tvMessage;

    public CustomAlertDialogOneButtonWithImageBinding(RelativeLayout relativeLayout, DtacFontButton dtacFontButton, ImageView imageView, DtacFontTextView dtacFontTextView) {
        this.f83704a = relativeLayout;
        this.btnPositive = dtacFontButton;
        this.ivDialogImage = imageView;
        this.tvMessage = dtacFontTextView;
    }

    @NonNull
    public static CustomAlertDialogOneButtonWithImageBinding bind(@NonNull View view) {
        int i = R.id.btnPositive;
        DtacFontButton dtacFontButton = (DtacFontButton) ViewBindings.findChildViewById(view, i);
        if (dtacFontButton != null) {
            i = R.id.ivDialogImage;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
            if (imageView != null) {
                i = R.id.tvMessage;
                DtacFontTextView dtacFontTextView = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                if (dtacFontTextView != null) {
                    return new CustomAlertDialogOneButtonWithImageBinding((RelativeLayout) view, dtacFontButton, imageView, dtacFontTextView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static CustomAlertDialogOneButtonWithImageBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static CustomAlertDialogOneButtonWithImageBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.custom_alert_dialog_one_button_with_image, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public RelativeLayout getRoot() {
        return this.f83704a;
    }
}