package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.appbar.AppBarLayout;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.widget.loading.DtacSwipeRefresh;
import th.p047co.dtac.android.dtacone.widget.view.DtacFontButton;
import th.p047co.dtac.android.dtacone.widget.view.DtacFontTextView;
import th.p047co.dtac.android.dtacone.widget.view.DtacPhoneBookEditText;
import th.p047co.dtac.android.dtacone.widget.view.DtacTabLayout;
import th.p047co.dtac.android.dtacone.widget.view.WrapContentViewPager;

/* renamed from: th.co.dtac.android.dtacone.databinding.FragmentStvPhoenixBinding */
/* loaded from: classes7.dex */
public final class FragmentStvPhoenixBinding implements ViewBinding {

    /* renamed from: a */
    public final FrameLayout f84200a;
    @NonNull
    public final ZBalanceBoxBinding balanceBox;
    @NonNull
    public final DtacFontButton btnStvPhoenixConfirm;
    @NonNull
    public final LinearLayout contentList;
    @NonNull
    public final ImageView expiredPackageDateImageView;
    @NonNull
    public final ImageView imageView41;
    @NonNull
    public final ImageView imgUserType;
    @NonNull
    public final ZIncProsermRecommendBinding incProsermRecommend;
    @NonNull
    public final ConstraintLayout layoutExpiredPackageDate;
    @NonNull
    public final LinearLayout layoutUserType;
    @NonNull
    public final DtacFontTextView oneTopUpBalanceRetryTextView;
    @NonNull
    public final CoordinatorLayout rootLayout;
    @NonNull
    public final DtacPhoneBookEditText serviceZTeledittext;
    @NonNull
    public final AppBarLayout stvPhoenixAppBar;
    @NonNull
    public final ImageView stvProsermBalanceImageView;
    @NonNull
    public final ConstraintLayout stvProsermBalanceLayout;
    @NonNull
    public final ImageView stvProsermBalanceRetryButton;
    @NonNull
    public final DtacFontTextView stvProsermBalanceTitleTextView;
    @NonNull
    public final DtacFontTextView stvProsermBalanceValueTextView;
    @NonNull
    public final ConstraintLayout stvProsermRetryLayout;
    @NonNull
    public final DtacSwipeRefresh swipeContainer;
    @NonNull
    public final DtacTabLayout tabLayout;
    @NonNull
    public final DtacFontTextView tvExpireDate;
    @NonNull
    public final DtacFontTextView tvUserType;
    @NonNull
    public final WrapContentViewPager viewPager;

    public FragmentStvPhoenixBinding(FrameLayout frameLayout, ZBalanceBoxBinding zBalanceBoxBinding, DtacFontButton dtacFontButton, LinearLayout linearLayout, ImageView imageView, ImageView imageView2, ImageView imageView3, ZIncProsermRecommendBinding zIncProsermRecommendBinding, ConstraintLayout constraintLayout, LinearLayout linearLayout2, DtacFontTextView dtacFontTextView, CoordinatorLayout coordinatorLayout, DtacPhoneBookEditText dtacPhoneBookEditText, AppBarLayout appBarLayout, ImageView imageView4, ConstraintLayout constraintLayout2, ImageView imageView5, DtacFontTextView dtacFontTextView2, DtacFontTextView dtacFontTextView3, ConstraintLayout constraintLayout3, DtacSwipeRefresh dtacSwipeRefresh, DtacTabLayout dtacTabLayout, DtacFontTextView dtacFontTextView4, DtacFontTextView dtacFontTextView5, WrapContentViewPager wrapContentViewPager) {
        this.f84200a = frameLayout;
        this.balanceBox = zBalanceBoxBinding;
        this.btnStvPhoenixConfirm = dtacFontButton;
        this.contentList = linearLayout;
        this.expiredPackageDateImageView = imageView;
        this.imageView41 = imageView2;
        this.imgUserType = imageView3;
        this.incProsermRecommend = zIncProsermRecommendBinding;
        this.layoutExpiredPackageDate = constraintLayout;
        this.layoutUserType = linearLayout2;
        this.oneTopUpBalanceRetryTextView = dtacFontTextView;
        this.rootLayout = coordinatorLayout;
        this.serviceZTeledittext = dtacPhoneBookEditText;
        this.stvPhoenixAppBar = appBarLayout;
        this.stvProsermBalanceImageView = imageView4;
        this.stvProsermBalanceLayout = constraintLayout2;
        this.stvProsermBalanceRetryButton = imageView5;
        this.stvProsermBalanceTitleTextView = dtacFontTextView2;
        this.stvProsermBalanceValueTextView = dtacFontTextView3;
        this.stvProsermRetryLayout = constraintLayout3;
        this.swipeContainer = dtacSwipeRefresh;
        this.tabLayout = dtacTabLayout;
        this.tvExpireDate = dtacFontTextView4;
        this.tvUserType = dtacFontTextView5;
        this.viewPager = wrapContentViewPager;
    }

