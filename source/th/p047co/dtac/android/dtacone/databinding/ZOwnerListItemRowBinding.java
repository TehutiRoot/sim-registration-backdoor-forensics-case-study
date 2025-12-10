package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.widget.view.DtacCardView;
import th.p047co.dtac.android.dtacone.widget.view.DtacFontTextView;

/* renamed from: th.co.dtac.android.dtacone.databinding.ZOwnerListItemRowBinding */
/* loaded from: classes7.dex */
public final class ZOwnerListItemRowBinding implements ViewBinding {

    /* renamed from: a */
    public final DtacCardView f84676a;
    @NonNull
    public final DtacCardView cardviewInactivityListUser;
    @NonNull
    public final ImageView iconRight;
    @NonNull
    public final ImageView ivInactivity;
    @NonNull
    public final DtacFontTextView tvInactivityPhoneNumber;
    @NonNull
    public final DtacFontTextView tvInactivityRegisterDate;

    public ZOwnerListItemRowBinding(DtacCardView dtacCardView, DtacCardView dtacCardView2, ImageView imageView, ImageView imageView2, DtacFontTextView dtacFontTextView, DtacFontTextView dtacFontTextView2) {
        this.f84676a = dtacCardView;
        this.cardviewInactivityListUser = dtacCardView2;
        this.iconRight = imageView;
        this.ivInactivity = imageView2;
        this.tvInactivityPhoneNumber = dtacFontTextView;
        this.tvInactivityRegisterDate = dtacFontTextView2;
    }

    @NonNull
    public static ZOwnerListItemRowBinding bind(@NonNull View view) {
        DtacCardView dtacCardView = (DtacCardView) view;
        int i = R.id.icon_right;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
        if (imageView != null) {
            i = R.id.ivInactivity;
            ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, i);
            if (imageView2 != null) {
                i = R.id.tv_inactivity_phone_number;
                DtacFontTextView dtacFontTextView = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                if (dtacFontTextView != null) {
                    i = R.id.tv_inactivity_register_date;
                    DtacFontTextView dtacFontTextView2 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                    if (dtacFontTextView2 != null) {
                        return new ZOwnerListItemRowBinding(dtacCardView, dtacCardView, imageView, imageView2, dtacFontTextView, dtacFontTextView2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static ZOwnerListItemRowBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ZOwnerListItemRowBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.z_owner_list_item_row, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public DtacCardView getRoot() {
        return this.f84676a;
    }
}
