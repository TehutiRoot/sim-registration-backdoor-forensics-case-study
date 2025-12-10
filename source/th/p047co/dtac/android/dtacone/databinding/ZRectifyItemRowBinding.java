package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.widget.view.DtacCardView;
import th.p047co.dtac.android.dtacone.widget.view.DtacFontTextView;

/* renamed from: th.co.dtac.android.dtacone.databinding.ZRectifyItemRowBinding */
/* loaded from: classes7.dex */
public final class ZRectifyItemRowBinding implements ViewBinding {

    /* renamed from: a */
    public final DtacCardView f84691a;
    @NonNull
    public final DtacCardView cvRectify;
    @NonNull
    public final AppCompatImageView ivImageType;
    @NonNull
    public final LinearLayout linearRectifyBox;
    @NonNull
    public final DtacFontTextView tvRectifyAmount;
    @NonNull
    public final DtacFontTextView tvRectifyAmountUnit;
    @NonNull
    public final DtacFontTextView tvRectifyDescription;
    @NonNull
    public final DtacFontTextView tvRectifyPhoneNumber;
    @NonNull
    public final DtacFontTextView tvRectifyTime;
    @NonNull
    public final DtacFontTextView tvRectifyType;

    public ZRectifyItemRowBinding(DtacCardView dtacCardView, DtacCardView dtacCardView2, AppCompatImageView appCompatImageView, LinearLayout linearLayout, DtacFontTextView dtacFontTextView, DtacFontTextView dtacFontTextView2, DtacFontTextView dtacFontTextView3, DtacFontTextView dtacFontTextView4, DtacFontTextView dtacFontTextView5, DtacFontTextView dtacFontTextView6) {
        this.f84691a = dtacCardView;
        this.cvRectify = dtacCardView2;
        this.ivImageType = appCompatImageView;
        this.linearRectifyBox = linearLayout;
        this.tvRectifyAmount = dtacFontTextView;
        this.tvRectifyAmountUnit = dtacFontTextView2;
        this.tvRectifyDescription = dtacFontTextView3;
        this.tvRectifyPhoneNumber = dtacFontTextView4;
        this.tvRectifyTime = dtacFontTextView5;
        this.tvRectifyType = dtacFontTextView6;
    }

    @NonNull
    public static ZRectifyItemRowBinding bind(@NonNull View view) {
        DtacCardView dtacCardView = (DtacCardView) view;
        int i = R.id.ivImageType;
        AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(view, i);
        if (appCompatImageView != null) {
            i = R.id.linearRectifyBox;
            LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i);
            if (linearLayout != null) {
                i = R.id.tvRectifyAmount;
                DtacFontTextView dtacFontTextView = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                if (dtacFontTextView != null) {
                    i = R.id.tvRectifyAmountUnit;
                    DtacFontTextView dtacFontTextView2 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                    if (dtacFontTextView2 != null) {
                        i = R.id.tvRectifyDescription;
                        DtacFontTextView dtacFontTextView3 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                        if (dtacFontTextView3 != null) {
                            i = R.id.tvRectifyPhoneNumber;
                            DtacFontTextView dtacFontTextView4 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                            if (dtacFontTextView4 != null) {
                                i = R.id.tvRectifyTime;
                                DtacFontTextView dtacFontTextView5 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                                if (dtacFontTextView5 != null) {
                                    i = R.id.tvRectifyType;
                                    DtacFontTextView dtacFontTextView6 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                                    if (dtacFontTextView6 != null) {
                                        return new ZRectifyItemRowBinding(dtacCardView, dtacCardView, appCompatImageView, linearLayout, dtacFontTextView, dtacFontTextView2, dtacFontTextView3, dtacFontTextView4, dtacFontTextView5, dtacFontTextView6);
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
    public static ZRectifyItemRowBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ZRectifyItemRowBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.z_rectify_item_row, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public DtacCardView getRoot() {
        return this.f84691a;
    }
}
