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
import androidx.constraintlayout.widget.Guideline;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.widget.view.DtacFontButton;
import th.p047co.dtac.android.dtacone.widget.view.DtacFontTextView;

/* renamed from: th.co.dtac.android.dtacone.databinding.FragmentMrtrMultiSimPrepaidScanBarcodeBinding */
/* loaded from: classes7.dex */
public final class FragmentMrtrMultiSimPrepaidScanBarcodeBinding implements ViewBinding {

    /* renamed from: a */
    public final ConstraintLayout f83807a;
    @NonNull
    public final DtacFontButton btnConfirm;
    @NonNull
    public final ConstraintLayout constraint;
    @NonNull
    public final FrameLayout contentCameraMulti;
    @NonNull
    public final DtacFontTextView dtacFontTextView58;
    @NonNull
    public final DtacFontTextView dtacFontTextView60;
    @NonNull
    public final Guideline guideline;
    @NonNull
    public final Guideline guideline2;
    @NonNull
    public final ImageView imageView37;
    @NonNull
    public final CardView layoutConfirm;
    @NonNull
    public final ConstraintLayout noData;
    @NonNull
    public final RecyclerView rvSubscriberList;
    @NonNull
    public final DtacFontTextView tvItemCont;
    @NonNull

    /* renamed from: v1 */
    public final View f83808v1;

    public FragmentMrtrMultiSimPrepaidScanBarcodeBinding(ConstraintLayout constraintLayout, DtacFontButton dtacFontButton, ConstraintLayout constraintLayout2, FrameLayout frameLayout, DtacFontTextView dtacFontTextView, DtacFontTextView dtacFontTextView2, Guideline guideline, Guideline guideline2, ImageView imageView, CardView cardView, ConstraintLayout constraintLayout3, RecyclerView recyclerView, DtacFontTextView dtacFontTextView3, View view) {
        this.f83807a = constraintLayout;
        this.btnConfirm = dtacFontButton;
        this.constraint = constraintLayout2;
        this.contentCameraMulti = frameLayout;
        this.dtacFontTextView58 = dtacFontTextView;
        this.dtacFontTextView60 = dtacFontTextView2;
        this.guideline = guideline;
        this.guideline2 = guideline2;
        this.imageView37 = imageView;
        this.layoutConfirm = cardView;
        this.noData = constraintLayout3;
        this.rvSubscriberList = recyclerView;
        this.tvItemCont = dtacFontTextView3;
        this.f83808v1 = view;
    }

    @NonNull
    public static FragmentMrtrMultiSimPrepaidScanBarcodeBinding bind(@NonNull View view) {
        View findChildViewById;
        int i = R.id.btnConfirm;
        DtacFontButton dtacFontButton = (DtacFontButton) ViewBindings.findChildViewById(view, i);
        if (dtacFontButton != null) {
            i = R.id.constraint;
            ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
            if (constraintLayout != null) {
                i = R.id.contentCameraMulti;
                FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, i);
                if (frameLayout != null) {
                    i = R.id.dtacFontTextView58;
                    DtacFontTextView dtacFontTextView = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                    if (dtacFontTextView != null) {
                        i = R.id.dtacFontTextView60;
                        DtacFontTextView dtacFontTextView2 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                        if (dtacFontTextView2 != null) {
                            i = R.id.guideline;
                            Guideline guideline = (Guideline) ViewBindings.findChildViewById(view, i);
                            if (guideline != null) {
                                i = R.id.guideline2;
                                Guideline guideline2 = (Guideline) ViewBindings.findChildViewById(view, i);
                                if (guideline2 != null) {
                                    i = R.id.imageView37;
                                    ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
                                    if (imageView != null) {
                                        i = R.id.layoutConfirm;
                                        CardView cardView = (CardView) ViewBindings.findChildViewById(view, i);
                                        if (cardView != null) {
                                            i = R.id.noData;
                                            ConstraintLayout constraintLayout2 = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
                                            if (constraintLayout2 != null) {
                                                i = R.id.rvSubscriberList;
                                                RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
                                                if (recyclerView != null) {
                                                    i = R.id.tvItemCont;
                                                    DtacFontTextView dtacFontTextView3 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                                                    if (dtacFontTextView3 != null && (findChildViewById = ViewBindings.findChildViewById(view, (i = R.id.v1))) != null) {
                                                        return new FragmentMrtrMultiSimPrepaidScanBarcodeBinding((ConstraintLayout) view, dtacFontButton, constraintLayout, frameLayout, dtacFontTextView, dtacFontTextView2, guideline, guideline2, imageView, cardView, constraintLayout2, recyclerView, dtacFontTextView3, findChildViewById);
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
    public static FragmentMrtrMultiSimPrepaidScanBarcodeBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentMrtrMultiSimPrepaidScanBarcodeBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_mrtr_multi_sim_prepaid_scan_barcode, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.f83807a;
    }
}
