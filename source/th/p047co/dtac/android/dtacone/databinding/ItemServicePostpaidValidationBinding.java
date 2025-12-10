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

/* renamed from: th.co.dtac.android.dtacone.databinding.ItemServicePostpaidValidationBinding */
/* loaded from: classes7.dex */
public final class ItemServicePostpaidValidationBinding implements ViewBinding {

    /* renamed from: a */
    public final RelativeLayout f84393a;
    @NonNull
    public final ImageView ivServiceImage;
    @NonNull
    public final RelativeLayout layoutServiceItem;
    @NonNull
    public final DtacFontTextView tvServiceName;

    public ItemServicePostpaidValidationBinding(RelativeLayout relativeLayout, ImageView imageView, RelativeLayout relativeLayout2, DtacFontTextView dtacFontTextView) {
        this.f84393a = relativeLayout;
        this.ivServiceImage = imageView;
        this.layoutServiceItem = relativeLayout2;
        this.tvServiceName = dtacFontTextView;
    }

    @NonNull
    public static ItemServicePostpaidValidationBinding bind(@NonNull View view) {
        int i = R.id.ivServiceImage;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
        if (imageView != null) {
            RelativeLayout relativeLayout = (RelativeLayout) view;
            int i2 = R.id.tvServiceName;
            DtacFontTextView dtacFontTextView = (DtacFontTextView) ViewBindings.findChildViewById(view, i2);
            if (dtacFontTextView != null) {
                return new ItemServicePostpaidValidationBinding(relativeLayout, imageView, relativeLayout, dtacFontTextView);
            }
            i = i2;
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static ItemServicePostpaidValidationBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ItemServicePostpaidValidationBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.item_service_postpaid_validation, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public RelativeLayout getRoot() {
        return this.f84393a;
    }
}
