package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
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

/* renamed from: th.co.dtac.android.dtacone.databinding.OneIncludeSignatureTrueBinding */
/* loaded from: classes7.dex */
public final class OneIncludeSignatureTrueBinding implements ViewBinding {

    /* renamed from: a */
    public final View f84487a;
    @NonNull
    public final OneFontButton confirmToUseSignatureButton;
    @NonNull
    public final OneFontTextView signatureHelperSubTitleTextView;
    @NonNull
    public final OneFontTextView signatureHelperTextView;
    @NonNull
    public final ImageView signatureImageView;
    @NonNull
    public final ConstraintLayout signatureLayout;
    @NonNull
    public final OneFontTextView signatureTitleTextView;
    @NonNull
    public final CardView termsAndConditionCardView;
    @NonNull
    public final ImageView termsAndConditionImageView;
    @NonNull
    public final ConstraintLayout termsAndConditionLayout;
    @NonNull
    public final ImageView termsAndConditionMultilineImageView;
    @NonNull
    public final OneFontTextView termsAndConditionMultilineTextView;
    @NonNull
    public final PDFView termsAndConditionPDFView;
    @NonNull
    public final OneFontTextView termsAndConditionTextView;

    public OneIncludeSignatureTrueBinding(View view, OneFontButton oneFontButton, OneFontTextView oneFontTextView, OneFontTextView oneFontTextView2, ImageView imageView, ConstraintLayout constraintLayout, OneFontTextView oneFontTextView3, CardView cardView, ImageView imageView2, ConstraintLayout constraintLayout2, ImageView imageView3, OneFontTextView oneFontTextView4, PDFView pDFView, OneFontTextView oneFontTextView5) {
        this.f84487a = view;
        this.confirmToUseSignatureButton = oneFontButton;
        this.signatureHelperSubTitleTextView = oneFontTextView;
        this.signatureHelperTextView = oneFontTextView2;
        this.signatureImageView = imageView;
        this.signatureLayout = constraintLayout;
        this.signatureTitleTextView = oneFontTextView3;
        this.termsAndConditionCardView = cardView;
        this.termsAndConditionImageView = imageView2;
        this.termsAndConditionLayout = constraintLayout2;
        this.termsAndConditionMultilineImageView = imageView3;
        this.termsAndConditionMultilineTextView = oneFontTextView4;
        this.termsAndConditionPDFView = pDFView;
        this.termsAndConditionTextView = oneFontTextView5;
    }

    @NonNull
    public static OneIncludeSignatureTrueBinding bind(@NonNull View view) {
        int i = R.id.confirmToUseSignatureButton;
        OneFontButton oneFontButton = (OneFontButton) ViewBindings.findChildViewById(view, i);
        if (oneFontButton != null) {
            i = R.id.signatureHelperSubTitleTextView;
            OneFontTextView oneFontTextView = (OneFontTextView) ViewBindings.findChildViewById(view, i);
            if (oneFontTextView != null) {
                i = R.id.signatureHelperTextView;
                OneFontTextView oneFontTextView2 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                if (oneFontTextView2 != null) {
                    i = R.id.signatureImageView;
                    ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
                    if (imageView != null) {
                        i = R.id.signatureLayout;
                        ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
                        if (constraintLayout != null) {
                            i = R.id.signatureTitleTextView;
                            OneFontTextView oneFontTextView3 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                            if (oneFontTextView3 != null) {
                                i = R.id.termsAndConditionCardView;
                                CardView cardView = (CardView) ViewBindings.findChildViewById(view, i);
                                if (cardView != null) {
                                    i = R.id.termsAndConditionImageView;
                                    ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, i);
                                    if (imageView2 != null) {
                                        i = R.id.termsAndConditionLayout;
                                        ConstraintLayout constraintLayout2 = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
                                        if (constraintLayout2 != null) {
                                            i = R.id.termsAndConditionMultilineImageView;
                                            ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(view, i);
                                            if (imageView3 != null) {
                                                i = R.id.termsAndConditionMultilineTextView;
                                                OneFontTextView oneFontTextView4 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                                if (oneFontTextView4 != null) {
                                                    i = R.id.termsAndConditionPDFView;
                                                    PDFView pDFView = (PDFView) ViewBindings.findChildViewById(view, i);
                                                    if (pDFView != null) {
                                                        i = R.id.termsAndConditionTextView;
                                                        OneFontTextView oneFontTextView5 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                                        if (oneFontTextView5 != null) {
                                                            return new OneIncludeSignatureTrueBinding(view, oneFontButton, oneFontTextView, oneFontTextView2, imageView, constraintLayout, oneFontTextView3, cardView, imageView2, constraintLayout2, imageView3, oneFontTextView4, pDFView, oneFontTextView5);
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
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static OneIncludeSignatureTrueBinding inflate(@NonNull LayoutInflater layoutInflater, @NonNull ViewGroup viewGroup) {
        if (viewGroup != null) {
            layoutInflater.inflate(R.layout.one_include_signature_true, viewGroup);
            return bind(viewGroup);
        }
        throw new NullPointerException("parent");
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public View getRoot() {
        return this.f84487a;
    }
}
