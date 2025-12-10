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
import th.p047co.dtac.android.dtacone.app_one.widget.OneFontButton;
import th.p047co.dtac.android.dtacone.app_one.widget.OneFontTextView;
import th.p047co.dtac.android.dtacone.widget.view.DtacSignaturePad;

/* renamed from: th.co.dtac.android.dtacone.databinding.OneSignatureSheetBinding */
/* loaded from: classes7.dex */
public final class OneSignatureSheetBinding implements ViewBinding {

    /* renamed from: a */
    public final ConstraintLayout f84528a;
    @NonNull
    public final OneFontButton btnSignatureConfirm;
    @NonNull
    public final CardView cardView;
    @NonNull
    public final OneFontTextView dtacFontTextView19;
    @NonNull
    public final ImageView ivClose;
    @NonNull
    public final FrameLayout signatureBox;
    @NonNull
    public final DtacSignaturePad signaturePad;
    @NonNull
    public final OneFontTextView tvReSign;

    public OneSignatureSheetBinding(ConstraintLayout constraintLayout, OneFontButton oneFontButton, CardView cardView, OneFontTextView oneFontTextView, ImageView imageView, FrameLayout frameLayout, DtacSignaturePad dtacSignaturePad, OneFontTextView oneFontTextView2) {
        this.f84528a = constraintLayout;
        this.btnSignatureConfirm = oneFontButton;
        this.cardView = cardView;
        this.dtacFontTextView19 = oneFontTextView;
        this.ivClose = imageView;
        this.signatureBox = frameLayout;
        this.signaturePad = dtacSignaturePad;
        this.tvReSign = oneFontTextView2;
    }

    @NonNull
    public static OneSignatureSheetBinding bind(@NonNull View view) {
        int i = R.id.btnSignatureConfirm;
        OneFontButton oneFontButton = (OneFontButton) ViewBindings.findChildViewById(view, i);
        if (oneFontButton != null) {
            i = R.id.cardView;
            CardView cardView = (CardView) ViewBindings.findChildViewById(view, i);
            if (cardView != null) {
                i = R.id.dtacFontTextView19;
                OneFontTextView oneFontTextView = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                if (oneFontTextView != null) {
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
                                OneFontTextView oneFontTextView2 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                if (oneFontTextView2 != null) {
                                    return new OneSignatureSheetBinding((ConstraintLayout) view, oneFontButton, cardView, oneFontTextView, imageView, frameLayout, dtacSignaturePad, oneFontTextView2);
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static OneSignatureSheetBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static OneSignatureSheetBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.one_signature_sheet, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.f84528a;
    }
}
