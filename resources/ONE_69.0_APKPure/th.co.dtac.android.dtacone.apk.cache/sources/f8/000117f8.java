package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.facebook.shimmer.ShimmerFrameLayout;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.widget.TextViewTopLabelView;
import th.p047co.dtac.android.dtacone.widget.view.DtacFontButton;
import th.p047co.dtac.android.dtacone.widget.view.DtacFontTextView;

/* renamed from: th.co.dtac.android.dtacone.databinding.LayoutPostInfoAnalyticContentBinding */
/* loaded from: classes7.dex */
public final class LayoutPostInfoAnalyticContentBinding implements ViewBinding {

    /* renamed from: a */
    public final LinearLayout f84519a;
    @NonNull
    public final DtacFontTextView behaviorLabel;
    @NonNull
    public final LinearLayout bgNoPackage;
    @NonNull
    public final LinearLayout bgNoPackageDownsell;
    @NonNull
    public final DtacFontButton buttonViewAll;
    @NonNull
    public final ImageView imageViewArpu;
    @NonNull
    public final LinearLayout infoAnalyticContent;
    @NonNull
    public final ConstraintLayout layoutDownsellMessage;
    @NonNull
    public final LinearLayout layoutPackage;
    @NonNull
    public final LinearLayout layoutPackageDownsell;
    @NonNull
    public final LinearLayout layoutRefillARPUUsage;
    @NonNull
    public final LinearLayout layoutUsageContent;
    @NonNull
    public final LinearLayout layoutVoiceInternetUsage;
    @NonNull
    public final View lineHeader;
    @NonNull
    public final DtacFontTextView packageDownsellLabel;
    @NonNull
    public final RecyclerView packageDownsellListView;
    @NonNull
    public final DtacFontTextView packageLabel;
    @NonNull
    public final RecyclerView packageListView;
    @NonNull
    public final ShimmerFrameLayout shimmerFirstUsage;
    @NonNull
    public final ShimmerFrameLayout shimmerPackage;
    @NonNull
    public final ShimmerFrameLayout shimmerPackageDownsell;
    @NonNull
    public final ShimmerFrameLayout shimmerSecondUsage;
    @NonNull
    public final ShimmerFrameLayout shimmerUsageBehavior;
    @NonNull
    public final TextViewTopLabelView textViewARPU;
    @NonNull
    public final DtacFontTextView textViewBehaviorUsage;
    @NonNull
    public final DtacFontTextView textViewDownsellMessage;
    @NonNull
    public final TextViewTopLabelView textViewInternet;
    @NonNull
    public final DtacFontTextView textViewNoPackage;
    @NonNull
    public final DtacFontTextView textViewNoPackageDownsell;
    @NonNull
    public final TextViewTopLabelView textViewVoiceCall;
    @NonNull
    public final DtacFontTextView usageInfoLabel;

