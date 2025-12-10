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
import th.p047co.dtac.android.dtacone.app_one.widget.OneFontTextView;

/* renamed from: th.co.dtac.android.dtacone.databinding.OneRectifyHeaderRowBinding */
/* loaded from: classes7.dex */
public final class OneRectifyHeaderRowBinding implements ViewBinding {

    /* renamed from: a */
    public final CardView f84631a;
    @NonNull
    public final RelativeLayout commissionHistoryHeader;
    @NonNull
    public final CardView cvRectify;
    @NonNull
    public final OneFontTextView tvDate;

    public OneRectifyHeaderRowBinding(CardView cardView, RelativeLayout relativeLayout, CardView cardView2, OneFontTextView oneFontTextView) {
        this.f84631a = cardView;
        this.commissionHistoryHeader = relativeLayout;
        this.cvRectify = cardView2;
        this.tvDate = oneFontTextView;
    }

    @NonNull
    public static OneRectifyHeaderRowBinding bind(@NonNull View view) {
        int i = R.id.commissionHistoryHeader;
        RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, i);
        if (relativeLayout != null) {
            CardView cardView = (CardView) view;
            int i2 = R.id.tvDate;
            OneFontTextView oneFontTextView = (OneFontTextView) ViewBindings.findChildViewById(view, i2);
            if (oneFontTextView != null) {
                return new OneRectifyHeaderRowBinding(cardView, relativeLayout, cardView, oneFontTextView);
            }
            i = i2;
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static OneRectifyHeaderRowBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static OneRectifyHeaderRowBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.one_rectify_header_row, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public CardView getRoot() {
        return this.f84631a;
    }
}