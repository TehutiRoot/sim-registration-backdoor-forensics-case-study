package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.cardview.widget.CardView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.widget.view.DtacFontTextView;

/* renamed from: th.co.dtac.android.dtacone.databinding.ZInactiveOwnerTransectionItemRowBinding */
/* loaded from: classes7.dex */
public final class ZInactiveOwnerTransectionItemRowBinding implements ViewBinding {

    /* renamed from: a */
    public final CardView f84607a;
    @NonNull
    public final CardView cvDetail;
    @NonNull
    public final AppCompatImageView ivImageType;
    @NonNull
    public final RelativeLayout transactionPrice;
    @NonNull
    public final DtacFontTextView tvTransactionAmount;
    @NonNull
    public final DtacFontTextView tvTransactionPhoneNumber;
    @NonNull
    public final DtacFontTextView tvTransactionTime;
    @NonNull
    public final DtacFontTextView tvTransactionType;
    @NonNull
    public final DtacFontTextView tvTransactionUnit;

    public ZInactiveOwnerTransectionItemRowBinding(CardView cardView, CardView cardView2, AppCompatImageView appCompatImageView, RelativeLayout relativeLayout, DtacFontTextView dtacFontTextView, DtacFontTextView dtacFontTextView2, DtacFontTextView dtacFontTextView3, DtacFontTextView dtacFontTextView4, DtacFontTextView dtacFontTextView5) {
        this.f84607a = cardView;
        this.cvDetail = cardView2;
        this.ivImageType = appCompatImageView;
        this.transactionPrice = relativeLayout;
        this.tvTransactionAmount = dtacFontTextView;
        this.tvTransactionPhoneNumber = dtacFontTextView2;
        this.tvTransactionTime = dtacFontTextView3;
        this.tvTransactionType = dtacFontTextView4;
        this.tvTransactionUnit = dtacFontTextView5;
    }

    @NonNull
    public static ZInactiveOwnerTransectionItemRowBinding bind(@NonNull View view) {
        CardView cardView = (CardView) view;
        int i = R.id.ivImageType;
        AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(view, i);
        if (appCompatImageView != null) {
            i = R.id.transactionPrice;
            RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, i);
            if (relativeLayout != null) {
                i = R.id.tvTransactionAmount;
                DtacFontTextView dtacFontTextView = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                if (dtacFontTextView != null) {
                    i = R.id.tvTransactionPhoneNumber;
                    DtacFontTextView dtacFontTextView2 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                    if (dtacFontTextView2 != null) {
                        i = R.id.tvTransactionTime;
                        DtacFontTextView dtacFontTextView3 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                        if (dtacFontTextView3 != null) {
                            i = R.id.tvTransactionType;
                            DtacFontTextView dtacFontTextView4 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                            if (dtacFontTextView4 != null) {
                                i = R.id.tvTransactionUnit;
                                DtacFontTextView dtacFontTextView5 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                                if (dtacFontTextView5 != null) {
                                    return new ZInactiveOwnerTransectionItemRowBinding(cardView, cardView, appCompatImageView, relativeLayout, dtacFontTextView, dtacFontTextView2, dtacFontTextView3, dtacFontTextView4, dtacFontTextView5);
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static ZInactiveOwnerTransectionItemRowBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ZInactiveOwnerTransectionItemRowBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.z_inactive_owner_transection_item_row, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public CardView getRoot() {
        return this.f84607a;
    }
}
