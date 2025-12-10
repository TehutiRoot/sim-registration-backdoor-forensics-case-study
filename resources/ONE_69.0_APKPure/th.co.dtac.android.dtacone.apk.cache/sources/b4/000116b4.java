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
import androidx.core.widget.NestedScrollView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.appbar.AppBarLayout;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.app_one.widget.OneButtonBlue;
import th.p047co.dtac.android.dtacone.app_one.widget.OneFontTextView;
import th.p047co.dtac.android.dtacone.app_one.widget.OnePhoneBookEditText;
import th.p047co.dtac.android.dtacone.app_one.widget.OneTabLayout;
import th.p047co.dtac.android.dtacone.widget.loading.DtacSwipeRefresh;
import th.p047co.dtac.android.dtacone.widget.view.WrapContentViewPager;

/* renamed from: th.co.dtac.android.dtacone.databinding.FragmentOneProsermOnlineInputNumberBinding */
/* loaded from: classes7.dex */
public final class FragmentOneProsermOnlineInputNumberBinding implements ViewBinding {

    /* renamed from: a */
    public final FrameLayout f84195a;
    @NonNull
    public final OneBalanceBoxBinding balanceBox;
    @NonNull
    public final ImageView btnClearPhoneText;
    @NonNull
    public final OneButtonBlue btnStvPhoenixConfirm;
    @NonNull
    public final LinearLayout contentList;
    @NonNull
    public final ImageView imageView41;
    @NonNull
    public final ImageView imageView42;
    @NonNull
    public final ImageView imgUserType;
    @NonNull
    public final ConstraintLayout layoutExpiredPackageDate;
    @NonNull
    public final LinearLayout layoutUserType;
    @NonNull
    public final LinearLayout layoutView;
    @NonNull
    public final NestedScrollView nestedScrollView;
    @NonNull
    public final ImageView oneStvProsermBalanceImageView;
    @NonNull
    public final ConstraintLayout oneStvProsermBalanceLayout;
    @NonNull
    public final ImageView oneStvProsermBalanceRetryButton;
    @NonNull
    public final ConstraintLayout oneStvProsermBalanceRetryLayout;
    @NonNull
    public final OneFontTextView oneStvProsermBalanceRetryTextView;
    @NonNull
    public final OneFontTextView oneStvProsermBalanceTitleTextView;
    @NonNull
    public final OneFontTextView oneStvProsermBalanceValueTextView;
    @NonNull
    public final FrameLayout root;
    @NonNull
    public final CoordinatorLayout rootLayout;
    @NonNull
    public final OnePhoneBookEditText serviceZTeledittext;
    @NonNull
    public final AppBarLayout stvPhoenixAppBar;
    @NonNull
    public final DtacSwipeRefresh swipeContainer;
    @NonNull
    public final OneTabLayout tabLayout;
    @NonNull
    public final OneFontTextView tvExpireDate;
    @NonNull
    public final OneFontTextView tvMorePackage;
    @NonNull
    public final OneFontTextView tvUserType;
    @NonNull
    public final WrapContentViewPager viewPager;

