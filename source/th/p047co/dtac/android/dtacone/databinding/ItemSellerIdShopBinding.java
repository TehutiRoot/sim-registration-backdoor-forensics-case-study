package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.widget.view.DtacFontTextView;

/* renamed from: th.co.dtac.android.dtacone.databinding.ItemSellerIdShopBinding */
/* loaded from: classes7.dex */
public final class ItemSellerIdShopBinding implements ViewBinding {

    /* renamed from: a */
    public final RelativeLayout f84391a;
    @NonNull
    public final ImageView icLocation;
    @NonNull
    public final RelativeLayout layoutShop;
    @NonNull
    public final DtacFontTextView tvItemShopCode;
    @NonNull
    public final DtacFontTextView tvItemShopName;

    public ItemSellerIdShopBinding(RelativeLayout relativeLayout, ImageView imageView, RelativeLayout relativeLayout2, DtacFontTextView dtacFontTextView, DtacFontTextView dtacFontTextView2) {
        this.f84391a = relativeLayout;
        this.icLocation = imageView;
        this.layoutShop = relativeLayout2;
        this.tvItemShopCode = dtacFontTextView;
        this.tvItemShopName = dtacFontTextView2;
    }

    @NonNull
    public static ItemSellerIdShopBinding bind(@NonNull View view) {
        int i = R.id.icLocation;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
        if (imageView != null) {
            RelativeLayout relativeLayout = (RelativeLayout) view;
            i = R.id.tvItemShopCode;
            DtacFontTextView dtacFontTextView = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
            if (dtacFontTextView != null) {
                i = R.id.tvItemShopName;
                DtacFontTextView dtacFontTextView2 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                if (dtacFontTextView2 != null) {
                    return new ItemSellerIdShopBinding(relativeLayout, imageView, relativeLayout, dtacFontTextView, dtacFontTextView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static ItemSellerIdShopBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ItemSellerIdShopBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.item_seller_id_shop, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public RelativeLayout getRoot() {
        return this.f84391a;
    }
}
