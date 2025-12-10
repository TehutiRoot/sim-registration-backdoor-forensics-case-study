package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.widget.view.DtacFontTextView;

/* renamed from: th.co.dtac.android.dtacone.databinding.ItemMultiSimDiscountBinding */
/* loaded from: classes7.dex */
public final class ItemMultiSimDiscountBinding implements ViewBinding {

    /* renamed from: a */
    public final LinearLayout f84329a;
    @NonNull
    public final LinearLayout layoutDiscount;
    @NonNull
    public final DtacFontTextView tvDisCountLabel;
    @NonNull
    public final DtacFontTextView tvDisCountNumber;
    @NonNull
    public final DtacFontTextView tvDisCountValue;

    public ItemMultiSimDiscountBinding(LinearLayout linearLayout, LinearLayout linearLayout2, DtacFontTextView dtacFontTextView, DtacFontTextView dtacFontTextView2, DtacFontTextView dtacFontTextView3) {
        this.f84329a = linearLayout;
        this.layoutDiscount = linearLayout2;
        this.tvDisCountLabel = dtacFontTextView;
        this.tvDisCountNumber = dtacFontTextView2;
        this.tvDisCountValue = dtacFontTextView3;
    }

    @NonNull
    public static ItemMultiSimDiscountBinding bind(@NonNull View view) {
        LinearLayout linearLayout = (LinearLayout) view;
        int i = R.id.tvDisCountLabel;
        DtacFontTextView dtacFontTextView = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
        if (dtacFontTextView != null) {
            i = R.id.tvDisCountNumber;
            DtacFontTextView dtacFontTextView2 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
            if (dtacFontTextView2 != null) {
                i = R.id.tvDisCountValue;
                DtacFontTextView dtacFontTextView3 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                if (dtacFontTextView3 != null) {
                    return new ItemMultiSimDiscountBinding(linearLayout, linearLayout, dtacFontTextView, dtacFontTextView2, dtacFontTextView3);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static ItemMultiSimDiscountBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ItemMultiSimDiscountBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.item_multi_sim_discount, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayout getRoot() {
        return this.f84329a;
    }
}
