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

/* renamed from: th.co.dtac.android.dtacone.databinding.ItemOneProfitDetailBinding */
/* loaded from: classes7.dex */
public final class ItemOneProfitDetailBinding implements ViewBinding {

    /* renamed from: a */
    public final ConstraintLayout f84470a;
    @NonNull
    public final View subProfitDetailItemBackgroundView;
    @NonNull
    public final OneFontTextView subProfitDetailItemBuySimTextView;
    @NonNull
    public final OneFontTextView subProfitDetailItemProfitTextView;
    @NonNull
    public final OneFontTextView subProfitDetailItemSaleSimTextView;
    @NonNull
    public final OneFontTextView subProfitDetailItemTypeTextView;

    public ItemOneProfitDetailBinding(ConstraintLayout constraintLayout, View view, OneFontTextView oneFontTextView, OneFontTextView oneFontTextView2, OneFontTextView oneFontTextView3, OneFontTextView oneFontTextView4) {
        this.f84470a = constraintLayout;
        this.subProfitDetailItemBackgroundView = view;
        this.subProfitDetailItemBuySimTextView = oneFontTextView;
        this.subProfitDetailItemProfitTextView = oneFontTextView2;
        this.subProfitDetailItemSaleSimTextView = oneFontTextView3;
        this.subProfitDetailItemTypeTextView = oneFontTextView4;
    }

    @NonNull
    public static ItemOneProfitDetailBinding bind(@NonNull View view) {
        int i = R.id.subProfitDetailItemBackgroundView;
        View findChildViewById = ViewBindings.findChildViewById(view, i);
        if (findChildViewById != null) {
            i = R.id.subProfitDetailItemBuySimTextView;
            OneFontTextView oneFontTextView = (OneFontTextView) ViewBindings.findChildViewById(view, i);
            if (oneFontTextView != null) {
                i = R.id.subProfitDetailItemProfitTextView;
                OneFontTextView oneFontTextView2 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                if (oneFontTextView2 != null) {
                    i = R.id.subProfitDetailItemSaleSimTextView;
                    OneFontTextView oneFontTextView3 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                    if (oneFontTextView3 != null) {
                        i = R.id.subProfitDetailItemTypeTextView;
                        OneFontTextView oneFontTextView4 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                        if (oneFontTextView4 != null) {
                            return new ItemOneProfitDetailBinding((ConstraintLayout) view, findChildViewById, oneFontTextView, oneFontTextView2, oneFontTextView3, oneFontTextView4);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static ItemOneProfitDetailBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ItemOneProfitDetailBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.item_one_profit_detail, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.f84470a;
    }
}