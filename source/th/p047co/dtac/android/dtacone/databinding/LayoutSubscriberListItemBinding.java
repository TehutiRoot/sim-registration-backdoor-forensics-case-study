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

/* renamed from: th.co.dtac.android.dtacone.databinding.LayoutSubscriberListItemBinding */
/* loaded from: classes7.dex */
public final class LayoutSubscriberListItemBinding implements ViewBinding {

    /* renamed from: a */
    public final ConstraintLayout f84413a;
    @NonNull
    public final ImageView imageView3;
    @NonNull
    public final ImageView statusIndicator;
    @NonNull
    public final DtacFontTextView textViewAOU;
    @NonNull
    public final DtacFontTextView textViewContractDay;
    @NonNull
    public final DtacFontTextView textViewName;
    @NonNull
    public final DtacFontTextView textViewSubscriberNumber;

    public LayoutSubscriberListItemBinding(ConstraintLayout constraintLayout, ImageView imageView, ImageView imageView2, DtacFontTextView dtacFontTextView, DtacFontTextView dtacFontTextView2, DtacFontTextView dtacFontTextView3, DtacFontTextView dtacFontTextView4) {
        this.f84413a = constraintLayout;
        this.imageView3 = imageView;
        this.statusIndicator = imageView2;
        this.textViewAOU = dtacFontTextView;
        this.textViewContractDay = dtacFontTextView2;
        this.textViewName = dtacFontTextView3;
        this.textViewSubscriberNumber = dtacFontTextView4;
    }

    @NonNull
    public static LayoutSubscriberListItemBinding bind(@NonNull View view) {
        int i = R.id.imageView3;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
        if (imageView != null) {
            i = R.id.statusIndicator;
            ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, i);
            if (imageView2 != null) {
                i = R.id.textViewAOU;
                DtacFontTextView dtacFontTextView = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                if (dtacFontTextView != null) {
                    i = R.id.textViewContractDay;
                    DtacFontTextView dtacFontTextView2 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                    if (dtacFontTextView2 != null) {
                        i = R.id.textViewName;
                        DtacFontTextView dtacFontTextView3 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                        if (dtacFontTextView3 != null) {
                            i = R.id.textViewSubscriberNumber;
                            DtacFontTextView dtacFontTextView4 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                            if (dtacFontTextView4 != null) {
                                return new LayoutSubscriberListItemBinding((ConstraintLayout) view, imageView, imageView2, dtacFontTextView, dtacFontTextView2, dtacFontTextView3, dtacFontTextView4);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static LayoutSubscriberListItemBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static LayoutSubscriberListItemBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.layout_subscriber_list_item, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.f84413a;
    }
}
