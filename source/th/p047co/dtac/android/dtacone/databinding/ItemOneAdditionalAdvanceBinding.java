package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.app_one.widget.OneFontTextView;

/* renamed from: th.co.dtac.android.dtacone.databinding.ItemOneAdditionalAdvanceBinding */
/* loaded from: classes7.dex */
public final class ItemOneAdditionalAdvanceBinding implements ViewBinding {

    /* renamed from: a */
    public final ConstraintLayout f84339a;
    @NonNull
    public final ConstraintLayout itemContainer;
    @NonNull
    public final OneFontTextView tvPrice;
    @NonNull
    public final OneFontTextView tvPriceRange;

    public ItemOneAdditionalAdvanceBinding(ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2, OneFontTextView oneFontTextView, OneFontTextView oneFontTextView2) {
        this.f84339a = constraintLayout;
        this.itemContainer = constraintLayout2;
        this.tvPrice = oneFontTextView;
        this.tvPriceRange = oneFontTextView2;
    }

    @NonNull
    public static ItemOneAdditionalAdvanceBinding bind(@NonNull View view) {
        ConstraintLayout constraintLayout = (ConstraintLayout) view;
        int i = R.id.tvPrice;
        OneFontTextView oneFontTextView = (OneFontTextView) ViewBindings.findChildViewById(view, i);
        if (oneFontTextView != null) {
            i = R.id.tvPriceRange;
            OneFontTextView oneFontTextView2 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
            if (oneFontTextView2 != null) {
                return new ItemOneAdditionalAdvanceBinding(constraintLayout, constraintLayout, oneFontTextView, oneFontTextView2);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static ItemOneAdditionalAdvanceBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ItemOneAdditionalAdvanceBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.item_one_additional_advance, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.f84339a;
    }
}
