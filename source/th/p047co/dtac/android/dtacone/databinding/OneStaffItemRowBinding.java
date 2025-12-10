package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.app_one.widget.OneFontTextView;
import th.p047co.dtac.android.dtacone.widget.view.DtacCardView;

/* renamed from: th.co.dtac.android.dtacone.databinding.OneStaffItemRowBinding */
/* loaded from: classes7.dex */
public final class OneStaffItemRowBinding implements ViewBinding {

    /* renamed from: a */
    public final DtacCardView f84530a;
    @NonNull
    public final DtacCardView cvStaff;
    @NonNull
    public final ImageView ivNext;
    @NonNull
    public final AppCompatImageView ivPermissionClear;
    @NonNull
    public final AppCompatImageView ivPermissionLimit;
    @NonNull
    public final AppCompatImageView ivPermissionSetting;
    @NonNull
    public final RelativeLayout layoutBox;
    @NonNull
    public final LinearLayoutCompat layoutPermissionClear;
    @NonNull
    public final LinearLayoutCompat layoutPermissionLimit;
    @NonNull
    public final LinearLayoutCompat layoutPermissionSetting;
    @NonNull
    public final LinearLayout linearBoxName;
    @NonNull
    public final LinearLayout linearCredit;
    @NonNull
    public final LinearLayout linearPermissions;
    @NonNull
    public final LinearLayout linearSold;
    @NonNull
    public final RecyclerView rvPermission;
    @NonNull
    public final OneFontTextView tvCreditAmount;
    @NonNull
    public final OneFontTextView tvCreditAmountName;
    @NonNull
    public final OneFontTextView tvSoldAmount;
    @NonNull
    public final OneFontTextView tvSoldAmountName;
    @NonNull
    public final OneFontTextView tvStaffName;
    @NonNull
    public final OneFontTextView tvStaffPermissions;
    @NonNull
    public final OneFontTextView tvStaffPhoneNumber;
    @NonNull
    public final View viewDivide;
    @NonNull
    public final View viewDivide2;

    public OneStaffItemRowBinding(DtacCardView dtacCardView, DtacCardView dtacCardView2, ImageView imageView, AppCompatImageView appCompatImageView, AppCompatImageView appCompatImageView2, AppCompatImageView appCompatImageView3, RelativeLayout relativeLayout, LinearLayoutCompat linearLayoutCompat, LinearLayoutCompat linearLayoutCompat2, LinearLayoutCompat linearLayoutCompat3, LinearLayout linearLayout, LinearLayout linearLayout2, LinearLayout linearLayout3, LinearLayout linearLayout4, RecyclerView recyclerView, OneFontTextView oneFontTextView, OneFontTextView oneFontTextView2, OneFontTextView oneFontTextView3, OneFontTextView oneFontTextView4, OneFontTextView oneFontTextView5, OneFontTextView oneFontTextView6, OneFontTextView oneFontTextView7, View view, View view2) {
        this.f84530a = dtacCardView;
        this.cvStaff = dtacCardView2;
        this.ivNext = imageView;
        this.ivPermissionClear = appCompatImageView;
        this.ivPermissionLimit = appCompatImageView2;
        this.ivPermissionSetting = appCompatImageView3;
        this.layoutBox = relativeLayout;
        this.layoutPermissionClear = linearLayoutCompat;
        this.layoutPermissionLimit = linearLayoutCompat2;
        this.layoutPermissionSetting = linearLayoutCompat3;
        this.linearBoxName = linearLayout;
        this.linearCredit = linearLayout2;
        this.linearPermissions = linearLayout3;
        this.linearSold = linearLayout4;
        this.rvPermission = recyclerView;
        this.tvCreditAmount = oneFontTextView;
        this.tvCreditAmountName = oneFontTextView2;
        this.tvSoldAmount = oneFontTextView3;
        this.tvSoldAmountName = oneFontTextView4;
        this.tvStaffName = oneFontTextView5;
        this.tvStaffPermissions = oneFontTextView6;
        this.tvStaffPhoneNumber = oneFontTextView7;
        this.viewDivide = view;
        this.viewDivide2 = view2;
    }

