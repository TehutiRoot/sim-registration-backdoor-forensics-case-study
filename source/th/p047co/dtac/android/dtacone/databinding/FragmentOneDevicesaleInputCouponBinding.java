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
import th.p047co.dtac.android.dtacone.app_one.widget.OneFontButton;
import th.p047co.dtac.android.dtacone.app_one.widget.OneFontTextView;

/* renamed from: th.co.dtac.android.dtacone.databinding.FragmentOneDevicesaleInputCouponBinding */
/* loaded from: classes7.dex */
public final class FragmentOneDevicesaleInputCouponBinding implements ViewBinding {

    /* renamed from: a */
    public final ConstraintLayout f83949a;
    @NonNull
    public final OneFontButton buttonNext;
    @NonNull
    public final CardView cardInputListView;
    @NonNull
    public final ConstraintLayout constraintLayout11;
    @NonNull
    public final RecyclerView inputListView;
    @NonNull
    public final ImageView ivDeviceType;
    @NonNull
    public final ConstraintLayout scroll;
    @NonNull
    public final OneFontTextView textViewContract;
    @NonNull
    public final OneFontTextView textViewHeaderScreen;

    public FragmentOneDevicesaleInputCouponBinding(ConstraintLayout constraintLayout, OneFontButton oneFontButton, CardView cardView, ConstraintLayout constraintLayout2, RecyclerView recyclerView, ImageView imageView, ConstraintLayout constraintLayout3, OneFontTextView oneFontTextView, OneFontTextView oneFontTextView2) {
        this.f83949a = constraintLayout;
        this.buttonNext = oneFontButton;
        this.cardInputListView = cardView;
        this.constraintLayout11 = constraintLayout2;
        this.inputListView = recyclerView;
        this.ivDeviceType = imageView;
        this.scroll = constraintLayout3;
        this.textViewContract = oneFontTextView;
        this.textViewHeaderScreen = oneFontTextView2;
    }

    @NonNull
    public static FragmentOneDevicesaleInputCouponBinding bind(@NonNull View view) {
        int i = R.id.buttonNext;
        OneFontButton oneFontButton = (OneFontButton) ViewBindings.findChildViewById(view, i);
        if (oneFontButton != null) {
            i = R.id.cardInputListView;
            CardView cardView = (CardView) ViewBindings.findChildViewById(view, i);
            if (cardView != null) {
                i = R.id.constraintLayout11;
                ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
                if (constraintLayout != null) {
                    i = R.id.inputListView;
                    RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
                    if (recyclerView != null) {
                        i = R.id.ivDeviceType;
                        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
                        if (imageView != null) {
                            i = R.id.scroll;
                            ConstraintLayout constraintLayout2 = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
                            if (constraintLayout2 != null) {
                                i = R.id.textViewContract;
                                OneFontTextView oneFontTextView = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                if (oneFontTextView != null) {
                                    i = R.id.textViewHeaderScreen;
                                    OneFontTextView oneFontTextView2 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                    if (oneFontTextView2 != null) {
                                        return new FragmentOneDevicesaleInputCouponBinding((ConstraintLayout) view, oneFontButton, cardView, constraintLayout, recyclerView, imageView, constraintLayout2, oneFontTextView, oneFontTextView2);
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
    public static FragmentOneDevicesaleInputCouponBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentOneDevicesaleInputCouponBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_one_devicesale_input_coupon, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.f83949a;
    }
}
