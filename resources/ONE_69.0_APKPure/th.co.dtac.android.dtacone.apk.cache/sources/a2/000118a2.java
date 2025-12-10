package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.widget.view.DtacFontTextView;

/* renamed from: th.co.dtac.android.dtacone.databinding.WidgetCustomerInfoStatusImageViewBinding */
/* loaded from: classes7.dex */
public final class WidgetCustomerInfoStatusImageViewBinding implements ViewBinding {

    /* renamed from: a */
    public final ConstraintLayout f84689a;
    @NonNull
    public final ImageView imageViewSimType;
    @NonNull
    public final DtacFontTextView numberBadge;

    public WidgetCustomerInfoStatusImageViewBinding(ConstraintLayout constraintLayout, ImageView imageView, DtacFontTextView dtacFontTextView) {
        this.f84689a = constraintLayout;
        this.imageViewSimType = imageView;
        this.numberBadge = dtacFontTextView;
    }

    @NonNull
    public static WidgetCustomerInfoStatusImageViewBinding bind(@NonNull View view) {
        int i = R.id.imageViewSimType;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
        if (imageView != null) {
            i = R.id.numberBadge;
            DtacFontTextView dtacFontTextView = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
            if (dtacFontTextView != null) {
                return new WidgetCustomerInfoStatusImageViewBinding((ConstraintLayout) view, imageView, dtacFontTextView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static WidgetCustomerInfoStatusImageViewBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static WidgetCustomerInfoStatusImageViewBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.widget_customer_info_status_image_view, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.f84689a;
    }
}