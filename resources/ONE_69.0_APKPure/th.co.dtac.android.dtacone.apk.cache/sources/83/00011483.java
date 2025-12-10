package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import th.p047co.dtac.android.dtacone.R;

/* renamed from: th.co.dtac.android.dtacone.databinding.ActivityOneBuyDolBinding */
/* loaded from: classes7.dex */
public final class ActivityOneBuyDolBinding implements ViewBinding {

    /* renamed from: a */
    public final ConstraintLayout f83630a;
    @NonNull
    public final FrameLayout oneBuyDolDtacCompanyContainer;
    @NonNull
    public final ConstraintLayout oneBuyDolDtacCompanyLayout;
    @NonNull
    public final CardView oneBuyDolStepCardView;
    @NonNull
    public final AppCompatImageView oneBuyDolStepImageView;
    @NonNull
    public final OneToolbarBinding oneBuyDolToolbar;
    @NonNull
    public final FrameLayout oneBuyDolTrueCompanyContainer;

    public ActivityOneBuyDolBinding(ConstraintLayout constraintLayout, FrameLayout frameLayout, ConstraintLayout constraintLayout2, CardView cardView, AppCompatImageView appCompatImageView, OneToolbarBinding oneToolbarBinding, FrameLayout frameLayout2) {
        this.f83630a = constraintLayout;
        this.oneBuyDolDtacCompanyContainer = frameLayout;
        this.oneBuyDolDtacCompanyLayout = constraintLayout2;
        this.oneBuyDolStepCardView = cardView;
        this.oneBuyDolStepImageView = appCompatImageView;
        this.oneBuyDolToolbar = oneToolbarBinding;
        this.oneBuyDolTrueCompanyContainer = frameLayout2;
    }

    @NonNull
    public static ActivityOneBuyDolBinding bind(@NonNull View view) {
        View findChildViewById;
        int i = R.id.oneBuyDolDtacCompanyContainer;
        FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, i);
        if (frameLayout != null) {
            i = R.id.oneBuyDolDtacCompanyLayout;
            ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
            if (constraintLayout != null) {
                i = R.id.oneBuyDolStepCardView;
                CardView cardView = (CardView) ViewBindings.findChildViewById(view, i);
                if (cardView != null) {
                    i = R.id.oneBuyDolStepImageView;
                    AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(view, i);
                    if (appCompatImageView != null && (findChildViewById = ViewBindings.findChildViewById(view, (i = R.id.oneBuyDolToolbar))) != null) {
                        OneToolbarBinding bind = OneToolbarBinding.bind(findChildViewById);
                        i = R.id.oneBuyDolTrueCompanyContainer;
                        FrameLayout frameLayout2 = (FrameLayout) ViewBindings.findChildViewById(view, i);
                        if (frameLayout2 != null) {
                            return new ActivityOneBuyDolBinding((ConstraintLayout) view, frameLayout, constraintLayout, cardView, appCompatImageView, bind, frameLayout2);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static ActivityOneBuyDolBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ActivityOneBuyDolBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.activity_one_buy_dol, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.f83630a;
    }
}