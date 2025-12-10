package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.inthecheesefactory.thecheeselibrary.widget.AdjustableImageView;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.widget.view.DtacFontTextView;

/* renamed from: th.co.dtac.android.dtacone.databinding.ZIncludeIdCardPreviewBinding */
/* loaded from: classes7.dex */
public final class ZIncludeIdCardPreviewBinding implements ViewBinding {

    /* renamed from: a */
    public final View f84732a;
    @NonNull
    public final AdjustableImageView cardImage;
    @NonNull
    public final RelativeLayout cardInfo;
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
    public final DtacFontTextView tvSummary;

    public ZIncludeIdCardPreviewBinding(View view, AdjustableImageView adjustableImageView, RelativeLayout relativeLayout, DtacFontTextView dtacFontTextView, DtacFontTextView dtacFontTextView2, DtacFontTextView dtacFontTextView3, DtacFontTextView dtacFontTextView4, DtacFontTextView dtacFontTextView5, DtacFontTextView dtacFontTextView6, DtacFontTextView dtacFontTextView7, DtacFontTextView dtacFontTextView8, DtacFontTextView dtacFontTextView9, DtacFontTextView dtacFontTextView10, DtacFontTextView dtacFontTextView11, DtacFontTextView dtacFontTextView12, DtacFontTextView dtacFontTextView13) {
        this.f84732a = view;
        this.cardImage = adjustableImageView;
        this.cardInfo = relativeLayout;
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
        this.tvSummary = dtacFontTextView13;
    }

    @NonNull
    public static ZIncludeIdCardPreviewBinding bind(@NonNull View view) {
        int i = R.id.card_image;
        AdjustableImageView adjustableImageView = (AdjustableImageView) ViewBindings.findChildViewById(view, i);
        if (adjustableImageView != null) {
            i = R.id.cardInfo;
            RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, i);
            if (relativeLayout != null) {
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
                                                                i = R.id.tv_summary;
                                                                DtacFontTextView dtacFontTextView13 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                                                                if (dtacFontTextView13 != null) {
                                                                    return new ZIncludeIdCardPreviewBinding(view, adjustableImageView, relativeLayout, dtacFontTextView, dtacFontTextView2, dtacFontTextView3, dtacFontTextView4, dtacFontTextView5, dtacFontTextView6, dtacFontTextView7, dtacFontTextView8, dtacFontTextView9, dtacFontTextView10, dtacFontTextView11, dtacFontTextView12, dtacFontTextView13);
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
    public static ZIncludeIdCardPreviewBinding inflate(@NonNull LayoutInflater layoutInflater, @NonNull ViewGroup viewGroup) {
        if (viewGroup != null) {
            layoutInflater.inflate(R.layout.z_include_id_card_preview, viewGroup);
            return bind(viewGroup);
        }
        throw new NullPointerException("parent");
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public View getRoot() {
        return this.f84732a;
    }
}