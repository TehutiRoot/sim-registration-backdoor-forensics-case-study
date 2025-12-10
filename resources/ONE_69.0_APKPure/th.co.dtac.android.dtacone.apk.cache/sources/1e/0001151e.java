package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.widget.view.DtacCardView;
import th.p047co.dtac.android.dtacone.widget.view.DtacFontButton;
import th.p047co.dtac.android.dtacone.widget.view.DtacFontTextView;

/* renamed from: th.co.dtac.android.dtacone.databinding.FragmentDeviceSaleCampaignDiscountBinding */
/* loaded from: classes7.dex */
public final class FragmentDeviceSaleCampaignDiscountBinding implements ViewBinding {

    /* renamed from: a */
    public final ConstraintLayout f83785a;
    @NonNull
    public final DtacFontButton btnNext;
    @NonNull
    public final DtacFontButton buttonMoreDiscount;
    @NonNull
    public final DtacCardView campaignGroup;
    @NonNull
    public final RecyclerView campaignListView;
    @NonNull
    public final DtacFontTextView discountListLabel;
    @NonNull
    public final DtacFontTextView discountNoData;

    public FragmentDeviceSaleCampaignDiscountBinding(ConstraintLayout constraintLayout, DtacFontButton dtacFontButton, DtacFontButton dtacFontButton2, DtacCardView dtacCardView, RecyclerView recyclerView, DtacFontTextView dtacFontTextView, DtacFontTextView dtacFontTextView2) {
        this.f83785a = constraintLayout;
        this.btnNext = dtacFontButton;
        this.buttonMoreDiscount = dtacFontButton2;
        this.campaignGroup = dtacCardView;
        this.campaignListView = recyclerView;
        this.discountListLabel = dtacFontTextView;
        this.discountNoData = dtacFontTextView2;
    }

    @NonNull
    public static FragmentDeviceSaleCampaignDiscountBinding bind(@NonNull View view) {
        int i = R.id.btnNext;
        DtacFontButton dtacFontButton = (DtacFontButton) ViewBindings.findChildViewById(view, i);
        if (dtacFontButton != null) {
            i = R.id.buttonMoreDiscount;
            DtacFontButton dtacFontButton2 = (DtacFontButton) ViewBindings.findChildViewById(view, i);
            if (dtacFontButton2 != null) {
                i = R.id.campaignGroup;
                DtacCardView dtacCardView = (DtacCardView) ViewBindings.findChildViewById(view, i);
                if (dtacCardView != null) {
                    i = R.id.campaignListView;
                    RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
                    if (recyclerView != null) {
                        i = R.id.discountListLabel;
                        DtacFontTextView dtacFontTextView = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                        if (dtacFontTextView != null) {
                            i = R.id.discountNoData;
                            DtacFontTextView dtacFontTextView2 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                            if (dtacFontTextView2 != null) {
                                return new FragmentDeviceSaleCampaignDiscountBinding((ConstraintLayout) view, dtacFontButton, dtacFontButton2, dtacCardView, recyclerView, dtacFontTextView, dtacFontTextView2);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static FragmentDeviceSaleCampaignDiscountBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentDeviceSaleCampaignDiscountBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_device_sale_campaign_discount, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.f83785a;
    }
}