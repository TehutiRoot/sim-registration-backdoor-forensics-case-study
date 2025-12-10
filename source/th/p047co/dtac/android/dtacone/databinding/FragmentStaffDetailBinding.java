package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridLayout;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.widget.view.DtacFontButton;
import th.p047co.dtac.android.dtacone.widget.view.DtacFontTextView;

/* renamed from: th.co.dtac.android.dtacone.databinding.FragmentStaffDetailBinding */
/* loaded from: classes7.dex */
public final class FragmentStaffDetailBinding implements ViewBinding {

    /* renamed from: a */
    public final RelativeLayout f84196a;
    @NonNull
    public final HorizontalScrollView horizontalScroll;
    @NonNull
    public final GridLayout imagePermissionBox;
    @NonNull
    public final ZIncludeManageStaffBinding incManageStaff;
    @NonNull
    public final DtacFontButton staffDetailBtDeleteStaff;
    @NonNull
    public final CardView staffDetailCardView;
    @NonNull
    public final View staffDetailHr1;
    @NonNull
    public final View staffDetailHr2;
    @NonNull
    public final ImageView staffDetailIcChangeName;
    @NonNull
    public final RelativeLayout staffDetailTitleLayout;
    @NonNull
    public final DtacFontTextView staffDetailTvCreatedDate;
    @NonNull
    public final DtacFontTextView staffDetailTvCreatedDateLabel;
    @NonNull
    public final DtacFontTextView staffDetailTvMaxCredit;
    @NonNull
    public final DtacFontTextView staffDetailTvMaxCreditLabel;
    @NonNull
    public final DtacFontTextView staffDetailTvNetSold;
    @NonNull
    public final DtacFontTextView staffDetailTvNetSoldLabel;
    @NonNull
    public final DtacFontTextView staffDetailTvRectify;
    @NonNull
    public final DtacFontTextView staffDetailTvRectifyLabel;
    @NonNull
    public final DtacFontTextView staffDetailTvSold;
    @NonNull
    public final DtacFontTextView staffDetailTvSoldLabel;
    @NonNull
    public final DtacFontTextView staffDetailTvStaffName;
    @NonNull
    public final DtacFontTextView staffDetailTvStv;
    @NonNull
    public final DtacFontTextView staffDetailTvStvLabel;
    @NonNull
    public final DtacFontTextView staffDetailTvTopup;
    @NonNull
    public final DtacFontTextView staffDetailTvTopupLabel;

    public FragmentStaffDetailBinding(RelativeLayout relativeLayout, HorizontalScrollView horizontalScrollView, GridLayout gridLayout, ZIncludeManageStaffBinding zIncludeManageStaffBinding, DtacFontButton dtacFontButton, CardView cardView, View view, View view2, ImageView imageView, RelativeLayout relativeLayout2, DtacFontTextView dtacFontTextView, DtacFontTextView dtacFontTextView2, DtacFontTextView dtacFontTextView3, DtacFontTextView dtacFontTextView4, DtacFontTextView dtacFontTextView5, DtacFontTextView dtacFontTextView6, DtacFontTextView dtacFontTextView7, DtacFontTextView dtacFontTextView8, DtacFontTextView dtacFontTextView9, DtacFontTextView dtacFontTextView10, DtacFontTextView dtacFontTextView11, DtacFontTextView dtacFontTextView12, DtacFontTextView dtacFontTextView13, DtacFontTextView dtacFontTextView14, DtacFontTextView dtacFontTextView15) {
        this.f84196a = relativeLayout;
        this.horizontalScroll = horizontalScrollView;
        this.imagePermissionBox = gridLayout;
        this.incManageStaff = zIncludeManageStaffBinding;
        this.staffDetailBtDeleteStaff = dtacFontButton;
        this.staffDetailCardView = cardView;
        this.staffDetailHr1 = view;
        this.staffDetailHr2 = view2;
        this.staffDetailIcChangeName = imageView;
        this.staffDetailTitleLayout = relativeLayout2;
        this.staffDetailTvCreatedDate = dtacFontTextView;
        this.staffDetailTvCreatedDateLabel = dtacFontTextView2;
        this.staffDetailTvMaxCredit = dtacFontTextView3;
        this.staffDetailTvMaxCreditLabel = dtacFontTextView4;
        this.staffDetailTvNetSold = dtacFontTextView5;
        this.staffDetailTvNetSoldLabel = dtacFontTextView6;
        this.staffDetailTvRectify = dtacFontTextView7;
        this.staffDetailTvRectifyLabel = dtacFontTextView8;
        this.staffDetailTvSold = dtacFontTextView9;
        this.staffDetailTvSoldLabel = dtacFontTextView10;
        this.staffDetailTvStaffName = dtacFontTextView11;
        this.staffDetailTvStv = dtacFontTextView12;
        this.staffDetailTvStvLabel = dtacFontTextView13;
        this.staffDetailTvTopup = dtacFontTextView14;
        this.staffDetailTvTopupLabel = dtacFontTextView15;
    }

