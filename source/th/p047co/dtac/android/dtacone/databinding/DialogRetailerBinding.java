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
import th.p047co.dtac.android.dtacone.widget.view.DtacClearableEditText;
import th.p047co.dtac.android.dtacone.widget.view.DtacFontTextView;

/* renamed from: th.co.dtac.android.dtacone.databinding.DialogRetailerBinding */
/* loaded from: classes7.dex */
public final class DialogRetailerBinding implements ViewBinding {

    /* renamed from: a */
    public final LinearLayout f83635a;
    @NonNull
    public final DtacFontTextView errorMessage;
    @NonNull
    public final DtacClearableEditText retailerCode;
    @NonNull
    public final DtacFontTextView retailerTitle;

    public DialogRetailerBinding(LinearLayout linearLayout, DtacFontTextView dtacFontTextView, DtacClearableEditText dtacClearableEditText, DtacFontTextView dtacFontTextView2) {
        this.f83635a = linearLayout;
        this.errorMessage = dtacFontTextView;
        this.retailerCode = dtacClearableEditText;
        this.retailerTitle = dtacFontTextView2;
    }

    @NonNull
    public static DialogRetailerBinding bind(@NonNull View view) {
        int i = R.id.errorMessage;
        DtacFontTextView dtacFontTextView = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
        if (dtacFontTextView != null) {
            i = R.id.retailerCode;
            DtacClearableEditText dtacClearableEditText = (DtacClearableEditText) ViewBindings.findChildViewById(view, i);
            if (dtacClearableEditText != null) {
                i = R.id.retailerTitle;
                DtacFontTextView dtacFontTextView2 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                if (dtacFontTextView2 != null) {
                    return new DialogRetailerBinding((LinearLayout) view, dtacFontTextView, dtacClearableEditText, dtacFontTextView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static DialogRetailerBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static DialogRetailerBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.dialog_retailer, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayout getRoot() {
        return this.f83635a;
    }
}
