package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.app_one.widget.OneCustomClearableEditText;
import th.p047co.dtac.android.dtacone.app_one.widget.OneFontButton;
import th.p047co.dtac.android.dtacone.app_one.widget.OneFontTextView;

/* renamed from: th.co.dtac.android.dtacone.databinding.FragmentOneDeviceSaleTrueSelectMaterialBinding */
/* loaded from: classes7.dex */
public final class FragmentOneDeviceSaleTrueSelectMaterialBinding implements ViewBinding {

    /* renamed from: a */
    public final ConstraintLayout f84042a;
    @NonNull
    public final CardView cardView;
    @NonNull
    public final ImageView deviceSaleDeviceTypeImageView;
    @NonNull
    public final RecyclerView listViewPackage;
    @NonNull
    public final RecyclerView oneDeviceSaleSelectMaterialCodeRecyclerView;
    @NonNull
    public final ConstraintLayout oneDeviceSaleSelectMaterialContractLayout;
    @NonNull
    public final ConstraintLayout oneDeviceSaleSelectMaterialLayout;
    @NonNull
    public final OneFontButton oneDeviceSaleSelectMaterialRetryButton;
    @NonNull
    public final LinearLayoutCompat oneDeviceSaleSelectMaterialRetryLayout;
    @NonNull
    public final ConstraintLayout oneDeviceSaleSelectMaterialRetryMainLayout;
    @NonNull
    public final OneFontTextView oneDeviceSaleSelectMaterialRetryMessageTextView;
    @NonNull
    public final OneCustomClearableEditText oneDeviceSaleSelectMaterialSearchEditText;
    @NonNull
    public final OneFontTextView oneDeviceSaleSelectMaterialTitleTextView;
    @NonNull
    public final OneFontTextView oneDeviceSaleSelectMaterialWarningTextView;

    public FragmentOneDeviceSaleTrueSelectMaterialBinding(ConstraintLayout constraintLayout, CardView cardView, ImageView imageView, RecyclerView recyclerView, RecyclerView recyclerView2, ConstraintLayout constraintLayout2, ConstraintLayout constraintLayout3, OneFontButton oneFontButton, LinearLayoutCompat linearLayoutCompat, ConstraintLayout constraintLayout4, OneFontTextView oneFontTextView, OneCustomClearableEditText oneCustomClearableEditText, OneFontTextView oneFontTextView2, OneFontTextView oneFontTextView3) {
        this.f84042a = constraintLayout;
        this.cardView = cardView;
        this.deviceSaleDeviceTypeImageView = imageView;
        this.listViewPackage = recyclerView;
        this.oneDeviceSaleSelectMaterialCodeRecyclerView = recyclerView2;
        this.oneDeviceSaleSelectMaterialContractLayout = constraintLayout2;
        this.oneDeviceSaleSelectMaterialLayout = constraintLayout3;
        this.oneDeviceSaleSelectMaterialRetryButton = oneFontButton;
        this.oneDeviceSaleSelectMaterialRetryLayout = linearLayoutCompat;
        this.oneDeviceSaleSelectMaterialRetryMainLayout = constraintLayout4;
        this.oneDeviceSaleSelectMaterialRetryMessageTextView = oneFontTextView;
        this.oneDeviceSaleSelectMaterialSearchEditText = oneCustomClearableEditText;
        this.oneDeviceSaleSelectMaterialTitleTextView = oneFontTextView2;
        this.oneDeviceSaleSelectMaterialWarningTextView = oneFontTextView3;
    }

    @NonNull
    public static FragmentOneDeviceSaleTrueSelectMaterialBinding bind(@NonNull View view) {
        int i = R.id.cardView;
        CardView cardView = (CardView) ViewBindings.findChildViewById(view, i);
        if (cardView != null) {
            i = R.id.deviceSaleDeviceTypeImageView;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
            if (imageView != null) {
                i = R.id.listViewPackage;
                RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
                if (recyclerView != null) {
                    i = R.id.oneDeviceSaleSelectMaterialCodeRecyclerView;
                    RecyclerView recyclerView2 = (RecyclerView) ViewBindings.findChildViewById(view, i);
                    if (recyclerView2 != null) {
                        i = R.id.oneDeviceSaleSelectMaterialContractLayout;
                        ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
                        if (constraintLayout != null) {
                            i = R.id.oneDeviceSaleSelectMaterialLayout;
                            ConstraintLayout constraintLayout2 = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
                            if (constraintLayout2 != null) {
                                i = R.id.oneDeviceSaleSelectMaterialRetryButton;
                                OneFontButton oneFontButton = (OneFontButton) ViewBindings.findChildViewById(view, i);
                                if (oneFontButton != null) {
                                    i = R.id.oneDeviceSaleSelectMaterialRetryLayout;
                                    LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i);
                                    if (linearLayoutCompat != null) {
                                        ConstraintLayout constraintLayout3 = (ConstraintLayout) view;
                                        i = R.id.oneDeviceSaleSelectMaterialRetryMessageTextView;
                                        OneFontTextView oneFontTextView = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                        if (oneFontTextView != null) {
                                            i = R.id.oneDeviceSaleSelectMaterialSearchEditText;
                                            OneCustomClearableEditText oneCustomClearableEditText = (OneCustomClearableEditText) ViewBindings.findChildViewById(view, i);
                                            if (oneCustomClearableEditText != null) {
                                                i = R.id.oneDeviceSaleSelectMaterialTitleTextView;
                                                OneFontTextView oneFontTextView2 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                                if (oneFontTextView2 != null) {
                                                    i = R.id.oneDeviceSaleSelectMaterialWarningTextView;
                                                    OneFontTextView oneFontTextView3 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                                    if (oneFontTextView3 != null) {
                                                        return new FragmentOneDeviceSaleTrueSelectMaterialBinding(constraintLayout3, cardView, imageView, recyclerView, recyclerView2, constraintLayout, constraintLayout2, oneFontButton, linearLayoutCompat, constraintLayout3, oneFontTextView, oneCustomClearableEditText, oneFontTextView2, oneFontTextView3);
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
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static FragmentOneDeviceSaleTrueSelectMaterialBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentOneDeviceSaleTrueSelectMaterialBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_one_device_sale_true_select_material, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.f84042a;
    }
}