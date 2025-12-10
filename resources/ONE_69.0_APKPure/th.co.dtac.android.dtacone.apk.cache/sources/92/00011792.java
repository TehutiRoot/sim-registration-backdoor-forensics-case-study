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
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.widget.view.DtacFontTextView;

/* renamed from: th.co.dtac.android.dtacone.databinding.ItemDiscountListBinding */
/* loaded from: classes7.dex */
public final class ItemDiscountListBinding implements ViewBinding {

    /* renamed from: a */
    public final ConstraintLayout f84417a;
    @NonNull
    public final ImageView arrow;
    @NonNull
    public final DtacFontTextView textViewAmount;
    @NonNull
    public final DtacFontTextView textViewName;
    @NonNull
    public final DtacFontTextView textViewType;

    public ItemDiscountListBinding(ConstraintLayout constraintLayout, ImageView imageView, DtacFontTextView dtacFontTextView, DtacFontTextView dtacFontTextView2, DtacFontTextView dtacFontTextView3) {
        this.f84417a = constraintLayout;
        this.arrow = imageView;
        this.textViewAmount = dtacFontTextView;
        this.textViewName = dtacFontTextView2;
        this.textViewType = dtacFontTextView3;
    }

    @NonNull
    public static ItemDiscountListBinding bind(@NonNull View view) {
        int i = R.id.arrow;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
        if (imageView != null) {
            i = R.id.textViewAmount;
            DtacFontTextView dtacFontTextView = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
            if (dtacFontTextView != null) {
                i = R.id.textViewName;
                DtacFontTextView dtacFontTextView2 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                if (dtacFontTextView2 != null) {
                    i = R.id.textViewType;
                    DtacFontTextView dtacFontTextView3 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                    if (dtacFontTextView3 != null) {
                        return new ItemDiscountListBinding((ConstraintLayout) view, imageView, dtacFontTextView, dtacFontTextView2, dtacFontTextView3);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static ItemDiscountListBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ItemDiscountListBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.item_discount_list, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.f84417a;
    }
}