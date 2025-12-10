package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.app_one.widget.OneFontTextView;

/* renamed from: th.co.dtac.android.dtacone.databinding.DialogOneConfirmShopBinding */
/* loaded from: classes7.dex */
public final class DialogOneConfirmShopBinding implements ViewBinding {

    /* renamed from: a */
    public final LinearLayoutCompat f83726a;
    @NonNull
    public final OneFontTextView btnCancel;
    @NonNull
    public final OneFontTextView btnConfirm;
    @NonNull
    public final AppCompatImageView btnToggleCompany;
    @NonNull
    public final ImageView ivSeller;
    @NonNull
    public final OneFontTextView oneFontTextView4;
    @NonNull
    public final OneFontTextView tvSellerId;
    @NonNull
    public final OneFontTextView tvSellerName;

    public DialogOneConfirmShopBinding(LinearLayoutCompat linearLayoutCompat, OneFontTextView oneFontTextView, OneFontTextView oneFontTextView2, AppCompatImageView appCompatImageView, ImageView imageView, OneFontTextView oneFontTextView3, OneFontTextView oneFontTextView4, OneFontTextView oneFontTextView5) {
        this.f83726a = linearLayoutCompat;
        this.btnCancel = oneFontTextView;
        this.btnConfirm = oneFontTextView2;
        this.btnToggleCompany = appCompatImageView;
        this.ivSeller = imageView;
        this.oneFontTextView4 = oneFontTextView3;
        this.tvSellerId = oneFontTextView4;
        this.tvSellerName = oneFontTextView5;
    }

    @NonNull
    public static DialogOneConfirmShopBinding bind(@NonNull View view) {
        int i = R.id.btnCancel;
        OneFontTextView oneFontTextView = (OneFontTextView) ViewBindings.findChildViewById(view, i);
        if (oneFontTextView != null) {
            i = R.id.btnConfirm;
            OneFontTextView oneFontTextView2 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
            if (oneFontTextView2 != null) {
                i = R.id.btnToggleCompany;
                AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(view, i);
                if (appCompatImageView != null) {
                    i = R.id.ivSeller;
                    ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
                    if (imageView != null) {
                        i = R.id.oneFontTextView4;
                        OneFontTextView oneFontTextView3 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                        if (oneFontTextView3 != null) {
                            i = R.id.tvSellerId;
                            OneFontTextView oneFontTextView4 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                            if (oneFontTextView4 != null) {
                                i = R.id.tvSellerName;
                                OneFontTextView oneFontTextView5 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                if (oneFontTextView5 != null) {
                                    return new DialogOneConfirmShopBinding((LinearLayoutCompat) view, oneFontTextView, oneFontTextView2, appCompatImageView, imageView, oneFontTextView3, oneFontTextView4, oneFontTextView5);
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
    public static DialogOneConfirmShopBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static DialogOneConfirmShopBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.dialog_one_confirm_shop, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayoutCompat getRoot() {
        return this.f83726a;
    }
}