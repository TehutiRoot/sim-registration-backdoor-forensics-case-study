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

/* renamed from: th.co.dtac.android.dtacone.databinding.LayoutBigRadioButtonBinding */
/* loaded from: classes7.dex */
public final class LayoutBigRadioButtonBinding implements ViewBinding {

    /* renamed from: a */
    public final ConstraintLayout f84399a;
    @NonNull
    public final ConstraintLayout layoutBigRadio;
    @NonNull
    public final ImageView radio;
    @NonNull
    public final DtacFontTextView textCaption;
    @NonNull
    public final DtacFontTextView textDate;

    public LayoutBigRadioButtonBinding(ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2, ImageView imageView, DtacFontTextView dtacFontTextView, DtacFontTextView dtacFontTextView2) {
        this.f84399a = constraintLayout;
        this.layoutBigRadio = constraintLayout2;
        this.radio = imageView;
        this.textCaption = dtacFontTextView;
        this.textDate = dtacFontTextView2;
    }

    @NonNull
    public static LayoutBigRadioButtonBinding bind(@NonNull View view) {
        ConstraintLayout constraintLayout = (ConstraintLayout) view;
        int i = R.id.radio;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
        if (imageView != null) {
            i = R.id.textCaption;
            DtacFontTextView dtacFontTextView = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
            if (dtacFontTextView != null) {
                i = R.id.textDate;
                DtacFontTextView dtacFontTextView2 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                if (dtacFontTextView2 != null) {
                    return new LayoutBigRadioButtonBinding(constraintLayout, constraintLayout, imageView, dtacFontTextView, dtacFontTextView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static LayoutBigRadioButtonBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static LayoutBigRadioButtonBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.layout_big_radio_button, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.f84399a;
    }
}
