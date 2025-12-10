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
import th.p047co.dtac.android.dtacone.app_one.widget.OneEditText;

/* renamed from: th.co.dtac.android.dtacone.databinding.OneShopSearchBarEdittextBinding */
/* loaded from: classes7.dex */
public final class OneShopSearchBarEdittextBinding implements ViewBinding {

    /* renamed from: a */
    public final RelativeLayout f84527a;
    @NonNull
    public final OneEditText edtSearchSeller;
    @NonNull
    public final ImageView searchIcon;

    public OneShopSearchBarEdittextBinding(RelativeLayout relativeLayout, OneEditText oneEditText, ImageView imageView) {
        this.f84527a = relativeLayout;
        this.edtSearchSeller = oneEditText;
        this.searchIcon = imageView;
    }

    @NonNull
    public static OneShopSearchBarEdittextBinding bind(@NonNull View view) {
        int i = R.id.edtSearchSeller;
        OneEditText oneEditText = (OneEditText) ViewBindings.findChildViewById(view, i);
        if (oneEditText != null) {
            i = R.id.searchIcon;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
            if (imageView != null) {
                return new OneShopSearchBarEdittextBinding((RelativeLayout) view, oneEditText, imageView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static OneShopSearchBarEdittextBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static OneShopSearchBarEdittextBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.one_shop_search_bar_edittext, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public RelativeLayout getRoot() {
        return this.f84527a;
    }
}
