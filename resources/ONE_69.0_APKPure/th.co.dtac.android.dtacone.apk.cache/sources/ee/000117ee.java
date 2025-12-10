package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.widget.view.DtacFontTextView;

/* renamed from: th.co.dtac.android.dtacone.databinding.LayoutBigTabDefaultBinding */
/* loaded from: classes7.dex */
public final class LayoutBigTabDefaultBinding implements ViewBinding {

    /* renamed from: a */
    public final LinearLayout f84509a;
    @NonNull
    public final LinearLayout defaultTab1;
    @NonNull
    public final LinearLayout defaultTab2;
    @NonNull
    public final ImageView iconTab1;
    @NonNull
    public final ImageView iconTab2;
    @NonNull
    public final DtacFontTextView titleTab1;
    @NonNull
    public final DtacFontTextView titleTab2;

    public LayoutBigTabDefaultBinding(LinearLayout linearLayout, LinearLayout linearLayout2, LinearLayout linearLayout3, ImageView imageView, ImageView imageView2, DtacFontTextView dtacFontTextView, DtacFontTextView dtacFontTextView2) {
        this.f84509a = linearLayout;
        this.defaultTab1 = linearLayout2;
        this.defaultTab2 = linearLayout3;
        this.iconTab1 = imageView;
        this.iconTab2 = imageView2;
        this.titleTab1 = dtacFontTextView;
        this.titleTab2 = dtacFontTextView2;
    }

    @NonNull
    public static LayoutBigTabDefaultBinding bind(@NonNull View view) {
        int i = R.id.defaultTab1;
        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i);
        if (linearLayout != null) {
            i = R.id.defaultTab2;
            LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(view, i);
            if (linearLayout2 != null) {
                i = R.id.iconTab1;
                ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
                if (imageView != null) {
                    i = R.id.iconTab2;
                    ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, i);
                    if (imageView2 != null) {
                        i = R.id.titleTab1;
                        DtacFontTextView dtacFontTextView = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                        if (dtacFontTextView != null) {
                            i = R.id.titleTab2;
                            DtacFontTextView dtacFontTextView2 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                            if (dtacFontTextView2 != null) {
                                return new LayoutBigTabDefaultBinding((LinearLayout) view, linearLayout, linearLayout2, imageView, imageView2, dtacFontTextView, dtacFontTextView2);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static LayoutBigTabDefaultBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static LayoutBigTabDefaultBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.layout_big_tab_default, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayout getRoot() {
        return this.f84509a;
    }
}