    public LayoutPostInfoAnalyticContentBinding(LinearLayout linearLayout, DtacFontTextView dtacFontTextView, LinearLayout linearLayout2, LinearLayout linearLayout3, DtacFontButton dtacFontButton, ImageView imageView, LinearLayout linearLayout4, ConstraintLayout constraintLayout, LinearLayout linearLayout5, LinearLayout linearLayout6, LinearLayout linearLayout7, LinearLayout linearLayout8, LinearLayout linearLayout9, View view, DtacFontTextView dtacFontTextView2, RecyclerView recyclerView, DtacFontTextView dtacFontTextView3, RecyclerView recyclerView2, ShimmerFrameLayout shimmerFrameLayout, ShimmerFrameLayout shimmerFrameLayout2, ShimmerFrameLayout shimmerFrameLayout3, ShimmerFrameLayout shimmerFrameLayout4, ShimmerFrameLayout shimmerFrameLayout5, TextViewTopLabelView textViewTopLabelView, DtacFontTextView dtacFontTextView4, DtacFontTextView dtacFontTextView5, TextViewTopLabelView textViewTopLabelView2, DtacFontTextView dtacFontTextView6, DtacFontTextView dtacFontTextView7, TextViewTopLabelView textViewTopLabelView3, DtacFontTextView dtacFontTextView8) {
        this.f84519a = linearLayout;
        this.behaviorLabel = dtacFontTextView;
        this.bgNoPackage = linearLayout2;
        this.bgNoPackageDownsell = linearLayout3;
        this.buttonViewAll = dtacFontButton;
        this.imageViewArpu = imageView;
        this.infoAnalyticContent = linearLayout4;
        this.layoutDownsellMessage = constraintLayout;
        this.layoutPackage = linearLayout5;
        this.layoutPackageDownsell = linearLayout6;
        this.layoutRefillARPUUsage = linearLayout7;
        this.layoutUsageContent = linearLayout8;
        this.layoutVoiceInternetUsage = linearLayout9;
        this.lineHeader = view;
        this.packageDownsellLabel = dtacFontTextView2;
        this.packageDownsellListView = recyclerView;
        this.packageLabel = dtacFontTextView3;
        this.packageListView = recyclerView2;
        this.shimmerFirstUsage = shimmerFrameLayout;
        this.shimmerPackage = shimmerFrameLayout2;
        this.shimmerPackageDownsell = shimmerFrameLayout3;
        this.shimmerSecondUsage = shimmerFrameLayout4;
        this.shimmerUsageBehavior = shimmerFrameLayout5;
        this.textViewARPU = textViewTopLabelView;
        this.textViewBehaviorUsage = dtacFontTextView4;
        this.textViewDownsellMessage = dtacFontTextView5;
        this.textViewInternet = textViewTopLabelView2;
        this.textViewNoPackage = dtacFontTextView6;
        this.textViewNoPackageDownsell = dtacFontTextView7;
        this.textViewVoiceCall = textViewTopLabelView3;
        this.usageInfoLabel = dtacFontTextView8;
    }

