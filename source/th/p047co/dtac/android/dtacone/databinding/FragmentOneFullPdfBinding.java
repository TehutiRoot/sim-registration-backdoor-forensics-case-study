package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.github.barteksc.pdfviewer.PDFView;
import th.p047co.dtac.android.dtacone.R;

/* renamed from: th.co.dtac.android.dtacone.databinding.FragmentOneFullPdfBinding */
/* loaded from: classes7.dex */
public final class FragmentOneFullPdfBinding implements ViewBinding {

    /* renamed from: a */
    public final ConstraintLayout f83952a;
    @NonNull
    public final PDFView pdfView;

    public FragmentOneFullPdfBinding(ConstraintLayout constraintLayout, PDFView pDFView) {
        this.f83952a = constraintLayout;
        this.pdfView = pDFView;
    }

    @NonNull
    public static FragmentOneFullPdfBinding bind(@NonNull View view) {
        int i = R.id.pdfView;
        PDFView pDFView = (PDFView) ViewBindings.findChildViewById(view, i);
        if (pDFView != null) {
            return new FragmentOneFullPdfBinding((ConstraintLayout) view, pDFView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static FragmentOneFullPdfBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentOneFullPdfBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_one_full_pdf, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.f83952a;
    }
}
