package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.app_one.widget.OneFontTextView;
import th.p047co.dtac.android.dtacone.app_one.widget.loading.OneSwipeRefresh;

/* renamed from: th.co.dtac.android.dtacone.databinding.FragmentOneStaffDetailBinding */
/* loaded from: classes7.dex */
public final class FragmentOneStaffDetailBinding implements ViewBinding {

    /* renamed from: a */
    public final OneSwipeRefresh f84225a;
    @NonNull
    public final AppCompatImageView ivEditProfile;
    @NonNull
    public final AppCompatImageView ivPermissionClear;
    @NonNull
    public final AppCompatImageView ivPermissionLimit;
    @NonNull
    public final AppCompatImageView ivPermissionSetting;
    @NonNull
    public final AppCompatImageView ivProfile;
    @NonNull
    public final LinearLayoutCompat layoutPermissionClear;
    @NonNull
    public final LinearLayoutCompat layoutPermissionLimit;
    @NonNull
    public final LinearLayoutCompat layoutPermissionSetting;
    @NonNull
    public final NestedScrollView nestedScrollView;
    @NonNull
    public final RecyclerView rvPermission;
    @NonNull
    public final OneSwipeRefresh swipeContainer;
    @NonNull
    public final OneFontTextView tvBtnDeleteStaff;
    @NonNull
    public final OneFontTextView tvNetMonthProfitTitle;
    @NonNull
    public final OneFontTextView tvNetMonthProfitValue;
    @NonNull
    public final OneFontTextView tvProsermTitle;
    @NonNull
    public final OneFontTextView tvProsermValue;
    @NonNull
    public final OneFontTextView tvRectifyTitle;
    @NonNull
    public final OneFontTextView tvRectifyValue;
    @NonNull
    public final OneFontTextView tvStaffApplyDateTitle;
    @NonNull
    public final OneFontTextView tvStaffApplyDateValue;
    @NonNull
    public final OneFontTextView tvStaffDetailHeader;
    @NonNull
    public final OneFontTextView tvStaffGetAmountTitle;
    @NonNull
    public final OneFontTextView tvStaffGetAmountValue;
    @NonNull
    public final OneFontTextView tvStaffLimitAmountHeader;
    @NonNull
    public final OneFontTextView tvStaffMaxLimitSellTitle;
    @NonNull
    public final OneFontTextView tvStaffMaxLimitSellValue;
    @NonNull
    public final OneFontTextView tvStaffName;
    @NonNull
    public final OneFontTextView tvStaffPermissionHeader;
    @NonNull
    public final OneFontTextView tvStaffPhoneNumber;
    @NonNull
    public final OneFontTextView tvStaffProfitHeader;
    @NonNull
    public final OneFontTextView tvTopupTitle;
    @NonNull
    public final OneFontTextView tvTopupValue;
    @NonNull
    public final View vSeparateLinePermission1;
    @NonNull
    public final View vSeparateLinePermission2;
    @NonNull
    public final View vSeparateLineProfit;

