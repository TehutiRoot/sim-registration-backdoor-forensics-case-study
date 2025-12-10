package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.facebook.shimmer.ShimmerFrameLayout;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.widget.view.DtacFontButton;
import th.p047co.dtac.android.dtacone.widget.view.DtacFontTextView;
import th.p047co.dtac.android.dtacone.widget.view.TextViewTopLabelView;

/* renamed from: th.co.dtac.android.dtacone.databinding.LayoutPreInfoAnalyticContentBinding */
/* loaded from: classes7.dex */
public final class LayoutPreInfoAnalyticContentBinding implements ViewBinding {

    /* renamed from: a */
    public final LinearLayout f84520a;
    @NonNull
    public final DtacFontTextView behaviorLabel;
    @NonNull
    public final ImageView bell;
    @NonNull
    public final LinearLayout bgNoPackage;
    @NonNull
    public final LinearLayout bgNoUpsellPackage;
    @NonNull
    public final DtacFontButton buttonViewAll;
    @NonNull
    public final ImageView imageViewArpu;
    @NonNull
    public final ImageView imageViewInternet;
    @NonNull
    public final ImageView imageViewRefill;
    @NonNull
    public final ImageView imageViewVoice;
    @NonNull
    public final LinearLayout infoAnalyticContent;
    @NonNull
    public final LinearLayout layoutPackage;
    @NonNull
    public final LinearLayout layoutRefillARPUUsage;
    @NonNull
    public final LinearLayout layoutUpsellPackage;
    @NonNull
    public final RelativeLayout layoutUsageContent;
    @NonNull
    public final LinearLayout layoutVoiceInternetUsage;
    @NonNull
    public final View lineHeader;
    @NonNull
    public final DtacFontTextView packageLabel;
    @NonNull
    public final RecyclerView packageListView;
    @NonNull
    public final RecyclerView packageUpsellListView;
    @NonNull
    public final LinearLayout recommendLayout;
    @NonNull
    public final ShimmerFrameLayout shimmerFirstUsage;
    @NonNull
    public final ShimmerFrameLayout shimmerPackage;
    @NonNull
    public final ShimmerFrameLayout shimmerRecommend;
    @NonNull
    public final LinearLayout shimmerRecommendLayout;
    @NonNull
    public final ShimmerFrameLayout shimmerSecondUsage;
    @NonNull
    public final ShimmerFrameLayout shimmerUpsellPackage;
    @NonNull
    public final ShimmerFrameLayout shimmerUsageBehavior;
    @NonNull
    public final TextViewTopLabelView textViewARPU;
    @NonNull
    public final TextViewTopLabelView textViewBehavior;
    @NonNull
    public final DtacFontTextView textViewBehaviorUsage;
    @NonNull
    public final TextViewTopLabelView textViewInternet;
    @NonNull
    public final DtacFontTextView textViewNoPackage;
    @NonNull
    public final DtacFontTextView textViewNoUpsellPackage;
    @NonNull
    public final TextViewTopLabelView textViewRefillAmount;
    @NonNull
    public final TextViewTopLabelView textViewVoiceCall;
    @NonNull
    public final DtacFontTextView upsellPackageLabel;
    @NonNull
    public final DtacFontTextView usageInfoLabel;

    public LayoutPreInfoAnalyticContentBinding(LinearLayout linearLayout, DtacFontTextView dtacFontTextView, ImageView imageView, LinearLayout linearLayout2, LinearLayout linearLayout3, DtacFontButton dtacFontButton, ImageView imageView2, ImageView imageView3, ImageView imageView4, ImageView imageView5, LinearLayout linearLayout4, LinearLayout linearLayout5, LinearLayout linearLayout6, LinearLayout linearLayout7, RelativeLayout relativeLayout, LinearLayout linearLayout8, View view, DtacFontTextView dtacFontTextView2, RecyclerView recyclerView, RecyclerView recyclerView2, LinearLayout linearLayout9, ShimmerFrameLayout shimmerFrameLayout, ShimmerFrameLayout shimmerFrameLayout2, ShimmerFrameLayout shimmerFrameLayout3, LinearLayout linearLayout10, ShimmerFrameLayout shimmerFrameLayout4, ShimmerFrameLayout shimmerFrameLayout5, ShimmerFrameLayout shimmerFrameLayout6, TextViewTopLabelView textViewTopLabelView, TextViewTopLabelView textViewTopLabelView2, DtacFontTextView dtacFontTextView3, TextViewTopLabelView textViewTopLabelView3, DtacFontTextView dtacFontTextView4, DtacFontTextView dtacFontTextView5, TextViewTopLabelView textViewTopLabelView4, TextViewTopLabelView textViewTopLabelView5, DtacFontTextView dtacFontTextView6, DtacFontTextView dtacFontTextView7) {
        this.f84520a = linearLayout;
        this.behaviorLabel = dtacFontTextView;
        this.bell = imageView;
        this.bgNoPackage = linearLayout2;
        this.bgNoUpsellPackage = linearLayout3;
        this.buttonViewAll = dtacFontButton;
        this.imageViewArpu = imageView2;
        this.imageViewInternet = imageView3;
        this.imageViewRefill = imageView4;
        this.imageViewVoice = imageView5;
        this.infoAnalyticContent = linearLayout4;
        this.layoutPackage = linearLayout5;
        this.layoutRefillARPUUsage = linearLayout6;
        this.layoutUpsellPackage = linearLayout7;
        this.layoutUsageContent = relativeLayout;
        this.layoutVoiceInternetUsage = linearLayout8;
        this.lineHeader = view;
        this.packageLabel = dtacFontTextView2;
        this.packageListView = recyclerView;
        this.packageUpsellListView = recyclerView2;
        this.recommendLayout = linearLayout9;
        this.shimmerFirstUsage = shimmerFrameLayout;
        this.shimmerPackage = shimmerFrameLayout2;
        this.shimmerRecommend = shimmerFrameLayout3;
        this.shimmerRecommendLayout = linearLayout10;
        this.shimmerSecondUsage = shimmerFrameLayout4;
        this.shimmerUpsellPackage = shimmerFrameLayout5;
        this.shimmerUsageBehavior = shimmerFrameLayout6;
        this.textViewARPU = textViewTopLabelView;
        this.textViewBehavior = textViewTopLabelView2;
        this.textViewBehaviorUsage = dtacFontTextView3;
        this.textViewInternet = textViewTopLabelView3;
        this.textViewNoPackage = dtacFontTextView4;
        this.textViewNoUpsellPackage = dtacFontTextView5;
        this.textViewRefillAmount = textViewTopLabelView4;
        this.textViewVoiceCall = textViewTopLabelView5;
        this.upsellPackageLabel = dtacFontTextView6;
        this.usageInfoLabel = dtacFontTextView7;
    }

