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
import th.p047co.dtac.android.dtacone.app_one.widget.OneFontTextView;
import th.p047co.dtac.android.dtacone.widget.view.DtacCardView;

/* renamed from: th.co.dtac.android.dtacone.databinding.OneRectifyItemRowBinding */
/* loaded from: classes7.dex */
public final class OneRectifyItemRowBinding implements ViewBinding {

    /* renamed from: a */
    public final DtacCardView f84632a;
    @NonNull
    public final DtacCardView cvRectify;
    @NonNull
    public final AppCompatImageView ivImageType;
    @NonNull
    public final LinearLayout linearRectifyBox;
    @NonNull
    public final OneFontTextView tvRectifyAmount;
    @NonNull
    public final OneFontTextView tvRectifyAmountUnit;
    @NonNull
    public final OneFontTextView tvRectifyDescription;
    @NonNull
    public final OneFontTextView tvRectifyPhoneNumber;
    @NonNull
    public final OneFontTextView tvRectifyTime;
    @NonNull
    public final OneFontTextView tvRectifyType;

    public OneRectifyItemRowBinding(DtacCardView dtacCardView, DtacCardView dtacCardView2, AppCompatImageView appCompatImageView, LinearLayout linearLayout, OneFontTextView oneFontTextView, OneFontTextView oneFontTextView2, OneFontTextView oneFontTextView3, OneFontTextView oneFontTextView4, OneFontTextView oneFontTextView5, OneFontTextView oneFontTextView6) {
        this.f84632a = dtacCardView;
        this.cvRectify = dtacCardView2;
        this.ivImageType = appCompatImageView;
        this.linearRectifyBox = linearLayout;
        this.tvRectifyAmount = oneFontTextView;
        this.tvRectifyAmountUnit = oneFontTextView2;
        this.tvRectifyDescription = oneFontTextView3;
        this.tvRectifyPhoneNumber = oneFontTextView4;
        this.tvRectifyTime = oneFontTextView5;
        this.tvRectifyType = oneFontTextView6;
    }

    @NonNull
    public static OneRectifyItemRowBinding bind(@NonNull View view) {
        DtacCardView dtacCardView = (DtacCardView) view;
        int i = R.id.ivImageType;
        AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(view, i);
        if (appCompatImageView != null) {
            i = R.id.linearRectifyBox;
            LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i);
            if (linearLayout != null) {
                i = R.id.tvRectifyAmount;
                OneFontTextView oneFontTextView = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                if (oneFontTextView != null) {
                    i = R.id.tvRectifyAmountUnit;
                    OneFontTextView oneFontTextView2 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                    if (oneFontTextView2 != null) {
                        i = R.id.tvRectifyDescription;
                        OneFontTextView oneFontTextView3 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                        if (oneFontTextView3 != null) {
                            i = R.id.tvRectifyPhoneNumber;
                            OneFontTextView oneFontTextView4 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                            if (oneFontTextView4 != null) {
                                i = R.id.tvRectifyTime;
                                OneFontTextView oneFontTextView5 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                if (oneFontTextView5 != null) {
                                    i = R.id.tvRectifyType;
                                    OneFontTextView oneFontTextView6 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                    if (oneFontTextView6 != null) {
                                        return new OneRectifyItemRowBinding(dtacCardView, dtacCardView, appCompatImageView, linearLayout, oneFontTextView, oneFontTextView2, oneFontTextView3, oneFontTextView4, oneFontTextView5, oneFontTextView6);
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
    public static OneRectifyItemRowBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static OneRectifyItemRowBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.one_rectify_item_row, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public DtacCardView getRoot() {
        return this.f84632a;
    }
}