    public FragmentOneProsermOnlineInputNumberBinding(FrameLayout frameLayout, OneBalanceBoxBinding oneBalanceBoxBinding, ImageView imageView, OneButtonBlue oneButtonBlue, LinearLayout linearLayout, ImageView imageView2, ImageView imageView3, ImageView imageView4, ConstraintLayout constraintLayout, LinearLayout linearLayout2, LinearLayout linearLayout3, NestedScrollView nestedScrollView, ImageView imageView5, ConstraintLayout constraintLayout2, ImageView imageView6, ConstraintLayout constraintLayout3, OneFontTextView oneFontTextView, OneFontTextView oneFontTextView2, OneFontTextView oneFontTextView3, FrameLayout frameLayout2, CoordinatorLayout coordinatorLayout, OnePhoneBookEditText onePhoneBookEditText, AppBarLayout appBarLayout, DtacSwipeRefresh dtacSwipeRefresh, OneTabLayout oneTabLayout, OneFontTextView oneFontTextView4, OneFontTextView oneFontTextView5, OneFontTextView oneFontTextView6, WrapContentViewPager wrapContentViewPager) {
        this.f84195a = frameLayout;
        this.balanceBox = oneBalanceBoxBinding;
        this.btnClearPhoneText = imageView;
        this.btnStvPhoenixConfirm = oneButtonBlue;
        this.contentList = linearLayout;
        this.imageView41 = imageView2;
        this.imageView42 = imageView3;
        this.imgUserType = imageView4;
        this.layoutExpiredPackageDate = constraintLayout;
        this.layoutUserType = linearLayout2;
        this.layoutView = linearLayout3;
        this.nestedScrollView = nestedScrollView;
        this.oneStvProsermBalanceImageView = imageView5;
        this.oneStvProsermBalanceLayout = constraintLayout2;
        this.oneStvProsermBalanceRetryButton = imageView6;
        this.oneStvProsermBalanceRetryLayout = constraintLayout3;
        this.oneStvProsermBalanceRetryTextView = oneFontTextView;
        this.oneStvProsermBalanceTitleTextView = oneFontTextView2;
        this.oneStvProsermBalanceValueTextView = oneFontTextView3;
        this.root = frameLayout2;
        this.rootLayout = coordinatorLayout;
        this.serviceZTeledittext = onePhoneBookEditText;
        this.stvPhoenixAppBar = appBarLayout;
        this.swipeContainer = dtacSwipeRefresh;
        this.tabLayout = oneTabLayout;
        this.tvExpireDate = oneFontTextView4;
        this.tvMorePackage = oneFontTextView5;
        this.tvUserType = oneFontTextView6;
        this.viewPager = wrapContentViewPager;
    }

