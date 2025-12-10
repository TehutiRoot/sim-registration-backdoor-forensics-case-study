package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.core.widget.NestedScrollView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.widget.view.DtacFontButton;
import th.p047co.dtac.android.dtacone.widget.view.DtacFontTextView;

/* renamed from: th.co.dtac.android.dtacone.databinding.FragmentChangeSimSignatureBinding */
/* loaded from: classes7.dex */
public final class FragmentChangeSimSignatureBinding implements ViewBinding {

    /* renamed from: a */
    public final NestedScrollView f83676a;
    @NonNull
    public final DtacFontButton btnConfirm;
    @NonNull
    public final CardView cardCondition;
    @NonNull
    public final ImageView ivSignature;
    @NonNull
    public final FrameLayout signatureBox;
    @NonNull
    public final DtacFontTextView tvChangeSimCondition;
    @NonNull
    public final DtacFontTextView tvPhoneNumber;
    @NonNull
    public final DtacFontTextView tvPhoneNumberLabel;
    @NonNull
    public final DtacFontTextView tvSignature;
    @NonNull
    public final DtacFontTextView tvSignatureHelper;
    @NonNull
    public final DtacFontTextView tvSignatureTextHelper;
    @NonNull
    public final View viewDivide;

    public FragmentChangeSimSignatureBinding(NestedScrollView nestedScrollView, DtacFontButton dtacFontButton, CardView cardView, ImageView imageView, FrameLayout frameLayout, DtacFontTextView dtacFontTextView, DtacFontTextView dtacFontTextView2, DtacFontTextView dtacFontTextView3, DtacFontTextView dtacFontTextView4, DtacFontTextView dtacFontTextView5, DtacFontTextView dtacFontTextView6, View view) {
        this.f83676a = nestedScrollView;
        this.btnConfirm = dtacFontButton;
        this.cardCondition = cardView;
        this.ivSignature = imageView;
        this.signatureBox = frameLayout;
        this.tvChangeSimCondition = dtacFontTextView;
        this.tvPhoneNumber = dtacFontTextView2;
        this.tvPhoneNumberLabel = dtacFontTextView3;
        this.tvSignature = dtacFontTextView4;
        this.tvSignatureHelper = dtacFontTextView5;
        this.tvSignatureTextHelper = dtacFontTextView6;
        this.viewDivide = view;
    }

    @NonNull
    public static FragmentChangeSimSignatureBinding bind(@NonNull View view) {
        View findChildViewById;
        int i = R.id.btnConfirm;
        DtacFontButton dtacFontButton = (DtacFontButton) ViewBindings.findChildViewById(view, i);
        if (dtacFontButton != null) {
            i = R.id.cardCondition;
            CardView cardView = (CardView) ViewBindings.findChildViewById(view, i);
            if (cardView != null) {
                i = R.id.ivSignature;
                ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
                if (imageView != null) {
                    i = R.id.signatureBox;
                    FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, i);
                    if (frameLayout != null) {
                        i = R.id.tvChangeSimCondition;
                        DtacFontTextView dtacFontTextView = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                        if (dtacFontTextView != null) {
                            i = R.id.tvPhoneNumber;
                            DtacFontTextView dtacFontTextView2 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                            if (dtacFontTextView2 != null) {
                                i = R.id.tvPhoneNumberLabel;
                                DtacFontTextView dtacFontTextView3 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                                if (dtacFontTextView3 != null) {
                                    i = R.id.tvSignature;
                                    DtacFontTextView dtacFontTextView4 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                                    if (dtacFontTextView4 != null) {
                                        i = R.id.tvSignatureHelper;
                                        DtacFontTextView dtacFontTextView5 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                                        if (dtacFontTextView5 != null) {
                                            i = R.id.tvSignatureTextHelper;
                                            DtacFontTextView dtacFontTextView6 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                                            if (dtacFontTextView6 != null && (findChildViewById = ViewBindings.findChildViewById(view, (i = R.id.viewDivide))) != null) {
                                                return new FragmentChangeSimSignatureBinding((NestedScrollView) view, dtacFontButton, cardView, imageView, frameLayout, dtacFontTextView, dtacFontTextView2, dtacFontTextView3, dtacFontTextView4, dtacFontTextView5, dtacFontTextView6, findChildViewById);
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
    public static FragmentChangeSimSignatureBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentChangeSimSignatureBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_change_sim_signature, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public NestedScrollView getRoot() {
        return this.f83676a;
    }
}
