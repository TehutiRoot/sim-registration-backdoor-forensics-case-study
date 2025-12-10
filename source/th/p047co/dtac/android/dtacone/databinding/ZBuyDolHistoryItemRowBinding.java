package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.widget.view.DtacCardView;
import th.p047co.dtac.android.dtacone.widget.view.DtacFontTextView;

/* renamed from: th.co.dtac.android.dtacone.databinding.ZBuyDolHistoryItemRowBinding */
/* loaded from: classes7.dex */
public final class ZBuyDolHistoryItemRowBinding implements ViewBinding {

    /* renamed from: a */
    public final DtacCardView f84593a;
    @NonNull
    public final DtacCardView buyDolHistoryCardview;
    @NonNull
    public final ImageView ivMore;
    @NonNull
    public final ImageView ivStatus;
    @NonNull
    public final LinearLayout phoneNumberBox;
    @NonNull
    public final DtacFontTextView tvDisplayDateTime;
    @NonNull
    public final DtacFontTextView tvPhoneNumber;
    @NonNull
    public final DtacFontTextView tvPrice;
    @NonNull
    public final DtacFontTextView tvUnit;

    public ZBuyDolHistoryItemRowBinding(DtacCardView dtacCardView, DtacCardView dtacCardView2, ImageView imageView, ImageView imageView2, LinearLayout linearLayout, DtacFontTextView dtacFontTextView, DtacFontTextView dtacFontTextView2, DtacFontTextView dtacFontTextView3, DtacFontTextView dtacFontTextView4) {
        this.f84593a = dtacCardView;
        this.buyDolHistoryCardview = dtacCardView2;
        this.ivMore = imageView;
        this.ivStatus = imageView2;
        this.phoneNumberBox = linearLayout;
        this.tvDisplayDateTime = dtacFontTextView;
        this.tvPhoneNumber = dtacFontTextView2;
        this.tvPrice = dtacFontTextView3;
        this.tvUnit = dtacFontTextView4;
    }

    @NonNull
    public static ZBuyDolHistoryItemRowBinding bind(@NonNull View view) {
        DtacCardView dtacCardView = (DtacCardView) view;
        int i = R.id.ivMore;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
        if (imageView != null) {
            i = R.id.ivStatus;
            ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, i);
            if (imageView2 != null) {
                i = R.id.phoneNumberBox;
                LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i);
                if (linearLayout != null) {
                    i = R.id.tvDisplayDateTime;
                    DtacFontTextView dtacFontTextView = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                    if (dtacFontTextView != null) {
                        i = R.id.tvPhoneNumber;
                        DtacFontTextView dtacFontTextView2 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                        if (dtacFontTextView2 != null) {
                            i = R.id.tvPrice;
                            DtacFontTextView dtacFontTextView3 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                            if (dtacFontTextView3 != null) {
                                i = R.id.tvUnit;
                                DtacFontTextView dtacFontTextView4 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                                if (dtacFontTextView4 != null) {
                                    return new ZBuyDolHistoryItemRowBinding(dtacCardView, dtacCardView, imageView, imageView2, linearLayout, dtacFontTextView, dtacFontTextView2, dtacFontTextView3, dtacFontTextView4);
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
    public static ZBuyDolHistoryItemRowBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ZBuyDolHistoryItemRowBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.z_buy_dol_history_item_row, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public DtacCardView getRoot() {
        return this.f84593a;
    }
}
