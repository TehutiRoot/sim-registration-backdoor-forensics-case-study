package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.widget.view.DtacFontTextView;

/* renamed from: th.co.dtac.android.dtacone.databinding.FragmentDeviceSummaryInfoBinding */
/* loaded from: classes7.dex */
public final class FragmentDeviceSummaryInfoBinding implements ViewBinding {

    /* renamed from: a */
    public final NestedScrollView f83799a;
    @NonNull
    public final CardView cardContract;
    @NonNull
    public final CardView cardContractSamesub;
    @NonNull
    public final ConstraintLayout constraintLayout6;
    @NonNull
    public final ConstraintLayout constraintLayout8;
    @NonNull
    public final DtacFontTextView dtacFontTextView53;
    @NonNull
    public final DtacFontTextView dtacFontTextView54;
    @NonNull
    public final DtacFontTextView dtacFontTextView56;
    @NonNull
    public final ImageView imageView31;
    @NonNull
    public final ImageView imageView32;
    @NonNull
    public final ImageView imageView34;
    @NonNull
    public final ImageView imageView35;
    @NonNull
    public final ImageView imageView36;
    @NonNull
    public final DtacFontTextView label3;
    @NonNull
    public final DtacFontTextView label4;
    @NonNull
    public final ConstraintLayout layouNotContractAll;
    @NonNull
    public final ConstraintLayout layoutNotContract;
    @NonNull
    public final ConstraintLayout layoutNotContractSamesub;
    @NonNull
    public final RecyclerView rvContract;
    @NonNull
    public final RecyclerView rvContractSamesub;

    public FragmentDeviceSummaryInfoBinding(NestedScrollView nestedScrollView, CardView cardView, CardView cardView2, ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2, DtacFontTextView dtacFontTextView, DtacFontTextView dtacFontTextView2, DtacFontTextView dtacFontTextView3, ImageView imageView, ImageView imageView2, ImageView imageView3, ImageView imageView4, ImageView imageView5, DtacFontTextView dtacFontTextView4, DtacFontTextView dtacFontTextView5, ConstraintLayout constraintLayout3, ConstraintLayout constraintLayout4, ConstraintLayout constraintLayout5, RecyclerView recyclerView, RecyclerView recyclerView2) {
        this.f83799a = nestedScrollView;
        this.cardContract = cardView;
        this.cardContractSamesub = cardView2;
        this.constraintLayout6 = constraintLayout;
        this.constraintLayout8 = constraintLayout2;
        this.dtacFontTextView53 = dtacFontTextView;
        this.dtacFontTextView54 = dtacFontTextView2;
        this.dtacFontTextView56 = dtacFontTextView3;
        this.imageView31 = imageView;
        this.imageView32 = imageView2;
        this.imageView34 = imageView3;
        this.imageView35 = imageView4;
        this.imageView36 = imageView5;
        this.label3 = dtacFontTextView4;
        this.label4 = dtacFontTextView5;
        this.layouNotContractAll = constraintLayout3;
        this.layoutNotContract = constraintLayout4;
        this.layoutNotContractSamesub = constraintLayout5;
        this.rvContract = recyclerView;
        this.rvContractSamesub = recyclerView2;
    }

    @NonNull
    public static FragmentDeviceSummaryInfoBinding bind(@NonNull View view) {
        int i = R.id.cardContract;
        CardView cardView = (CardView) ViewBindings.findChildViewById(view, i);
        if (cardView != null) {
            i = R.id.cardContractSamesub;
            CardView cardView2 = (CardView) ViewBindings.findChildViewById(view, i);
            if (cardView2 != null) {
                i = R.id.constraintLayout6;
                ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
                if (constraintLayout != null) {
                    i = R.id.constraintLayout8;
                    ConstraintLayout constraintLayout2 = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
                    if (constraintLayout2 != null) {
                        i = R.id.dtacFontTextView53;
                        DtacFontTextView dtacFontTextView = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                        if (dtacFontTextView != null) {
                            i = R.id.dtacFontTextView54;
                            DtacFontTextView dtacFontTextView2 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                            if (dtacFontTextView2 != null) {
                                i = R.id.dtacFontTextView56;
                                DtacFontTextView dtacFontTextView3 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                                if (dtacFontTextView3 != null) {
                                    i = R.id.imageView31;
                                    ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
                                    if (imageView != null) {
                                        i = R.id.imageView32;
                                        ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, i);
                                        if (imageView2 != null) {
                                            i = R.id.imageView34;
                                            ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(view, i);
                                            if (imageView3 != null) {
                                                i = R.id.imageView35;
                                                ImageView imageView4 = (ImageView) ViewBindings.findChildViewById(view, i);
                                                if (imageView4 != null) {
                                                    i = R.id.imageView36;
                                                    ImageView imageView5 = (ImageView) ViewBindings.findChildViewById(view, i);
                                                    if (imageView5 != null) {
                                                        i = R.id.label3;
                                                        DtacFontTextView dtacFontTextView4 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                                                        if (dtacFontTextView4 != null) {
                                                            i = R.id.label4;
                                                            DtacFontTextView dtacFontTextView5 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                                                            if (dtacFontTextView5 != null) {
                                                                i = R.id.layouNotContractAll;
                                                                ConstraintLayout constraintLayout3 = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
                                                                if (constraintLayout3 != null) {
                                                                    i = R.id.layoutNotContract;
                                                                    ConstraintLayout constraintLayout4 = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
                                                                    if (constraintLayout4 != null) {
                                                                        i = R.id.layoutNotContractSamesub;
                                                                        ConstraintLayout constraintLayout5 = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
                                                                        if (constraintLayout5 != null) {
                                                                            i = R.id.rvContract;
                                                                            RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
                                                                            if (recyclerView != null) {
                                                                                i = R.id.rvContractSamesub;
                                                                                RecyclerView recyclerView2 = (RecyclerView) ViewBindings.findChildViewById(view, i);
                                                                                if (recyclerView2 != null) {
                                                                                    return new FragmentDeviceSummaryInfoBinding((NestedScrollView) view, cardView, cardView2, constraintLayout, constraintLayout2, dtacFontTextView, dtacFontTextView2, dtacFontTextView3, imageView, imageView2, imageView3, imageView4, imageView5, dtacFontTextView4, dtacFontTextView5, constraintLayout3, constraintLayout4, constraintLayout5, recyclerView, recyclerView2);
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
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static FragmentDeviceSummaryInfoBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentDeviceSummaryInfoBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_device_summary_info, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public NestedScrollView getRoot() {
        return this.f83799a;
    }
}