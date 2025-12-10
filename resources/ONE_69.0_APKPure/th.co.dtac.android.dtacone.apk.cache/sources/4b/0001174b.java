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

/* renamed from: th.co.dtac.android.dtacone.databinding.IncludeLayoutCurrentShopBinding */
/* loaded from: classes7.dex */
public final class IncludeLayoutCurrentShopBinding implements ViewBinding {

    /* renamed from: a */
    public final RelativeLayout f84346a;
    @NonNull
    public final ImageView ivCurrentShop;
    @NonNull
    public final RelativeLayout layoutCurrentShop;
    @NonNull
    public final DtacFontTextView tvShopCode;
    @NonNull
    public final DtacFontTextView tvShopName;

    public IncludeLayoutCurrentShopBinding(RelativeLayout relativeLayout, ImageView imageView, RelativeLayout relativeLayout2, DtacFontTextView dtacFontTextView, DtacFontTextView dtacFontTextView2) {
        this.f84346a = relativeLayout;
        this.ivCurrentShop = imageView;
        this.layoutCurrentShop = relativeLayout2;
        this.tvShopCode = dtacFontTextView;
        this.tvShopName = dtacFontTextView2;
    }

    @NonNull
    public static IncludeLayoutCurrentShopBinding bind(@NonNull View view) {
        int i = R.id.ivCurrentShop;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
        if (imageView != null) {
            RelativeLayout relativeLayout = (RelativeLayout) view;
            i = R.id.tvShopCode;
            DtacFontTextView dtacFontTextView = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
            if (dtacFontTextView != null) {
                i = R.id.tvShopName;
                DtacFontTextView dtacFontTextView2 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                if (dtacFontTextView2 != null) {
                    return new IncludeLayoutCurrentShopBinding(relativeLayout, imageView, relativeLayout, dtacFontTextView, dtacFontTextView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static IncludeLayoutCurrentShopBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static IncludeLayoutCurrentShopBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.include_layout_current_shop, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public RelativeLayout getRoot() {
        return this.f84346a;
    }
}