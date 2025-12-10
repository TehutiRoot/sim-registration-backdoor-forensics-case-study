package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.app_one.widget.OneFontButton;
import th.p047co.dtac.android.dtacone.app_one.widget.OneFontTextView;

/* renamed from: th.co.dtac.android.dtacone.databinding.FragmentOneCheckBlacklistAdditionalAdvanceBinding */
/* loaded from: classes7.dex */
public final class FragmentOneCheckBlacklistAdditionalAdvanceBinding implements ViewBinding {

    /* renamed from: a */
    public final ConstraintLayout f84013a;
    @NonNull
    public final RecyclerView additionalAdvanceRCView;
    @NonNull
    public final ImageView bgLeftImageView;
    @NonNull
    public final ImageView bgRightImageView;
    @NonNull
    public final CardView cardView;
    @NonNull
    public final OneFontTextView headerTextView;
    @NonNull
    public final ImageView iconImageView;
    @NonNull
    public final OneFontTextView labelTextView;
    @NonNull
    public final NestedScrollView nestedScrollView;
    @NonNull
    public final OneFontButton nextButton;
    @NonNull
    public final LinearLayout rowHeaderLayout;
    @NonNull
    public final ConstraintLayout topBarAdditionalAdvanceLayout;
    @NonNull
    public final OneFontTextView valueTextView;

    public FragmentOneCheckBlacklistAdditionalAdvanceBinding(ConstraintLayout constraintLayout, RecyclerView recyclerView, ImageView imageView, ImageView imageView2, CardView cardView, OneFontTextView oneFontTextView, ImageView imageView3, OneFontTextView oneFontTextView2, NestedScrollView nestedScrollView, OneFontButton oneFontButton, LinearLayout linearLayout, ConstraintLayout constraintLayout2, OneFontTextView oneFontTextView3) {
        this.f84013a = constraintLayout;
        this.additionalAdvanceRCView = recyclerView;
        this.bgLeftImageView = imageView;
        this.bgRightImageView = imageView2;
        this.cardView = cardView;
        this.headerTextView = oneFontTextView;
        this.iconImageView = imageView3;
        this.labelTextView = oneFontTextView2;
        this.nestedScrollView = nestedScrollView;
        this.nextButton = oneFontButton;
        this.rowHeaderLayout = linearLayout;
        this.topBarAdditionalAdvanceLayout = constraintLayout2;
        this.valueTextView = oneFontTextView3;
    }

    @NonNull
    public static FragmentOneCheckBlacklistAdditionalAdvanceBinding bind(@NonNull View view) {
        int i = R.id.additionalAdvanceRCView;
        RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
        if (recyclerView != null) {
            i = R.id.bgLeftImageView;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
            if (imageView != null) {
                i = R.id.bgRightImageView;
                ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, i);
                if (imageView2 != null) {
                    i = R.id.cardView;
                    CardView cardView = (CardView) ViewBindings.findChildViewById(view, i);
                    if (cardView != null) {
                        i = R.id.headerTextView;
                        OneFontTextView oneFontTextView = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                        if (oneFontTextView != null) {
                            i = R.id.iconImageView;
                            ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(view, i);
                            if (imageView3 != null) {
                                i = R.id.labelTextView;
                                OneFontTextView oneFontTextView2 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                if (oneFontTextView2 != null) {
                                    i = R.id.nestedScrollView;
                                    NestedScrollView nestedScrollView = (NestedScrollView) ViewBindings.findChildViewById(view, i);
                                    if (nestedScrollView != null) {
                                        i = R.id.nextButton;
                                        OneFontButton oneFontButton = (OneFontButton) ViewBindings.findChildViewById(view, i);
                                        if (oneFontButton != null) {
                                            i = R.id.rowHeaderLayout;
                                            LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i);
                                            if (linearLayout != null) {
                                                i = R.id.topBarAdditionalAdvanceLayout;
                                                ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
                                                if (constraintLayout != null) {
                                                    i = R.id.valueTextView;
                                                    OneFontTextView oneFontTextView3 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                                    if (oneFontTextView3 != null) {
                                                        return new FragmentOneCheckBlacklistAdditionalAdvanceBinding((ConstraintLayout) view, recyclerView, imageView, imageView2, cardView, oneFontTextView, imageView3, oneFontTextView2, nestedScrollView, oneFontButton, linearLayout, constraintLayout, oneFontTextView3);
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
    public static FragmentOneCheckBlacklistAdditionalAdvanceBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentOneCheckBlacklistAdditionalAdvanceBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_one_check_blacklist_additional_advance, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.f84013a;
    }
}