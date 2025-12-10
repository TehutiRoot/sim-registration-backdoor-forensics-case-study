package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.widget.view.DtacFontButton;
import th.p047co.dtac.android.dtacone.widget.view.DtacFontTextView;

/* renamed from: th.co.dtac.android.dtacone.databinding.FragmentEsimSelectTypeBinding */
/* loaded from: classes7.dex */
public final class FragmentEsimSelectTypeBinding implements ViewBinding {

    /* renamed from: a */
    public final FrameLayout f83846a;
    @NonNull
    public final DtacFontButton btnGoToNumber;
    @NonNull
    public final DtacFontButton btnGoToScanSim;
    @NonNull
    public final CardView cardNumber;
    @NonNull
    public final CardView cardScanSim;
    @NonNull
    public final FrameLayout fragment;
    @NonNull
    public final ImageView imageView38;
    @NonNull
    public final ImageView imageView39;
    @NonNull
    public final DtacFontTextView label;
    @NonNull
    public final DtacFontTextView label1;
    @NonNull
    public final DtacFontTextView label11;
    @NonNull
    public final DtacFontTextView label12;
    @NonNull
    public final DtacFontTextView label2;

    public FragmentEsimSelectTypeBinding(FrameLayout frameLayout, DtacFontButton dtacFontButton, DtacFontButton dtacFontButton2, CardView cardView, CardView cardView2, FrameLayout frameLayout2, ImageView imageView, ImageView imageView2, DtacFontTextView dtacFontTextView, DtacFontTextView dtacFontTextView2, DtacFontTextView dtacFontTextView3, DtacFontTextView dtacFontTextView4, DtacFontTextView dtacFontTextView5) {
        this.f83846a = frameLayout;
        this.btnGoToNumber = dtacFontButton;
        this.btnGoToScanSim = dtacFontButton2;
        this.cardNumber = cardView;
        this.cardScanSim = cardView2;
        this.fragment = frameLayout2;
        this.imageView38 = imageView;
        this.imageView39 = imageView2;
        this.label = dtacFontTextView;
        this.label1 = dtacFontTextView2;
        this.label11 = dtacFontTextView3;
        this.label12 = dtacFontTextView4;
        this.label2 = dtacFontTextView5;
    }

    @NonNull
    public static FragmentEsimSelectTypeBinding bind(@NonNull View view) {
        int i = R.id.btnGoToNumber;
        DtacFontButton dtacFontButton = (DtacFontButton) ViewBindings.findChildViewById(view, i);
        if (dtacFontButton != null) {
            i = R.id.btnGoToScanSim;
            DtacFontButton dtacFontButton2 = (DtacFontButton) ViewBindings.findChildViewById(view, i);
            if (dtacFontButton2 != null) {
                i = R.id.card_number;
                CardView cardView = (CardView) ViewBindings.findChildViewById(view, i);
                if (cardView != null) {
                    i = R.id.card_scan_sim;
                    CardView cardView2 = (CardView) ViewBindings.findChildViewById(view, i);
                    if (cardView2 != null) {
                        i = R.id.fragment;
                        FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, i);
                        if (frameLayout != null) {
                            i = R.id.imageView38;
                            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
                            if (imageView != null) {
                                i = R.id.imageView39;
                                ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, i);
                                if (imageView2 != null) {
                                    i = R.id.label;
                                    DtacFontTextView dtacFontTextView = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                                    if (dtacFontTextView != null) {
                                        i = R.id.label1;
                                        DtacFontTextView dtacFontTextView2 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                                        if (dtacFontTextView2 != null) {
                                            i = R.id.label11;
                                            DtacFontTextView dtacFontTextView3 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                                            if (dtacFontTextView3 != null) {
                                                i = R.id.label12;
                                                DtacFontTextView dtacFontTextView4 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                                                if (dtacFontTextView4 != null) {
                                                    i = R.id.label2;
                                                    DtacFontTextView dtacFontTextView5 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                                                    if (dtacFontTextView5 != null) {
                                                        return new FragmentEsimSelectTypeBinding((FrameLayout) view, dtacFontButton, dtacFontButton2, cardView, cardView2, frameLayout, imageView, imageView2, dtacFontTextView, dtacFontTextView2, dtacFontTextView3, dtacFontTextView4, dtacFontTextView5);
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
    public static FragmentEsimSelectTypeBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentEsimSelectTypeBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_esim_select_type, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public FrameLayout getRoot() {
        return this.f83846a;
    }
}