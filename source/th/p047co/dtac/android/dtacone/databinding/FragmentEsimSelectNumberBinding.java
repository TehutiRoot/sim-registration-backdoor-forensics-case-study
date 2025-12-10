package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.widget.view.DtacCardView;
import th.p047co.dtac.android.dtacone.widget.view.DtacFontTextView;

/* renamed from: th.co.dtac.android.dtacone.databinding.FragmentEsimSelectNumberBinding */
/* loaded from: classes7.dex */
public final class FragmentEsimSelectNumberBinding implements ViewBinding {

    /* renamed from: a */
    public final FrameLayout f83746a;
    @NonNull
    public final ConstraintLayout background;
    @NonNull
    public final DtacCardView cardPackage;
    @NonNull
    public final DtacFontTextView dtacFontTextView65;
    @NonNull
    public final DtacFontTextView dtacFontTextView66;
    @NonNull
    public final FrameLayout fragment;
    @NonNull
    public final FrameLayout fragmentPre;
    @NonNull
    public final ImageView imgBg;
    @NonNull
    public final DtacFontTextView label;
    @NonNull
    public final DtacFontTextView labelP1;
    @NonNull
    public final DtacFontTextView labelPackageName;
    @NonNull
    public final RecyclerView rvNumberList;
    @NonNull
    public final DtacFontTextView simPrice;
    @NonNull
    public final View view8;

    public FragmentEsimSelectNumberBinding(FrameLayout frameLayout, ConstraintLayout constraintLayout, DtacCardView dtacCardView, DtacFontTextView dtacFontTextView, DtacFontTextView dtacFontTextView2, FrameLayout frameLayout2, FrameLayout frameLayout3, ImageView imageView, DtacFontTextView dtacFontTextView3, DtacFontTextView dtacFontTextView4, DtacFontTextView dtacFontTextView5, RecyclerView recyclerView, DtacFontTextView dtacFontTextView6, View view) {
        this.f83746a = frameLayout;
        this.background = constraintLayout;
        this.cardPackage = dtacCardView;
        this.dtacFontTextView65 = dtacFontTextView;
        this.dtacFontTextView66 = dtacFontTextView2;
        this.fragment = frameLayout2;
        this.fragmentPre = frameLayout3;
        this.imgBg = imageView;
        this.label = dtacFontTextView3;
        this.labelP1 = dtacFontTextView4;
        this.labelPackageName = dtacFontTextView5;
        this.rvNumberList = recyclerView;
        this.simPrice = dtacFontTextView6;
        this.view8 = view;
    }

    @NonNull
    public static FragmentEsimSelectNumberBinding bind(@NonNull View view) {
        View findChildViewById;
        int i = R.id.background;
        ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
        if (constraintLayout != null) {
            i = R.id.cardPackage;
            DtacCardView dtacCardView = (DtacCardView) ViewBindings.findChildViewById(view, i);
            if (dtacCardView != null) {
                i = R.id.dtacFontTextView65;
                DtacFontTextView dtacFontTextView = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                if (dtacFontTextView != null) {
                    i = R.id.dtacFontTextView66;
                    DtacFontTextView dtacFontTextView2 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                    if (dtacFontTextView2 != null) {
                        i = R.id.fragment;
                        FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, i);
                        if (frameLayout != null) {
                            i = R.id.fragmentPre;
                            FrameLayout frameLayout2 = (FrameLayout) ViewBindings.findChildViewById(view, i);
                            if (frameLayout2 != null) {
                                i = R.id.imgBg;
                                ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
                                if (imageView != null) {
                                    i = R.id.label;
                                    DtacFontTextView dtacFontTextView3 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                                    if (dtacFontTextView3 != null) {
                                        i = R.id.labelP1;
                                        DtacFontTextView dtacFontTextView4 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                                        if (dtacFontTextView4 != null) {
                                            i = R.id.labelPackageName;
                                            DtacFontTextView dtacFontTextView5 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                                            if (dtacFontTextView5 != null) {
                                                i = R.id.rvNumberList;
                                                RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
                                                if (recyclerView != null) {
                                                    i = R.id.simPrice;
                                                    DtacFontTextView dtacFontTextView6 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                                                    if (dtacFontTextView6 != null && (findChildViewById = ViewBindings.findChildViewById(view, (i = R.id.view8))) != null) {
                                                        return new FragmentEsimSelectNumberBinding((FrameLayout) view, constraintLayout, dtacCardView, dtacFontTextView, dtacFontTextView2, frameLayout, frameLayout2, imageView, dtacFontTextView3, dtacFontTextView4, dtacFontTextView5, recyclerView, dtacFontTextView6, findChildViewById);
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
    public static FragmentEsimSelectNumberBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentEsimSelectNumberBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_esim_select_number, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public FrameLayout getRoot() {
        return this.f83746a;
    }
}
