package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
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

/* renamed from: th.co.dtac.android.dtacone.databinding.FragmentOneDeviceSaleDeviceConfirmBinding */
/* loaded from: classes7.dex */
public final class FragmentOneDeviceSaleDeviceConfirmBinding implements ViewBinding {

    /* renamed from: a */
    public final NestedScrollView f84023a;
    @NonNull
    public final OneFontButton btnNext;
    @NonNull
    public final RecyclerView bundleItemListView;
    @NonNull
    public final CardView cardViewDetail;
    @NonNull
    public final CardView cardViewProducts;
    @NonNull
    public final FrameLayout framePrice;
    @NonNull
    public final ImageView iconImageView;
    @NonNull
    public final ImageView iconImageViewProducts;
    @NonNull
    public final ConstraintLayout topBarDeviceInformationLayout;
    @NonNull
    public final ConstraintLayout topBarProducts;
    @NonNull
    public final OneFontTextView tvBundleTitle;
    @NonNull
    public final OneFontTextView tvDeviceName;
    @NonNull
    public final OneFontTextView tvIMEI;
    @NonNull
    public final OneFontTextView tvNoBundleItem;
    @NonNull
    public final OneFontTextView tvPackage;
    @NonNull
    public final OneFontTextView tvPrice;
    @NonNull
    public final OneFontTextView tvSubscriber;

    public FragmentOneDeviceSaleDeviceConfirmBinding(NestedScrollView nestedScrollView, OneFontButton oneFontButton, RecyclerView recyclerView, CardView cardView, CardView cardView2, FrameLayout frameLayout, ImageView imageView, ImageView imageView2, ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2, OneFontTextView oneFontTextView, OneFontTextView oneFontTextView2, OneFontTextView oneFontTextView3, OneFontTextView oneFontTextView4, OneFontTextView oneFontTextView5, OneFontTextView oneFontTextView6, OneFontTextView oneFontTextView7) {
        this.f84023a = nestedScrollView;
        this.btnNext = oneFontButton;
        this.bundleItemListView = recyclerView;
        this.cardViewDetail = cardView;
        this.cardViewProducts = cardView2;
        this.framePrice = frameLayout;
        this.iconImageView = imageView;
        this.iconImageViewProducts = imageView2;
        this.topBarDeviceInformationLayout = constraintLayout;
        this.topBarProducts = constraintLayout2;
        this.tvBundleTitle = oneFontTextView;
        this.tvDeviceName = oneFontTextView2;
        this.tvIMEI = oneFontTextView3;
        this.tvNoBundleItem = oneFontTextView4;
        this.tvPackage = oneFontTextView5;
        this.tvPrice = oneFontTextView6;
        this.tvSubscriber = oneFontTextView7;
    }

    @NonNull
    public static FragmentOneDeviceSaleDeviceConfirmBinding bind(@NonNull View view) {
        int i = R.id.btnNext;
        OneFontButton oneFontButton = (OneFontButton) ViewBindings.findChildViewById(view, i);
        if (oneFontButton != null) {
            i = R.id.bundleItemListView;
            RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
            if (recyclerView != null) {
                i = R.id.cardViewDetail;
                CardView cardView = (CardView) ViewBindings.findChildViewById(view, i);
                if (cardView != null) {
                    i = R.id.cardViewProducts;
                    CardView cardView2 = (CardView) ViewBindings.findChildViewById(view, i);
                    if (cardView2 != null) {
                        i = R.id.framePrice;
                        FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, i);
                        if (frameLayout != null) {
                            i = R.id.iconImageView;
                            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
                            if (imageView != null) {
                                i = R.id.iconImageViewProducts;
                                ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, i);
                                if (imageView2 != null) {
                                    i = R.id.topBarDeviceInformationLayout;
                                    ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
                                    if (constraintLayout != null) {
                                        i = R.id.topBarProducts;
                                        ConstraintLayout constraintLayout2 = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
                                        if (constraintLayout2 != null) {
                                            i = R.id.tvBundleTitle;
                                            OneFontTextView oneFontTextView = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                            if (oneFontTextView != null) {
                                                i = R.id.tvDeviceName;
                                                OneFontTextView oneFontTextView2 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                                if (oneFontTextView2 != null) {
                                                    i = R.id.tvIMEI;
                                                    OneFontTextView oneFontTextView3 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                                    if (oneFontTextView3 != null) {
                                                        i = R.id.tvNoBundleItem;
                                                        OneFontTextView oneFontTextView4 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                                        if (oneFontTextView4 != null) {
                                                            i = R.id.tvPackage;
                                                            OneFontTextView oneFontTextView5 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                                            if (oneFontTextView5 != null) {
                                                                i = R.id.tvPrice;
                                                                OneFontTextView oneFontTextView6 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                                                if (oneFontTextView6 != null) {
                                                                    i = R.id.tvSubscriber;
                                                                    OneFontTextView oneFontTextView7 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                                                    if (oneFontTextView7 != null) {
                                                                        return new FragmentOneDeviceSaleDeviceConfirmBinding((NestedScrollView) view, oneFontButton, recyclerView, cardView, cardView2, frameLayout, imageView, imageView2, constraintLayout, constraintLayout2, oneFontTextView, oneFontTextView2, oneFontTextView3, oneFontTextView4, oneFontTextView5, oneFontTextView6, oneFontTextView7);
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
    public static FragmentOneDeviceSaleDeviceConfirmBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentOneDeviceSaleDeviceConfirmBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_one_device_sale_device_confirm, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public NestedScrollView getRoot() {
        return this.f84023a;
    }
}