    @NonNull
    public static OneStaffItemRowBinding bind(@NonNull View view) {
        View findChildViewById;
        View findChildViewById2;
        DtacCardView dtacCardView = (DtacCardView) view;
        int i = R.id.ivNext;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
        if (imageView != null) {
            i = R.id.ivPermissionClear;
            AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(view, i);
            if (appCompatImageView != null) {
                i = R.id.ivPermissionLimit;
                AppCompatImageView appCompatImageView2 = (AppCompatImageView) ViewBindings.findChildViewById(view, i);
                if (appCompatImageView2 != null) {
                    i = R.id.ivPermissionSetting;
                    AppCompatImageView appCompatImageView3 = (AppCompatImageView) ViewBindings.findChildViewById(view, i);
                    if (appCompatImageView3 != null) {
                        i = R.id.layoutBox;
                        RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, i);
                        if (relativeLayout != null) {
                            i = R.id.layoutPermissionClear;
                            LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i);
                            if (linearLayoutCompat != null) {
                                i = R.id.layoutPermissionLimit;
                                LinearLayoutCompat linearLayoutCompat2 = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i);
                                if (linearLayoutCompat2 != null) {
                                    i = R.id.layoutPermissionSetting;
                                    LinearLayoutCompat linearLayoutCompat3 = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i);
                                    if (linearLayoutCompat3 != null) {
                                        i = R.id.linearBoxName;
                                        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i);
                                        if (linearLayout != null) {
                                            i = R.id.linearCredit;
                                            LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(view, i);
                                            if (linearLayout2 != null) {
                                                i = R.id.linearPermissions;
                                                LinearLayout linearLayout3 = (LinearLayout) ViewBindings.findChildViewById(view, i);
                                                if (linearLayout3 != null) {
                                                    i = R.id.linearSold;
                                                    LinearLayout linearLayout4 = (LinearLayout) ViewBindings.findChildViewById(view, i);
                                                    if (linearLayout4 != null) {
                                                        i = R.id.rvPermission;
                                                        RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
                                                        if (recyclerView != null) {
                                                            i = R.id.tvCreditAmount;
                                                            OneFontTextView oneFontTextView = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                                            if (oneFontTextView != null) {
                                                                i = R.id.tvCreditAmountName;
                                                                OneFontTextView oneFontTextView2 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                                                if (oneFontTextView2 != null) {
                                                                    i = R.id.tvSoldAmount;
                                                                    OneFontTextView oneFontTextView3 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                                                    if (oneFontTextView3 != null) {
                                                                        i = R.id.tvSoldAmountName;
                                                                        OneFontTextView oneFontTextView4 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                                                        if (oneFontTextView4 != null) {
                                                                            i = R.id.tvStaffName;
                                                                            OneFontTextView oneFontTextView5 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                                                            if (oneFontTextView5 != null) {
                                                                                i = R.id.tvStaffPermissions;
                                                                                OneFontTextView oneFontTextView6 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                                                                if (oneFontTextView6 != null) {
                                                                                    i = R.id.tvStaffPhoneNumber;
                                                                                    OneFontTextView oneFontTextView7 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                                                                    if (oneFontTextView7 != null && (findChildViewById = ViewBindings.findChildViewById(view, (i = R.id.viewDivide))) != null && (findChildViewById2 = ViewBindings.findChildViewById(view, (i = R.id.viewDivide2))) != null) {
                                                                                        return new OneStaffItemRowBinding(dtacCardView, dtacCardView, imageView, appCompatImageView, appCompatImageView2, appCompatImageView3, relativeLayout, linearLayoutCompat, linearLayoutCompat2, linearLayoutCompat3, linearLayout, linearLayout2, linearLayout3, linearLayout4, recyclerView, oneFontTextView, oneFontTextView2, oneFontTextView3, oneFontTextView4, oneFontTextView5, oneFontTextView6, oneFontTextView7, findChildViewById, findChildViewById2);
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
    public static OneStaffItemRowBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static OneStaffItemRowBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.one_staff_item_row, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public DtacCardView getRoot() {
        return this.f84530a;
    }
}
