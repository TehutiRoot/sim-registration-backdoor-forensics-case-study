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
import th.p047co.dtac.android.dtacone.app_one.widget.OneFontTextView;

/* renamed from: th.co.dtac.android.dtacone.databinding.ItemOneServiceItemBinding */
/* loaded from: classes7.dex */
public final class ItemOneServiceItemBinding implements ViewBinding {

    /* renamed from: a */
    public final RelativeLayout f84367a;
    @NonNull
    public final ImageView ivServiceImage;
    @NonNull
    public final RelativeLayout layoutServiceItem;
    @NonNull
    public final OneFontTextView tvServiceName;

    public ItemOneServiceItemBinding(RelativeLayout relativeLayout, ImageView imageView, RelativeLayout relativeLayout2, OneFontTextView oneFontTextView) {
        this.f84367a = relativeLayout;
        this.ivServiceImage = imageView;
        this.layoutServiceItem = relativeLayout2;
        this.tvServiceName = oneFontTextView;
    }

    @NonNull
    public static ItemOneServiceItemBinding bind(@NonNull View view) {
        int i = R.id.ivServiceImage;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
        if (imageView != null) {
            RelativeLayout relativeLayout = (RelativeLayout) view;
            int i2 = R.id.tvServiceName;
            OneFontTextView oneFontTextView = (OneFontTextView) ViewBindings.findChildViewById(view, i2);
            if (oneFontTextView != null) {
                return new ItemOneServiceItemBinding(relativeLayout, imageView, relativeLayout, oneFontTextView);
            }
            i = i2;
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static ItemOneServiceItemBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ItemOneServiceItemBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.item_one_service_item, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public RelativeLayout getRoot() {
        return this.f84367a;
    }
}
