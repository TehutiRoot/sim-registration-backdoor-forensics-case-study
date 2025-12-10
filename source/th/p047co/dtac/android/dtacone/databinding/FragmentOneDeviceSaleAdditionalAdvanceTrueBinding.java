package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.app_one.widget.OneFontButton;
import th.p047co.dtac.android.dtacone.app_one.widget.OneFontTextView;

/* renamed from: th.co.dtac.android.dtacone.databinding.FragmentOneDeviceSaleAdditionalAdvanceTrueBinding */
/* loaded from: classes7.dex */
public final class FragmentOneDeviceSaleAdditionalAdvanceTrueBinding implements ViewBinding {

    /* renamed from: a */
    public final ConstraintLayout f83922a;
    @NonNull
    public final RecyclerView checkBlackListRecyclerView;
    @NonNull
    public final CardView deviceSaleCheckBlackListCardView;
    @NonNull
    public final ImageView deviceSaleCheckBlackListHeaderImageView;
    @NonNull
    public final ConstraintLayout deviceSaleCheckBlackListHeaderLayout;
    @NonNull
    public final OneFontTextView deviceSaleCheckBlackListHeaderTextView;
    @NonNull
    public final OneFontTextView labelTextView;
    @NonNull
    public final ImageView leftImageView;
    @NonNull
    public final OneFontButton nextToSelectPropositionFragmentButton;
    @NonNull
    public final ImageView rightImageView;
    @NonNull
    public final LinearLayout rowHeaderLayout;
    @NonNull
    public final OneFontTextView valueTextView;

    public FragmentOneDeviceSaleAdditionalAdvanceTrueBinding(ConstraintLayout constraintLayout, RecyclerView recyclerView, CardView cardView, ImageView imageView, ConstraintLayout constraintLayout2, OneFontTextView oneFontTextView, OneFontTextView oneFontTextView2, ImageView imageView2, OneFontButton oneFontButton, ImageView imageView3, LinearLayout linearLayout, OneFontTextView oneFontTextView3) {
        this.f83922a = constraintLayout;
        this.checkBlackListRecyclerView = recyclerView;
        this.deviceSaleCheckBlackListCardView = cardView;
        this.deviceSaleCheckBlackListHeaderImageView = imageView;
        this.deviceSaleCheckBlackListHeaderLayout = constraintLayout2;
        this.deviceSaleCheckBlackListHeaderTextView = oneFontTextView;
        this.labelTextView = oneFontTextView2;
        this.leftImageView = imageView2;
        this.nextToSelectPropositionFragmentButton = oneFontButton;
        this.rightImageView = imageView3;
        this.rowHeaderLayout = linearLayout;
        this.valueTextView = oneFontTextView3;
    }

    @NonNull
    public static FragmentOneDeviceSaleAdditionalAdvanceTrueBinding bind(@NonNull View view) {
        int i = R.id.checkBlackListRecyclerView;
        RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
        if (recyclerView != null) {
            i = R.id.deviceSaleCheckBlackListCardView;
            CardView cardView = (CardView) ViewBindings.findChildViewById(view, i);
            if (cardView != null) {
                i = R.id.deviceSaleCheckBlackListHeaderImageView;
                ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
                if (imageView != null) {
                    i = R.id.deviceSaleCheckBlackListHeaderLayout;
                    ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
                    if (constraintLayout != null) {
                        i = R.id.deviceSaleCheckBlackListHeaderTextView;
                        OneFontTextView oneFontTextView = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                        if (oneFontTextView != null) {
                            i = R.id.labelTextView;
                            OneFontTextView oneFontTextView2 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                            if (oneFontTextView2 != null) {
                                i = R.id.leftImageView;
                                ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, i);
                                if (imageView2 != null) {
                                    i = R.id.nextToSelectPropositionFragmentButton;
                                    OneFontButton oneFontButton = (OneFontButton) ViewBindings.findChildViewById(view, i);
                                    if (oneFontButton != null) {
                                        i = R.id.rightImageView;
                                        ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(view, i);
                                        if (imageView3 != null) {
                                            i = R.id.rowHeaderLayout;
                                            LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i);
                                            if (linearLayout != null) {
                                                i = R.id.valueTextView;
                                                OneFontTextView oneFontTextView3 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                                if (oneFontTextView3 != null) {
                                                    return new FragmentOneDeviceSaleAdditionalAdvanceTrueBinding((ConstraintLayout) view, recyclerView, cardView, imageView, constraintLayout, oneFontTextView, oneFontTextView2, imageView2, oneFontButton, imageView3, linearLayout, oneFontTextView3);
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
    public static FragmentOneDeviceSaleAdditionalAdvanceTrueBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentOneDeviceSaleAdditionalAdvanceTrueBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_one_device_sale_additional_advance_true, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.f83922a;
    }
}
