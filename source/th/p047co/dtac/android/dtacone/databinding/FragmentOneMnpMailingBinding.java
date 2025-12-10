package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ToggleButton;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.app_one.widget.OneCustomClearableEditText;
import th.p047co.dtac.android.dtacone.app_one.widget.OneFontButton;
import th.p047co.dtac.android.dtacone.app_one.widget.OneFontTextView;

/* renamed from: th.co.dtac.android.dtacone.databinding.FragmentOneMnpMailingBinding */
/* loaded from: classes7.dex */
public final class FragmentOneMnpMailingBinding implements ViewBinding {

    /* renamed from: a */
    public final NestedScrollView f83973a;
    @NonNull
    public final OneFontButton btnConfirm;
    @NonNull
    public final OneCustomClearableEditText edtBirthDay;
    @NonNull
    public final OneCustomClearableEditText edtIdCard;
    @NonNull
    public final OneCustomClearableEditText edtName;
    @NonNull
    public final OneCustomClearableEditText edtSureName;
    @NonNull
    public final ToggleButton languageSelect;
    @NonNull
    public final LinearLayoutCompat layoutContent;
    @NonNull
    public final ConstraintLayout layoutGender;
    @NonNull
    public final ConstraintLayout layoutLanguage;
    @NonNull
    public final NestedScrollView scrollView;
    @NonNull
    public final ToggleButton tbGender;
    @NonNull
    public final OneFontTextView tvGenderTitle;
    @NonNull
    public final OneFontTextView tvMailingTitle;
    @NonNull
    public final OneFontTextView tvMsisdn;
    @NonNull
    public final OneFontTextView tvProfileTitle;
    @NonNull
    public final OneFontTextView tvTitle;

    public FragmentOneMnpMailingBinding(NestedScrollView nestedScrollView, OneFontButton oneFontButton, OneCustomClearableEditText oneCustomClearableEditText, OneCustomClearableEditText oneCustomClearableEditText2, OneCustomClearableEditText oneCustomClearableEditText3, OneCustomClearableEditText oneCustomClearableEditText4, ToggleButton toggleButton, LinearLayoutCompat linearLayoutCompat, ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2, NestedScrollView nestedScrollView2, ToggleButton toggleButton2, OneFontTextView oneFontTextView, OneFontTextView oneFontTextView2, OneFontTextView oneFontTextView3, OneFontTextView oneFontTextView4, OneFontTextView oneFontTextView5) {
        this.f83973a = nestedScrollView;
        this.btnConfirm = oneFontButton;
        this.edtBirthDay = oneCustomClearableEditText;
        this.edtIdCard = oneCustomClearableEditText2;
        this.edtName = oneCustomClearableEditText3;
        this.edtSureName = oneCustomClearableEditText4;
        this.languageSelect = toggleButton;
        this.layoutContent = linearLayoutCompat;
        this.layoutGender = constraintLayout;
        this.layoutLanguage = constraintLayout2;
        this.scrollView = nestedScrollView2;
        this.tbGender = toggleButton2;
        this.tvGenderTitle = oneFontTextView;
        this.tvMailingTitle = oneFontTextView2;
        this.tvMsisdn = oneFontTextView3;
        this.tvProfileTitle = oneFontTextView4;
        this.tvTitle = oneFontTextView5;
    }

    @NonNull
    public static FragmentOneMnpMailingBinding bind(@NonNull View view) {
        int i = R.id.btnConfirm;
        OneFontButton oneFontButton = (OneFontButton) ViewBindings.findChildViewById(view, i);
        if (oneFontButton != null) {
            i = R.id.edtBirthDay;
            OneCustomClearableEditText oneCustomClearableEditText = (OneCustomClearableEditText) ViewBindings.findChildViewById(view, i);
            if (oneCustomClearableEditText != null) {
                i = R.id.edtIdCard;
                OneCustomClearableEditText oneCustomClearableEditText2 = (OneCustomClearableEditText) ViewBindings.findChildViewById(view, i);
                if (oneCustomClearableEditText2 != null) {
                    i = R.id.edtName;
                    OneCustomClearableEditText oneCustomClearableEditText3 = (OneCustomClearableEditText) ViewBindings.findChildViewById(view, i);
                    if (oneCustomClearableEditText3 != null) {
                        i = R.id.edtSureName;
                        OneCustomClearableEditText oneCustomClearableEditText4 = (OneCustomClearableEditText) ViewBindings.findChildViewById(view, i);
                        if (oneCustomClearableEditText4 != null) {
                            i = R.id.languageSelect;
                            ToggleButton toggleButton = (ToggleButton) ViewBindings.findChildViewById(view, i);
                            if (toggleButton != null) {
                                i = R.id.layoutContent;
                                LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i);
                                if (linearLayoutCompat != null) {
                                    i = R.id.layoutGender;
                                    ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
                                    if (constraintLayout != null) {
                                        i = R.id.layoutLanguage;
                                        ConstraintLayout constraintLayout2 = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
                                        if (constraintLayout2 != null) {
                                            NestedScrollView nestedScrollView = (NestedScrollView) view;
                                            i = R.id.tbGender;
                                            ToggleButton toggleButton2 = (ToggleButton) ViewBindings.findChildViewById(view, i);
                                            if (toggleButton2 != null) {
                                                i = R.id.tvGenderTitle;
                                                OneFontTextView oneFontTextView = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                                if (oneFontTextView != null) {
                                                    i = R.id.tvMailingTitle;
                                                    OneFontTextView oneFontTextView2 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                                    if (oneFontTextView2 != null) {
                                                        i = R.id.tvMsisdn;
                                                        OneFontTextView oneFontTextView3 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                                        if (oneFontTextView3 != null) {
                                                            i = R.id.tvProfileTitle;
                                                            OneFontTextView oneFontTextView4 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                                            if (oneFontTextView4 != null) {
                                                                i = R.id.tvTitle;
                                                                OneFontTextView oneFontTextView5 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                                                if (oneFontTextView5 != null) {
                                                                    return new FragmentOneMnpMailingBinding(nestedScrollView, oneFontButton, oneCustomClearableEditText, oneCustomClearableEditText2, oneCustomClearableEditText3, oneCustomClearableEditText4, toggleButton, linearLayoutCompat, constraintLayout, constraintLayout2, nestedScrollView, toggleButton2, oneFontTextView, oneFontTextView2, oneFontTextView3, oneFontTextView4, oneFontTextView5);
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
    public static FragmentOneMnpMailingBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentOneMnpMailingBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_one_mnp_mailing, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public NestedScrollView getRoot() {
        return this.f83973a;
    }
}
