package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.widget.loading.DtacSwipeRefresh;
import th.p047co.dtac.android.dtacone.widget.view.DtacFontButton;
import th.p047co.dtac.android.dtacone.widget.view.DtacFontTextView;

/* renamed from: th.co.dtac.android.dtacone.databinding.FragmentStaffListBinding */
/* loaded from: classes7.dex */
public final class FragmentStaffListBinding implements ViewBinding {

    /* renamed from: a */
    public final NestedScrollView f84301a;
    @NonNull
    public final RecyclerView rvStaffListRecycler;
    @NonNull
    public final FrameLayout staffAddBox;
    @NonNull
    public final DtacFontButton staffBtnAdd;
    @NonNull
    public final DtacFontTextView staffTvStaffAmount;
    @NonNull
    public final DtacSwipeRefresh swipeRefresh;

    public FragmentStaffListBinding(NestedScrollView nestedScrollView, RecyclerView recyclerView, FrameLayout frameLayout, DtacFontButton dtacFontButton, DtacFontTextView dtacFontTextView, DtacSwipeRefresh dtacSwipeRefresh) {
        this.f84301a = nestedScrollView;
        this.rvStaffListRecycler = recyclerView;
        this.staffAddBox = frameLayout;
        this.staffBtnAdd = dtacFontButton;
        this.staffTvStaffAmount = dtacFontTextView;
        this.swipeRefresh = dtacSwipeRefresh;
    }

    @NonNull
    public static FragmentStaffListBinding bind(@NonNull View view) {
        int i = R.id.rvStaffListRecycler;
        RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
        if (recyclerView != null) {
            i = R.id.staff_add_box;
            FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, i);
            if (frameLayout != null) {
                i = R.id.staff_btn_add;
                DtacFontButton dtacFontButton = (DtacFontButton) ViewBindings.findChildViewById(view, i);
                if (dtacFontButton != null) {
                    i = R.id.staff_tv_staff_amount;
                    DtacFontTextView dtacFontTextView = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                    if (dtacFontTextView != null) {
                        i = R.id.swipeRefresh;
                        DtacSwipeRefresh dtacSwipeRefresh = (DtacSwipeRefresh) ViewBindings.findChildViewById(view, i);
                        if (dtacSwipeRefresh != null) {
                            return new FragmentStaffListBinding((NestedScrollView) view, recyclerView, frameLayout, dtacFontButton, dtacFontTextView, dtacSwipeRefresh);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static FragmentStaffListBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentStaffListBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_staff_list, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public NestedScrollView getRoot() {
        return this.f84301a;
    }
}