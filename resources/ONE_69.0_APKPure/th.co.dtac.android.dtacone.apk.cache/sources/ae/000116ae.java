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
import th.p047co.dtac.android.dtacone.app_one.widget.OneFontTextView;

/* renamed from: th.co.dtac.android.dtacone.databinding.FragmentOnePrepaidSuccessBinding */
/* loaded from: classes7.dex */
public final class FragmentOnePrepaidSuccessBinding implements ViewBinding {

    /* renamed from: a */
    public final NestedScrollView f84189a;
    @NonNull
    public final LinearLayoutCompat btnDoAgain;
    @NonNull
    public final LinearLayoutCompat btnGoHome;
    @NonNull
    public final LinearLayoutCompat btnPrintReceipt;
    @NonNull
    public final ImageView ivChangePro;
    @NonNull
    public final ImageView ivPrint;
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
    public final View lineEnd;
    @NonNull
    public final OneFontTextView tvBtnDoAgain;
    @NonNull
    public final OneFontTextView tvChangePro;
    @NonNull
    public final OneFontTextView tvCheckSimStock;
    @NonNull
    public final OneFontTextView tvError;
    @NonNull
    public final OneFontTextView tvErrorDate;
    @NonNull
    public final OneFontTextView tvErrorQueryTransaction;
    @NonNull
    public final OneFontTextView tvPhoneNumber;
    @NonNull
    public final OneFontTextView tvPrint;
    @NonNull
    public final OneFontTextView tvProserm;
    @NonNull
    public final OneFontTextView tvSIMSerial;
    @NonNull
    public final OneFontTextView tvTitle;
    @NonNull
    public final OneFontTextView tvTopup;

    public FragmentOnePrepaidSuccessBinding(NestedScrollView nestedScrollView, LinearLayoutCompat linearLayoutCompat, LinearLayoutCompat linearLayoutCompat2, LinearLayoutCompat linearLayoutCompat3, ImageView imageView, ImageView imageView2, ImageView imageView3, ImageView imageView4, ImageView imageView5, RelativeLayout relativeLayout, LinearLayout linearLayout, RelativeLayout relativeLayout2, RelativeLayout relativeLayout3, View view, OneFontTextView oneFontTextView, OneFontTextView oneFontTextView2, OneFontTextView oneFontTextView3, OneFontTextView oneFontTextView4, OneFontTextView oneFontTextView5, OneFontTextView oneFontTextView6, OneFontTextView oneFontTextView7, OneFontTextView oneFontTextView8, OneFontTextView oneFontTextView9, OneFontTextView oneFontTextView10, OneFontTextView oneFontTextView11, OneFontTextView oneFontTextView12) {
        this.f84189a = nestedScrollView;
        this.btnDoAgain = linearLayoutCompat;
        this.btnGoHome = linearLayoutCompat2;
        this.btnPrintReceipt = linearLayoutCompat3;
        this.ivChangePro = imageView;
        this.ivPrint = imageView2;
        this.ivProserm = imageView3;
        this.ivSuccess = imageView4;
        this.ivTopupImage = imageView5;
        this.layoutChangePro = relativeLayout;
        this.layoutMenu = linearLayout;
        this.layoutProserm = relativeLayout2;
        this.layoutTopup = relativeLayout3;
        this.lineEnd = view;
        this.tvBtnDoAgain = oneFontTextView;
        this.tvChangePro = oneFontTextView2;
        this.tvCheckSimStock = oneFontTextView3;
        this.tvError = oneFontTextView4;
        this.tvErrorDate = oneFontTextView5;
        this.tvErrorQueryTransaction = oneFontTextView6;
        this.tvPhoneNumber = oneFontTextView7;
        this.tvPrint = oneFontTextView8;
        this.tvProserm = oneFontTextView9;
        this.tvSIMSerial = oneFontTextView10;
        this.tvTitle = oneFontTextView11;
        this.tvTopup = oneFontTextView12;
    }

    @NonNull
    public static FragmentOnePrepaidSuccessBinding bind(@NonNull View view) {
        View findChildViewById;
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
                        i = R.id.ivPrint;
                        ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, i);
                        if (imageView2 != null) {
                            i = R.id.ivProserm;
                            ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(view, i);
                            if (imageView3 != null) {
                                i = R.id.ivSuccess;
                                ImageView imageView4 = (ImageView) ViewBindings.findChildViewById(view, i);
                                if (imageView4 != null) {
                                    i = R.id.ivTopupImage;
                                    ImageView imageView5 = (ImageView) ViewBindings.findChildViewById(view, i);
                                    if (imageView5 != null) {
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
                                                    if (relativeLayout3 != null && (findChildViewById = ViewBindings.findChildViewById(view, (i = R.id.lineEnd))) != null) {
                                                        i = R.id.tvBtnDoAgain;
                                                        OneFontTextView oneFontTextView = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                                        if (oneFontTextView != null) {
                                                            i = R.id.tvChangePro;
                                                            OneFontTextView oneFontTextView2 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                                            if (oneFontTextView2 != null) {
                                                                i = R.id.tvCheckSimStock;
                                                                OneFontTextView oneFontTextView3 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                                                if (oneFontTextView3 != null) {
                                                                    i = R.id.tvError;
                                                                    OneFontTextView oneFontTextView4 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                                                    if (oneFontTextView4 != null) {
                                                                        i = R.id.tvErrorDate;
                                                                        OneFontTextView oneFontTextView5 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                                                        if (oneFontTextView5 != null) {
                                                                            i = R.id.tvErrorQueryTransaction;
                                                                            OneFontTextView oneFontTextView6 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                                                            if (oneFontTextView6 != null) {
                                                                                i = R.id.tvPhoneNumber;
                                                                                OneFontTextView oneFontTextView7 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                                                                if (oneFontTextView7 != null) {
                                                                                    i = R.id.tvPrint;
                                                                                    OneFontTextView oneFontTextView8 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                                                                    if (oneFontTextView8 != null) {
                                                                                        i = R.id.tvProserm;
                                                                                        OneFontTextView oneFontTextView9 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                                                                        if (oneFontTextView9 != null) {
                                                                                            i = R.id.tvSIMSerial;
                                                                                            OneFontTextView oneFontTextView10 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                                                                            if (oneFontTextView10 != null) {
                                                                                                i = R.id.tvTitle;
                                                                                                OneFontTextView oneFontTextView11 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                                                                                if (oneFontTextView11 != null) {
                                                                                                    i = R.id.tvTopup;
                                                                                                    OneFontTextView oneFontTextView12 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                                                                                    if (oneFontTextView12 != null) {
                                                                                                        return new FragmentOnePrepaidSuccessBinding((NestedScrollView) view, linearLayoutCompat, linearLayoutCompat2, linearLayoutCompat3, imageView, imageView2, imageView3, imageView4, imageView5, relativeLayout, linearLayout, relativeLayout2, relativeLayout3, findChildViewById, oneFontTextView, oneFontTextView2, oneFontTextView3, oneFontTextView4, oneFontTextView5, oneFontTextView6, oneFontTextView7, oneFontTextView8, oneFontTextView9, oneFontTextView10, oneFontTextView11, oneFontTextView12);
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
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static FragmentOnePrepaidSuccessBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentOnePrepaidSuccessBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_one_prepaid_success, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public NestedScrollView getRoot() {
        return this.f84189a;
    }
}