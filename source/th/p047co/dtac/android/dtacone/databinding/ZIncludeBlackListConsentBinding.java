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
import com.github.barteksc.pdfviewer.PDFView;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.widget.view.DtacFontButton;
import th.p047co.dtac.android.dtacone.widget.view.DtacFontTextView;

/* renamed from: th.co.dtac.android.dtacone.databinding.ZIncludeBlackListConsentBinding */
/* loaded from: classes7.dex */
public final class ZIncludeBlackListConsentBinding implements ViewBinding {

    /* renamed from: a */
    public final ConstraintLayout f84614a;
    @NonNull
    public final DtacFontButton btnConfirm;
    @NonNull
    public final CardView cardCondition;
    @NonNull
    public final DtacFontTextView dtacFontTextView18;
    @NonNull
    public final ImageView imageView18;
    @NonNull
    public final ImageView ivSignature;
    @NonNull
    public final PDFView pdfView;
    @NonNull
    public final FrameLayout signatureBox;
    @NonNull
    public final ConstraintLayout topBar;
    @NonNull
    public final DtacFontTextView tvSignature;
    @NonNull
    public final DtacFontTextView tvSignatureHelper;
    @NonNull
    public final DtacFontTextView tvSignatureTextHelper;

    public ZIncludeBlackListConsentBinding(ConstraintLayout constraintLayout, DtacFontButton dtacFontButton, CardView cardView, DtacFontTextView dtacFontTextView, ImageView imageView, ImageView imageView2, PDFView pDFView, FrameLayout frameLayout, ConstraintLayout constraintLayout2, DtacFontTextView dtacFontTextView2, DtacFontTextView dtacFontTextView3, DtacFontTextView dtacFontTextView4) {
        this.f84614a = constraintLayout;
        this.btnConfirm = dtacFontButton;
        this.cardCondition = cardView;
        this.dtacFontTextView18 = dtacFontTextView;
        this.imageView18 = imageView;
        this.ivSignature = imageView2;
        this.pdfView = pDFView;
        this.signatureBox = frameLayout;
        this.topBar = constraintLayout2;
        this.tvSignature = dtacFontTextView2;
        this.tvSignatureHelper = dtacFontTextView3;
        this.tvSignatureTextHelper = dtacFontTextView4;
    }

    @NonNull
    public static ZIncludeBlackListConsentBinding bind(@NonNull View view) {
        int i = R.id.btnConfirm;
        DtacFontButton dtacFontButton = (DtacFontButton) ViewBindings.findChildViewById(view, i);
        if (dtacFontButton != null) {
            i = R.id.cardCondition;
            CardView cardView = (CardView) ViewBindings.findChildViewById(view, i);
            if (cardView != null) {
                i = R.id.dtacFontTextView18;
                DtacFontTextView dtacFontTextView = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                if (dtacFontTextView != null) {
                    i = R.id.imageView18;
                    ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
                    if (imageView != null) {
                        i = R.id.ivSignature;
                        ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, i);
                        if (imageView2 != null) {
                            i = R.id.pdfView;
                            PDFView pDFView = (PDFView) ViewBindings.findChildViewById(view, i);
                            if (pDFView != null) {
                                i = R.id.signatureBox;
                                FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, i);
                                if (frameLayout != null) {
                                    i = R.id.topBar;
                                    ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
                                    if (constraintLayout != null) {
                                        i = R.id.tvSignature;
                                        DtacFontTextView dtacFontTextView2 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                                        if (dtacFontTextView2 != null) {
                                            i = R.id.tvSignatureHelper;
                                            DtacFontTextView dtacFontTextView3 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                                            if (dtacFontTextView3 != null) {
                                                i = R.id.tvSignatureTextHelper;
                                                DtacFontTextView dtacFontTextView4 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                                                if (dtacFontTextView4 != null) {
                                                    return new ZIncludeBlackListConsentBinding((ConstraintLayout) view, dtacFontButton, cardView, dtacFontTextView, imageView, imageView2, pDFView, frameLayout, constraintLayout, dtacFontTextView2, dtacFontTextView3, dtacFontTextView4);
                                                }
                                            }
                                        }
                                    }
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
    public static ZIncludeBlackListConsentBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ZIncludeBlackListConsentBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.z_include_black_list_consent, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.f84614a;
    }
}
