package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.core.widget.NestedScrollView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.inthecheesefactory.thecheeselibrary.widget.AdjustableImageView;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.widget.view.DtacFontButton;
import th.p047co.dtac.android.dtacone.widget.view.DtacFontTextView;

/* renamed from: th.co.dtac.android.dtacone.databinding.FragmentMrtrPrepaidReregistSubmitBinding */
/* loaded from: classes7.dex */
public final class FragmentMrtrPrepaidReregistSubmitBinding implements ViewBinding {

    /* renamed from: a */
    public final NestedScrollView f83969a;
    @NonNull
    public final DtacFontButton btnCancel;
    @NonNull
    public final DtacFontButton btnOk;
    @NonNull
    public final AdjustableImageView cardImage;
    @NonNull
    public final RelativeLayout cardInfo;
    @NonNull
    public final ZIncludeViewpagerImageBinding incViewPager;
    @NonNull
    public final LinearLayout rootLayout;
    @NonNull
    public final LinearLayoutCompat slideImage;
    @NonNull
    public final DtacFontTextView tvBirthDate;
    @NonNull
    public final DtacFontTextView tvBirthDateLabel;
    @NonNull
    public final DtacFontTextView tvIdCard;
    @NonNull
    public final DtacFontTextView tvIdCardLabel;
    @NonNull
    public final DtacFontTextView tvIdCardType;
    @NonNull
    public final DtacFontTextView tvIdCardTypeLabel;
    @NonNull
    public final DtacFontTextView tvLastName;
    @NonNull
    public final DtacFontTextView tvLastNameLabel;
    @NonNull
    public final DtacFontTextView tvName;
    @NonNull
    public final DtacFontTextView tvNameLabel;
    @NonNull
    public final DtacFontTextView tvPhoneNumber;
    @NonNull
    public final DtacFontTextView tvPhoneNumberLabel;
    @NonNull
    public final DtacFontTextView tvRefDoc;
    @NonNull
    public final DtacFontTextView tvRefDocLabel;
    @NonNull
    public final DtacFontTextView tvSummary;
    @NonNull
    public final DtacFontTextView tvWatermark;

    public FragmentMrtrPrepaidReregistSubmitBinding(NestedScrollView nestedScrollView, DtacFontButton dtacFontButton, DtacFontButton dtacFontButton2, AdjustableImageView adjustableImageView, RelativeLayout relativeLayout, ZIncludeViewpagerImageBinding zIncludeViewpagerImageBinding, LinearLayout linearLayout, LinearLayoutCompat linearLayoutCompat, DtacFontTextView dtacFontTextView, DtacFontTextView dtacFontTextView2, DtacFontTextView dtacFontTextView3, DtacFontTextView dtacFontTextView4, DtacFontTextView dtacFontTextView5, DtacFontTextView dtacFontTextView6, DtacFontTextView dtacFontTextView7, DtacFontTextView dtacFontTextView8, DtacFontTextView dtacFontTextView9, DtacFontTextView dtacFontTextView10, DtacFontTextView dtacFontTextView11, DtacFontTextView dtacFontTextView12, DtacFontTextView dtacFontTextView13, DtacFontTextView dtacFontTextView14, DtacFontTextView dtacFontTextView15, DtacFontTextView dtacFontTextView16) {
        this.f83969a = nestedScrollView;
        this.btnCancel = dtacFontButton;
        this.btnOk = dtacFontButton2;
        this.cardImage = adjustableImageView;
        this.cardInfo = relativeLayout;
        this.incViewPager = zIncludeViewpagerImageBinding;
        this.rootLayout = linearLayout;
        this.slideImage = linearLayoutCompat;
        this.tvBirthDate = dtacFontTextView;
        this.tvBirthDateLabel = dtacFontTextView2;
        this.tvIdCard = dtacFontTextView3;
        this.tvIdCardLabel = dtacFontTextView4;
        this.tvIdCardType = dtacFontTextView5;
        this.tvIdCardTypeLabel = dtacFontTextView6;
        this.tvLastName = dtacFontTextView7;
        this.tvLastNameLabel = dtacFontTextView8;
        this.tvName = dtacFontTextView9;
        this.tvNameLabel = dtacFontTextView10;
        this.tvPhoneNumber = dtacFontTextView11;
        this.tvPhoneNumberLabel = dtacFontTextView12;
        this.tvRefDoc = dtacFontTextView13;
        this.tvRefDocLabel = dtacFontTextView14;
        this.tvSummary = dtacFontTextView15;
        this.tvWatermark = dtacFontTextView16;
    }

