package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.widget.view.DtacFontTextView;

/* renamed from: th.co.dtac.android.dtacone.databinding.ZBankListItemRowBinding */
/* loaded from: classes7.dex */
public final class ZBankListItemRowBinding implements ViewBinding {

    /* renamed from: a */
    public final ConstraintLayout f84588a;
    @NonNull
    public final AppCompatImageView ivAddMore;
    @NonNull
    public final AppCompatImageView ivBankBand;
    @NonNull
    public final ConstraintLayout rootView;
    @NonNull
    public final DtacFontTextView tvName;

    public ZBankListItemRowBinding(ConstraintLayout constraintLayout, AppCompatImageView appCompatImageView, AppCompatImageView appCompatImageView2, ConstraintLayout constraintLayout2, DtacFontTextView dtacFontTextView) {
        this.f84588a = constraintLayout;
        this.ivAddMore = appCompatImageView;
        this.ivBankBand = appCompatImageView2;
        this.rootView = constraintLayout2;
        this.tvName = dtacFontTextView;
    }

    @NonNull
    public static ZBankListItemRowBinding bind(@NonNull View view) {
        int i = R.id.ivAddMore;
        AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(view, i);
        if (appCompatImageView != null) {
            i = R.id.ivBankBand;
            AppCompatImageView appCompatImageView2 = (AppCompatImageView) ViewBindings.findChildViewById(view, i);
            if (appCompatImageView2 != null) {
                ConstraintLayout constraintLayout = (ConstraintLayout) view;
                i = R.id.tvName;
                DtacFontTextView dtacFontTextView = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                if (dtacFontTextView != null) {
                    return new ZBankListItemRowBinding(constraintLayout, appCompatImageView, appCompatImageView2, constraintLayout, dtacFontTextView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static ZBankListItemRowBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ZBankListItemRowBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.z_bank_list_item_row, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.f84588a;
    }
}
