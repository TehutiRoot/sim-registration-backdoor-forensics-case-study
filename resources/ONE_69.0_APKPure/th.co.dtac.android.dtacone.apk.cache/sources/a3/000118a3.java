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

/* renamed from: th.co.dtac.android.dtacone.databinding.WidgetSubscriberStatusBinding */
/* loaded from: classes7.dex */
public final class WidgetSubscriberStatusBinding implements ViewBinding {

    /* renamed from: a */
    public final ConstraintLayout f84690a;
    @NonNull
    public final ImageView imageViewSimType;
    @NonNull
    public final ImageView statusDot;

    public WidgetSubscriberStatusBinding(ConstraintLayout constraintLayout, ImageView imageView, ImageView imageView2) {
        this.f84690a = constraintLayout;
        this.imageViewSimType = imageView;
        this.statusDot = imageView2;
    }

    @NonNull
    public static WidgetSubscriberStatusBinding bind(@NonNull View view) {
        int i = R.id.imageViewSimType;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
        if (imageView != null) {
            i = R.id.statusDot;
            ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, i);
            if (imageView2 != null) {
                return new WidgetSubscriberStatusBinding((ConstraintLayout) view, imageView, imageView2);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static WidgetSubscriberStatusBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static WidgetSubscriberStatusBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.widget_subscriber_status, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.f84690a;
    }
}