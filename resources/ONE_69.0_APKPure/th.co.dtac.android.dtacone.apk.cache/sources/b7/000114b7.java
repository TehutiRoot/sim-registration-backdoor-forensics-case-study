package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import th.p047co.dtac.android.dtacone.R;

/* renamed from: th.co.dtac.android.dtacone.databinding.ActivitySellerIdBinding */
/* loaded from: classes7.dex */
public final class ActivitySellerIdBinding implements ViewBinding {

    /* renamed from: a */
    public final RelativeLayout f83682a;
    @NonNull
    public final FrameLayout contentSellerID;
    @NonNull
    public final TransparentToolbarBinding toolbarLayout;

    public ActivitySellerIdBinding(RelativeLayout relativeLayout, FrameLayout frameLayout, TransparentToolbarBinding transparentToolbarBinding) {
        this.f83682a = relativeLayout;
        this.contentSellerID = frameLayout;
        this.toolbarLayout = transparentToolbarBinding;
    }

    @NonNull
    public static ActivitySellerIdBinding bind(@NonNull View view) {
        View findChildViewById;
        int i = R.id.contentSellerID;
        FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, i);
        if (frameLayout != null && (findChildViewById = ViewBindings.findChildViewById(view, (i = R.id.toolbarLayout))) != null) {
            return new ActivitySellerIdBinding((RelativeLayout) view, frameLayout, TransparentToolbarBinding.bind(findChildViewById));
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static ActivitySellerIdBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ActivitySellerIdBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.activity_seller_id, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public RelativeLayout getRoot() {
        return this.f83682a;
    }
}