package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.widget.view.DtacFontButton;
import th.p047co.dtac.android.dtacone.widget.view.DtacFontTextView;

/* renamed from: th.co.dtac.android.dtacone.databinding.ZIncludeExtraAdvanceBinding */
/* loaded from: classes7.dex */
public final class ZIncludeExtraAdvanceBinding implements ViewBinding {

    /* renamed from: a */
    public final ConstraintLayout f84620a;
    @NonNull
    public final DtacFontButton btnNext;
    @NonNull
    public final CardView cardView4;
    @NonNull
    public final ImageView imageView20;
    @NonNull
    public final RecyclerView rvAdvances;
    @NonNull
    public final DtacFontTextView title;
    @NonNull
    public final DtacFontTextView tvPackageHeader;
    @NonNull
    public final DtacFontTextView tvPriceHeader;
    @NonNull
    public final View view3;

    public ZIncludeExtraAdvanceBinding(ConstraintLayout constraintLayout, DtacFontButton dtacFontButton, CardView cardView, ImageView imageView, RecyclerView recyclerView, DtacFontTextView dtacFontTextView, DtacFontTextView dtacFontTextView2, DtacFontTextView dtacFontTextView3, View view) {
        this.f84620a = constraintLayout;
        this.btnNext = dtacFontButton;
        this.cardView4 = cardView;
        this.imageView20 = imageView;
        this.rvAdvances = recyclerView;
        this.title = dtacFontTextView;
        this.tvPackageHeader = dtacFontTextView2;
        this.tvPriceHeader = dtacFontTextView3;
        this.view3 = view;
    }

    @NonNull
    public static ZIncludeExtraAdvanceBinding bind(@NonNull View view) {
        View findChildViewById;
        int i = R.id.btnNext;
        DtacFontButton dtacFontButton = (DtacFontButton) ViewBindings.findChildViewById(view, i);
        if (dtacFontButton != null) {
            i = R.id.cardView4;
            CardView cardView = (CardView) ViewBindings.findChildViewById(view, i);
            if (cardView != null) {
                i = R.id.imageView20;
                ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
                if (imageView != null) {
                    i = R.id.rvAdvances;
                    RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
                    if (recyclerView != null) {
                        i = R.id.title;
                        DtacFontTextView dtacFontTextView = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                        if (dtacFontTextView != null) {
                            i = R.id.tvPackageHeader;
                            DtacFontTextView dtacFontTextView2 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                            if (dtacFontTextView2 != null) {
                                i = R.id.tvPriceHeader;
                                DtacFontTextView dtacFontTextView3 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                                if (dtacFontTextView3 != null && (findChildViewById = ViewBindings.findChildViewById(view, (i = R.id.view3))) != null) {
                                    return new ZIncludeExtraAdvanceBinding((ConstraintLayout) view, dtacFontButton, cardView, imageView, recyclerView, dtacFontTextView, dtacFontTextView2, dtacFontTextView3, findChildViewById);
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
    public static ZIncludeExtraAdvanceBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ZIncludeExtraAdvanceBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.z_include_extra_advance, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.f84620a;
    }
}
