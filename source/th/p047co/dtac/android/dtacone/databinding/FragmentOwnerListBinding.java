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
import th.p047co.dtac.android.dtacone.widget.view.DtacFontTextView;
import th.p047co.dtac.android.dtacone.widget.view.DtacRecyclerView;

/* renamed from: th.co.dtac.android.dtacone.databinding.FragmentOwnerListBinding */
/* loaded from: classes7.dex */
public final class FragmentOwnerListBinding implements ViewBinding {

    /* renamed from: a */
    public final LinearLayout f84135a;
    @NonNull
    public final DtacRecyclerView inactivityUserList;
    @NonNull
    public final DtacSwipeRefresh swipeRefresh;
    @NonNull
    public final DtacFontTextView tvOwnerCount;

    public FragmentOwnerListBinding(LinearLayout linearLayout, DtacRecyclerView dtacRecyclerView, DtacSwipeRefresh dtacSwipeRefresh, DtacFontTextView dtacFontTextView) {
        this.f84135a = linearLayout;
        this.inactivityUserList = dtacRecyclerView;
        this.swipeRefresh = dtacSwipeRefresh;
        this.tvOwnerCount = dtacFontTextView;
    }

    @NonNull
    public static FragmentOwnerListBinding bind(@NonNull View view) {
        int i = R.id.inactivity_user_list;
        DtacRecyclerView dtacRecyclerView = (DtacRecyclerView) ViewBindings.findChildViewById(view, i);
        if (dtacRecyclerView != null) {
            i = R.id.swipeRefresh;
            DtacSwipeRefresh dtacSwipeRefresh = (DtacSwipeRefresh) ViewBindings.findChildViewById(view, i);
            if (dtacSwipeRefresh != null) {
                i = R.id.tvOwnerCount;
                DtacFontTextView dtacFontTextView = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                if (dtacFontTextView != null) {
                    return new FragmentOwnerListBinding((LinearLayout) view, dtacRecyclerView, dtacSwipeRefresh, dtacFontTextView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static FragmentOwnerListBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentOwnerListBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_owner_list, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayout getRoot() {
        return this.f84135a;
    }
}