    @NonNull
    public static LayoutPostInfoAnalyticContentBinding bind(@NonNull View view) {
        View findChildViewById;
        int i = R.id.behaviorLabel;
        DtacFontTextView dtacFontTextView = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
        if (dtacFontTextView != null) {
            i = R.id.bgNoPackage;
            LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i);
            if (linearLayout != null) {
                i = R.id.bgNoPackageDownsell;
                LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(view, i);
                if (linearLayout2 != null) {
                    i = R.id.buttonViewAll;
                    DtacFontButton dtacFontButton = (DtacFontButton) ViewBindings.findChildViewById(view, i);
                    if (dtacFontButton != null) {
                        i = R.id.imageViewArpu;
                        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
                        if (imageView != null) {
                            LinearLayout linearLayout3 = (LinearLayout) view;
                            i = R.id.layoutDownsellMessage;
                            ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
                            if (constraintLayout != null) {
                                i = R.id.layoutPackage;
                                LinearLayout linearLayout4 = (LinearLayout) ViewBindings.findChildViewById(view, i);
                                if (linearLayout4 != null) {
                                    i = R.id.layoutPackageDownsell;
                                    LinearLayout linearLayout5 = (LinearLayout) ViewBindings.findChildViewById(view, i);
                                    if (linearLayout5 != null) {
                                        i = R.id.layoutRefillARPUUsage;
                                        LinearLayout linearLayout6 = (LinearLayout) ViewBindings.findChildViewById(view, i);
                                        if (linearLayout6 != null) {
                                            i = R.id.layoutUsageContent;
                                            LinearLayout linearLayout7 = (LinearLayout) ViewBindings.findChildViewById(view, i);
                                            if (linearLayout7 != null) {
                                                i = R.id.layoutVoiceInternetUsage;
                                                LinearLayout linearLayout8 = (LinearLayout) ViewBindings.findChildViewById(view, i);
                                                if (linearLayout8 != null && (findChildViewById = ViewBindings.findChildViewById(view, (i = R.id.lineHeader))) != null) {
                                                    i = R.id.packageDownsellLabel;
                                                    DtacFontTextView dtacFontTextView2 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                                                    if (dtacFontTextView2 != null) {
                                                        i = R.id.packageDownsellListView;
                                                        RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
                                                        if (recyclerView != null) {
                                                            i = R.id.packageLabel;
                                                            DtacFontTextView dtacFontTextView3 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                                                            if (dtacFontTextView3 != null) {
                                                                i = R.id.packageListView;
                                                                RecyclerView recyclerView2 = (RecyclerView) ViewBindings.findChildViewById(view, i);
                                                                if (recyclerView2 != null) {
                                                                    i = R.id.shimmerFirstUsage;
                                                                    ShimmerFrameLayout shimmerFrameLayout = (ShimmerFrameLayout) ViewBindings.findChildViewById(view, i);
                                                                    if (shimmerFrameLayout != null) {
                                                                        i = R.id.shimmerPackage;
                                                                        ShimmerFrameLayout shimmerFrameLayout2 = (ShimmerFrameLayout) ViewBindings.findChildViewById(view, i);
                                                                        if (shimmerFrameLayout2 != null) {
                                                                            i = R.id.shimmerPackageDownsell;
                                                                            ShimmerFrameLayout shimmerFrameLayout3 = (ShimmerFrameLayout) ViewBindings.findChildViewById(view, i);
                                                                            if (shimmerFrameLayout3 != null) {
                                                                                i = R.id.shimmerSecondUsage;
                                                                                ShimmerFrameLayout shimmerFrameLayout4 = (ShimmerFrameLayout) ViewBindings.findChildViewById(view, i);
                                                                                if (shimmerFrameLayout4 != null) {
                                                                                    i = R.id.shimmerUsageBehavior;
                                                                                    ShimmerFrameLayout shimmerFrameLayout5 = (ShimmerFrameLayout) ViewBindings.findChildViewById(view, i);
                                                                                    if (shimmerFrameLayout5 != null) {
                                                                                        i = R.id.textViewARPU;
                                                                                        TextViewTopLabelView textViewTopLabelView = (TextViewTopLabelView) ViewBindings.findChildViewById(view, i);
                                                                                        if (textViewTopLabelView != null) {
                                                                                            i = R.id.textViewBehaviorUsage;
                                                                                            DtacFontTextView dtacFontTextView4 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                                                                                            if (dtacFontTextView4 != null) {
                                                                                                i = R.id.textViewDownsellMessage;
                                                                                                DtacFontTextView dtacFontTextView5 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                                                                                                if (dtacFontTextView5 != null) {
                                                                                                    i = R.id.textViewInternet;
                                                                                                    TextViewTopLabelView textViewTopLabelView2 = (TextViewTopLabelView) ViewBindings.findChildViewById(view, i);
                                                                                                    if (textViewTopLabelView2 != null) {
                                                                                                        i = R.id.textViewNoPackage;
                                                                                                        DtacFontTextView dtacFontTextView6 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                                                                                                        if (dtacFontTextView6 != null) {
                                                                                                            i = R.id.textViewNoPackageDownsell;
                                                                                                            DtacFontTextView dtacFontTextView7 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                                                                                                            if (dtacFontTextView7 != null) {
                                                                                                                i = R.id.textViewVoiceCall;
                                                                                                                TextViewTopLabelView textViewTopLabelView3 = (TextViewTopLabelView) ViewBindings.findChildViewById(view, i);
                                                                                                                if (textViewTopLabelView3 != null) {
                                                                                                                    i = R.id.usageInfoLabel;
                                                                                                                    DtacFontTextView dtacFontTextView8 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                                                                                                                    if (dtacFontTextView8 != null) {
                                                                                                                        return new LayoutPostInfoAnalyticContentBinding(linearLayout3, dtacFontTextView, linearLayout, linearLayout2, dtacFontButton, imageView, linearLayout3, constraintLayout, linearLayout4, linearLayout5, linearLayout6, linearLayout7, linearLayout8, findChildViewById, dtacFontTextView2, recyclerView, dtacFontTextView3, recyclerView2, shimmerFrameLayout, shimmerFrameLayout2, shimmerFrameLayout3, shimmerFrameLayout4, shimmerFrameLayout5, textViewTopLabelView, dtacFontTextView4, dtacFontTextView5, textViewTopLabelView2, dtacFontTextView6, dtacFontTextView7, textViewTopLabelView3, dtacFontTextView8);
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
    public static LayoutPostInfoAnalyticContentBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static LayoutPostInfoAnalyticContentBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.layout_post_info_analytic_content, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayout getRoot() {
        return this.f84519a;
    }
}