    @NonNull
    public static FragmentStvPhoenixBinding bind(@NonNull View view) {
        View findChildViewById;
        int i = R.id.balance_box;
        View findChildViewById2 = ViewBindings.findChildViewById(view, i);
        if (findChildViewById2 != null) {
            ZBalanceBoxBinding bind = ZBalanceBoxBinding.bind(findChildViewById2);
            i = R.id.btn_stv_phoenix_confirm;
            DtacFontButton dtacFontButton = (DtacFontButton) ViewBindings.findChildViewById(view, i);
            if (dtacFontButton != null) {
                i = R.id.contentList;
                LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i);
                if (linearLayout != null) {
                    i = R.id.expiredPackageDateImageView;
                    ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
                    if (imageView != null) {
                        i = R.id.imageView41;
                        ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, i);
                        if (imageView2 != null) {
                            i = R.id.imgUserType;
                            ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(view, i);
                            if (imageView3 != null && (findChildViewById = ViewBindings.findChildViewById(view, (i = R.id.incProsermRecommend))) != null) {
                                ZIncProsermRecommendBinding bind2 = ZIncProsermRecommendBinding.bind(findChildViewById);
                                i = R.id.layoutExpiredPackageDate;
                                ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
                                if (constraintLayout != null) {
                                    i = R.id.layoutUserType;
                                    LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(view, i);
                                    if (linearLayout2 != null) {
                                        i = R.id.oneTopUpBalanceRetryTextView;
                                        DtacFontTextView dtacFontTextView = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                                        if (dtacFontTextView != null) {
                                            i = R.id.rootLayout;
                                            CoordinatorLayout coordinatorLayout = (CoordinatorLayout) ViewBindings.findChildViewById(view, i);
                                            if (coordinatorLayout != null) {
                                                i = R.id.service_z_teledittext;
                                                DtacPhoneBookEditText dtacPhoneBookEditText = (DtacPhoneBookEditText) ViewBindings.findChildViewById(view, i);
                                                if (dtacPhoneBookEditText != null) {
                                                    i = R.id.stv_phoenix_app_bar;
                                                    AppBarLayout appBarLayout = (AppBarLayout) ViewBindings.findChildViewById(view, i);
                                                    if (appBarLayout != null) {
                                                        i = R.id.stvProsermBalanceImageView;
                                                        ImageView imageView4 = (ImageView) ViewBindings.findChildViewById(view, i);
                                                        if (imageView4 != null) {
                                                            i = R.id.stvProsermBalanceLayout;
                                                            ConstraintLayout constraintLayout2 = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
                                                            if (constraintLayout2 != null) {
                                                                i = R.id.stvProsermBalanceRetryButton;
                                                                ImageView imageView5 = (ImageView) ViewBindings.findChildViewById(view, i);
                                                                if (imageView5 != null) {
                                                                    i = R.id.stvProsermBalanceTitleTextView;
                                                                    DtacFontTextView dtacFontTextView2 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                                                                    if (dtacFontTextView2 != null) {
                                                                        i = R.id.stvProsermBalanceValueTextView;
                                                                        DtacFontTextView dtacFontTextView3 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                                                                        if (dtacFontTextView3 != null) {
                                                                            i = R.id.stvProsermRetryLayout;
                                                                            ConstraintLayout constraintLayout3 = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
                                                                            if (constraintLayout3 != null) {
                                                                                i = R.id.swipeContainer;
                                                                                DtacSwipeRefresh dtacSwipeRefresh = (DtacSwipeRefresh) ViewBindings.findChildViewById(view, i);
                                                                                if (dtacSwipeRefresh != null) {
                                                                                    i = R.id.tabLayout;
                                                                                    DtacTabLayout dtacTabLayout = (DtacTabLayout) ViewBindings.findChildViewById(view, i);
                                                                                    if (dtacTabLayout != null) {
                                                                                        i = R.id.tvExpireDate;
                                                                                        DtacFontTextView dtacFontTextView4 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                                                                                        if (dtacFontTextView4 != null) {
                                                                                            i = R.id.tvUserType;
                                                                                            DtacFontTextView dtacFontTextView5 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                                                                                            if (dtacFontTextView5 != null) {
                                                                                                i = R.id.viewPager;
                                                                                                WrapContentViewPager wrapContentViewPager = (WrapContentViewPager) ViewBindings.findChildViewById(view, i);
                                                                                                if (wrapContentViewPager != null) {
                                                                                                    return new FragmentStvPhoenixBinding((FrameLayout) view, bind, dtacFontButton, linearLayout, imageView, imageView2, imageView3, bind2, constraintLayout, linearLayout2, dtacFontTextView, coordinatorLayout, dtacPhoneBookEditText, appBarLayout, imageView4, constraintLayout2, imageView5, dtacFontTextView2, dtacFontTextView3, constraintLayout3, dtacSwipeRefresh, dtacTabLayout, dtacFontTextView4, dtacFontTextView5, wrapContentViewPager);
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
    public static FragmentStvPhoenixBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentStvPhoenixBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_stv_phoenix, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public FrameLayout getRoot() {
        return this.f84200a;
    }
}
