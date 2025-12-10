package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.widget.view.DtacFontTextView;

/* renamed from: th.co.dtac.android.dtacone.databinding.ZIncludePackageSummaryBinding */
/* loaded from: classes7.dex */
public final class ZIncludePackageSummaryBinding implements ViewBinding {

    /* renamed from: a */
    public final ConstraintLayout f84642a;
    @NonNull
    public final CardView cardEndOfCyclePack;
    @NonNull
    public final CardView cardMainPack;
    @NonNull
    public final CardView cardNextDayPack;
    @NonNull
    public final CardView cardOtherPack;
    @NonNull
    public final DtacFontTextView dtacFontTextView44;
    @NonNull
    public final DtacFontTextView dtacFontTextView46;
    @NonNull
    public final DtacFontTextView dtacFontTextView48;
    @NonNull
    public final DtacFontTextView dtacFontTextView49;
    @NonNull
    public final ImageView imageView23;
    @NonNull
    public final ImageView imageView24;
    @NonNull
    public final ImageView imageView25;
    @NonNull
    public final ConstraintLayout layoutAllPackages;
    @NonNull
    public final ConstraintLayout layoutEndOfCyclePack;
    @NonNull
    public final ConstraintLayout layoutMainPack;
    @NonNull
    public final ConstraintLayout layoutNextDayPack;
    @NonNull
    public final ConstraintLayout layoutOtherPack;
    @NonNull
    public final ConstraintLayout layoutPackagesEmpty;
    @NonNull
    public final RecyclerView listAdditionalPackage;
    @NonNull
    public final RecyclerView listEndOfCyclePackage;
    @NonNull
    public final RecyclerView listMainPackage;
    @NonNull
    public final RecyclerView listNextDayPackage;
    @NonNull
    public final DtacFontTextView tv49;
    @NonNull
    public final DtacFontTextView tv50;
    @NonNull
    public final DtacFontTextView tvDisplayDate;
    @NonNull
    public final DtacFontTextView tvMainPack;
    @NonNull
    public final DtacFontTextView tvNextDayPack;

    public ZIncludePackageSummaryBinding(ConstraintLayout constraintLayout, CardView cardView, CardView cardView2, CardView cardView3, CardView cardView4, DtacFontTextView dtacFontTextView, DtacFontTextView dtacFontTextView2, DtacFontTextView dtacFontTextView3, DtacFontTextView dtacFontTextView4, ImageView imageView, ImageView imageView2, ImageView imageView3, ConstraintLayout constraintLayout2, ConstraintLayout constraintLayout3, ConstraintLayout constraintLayout4, ConstraintLayout constraintLayout5, ConstraintLayout constraintLayout6, ConstraintLayout constraintLayout7, RecyclerView recyclerView, RecyclerView recyclerView2, RecyclerView recyclerView3, RecyclerView recyclerView4, DtacFontTextView dtacFontTextView5, DtacFontTextView dtacFontTextView6, DtacFontTextView dtacFontTextView7, DtacFontTextView dtacFontTextView8, DtacFontTextView dtacFontTextView9) {
        this.f84642a = constraintLayout;
        this.cardEndOfCyclePack = cardView;
        this.cardMainPack = cardView2;
        this.cardNextDayPack = cardView3;
        this.cardOtherPack = cardView4;
        this.dtacFontTextView44 = dtacFontTextView;
        this.dtacFontTextView46 = dtacFontTextView2;
        this.dtacFontTextView48 = dtacFontTextView3;
        this.dtacFontTextView49 = dtacFontTextView4;
        this.imageView23 = imageView;
        this.imageView24 = imageView2;
        this.imageView25 = imageView3;
        this.layoutAllPackages = constraintLayout2;
        this.layoutEndOfCyclePack = constraintLayout3;
        this.layoutMainPack = constraintLayout4;
        this.layoutNextDayPack = constraintLayout5;
        this.layoutOtherPack = constraintLayout6;
        this.layoutPackagesEmpty = constraintLayout7;
        this.listAdditionalPackage = recyclerView;
        this.listEndOfCyclePackage = recyclerView2;
        this.listMainPackage = recyclerView3;
        this.listNextDayPackage = recyclerView4;
        this.tv49 = dtacFontTextView5;
        this.tv50 = dtacFontTextView6;
        this.tvDisplayDate = dtacFontTextView7;
        this.tvMainPack = dtacFontTextView8;
        this.tvNextDayPack = dtacFontTextView9;
    }

