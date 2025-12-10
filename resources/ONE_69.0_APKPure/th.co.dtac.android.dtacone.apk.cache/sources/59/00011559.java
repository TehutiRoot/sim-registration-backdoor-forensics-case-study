package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.widget.view.DtacFontButton;
import th.p047co.dtac.android.dtacone.widget.view.DtacFontTextView;

/* renamed from: th.co.dtac.android.dtacone.databinding.FragmentEsimShowQrCodeBinding */
/* loaded from: classes7.dex */
public final class FragmentEsimShowQrCodeBinding implements ViewBinding {

    /* renamed from: a */
    public final NestedScrollView f83847a;
    @NonNull
    public final DtacFontButton btnOk;
    @NonNull
    public final ImageView ivQrCode;
    @NonNull
    public final LinearLayoutCompat layoutBtnPrintQrCode;
    @NonNull
    public final LinearLayoutCompat layoutBtnSendEmail;
    @NonNull
    public final LinearLayoutCompat layoutBtnSendMMS;
    @NonNull
    public final ConstraintLayout layoutHeaderSection;
    @NonNull
    public final ConstraintLayout layoutQrCodeSection;
    @NonNull
    public final ConstraintLayout layoutRoot;
    @NonNull
    public final LinearLayoutCompat layoutSettingOption;
    @NonNull
    public final NestedScrollView mainContainer;
    @NonNull
    public final DtacFontTextView tvMobileNumberTitle;
    @NonNull
    public final DtacFontTextView tvMobileNumberValue;
    @NonNull
    public final DtacFontTextView tvSettingEmailTitle;
    @NonNull
    public final DtacFontTextView tvSettingLetterTitle;
    @NonNull
    public final DtacFontTextView tvSettingMMSTitle;
    @NonNull
    public final DtacFontTextView tvSettingPrintQrCodeTitle;
    @NonNull
    public final DtacFontTextView tvShowQrCodeTitle;
    @NonNull
    public final View vGuildLine;

    public FragmentEsimShowQrCodeBinding(NestedScrollView nestedScrollView, DtacFontButton dtacFontButton, ImageView imageView, LinearLayoutCompat linearLayoutCompat, LinearLayoutCompat linearLayoutCompat2, LinearLayoutCompat linearLayoutCompat3, ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2, ConstraintLayout constraintLayout3, LinearLayoutCompat linearLayoutCompat4, NestedScrollView nestedScrollView2, DtacFontTextView dtacFontTextView, DtacFontTextView dtacFontTextView2, DtacFontTextView dtacFontTextView3, DtacFontTextView dtacFontTextView4, DtacFontTextView dtacFontTextView5, DtacFontTextView dtacFontTextView6, DtacFontTextView dtacFontTextView7, View view) {
        this.f83847a = nestedScrollView;
        this.btnOk = dtacFontButton;
        this.ivQrCode = imageView;
        this.layoutBtnPrintQrCode = linearLayoutCompat;
        this.layoutBtnSendEmail = linearLayoutCompat2;
        this.layoutBtnSendMMS = linearLayoutCompat3;
        this.layoutHeaderSection = constraintLayout;
        this.layoutQrCodeSection = constraintLayout2;
        this.layoutRoot = constraintLayout3;
        this.layoutSettingOption = linearLayoutCompat4;
        this.mainContainer = nestedScrollView2;
        this.tvMobileNumberTitle = dtacFontTextView;
        this.tvMobileNumberValue = dtacFontTextView2;
        this.tvSettingEmailTitle = dtacFontTextView3;
        this.tvSettingLetterTitle = dtacFontTextView4;
        this.tvSettingMMSTitle = dtacFontTextView5;
        this.tvSettingPrintQrCodeTitle = dtacFontTextView6;
        this.tvShowQrCodeTitle = dtacFontTextView7;
        this.vGuildLine = view;
    }

    @NonNull
    public static FragmentEsimShowQrCodeBinding bind(@NonNull View view) {
        View findChildViewById;
        int i = R.id.btnOk;
        DtacFontButton dtacFontButton = (DtacFontButton) ViewBindings.findChildViewById(view, i);
        if (dtacFontButton != null) {
            i = R.id.ivQrCode;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
            if (imageView != null) {
                i = R.id.layoutBtnPrintQrCode;
                LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i);
                if (linearLayoutCompat != null) {
                    i = R.id.layoutBtnSendEmail;
                    LinearLayoutCompat linearLayoutCompat2 = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i);
                    if (linearLayoutCompat2 != null) {
                        i = R.id.layoutBtnSendMMS;
                        LinearLayoutCompat linearLayoutCompat3 = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i);
                        if (linearLayoutCompat3 != null) {
                            i = R.id.layoutHeaderSection;
                            ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
                            if (constraintLayout != null) {
                                i = R.id.layoutQrCodeSection;
                                ConstraintLayout constraintLayout2 = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
                                if (constraintLayout2 != null) {
                                    i = R.id.layoutRoot;
                                    ConstraintLayout constraintLayout3 = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
                                    if (constraintLayout3 != null) {
                                        i = R.id.layoutSettingOption;
                                        LinearLayoutCompat linearLayoutCompat4 = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i);
                                        if (linearLayoutCompat4 != null) {
                                            NestedScrollView nestedScrollView = (NestedScrollView) view;
                                            i = R.id.tvMobileNumberTitle;
                                            DtacFontTextView dtacFontTextView = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                                            if (dtacFontTextView != null) {
                                                i = R.id.tvMobileNumberValue;
                                                DtacFontTextView dtacFontTextView2 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                                                if (dtacFontTextView2 != null) {
                                                    i = R.id.tvSettingEmailTitle;
                                                    DtacFontTextView dtacFontTextView3 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                                                    if (dtacFontTextView3 != null) {
                                                        i = R.id.tvSettingLetterTitle;
                                                        DtacFontTextView dtacFontTextView4 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                                                        if (dtacFontTextView4 != null) {
                                                            i = R.id.tvSettingMMSTitle;
                                                            DtacFontTextView dtacFontTextView5 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                                                            if (dtacFontTextView5 != null) {
                                                                i = R.id.tvSettingPrintQrCodeTitle;
                                                                DtacFontTextView dtacFontTextView6 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                                                                if (dtacFontTextView6 != null) {
                                                                    i = R.id.tvShowQrCodeTitle;
                                                                    DtacFontTextView dtacFontTextView7 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                                                                    if (dtacFontTextView7 != null && (findChildViewById = ViewBindings.findChildViewById(view, (i = R.id.vGuildLine))) != null) {
                                                                        return new FragmentEsimShowQrCodeBinding(nestedScrollView, dtacFontButton, imageView, linearLayoutCompat, linearLayoutCompat2, linearLayoutCompat3, constraintLayout, constraintLayout2, constraintLayout3, linearLayoutCompat4, nestedScrollView, dtacFontTextView, dtacFontTextView2, dtacFontTextView3, dtacFontTextView4, dtacFontTextView5, dtacFontTextView6, dtacFontTextView7, findChildViewById);
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
    public static FragmentEsimShowQrCodeBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentEsimShowQrCodeBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_esim_show_qr_code, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public NestedScrollView getRoot() {
        return this.f83847a;
    }
}