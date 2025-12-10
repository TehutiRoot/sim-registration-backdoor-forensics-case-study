package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
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

/* renamed from: th.co.dtac.android.dtacone.databinding.FragmentEsimChangeSimShowQrCodeBinding */
/* loaded from: classes7.dex */
public final class FragmentEsimChangeSimShowQrCodeBinding implements ViewBinding {

    /* renamed from: a */
    public final NestedScrollView f83716a;
    @NonNull
    public final DtacFontButton btnOk;
    @NonNull
    public final ImageView imageView40;
    @NonNull
    public final ImageView img;
    @NonNull
    public final ImageView ivQrCode;
    @NonNull
    public final LinearLayoutCompat layoutBtnPrintQrCode;
    @NonNull
    public final LinearLayoutCompat layoutBtnSendEmail;
    @NonNull
    public final LinearLayoutCompat layoutBtnSendMMS;
    @NonNull
    public final LinearLayout layoutDesc;
    @NonNull
    public final ConstraintLayout layoutHeaderSection;
    @NonNull
    public final ConstraintLayout layoutInfoESIM;
    @NonNull
    public final ConstraintLayout layoutQrCodeSection;
    @NonNull
    public final ConstraintLayout layoutRoot;
    @NonNull
    public final LinearLayoutCompat layoutSettingOption;
    @NonNull
    public final View line1;
    @NonNull
    public final DtacFontTextView tv1;
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

    public FragmentEsimChangeSimShowQrCodeBinding(NestedScrollView nestedScrollView, DtacFontButton dtacFontButton, ImageView imageView, ImageView imageView2, ImageView imageView3, LinearLayoutCompat linearLayoutCompat, LinearLayoutCompat linearLayoutCompat2, LinearLayoutCompat linearLayoutCompat3, LinearLayout linearLayout, ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2, ConstraintLayout constraintLayout3, ConstraintLayout constraintLayout4, LinearLayoutCompat linearLayoutCompat4, View view, DtacFontTextView dtacFontTextView, DtacFontTextView dtacFontTextView2, DtacFontTextView dtacFontTextView3, DtacFontTextView dtacFontTextView4, DtacFontTextView dtacFontTextView5, DtacFontTextView dtacFontTextView6, DtacFontTextView dtacFontTextView7, DtacFontTextView dtacFontTextView8, View view2) {
        this.f83716a = nestedScrollView;
        this.btnOk = dtacFontButton;
        this.imageView40 = imageView;
        this.img = imageView2;
        this.ivQrCode = imageView3;
        this.layoutBtnPrintQrCode = linearLayoutCompat;
        this.layoutBtnSendEmail = linearLayoutCompat2;
        this.layoutBtnSendMMS = linearLayoutCompat3;
        this.layoutDesc = linearLayout;
        this.layoutHeaderSection = constraintLayout;
        this.layoutInfoESIM = constraintLayout2;
        this.layoutQrCodeSection = constraintLayout3;
        this.layoutRoot = constraintLayout4;
        this.layoutSettingOption = linearLayoutCompat4;
        this.line1 = view;
        this.tv1 = dtacFontTextView;
        this.tvMobileNumberTitle = dtacFontTextView2;
        this.tvMobileNumberValue = dtacFontTextView3;
        this.tvSettingEmailTitle = dtacFontTextView4;
        this.tvSettingLetterTitle = dtacFontTextView5;
        this.tvSettingMMSTitle = dtacFontTextView6;
        this.tvSettingPrintQrCodeTitle = dtacFontTextView7;
        this.tvShowQrCodeTitle = dtacFontTextView8;
        this.vGuildLine = view2;
    }

