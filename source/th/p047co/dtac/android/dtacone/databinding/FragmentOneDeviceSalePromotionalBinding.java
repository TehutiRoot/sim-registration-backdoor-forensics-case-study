package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.app_one.widget.OneFontButton;
import th.p047co.dtac.android.dtacone.app_one.widget.OneFontTextView;

/* renamed from: th.co.dtac.android.dtacone.databinding.FragmentOneDeviceSalePromotionalBinding */
/* loaded from: classes7.dex */
public final class FragmentOneDeviceSalePromotionalBinding implements ViewBinding {

    /* renamed from: a */
    public final ConstraintLayout f83930a;
    @NonNull
    public final LinearLayoutCompat btnAddPromotional;
    @NonNull
    public final OneFontButton btnNext;
    @NonNull
    public final CardView campaignGroup;
    @NonNull
    public final CardView card;
    @NonNull
    public final OneFontTextView discountNoData;
    @NonNull
    public final RecyclerView listView;
    @NonNull
    public final OneFontTextView oneFontTextView3;

    public FragmentOneDeviceSalePromotionalBinding(ConstraintLayout constraintLayout, LinearLayoutCompat linearLayoutCompat, OneFontButton oneFontButton, CardView cardView, CardView cardView2, OneFontTextView oneFontTextView, RecyclerView recyclerView, OneFontTextView oneFontTextView2) {
        this.f83930a = constraintLayout;
        this.btnAddPromotional = linearLayoutCompat;
        this.btnNext = oneFontButton;
        this.campaignGroup = cardView;
        this.card = cardView2;
        this.discountNoData = oneFontTextView;
        this.listView = recyclerView;
        this.oneFontTextView3 = oneFontTextView2;
    }

    @NonNull
    public static FragmentOneDeviceSalePromotionalBinding bind(@NonNull View view) {
        int i = R.id.btnAddPromotional;
        LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i);
        if (linearLayoutCompat != null) {
            i = R.id.btnNext;
            OneFontButton oneFontButton = (OneFontButton) ViewBindings.findChildViewById(view, i);
            if (oneFontButton != null) {
                i = R.id.campaignGroup;
                CardView cardView = (CardView) ViewBindings.findChildViewById(view, i);
                if (cardView != null) {
                    i = R.id.card;
                    CardView cardView2 = (CardView) ViewBindings.findChildViewById(view, i);
                    if (cardView2 != null) {
                        i = R.id.discountNoData;
                        OneFontTextView oneFontTextView = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                        if (oneFontTextView != null) {
                            i = R.id.listView;
                            RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
                            if (recyclerView != null) {
                                i = R.id.oneFontTextView3;
                                OneFontTextView oneFontTextView2 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                if (oneFontTextView2 != null) {
                                    return new FragmentOneDeviceSalePromotionalBinding((ConstraintLayout) view, linearLayoutCompat, oneFontButton, cardView, cardView2, oneFontTextView, recyclerView, oneFontTextView2);
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
    public static FragmentOneDeviceSalePromotionalBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentOneDeviceSalePromotionalBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_one_device_sale_promotional, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.f83930a;
    }
}
