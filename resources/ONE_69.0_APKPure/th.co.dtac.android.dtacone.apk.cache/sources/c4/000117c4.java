package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.app_one.widget.OneFontTextView;

/* renamed from: th.co.dtac.android.dtacone.databinding.ItemOneOwnerManagementDetailBinding */
/* loaded from: classes7.dex */
public final class ItemOneOwnerManagementDetailBinding implements ViewBinding {

    /* renamed from: a */
    public final ConstraintLayout f84467a;
    @NonNull
    public final OneFontTextView ownerTransactionAmountTextView;
    @NonNull
    public final OneFontTextView ownerTransactionDetailTimeTextView;
    @NonNull
    public final AppCompatImageView ownerTransactionDisplayTypeImageView;
    @NonNull
    public final OneFontTextView ownerTransactionDisplayTypeTextView;
    @NonNull
    public final OneFontTextView ownerTransactionPackageNameTextView;
    @NonNull
    public final OneFontTextView ownerTransactionPhoneTextView;
    @NonNull
    public final OneFontTextView userDetailBathCurrencyTextView;

    public ItemOneOwnerManagementDetailBinding(ConstraintLayout constraintLayout, OneFontTextView oneFontTextView, OneFontTextView oneFontTextView2, AppCompatImageView appCompatImageView, OneFontTextView oneFontTextView3, OneFontTextView oneFontTextView4, OneFontTextView oneFontTextView5, OneFontTextView oneFontTextView6) {
        this.f84467a = constraintLayout;
        this.ownerTransactionAmountTextView = oneFontTextView;
        this.ownerTransactionDetailTimeTextView = oneFontTextView2;
        this.ownerTransactionDisplayTypeImageView = appCompatImageView;
        this.ownerTransactionDisplayTypeTextView = oneFontTextView3;
        this.ownerTransactionPackageNameTextView = oneFontTextView4;
        this.ownerTransactionPhoneTextView = oneFontTextView5;
        this.userDetailBathCurrencyTextView = oneFontTextView6;
    }

    @NonNull
    public static ItemOneOwnerManagementDetailBinding bind(@NonNull View view) {
        int i = R.id.ownerTransactionAmountTextView;
        OneFontTextView oneFontTextView = (OneFontTextView) ViewBindings.findChildViewById(view, i);
        if (oneFontTextView != null) {
            i = R.id.ownerTransactionDetailTimeTextView;
            OneFontTextView oneFontTextView2 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
            if (oneFontTextView2 != null) {
                i = R.id.ownerTransactionDisplayTypeImageView;
                AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(view, i);
                if (appCompatImageView != null) {
                    i = R.id.ownerTransactionDisplayTypeTextView;
                    OneFontTextView oneFontTextView3 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                    if (oneFontTextView3 != null) {
                        i = R.id.ownerTransactionPackageNameTextView;
                        OneFontTextView oneFontTextView4 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                        if (oneFontTextView4 != null) {
                            i = R.id.ownerTransactionPhoneTextView;
                            OneFontTextView oneFontTextView5 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                            if (oneFontTextView5 != null) {
                                i = R.id.userDetailBathCurrencyTextView;
                                OneFontTextView oneFontTextView6 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                if (oneFontTextView6 != null) {
                                    return new ItemOneOwnerManagementDetailBinding((ConstraintLayout) view, oneFontTextView, oneFontTextView2, appCompatImageView, oneFontTextView3, oneFontTextView4, oneFontTextView5, oneFontTextView6);
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
    public static ItemOneOwnerManagementDetailBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ItemOneOwnerManagementDetailBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.item_one_owner_management_detail, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.f84467a;
    }
}