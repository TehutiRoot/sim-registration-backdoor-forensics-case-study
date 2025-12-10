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

/* renamed from: th.co.dtac.android.dtacone.databinding.ItemPackageNameBinding */
/* loaded from: classes7.dex */
public final class ItemPackageNameBinding implements ViewBinding {

    /* renamed from: a */
    public final RelativeLayout f84381a;
    @NonNull
    public final ImageView ivRightButton;
    @NonNull
    public final RelativeLayout layoutCampaignItem;
    @NonNull
    public final DtacFontTextView tvItemName;
    @NonNull
    public final View vLineSeparate;

    public ItemPackageNameBinding(RelativeLayout relativeLayout, ImageView imageView, RelativeLayout relativeLayout2, DtacFontTextView dtacFontTextView, View view) {
        this.f84381a = relativeLayout;
        this.ivRightButton = imageView;
        this.layoutCampaignItem = relativeLayout2;
        this.tvItemName = dtacFontTextView;
        this.vLineSeparate = view;
    }

    @NonNull
    public static ItemPackageNameBinding bind(@NonNull View view) {
        View findChildViewById;
        int i = R.id.ivRightButton;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
        if (imageView != null) {
            RelativeLayout relativeLayout = (RelativeLayout) view;
            i = R.id.tvItemName;
            DtacFontTextView dtacFontTextView = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
            if (dtacFontTextView != null && (findChildViewById = ViewBindings.findChildViewById(view, (i = R.id.vLineSeparate))) != null) {
                return new ItemPackageNameBinding(relativeLayout, imageView, relativeLayout, dtacFontTextView, findChildViewById);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static ItemPackageNameBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ItemPackageNameBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.item_package_name, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public RelativeLayout getRoot() {
        return this.f84381a;
    }
}
