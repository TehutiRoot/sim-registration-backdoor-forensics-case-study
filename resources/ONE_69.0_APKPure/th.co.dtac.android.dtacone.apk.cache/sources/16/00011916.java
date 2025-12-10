package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.widget.view.DtacFontButton;
import th.p047co.dtac.android.dtacone.widget.view.DtacFontTextView;
import th.p047co.dtac.android.dtacone.widget.view.DtacSignaturePad;

/* renamed from: th.co.dtac.android.dtacone.databinding.ZSignatureSheetBinding */
/* loaded from: classes7.dex */
public final class ZSignatureSheetBinding implements ViewBinding {

    /* renamed from: a */
    public final ConstraintLayout f84805a;
    @NonNull
    public final DtacFontButton btnSignatureConfirm;
    @NonNull
    public final CardView cardView;
    @NonNull
    public final ImageView ivClose;
    @NonNull
    public final FrameLayout signatureBox;
    @NonNull
    public final DtacSignaturePad signaturePad;
    @NonNull
    public final DtacFontTextView tvReSign;

    public ZSignatureSheetBinding(ConstraintLayout constraintLayout, DtacFontButton dtacFontButton, CardView cardView, ImageView imageView, FrameLayout frameLayout, DtacSignaturePad dtacSignaturePad, DtacFontTextView dtacFontTextView) {
        this.f84805a = constraintLayout;
        this.btnSignatureConfirm = dtacFontButton;
        this.cardView = cardView;
        this.ivClose = imageView;
        this.signatureBox = frameLayout;
        this.signaturePad = dtacSignaturePad;
        this.tvReSign = dtacFontTextView;
    }

    @NonNull
    public static ZSignatureSheetBinding bind(@NonNull View view) {
        int i = R.id.btnSignatureConfirm;
        DtacFontButton dtacFontButton = (DtacFontButton) ViewBindings.findChildViewById(view, i);
        if (dtacFontButton != null) {
            i = R.id.cardView;
            CardView cardView = (CardView) ViewBindings.findChildViewById(view, i);
            if (cardView != null) {
                i = R.id.ivClose;
                ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
                if (imageView != null) {
                    i = R.id.signatureBox;
                    FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, i);
                    if (frameLayout != null) {
                        i = R.id.signaturePad;
                        DtacSignaturePad dtacSignaturePad = (DtacSignaturePad) ViewBindings.findChildViewById(view, i);
                        if (dtacSignaturePad != null) {
                            i = R.id.tvReSign;
                            DtacFontTextView dtacFontTextView = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                            if (dtacFontTextView != null) {
                                return new ZSignatureSheetBinding((ConstraintLayout) view, dtacFontButton, cardView, imageView, frameLayout, dtacSignaturePad, dtacFontTextView);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static ZSignatureSheetBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ZSignatureSheetBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.z_signature_sheet, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.f84805a;
    }
}