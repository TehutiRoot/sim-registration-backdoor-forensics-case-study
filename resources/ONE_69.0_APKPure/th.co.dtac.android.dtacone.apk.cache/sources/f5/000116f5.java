package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.widget.loading.DtacSwipeRefresh;
import th.p047co.dtac.android.dtacone.widget.view.DtacFontTextView;
import th.p047co.dtac.android.dtacone.widget.view.DtacRecyclerView;

/* renamed from: th.co.dtac.android.dtacone.databinding.FragmentRectifyDetailSearchBinding */
/* loaded from: classes7.dex */
public final class FragmentRectifyDetailSearchBinding implements ViewBinding {

    /* renamed from: a */
    public final RelativeLayout f84260a;
    @NonNull
    public final DtacFontTextView message;
    @NonNull
    public final LinearLayout phoneNumberBox;
    @NonNull
    public final DtacRecyclerView rectifyList;
    @NonNull
    public final RelativeLayout rootLayout;
    @NonNull
    public final DtacSwipeRefresh swipeRefreshRectify;
    @NonNull
    public final DtacFontTextView tvResultPhoneNumber;

    public FragmentRectifyDetailSearchBinding(RelativeLayout relativeLayout, DtacFontTextView dtacFontTextView, LinearLayout linearLayout, DtacRecyclerView dtacRecyclerView, RelativeLayout relativeLayout2, DtacSwipeRefresh dtacSwipeRefresh, DtacFontTextView dtacFontTextView2) {
        this.f84260a = relativeLayout;
        this.message = dtacFontTextView;
        this.phoneNumberBox = linearLayout;
        this.rectifyList = dtacRecyclerView;
        this.rootLayout = relativeLayout2;
        this.swipeRefreshRectify = dtacSwipeRefresh;
        this.tvResultPhoneNumber = dtacFontTextView2;
    }

    @NonNull
    public static FragmentRectifyDetailSearchBinding bind(@NonNull View view) {
        int i = R.id.message;
        DtacFontTextView dtacFontTextView = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
        if (dtacFontTextView != null) {
            i = R.id.phoneNumberBox;
            LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i);
            if (linearLayout != null) {
                i = R.id.rectify_list;
                DtacRecyclerView dtacRecyclerView = (DtacRecyclerView) ViewBindings.findChildViewById(view, i);
                if (dtacRecyclerView != null) {
                    RelativeLayout relativeLayout = (RelativeLayout) view;
                    i = R.id.swipeRefreshRectify;
                    DtacSwipeRefresh dtacSwipeRefresh = (DtacSwipeRefresh) ViewBindings.findChildViewById(view, i);
                    if (dtacSwipeRefresh != null) {
                        i = R.id.tvResultPhoneNumber;
                        DtacFontTextView dtacFontTextView2 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                        if (dtacFontTextView2 != null) {
                            return new FragmentRectifyDetailSearchBinding(relativeLayout, dtacFontTextView, linearLayout, dtacRecyclerView, relativeLayout, dtacSwipeRefresh, dtacFontTextView2);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static FragmentRectifyDetailSearchBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentRectifyDetailSearchBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_rectify_detail_search, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public RelativeLayout getRoot() {
        return this.f84260a;
    }
}