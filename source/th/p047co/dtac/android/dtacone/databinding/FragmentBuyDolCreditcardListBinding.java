package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.textfield.TextInputLayout;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.widget.view.CreditCardEditText;
import th.p047co.dtac.android.dtacone.widget.view.DtacClearableEditText;
import th.p047co.dtac.android.dtacone.widget.view.DtacEditText;
import th.p047co.dtac.android.dtacone.widget.view.DtacFontButton;
import th.p047co.dtac.android.dtacone.widget.view.DtacFontTextView;
import th.p047co.dtac.android.dtacone.widget.view.DtacRecyclerView;

/* renamed from: th.co.dtac.android.dtacone.databinding.FragmentBuyDolCreditcardListBinding */
/* loaded from: classes7.dex */
public final class FragmentBuyDolCreditcardListBinding implements ViewBinding {

    /* renamed from: a */
    public final LinearLayout f83646a;
    @NonNull
    public final LinearLayout addMoreCredit;
    @NonNull
    public final LinearLayout addMoreView;
    @NonNull
    public final DtacFontButton btnConfirm;
    @NonNull
    public final LinearLayout cancelAddMoreCredit;
    @NonNull
    public final AppCompatCheckBox checkboxSaveCredit;
    @NonNull
    public final DtacClearableEditText edtCardExpired;
    @NonNull
    public final CreditCardEditText edtCreditCard;
    @NonNull
    public final TextInputLayout edtCreditCardLayout;
    @NonNull
    public final DtacEditText edtCvvCard;
    @NonNull
    public final TextInputLayout edtCvvCardLayout;
    @NonNull
    public final DtacClearableEditText edtUserCreditCard;
    @NonNull
    public final TextInputLayout edtUserCreditCardLayout;
    @NonNull
    public final TextInputLayout inputExpiredDate;
    @NonNull
    public final AppCompatImageView ivCreditBrand;
    @NonNull
    public final DtacRecyclerView recyclerViewListCard;
    @NonNull
    public final DtacFontTextView tvAddCreditCard;
    @NonNull
    public final DtacFontTextView tvSelectAccount;

    public FragmentBuyDolCreditcardListBinding(LinearLayout linearLayout, LinearLayout linearLayout2, LinearLayout linearLayout3, DtacFontButton dtacFontButton, LinearLayout linearLayout4, AppCompatCheckBox appCompatCheckBox, DtacClearableEditText dtacClearableEditText, CreditCardEditText creditCardEditText, TextInputLayout textInputLayout, DtacEditText dtacEditText, TextInputLayout textInputLayout2, DtacClearableEditText dtacClearableEditText2, TextInputLayout textInputLayout3, TextInputLayout textInputLayout4, AppCompatImageView appCompatImageView, DtacRecyclerView dtacRecyclerView, DtacFontTextView dtacFontTextView, DtacFontTextView dtacFontTextView2) {
        this.f83646a = linearLayout;
        this.addMoreCredit = linearLayout2;
        this.addMoreView = linearLayout3;
        this.btnConfirm = dtacFontButton;
        this.cancelAddMoreCredit = linearLayout4;
        this.checkboxSaveCredit = appCompatCheckBox;
        this.edtCardExpired = dtacClearableEditText;
        this.edtCreditCard = creditCardEditText;
        this.edtCreditCardLayout = textInputLayout;
        this.edtCvvCard = dtacEditText;
        this.edtCvvCardLayout = textInputLayout2;
        this.edtUserCreditCard = dtacClearableEditText2;
        this.edtUserCreditCardLayout = textInputLayout3;
        this.inputExpiredDate = textInputLayout4;
        this.ivCreditBrand = appCompatImageView;
        this.recyclerViewListCard = dtacRecyclerView;
        this.tvAddCreditCard = dtacFontTextView;
        this.tvSelectAccount = dtacFontTextView2;
    }

