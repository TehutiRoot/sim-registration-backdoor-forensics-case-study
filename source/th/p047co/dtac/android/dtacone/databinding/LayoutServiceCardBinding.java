package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.widget.view.DtacFontTextView;

/* renamed from: th.co.dtac.android.dtacone.databinding.LayoutServiceCardBinding */
/* loaded from: classes7.dex */
public final class LayoutServiceCardBinding implements ViewBinding {
    @NonNull
    public final DtacFontTextView NumberContract;
    @NonNull
    public final ImageView ServiceIcon;
    @NonNull
    public final DtacFontTextView ServiceLabel;

    /* renamed from: a */
    public final CardView f84412a;
    @NonNull
    public final ImageView arrow;

    public LayoutServiceCardBinding(CardView cardView, DtacFontTextView dtacFontTextView, ImageView imageView, DtacFontTextView dtacFontTextView2, ImageView imageView2) {
        this.f84412a = cardView;
        this.NumberContract = dtacFontTextView;
        this.ServiceIcon = imageView;
        this.ServiceLabel = dtacFontTextView2;
        this.arrow = imageView2;
    }

    @NonNull
    public static LayoutServiceCardBinding bind(@NonNull View view) {
        int i = R.id.NumberContract;
        DtacFontTextView dtacFontTextView = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
        if (dtacFontTextView != null) {
            i = R.id.ServiceIcon;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
            if (imageView != null) {
                i = R.id.ServiceLabel;
                DtacFontTextView dtacFontTextView2 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                if (dtacFontTextView2 != null) {
                    i = R.id.arrow;
                    ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, i);
                    if (imageView2 != null) {
                        return new LayoutServiceCardBinding((CardView) view, dtacFontTextView, imageView, dtacFontTextView2, imageView2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static LayoutServiceCardBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static LayoutServiceCardBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.layout_service_card, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public CardView getRoot() {
        return this.f84412a;
    }
}
