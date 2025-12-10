package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.app_one.widget.OneFontButton;
import th.p047co.dtac.android.dtacone.app_one.widget.OneFontTextView;
import th.p047co.dtac.android.dtacone.widget.view.DtacSignaturePad;

/* renamed from: th.co.dtac.android.dtacone.databinding.DialogOneSignaturePadBlacklistConsentBinding */
/* loaded from: classes7.dex */
public final class DialogOneSignaturePadBlacklistConsentBinding implements ViewBinding {

    /* renamed from: a */
    public final ConstraintLayout f83732a;
    @NonNull
    public final ConstraintLayout bottomSheet;
    @NonNull
    public final OneFontButton btnSignatureConfirm;
    @NonNull
    public final OneFontTextView dtacFontTextView19;
    @NonNull
    public final ImageView ivClose;
    @NonNull
    public final OneFontTextView oneFontTextView;
    @NonNull
    public final FrameLayout signatureBox;
    @NonNull
    public final DtacSignaturePad signaturePad;
    @NonNull
    public final OneFontTextView tvReSign;

    public DialogOneSignaturePadBlacklistConsentBinding(ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2, OneFontButton oneFontButton, OneFontTextView oneFontTextView, ImageView imageView, OneFontTextView oneFontTextView2, FrameLayout frameLayout, DtacSignaturePad dtacSignaturePad, OneFontTextView oneFontTextView3) {
        this.f83732a = constraintLayout;
        this.bottomSheet = constraintLayout2;
        this.btnSignatureConfirm = oneFontButton;
        this.dtacFontTextView19 = oneFontTextView;
        this.ivClose = imageView;
        this.oneFontTextView = oneFontTextView2;
        this.signatureBox = frameLayout;
        this.signaturePad = dtacSignaturePad;
        this.tvReSign = oneFontTextView3;
    }

    @NonNull
    public static DialogOneSignaturePadBlacklistConsentBinding bind(@NonNull View view) {
        ConstraintLayout constraintLayout = (ConstraintLayout) view;
        int i = R.id.btnSignatureConfirm;
        OneFontButton oneFontButton = (OneFontButton) ViewBindings.findChildViewById(view, i);
        if (oneFontButton != null) {
            i = R.id.dtacFontTextView19;
            OneFontTextView oneFontTextView = (OneFontTextView) ViewBindings.findChildViewById(view, i);
            if (oneFontTextView != null) {
                i = R.id.ivClose;
                ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
                if (imageView != null) {
                    i = R.id.oneFontTextView;
                    OneFontTextView oneFontTextView2 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                    if (oneFontTextView2 != null) {
                        i = R.id.signatureBox;
                        FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, i);
                        if (frameLayout != null) {
                            i = R.id.signaturePad;
                            DtacSignaturePad dtacSignaturePad = (DtacSignaturePad) ViewBindings.findChildViewById(view, i);
                            if (dtacSignaturePad != null) {
                                i = R.id.tvReSign;
                                OneFontTextView oneFontTextView3 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                if (oneFontTextView3 != null) {
                                    return new DialogOneSignaturePadBlacklistConsentBinding(constraintLayout, constraintLayout, oneFontButton, oneFontTextView, imageView, oneFontTextView2, frameLayout, dtacSignaturePad, oneFontTextView3);
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
    public static DialogOneSignaturePadBlacklistConsentBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static DialogOneSignaturePadBlacklistConsentBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.dialog_one_signature_pad_blacklist_consent, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.f83732a;
    }
}