    @NonNull
    public static FragmentStaffDetailBinding bind(@NonNull View view) {
        View findChildViewById;
        View findChildViewById2;
        View findChildViewById3;
        int i = R.id.horizontalScroll;
        HorizontalScrollView horizontalScrollView = (HorizontalScrollView) ViewBindings.findChildViewById(view, i);
        if (horizontalScrollView != null) {
            i = R.id.imagePermissionBox;
            GridLayout gridLayout = (GridLayout) ViewBindings.findChildViewById(view, i);
            if (gridLayout != null && (findChildViewById = ViewBindings.findChildViewById(view, (i = R.id.incManageStaff))) != null) {
                ZIncludeManageStaffBinding bind = ZIncludeManageStaffBinding.bind(findChildViewById);
                i = R.id.staff_detail_bt_delete_staff;
                DtacFontButton dtacFontButton = (DtacFontButton) ViewBindings.findChildViewById(view, i);
                if (dtacFontButton != null) {
                    i = R.id.staff_detail_card_view;
                    CardView cardView = (CardView) ViewBindings.findChildViewById(view, i);
                    if (cardView != null && (findChildViewById2 = ViewBindings.findChildViewById(view, (i = R.id.staff_detail_hr1))) != null && (findChildViewById3 = ViewBindings.findChildViewById(view, (i = R.id.staff_detail_hr2))) != null) {
                        i = R.id.staff_detail_ic_change_name;
                        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
                        if (imageView != null) {
                            i = R.id.staff_detail_title_layout;
                            RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, i);
                            if (relativeLayout != null) {
                                i = R.id.staff_detail_tv_created_date;
                                DtacFontTextView dtacFontTextView = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                                if (dtacFontTextView != null) {
                                    i = R.id.staff_detail_tv_created_date_label;
                                    DtacFontTextView dtacFontTextView2 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                                    if (dtacFontTextView2 != null) {
                                        i = R.id.staff_detail_tv_max_credit;
                                        DtacFontTextView dtacFontTextView3 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                                        if (dtacFontTextView3 != null) {
                                            i = R.id.staff_detail_tv_max_credit_label;
                                            DtacFontTextView dtacFontTextView4 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                                            if (dtacFontTextView4 != null) {
                                                i = R.id.staff_detail_tv_net_sold;
                                                DtacFontTextView dtacFontTextView5 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                                                if (dtacFontTextView5 != null) {
                                                    i = R.id.staff_detail_tv_net_sold_label;
                                                    DtacFontTextView dtacFontTextView6 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                                                    if (dtacFontTextView6 != null) {
                                                        i = R.id.staff_detail_tv_rectify;
                                                        DtacFontTextView dtacFontTextView7 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                                                        if (dtacFontTextView7 != null) {
                                                            i = R.id.staff_detail_tv_rectify_label;
                                                            DtacFontTextView dtacFontTextView8 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                                                            if (dtacFontTextView8 != null) {
                                                                i = R.id.staff_detail_tv_sold;
                                                                DtacFontTextView dtacFontTextView9 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                                                                if (dtacFontTextView9 != null) {
                                                                    i = R.id.staff_detail_tv_sold_label;
                                                                    DtacFontTextView dtacFontTextView10 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                                                                    if (dtacFontTextView10 != null) {
                                                                        i = R.id.staff_detail_tv_staff_name;
                                                                        DtacFontTextView dtacFontTextView11 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                                                                        if (dtacFontTextView11 != null) {
                                                                            i = R.id.staff_detail_tv_stv;
                                                                            DtacFontTextView dtacFontTextView12 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                                                                            if (dtacFontTextView12 != null) {
                                                                                i = R.id.staff_detail_tv_stv_label;
                                                                                DtacFontTextView dtacFontTextView13 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                                                                                if (dtacFontTextView13 != null) {
                                                                                    i = R.id.staff_detail_tv_topup;
                                                                                    DtacFontTextView dtacFontTextView14 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                                                                                    if (dtacFontTextView14 != null) {
                                                                                        i = R.id.staff_detail_tv_topup_label;
                                                                                        DtacFontTextView dtacFontTextView15 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                                                                                        if (dtacFontTextView15 != null) {
                                                                                            return new FragmentStaffDetailBinding((RelativeLayout) view, horizontalScrollView, gridLayout, bind, dtacFontButton, cardView, findChildViewById2, findChildViewById3, imageView, relativeLayout, dtacFontTextView, dtacFontTextView2, dtacFontTextView3, dtacFontTextView4, dtacFontTextView5, dtacFontTextView6, dtacFontTextView7, dtacFontTextView8, dtacFontTextView9, dtacFontTextView10, dtacFontTextView11, dtacFontTextView12, dtacFontTextView13, dtacFontTextView14, dtacFontTextView15);
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
    public static FragmentStaffDetailBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentStaffDetailBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_staff_detail, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public RelativeLayout getRoot() {
        return this.f84196a;
    }
}
