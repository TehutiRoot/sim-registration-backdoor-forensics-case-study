package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.app_one.widget.OneFontTextView;

/* renamed from: th.co.dtac.android.dtacone.databinding.OneShopItemLayoutBinding */
/* loaded from: classes7.dex */
public final class OneShopItemLayoutBinding implements ViewBinding {

    /* renamed from: a */
    public final ConstraintLayout f84526a;
    @NonNull
    public final AppCompatImageView btnToggleCompany;
    @NonNull
    public final ImageView ivNext;
    @NonNull
    public final ImageView ivSeller;
    @NonNull
    public final ConstraintLayout oneShopItem;
    @NonNull
    public final OneFontTextView tvSellerId;
    @NonNull
    public final OneFontTextView tvSellerName;
    @NonNull
    public final View viewLine;

    public OneShopItemLayoutBinding(ConstraintLayout constraintLayout, AppCompatImageView appCompatImageView, ImageView imageView, ImageView imageView2, ConstraintLayout constraintLayout2, OneFontTextView oneFontTextView, OneFontTextView oneFontTextView2, View view) {
        this.f84526a = constraintLayout;
        this.btnToggleCompany = appCompatImageView;
        this.ivNext = imageView;
        this.ivSeller = imageView2;
        this.oneShopItem = constraintLayout2;
        this.tvSellerId = oneFontTextView;
        this.tvSellerName = oneFontTextView2;
        this.viewLine = view;
    }

    @NonNull
    public static OneShopItemLayoutBinding bind(@NonNull View view) {
        View findChildViewById;
        int i = R.id.btnToggleCompany;
        AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(view, i);
        if (appCompatImageView != null) {
            i = R.id.ivNext;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
            if (imageView != null) {
                i = R.id.ivSeller;
                ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, i);
                if (imageView2 != null) {
                    ConstraintLayout constraintLayout = (ConstraintLayout) view;
                    i = R.id.tvSellerId;
                    OneFontTextView oneFontTextView = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                    if (oneFontTextView != null) {
                        i = R.id.tvSellerName;
                        OneFontTextView oneFontTextView2 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                        if (oneFontTextView2 != null && (findChildViewById = ViewBindings.findChildViewById(view, (i = R.id.viewLine))) != null) {
                            return new OneShopItemLayoutBinding(constraintLayout, appCompatImageView, imageView, imageView2, constraintLayout, oneFontTextView, oneFontTextView2, findChildViewById);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static OneShopItemLayoutBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static OneShopItemLayoutBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.one_shop_item_layout, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.f84526a;
    }
}
