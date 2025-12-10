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

/* renamed from: th.co.dtac.android.dtacone.databinding.DialogChangePackageBinding */
/* loaded from: classes7.dex */
public final class DialogChangePackageBinding implements ViewBinding {

    /* renamed from: a */
    public final LinearLayout f83613a;
    @NonNull
    public final DtacFontTextView tvLabelPackage;
    @NonNull
    public final DtacFontTextView tvPackageValue;
    @NonNull
    public final DtacFontTextView tvStartDate;
    @NonNull
    public final DtacFontTextView tvTitle;

    public DialogChangePackageBinding(LinearLayout linearLayout, DtacFontTextView dtacFontTextView, DtacFontTextView dtacFontTextView2, DtacFontTextView dtacFontTextView3, DtacFontTextView dtacFontTextView4) {
        this.f83613a = linearLayout;
        this.tvLabelPackage = dtacFontTextView;
        this.tvPackageValue = dtacFontTextView2;
        this.tvStartDate = dtacFontTextView3;
        this.tvTitle = dtacFontTextView4;
    }

    @NonNull
    public static DialogChangePackageBinding bind(@NonNull View view) {
        int i = R.id.tvLabelPackage;
        DtacFontTextView dtacFontTextView = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
        if (dtacFontTextView != null) {
            i = R.id.tvPackageValue;
            DtacFontTextView dtacFontTextView2 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
            if (dtacFontTextView2 != null) {
                i = R.id.tvStartDate;
                DtacFontTextView dtacFontTextView3 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                if (dtacFontTextView3 != null) {
                    i = R.id.tvTitle;
                    DtacFontTextView dtacFontTextView4 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                    if (dtacFontTextView4 != null) {
                        return new DialogChangePackageBinding((LinearLayout) view, dtacFontTextView, dtacFontTextView2, dtacFontTextView3, dtacFontTextView4);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static DialogChangePackageBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static DialogChangePackageBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.dialog_change_package, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayout getRoot() {
        return this.f83613a;
    }
}
