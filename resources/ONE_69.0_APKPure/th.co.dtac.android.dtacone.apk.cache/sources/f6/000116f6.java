package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.widget.loading.DtacSwipeRefresh;
import th.p047co.dtac.android.dtacone.widget.view.DtacFontButton;
import th.p047co.dtac.android.dtacone.widget.view.DtacFontTextView;
import th.p047co.dtac.android.dtacone.widget.view.DtacPhoneNumberEditText;
import th.p047co.dtac.android.dtacone.widget.view.DtacRecyclerView;

/* renamed from: th.co.dtac.android.dtacone.databinding.FragmentRectifyListBinding */
/* loaded from: classes7.dex */
public final class FragmentRectifyListBinding implements ViewBinding {

    /* renamed from: a */
    public final LinearLayout f84261a;
    @NonNull
    public final DtacFontTextView message;
    @NonNull
    public final DtacFontButton rectifyBtnSearch;
    @NonNull
    public final DtacPhoneNumberEditText rectifyEdtPhoneNumber;
    @NonNull
    public final DtacRecyclerView rectifyList;
    @NonNull
    public final LinearLayout rootLayout;
    @NonNull
    public final DtacSwipeRefresh swipeRefreshRectify;

    public FragmentRectifyListBinding(LinearLayout linearLayout, DtacFontTextView dtacFontTextView, DtacFontButton dtacFontButton, DtacPhoneNumberEditText dtacPhoneNumberEditText, DtacRecyclerView dtacRecyclerView, LinearLayout linearLayout2, DtacSwipeRefresh dtacSwipeRefresh) {
        this.f84261a = linearLayout;
        this.message = dtacFontTextView;
        this.rectifyBtnSearch = dtacFontButton;
        this.rectifyEdtPhoneNumber = dtacPhoneNumberEditText;
        this.rectifyList = dtacRecyclerView;
        this.rootLayout = linearLayout2;
        this.swipeRefreshRectify = dtacSwipeRefresh;
    }

    @NonNull
    public static FragmentRectifyListBinding bind(@NonNull View view) {
        int i = R.id.message;
        DtacFontTextView dtacFontTextView = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
        if (dtacFontTextView != null) {
            i = R.id.rectify_btn_search;
            DtacFontButton dtacFontButton = (DtacFontButton) ViewBindings.findChildViewById(view, i);
            if (dtacFontButton != null) {
                i = R.id.rectify_edt_phone_number;
                DtacPhoneNumberEditText dtacPhoneNumberEditText = (DtacPhoneNumberEditText) ViewBindings.findChildViewById(view, i);
                if (dtacPhoneNumberEditText != null) {
                    i = R.id.rectify_list;
                    DtacRecyclerView dtacRecyclerView = (DtacRecyclerView) ViewBindings.findChildViewById(view, i);
                    if (dtacRecyclerView != null) {
                        LinearLayout linearLayout = (LinearLayout) view;
                        i = R.id.swipeRefreshRectify;
                        DtacSwipeRefresh dtacSwipeRefresh = (DtacSwipeRefresh) ViewBindings.findChildViewById(view, i);
                        if (dtacSwipeRefresh != null) {
                            return new FragmentRectifyListBinding(linearLayout, dtacFontTextView, dtacFontButton, dtacPhoneNumberEditText, dtacRecyclerView, linearLayout, dtacSwipeRefresh);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static FragmentRectifyListBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentRectifyListBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_rectify_list, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayout getRoot() {
        return this.f84261a;
    }
}