package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.app_one.widget.OneFontTextView;

/* renamed from: th.co.dtac.android.dtacone.databinding.FragmentOneActivateSimCheckSimInfoBinding */
/* loaded from: classes7.dex */
public final class FragmentOneActivateSimCheckSimInfoBinding implements ViewBinding {

    /* renamed from: a */
    public final ConstraintLayout f83981a;
    @NonNull
    public final OneFontTextView checkSimInfoCardNumberTextView;
    @NonNull
    public final OneFontTextView checkSimInfoCardNumberTitleTextView;
    @NonNull
    public final OneFontTextView checkSimInfoChooseServiceTextView;
    @NonNull
    public final OneFontTextView checkSimInfoDetailDetailTextView;
    @NonNull
    public final ConstraintLayout checkSimInfoDetailLayout;
    @NonNull
    public final View checkSimInfoDetailLineView;
    @NonNull
    public final ConstraintLayout checkSimInfoLayout;
    @NonNull
    public final OneFontTextView checkSimInfoPhoneTextView;
    @NonNull
    public final OneFontTextView checkSimInfoPhoneTitleTextView;
    @NonNull
    public final CardView selectChangeMainPackCardView;
    @NonNull
    public final ImageView selectChangeMainPackImageView;
    @NonNull
    public final ConstraintLayout selectChangeMainPackLayout;
    @NonNull
    public final OneFontTextView selectChangeMainPackTextView;
    @NonNull
    public final CardView selectProsermCardView;
    @NonNull
    public final ConstraintLayout selectProsermLayout;
    @NonNull
    public final OneFontTextView selectProsermTextView;
    @NonNull
    public final ImageView selectStvImageView;
    @NonNull
    public final ImageView selectTopUpImageView;
    @NonNull
    public final CardView selectTopUpeCardView;
    @NonNull
    public final ConstraintLayout selectTopUpeImageViewLayout;
    @NonNull
    public final OneFontTextView topUpSelectTextView;

    public FragmentOneActivateSimCheckSimInfoBinding(ConstraintLayout constraintLayout, OneFontTextView oneFontTextView, OneFontTextView oneFontTextView2, OneFontTextView oneFontTextView3, OneFontTextView oneFontTextView4, ConstraintLayout constraintLayout2, View view, ConstraintLayout constraintLayout3, OneFontTextView oneFontTextView5, OneFontTextView oneFontTextView6, CardView cardView, ImageView imageView, ConstraintLayout constraintLayout4, OneFontTextView oneFontTextView7, CardView cardView2, ConstraintLayout constraintLayout5, OneFontTextView oneFontTextView8, ImageView imageView2, ImageView imageView3, CardView cardView3, ConstraintLayout constraintLayout6, OneFontTextView oneFontTextView9) {
        this.f83981a = constraintLayout;
        this.checkSimInfoCardNumberTextView = oneFontTextView;
        this.checkSimInfoCardNumberTitleTextView = oneFontTextView2;
        this.checkSimInfoChooseServiceTextView = oneFontTextView3;
        this.checkSimInfoDetailDetailTextView = oneFontTextView4;
        this.checkSimInfoDetailLayout = constraintLayout2;
        this.checkSimInfoDetailLineView = view;
        this.checkSimInfoLayout = constraintLayout3;
        this.checkSimInfoPhoneTextView = oneFontTextView5;
        this.checkSimInfoPhoneTitleTextView = oneFontTextView6;
        this.selectChangeMainPackCardView = cardView;
        this.selectChangeMainPackImageView = imageView;
        this.selectChangeMainPackLayout = constraintLayout4;
        this.selectChangeMainPackTextView = oneFontTextView7;
        this.selectProsermCardView = cardView2;
        this.selectProsermLayout = constraintLayout5;
        this.selectProsermTextView = oneFontTextView8;
        this.selectStvImageView = imageView2;
        this.selectTopUpImageView = imageView3;
        this.selectTopUpeCardView = cardView3;
        this.selectTopUpeImageViewLayout = constraintLayout6;
        this.topUpSelectTextView = oneFontTextView9;
    }

