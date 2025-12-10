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
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.app_one.widget.OneFontTextView;

/* renamed from: th.co.dtac.android.dtacone.databinding.FragmentOneRegisterTrueOnlineSelectNumberBinding */
/* loaded from: classes7.dex */
public final class FragmentOneRegisterTrueOnlineSelectNumberBinding implements ViewBinding {

    /* renamed from: a */
    public final ConstraintLayout f84108a;
    @NonNull
    public final ImageView arrow;
    @NonNull
    public final View bottomBorder;
    @NonNull
    public final ConstraintLayout constraintLayout10;
    @NonNull
    public final FrameLayout frameLayout3;
    @NonNull
    public final OneFontTextView headerNewTextView;
    @NonNull
    public final OneFontTextView headerOldTextView;
    @NonNull
    public final ConstraintLayout newNumberLayout;
    @NonNull
    public final OneFontTextView newNumberTextView;
    @NonNull
    public final CardView newTMHCardView;
    @NonNull
    public final RecyclerView oldListNumberRCV;
    @NonNull
    public final CardView oldTMHCardView;
    @NonNull
    public final ConstraintLayout root;
    @NonNull
    public final OneFontTextView tvTitle;

    public FragmentOneRegisterTrueOnlineSelectNumberBinding(ConstraintLayout constraintLayout, ImageView imageView, View view, ConstraintLayout constraintLayout2, FrameLayout frameLayout, OneFontTextView oneFontTextView, OneFontTextView oneFontTextView2, ConstraintLayout constraintLayout3, OneFontTextView oneFontTextView3, CardView cardView, RecyclerView recyclerView, CardView cardView2, ConstraintLayout constraintLayout4, OneFontTextView oneFontTextView4) {
        this.f84108a = constraintLayout;
        this.arrow = imageView;
        this.bottomBorder = view;
        this.constraintLayout10 = constraintLayout2;
        this.frameLayout3 = frameLayout;
        this.headerNewTextView = oneFontTextView;
        this.headerOldTextView = oneFontTextView2;
        this.newNumberLayout = constraintLayout3;
        this.newNumberTextView = oneFontTextView3;
        this.newTMHCardView = cardView;
        this.oldListNumberRCV = recyclerView;
        this.oldTMHCardView = cardView2;
        this.root = constraintLayout4;
        this.tvTitle = oneFontTextView4;
    }

    @NonNull
    public static FragmentOneRegisterTrueOnlineSelectNumberBinding bind(@NonNull View view) {
        View findChildViewById;
        int i = R.id.arrow;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
        if (imageView != null && (findChildViewById = ViewBindings.findChildViewById(view, (i = R.id.bottomBorder))) != null) {
            i = R.id.constraintLayout10;
            ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
            if (constraintLayout != null) {
                i = R.id.frameLayout3;
                FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, i);
                if (frameLayout != null) {
                    i = R.id.headerNewTextView;
                    OneFontTextView oneFontTextView = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                    if (oneFontTextView != null) {
                        i = R.id.headerOldTextView;
                        OneFontTextView oneFontTextView2 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                        if (oneFontTextView2 != null) {
                            i = R.id.newNumberLayout;
                            ConstraintLayout constraintLayout2 = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
                            if (constraintLayout2 != null) {
                                i = R.id.newNumberTextView;
                                OneFontTextView oneFontTextView3 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                if (oneFontTextView3 != null) {
                                    i = R.id.newTMHCardView;
                                    CardView cardView = (CardView) ViewBindings.findChildViewById(view, i);
                                    if (cardView != null) {
                                        i = R.id.oldListNumberRCV;
                                        RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
                                        if (recyclerView != null) {
                                            i = R.id.oldTMHCardView;
                                            CardView cardView2 = (CardView) ViewBindings.findChildViewById(view, i);
                                            if (cardView2 != null) {
                                                ConstraintLayout constraintLayout3 = (ConstraintLayout) view;
                                                i = R.id.tvTitle;
                                                OneFontTextView oneFontTextView4 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                                if (oneFontTextView4 != null) {
                                                    return new FragmentOneRegisterTrueOnlineSelectNumberBinding(constraintLayout3, imageView, findChildViewById, constraintLayout, frameLayout, oneFontTextView, oneFontTextView2, constraintLayout2, oneFontTextView3, cardView, recyclerView, cardView2, constraintLayout3, oneFontTextView4);
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
    public static FragmentOneRegisterTrueOnlineSelectNumberBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentOneRegisterTrueOnlineSelectNumberBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_one_register_true_online_select_number, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.f84108a;
    }
}
