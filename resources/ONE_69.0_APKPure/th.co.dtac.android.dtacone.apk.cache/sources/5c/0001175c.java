package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.github.barteksc.pdfviewer.PDFView;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.app_one.widget.OneFontButton;
import th.p047co.dtac.android.dtacone.app_one.widget.OneFontTextView;

/* renamed from: th.co.dtac.android.dtacone.databinding.IncludeOneDeviceSaleBlackListConsentBinding */
/* loaded from: classes7.dex */
public final class IncludeOneDeviceSaleBlackListConsentBinding implements ViewBinding {

    /* renamed from: a */
    public final View f84363a;
    @NonNull
    public final OneFontButton btnConfirm;
    @NonNull
    public final CardView cardCondition;
    @NonNull
    public final OneFontTextView dtacFontTextView18;
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
    public final OneFontTextView tvSignature;
    @NonNull
    public final OneFontTextView tvSignatureHelper;
    @NonNull
    public final OneFontTextView tvSignatureTextHelper;

    public IncludeOneDeviceSaleBlackListConsentBinding(View view, OneFontButton oneFontButton, CardView cardView, OneFontTextView oneFontTextView, ImageView imageView, ImageView imageView2, PDFView pDFView, FrameLayout frameLayout, ConstraintLayout constraintLayout, OneFontTextView oneFontTextView2, OneFontTextView oneFontTextView3, OneFontTextView oneFontTextView4) {
        this.f84363a = view;
        this.btnConfirm = oneFontButton;
        this.cardCondition = cardView;
        this.dtacFontTextView18 = oneFontTextView;
        this.imageView18 = imageView;
        this.ivSignature = imageView2;
        this.pdfView = pDFView;
        this.signatureBox = frameLayout;
        this.topBar = constraintLayout;
        this.tvSignature = oneFontTextView2;
        this.tvSignatureHelper = oneFontTextView3;
        this.tvSignatureTextHelper = oneFontTextView4;
    }

    @NonNull
    public static IncludeOneDeviceSaleBlackListConsentBinding bind(@NonNull View view) {
        int i = R.id.btnConfirm;
        OneFontButton oneFontButton = (OneFontButton) ViewBindings.findChildViewById(view, i);
        if (oneFontButton != null) {
            i = R.id.cardCondition;
            CardView cardView = (CardView) ViewBindings.findChildViewById(view, i);
            if (cardView != null) {
                i = R.id.dtacFontTextView18;
                OneFontTextView oneFontTextView = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                if (oneFontTextView != null) {
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
                                        OneFontTextView oneFontTextView2 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                        if (oneFontTextView2 != null) {
                                            i = R.id.tvSignatureHelper;
                                            OneFontTextView oneFontTextView3 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                            if (oneFontTextView3 != null) {
                                                i = R.id.tvSignatureTextHelper;
                                                OneFontTextView oneFontTextView4 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                                if (oneFontTextView4 != null) {
                                                    return new IncludeOneDeviceSaleBlackListConsentBinding(view, oneFontButton, cardView, oneFontTextView, imageView, imageView2, pDFView, frameLayout, constraintLayout, oneFontTextView2, oneFontTextView3, oneFontTextView4);
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
    public static IncludeOneDeviceSaleBlackListConsentBinding inflate(@NonNull LayoutInflater layoutInflater, @NonNull ViewGroup viewGroup) {
        if (viewGroup != null) {
            layoutInflater.inflate(R.layout.include_one_device_sale_black_list_consent, viewGroup);
            return bind(viewGroup);
        }
        throw new NullPointerException("parent");
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public View getRoot() {
        return this.f84363a;
    }
}