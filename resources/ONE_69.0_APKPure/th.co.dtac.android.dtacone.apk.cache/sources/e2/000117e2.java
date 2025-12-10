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
import th.p047co.dtac.android.dtacone.widget.view.DtacFontTextView;

/* renamed from: th.co.dtac.android.dtacone.databinding.ItemProfitDetailBinding */
/* loaded from: classes7.dex */
public final class ItemProfitDetailBinding implements ViewBinding {

    /* renamed from: a */
    public final ConstraintLayout f84497a;
    @NonNull
    public final DtacFontTextView tvBuy;
    @NonNull
    public final DtacFontTextView tvProfit;
    @NonNull
    public final DtacFontTextView tvSale;
    @NonNull
    public final DtacFontTextView tvType;
    @NonNull
    public final View vgBox;

    public ItemProfitDetailBinding(ConstraintLayout constraintLayout, DtacFontTextView dtacFontTextView, DtacFontTextView dtacFontTextView2, DtacFontTextView dtacFontTextView3, DtacFontTextView dtacFontTextView4, View view) {
        this.f84497a = constraintLayout;
        this.tvBuy = dtacFontTextView;
        this.tvProfit = dtacFontTextView2;
        this.tvSale = dtacFontTextView3;
        this.tvType = dtacFontTextView4;
        this.vgBox = view;
    }

    @NonNull
    public static ItemProfitDetailBinding bind(@NonNull View view) {
        View findChildViewById;
        int i = R.id.tvBuy;
        DtacFontTextView dtacFontTextView = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
        if (dtacFontTextView != null) {
            i = R.id.tvProfit;
            DtacFontTextView dtacFontTextView2 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
            if (dtacFontTextView2 != null) {
                i = R.id.tvSale;
                DtacFontTextView dtacFontTextView3 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                if (dtacFontTextView3 != null) {
                    i = R.id.tvType;
                    DtacFontTextView dtacFontTextView4 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                    if (dtacFontTextView4 != null && (findChildViewById = ViewBindings.findChildViewById(view, (i = R.id.vgBox))) != null) {
                        return new ItemProfitDetailBinding((ConstraintLayout) view, dtacFontTextView, dtacFontTextView2, dtacFontTextView3, dtacFontTextView4, findChildViewById);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static ItemProfitDetailBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ItemProfitDetailBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.item_profit_detail, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.f84497a;
    }
}