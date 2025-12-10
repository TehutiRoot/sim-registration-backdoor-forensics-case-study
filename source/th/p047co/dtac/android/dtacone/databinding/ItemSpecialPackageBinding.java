package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.widget.view.DtacFontTextView;

/* renamed from: th.co.dtac.android.dtacone.databinding.ItemSpecialPackageBinding */
/* loaded from: classes7.dex */
public final class ItemSpecialPackageBinding implements ViewBinding {

    /* renamed from: a */
    public final LinearLayoutCompat f84394a;
    @NonNull
    public final ImageView chevronRight;
    @NonNull
    public final ImageView img;
    @NonNull
    public final LinearLayoutCompat packageBox;
    @NonNull
    public final DtacFontTextView packageMainItemTextView;

    public ItemSpecialPackageBinding(LinearLayoutCompat linearLayoutCompat, ImageView imageView, ImageView imageView2, LinearLayoutCompat linearLayoutCompat2, DtacFontTextView dtacFontTextView) {
        this.f84394a = linearLayoutCompat;
        this.chevronRight = imageView;
        this.img = imageView2;
        this.packageBox = linearLayoutCompat2;
        this.packageMainItemTextView = dtacFontTextView;
    }

    @NonNull
    public static ItemSpecialPackageBinding bind(@NonNull View view) {
        int i = R.id.chevronRight;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
        if (imageView != null) {
            i = R.id.img;
            ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, i);
            if (imageView2 != null) {
                LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) view;
                i = R.id.packageMainItemTextView;
                DtacFontTextView dtacFontTextView = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                if (dtacFontTextView != null) {
                    return new ItemSpecialPackageBinding(linearLayoutCompat, imageView, imageView2, linearLayoutCompat, dtacFontTextView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static ItemSpecialPackageBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ItemSpecialPackageBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.item_special_package, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayoutCompat getRoot() {
        return this.f84394a;
    }
}
