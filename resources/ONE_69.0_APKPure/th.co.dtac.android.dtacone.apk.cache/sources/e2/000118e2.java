package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import th.p047co.dtac.android.dtacone.R;

/* renamed from: th.co.dtac.android.dtacone.databinding.ZIncludePermissionImageBinding */
/* loaded from: classes7.dex */
public final class ZIncludePermissionImageBinding implements ViewBinding {

    /* renamed from: a */
    public final View f84753a;
    @NonNull
    public final HorizontalScrollView horizontalScroll;
    @NonNull
    public final LinearLayout imagePermissionBox;

    public ZIncludePermissionImageBinding(View view, HorizontalScrollView horizontalScrollView, LinearLayout linearLayout) {
        this.f84753a = view;
        this.horizontalScroll = horizontalScrollView;
        this.imagePermissionBox = linearLayout;
    }

    @NonNull
    public static ZIncludePermissionImageBinding bind(@NonNull View view) {
        int i = R.id.horizontalScroll;
        HorizontalScrollView horizontalScrollView = (HorizontalScrollView) ViewBindings.findChildViewById(view, i);
        if (horizontalScrollView != null) {
            i = R.id.imagePermissionBox;
            LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i);
            if (linearLayout != null) {
                return new ZIncludePermissionImageBinding(view, horizontalScrollView, linearLayout);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static ZIncludePermissionImageBinding inflate(@NonNull LayoutInflater layoutInflater, @NonNull ViewGroup viewGroup) {
        if (viewGroup != null) {
            layoutInflater.inflate(R.layout.z_include_permission_image, viewGroup);
            return bind(viewGroup);
        }
        throw new NullPointerException("parent");
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public View getRoot() {
        return this.f84753a;
    }
}