    @NonNull
    public static FragmentMrtrPrepaidReregistSubmitBinding bind(@NonNull View view) {
        View findChildViewById;
        int i = R.id.btnCancel;
        DtacFontButton dtacFontButton = (DtacFontButton) ViewBindings.findChildViewById(view, i);
        if (dtacFontButton != null) {
            i = R.id.btnOk;
            DtacFontButton dtacFontButton2 = (DtacFontButton) ViewBindings.findChildViewById(view, i);
            if (dtacFontButton2 != null) {
                i = R.id.card_image;
                AdjustableImageView adjustableImageView = (AdjustableImageView) ViewBindings.findChildViewById(view, i);
                if (adjustableImageView != null) {
                    i = R.id.cardInfo;
                    RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, i);
                    if (relativeLayout != null && (findChildViewById = ViewBindings.findChildViewById(view, (i = R.id.incViewPager))) != null) {
                        ZIncludeViewpagerImageBinding bind = ZIncludeViewpagerImageBinding.bind(findChildViewById);
                        i = R.id.rootLayout;
                        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i);
                        if (linearLayout != null) {
                            i = R.id.slideImage;
                            LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i);
                            if (linearLayoutCompat != null) {
                                i = R.id.tv_birth_date;
                                DtacFontTextView dtacFontTextView = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                                if (dtacFontTextView != null) {
                                    i = R.id.tv_birth_date_label;
                                    DtacFontTextView dtacFontTextView2 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                                    if (dtacFontTextView2 != null) {
                                        i = R.id.tv_id_card;
                                        DtacFontTextView dtacFontTextView3 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                                        if (dtacFontTextView3 != null) {
                                            i = R.id.tv_id_card_label;
                                            DtacFontTextView dtacFontTextView4 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                                            if (dtacFontTextView4 != null) {
                                                i = R.id.tv_id_card_type;
                                                DtacFontTextView dtacFontTextView5 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                                                if (dtacFontTextView5 != null) {
                                                    i = R.id.tv_id_card_type_label;
                                                    DtacFontTextView dtacFontTextView6 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                                                    if (dtacFontTextView6 != null) {
                                                        i = R.id.tv_last_name;
                                                        DtacFontTextView dtacFontTextView7 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                                                        if (dtacFontTextView7 != null) {
                                                            i = R.id.tv_last_name_label;
                                                            DtacFontTextView dtacFontTextView8 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                                                            if (dtacFontTextView8 != null) {
                                                                i = R.id.tv_name;
                                                                DtacFontTextView dtacFontTextView9 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                                                                if (dtacFontTextView9 != null) {
                                                                    i = R.id.tv_name_label;
                                                                    DtacFontTextView dtacFontTextView10 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                                                                    if (dtacFontTextView10 != null) {
                                                                        i = R.id.tv_phone_number;
                                                                        DtacFontTextView dtacFontTextView11 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                                                                        if (dtacFontTextView11 != null) {
                                                                            i = R.id.tv_phone_number_label;
                                                                            DtacFontTextView dtacFontTextView12 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                                                                            if (dtacFontTextView12 != null) {
                                                                                i = R.id.tv_ref_doc;
                                                                                DtacFontTextView dtacFontTextView13 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                                                                                if (dtacFontTextView13 != null) {
                                                                                    i = R.id.tv_ref_doc_label;
                                                                                    DtacFontTextView dtacFontTextView14 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                                                                                    if (dtacFontTextView14 != null) {
                                                                                        i = R.id.tv_summary;
                                                                                        DtacFontTextView dtacFontTextView15 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                                                                                        if (dtacFontTextView15 != null) {
                                                                                            i = R.id.tvWatermark;
                                                                                            DtacFontTextView dtacFontTextView16 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                                                                                            if (dtacFontTextView16 != null) {
                                                                                                return new FragmentMrtrPrepaidReregistSubmitBinding((NestedScrollView) view, dtacFontButton, dtacFontButton2, adjustableImageView, relativeLayout, bind, linearLayout, linearLayoutCompat, dtacFontTextView, dtacFontTextView2, dtacFontTextView3, dtacFontTextView4, dtacFontTextView5, dtacFontTextView6, dtacFontTextView7, dtacFontTextView8, dtacFontTextView9, dtacFontTextView10, dtacFontTextView11, dtacFontTextView12, dtacFontTextView13, dtacFontTextView14, dtacFontTextView15, dtacFontTextView16);
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
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static FragmentMrtrPrepaidReregistSubmitBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentMrtrPrepaidReregistSubmitBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_mrtr_prepaid_reregist_submit, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public NestedScrollView getRoot() {
        return this.f83969a;
    }
}