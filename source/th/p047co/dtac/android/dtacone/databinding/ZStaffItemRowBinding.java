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

/* renamed from: th.co.dtac.android.dtacone.databinding.ZStaffItemRowBinding */
/* loaded from: classes7.dex */
public final class ZStaffItemRowBinding implements ViewBinding {

    /* renamed from: a */
    public final DtacCardView f84698a;
    @NonNull
    public final DtacCardView cardviewStaff;
    @NonNull
    public final ImageView ivNext;
    @NonNull
    public final DtacFontTextView staffTvName;
    @NonNull
    public final DtacFontTextView staffUserId;

    public ZStaffItemRowBinding(DtacCardView dtacCardView, DtacCardView dtacCardView2, ImageView imageView, DtacFontTextView dtacFontTextView, DtacFontTextView dtacFontTextView2) {
        this.f84698a = dtacCardView;
        this.cardviewStaff = dtacCardView2;
        this.ivNext = imageView;
        this.staffTvName = dtacFontTextView;
        this.staffUserId = dtacFontTextView2;
    }

    @NonNull
    public static ZStaffItemRowBinding bind(@NonNull View view) {
        DtacCardView dtacCardView = (DtacCardView) view;
        int i = R.id.ivNext;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
        if (imageView != null) {
            i = R.id.staff_tv_name;
            DtacFontTextView dtacFontTextView = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
            if (dtacFontTextView != null) {
                i = R.id.staff_user_id;
                DtacFontTextView dtacFontTextView2 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                if (dtacFontTextView2 != null) {
                    return new ZStaffItemRowBinding(dtacCardView, dtacCardView, imageView, dtacFontTextView, dtacFontTextView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static ZStaffItemRowBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ZStaffItemRowBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.z_staff_item_row, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public DtacCardView getRoot() {
        return this.f84698a;
    }
}