    @NonNull
    public static ZIncludePackageSummaryBinding bind(@NonNull View view) {
        int i = R.id.card_endOfCycle_pack;
        CardView cardView = (CardView) ViewBindings.findChildViewById(view, i);
        if (cardView != null) {
            i = R.id.card_main_pack;
            CardView cardView2 = (CardView) ViewBindings.findChildViewById(view, i);
            if (cardView2 != null) {
                i = R.id.card_next_day_pack;
                CardView cardView3 = (CardView) ViewBindings.findChildViewById(view, i);
                if (cardView3 != null) {
                    i = R.id.card_other_pack;
                    CardView cardView4 = (CardView) ViewBindings.findChildViewById(view, i);
                    if (cardView4 != null) {
                        i = R.id.dtacFontTextView44;
                        DtacFontTextView dtacFontTextView = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                        if (dtacFontTextView != null) {
                            i = R.id.dtacFontTextView46;
                            DtacFontTextView dtacFontTextView2 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                            if (dtacFontTextView2 != null) {
                                i = R.id.dtacFontTextView48;
                                DtacFontTextView dtacFontTextView3 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                                if (dtacFontTextView3 != null) {
                                    i = R.id.dtacFontTextView49;
                                    DtacFontTextView dtacFontTextView4 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                                    if (dtacFontTextView4 != null) {
                                        i = R.id.imageView23;
                                        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
                                        if (imageView != null) {
                                            i = R.id.imageView24;
                                            ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, i);
                                            if (imageView2 != null) {
                                                i = R.id.imageView25;
                                                ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(view, i);
                                                if (imageView3 != null) {
                                                    i = R.id.layout_all_packages;
                                                    ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
                                                    if (constraintLayout != null) {
                                                        i = R.id.layout_endOfCycle_pack;
                                                        ConstraintLayout constraintLayout2 = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
                                                        if (constraintLayout2 != null) {
                                                            i = R.id.layout_main_pack;
                                                            ConstraintLayout constraintLayout3 = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
                                                            if (constraintLayout3 != null) {
                                                                i = R.id.layout_next_day_pack;
                                                                ConstraintLayout constraintLayout4 = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
                                                                if (constraintLayout4 != null) {
                                                                    i = R.id.layout_Other_pack;
                                                                    ConstraintLayout constraintLayout5 = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
                                                                    if (constraintLayout5 != null) {
                                                                        i = R.id.layout_packages_empty;
                                                                        ConstraintLayout constraintLayout6 = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
                                                                        if (constraintLayout6 != null) {
                                                                            i = R.id.listAdditionalPackage;
                                                                            RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
                                                                            if (recyclerView != null) {
                                                                                i = R.id.listEndOfCyclePackage;
                                                                                RecyclerView recyclerView2 = (RecyclerView) ViewBindings.findChildViewById(view, i);
                                                                                if (recyclerView2 != null) {
                                                                                    i = R.id.listMainPackage;
                                                                                    RecyclerView recyclerView3 = (RecyclerView) ViewBindings.findChildViewById(view, i);
                                                                                    if (recyclerView3 != null) {
                                                                                        i = R.id.listNextDayPackage;
                                                                                        RecyclerView recyclerView4 = (RecyclerView) ViewBindings.findChildViewById(view, i);
                                                                                        if (recyclerView4 != null) {
                                                                                            i = R.id.tv49;
                                                                                            DtacFontTextView dtacFontTextView5 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                                                                                            if (dtacFontTextView5 != null) {
                                                                                                i = R.id.tv50;
                                                                                                DtacFontTextView dtacFontTextView6 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                                                                                                if (dtacFontTextView6 != null) {
                                                                                                    i = R.id.tvDisplayDate;
                                                                                                    DtacFontTextView dtacFontTextView7 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                                                                                                    if (dtacFontTextView7 != null) {
                                                                                                        i = R.id.tvMainPack;
                                                                                                        DtacFontTextView dtacFontTextView8 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                                                                                                        if (dtacFontTextView8 != null) {
                                                                                                            i = R.id.tvNextDayPack;
                                                                                                            DtacFontTextView dtacFontTextView9 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                                                                                                            if (dtacFontTextView9 != null) {
                                                                                                                return new ZIncludePackageSummaryBinding((ConstraintLayout) view, cardView, cardView2, cardView3, cardView4, dtacFontTextView, dtacFontTextView2, dtacFontTextView3, dtacFontTextView4, imageView, imageView2, imageView3, constraintLayout, constraintLayout2, constraintLayout3, constraintLayout4, constraintLayout5, constraintLayout6, recyclerView, recyclerView2, recyclerView3, recyclerView4, dtacFontTextView5, dtacFontTextView6, dtacFontTextView7, dtacFontTextView8, dtacFontTextView9);
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
    public static ZIncludePackageSummaryBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ZIncludePackageSummaryBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.z_include_package_summary, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.f84642a;
    }
}
