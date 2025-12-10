package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.app_one.widget.OneFontTextView;
import th.p047co.dtac.android.dtacone.app_one.widget.loading.OneSwipeRefresh;

/* renamed from: th.co.dtac.android.dtacone.databinding.FragmentOnePre2postAll1PackageBinding */
/* loaded from: classes7.dex */
public final class FragmentOnePre2postAll1PackageBinding implements ViewBinding {

    /* renamed from: a */
    public final OneSwipeRefresh f84068a;
    @NonNull
    public final CardView cardViewTitle;
    @NonNull
    public final ConstraintLayout onePre2PostMainConstraintLayout;
    @NonNull
    public final OneSwipeRefresh swipeRefreshLayout;
    @NonNull
    public final OneFontTextView tvTitle;

    public FragmentOnePre2postAll1PackageBinding(OneSwipeRefresh oneSwipeRefresh, CardView cardView, ConstraintLayout constraintLayout, OneSwipeRefresh oneSwipeRefresh2, OneFontTextView oneFontTextView) {
        this.f84068a = oneSwipeRefresh;
        this.cardViewTitle = cardView;
        this.onePre2PostMainConstraintLayout = constraintLayout;
        this.swipeRefreshLayout = oneSwipeRefresh2;
        this.tvTitle = oneFontTextView;
    }

    @NonNull
    public static FragmentOnePre2postAll1PackageBinding bind(@NonNull View view) {
        int i = R.id.cardViewTitle;
        CardView cardView = (CardView) ViewBindings.findChildViewById(view, i);
        if (cardView != null) {
            i = R.id.onePre2PostMainConstraintLayout;
            ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
            if (constraintLayout != null) {
                OneSwipeRefresh oneSwipeRefresh = (OneSwipeRefresh) view;
                i = R.id.tvTitle;
                OneFontTextView oneFontTextView = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                if (oneFontTextView != null) {
                    return new FragmentOnePre2postAll1PackageBinding(oneSwipeRefresh, cardView, constraintLayout, oneSwipeRefresh, oneFontTextView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static FragmentOnePre2postAll1PackageBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentOnePre2postAll1PackageBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_one_pre2post_all1_package, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public OneSwipeRefresh getRoot() {
        return this.f84068a;
    }
}