    @NonNull
    public static FragmentOneActivateSimCheckSimInfoBinding bind(@NonNull View view) {
        View findChildViewById;
        int i = R.id.checkSimInfoCardNumberTextView;
        OneFontTextView oneFontTextView = (OneFontTextView) ViewBindings.findChildViewById(view, i);
        if (oneFontTextView != null) {
            i = R.id.checkSimInfoCardNumberTitleTextView;
            OneFontTextView oneFontTextView2 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
            if (oneFontTextView2 != null) {
                i = R.id.checkSimInfoChooseServiceTextView;
                OneFontTextView oneFontTextView3 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                if (oneFontTextView3 != null) {
                    i = R.id.checkSimInfoDetailDetailTextView;
                    OneFontTextView oneFontTextView4 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                    if (oneFontTextView4 != null) {
                        i = R.id.checkSimInfoDetailLayout;
                        ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
                        if (constraintLayout != null && (findChildViewById = ViewBindings.findChildViewById(view, (i = R.id.checkSimInfoDetailLineView))) != null) {
                            i = R.id.checkSimInfoLayout;
                            ConstraintLayout constraintLayout2 = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
                            if (constraintLayout2 != null) {
                                i = R.id.checkSimInfoPhoneTextView;
                                OneFontTextView oneFontTextView5 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                if (oneFontTextView5 != null) {
                                    i = R.id.checkSimInfoPhoneTitleTextView;
                                    OneFontTextView oneFontTextView6 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                    if (oneFontTextView6 != null) {
                                        i = R.id.selectChangeMainPackCardView;
                                        CardView cardView = (CardView) ViewBindings.findChildViewById(view, i);
                                        if (cardView != null) {
                                            i = R.id.selectChangeMainPackImageView;
                                            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
                                            if (imageView != null) {
                                                i = R.id.selectChangeMainPackLayout;
                                                ConstraintLayout constraintLayout3 = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
                                                if (constraintLayout3 != null) {
                                                    i = R.id.selectChangeMainPackTextView;
                                                    OneFontTextView oneFontTextView7 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                                    if (oneFontTextView7 != null) {
                                                        i = R.id.selectProsermCardView;
                                                        CardView cardView2 = (CardView) ViewBindings.findChildViewById(view, i);
                                                        if (cardView2 != null) {
                                                            i = R.id.selectProsermLayout;
                                                            ConstraintLayout constraintLayout4 = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
                                                            if (constraintLayout4 != null) {
                                                                i = R.id.selectProsermTextView;
                                                                OneFontTextView oneFontTextView8 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                                                if (oneFontTextView8 != null) {
                                                                    i = R.id.selectStvImageView;
                                                                    ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, i);
                                                                    if (imageView2 != null) {
                                                                        i = R.id.selectTopUpImageView;
                                                                        ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(view, i);
                                                                        if (imageView3 != null) {
                                                                            i = R.id.selectTopUpeCardView;
                                                                            CardView cardView3 = (CardView) ViewBindings.findChildViewById(view, i);
                                                                            if (cardView3 != null) {
                                                                                i = R.id.selectTopUpeImageViewLayout;
                                                                                ConstraintLayout constraintLayout5 = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
                                                                                if (constraintLayout5 != null) {
                                                                                    i = R.id.topUpSelectTextView;
                                                                                    OneFontTextView oneFontTextView9 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                                                                    if (oneFontTextView9 != null) {
                                                                                        return new FragmentOneActivateSimCheckSimInfoBinding((ConstraintLayout) view, oneFontTextView, oneFontTextView2, oneFontTextView3, oneFontTextView4, constraintLayout, findChildViewById, constraintLayout2, oneFontTextView5, oneFontTextView6, cardView, imageView, constraintLayout3, oneFontTextView7, cardView2, constraintLayout4, oneFontTextView8, imageView2, imageView3, cardView3, constraintLayout5, oneFontTextView9);
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
    public static FragmentOneActivateSimCheckSimInfoBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentOneActivateSimCheckSimInfoBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_one_activate_sim_check_sim_info, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.f83981a;
    }
}