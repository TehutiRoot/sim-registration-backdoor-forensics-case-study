package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.widget.view.DtacFontTextView;

/* renamed from: th.co.dtac.android.dtacone.databinding.RtrHistoryHeaderBinding */
/* loaded from: classes7.dex */
public final class RtrHistoryHeaderBinding implements ViewBinding {

    /* renamed from: a */
    public final CardView f84567a;
    @NonNull
    public final CardView cvRectify;
    @NonNull
    public final DtacFontTextView listTitle;
    @NonNull
    public final DtacFontTextView listValue;
    @NonNull
    public final DtacFontTextView title;
    @NonNull
    public final DtacFontTextView totalTitle;
    @NonNull
    public final DtacFontTextView totalValue;

    public RtrHistoryHeaderBinding(CardView cardView, CardView cardView2, DtacFontTextView dtacFontTextView, DtacFontTextView dtacFontTextView2, DtacFontTextView dtacFontTextView3, DtacFontTextView dtacFontTextView4, DtacFontTextView dtacFontTextView5) {
        this.f84567a = cardView;
        this.cvRectify = cardView2;
        this.listTitle = dtacFontTextView;
        this.listValue = dtacFontTextView2;
        this.title = dtacFontTextView3;
        this.totalTitle = dtacFontTextView4;
        this.totalValue = dtacFontTextView5;
    }

    @NonNull
    public static RtrHistoryHeaderBinding bind(@NonNull View view) {
        CardView cardView = (CardView) view;
        int i = R.id.listTitle;
        DtacFontTextView dtacFontTextView = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
        if (dtacFontTextView != null) {
            i = R.id.listValue;
            DtacFontTextView dtacFontTextView2 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
            if (dtacFontTextView2 != null) {
                i = R.id.title;
                DtacFontTextView dtacFontTextView3 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                if (dtacFontTextView3 != null) {
                    i = R.id.totalTitle;
                    DtacFontTextView dtacFontTextView4 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                    if (dtacFontTextView4 != null) {
                        i = R.id.totalValue;
                        DtacFontTextView dtacFontTextView5 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                        if (dtacFontTextView5 != null) {
                            return new RtrHistoryHeaderBinding(cardView, cardView, dtacFontTextView, dtacFontTextView2, dtacFontTextView3, dtacFontTextView4, dtacFontTextView5);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static RtrHistoryHeaderBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static RtrHistoryHeaderBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.rtr_history_header, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public CardView getRoot() {
        return this.f84567a;
    }
}
