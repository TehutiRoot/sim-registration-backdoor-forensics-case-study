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
import th.p047co.dtac.android.dtacone.widget.view.DtacFontTextView;

/* renamed from: th.co.dtac.android.dtacone.databinding.FragmentRtrProfitReportDetailBinding */
/* loaded from: classes7.dex */
public final class FragmentRtrProfitReportDetailBinding implements ViewBinding {

    /* renamed from: a */
    public final NestedScrollView f84186a;
    @NonNull
    public final DtacFontTextView dtacFontTextView7;
    @NonNull
    public final DtacFontTextView dtacFontTextView8;
    @NonNull
    public final DtacFontTextView dtacFontTextView9;
    @NonNull
    public final ImageView imageView8;
    @NonNull
    public final ImageView imageView9;
    @NonNull
    public final LinearLayout linearLayout3;
    @NonNull
    public final NestedScrollView nestedScrollView;
    @NonNull
    public final RecyclerView rvDetail;
    @NonNull
    public final DtacFontTextView tvMonthly;
    @NonNull
    public final DtacFontTextView tvSummary;
    @NonNull
    public final DtacFontTextView tvTitle;
    @NonNull
    public final View view;

    public FragmentRtrProfitReportDetailBinding(NestedScrollView nestedScrollView, DtacFontTextView dtacFontTextView, DtacFontTextView dtacFontTextView2, DtacFontTextView dtacFontTextView3, ImageView imageView, ImageView imageView2, LinearLayout linearLayout, NestedScrollView nestedScrollView2, RecyclerView recyclerView, DtacFontTextView dtacFontTextView4, DtacFontTextView dtacFontTextView5, DtacFontTextView dtacFontTextView6, View view) {
        this.f84186a = nestedScrollView;
        this.dtacFontTextView7 = dtacFontTextView;
        this.dtacFontTextView8 = dtacFontTextView2;
        this.dtacFontTextView9 = dtacFontTextView3;
        this.imageView8 = imageView;
        this.imageView9 = imageView2;
        this.linearLayout3 = linearLayout;
        this.nestedScrollView = nestedScrollView2;
        this.rvDetail = recyclerView;
        this.tvMonthly = dtacFontTextView4;
        this.tvSummary = dtacFontTextView5;
        this.tvTitle = dtacFontTextView6;
        this.view = view;
    }

    @NonNull
    public static FragmentRtrProfitReportDetailBinding bind(@NonNull View view) {
        View findChildViewById;
        int i = R.id.dtacFontTextView7;
        DtacFontTextView dtacFontTextView = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
        if (dtacFontTextView != null) {
            i = R.id.dtacFontTextView8;
            DtacFontTextView dtacFontTextView2 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
            if (dtacFontTextView2 != null) {
                i = R.id.dtacFontTextView9;
                DtacFontTextView dtacFontTextView3 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                if (dtacFontTextView3 != null) {
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
                                i = R.id.rvDetail;
                                RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
                                if (recyclerView != null) {
                                    i = R.id.tvMonthly;
                                    DtacFontTextView dtacFontTextView4 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                                    if (dtacFontTextView4 != null) {
                                        i = R.id.tvSummary;
                                        DtacFontTextView dtacFontTextView5 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                                        if (dtacFontTextView5 != null) {
                                            i = R.id.tvTitle;
                                            DtacFontTextView dtacFontTextView6 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                                            if (dtacFontTextView6 != null && (findChildViewById = ViewBindings.findChildViewById(view, (i = R.id.view))) != null) {
                                                return new FragmentRtrProfitReportDetailBinding(nestedScrollView, dtacFontTextView, dtacFontTextView2, dtacFontTextView3, imageView, imageView2, linearLayout, nestedScrollView, recyclerView, dtacFontTextView4, dtacFontTextView5, dtacFontTextView6, findChildViewById);
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
    public static FragmentRtrProfitReportDetailBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentRtrProfitReportDetailBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_rtr_profit_report_detail, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public NestedScrollView getRoot() {
        return this.f84186a;
    }
}
