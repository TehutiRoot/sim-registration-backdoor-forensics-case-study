package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.widget.view.DtacClearableEditText;
import th.p047co.dtac.android.dtacone.widget.view.DtacFontTextView;

/* renamed from: th.co.dtac.android.dtacone.databinding.FragmentChangePackSearchBinding */
/* loaded from: classes7.dex */
public final class FragmentChangePackSearchBinding implements ViewBinding {

    /* renamed from: a */
    public final CoordinatorLayout f83766a;
    @NonNull
    public final ConstraintLayout contentLayout;
    @NonNull
    public final BottomSheetFeeBinding incFee;
    @NonNull
    public final DtacFontTextView noData;
    @NonNull
    public final RecyclerView packageInfo;
    @NonNull
    public final DtacClearableEditText searchView;
    @NonNull
    public final DtacFontTextView textView2;
    @NonNull
    public final View transparentView;
    @NonNull
    public final DtacFontTextView warningMessage;

    public FragmentChangePackSearchBinding(CoordinatorLayout coordinatorLayout, ConstraintLayout constraintLayout, BottomSheetFeeBinding bottomSheetFeeBinding, DtacFontTextView dtacFontTextView, RecyclerView recyclerView, DtacClearableEditText dtacClearableEditText, DtacFontTextView dtacFontTextView2, View view, DtacFontTextView dtacFontTextView3) {
        this.f83766a = coordinatorLayout;
        this.contentLayout = constraintLayout;
        this.incFee = bottomSheetFeeBinding;
        this.noData = dtacFontTextView;
        this.packageInfo = recyclerView;
        this.searchView = dtacClearableEditText;
        this.textView2 = dtacFontTextView2;
        this.transparentView = view;
        this.warningMessage = dtacFontTextView3;
    }

    @NonNull
    public static FragmentChangePackSearchBinding bind(@NonNull View view) {
        View findChildViewById;
        View findChildViewById2;
        int i = R.id.contentLayout;
        ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
        if (constraintLayout != null && (findChildViewById = ViewBindings.findChildViewById(view, (i = R.id.incFee))) != null) {
            BottomSheetFeeBinding bind = BottomSheetFeeBinding.bind(findChildViewById);
            i = R.id.noData;
            DtacFontTextView dtacFontTextView = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
            if (dtacFontTextView != null) {
                i = R.id.packageInfo;
                RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
                if (recyclerView != null) {
                    i = R.id.searchView;
                    DtacClearableEditText dtacClearableEditText = (DtacClearableEditText) ViewBindings.findChildViewById(view, i);
                    if (dtacClearableEditText != null) {
                        i = R.id.textView2;
                        DtacFontTextView dtacFontTextView2 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                        if (dtacFontTextView2 != null && (findChildViewById2 = ViewBindings.findChildViewById(view, (i = R.id.transparentView))) != null) {
                            i = R.id.warningMessage;
                            DtacFontTextView dtacFontTextView3 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                            if (dtacFontTextView3 != null) {
                                return new FragmentChangePackSearchBinding((CoordinatorLayout) view, constraintLayout, bind, dtacFontTextView, recyclerView, dtacClearableEditText, dtacFontTextView2, findChildViewById2, dtacFontTextView3);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static FragmentChangePackSearchBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentChangePackSearchBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_change_pack_search, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public CoordinatorLayout getRoot() {
        return this.f83766a;
    }
}