    @NonNull
    public static FragmentOneProsermOnlineInputNumberBinding bind(@NonNull View view) {
        int i = R.id.balance_box;
        View findChildViewById = ViewBindings.findChildViewById(view, i);
        if (findChildViewById != null) {
            OneBalanceBoxBinding bind = OneBalanceBoxBinding.bind(findChildViewById);
            i = R.id.btnClearPhoneText;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
            if (imageView != null) {
                i = R.id.btn_stv_phoenix_confirm;
                OneButtonBlue oneButtonBlue = (OneButtonBlue) ViewBindings.findChildViewById(view, i);
                if (oneButtonBlue != null) {
                    i = R.id.contentList;
                    LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i);
                    if (linearLayout != null) {
                        i = R.id.imageView41;
                        ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, i);
                        if (imageView2 != null) {
                            i = R.id.imageView42;
                            ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(view, i);
                            if (imageView3 != null) {
                                i = R.id.imgUserType;
                                ImageView imageView4 = (ImageView) ViewBindings.findChildViewById(view, i);
                                if (imageView4 != null) {
                                    i = R.id.layoutExpiredPackageDate;
                                    ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
                                    if (constraintLayout != null) {
                                        i = R.id.layoutUserType;
                                        LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(view, i);
                                        if (linearLayout2 != null) {
                                            i = R.id.layoutView;
                                            LinearLayout linearLayout3 = (LinearLayout) ViewBindings.findChildViewById(view, i);
                                            if (linearLayout3 != null) {
                                                i = R.id.nestedScrollView;
                                                NestedScrollView nestedScrollView = (NestedScrollView) ViewBindings.findChildViewById(view, i);
                                                if (nestedScrollView != null) {
                                                    i = R.id.oneStvProsermBalanceImageView;
                                                    ImageView imageView5 = (ImageView) ViewBindings.findChildViewById(view, i);
                                                    if (imageView5 != null) {
                                                        i = R.id.oneStvProsermBalanceLayout;
                                                        ConstraintLayout constraintLayout2 = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
                                                        if (constraintLayout2 != null) {
                                                            i = R.id.oneStvProsermBalanceRetryButton;
                                                            ImageView imageView6 = (ImageView) ViewBindings.findChildViewById(view, i);
                                                            if (imageView6 != null) {
                                                                i = R.id.oneStvProsermBalanceRetryLayout;
                                                                ConstraintLayout constraintLayout3 = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
                                                                if (constraintLayout3 != null) {
                                                                    i = R.id.oneStvProsermBalanceRetryTextView;
                                                                    OneFontTextView oneFontTextView = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                                                    if (oneFontTextView != null) {
                                                                        i = R.id.oneStvProsermBalanceTitleTextView;
                                                                        OneFontTextView oneFontTextView2 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                                                        if (oneFontTextView2 != null) {
                                                                            i = R.id.oneStvProsermBalanceValueTextView;
                                                                            OneFontTextView oneFontTextView3 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                                                            if (oneFontTextView3 != null) {
                                                                                FrameLayout frameLayout = (FrameLayout) view;
                                                                                i = R.id.rootLayout;
                                                                                CoordinatorLayout coordinatorLayout = (CoordinatorLayout) ViewBindings.findChildViewById(view, i);
                                                                                if (coordinatorLayout != null) {
                                                                                    i = R.id.service_z_teledittext;
                                                                                    OnePhoneBookEditText onePhoneBookEditText = (OnePhoneBookEditText) ViewBindings.findChildViewById(view, i);
                                                                                    if (onePhoneBookEditText != null) {
                                                                                        i = R.id.stv_phoenix_app_bar;
                                                                                        AppBarLayout appBarLayout = (AppBarLayout) ViewBindings.findChildViewById(view, i);
                                                                                        if (appBarLayout != null) {
                                                                                            i = R.id.swipeContainer;
                                                                                            DtacSwipeRefresh dtacSwipeRefresh = (DtacSwipeRefresh) ViewBindings.findChildViewById(view, i);
                                                                                            if (dtacSwipeRefresh != null) {
                                                                                                i = R.id.tabLayout;
                                                                                                OneTabLayout oneTabLayout = (OneTabLayout) ViewBindings.findChildViewById(view, i);
                                                                                                if (oneTabLayout != null) {
                                                                                                    i = R.id.tvExpireDate;
                                                                                                    OneFontTextView oneFontTextView4 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                                                                                    if (oneFontTextView4 != null) {
                                                                                                        i = R.id.tvMorePackage;
                                                                                                        OneFontTextView oneFontTextView5 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                                                                                        if (oneFontTextView5 != null) {
                                                                                                            i = R.id.tvUserType;
                                                                                                            OneFontTextView oneFontTextView6 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                                                                                            if (oneFontTextView6 != null) {
                                                                                                                i = R.id.viewPager;
                                                                                                                WrapContentViewPager wrapContentViewPager = (WrapContentViewPager) ViewBindings.findChildViewById(view, i);
                                                                                                                if (wrapContentViewPager != null) {
                                                                                                                    return new FragmentOneProsermOnlineInputNumberBinding(frameLayout, bind, imageView, oneButtonBlue, linearLayout, imageView2, imageView3, imageView4, constraintLayout, linearLayout2, linearLayout3, nestedScrollView, imageView5, constraintLayout2, imageView6, constraintLayout3, oneFontTextView, oneFontTextView2, oneFontTextView3, frameLayout, coordinatorLayout, onePhoneBookEditText, appBarLayout, dtacSwipeRefresh, oneTabLayout, oneFontTextView4, oneFontTextView5, oneFontTextView6, wrapContentViewPager);
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
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static FragmentOneProsermOnlineInputNumberBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentOneProsermOnlineInputNumberBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_one_proserm_online_input_number, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public FrameLayout getRoot() {
        return this.f84195a;
    }
}