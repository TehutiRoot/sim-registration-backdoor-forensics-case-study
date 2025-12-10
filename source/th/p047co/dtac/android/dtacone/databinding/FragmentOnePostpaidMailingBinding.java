package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ToggleButton;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.core.widget.NestedScrollView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.app_one.widget.OneCustomClearableEditText;
import th.p047co.dtac.android.dtacone.app_one.widget.OneFontButton;
import th.p047co.dtac.android.dtacone.app_one.widget.OneFontTextView;

/* renamed from: th.co.dtac.android.dtacone.databinding.FragmentOnePostpaidMailingBinding */
/* loaded from: classes7.dex */
public final class FragmentOnePostpaidMailingBinding implements ViewBinding {

    /* renamed from: a */
    public final NestedScrollView f84030a;
    @NonNull
    public final OneFontButton btnConfirm;
    @NonNull
    public final OneCustomClearableEditText edtBirthDay;
    @NonNull
    public final OneCustomClearableEditText edtName;
    @NonNull
    public final OneCustomClearableEditText edtSureName;
    @NonNull
    public final ToggleButton languageSelect;
    @NonNull
    public final LinearLayoutCompat layoutContent;
    @NonNull
    public final NestedScrollView scrollView;
    @NonNull
    public final OneFontTextView tvMailingTitle;
    @NonNull
    public final OneFontTextView tvMsisdn;
    @NonNull
    public final OneFontTextView tvProfileTitle;
    @NonNull
    public final OneFontTextView tvTitle;

    public FragmentOnePostpaidMailingBinding(NestedScrollView nestedScrollView, OneFontButton oneFontButton, OneCustomClearableEditText oneCustomClearableEditText, OneCustomClearableEditText oneCustomClearableEditText2, OneCustomClearableEditText oneCustomClearableEditText3, ToggleButton toggleButton, LinearLayoutCompat linearLayoutCompat, NestedScrollView nestedScrollView2, OneFontTextView oneFontTextView, OneFontTextView oneFontTextView2, OneFontTextView oneFontTextView3, OneFontTextView oneFontTextView4) {
        this.f84030a = nestedScrollView;
        this.btnConfirm = oneFontButton;
        this.edtBirthDay = oneCustomClearableEditText;
        this.edtName = oneCustomClearableEditText2;
        this.edtSureName = oneCustomClearableEditText3;
        this.languageSelect = toggleButton;
        this.layoutContent = linearLayoutCompat;
        this.scrollView = nestedScrollView2;
        this.tvMailingTitle = oneFontTextView;
        this.tvMsisdn = oneFontTextView2;
        this.tvProfileTitle = oneFontTextView3;
        this.tvTitle = oneFontTextView4;
    }

    @NonNull
    public static FragmentOnePostpaidMailingBinding bind(@NonNull View view) {
        int i = R.id.btnConfirm;
        OneFontButton oneFontButton = (OneFontButton) ViewBindings.findChildViewById(view, i);
        if (oneFontButton != null) {
            i = R.id.edtBirthDay;
            OneCustomClearableEditText oneCustomClearableEditText = (OneCustomClearableEditText) ViewBindings.findChildViewById(view, i);
            if (oneCustomClearableEditText != null) {
                i = R.id.edtName;
                OneCustomClearableEditText oneCustomClearableEditText2 = (OneCustomClearableEditText) ViewBindings.findChildViewById(view, i);
                if (oneCustomClearableEditText2 != null) {
                    i = R.id.edtSureName;
                    OneCustomClearableEditText oneCustomClearableEditText3 = (OneCustomClearableEditText) ViewBindings.findChildViewById(view, i);
                    if (oneCustomClearableEditText3 != null) {
                        i = R.id.languageSelect;
                        ToggleButton toggleButton = (ToggleButton) ViewBindings.findChildViewById(view, i);
                        if (toggleButton != null) {
                            i = R.id.layoutContent;
                            LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) ViewBindings.findChildViewById(view, i);
                            if (linearLayoutCompat != null) {
                                NestedScrollView nestedScrollView = (NestedScrollView) view;
                                i = R.id.tv_mailing_title;
                                OneFontTextView oneFontTextView = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                if (oneFontTextView != null) {
                                    i = R.id.tvMsisdn;
                                    OneFontTextView oneFontTextView2 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                    if (oneFontTextView2 != null) {
                                        i = R.id.tvProfileTitle;
                                        OneFontTextView oneFontTextView3 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                        if (oneFontTextView3 != null) {
                                            i = R.id.tvTitle;
                                            OneFontTextView oneFontTextView4 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                            if (oneFontTextView4 != null) {
                                                return new FragmentOnePostpaidMailingBinding(nestedScrollView, oneFontButton, oneCustomClearableEditText, oneCustomClearableEditText2, oneCustomClearableEditText3, toggleButton, linearLayoutCompat, nestedScrollView, oneFontTextView, oneFontTextView2, oneFontTextView3, oneFontTextView4);
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
    public static FragmentOnePostpaidMailingBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentOnePostpaidMailingBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_one_postpaid_mailing, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public NestedScrollView getRoot() {
        return this.f84030a;
    }
}