    @NonNull
    public static FragmentEsimChangeSimShowQrCodeBinding bind(@NonNull View view) {
        View findChildViewById;
        View findChildViewById2;
        int i = R.id.btnOk;
        DtacFontButton dtacFontButton = (DtacFontButton) ViewBindings.findChildViewById(view, i);
        if (dtacFontButton != null) {
            i = R.id.imageView40;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
            if (imageView != null) {
                i = R.id.img;
                ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, i);
                if (imageView2 != null) {
                    i = R.id.ivQrCode;
                    ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(view, i);
                    if (imageView3 != null) {
                        i = R.id.layoutBtnPrintQrCode;
                        LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i);
                        if (linearLayoutCompat != null) {
                            i = R.id.layoutBtnSendEmail;
                            LinearLayoutCompat linearLayoutCompat2 = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i);
                            if (linearLayoutCompat2 != null) {
                                i = R.id.layoutBtnSendMMS;
                                LinearLayoutCompat linearLayoutCompat3 = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i);
                                if (linearLayoutCompat3 != null) {
                                    i = R.id.layoutDesc;
                                    LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i);
                                    if (linearLayout != null) {
                                        i = R.id.layoutHeaderSection;
                                        ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
                                        if (constraintLayout != null) {
                                            i = R.id.layoutInfoESIM;
                                            ConstraintLayout constraintLayout2 = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
                                            if (constraintLayout2 != null) {
                                                i = R.id.layoutQrCodeSection;
                                                ConstraintLayout constraintLayout3 = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
                                                if (constraintLayout3 != null) {
                                                    i = R.id.layoutRoot;
                                                    ConstraintLayout constraintLayout4 = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
                                                    if (constraintLayout4 != null) {
                                                        i = R.id.layoutSettingOption;
                                                        LinearLayoutCompat linearLayoutCompat4 = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i);
                                                        if (linearLayoutCompat4 != null && (findChildViewById = ViewBindings.findChildViewById(view, (i = R.id.line1))) != null) {
                                                            i = R.id.tv1;
                                                            DtacFontTextView dtacFontTextView = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                                                            if (dtacFontTextView != null) {
                                                                i = R.id.tvMobileNumberTitle;
                                                                DtacFontTextView dtacFontTextView2 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                                                                if (dtacFontTextView2 != null) {
                                                                    i = R.id.tvMobileNumberValue;
                                                                    DtacFontTextView dtacFontTextView3 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                                                                    if (dtacFontTextView3 != null) {
                                                                        i = R.id.tvSettingEmailTitle;
                                                                        DtacFontTextView dtacFontTextView4 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                                                                        if (dtacFontTextView4 != null) {
                                                                            i = R.id.tvSettingLetterTitle;
                                                                            DtacFontTextView dtacFontTextView5 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                                                                            if (dtacFontTextView5 != null) {
                                                                                i = R.id.tvSettingMMSTitle;
                                                                                DtacFontTextView dtacFontTextView6 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                                                                                if (dtacFontTextView6 != null) {
                                                                                    i = R.id.tvSettingPrintQrCodeTitle;
                                                                                    DtacFontTextView dtacFontTextView7 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                                                                                    if (dtacFontTextView7 != null) {
                                                                                        i = R.id.tvShowQrCodeTitle;
                                                                                        DtacFontTextView dtacFontTextView8 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                                                                                        if (dtacFontTextView8 != null && (findChildViewById2 = ViewBindings.findChildViewById(view, (i = R.id.vGuildLine))) != null) {
                                                                                            return new FragmentEsimChangeSimShowQrCodeBinding((NestedScrollView) view, dtacFontButton, imageView, imageView2, imageView3, linearLayoutCompat, linearLayoutCompat2, linearLayoutCompat3, linearLayout, constraintLayout, constraintLayout2, constraintLayout3, constraintLayout4, linearLayoutCompat4, findChildViewById, dtacFontTextView, dtacFontTextView2, dtacFontTextView3, dtacFontTextView4, dtacFontTextView5, dtacFontTextView6, dtacFontTextView7, dtacFontTextView8, findChildViewById2);
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
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static FragmentEsimChangeSimShowQrCodeBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentEsimChangeSimShowQrCodeBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_esim_change_sim_show_qr_code, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public NestedScrollView getRoot() {
        return this.f83716a;
    }
}
