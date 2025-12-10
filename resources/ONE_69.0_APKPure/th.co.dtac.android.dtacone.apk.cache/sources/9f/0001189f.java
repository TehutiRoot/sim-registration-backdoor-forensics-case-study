package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.widget.view.DtacFontTextView;

/* renamed from: th.co.dtac.android.dtacone.databinding.TextviewWithTopLabelBinding */
/* loaded from: classes7.dex */
public final class TextviewWithTopLabelBinding implements ViewBinding {

    /* renamed from: a */
    public final LinearLayout f84686a;
    @NonNull
    public final DtacFontTextView labelText;
    @NonNull
    public final LinearLayout layoutTextLabel;
    @NonNull
    public final DtacFontTextView valueText;

    public TextviewWithTopLabelBinding(LinearLayout linearLayout, DtacFontTextView dtacFontTextView, LinearLayout linearLayout2, DtacFontTextView dtacFontTextView2) {
        this.f84686a = linearLayout;
        this.labelText = dtacFontTextView;
        this.layoutTextLabel = linearLayout2;
        this.valueText = dtacFontTextView2;
    }

    @NonNull
    public static TextviewWithTopLabelBinding bind(@NonNull View view) {
        int i = R.id.labelText;
        DtacFontTextView dtacFontTextView = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
        if (dtacFontTextView != null) {
            LinearLayout linearLayout = (LinearLayout) view;
            int i2 = R.id.valueText;
            DtacFontTextView dtacFontTextView2 = (DtacFontTextView) ViewBindings.findChildViewById(view, i2);
            if (dtacFontTextView2 != null) {
                return new TextviewWithTopLabelBinding(linearLayout, dtacFontTextView, linearLayout, dtacFontTextView2);
            }
            i = i2;
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static TextviewWithTopLabelBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static TextviewWithTopLabelBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.textview_with_top_label, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayout getRoot() {
        return this.f84686a;
    }
}