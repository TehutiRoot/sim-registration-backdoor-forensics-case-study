package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.widget.view.DtacFontTextView;

/* renamed from: th.co.dtac.android.dtacone.databinding.ZRectifyHeaderRowBinding */
/* loaded from: classes7.dex */
public final class ZRectifyHeaderRowBinding implements ViewBinding {

    /* renamed from: a */
    public final CardView f84690a;
    @NonNull
    public final RelativeLayout commissionHistoryHeader;
    @NonNull
    public final CardView cvRectify;
    @NonNull
    public final DtacFontTextView tvDate;

    public ZRectifyHeaderRowBinding(CardView cardView, RelativeLayout relativeLayout, CardView cardView2, DtacFontTextView dtacFontTextView) {
        this.f84690a = cardView;
        this.commissionHistoryHeader = relativeLayout;
        this.cvRectify = cardView2;
        this.tvDate = dtacFontTextView;
    }

    @NonNull
    public static ZRectifyHeaderRowBinding bind(@NonNull View view) {
        int i = R.id.commissionHistoryHeader;
        RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, i);
        if (relativeLayout != null) {
            CardView cardView = (CardView) view;
            int i2 = R.id.tvDate;
            DtacFontTextView dtacFontTextView = (DtacFontTextView) ViewBindings.findChildViewById(view, i2);
            if (dtacFontTextView != null) {
                return new ZRectifyHeaderRowBinding(cardView, relativeLayout, cardView, dtacFontTextView);
            }
            i = i2;
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static ZRectifyHeaderRowBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ZRectifyHeaderRowBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.z_rectify_header_row, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public CardView getRoot() {
        return this.f84690a;
    }
}
