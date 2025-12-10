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
import th.p047co.dtac.android.dtacone.app_one.widget.OneFontTextView;

/* renamed from: th.co.dtac.android.dtacone.databinding.OneOwnerTransactionItemRowBinding */
/* loaded from: classes7.dex */
public final class OneOwnerTransactionItemRowBinding implements ViewBinding {

    /* renamed from: a */
    public final CardView f84502a;
    @NonNull
    public final CardView cvDetail;
    @NonNull
    public final AppCompatImageView ivImageType;
    @NonNull
    public final OneFontTextView tvTransactionAmount;
    @NonNull
    public final OneFontTextView tvTransactionName;
    @NonNull
    public final OneFontTextView tvTransactionOption;
    @NonNull
    public final OneFontTextView tvTransactionOwnerTitle;
    @NonNull
    public final OneFontTextView tvTransactionOwnerValue;
    @NonNull
    public final OneFontTextView tvTransactionPhoneNumber;
    @NonNull
    public final OneFontTextView tvTransactionTime;
    @NonNull
    public final OneFontTextView tvTransactionType;
    @NonNull
    public final OneFontTextView tvTransactionUnit;

    public OneOwnerTransactionItemRowBinding(CardView cardView, CardView cardView2, AppCompatImageView appCompatImageView, OneFontTextView oneFontTextView, OneFontTextView oneFontTextView2, OneFontTextView oneFontTextView3, OneFontTextView oneFontTextView4, OneFontTextView oneFontTextView5, OneFontTextView oneFontTextView6, OneFontTextView oneFontTextView7, OneFontTextView oneFontTextView8, OneFontTextView oneFontTextView9) {
        this.f84502a = cardView;
        this.cvDetail = cardView2;
        this.ivImageType = appCompatImageView;
        this.tvTransactionAmount = oneFontTextView;
        this.tvTransactionName = oneFontTextView2;
        this.tvTransactionOption = oneFontTextView3;
        this.tvTransactionOwnerTitle = oneFontTextView4;
        this.tvTransactionOwnerValue = oneFontTextView5;
        this.tvTransactionPhoneNumber = oneFontTextView6;
        this.tvTransactionTime = oneFontTextView7;
        this.tvTransactionType = oneFontTextView8;
        this.tvTransactionUnit = oneFontTextView9;
    }

    @NonNull
    public static OneOwnerTransactionItemRowBinding bind(@NonNull View view) {
        CardView cardView = (CardView) view;
        int i = R.id.ivImageType;
        AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(view, i);
        if (appCompatImageView != null) {
            i = R.id.tvTransactionAmount;
            OneFontTextView oneFontTextView = (OneFontTextView) ViewBindings.findChildViewById(view, i);
            if (oneFontTextView != null) {
                i = R.id.tvTransactionName;
                OneFontTextView oneFontTextView2 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                if (oneFontTextView2 != null) {
                    i = R.id.tvTransactionOption;
                    OneFontTextView oneFontTextView3 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                    if (oneFontTextView3 != null) {
                        i = R.id.tvTransactionOwnerTitle;
                        OneFontTextView oneFontTextView4 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                        if (oneFontTextView4 != null) {
                            i = R.id.tvTransactionOwnerValue;
                            OneFontTextView oneFontTextView5 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                            if (oneFontTextView5 != null) {
                                i = R.id.tvTransactionPhoneNumber;
                                OneFontTextView oneFontTextView6 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                if (oneFontTextView6 != null) {
                                    i = R.id.tvTransactionTime;
                                    OneFontTextView oneFontTextView7 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                    if (oneFontTextView7 != null) {
                                        i = R.id.tvTransactionType;
                                        OneFontTextView oneFontTextView8 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                        if (oneFontTextView8 != null) {
                                            i = R.id.tvTransactionUnit;
                                            OneFontTextView oneFontTextView9 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                            if (oneFontTextView9 != null) {
                                                return new OneOwnerTransactionItemRowBinding(cardView, cardView, appCompatImageView, oneFontTextView, oneFontTextView2, oneFontTextView3, oneFontTextView4, oneFontTextView5, oneFontTextView6, oneFontTextView7, oneFontTextView8, oneFontTextView9);
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
    public static OneOwnerTransactionItemRowBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static OneOwnerTransactionItemRowBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.one_owner_transaction_item_row, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public CardView getRoot() {
        return this.f84502a;
    }
}
