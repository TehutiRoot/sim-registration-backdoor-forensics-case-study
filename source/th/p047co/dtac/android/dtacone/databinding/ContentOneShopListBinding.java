package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import th.p047co.dtac.android.dtacone.R;

/* renamed from: th.co.dtac.android.dtacone.databinding.ContentOneShopListBinding */
/* loaded from: classes7.dex */
public final class ContentOneShopListBinding implements ViewBinding {

    /* renamed from: a */
    public final ConstraintLayout f83604a;
    @NonNull
    public final FrameLayout oneShopListContainer;

    public ContentOneShopListBinding(ConstraintLayout constraintLayout, FrameLayout frameLayout) {
        this.f83604a = constraintLayout;
        this.oneShopListContainer = frameLayout;
    }

    @NonNull
    public static ContentOneShopListBinding bind(@NonNull View view) {
        int i = R.id.oneShopListContainer;
        FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, i);
        if (frameLayout != null) {
            return new ContentOneShopListBinding((ConstraintLayout) view, frameLayout);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static ContentOneShopListBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ContentOneShopListBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.content_one_shop_list, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.f83604a;
    }
}
