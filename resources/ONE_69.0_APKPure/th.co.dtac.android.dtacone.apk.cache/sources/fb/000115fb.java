package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.app_one.widget.OneFontButton;
import th.p047co.dtac.android.dtacone.app_one.widget.OneFontTextView;

/* renamed from: th.co.dtac.android.dtacone.databinding.FragmentOneChangeOwnerSummaryBinding */
/* loaded from: classes7.dex */
public final class FragmentOneChangeOwnerSummaryBinding implements ViewBinding {

    /* renamed from: a */
    public final NestedScrollView f84010a;
    @NonNull
    public final OneFontButton btnCancel;
    @NonNull
    public final OneFontButton btnOk;
    @NonNull
    public final ConstraintLayout cardInfo;
    @NonNull
    public final LinearLayout layoutButtonOkCancel;
    @NonNull
    public final LinearLayoutCompat rootLayout;
    @NonNull
    public final LinearLayoutCompat slideImage;
    @NonNull
    public final OneFontTextView tvBirthDate;
    @NonNull
    public final OneFontTextView tvBirthDateLabel;
    @NonNull
    public final OneFontTextView tvIdCard;
    @NonNull
    public final OneFontTextView tvIdCardLabel;
    @NonNull
    public final OneFontTextView tvIdCardType;
    @NonNull
    public final OneFontTextView tvIdCardTypeLabel;
    @NonNull
    public final OneFontTextView tvLastName;
    @NonNull
    public final OneFontTextView tvLastNameLabel;
    @NonNull
    public final OneFontTextView tvName;
    @NonNull
    public final OneFontTextView tvNameLabel;
    @NonNull
    public final OneFontTextView tvPhoneNumber;
    @NonNull
    public final OneFontTextView tvPhoneNumberLabel;
    @NonNull
    public final OneFontTextView tvRefDoc;
    @NonNull
    public final OneFontTextView tvRefDocLabel;

    public FragmentOneChangeOwnerSummaryBinding(NestedScrollView nestedScrollView, OneFontButton oneFontButton, OneFontButton oneFontButton2, ConstraintLayout constraintLayout, LinearLayout linearLayout, LinearLayoutCompat linearLayoutCompat, LinearLayoutCompat linearLayoutCompat2, OneFontTextView oneFontTextView, OneFontTextView oneFontTextView2, OneFontTextView oneFontTextView3, OneFontTextView oneFontTextView4, OneFontTextView oneFontTextView5, OneFontTextView oneFontTextView6, OneFontTextView oneFontTextView7, OneFontTextView oneFontTextView8, OneFontTextView oneFontTextView9, OneFontTextView oneFontTextView10, OneFontTextView oneFontTextView11, OneFontTextView oneFontTextView12, OneFontTextView oneFontTextView13, OneFontTextView oneFontTextView14) {
        this.f84010a = nestedScrollView;
        this.btnCancel = oneFontButton;
        this.btnOk = oneFontButton2;
        this.cardInfo = constraintLayout;
        this.layoutButtonOkCancel = linearLayout;
        this.rootLayout = linearLayoutCompat;
        this.slideImage = linearLayoutCompat2;
        this.tvBirthDate = oneFontTextView;
        this.tvBirthDateLabel = oneFontTextView2;
        this.tvIdCard = oneFontTextView3;
        this.tvIdCardLabel = oneFontTextView4;
        this.tvIdCardType = oneFontTextView5;
        this.tvIdCardTypeLabel = oneFontTextView6;
        this.tvLastName = oneFontTextView7;
        this.tvLastNameLabel = oneFontTextView8;
        this.tvName = oneFontTextView9;
        this.tvNameLabel = oneFontTextView10;
        this.tvPhoneNumber = oneFontTextView11;
        this.tvPhoneNumberLabel = oneFontTextView12;
        this.tvRefDoc = oneFontTextView13;
        this.tvRefDocLabel = oneFontTextView14;
    }

    @NonNull
    public static FragmentOneChangeOwnerSummaryBinding bind(@NonNull View view) {
        int i = R.id.btnCancel;
        OneFontButton oneFontButton = (OneFontButton) ViewBindings.findChildViewById(view, i);
        if (oneFontButton != null) {
            i = R.id.btnOk;
            OneFontButton oneFontButton2 = (OneFontButton) ViewBindings.findChildViewById(view, i);
            if (oneFontButton2 != null) {
                i = R.id.cardInfo;
                ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
                if (constraintLayout != null) {
                    i = R.id.layoutButtonOkCancel;
                    LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i);
                    if (linearLayout != null) {
                        i = R.id.rootLayout;
                        LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i);
                        if (linearLayoutCompat != null) {
                            i = R.id.slideImage;
                            LinearLayoutCompat linearLayoutCompat2 = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i);
                            if (linearLayoutCompat2 != null) {
                                i = R.id.tv_birth_date;
                                OneFontTextView oneFontTextView = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                if (oneFontTextView != null) {
                                    i = R.id.tv_birth_date_label;
                                    OneFontTextView oneFontTextView2 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                    if (oneFontTextView2 != null) {
                                        i = R.id.tv_id_card;
                                        OneFontTextView oneFontTextView3 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                        if (oneFontTextView3 != null) {
                                            i = R.id.tv_id_card_label;
                                            OneFontTextView oneFontTextView4 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                            if (oneFontTextView4 != null) {
                                                i = R.id.tv_id_card_type;
                                                OneFontTextView oneFontTextView5 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                                if (oneFontTextView5 != null) {
                                                    i = R.id.tv_id_card_type_label;
                                                    OneFontTextView oneFontTextView6 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                                    if (oneFontTextView6 != null) {
                                                        i = R.id.tv_last_name;
                                                        OneFontTextView oneFontTextView7 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                                        if (oneFontTextView7 != null) {
                                                            i = R.id.tv_last_name_label;
                                                            OneFontTextView oneFontTextView8 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                                            if (oneFontTextView8 != null) {
                                                                i = R.id.tv_name;
                                                                OneFontTextView oneFontTextView9 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                                                if (oneFontTextView9 != null) {
                                                                    i = R.id.tv_name_label;
                                                                    OneFontTextView oneFontTextView10 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                                                    if (oneFontTextView10 != null) {
                                                                        i = R.id.tv_phone_number;
                                                                        OneFontTextView oneFontTextView11 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                                                        if (oneFontTextView11 != null) {
                                                                            i = R.id.tv_phone_number_label;
                                                                            OneFontTextView oneFontTextView12 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                                                            if (oneFontTextView12 != null) {
                                                                                i = R.id.tv_ref_doc;
                                                                                OneFontTextView oneFontTextView13 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                                                                if (oneFontTextView13 != null) {
                                                                                    i = R.id.tv_ref_doc_label;
                                                                                    OneFontTextView oneFontTextView14 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                                                                    if (oneFontTextView14 != null) {
                                                                                        return new FragmentOneChangeOwnerSummaryBinding((NestedScrollView) view, oneFontButton, oneFontButton2, constraintLayout, linearLayout, linearLayoutCompat, linearLayoutCompat2, oneFontTextView, oneFontTextView2, oneFontTextView3, oneFontTextView4, oneFontTextView5, oneFontTextView6, oneFontTextView7, oneFontTextView8, oneFontTextView9, oneFontTextView10, oneFontTextView11, oneFontTextView12, oneFontTextView13, oneFontTextView14);
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
    public static FragmentOneChangeOwnerSummaryBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentOneChangeOwnerSummaryBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_one_change_owner_summary, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public NestedScrollView getRoot() {
        return this.f84010a;
    }
}