package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.core.widget.NestedScrollView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.app_one.widget.OneFontTextView;
import th.p047co.dtac.android.dtacone.app_one.widget.loading.OneSwipeRefresh;
import th.p047co.dtac.android.dtacone.widget.view.DtacRecyclerView;

/* renamed from: th.co.dtac.android.dtacone.databinding.FragmentOneStaffListBinding */
/* loaded from: classes7.dex */
public final class FragmentOneStaffListBinding implements ViewBinding {

    /* renamed from: a */
    public final NestedScrollView f84227a;
    @NonNull
    public final LinearLayoutCompat btnAddNewStaff;
    @NonNull
    public final AppCompatImageView ivAddNewStaff;
    @NonNull
    public final LinearLayout linearBox;
    @NonNull
    public final DtacRecyclerView rvStaffList;
    @NonNull
    public final View spacer;
    @NonNull
    public final OneSwipeRefresh swipeContainer;
    @NonNull
    public final OneFontTextView tvAddNewStaff;
    @NonNull
    public final OneFontTextView tvListStaff;
    @NonNull
    public final OneFontTextView tvListStaffNumber;
    @NonNull
    public final OneFontTextView tvListStaffNumberName;

    public FragmentOneStaffListBinding(NestedScrollView nestedScrollView, LinearLayoutCompat linearLayoutCompat, AppCompatImageView appCompatImageView, LinearLayout linearLayout, DtacRecyclerView dtacRecyclerView, View view, OneSwipeRefresh oneSwipeRefresh, OneFontTextView oneFontTextView, OneFontTextView oneFontTextView2, OneFontTextView oneFontTextView3, OneFontTextView oneFontTextView4) {
        this.f84227a = nestedScrollView;
        this.btnAddNewStaff = linearLayoutCompat;
        this.ivAddNewStaff = appCompatImageView;
        this.linearBox = linearLayout;
        this.rvStaffList = dtacRecyclerView;
        this.spacer = view;
        this.swipeContainer = oneSwipeRefresh;
        this.tvAddNewStaff = oneFontTextView;
        this.tvListStaff = oneFontTextView2;
        this.tvListStaffNumber = oneFontTextView3;
        this.tvListStaffNumberName = oneFontTextView4;
    }

    @NonNull
    public static FragmentOneStaffListBinding bind(@NonNull View view) {
        View findChildViewById;
        int i = R.id.btnAddNewStaff;
        LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i);
        if (linearLayoutCompat != null) {
            i = R.id.ivAddNewStaff;
            AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(view, i);
            if (appCompatImageView != null) {
                i = R.id.linearBox;
                LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i);
                if (linearLayout != null) {
                    i = R.id.rvStaffList;
                    DtacRecyclerView dtacRecyclerView = (DtacRecyclerView) ViewBindings.findChildViewById(view, i);
                    if (dtacRecyclerView != null && (findChildViewById = ViewBindings.findChildViewById(view, (i = R.id.spacer))) != null) {
                        i = R.id.swipeContainer;
                        OneSwipeRefresh oneSwipeRefresh = (OneSwipeRefresh) ViewBindings.findChildViewById(view, i);
                        if (oneSwipeRefresh != null) {
                            i = R.id.tvAddNewStaff;
                            OneFontTextView oneFontTextView = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                            if (oneFontTextView != null) {
                                i = R.id.tvListStaff;
                                OneFontTextView oneFontTextView2 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                if (oneFontTextView2 != null) {
                                    i = R.id.tvListStaffNumber;
                                    OneFontTextView oneFontTextView3 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                    if (oneFontTextView3 != null) {
                                        i = R.id.tvListStaffNumberName;
                                        OneFontTextView oneFontTextView4 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                        if (oneFontTextView4 != null) {
                                            return new FragmentOneStaffListBinding((NestedScrollView) view, linearLayoutCompat, appCompatImageView, linearLayout, dtacRecyclerView, findChildViewById, oneSwipeRefresh, oneFontTextView, oneFontTextView2, oneFontTextView3, oneFontTextView4);
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
    public static FragmentOneStaffListBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentOneStaffListBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_one_staff_list, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public NestedScrollView getRoot() {
        return this.f84227a;
    }
}