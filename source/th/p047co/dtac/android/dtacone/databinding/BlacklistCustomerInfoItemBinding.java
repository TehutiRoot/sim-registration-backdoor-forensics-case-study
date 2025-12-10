package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.facebook.shimmer.ShimmerFrameLayout;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.widget.view.DtacFontTextView;

/* renamed from: th.co.dtac.android.dtacone.databinding.BlacklistCustomerInfoItemBinding */
/* loaded from: classes7.dex */
public final class BlacklistCustomerInfoItemBinding implements ViewBinding {

    /* renamed from: a */
    public final ConstraintLayout f83597a;
    @NonNull
    public final Group amountGroup;
    @NonNull
    public final ImageView arrowNext;
    @NonNull
    public final DtacFontTextView captionBlacklistPay;
    @NonNull
    public final DtacFontTextView captionBlacklistTotal;
    @NonNull
    public final DtacFontTextView captionFine;
    @NonNull
    public final Group netAmountGroup;
    @NonNull
    public final Group otherChangeGroup;
    @NonNull
    public final ShimmerFrameLayout shimmerAmount;
    @NonNull
    public final ShimmerFrameLayout shimmerNetAmount;
    @NonNull
    public final ShimmerFrameLayout shimmerOtherChange;
    @NonNull
    public final DtacFontTextView sufFine;
    @NonNull
    public final DtacFontTextView sufPay;
    @NonNull
    public final DtacFontTextView sufTotal;
    @NonNull
    public final DtacFontTextView textViewCustomerNumber;
    @NonNull
    public final DtacFontTextView valueBlacklistPay;
    @NonNull
    public final DtacFontTextView valueBlacklistTotal;
    @NonNull
    public final DtacFontTextView valueFine;

    public BlacklistCustomerInfoItemBinding(ConstraintLayout constraintLayout, Group group, ImageView imageView, DtacFontTextView dtacFontTextView, DtacFontTextView dtacFontTextView2, DtacFontTextView dtacFontTextView3, Group group2, Group group3, ShimmerFrameLayout shimmerFrameLayout, ShimmerFrameLayout shimmerFrameLayout2, ShimmerFrameLayout shimmerFrameLayout3, DtacFontTextView dtacFontTextView4, DtacFontTextView dtacFontTextView5, DtacFontTextView dtacFontTextView6, DtacFontTextView dtacFontTextView7, DtacFontTextView dtacFontTextView8, DtacFontTextView dtacFontTextView9, DtacFontTextView dtacFontTextView10) {
        this.f83597a = constraintLayout;
        this.amountGroup = group;
        this.arrowNext = imageView;
        this.captionBlacklistPay = dtacFontTextView;
        this.captionBlacklistTotal = dtacFontTextView2;
        this.captionFine = dtacFontTextView3;
        this.netAmountGroup = group2;
        this.otherChangeGroup = group3;
        this.shimmerAmount = shimmerFrameLayout;
        this.shimmerNetAmount = shimmerFrameLayout2;
        this.shimmerOtherChange = shimmerFrameLayout3;
        this.sufFine = dtacFontTextView4;
        this.sufPay = dtacFontTextView5;
        this.sufTotal = dtacFontTextView6;
        this.textViewCustomerNumber = dtacFontTextView7;
        this.valueBlacklistPay = dtacFontTextView8;
        this.valueBlacklistTotal = dtacFontTextView9;
        this.valueFine = dtacFontTextView10;
    }

    @NonNull
    public static BlacklistCustomerInfoItemBinding bind(@NonNull View view) {
        int i = R.id.amountGroup;
        Group group = (Group) ViewBindings.findChildViewById(view, i);
        if (group != null) {
            i = R.id.arrowNext;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
            if (imageView != null) {
                i = R.id.captionBlacklistPay;
                DtacFontTextView dtacFontTextView = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                if (dtacFontTextView != null) {
                    i = R.id.captionBlacklistTotal;
                    DtacFontTextView dtacFontTextView2 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                    if (dtacFontTextView2 != null) {
                        i = R.id.captionFine;
                        DtacFontTextView dtacFontTextView3 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                        if (dtacFontTextView3 != null) {
                            i = R.id.netAmountGroup;
                            Group group2 = (Group) ViewBindings.findChildViewById(view, i);
                            if (group2 != null) {
                                i = R.id.otherChangeGroup;
                                Group group3 = (Group) ViewBindings.findChildViewById(view, i);
                                if (group3 != null) {
                                    i = R.id.shimmerAmount;
                                    ShimmerFrameLayout shimmerFrameLayout = (ShimmerFrameLayout) ViewBindings.findChildViewById(view, i);
                                    if (shimmerFrameLayout != null) {
                                        i = R.id.shimmerNetAmount;
                                        ShimmerFrameLayout shimmerFrameLayout2 = (ShimmerFrameLayout) ViewBindings.findChildViewById(view, i);
                                        if (shimmerFrameLayout2 != null) {
                                            i = R.id.shimmerOtherChange;
                                            ShimmerFrameLayout shimmerFrameLayout3 = (ShimmerFrameLayout) ViewBindings.findChildViewById(view, i);
                                            if (shimmerFrameLayout3 != null) {
                                                i = R.id.sufFine;
                                                DtacFontTextView dtacFontTextView4 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                                                if (dtacFontTextView4 != null) {
                                                    i = R.id.sufPay;
                                                    DtacFontTextView dtacFontTextView5 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                                                    if (dtacFontTextView5 != null) {
                                                        i = R.id.sufTotal;
                                                        DtacFontTextView dtacFontTextView6 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                                                        if (dtacFontTextView6 != null) {
                                                            i = R.id.textViewCustomerNumber;
                                                            DtacFontTextView dtacFontTextView7 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                                                            if (dtacFontTextView7 != null) {
                                                                i = R.id.valueBlacklistPay;
                                                                DtacFontTextView dtacFontTextView8 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                                                                if (dtacFontTextView8 != null) {
                                                                    i = R.id.valueBlacklistTotal;
                                                                    DtacFontTextView dtacFontTextView9 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                                                                    if (dtacFontTextView9 != null) {
                                                                        i = R.id.valueFine;
                                                                        DtacFontTextView dtacFontTextView10 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                                                                        if (dtacFontTextView10 != null) {
                                                                            return new BlacklistCustomerInfoItemBinding((ConstraintLayout) view, group, imageView, dtacFontTextView, dtacFontTextView2, dtacFontTextView3, group2, group3, shimmerFrameLayout, shimmerFrameLayout2, shimmerFrameLayout3, dtacFontTextView4, dtacFontTextView5, dtacFontTextView6, dtacFontTextView7, dtacFontTextView8, dtacFontTextView9, dtacFontTextView10);
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
    public static BlacklistCustomerInfoItemBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static BlacklistCustomerInfoItemBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.blacklist_customer_info_item, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.f83597a;
    }
}