    @NonNull
    public static LayoutPreInfoAnalyticContentBinding bind(@NonNull View view) {
        View findChildViewById;
        int i = R.id.behaviorLabel;
        DtacFontTextView dtacFontTextView = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
        if (dtacFontTextView != null) {
            i = R.id.bell;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
            if (imageView != null) {
                i = R.id.bgNoPackage;
                LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i);
                if (linearLayout != null) {
                    i = R.id.bgNoUpsellPackage;
                    LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(view, i);
                    if (linearLayout2 != null) {
                        i = R.id.buttonViewAll;
                        DtacFontButton dtacFontButton = (DtacFontButton) ViewBindings.findChildViewById(view, i);
                        if (dtacFontButton != null) {
                            i = R.id.imageViewArpu;
                            ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, i);
                            if (imageView2 != null) {
                                i = R.id.imageViewInternet;
                                ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(view, i);
                                if (imageView3 != null) {
                                    i = R.id.imageViewRefill;
                                    ImageView imageView4 = (ImageView) ViewBindings.findChildViewById(view, i);
                                    if (imageView4 != null) {
                                        i = R.id.imageViewVoice;
                                        ImageView imageView5 = (ImageView) ViewBindings.findChildViewById(view, i);
                                        if (imageView5 != null) {
                                            LinearLayout linearLayout3 = (LinearLayout) view;
                                            i = R.id.layoutPackage;
                                            LinearLayout linearLayout4 = (LinearLayout) ViewBindings.findChildViewById(view, i);
                                            if (linearLayout4 != null) {
                                                i = R.id.layoutRefillARPUUsage;
                                                LinearLayout linearLayout5 = (LinearLayout) ViewBindings.findChildViewById(view, i);
                                                if (linearLayout5 != null) {
                                                    i = R.id.layoutUpsellPackage;
                                                    LinearLayout linearLayout6 = (LinearLayout) ViewBindings.findChildViewById(view, i);
                                                    if (linearLayout6 != null) {
                                                        i = R.id.layoutUsageContent;
                                                        RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, i);
                                                        if (relativeLayout != null) {
                                                            i = R.id.layoutVoiceInternetUsage;
                                                            LinearLayout linearLayout7 = (LinearLayout) ViewBindings.findChildViewById(view, i);
                                                            if (linearLayout7 != null && (findChildViewById = ViewBindings.findChildViewById(view, (i = R.id.lineHeader))) != null) {
                                                                i = R.id.packageLabel;
                                                                DtacFontTextView dtacFontTextView2 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                                                                if (dtacFontTextView2 != null) {
                                                                    i = R.id.packageListView;
                                                                    RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
                                                                    if (recyclerView != null) {
                                                                        i = R.id.packageUpsellListView;
                                                                        RecyclerView recyclerView2 = (RecyclerView) ViewBindings.findChildViewById(view, i);
                                                                        if (recyclerView2 != null) {
                                                                            i = R.id.recommendLayout;
                                                                            LinearLayout linearLayout8 = (LinearLayout) ViewBindings.findChildViewById(view, i);
                                                                            if (linearLayout8 != null) {
                                                                                i = R.id.shimmerFirstUsage;
                                                                                ShimmerFrameLayout shimmerFrameLayout = (ShimmerFrameLayout) ViewBindings.findChildViewById(view, i);
                                                                                if (shimmerFrameLayout != null) {
                                                                                    i = R.id.shimmerPackage;
                                                                                    ShimmerFrameLayout shimmerFrameLayout2 = (ShimmerFrameLayout) ViewBindings.findChildViewById(view, i);
                                                                                    if (shimmerFrameLayout2 != null) {
                                                                                        i = R.id.shimmerRecommend;
                                                                                        ShimmerFrameLayout shimmerFrameLayout3 = (ShimmerFrameLayout) ViewBindings.findChildViewById(view, i);
                                                                                        if (shimmerFrameLayout3 != null) {
                                                                                            i = R.id.shimmerRecommendLayout;
                                                                                            LinearLayout linearLayout9 = (LinearLayout) ViewBindings.findChildViewById(view, i);
                                                                                            if (linearLayout9 != null) {
                                                                                                i = R.id.shimmerSecondUsage;
                                                                                                ShimmerFrameLayout shimmerFrameLayout4 = (ShimmerFrameLayout) ViewBindings.findChildViewById(view, i);
                                                                                                if (shimmerFrameLayout4 != null) {
                                                                                                    i = R.id.shimmerUpsellPackage;
                                                                                                    ShimmerFrameLayout shimmerFrameLayout5 = (ShimmerFrameLayout) ViewBindings.findChildViewById(view, i);
                                                                                                    if (shimmerFrameLayout5 != null) {
                                                                                                        i = R.id.shimmerUsageBehavior;
                                                                                                        ShimmerFrameLayout shimmerFrameLayout6 = (ShimmerFrameLayout) ViewBindings.findChildViewById(view, i);
                                                                                                        if (shimmerFrameLayout6 != null) {
                                                                                                            i = R.id.textViewARPU;
                                                                                                            TextViewTopLabelView textViewTopLabelView = (TextViewTopLabelView) ViewBindings.findChildViewById(view, i);
                                                                                                            if (textViewTopLabelView != null) {
                                                                                                                i = R.id.textViewBehavior;
                                                                                                                TextViewTopLabelView textViewTopLabelView2 = (TextViewTopLabelView) ViewBindings.findChildViewById(view, i);
                                                                                                                if (textViewTopLabelView2 != null) {
                                                                                                                    i = R.id.textViewBehaviorUsage;
                                                                                                                    DtacFontTextView dtacFontTextView3 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                                                                                                                    if (dtacFontTextView3 != null) {
                                                                                                                        i = R.id.textViewInternet;
                                                                                                                        TextViewTopLabelView textViewTopLabelView3 = (TextViewTopLabelView) ViewBindings.findChildViewById(view, i);
                                                                                                                        if (textViewTopLabelView3 != null) {
                                                                                                                            i = R.id.textViewNoPackage;
                                                                                                                            DtacFontTextView dtacFontTextView4 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                                                                                                                            if (dtacFontTextView4 != null) {
                                                                                                                                i = R.id.textViewNoUpsellPackage;
                                                                                                                                DtacFontTextView dtacFontTextView5 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                                                                                                                                if (dtacFontTextView5 != null) {
                                                                                                                                    i = R.id.textViewRefillAmount;
                                                                                                                                    TextViewTopLabelView textViewTopLabelView4 = (TextViewTopLabelView) ViewBindings.findChildViewById(view, i);
                                                                                                                                    if (textViewTopLabelView4 != null) {
                                                                                                                                        i = R.id.textViewVoiceCall;
                                                                                                                                        TextViewTopLabelView textViewTopLabelView5 = (TextViewTopLabelView) ViewBindings.findChildViewById(view, i);
                                                                                                                                        if (textViewTopLabelView5 != null) {
                                                                                                                                            i = R.id.upsellPackageLabel;
                                                                                                                                            DtacFontTextView dtacFontTextView6 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                                                                                                                                            if (dtacFontTextView6 != null) {
                                                                                                                                                i = R.id.usageInfoLabel;
                                                                                                                                                DtacFontTextView dtacFontTextView7 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                                                                                                                                                if (dtacFontTextView7 != null) {
                                                                                                                                                    return new LayoutPreInfoAnalyticContentBinding(linearLayout3, dtacFontTextView, imageView, linearLayout, linearLayout2, dtacFontButton, imageView2, imageView3, imageView4, imageView5, linearLayout3, linearLayout4, linearLayout5, linearLayout6, relativeLayout, linearLayout7, findChildViewById, dtacFontTextView2, recyclerView, recyclerView2, linearLayout8, shimmerFrameLayout, shimmerFrameLayout2, shimmerFrameLayout3, linearLayout9, shimmerFrameLayout4, shimmerFrameLayout5, shimmerFrameLayout6, textViewTopLabelView, textViewTopLabelView2, dtacFontTextView3, textViewTopLabelView3, dtacFontTextView4, dtacFontTextView5, textViewTopLabelView4, textViewTopLabelView5, dtacFontTextView6, dtacFontTextView7);
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
    public static LayoutPreInfoAnalyticContentBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static LayoutPreInfoAnalyticContentBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.layout_pre_info_analytic_content, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayout getRoot() {
        return this.f84520a;
    }
}