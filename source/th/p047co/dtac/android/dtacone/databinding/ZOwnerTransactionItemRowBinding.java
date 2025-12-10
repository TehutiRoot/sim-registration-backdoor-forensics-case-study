package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.cardview.widget.CardView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.widget.view.DtacFontTextView;

/* renamed from: th.co.dtac.android.dtacone.databinding.ZOwnerTransactionItemRowBinding */
/* loaded from: classes7.dex */
public final class ZOwnerTransactionItemRowBinding implements ViewBinding {

    /* renamed from: a */
    public final CardView f84677a;
    @NonNull
    public final CardView cvDetail;
    @NonNull
    public final AppCompatImageView ivImageType;
    @NonNull
    public final DtacFontTextView tvTransactionAmount;
    @NonNull
    public final DtacFontTextView tvTransactionName;
    @NonNull
    public final DtacFontTextView tvTransactionOption;
    @NonNull
    public final DtacFontTextView tvTransactionOwnerTitle;
    @NonNull
    public final DtacFontTextView tvTransactionOwnerValue;
    @NonNull
    public final DtacFontTextView tvTransactionPhoneNumber;
    @NonNull
    public final DtacFontTextView tvTransactionTime;
    @NonNull
    public final DtacFontTextView tvTransactionType;
    @NonNull
    public final DtacFontTextView tvTransactionUnit;

    public ZOwnerTransactionItemRowBinding(CardView cardView, CardView cardView2, AppCompatImageView appCompatImageView, DtacFontTextView dtacFontTextView, DtacFontTextView dtacFontTextView2, DtacFontTextView dtacFontTextView3, DtacFontTextView dtacFontTextView4, DtacFontTextView dtacFontTextView5, DtacFontTextView dtacFontTextView6, DtacFontTextView dtacFontTextView7, DtacFontTextView dtacFontTextView8, DtacFontTextView dtacFontTextView9) {
        this.f84677a = cardView;
        this.cvDetail = cardView2;
        this.ivImageType = appCompatImageView;
        this.tvTransactionAmount = dtacFontTextView;
        this.tvTransactionName = dtacFontTextView2;
        this.tvTransactionOption = dtacFontTextView3;
        this.tvTransactionOwnerTitle = dtacFontTextView4;
        this.tvTransactionOwnerValue = dtacFontTextView5;
        this.tvTransactionPhoneNumber = dtacFontTextView6;
        this.tvTransactionTime = dtacFontTextView7;
        this.tvTransactionType = dtacFontTextView8;
        this.tvTransactionUnit = dtacFontTextView9;
    }

    @NonNull
    public static ZOwnerTransactionItemRowBinding bind(@NonNull View view) {
        CardView cardView = (CardView) view;
        int i = R.id.ivImageType;
        AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(view, i);
        if (appCompatImageView != null) {
            i = R.id.tvTransactionAmount;
            DtacFontTextView dtacFontTextView = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
            if (dtacFontTextView != null) {
                i = R.id.tvTransactionName;
                DtacFontTextView dtacFontTextView2 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                if (dtacFontTextView2 != null) {
                    i = R.id.tvTransactionOption;
                    DtacFontTextView dtacFontTextView3 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                    if (dtacFontTextView3 != null) {
                        i = R.id.tvTransactionOwnerTitle;
                        DtacFontTextView dtacFontTextView4 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                        if (dtacFontTextView4 != null) {
                            i = R.id.tvTransactionOwnerValue;
                            DtacFontTextView dtacFontTextView5 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                            if (dtacFontTextView5 != null) {
                                i = R.id.tvTransactionPhoneNumber;
                                DtacFontTextView dtacFontTextView6 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                                if (dtacFontTextView6 != null) {
                                    i = R.id.tvTransactionTime;
                                    DtacFontTextView dtacFontTextView7 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                                    if (dtacFontTextView7 != null) {
                                        i = R.id.tvTransactionType;
                                        DtacFontTextView dtacFontTextView8 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                                        if (dtacFontTextView8 != null) {
                                            i = R.id.tvTransactionUnit;
                                            DtacFontTextView dtacFontTextView9 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                                            if (dtacFontTextView9 != null) {
                                                return new ZOwnerTransactionItemRowBinding(cardView, cardView, appCompatImageView, dtacFontTextView, dtacFontTextView2, dtacFontTextView3, dtacFontTextView4, dtacFontTextView5, dtacFontTextView6, dtacFontTextView7, dtacFontTextView8, dtacFontTextView9);
                                            }
                                        }
                                    }
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
    public static ZOwnerTransactionItemRowBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ZOwnerTransactionItemRowBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.z_owner_transaction_item_row, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public CardView getRoot() {
        return this.f84677a;
    }
}