    public FragmentOneStaffDetailBinding(OneSwipeRefresh oneSwipeRefresh, AppCompatImageView appCompatImageView, AppCompatImageView appCompatImageView2, AppCompatImageView appCompatImageView3, AppCompatImageView appCompatImageView4, AppCompatImageView appCompatImageView5, LinearLayoutCompat linearLayoutCompat, LinearLayoutCompat linearLayoutCompat2, LinearLayoutCompat linearLayoutCompat3, NestedScrollView nestedScrollView, RecyclerView recyclerView, OneSwipeRefresh oneSwipeRefresh2, OneFontTextView oneFontTextView, OneFontTextView oneFontTextView2, OneFontTextView oneFontTextView3, OneFontTextView oneFontTextView4, OneFontTextView oneFontTextView5, OneFontTextView oneFontTextView6, OneFontTextView oneFontTextView7, OneFontTextView oneFontTextView8, OneFontTextView oneFontTextView9, OneFontTextView oneFontTextView10, OneFontTextView oneFontTextView11, OneFontTextView oneFontTextView12, OneFontTextView oneFontTextView13, OneFontTextView oneFontTextView14, OneFontTextView oneFontTextView15, OneFontTextView oneFontTextView16, OneFontTextView oneFontTextView17, OneFontTextView oneFontTextView18, OneFontTextView oneFontTextView19, OneFontTextView oneFontTextView20, OneFontTextView oneFontTextView21, View view, View view2, View view3) {
        this.f84225a = oneSwipeRefresh;
        this.ivEditProfile = appCompatImageView;
        this.ivPermissionClear = appCompatImageView2;
        this.ivPermissionLimit = appCompatImageView3;
        this.ivPermissionSetting = appCompatImageView4;
        this.ivProfile = appCompatImageView5;
        this.layoutPermissionClear = linearLayoutCompat;
        this.layoutPermissionLimit = linearLayoutCompat2;
        this.layoutPermissionSetting = linearLayoutCompat3;
        this.nestedScrollView = nestedScrollView;
        this.rvPermission = recyclerView;
        this.swipeContainer = oneSwipeRefresh2;
        this.tvBtnDeleteStaff = oneFontTextView;
        this.tvNetMonthProfitTitle = oneFontTextView2;
        this.tvNetMonthProfitValue = oneFontTextView3;
        this.tvProsermTitle = oneFontTextView4;
        this.tvProsermValue = oneFontTextView5;
        this.tvRectifyTitle = oneFontTextView6;
        this.tvRectifyValue = oneFontTextView7;
        this.tvStaffApplyDateTitle = oneFontTextView8;
        this.tvStaffApplyDateValue = oneFontTextView9;
        this.tvStaffDetailHeader = oneFontTextView10;
        this.tvStaffGetAmountTitle = oneFontTextView11;
        this.tvStaffGetAmountValue = oneFontTextView12;
        this.tvStaffLimitAmountHeader = oneFontTextView13;
        this.tvStaffMaxLimitSellTitle = oneFontTextView14;
        this.tvStaffMaxLimitSellValue = oneFontTextView15;
        this.tvStaffName = oneFontTextView16;
        this.tvStaffPermissionHeader = oneFontTextView17;
        this.tvStaffPhoneNumber = oneFontTextView18;
        this.tvStaffProfitHeader = oneFontTextView19;
        this.tvTopupTitle = oneFontTextView20;
        this.tvTopupValue = oneFontTextView21;
        this.vSeparateLinePermission1 = view;
        this.vSeparateLinePermission2 = view2;
        this.vSeparateLineProfit = view3;
    }

