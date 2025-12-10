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
import th.p047co.dtac.android.dtacone.app_one.widget.OneFontButton;
import th.p047co.dtac.android.dtacone.app_one.widget.OneFontTextView;

/* renamed from: th.co.dtac.android.dtacone.databinding.OneCustomAlertDialogOneButtonWithImageBinding */
/* loaded from: classes7.dex */
public final class OneCustomAlertDialogOneButtonWithImageBinding implements ViewBinding {

    /* renamed from: a */
    public final RelativeLayout f84542a;
    @NonNull
    public final OneFontButton btnPositive;
    @NonNull
    public final ImageView ivDialogImage;
    @NonNull
    public final OneFontTextView tvMessage;

    public OneCustomAlertDialogOneButtonWithImageBinding(RelativeLayout relativeLayout, OneFontButton oneFontButton, ImageView imageView, OneFontTextView oneFontTextView) {
        this.f84542a = relativeLayout;
        this.btnPositive = oneFontButton;
        this.ivDialogImage = imageView;
        this.tvMessage = oneFontTextView;
    }

    @NonNull
    public static OneCustomAlertDialogOneButtonWithImageBinding bind(@NonNull View view) {
        int i = R.id.btnPositive;
        OneFontButton oneFontButton = (OneFontButton) ViewBindings.findChildViewById(view, i);
        if (oneFontButton != null) {
            i = R.id.ivDialogImage;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
            if (imageView != null) {
                i = R.id.tvMessage;
                OneFontTextView oneFontTextView = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                if (oneFontTextView != null) {
                    return new OneCustomAlertDialogOneButtonWithImageBinding((RelativeLayout) view, oneFontButton, imageView, oneFontTextView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static OneCustomAlertDialogOneButtonWithImageBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static OneCustomAlertDialogOneButtonWithImageBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.one_custom_alert_dialog_one_button_with_image, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public RelativeLayout getRoot() {
        return this.f84542a;
    }
}