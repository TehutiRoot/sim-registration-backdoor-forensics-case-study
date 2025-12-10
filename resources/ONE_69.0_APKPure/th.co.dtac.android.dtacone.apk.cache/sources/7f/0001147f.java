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

/* renamed from: th.co.dtac.android.dtacone.databinding.ActivityOneAboutBinding */
/* loaded from: classes7.dex */
public final class ActivityOneAboutBinding implements ViewBinding {

    /* renamed from: a */
    public final ConstraintLayout f83626a;
    @NonNull
    public final CardView cardDevice;
    @NonNull
    public final OneFontTextView cardReader;
    @NonNull
    public final CardView cardSmart;
    @NonNull
    public final CardView cardView5;
    @NonNull
    public final ConstraintLayout constraintDevice;
    @NonNull
    public final ConstraintLayout constraintSmartCard;
    @NonNull
    public final ImageView imageView43;
    @NonNull
    public final OneToolbarBinding includeOneToolbar;
    @NonNull
    public final OneFontTextView labelDevice;
    @NonNull
    public final OneFontTextView labelSmartCardReader;
    @NonNull
    public final OneFontTextView libV;
    @NonNull
    public final OneFontTextView modelName;
    @NonNull
    public final OneFontTextView osVersion;
    @NonNull
    public final OneFontTextView tvAppName;
    @NonNull
    public final OneFontTextView tvAppOneVersion;
    @NonNull
    public final OneFontTextView tvLibraryVersion;
    @NonNull
    public final OneFontTextView tvModelName;
    @NonNull
    public final OneFontTextView tvOSVersion;
    @NonNull
    public final OneFontTextView tvSmartCardReader;

    public ActivityOneAboutBinding(ConstraintLayout constraintLayout, CardView cardView, OneFontTextView oneFontTextView, CardView cardView2, CardView cardView3, ConstraintLayout constraintLayout2, ConstraintLayout constraintLayout3, ImageView imageView, OneToolbarBinding oneToolbarBinding, OneFontTextView oneFontTextView2, OneFontTextView oneFontTextView3, OneFontTextView oneFontTextView4, OneFontTextView oneFontTextView5, OneFontTextView oneFontTextView6, OneFontTextView oneFontTextView7, OneFontTextView oneFontTextView8, OneFontTextView oneFontTextView9, OneFontTextView oneFontTextView10, OneFontTextView oneFontTextView11, OneFontTextView oneFontTextView12) {
        this.f83626a = constraintLayout;
        this.cardDevice = cardView;
        this.cardReader = oneFontTextView;
        this.cardSmart = cardView2;
        this.cardView5 = cardView3;
        this.constraintDevice = constraintLayout2;
        this.constraintSmartCard = constraintLayout3;
        this.imageView43 = imageView;
        this.includeOneToolbar = oneToolbarBinding;
        this.labelDevice = oneFontTextView2;
        this.labelSmartCardReader = oneFontTextView3;
        this.libV = oneFontTextView4;
        this.modelName = oneFontTextView5;
        this.osVersion = oneFontTextView6;
        this.tvAppName = oneFontTextView7;
        this.tvAppOneVersion = oneFontTextView8;
        this.tvLibraryVersion = oneFontTextView9;
        this.tvModelName = oneFontTextView10;
        this.tvOSVersion = oneFontTextView11;
        this.tvSmartCardReader = oneFontTextView12;
    }

    @NonNull
    public static ActivityOneAboutBinding bind(@NonNull View view) {
        View findChildViewById;
        int i = R.id.cardDevice;
        CardView cardView = (CardView) ViewBindings.findChildViewById(view, i);
        if (cardView != null) {
            i = R.id.cardReader;
            OneFontTextView oneFontTextView = (OneFontTextView) ViewBindings.findChildViewById(view, i);
            if (oneFontTextView != null) {
                i = R.id.cardSmart;
                CardView cardView2 = (CardView) ViewBindings.findChildViewById(view, i);
                if (cardView2 != null) {
                    i = R.id.cardView5;
                    CardView cardView3 = (CardView) ViewBindings.findChildViewById(view, i);
                    if (cardView3 != null) {
                        i = R.id.constraintDevice;
                        ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
                        if (constraintLayout != null) {
                            i = R.id.constraintSmartCard;
                            ConstraintLayout constraintLayout2 = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
                            if (constraintLayout2 != null) {
                                i = R.id.imageView43;
                                ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
                                if (imageView != null && (findChildViewById = ViewBindings.findChildViewById(view, (i = R.id.include_one_toolbar))) != null) {
                                    OneToolbarBinding bind = OneToolbarBinding.bind(findChildViewById);
                                    i = R.id.labelDevice;
                                    OneFontTextView oneFontTextView2 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                    if (oneFontTextView2 != null) {
                                        i = R.id.labelSmartCardReader;
                                        OneFontTextView oneFontTextView3 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                        if (oneFontTextView3 != null) {
                                            i = R.id.libV;
                                            OneFontTextView oneFontTextView4 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                            if (oneFontTextView4 != null) {
                                                i = R.id.modelName;
                                                OneFontTextView oneFontTextView5 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                                if (oneFontTextView5 != null) {
                                                    i = R.id.osVersion;
                                                    OneFontTextView oneFontTextView6 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                                    if (oneFontTextView6 != null) {
                                                        i = R.id.tvAppName;
                                                        OneFontTextView oneFontTextView7 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                                        if (oneFontTextView7 != null) {
                                                            i = R.id.tvAppOneVersion;
                                                            OneFontTextView oneFontTextView8 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                                            if (oneFontTextView8 != null) {
                                                                i = R.id.tvLibraryVersion;
                                                                OneFontTextView oneFontTextView9 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                                                if (oneFontTextView9 != null) {
                                                                    i = R.id.tvModelName;
                                                                    OneFontTextView oneFontTextView10 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                                                    if (oneFontTextView10 != null) {
                                                                        i = R.id.tvOSVersion;
                                                                        OneFontTextView oneFontTextView11 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                                                        if (oneFontTextView11 != null) {
                                                                            i = R.id.tvSmartCardReader;
                                                                            OneFontTextView oneFontTextView12 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                                                            if (oneFontTextView12 != null) {
                                                                                return new ActivityOneAboutBinding((ConstraintLayout) view, cardView, oneFontTextView, cardView2, cardView3, constraintLayout, constraintLayout2, imageView, bind, oneFontTextView2, oneFontTextView3, oneFontTextView4, oneFontTextView5, oneFontTextView6, oneFontTextView7, oneFontTextView8, oneFontTextView9, oneFontTextView10, oneFontTextView11, oneFontTextView12);
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
    public static ActivityOneAboutBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ActivityOneAboutBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.activity_one_about, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.f83626a;
    }
}