    @NonNull
    public static FragmentOneStaffDetailBinding bind(@NonNull View view) {
        View findChildViewById;
        View findChildViewById2;
        View findChildViewById3;
        int i = R.id.ivEditProfile;
        AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(view, i);
        if (appCompatImageView != null) {
            i = R.id.ivPermissionClear;
            AppCompatImageView appCompatImageView2 = (AppCompatImageView) ViewBindings.findChildViewById(view, i);
            if (appCompatImageView2 != null) {
                i = R.id.ivPermissionLimit;
                AppCompatImageView appCompatImageView3 = (AppCompatImageView) ViewBindings.findChildViewById(view, i);
                if (appCompatImageView3 != null) {
                    i = R.id.ivPermissionSetting;
                    AppCompatImageView appCompatImageView4 = (AppCompatImageView) ViewBindings.findChildViewById(view, i);
                    if (appCompatImageView4 != null) {
                        i = R.id.ivProfile;
                        AppCompatImageView appCompatImageView5 = (AppCompatImageView) ViewBindings.findChildViewById(view, i);
                        if (appCompatImageView5 != null) {
                            i = R.id.layoutPermissionClear;
                            LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i);
                            if (linearLayoutCompat != null) {
                                i = R.id.layoutPermissionLimit;
                                LinearLayoutCompat linearLayoutCompat2 = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i);
                                if (linearLayoutCompat2 != null) {
                                    i = R.id.layoutPermissionSetting;
                                    LinearLayoutCompat linearLayoutCompat3 = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i);
                                    if (linearLayoutCompat3 != null) {
                                        i = R.id.nestedScrollView;
                                        NestedScrollView nestedScrollView = (NestedScrollView) ViewBindings.findChildViewById(view, i);
                                        if (nestedScrollView != null) {
                                            i = R.id.rvPermission;
                                            RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
                                            if (recyclerView != null) {
                                                OneSwipeRefresh oneSwipeRefresh = (OneSwipeRefresh) view;
                                                i = R.id.tvBtnDeleteStaff;
                                                OneFontTextView oneFontTextView = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                                if (oneFontTextView != null) {
                                                    i = R.id.tvNetMonthProfitTitle;
                                                    OneFontTextView oneFontTextView2 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                                    if (oneFontTextView2 != null) {
                                                        i = R.id.tvNetMonthProfitValue;
                                                        OneFontTextView oneFontTextView3 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                                        if (oneFontTextView3 != null) {
                                                            i = R.id.tvProsermTitle;
                                                            OneFontTextView oneFontTextView4 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                                            if (oneFontTextView4 != null) {
                                                                i = R.id.tvProsermValue;
                                                                OneFontTextView oneFontTextView5 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                                                if (oneFontTextView5 != null) {
                                                                    i = R.id.tvRectifyTitle;
                                                                    OneFontTextView oneFontTextView6 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                                                    if (oneFontTextView6 != null) {
                                                                        i = R.id.tvRectifyValue;
                                                                        OneFontTextView oneFontTextView7 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                                                        if (oneFontTextView7 != null) {
                                                                            i = R.id.tvStaffApplyDateTitle;
                                                                            OneFontTextView oneFontTextView8 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                                                            if (oneFontTextView8 != null) {
                                                                                i = R.id.tvStaffApplyDateValue;
                                                                                OneFontTextView oneFontTextView9 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                                                                if (oneFontTextView9 != null) {
                                                                                    i = R.id.tvStaffDetailHeader;
                                                                                    OneFontTextView oneFontTextView10 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                                                                    if (oneFontTextView10 != null) {
                                                                                        i = R.id.tvStaffGetAmountTitle;
                                                                                        OneFontTextView oneFontTextView11 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                                                                        if (oneFontTextView11 != null) {
                                                                                            i = R.id.tvStaffGetAmountValue;
                                                                                            OneFontTextView oneFontTextView12 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                                                                            if (oneFontTextView12 != null) {
                                                                                                i = R.id.tvStaffLimitAmountHeader;
                                                                                                OneFontTextView oneFontTextView13 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                                                                                if (oneFontTextView13 != null) {
                                                                                                    i = R.id.tvStaffMaxLimitSellTitle;
                                                                                                    OneFontTextView oneFontTextView14 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                                                                                    if (oneFontTextView14 != null) {
                                                                                                        i = R.id.tvStaffMaxLimitSellValue;
                                                                                                        OneFontTextView oneFontTextView15 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                                                                                        if (oneFontTextView15 != null) {
                                                                                                            i = R.id.tvStaffName;
                                                                                                            OneFontTextView oneFontTextView16 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                                                                                            if (oneFontTextView16 != null) {
                                                                                                                i = R.id.tvStaffPermissionHeader;
                                                                                                                OneFontTextView oneFontTextView17 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                                                                                                if (oneFontTextView17 != null) {
                                                                                                                    i = R.id.tvStaffPhoneNumber;
                                                                                                                    OneFontTextView oneFontTextView18 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                                                                                                    if (oneFontTextView18 != null) {
                                                                                                                        i = R.id.tvStaffProfitHeader;
                                                                                                                        OneFontTextView oneFontTextView19 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                                                                                                        if (oneFontTextView19 != null) {
                                                                                                                            i = R.id.tvTopupTitle;
                                                                                                                            OneFontTextView oneFontTextView20 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                                                                                                            if (oneFontTextView20 != null) {
                                                                                                                                i = R.id.tvTopupValue;
                                                                                                                                OneFontTextView oneFontTextView21 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                                                                                                                if (oneFontTextView21 != null && (findChildViewById = ViewBindings.findChildViewById(view, (i = R.id.vSeparateLinePermission1))) != null && (findChildViewById2 = ViewBindings.findChildViewById(view, (i = R.id.vSeparateLinePermission2))) != null && (findChildViewById3 = ViewBindings.findChildViewById(view, (i = R.id.vSeparateLineProfit))) != null) {
                                                                                                                                    return new FragmentOneStaffDetailBinding(oneSwipeRefresh, appCompatImageView, appCompatImageView2, appCompatImageView3, appCompatImageView4, appCompatImageView5, linearLayoutCompat, linearLayoutCompat2, linearLayoutCompat3, nestedScrollView, recyclerView, oneSwipeRefresh, oneFontTextView, oneFontTextView2, oneFontTextView3, oneFontTextView4, oneFontTextView5, oneFontTextView6, oneFontTextView7, oneFontTextView8, oneFontTextView9, oneFontTextView10, oneFontTextView11, oneFontTextView12, oneFontTextView13, oneFontTextView14, oneFontTextView15, oneFontTextView16, oneFontTextView17, oneFontTextView18, oneFontTextView19, oneFontTextView20, oneFontTextView21, findChildViewById, findChildViewById2, findChildViewById3);
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
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static FragmentOneStaffDetailBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentOneStaffDetailBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_one_staff_detail, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public OneSwipeRefresh getRoot() {
        return this.f84225a;
    }
}