package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import th.p047co.dtac.android.dtacone.R;

/* renamed from: th.co.dtac.android.dtacone.databinding.LayoutLinkageMenuBinding */
/* loaded from: classes7.dex */
public final class LayoutLinkageMenuBinding implements ViewBinding {

    /* renamed from: a */
    public final ImageView f84515a;
    @NonNull
    public final ImageView menuLinkageIcon;

    public LayoutLinkageMenuBinding(ImageView imageView, ImageView imageView2) {
        this.f84515a = imageView;
        this.menuLinkageIcon = imageView2;
    }

    @NonNull
    public static LayoutLinkageMenuBinding bind(@NonNull View view) {
        if (view != null) {
            ImageView imageView = (ImageView) view;
            return new LayoutLinkageMenuBinding(imageView, imageView);
        }
        throw new NullPointerException("rootView");
    }

    @NonNull
    public static LayoutLinkageMenuBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static LayoutLinkageMenuBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.layout_linkage_menu, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ImageView getRoot() {
        return this.f84515a;
    }
}