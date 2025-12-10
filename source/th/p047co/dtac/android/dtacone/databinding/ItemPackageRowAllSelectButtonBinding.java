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

/* renamed from: th.co.dtac.android.dtacone.databinding.ItemPackageRowAllSelectButtonBinding */
/* loaded from: classes7.dex */
public final class ItemPackageRowAllSelectButtonBinding implements ViewBinding {

    /* renamed from: a */
    public final LinearLayoutCompat f84382a;
    @NonNull
    public final ImageView buttonChoose;
    @NonNull
    public final ImageView img;
    @NonNull
    public final LinearLayoutCompat packageBox;
    @NonNull
    public final DtacFontTextView packageMainItemTextView;

    public ItemPackageRowAllSelectButtonBinding(LinearLayoutCompat linearLayoutCompat, ImageView imageView, ImageView imageView2, LinearLayoutCompat linearLayoutCompat2, DtacFontTextView dtacFontTextView) {
        this.f84382a = linearLayoutCompat;
        this.buttonChoose = imageView;
        this.img = imageView2;
        this.packageBox = linearLayoutCompat2;
        this.packageMainItemTextView = dtacFontTextView;
    }

    @NonNull
    public static ItemPackageRowAllSelectButtonBinding bind(@NonNull View view) {
        int i = R.id.buttonChoose;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
        if (imageView != null) {
            i = R.id.img;
            ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, i);
            if (imageView2 != null) {
                LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) view;
                i = R.id.packageMainItemTextView;
                DtacFontTextView dtacFontTextView = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                if (dtacFontTextView != null) {
                    return new ItemPackageRowAllSelectButtonBinding(linearLayoutCompat, imageView, imageView2, linearLayoutCompat, dtacFontTextView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static ItemPackageRowAllSelectButtonBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ItemPackageRowAllSelectButtonBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.item_package_row_all_select_button, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayoutCompat getRoot() {
        return this.f84382a;
    }
}
