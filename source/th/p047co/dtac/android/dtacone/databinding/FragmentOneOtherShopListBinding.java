package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.app_one.widget.OneFontTextView;

/* renamed from: th.co.dtac.android.dtacone.databinding.FragmentOneOtherShopListBinding */
/* loaded from: classes7.dex */
public final class FragmentOneOtherShopListBinding implements ViewBinding {

    /* renamed from: a */
    public final ConstraintLayout f84008a;
    @NonNull
    public final CardView contentLayout;
    @NonNull
    public final ImageView ivSeller;
    @NonNull
    public final LinearLayout layoutSearchBar;
    @NonNull
    public final OneFontTextView oneFontTextView4;
    @NonNull
    public final LinearLayout oneShopList;
    @NonNull
    public final RecyclerView rvShopList;
    @NonNull
    public final FrameLayout shopFrameLayout;
    @NonNull
    public final OneFontTextView tvSellerId;
    @NonNull
    public final OneFontTextView tvSellerName;
    @NonNull
    public final OneFontTextView tvSellerNotFound;
    @NonNull
    public final View view13;

    public FragmentOneOtherShopListBinding(ConstraintLayout constraintLayout, CardView cardView, ImageView imageView, LinearLayout linearLayout, OneFontTextView oneFontTextView, LinearLayout linearLayout2, RecyclerView recyclerView, FrameLayout frameLayout, OneFontTextView oneFontTextView2, OneFontTextView oneFontTextView3, OneFontTextView oneFontTextView4, View view) {
        this.f84008a = constraintLayout;
        this.contentLayout = cardView;
        this.ivSeller = imageView;
        this.layoutSearchBar = linearLayout;
        this.oneFontTextView4 = oneFontTextView;
        this.oneShopList = linearLayout2;
        this.rvShopList = recyclerView;
        this.shopFrameLayout = frameLayout;
        this.tvSellerId = oneFontTextView2;
        this.tvSellerName = oneFontTextView3;
        this.tvSellerNotFound = oneFontTextView4;
        this.view13 = view;
    }

    @NonNull
    public static FragmentOneOtherShopListBinding bind(@NonNull View view) {
        View findChildViewById;
        int i = R.id.contentLayout;
        CardView cardView = (CardView) ViewBindings.findChildViewById(view, i);
        if (cardView != null) {
            i = R.id.ivSeller;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
            if (imageView != null) {
                i = R.id.layoutSearchBar;
                LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i);
                if (linearLayout != null) {
                    i = R.id.oneFontTextView4;
                    OneFontTextView oneFontTextView = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                    if (oneFontTextView != null) {
                        i = R.id.one_shop_list;
                        LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(view, i);
                        if (linearLayout2 != null) {
                            i = R.id.rvShopList;
                            RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
                            if (recyclerView != null) {
                                i = R.id.shopFrameLayout;
                                FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, i);
                                if (frameLayout != null) {
                                    i = R.id.tvSellerId;
                                    OneFontTextView oneFontTextView2 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                    if (oneFontTextView2 != null) {
                                        i = R.id.tvSellerName;
                                        OneFontTextView oneFontTextView3 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                        if (oneFontTextView3 != null) {
                                            i = R.id.tvSellerNotFound;
                                            OneFontTextView oneFontTextView4 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                            if (oneFontTextView4 != null && (findChildViewById = ViewBindings.findChildViewById(view, (i = R.id.view13))) != null) {
                                                return new FragmentOneOtherShopListBinding((ConstraintLayout) view, cardView, imageView, linearLayout, oneFontTextView, linearLayout2, recyclerView, frameLayout, oneFontTextView2, oneFontTextView3, oneFontTextView4, findChildViewById);
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
    public static FragmentOneOtherShopListBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentOneOtherShopListBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_one_other_shop_list, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.f84008a;
    }
}
