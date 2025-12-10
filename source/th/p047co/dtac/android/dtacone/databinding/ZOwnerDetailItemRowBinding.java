package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.widget.view.DtacFontTextView;

/* renamed from: th.co.dtac.android.dtacone.databinding.ZOwnerDetailItemRowBinding */
/* loaded from: classes7.dex */
public final class ZOwnerDetailItemRowBinding implements ViewBinding {

    /* renamed from: a */
    public final CardView f84675a;
    @NonNull
    public final CardView boxOwnerProfile;
    @NonNull
    public final ImageView ivOwnerDetail;
    @NonNull
    public final DtacFontTextView tvOwnerDetailTimeRegister;
    @NonNull
    public final DtacFontTextView tvPhoneNumberOwnerDetail;

    public ZOwnerDetailItemRowBinding(CardView cardView, CardView cardView2, ImageView imageView, DtacFontTextView dtacFontTextView, DtacFontTextView dtacFontTextView2) {
        this.f84675a = cardView;
        this.boxOwnerProfile = cardView2;
        this.ivOwnerDetail = imageView;
        this.tvOwnerDetailTimeRegister = dtacFontTextView;
        this.tvPhoneNumberOwnerDetail = dtacFontTextView2;
    }

    @NonNull
    public static ZOwnerDetailItemRowBinding bind(@NonNull View view) {
        CardView cardView = (CardView) view;
        int i = R.id.iv_owner_detail;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
        if (imageView != null) {
            i = R.id.tv_owner_detail_time_register;
            DtacFontTextView dtacFontTextView = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
            if (dtacFontTextView != null) {
                i = R.id.tv_phone_number_owner_detail;
                DtacFontTextView dtacFontTextView2 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                if (dtacFontTextView2 != null) {
                    return new ZOwnerDetailItemRowBinding(cardView, cardView, imageView, dtacFontTextView, dtacFontTextView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static ZOwnerDetailItemRowBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ZOwnerDetailItemRowBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.z_owner_detail_item_row, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public CardView getRoot() {
        return this.f84675a;
    }
}
