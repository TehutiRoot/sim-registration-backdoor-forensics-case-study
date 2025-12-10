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
import com.github.barteksc.pdfviewer.PDFView;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.widget.view.DtacFontTextView;

/* renamed from: th.co.dtac.android.dtacone.databinding.FragmentRtrWithholdingtaxPreviewBinding */
/* loaded from: classes7.dex */
public final class FragmentRtrWithholdingtaxPreviewBinding implements ViewBinding {

    /* renamed from: a */
    public final ConstraintLayout f84187a;
    @NonNull
    public final ConstraintLayout btnWithHoldingTaxPdf;
    @NonNull
    public final DtacFontTextView dtacFontTextView10;
    @NonNull
    public final ZIncRetryReloadBinding incRetryReload;
    @NonNull
    public final ImageView ivDownload;
    @NonNull
    public final PDFView pdfView;

    public FragmentRtrWithholdingtaxPreviewBinding(ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2, DtacFontTextView dtacFontTextView, ZIncRetryReloadBinding zIncRetryReloadBinding, ImageView imageView, PDFView pDFView) {
        this.f84187a = constraintLayout;
        this.btnWithHoldingTaxPdf = constraintLayout2;
        this.dtacFontTextView10 = dtacFontTextView;
        this.incRetryReload = zIncRetryReloadBinding;
        this.ivDownload = imageView;
        this.pdfView = pDFView;
    }

    @NonNull
    public static FragmentRtrWithholdingtaxPreviewBinding bind(@NonNull View view) {
        View findChildViewById;
        int i = R.id.btnWithHoldingTaxPdf;
        ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
        if (constraintLayout != null) {
            i = R.id.dtacFontTextView10;
            DtacFontTextView dtacFontTextView = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
            if (dtacFontTextView != null && (findChildViewById = ViewBindings.findChildViewById(view, (i = R.id.incRetryReload))) != null) {
                ZIncRetryReloadBinding bind = ZIncRetryReloadBinding.bind(findChildViewById);
                i = R.id.ivDownload;
                ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
                if (imageView != null) {
                    i = R.id.pdfView;
                    PDFView pDFView = (PDFView) ViewBindings.findChildViewById(view, i);
                    if (pDFView != null) {
                        return new FragmentRtrWithholdingtaxPreviewBinding((ConstraintLayout) view, constraintLayout, dtacFontTextView, bind, imageView, pDFView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static FragmentRtrWithholdingtaxPreviewBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentRtrWithholdingtaxPreviewBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_rtr_withholdingtax_preview, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.f84187a;
    }
}
