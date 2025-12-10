package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import th.p047co.dtac.android.dtacone.R;

/* renamed from: th.co.dtac.android.dtacone.databinding.IncludeLayoutErrorCurrentShopBinding */
/* loaded from: classes7.dex */
public final class IncludeLayoutErrorCurrentShopBinding implements ViewBinding {

    /* renamed from: a */
    public final RelativeLayout f84347a;
    @NonNull
    public final LinearLayout btnCurrentShopRetry;
    @NonNull
    public final RelativeLayout layoutCurrentShopError;

    public IncludeLayoutErrorCurrentShopBinding(RelativeLayout relativeLayout, LinearLayout linearLayout, RelativeLayout relativeLayout2) {
        this.f84347a = relativeLayout;
        this.btnCurrentShopRetry = linearLayout;
        this.layoutCurrentShopError = relativeLayout2;
    }

    @NonNull
    public static IncludeLayoutErrorCurrentShopBinding bind(@NonNull View view) {
        int i = R.id.btnCurrentShopRetry;
        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i);
        if (linearLayout != null) {
            RelativeLayout relativeLayout = (RelativeLayout) view;
            return new IncludeLayoutErrorCurrentShopBinding(relativeLayout, linearLayout, relativeLayout);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static IncludeLayoutErrorCurrentShopBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static IncludeLayoutErrorCurrentShopBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.include_layout_error_current_shop, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public RelativeLayout getRoot() {
        return this.f84347a;
    }
}