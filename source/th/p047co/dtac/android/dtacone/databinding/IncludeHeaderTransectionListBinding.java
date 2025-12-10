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

/* renamed from: th.co.dtac.android.dtacone.databinding.IncludeHeaderTransectionListBinding */
/* loaded from: classes7.dex */
public final class IncludeHeaderTransectionListBinding implements ViewBinding {

    /* renamed from: a */
    public final LinearLayout f84237a;
    @NonNull
    public final DtacFontTextView textviewTranHeaderListTitle;
    @NonNull
    public final DtacFontTextView textviewTranHeaderListValue;
    @NonNull
    public final DtacFontTextView textviewTranHeaderTotalTitle;
    @NonNull
    public final DtacFontTextView textviewTranHeaderTotalValue;

    public IncludeHeaderTransectionListBinding(LinearLayout linearLayout, DtacFontTextView dtacFontTextView, DtacFontTextView dtacFontTextView2, DtacFontTextView dtacFontTextView3, DtacFontTextView dtacFontTextView4) {
        this.f84237a = linearLayout;
        this.textviewTranHeaderListTitle = dtacFontTextView;
        this.textviewTranHeaderListValue = dtacFontTextView2;
        this.textviewTranHeaderTotalTitle = dtacFontTextView3;
        this.textviewTranHeaderTotalValue = dtacFontTextView4;
    }

    @NonNull
    public static IncludeHeaderTransectionListBinding bind(@NonNull View view) {
        int i = R.id.textview_tran_header_listTitle;
        DtacFontTextView dtacFontTextView = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
        if (dtacFontTextView != null) {
            i = R.id.textview_tran_header_listValue;
            DtacFontTextView dtacFontTextView2 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
            if (dtacFontTextView2 != null) {
                i = R.id.textview_tran_header_totalTitle;
                DtacFontTextView dtacFontTextView3 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                if (dtacFontTextView3 != null) {
                    i = R.id.textview_tran_header_totalValue;
                    DtacFontTextView dtacFontTextView4 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                    if (dtacFontTextView4 != null) {
                        return new IncludeHeaderTransectionListBinding((LinearLayout) view, dtacFontTextView, dtacFontTextView2, dtacFontTextView3, dtacFontTextView4);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static IncludeHeaderTransectionListBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static IncludeHeaderTransectionListBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.include_header_transection_list, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayout getRoot() {
        return this.f84237a;
    }
}
