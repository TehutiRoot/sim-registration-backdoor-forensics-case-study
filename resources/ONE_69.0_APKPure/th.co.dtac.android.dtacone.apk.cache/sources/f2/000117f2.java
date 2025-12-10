package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.widget.view.DtacFontTextView;

/* renamed from: th.co.dtac.android.dtacone.databinding.LayoutDialogSendQrSuccessBinding */
/* loaded from: classes7.dex */
public final class LayoutDialogSendQrSuccessBinding implements ViewBinding {
    @NonNull
    public final ImageView Icon;

    /* renamed from: a */
    public final ConstraintLayout f84513a;
    @NonNull
    public final DtacFontTextView tvMessage;
    @NonNull
    public final DtacFontTextView tvTitle;

    public LayoutDialogSendQrSuccessBinding(ConstraintLayout constraintLayout, ImageView imageView, DtacFontTextView dtacFontTextView, DtacFontTextView dtacFontTextView2) {
        this.f84513a = constraintLayout;
        this.Icon = imageView;
        this.tvMessage = dtacFontTextView;
        this.tvTitle = dtacFontTextView2;
    }

    @NonNull
    public static LayoutDialogSendQrSuccessBinding bind(@NonNull View view) {
        int i = R.id.Icon;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
        if (imageView != null) {
            i = R.id.tvMessage;
            DtacFontTextView dtacFontTextView = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
            if (dtacFontTextView != null) {
                i = R.id.tvTitle;
                DtacFontTextView dtacFontTextView2 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                if (dtacFontTextView2 != null) {
                    return new LayoutDialogSendQrSuccessBinding((ConstraintLayout) view, imageView, dtacFontTextView, dtacFontTextView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static LayoutDialogSendQrSuccessBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static LayoutDialogSendQrSuccessBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.layout_dialog_send_qr_success, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.f84513a;
    }
}