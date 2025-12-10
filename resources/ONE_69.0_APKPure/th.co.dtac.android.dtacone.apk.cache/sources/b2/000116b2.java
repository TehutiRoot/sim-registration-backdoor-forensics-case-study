package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.app_one.widget.OneFontTextView;

/* renamed from: th.co.dtac.android.dtacone.databinding.FragmentOneProfitReportDetailBinding */
/* loaded from: classes7.dex */
public final class FragmentOneProfitReportDetailBinding implements ViewBinding {

    /* renamed from: a */
    public final NestedScrollView f84193a;
    @NonNull
    public final OneFontTextView dtacFontTextView7;
    @NonNull
    public final OneFontTextView dtacFontTextView8;
    @NonNull
    public final OneFontTextView dtacFontTextView9;
    @NonNull
    public final ImageView imageView8;
    @NonNull
    public final ImageView imageView9;
    @NonNull
    public final LinearLayout linearLayout3;
    @NonNull
    public final NestedScrollView nestedScrollView;
    @NonNull
    public final RecyclerView profitDetailRecyclerView;
    @NonNull
    public final OneFontTextView profitDetailTitleTextView;
    @NonNull
    public final OneFontTextView profitDetailTotalProfitTextView;
    @NonNull
    public final OneFontTextView tvMonthly;
    @NonNull
    public final View viewBg;
    @NonNull
    public final View viewBg2;

    public FragmentOneProfitReportDetailBinding(NestedScrollView nestedScrollView, OneFontTextView oneFontTextView, OneFontTextView oneFontTextView2, OneFontTextView oneFontTextView3, ImageView imageView, ImageView imageView2, LinearLayout linearLayout, NestedScrollView nestedScrollView2, RecyclerView recyclerView, OneFontTextView oneFontTextView4, OneFontTextView oneFontTextView5, OneFontTextView oneFontTextView6, View view, View view2) {
        this.f84193a = nestedScrollView;
        this.dtacFontTextView7 = oneFontTextView;
        this.dtacFontTextView8 = oneFontTextView2;
        this.dtacFontTextView9 = oneFontTextView3;
        this.imageView8 = imageView;
        this.imageView9 = imageView2;
        this.linearLayout3 = linearLayout;
        this.nestedScrollView = nestedScrollView2;
        this.profitDetailRecyclerView = recyclerView;
        this.profitDetailTitleTextView = oneFontTextView4;
        this.profitDetailTotalProfitTextView = oneFontTextView5;
        this.tvMonthly = oneFontTextView6;
        this.viewBg = view;
        this.viewBg2 = view2;
    }

    @NonNull
    public static FragmentOneProfitReportDetailBinding bind(@NonNull View view) {
        View findChildViewById;
        View findChildViewById2;
        int i = R.id.dtacFontTextView7;
        OneFontTextView oneFontTextView = (OneFontTextView) ViewBindings.findChildViewById(view, i);
        if (oneFontTextView != null) {
            i = R.id.dtacFontTextView8;
            OneFontTextView oneFontTextView2 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
            if (oneFontTextView2 != null) {
                i = R.id.dtacFontTextView9;
                OneFontTextView oneFontTextView3 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                if (oneFontTextView3 != null) {
                    i = R.id.imageView8;
                    ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
                    if (imageView != null) {
                        i = R.id.imageView9;
                        ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, i);
                        if (imageView2 != null) {
                            i = R.id.linearLayout3;
                            LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i);
                            if (linearLayout != null) {
                                NestedScrollView nestedScrollView = (NestedScrollView) view;
                                i = R.id.profitDetailRecyclerView;
                                RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
                                if (recyclerView != null) {
                                    i = R.id.profitDetailTitleTextView;
                                    OneFontTextView oneFontTextView4 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                    if (oneFontTextView4 != null) {
                                        i = R.id.profitDetailTotalProfitTextView;
                                        OneFontTextView oneFontTextView5 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                        if (oneFontTextView5 != null) {
                                            i = R.id.tvMonthly;
                                            OneFontTextView oneFontTextView6 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                            if (oneFontTextView6 != null && (findChildViewById = ViewBindings.findChildViewById(view, (i = R.id.viewBg))) != null && (findChildViewById2 = ViewBindings.findChildViewById(view, (i = R.id.viewBg2))) != null) {
                                                return new FragmentOneProfitReportDetailBinding(nestedScrollView, oneFontTextView, oneFontTextView2, oneFontTextView3, imageView, imageView2, linearLayout, nestedScrollView, recyclerView, oneFontTextView4, oneFontTextView5, oneFontTextView6, findChildViewById, findChildViewById2);
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
    public static FragmentOneProfitReportDetailBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentOneProfitReportDetailBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_one_profit_report_detail, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public NestedScrollView getRoot() {
        return this.f84193a;
    }
}