package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.widget.view.DtacFontTextView;

/* renamed from: th.co.dtac.android.dtacone.databinding.PackageRowDownsellOfferBinding */
/* loaded from: classes7.dex */
public final class PackageRowDownsellOfferBinding implements ViewBinding {

    /* renamed from: a */
    public final ConstraintLayout f84660a;
    @NonNull
    public final ImageView arrow;
    @NonNull
    public final CardView cardView;
    @NonNull
    public final ImageView iconUpsell;
    @NonNull
    public final DtacFontTextView packageItem;
    @NonNull
    public final DtacFontTextView textViewLocationName;
    @NonNull
    public final View view;

    public PackageRowDownsellOfferBinding(ConstraintLayout constraintLayout, ImageView imageView, CardView cardView, ImageView imageView2, DtacFontTextView dtacFontTextView, DtacFontTextView dtacFontTextView2, View view) {
        this.f84660a = constraintLayout;
        this.arrow = imageView;
        this.cardView = cardView;
        this.iconUpsell = imageView2;
        this.packageItem = dtacFontTextView;
        this.textViewLocationName = dtacFontTextView2;
        this.view = view;
    }

    @NonNull
    public static PackageRowDownsellOfferBinding bind(@NonNull View view) {
        View findChildViewById;
        int i = R.id.arrow;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
        if (imageView != null) {
            i = R.id.cardView;
            CardView cardView = (CardView) ViewBindings.findChildViewById(view, i);
            if (cardView != null) {
                i = R.id.iconUpsell;
                ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, i);
                if (imageView2 != null) {
                    i = R.id.packageItem;
                    DtacFontTextView dtacFontTextView = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                    if (dtacFontTextView != null) {
                        i = R.id.textViewLocationName;
                        DtacFontTextView dtacFontTextView2 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                        if (dtacFontTextView2 != null && (findChildViewById = ViewBindings.findChildViewById(view, (i = R.id.view))) != null) {
                            return new PackageRowDownsellOfferBinding((ConstraintLayout) view, imageView, cardView, imageView2, dtacFontTextView, dtacFontTextView2, findChildViewById);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static PackageRowDownsellOfferBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static PackageRowDownsellOfferBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.package_row_downsell_offer, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.f84660a;
    }
}