package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.widget.view.DtacFontTextView;

/* renamed from: th.co.dtac.android.dtacone.databinding.ZBalanceBoxBinding */
/* loaded from: classes7.dex */
public final class ZBalanceBoxBinding implements ViewBinding {

    /* renamed from: a */
    public final RelativeLayout f84586a;
    @NonNull
    public final ImageButton btnBuyDolShortCut;
    @NonNull
    public final LinearLayout lnlBottom;
    @NonNull
    public final LinearLayout lnlMedium;
    @NonNull
    public final LinearLayout lnlTop;
    @NonNull
    public final RelativeLayout rootBalance;
    @NonNull
    public final DtacFontTextView tvBalance;
    @NonNull
    public final DtacFontTextView tvBalanceText;
    @NonNull
    public final DtacFontTextView tvBalanceUnit;
    @NonNull
    public final DtacFontTextView tvLastUpdate;
    @NonNull
    public final DtacFontTextView tvPhoneNumber;
    @NonNull
    public final DtacFontTextView tvSimRCount;

    public ZBalanceBoxBinding(RelativeLayout relativeLayout, ImageButton imageButton, LinearLayout linearLayout, LinearLayout linearLayout2, LinearLayout linearLayout3, RelativeLayout relativeLayout2, DtacFontTextView dtacFontTextView, DtacFontTextView dtacFontTextView2, DtacFontTextView dtacFontTextView3, DtacFontTextView dtacFontTextView4, DtacFontTextView dtacFontTextView5, DtacFontTextView dtacFontTextView6) {
        this.f84586a = relativeLayout;
        this.btnBuyDolShortCut = imageButton;
        this.lnlBottom = linearLayout;
        this.lnlMedium = linearLayout2;
        this.lnlTop = linearLayout3;
        this.rootBalance = relativeLayout2;
        this.tvBalance = dtacFontTextView;
        this.tvBalanceText = dtacFontTextView2;
        this.tvBalanceUnit = dtacFontTextView3;
        this.tvLastUpdate = dtacFontTextView4;
        this.tvPhoneNumber = dtacFontTextView5;
        this.tvSimRCount = dtacFontTextView6;
    }

    @NonNull
    public static ZBalanceBoxBinding bind(@NonNull View view) {
        int i = R.id.btnBuyDolShortCut;
        ImageButton imageButton = (ImageButton) ViewBindings.findChildViewById(view, i);
        if (imageButton != null) {
            i = R.id.lnl_bottom;
            LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i);
            if (linearLayout != null) {
                i = R.id.lnl_medium;
                LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(view, i);
                if (linearLayout2 != null) {
                    i = R.id.lnl_top;
                    LinearLayout linearLayout3 = (LinearLayout) ViewBindings.findChildViewById(view, i);
                    if (linearLayout3 != null) {
                        RelativeLayout relativeLayout = (RelativeLayout) view;
                        i = R.id.tvBalance;
                        DtacFontTextView dtacFontTextView = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                        if (dtacFontTextView != null) {
                            i = R.id.tvBalanceText;
                            DtacFontTextView dtacFontTextView2 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                            if (dtacFontTextView2 != null) {
                                i = R.id.tvBalanceUnit;
                                DtacFontTextView dtacFontTextView3 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                                if (dtacFontTextView3 != null) {
                                    i = R.id.tvLastUpdate;
                                    DtacFontTextView dtacFontTextView4 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                                    if (dtacFontTextView4 != null) {
                                        i = R.id.tvPhoneNumber;
                                        DtacFontTextView dtacFontTextView5 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                                        if (dtacFontTextView5 != null) {
                                            i = R.id.tvSimRCount;
                                            DtacFontTextView dtacFontTextView6 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                                            if (dtacFontTextView6 != null) {
                                                return new ZBalanceBoxBinding(relativeLayout, imageButton, linearLayout, linearLayout2, linearLayout3, relativeLayout, dtacFontTextView, dtacFontTextView2, dtacFontTextView3, dtacFontTextView4, dtacFontTextView5, dtacFontTextView6);
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
    public static ZBalanceBoxBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ZBalanceBoxBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.z_balance_box, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public RelativeLayout getRoot() {
        return this.f84586a;
    }
}
