package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.core.widget.NestedScrollView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.widget.view.DtacFontTextView;

/* renamed from: th.co.dtac.android.dtacone.databinding.FragmentMrtrPrepaidSuccessBinding */
/* loaded from: classes7.dex */
public final class FragmentMrtrPrepaidSuccessBinding implements ViewBinding {

    /* renamed from: a */
    public final NestedScrollView f83973a;
    @NonNull
    public final LinearLayoutCompat btnDoAgain;
    @NonNull
    public final LinearLayoutCompat btnGoHome;
    @NonNull
    public final LinearLayoutCompat btnPrintReceipt;
    @NonNull
    public final ImageView ivChangePro;
    @NonNull
    public final ImageView ivProserm;
    @NonNull
    public final ImageView ivSuccess;
    @NonNull
    public final ImageView ivTopupImage;
    @NonNull
    public final RelativeLayout layoutChangePro;
    @NonNull
    public final LinearLayout layoutMenu;
    @NonNull
    public final RelativeLayout layoutProserm;
    @NonNull
    public final RelativeLayout layoutTopup;
    @NonNull
    public final DtacFontTextView tvBtnDoAgain;
    @NonNull
    public final DtacFontTextView tvChangePro;
    @NonNull
    public final DtacFontTextView tvCheckSimStock;
    @NonNull
    public final DtacFontTextView tvError;
    @NonNull
    public final DtacFontTextView tvErrorDate;
    @NonNull
    public final DtacFontTextView tvProserm;
    @NonNull
    public final DtacFontTextView tvTopup;

    public FragmentMrtrPrepaidSuccessBinding(NestedScrollView nestedScrollView, LinearLayoutCompat linearLayoutCompat, LinearLayoutCompat linearLayoutCompat2, LinearLayoutCompat linearLayoutCompat3, ImageView imageView, ImageView imageView2, ImageView imageView3, ImageView imageView4, RelativeLayout relativeLayout, LinearLayout linearLayout, RelativeLayout relativeLayout2, RelativeLayout relativeLayout3, DtacFontTextView dtacFontTextView, DtacFontTextView dtacFontTextView2, DtacFontTextView dtacFontTextView3, DtacFontTextView dtacFontTextView4, DtacFontTextView dtacFontTextView5, DtacFontTextView dtacFontTextView6, DtacFontTextView dtacFontTextView7) {
        this.f83973a = nestedScrollView;
        this.btnDoAgain = linearLayoutCompat;
        this.btnGoHome = linearLayoutCompat2;
        this.btnPrintReceipt = linearLayoutCompat3;
        this.ivChangePro = imageView;
        this.ivProserm = imageView2;
        this.ivSuccess = imageView3;
        this.ivTopupImage = imageView4;
        this.layoutChangePro = relativeLayout;
        this.layoutMenu = linearLayout;
        this.layoutProserm = relativeLayout2;
        this.layoutTopup = relativeLayout3;
        this.tvBtnDoAgain = dtacFontTextView;
        this.tvChangePro = dtacFontTextView2;
        this.tvCheckSimStock = dtacFontTextView3;
        this.tvError = dtacFontTextView4;
        this.tvErrorDate = dtacFontTextView5;
        this.tvProserm = dtacFontTextView6;
        this.tvTopup = dtacFontTextView7;
    }

    @NonNull
    public static FragmentMrtrPrepaidSuccessBinding bind(@NonNull View view) {
        int i = R.id.btnDoAgain;
        LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i);
        if (linearLayoutCompat != null) {
            i = R.id.btnGoHome;
            LinearLayoutCompat linearLayoutCompat2 = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i);
            if (linearLayoutCompat2 != null) {
                i = R.id.btnPrintReceipt;
                LinearLayoutCompat linearLayoutCompat3 = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i);
                if (linearLayoutCompat3 != null) {
                    i = R.id.ivChangePro;
                    ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
                    if (imageView != null) {
                        i = R.id.ivProserm;
                        ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, i);
                        if (imageView2 != null) {
                            i = R.id.ivSuccess;
                            ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(view, i);
                            if (imageView3 != null) {
                                i = R.id.ivTopupImage;
                                ImageView imageView4 = (ImageView) ViewBindings.findChildViewById(view, i);
                                if (imageView4 != null) {
                                    i = R.id.layoutChangePro;
                                    RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, i);
                                    if (relativeLayout != null) {
                                        i = R.id.layoutMenu;
                                        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i);
                                        if (linearLayout != null) {
                                            i = R.id.layoutProserm;
                                            RelativeLayout relativeLayout2 = (RelativeLayout) ViewBindings.findChildViewById(view, i);
                                            if (relativeLayout2 != null) {
                                                i = R.id.layoutTopup;
                                                RelativeLayout relativeLayout3 = (RelativeLayout) ViewBindings.findChildViewById(view, i);
                                                if (relativeLayout3 != null) {
                                                    i = R.id.tvBtnDoAgain;
                                                    DtacFontTextView dtacFontTextView = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                                                    if (dtacFontTextView != null) {
                                                        i = R.id.tvChangePro;
                                                        DtacFontTextView dtacFontTextView2 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                                                        if (dtacFontTextView2 != null) {
                                                            i = R.id.tvCheckSimStock;
                                                            DtacFontTextView dtacFontTextView3 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                                                            if (dtacFontTextView3 != null) {
                                                                i = R.id.tvError;
                                                                DtacFontTextView dtacFontTextView4 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                                                                if (dtacFontTextView4 != null) {
                                                                    i = R.id.tvErrorDate;
                                                                    DtacFontTextView dtacFontTextView5 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                                                                    if (dtacFontTextView5 != null) {
                                                                        i = R.id.tvProserm;
                                                                        DtacFontTextView dtacFontTextView6 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                                                                        if (dtacFontTextView6 != null) {
                                                                            i = R.id.tvTopup;
                                                                            DtacFontTextView dtacFontTextView7 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                                                                            if (dtacFontTextView7 != null) {
                                                                                return new FragmentMrtrPrepaidSuccessBinding((NestedScrollView) view, linearLayoutCompat, linearLayoutCompat2, linearLayoutCompat3, imageView, imageView2, imageView3, imageView4, relativeLayout, linearLayout, relativeLayout2, relativeLayout3, dtacFontTextView, dtacFontTextView2, dtacFontTextView3, dtacFontTextView4, dtacFontTextView5, dtacFontTextView6, dtacFontTextView7);
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
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static FragmentMrtrPrepaidSuccessBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentMrtrPrepaidSuccessBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_mrtr_prepaid_success, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public NestedScrollView getRoot() {
        return this.f83973a;
    }
}