    @NonNull
    public static FragmentBuyDolCreditcardListBinding bind(@NonNull View view) {
        int i = R.id.addMoreCredit;
        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i);
        if (linearLayout != null) {
            i = R.id.addMoreView;
            LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(view, i);
            if (linearLayout2 != null) {
                i = R.id.btnConfirm;
                DtacFontButton dtacFontButton = (DtacFontButton) ViewBindings.findChildViewById(view, i);
                if (dtacFontButton != null) {
                    i = R.id.cancelAddMoreCredit;
                    LinearLayout linearLayout3 = (LinearLayout) ViewBindings.findChildViewById(view, i);
                    if (linearLayout3 != null) {
                        i = R.id.checkbox_save_credit;
                        AppCompatCheckBox appCompatCheckBox = (AppCompatCheckBox) ViewBindings.findChildViewById(view, i);
                        if (appCompatCheckBox != null) {
                            i = R.id.edt_card_expired;
                            DtacClearableEditText dtacClearableEditText = (DtacClearableEditText) ViewBindings.findChildViewById(view, i);
                            if (dtacClearableEditText != null) {
                                i = R.id.edt_credit_card;
                                CreditCardEditText creditCardEditText = (CreditCardEditText) ViewBindings.findChildViewById(view, i);
                                if (creditCardEditText != null) {
                                    i = R.id.edt_credit_card_layout;
                                    TextInputLayout textInputLayout = (TextInputLayout) ViewBindings.findChildViewById(view, i);
                                    if (textInputLayout != null) {
                                        i = R.id.edt_cvv_card;
                                        DtacEditText dtacEditText = (DtacEditText) ViewBindings.findChildViewById(view, i);
                                        if (dtacEditText != null) {
                                            i = R.id.edt_cvv_card_layout;
                                            TextInputLayout textInputLayout2 = (TextInputLayout) ViewBindings.findChildViewById(view, i);
                                            if (textInputLayout2 != null) {
                                                i = R.id.edt_user_credit_card;
                                                DtacClearableEditText dtacClearableEditText2 = (DtacClearableEditText) ViewBindings.findChildViewById(view, i);
                                                if (dtacClearableEditText2 != null) {
                                                    i = R.id.edt_user_credit_card_layout;
                                                    TextInputLayout textInputLayout3 = (TextInputLayout) ViewBindings.findChildViewById(view, i);
                                                    if (textInputLayout3 != null) {
                                                        i = R.id.inputExpiredDate;
                                                        TextInputLayout textInputLayout4 = (TextInputLayout) ViewBindings.findChildViewById(view, i);
                                                        if (textInputLayout4 != null) {
                                                            i = R.id.ivCreditBrand;
                                                            AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(view, i);
                                                            if (appCompatImageView != null) {
                                                                i = R.id.recyclerViewListCard;
                                                                DtacRecyclerView dtacRecyclerView = (DtacRecyclerView) ViewBindings.findChildViewById(view, i);
                                                                if (dtacRecyclerView != null) {
                                                                    i = R.id.tvAddCreditCard;
                                                                    DtacFontTextView dtacFontTextView = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                                                                    if (dtacFontTextView != null) {
                                                                        i = R.id.tvSelectAccount;
                                                                        DtacFontTextView dtacFontTextView2 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                                                                        if (dtacFontTextView2 != null) {
                                                                            return new FragmentBuyDolCreditcardListBinding((LinearLayout) view, linearLayout, linearLayout2, dtacFontButton, linearLayout3, appCompatCheckBox, dtacClearableEditText, creditCardEditText, textInputLayout, dtacEditText, textInputLayout2, dtacClearableEditText2, textInputLayout3, textInputLayout4, appCompatImageView, dtacRecyclerView, dtacFontTextView, dtacFontTextView2);
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
    public static FragmentBuyDolCreditcardListBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentBuyDolCreditcardListBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_buy_dol_creditcard_list, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayout getRoot() {
        return this.f83646a;
    }
}
