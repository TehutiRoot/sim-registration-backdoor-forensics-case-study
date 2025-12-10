package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ToggleButton;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.app_one.widget.OneCustomClearableEditText;
import th.p047co.dtac.android.dtacone.app_one.widget.OneEditText;
import th.p047co.dtac.android.dtacone.app_one.widget.OneFontButton;
import th.p047co.dtac.android.dtacone.app_one.widget.OneFontTextView;

/* renamed from: th.co.dtac.android.dtacone.databinding.FragmentOnePre2postMailingBinding */
/* loaded from: classes7.dex */
public final class FragmentOnePre2postMailingBinding implements ViewBinding {

    /* renamed from: a */
    public final NestedScrollView f84072a;
    @NonNull
    public final OneEditText birthDayEditText;
    @NonNull
    public final ConstraintLayout birthDayLayout;
    @NonNull
    public final OneFontButton btnConfirm;
    @NonNull
    public final View calendarView;
    @NonNull
    public final OneCustomClearableEditText firstNameEditText;
    @NonNull
    public final ToggleButton languageSelect;
    @NonNull
    public final OneCustomClearableEditText lastNameEditText;
    @NonNull
    public final OneFontTextView msisdnTextView;
    @NonNull
    public final NestedScrollView scrollView;
    @NonNull
    public final OneFontTextView tvMailingTitle;
    @NonNull
    public final OneFontTextView tvProfileTitle;
    @NonNull
    public final OneFontTextView tvTitle;

    public FragmentOnePre2postMailingBinding(NestedScrollView nestedScrollView, OneEditText oneEditText, ConstraintLayout constraintLayout, OneFontButton oneFontButton, View view, OneCustomClearableEditText oneCustomClearableEditText, ToggleButton toggleButton, OneCustomClearableEditText oneCustomClearableEditText2, OneFontTextView oneFontTextView, NestedScrollView nestedScrollView2, OneFontTextView oneFontTextView2, OneFontTextView oneFontTextView3, OneFontTextView oneFontTextView4) {
        this.f84072a = nestedScrollView;
        this.birthDayEditText = oneEditText;
        this.birthDayLayout = constraintLayout;
        this.btnConfirm = oneFontButton;
        this.calendarView = view;
        this.firstNameEditText = oneCustomClearableEditText;
        this.languageSelect = toggleButton;
        this.lastNameEditText = oneCustomClearableEditText2;
        this.msisdnTextView = oneFontTextView;
        this.scrollView = nestedScrollView2;
        this.tvMailingTitle = oneFontTextView2;
        this.tvProfileTitle = oneFontTextView3;
        this.tvTitle = oneFontTextView4;
    }

    @NonNull
    public static FragmentOnePre2postMailingBinding bind(@NonNull View view) {
        View findChildViewById;
        int i = R.id.birthDayEditText;
        OneEditText oneEditText = (OneEditText) ViewBindings.findChildViewById(view, i);
        if (oneEditText != null) {
            i = R.id.birthDayLayout;
            ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
            if (constraintLayout != null) {
                i = R.id.btnConfirm;
                OneFontButton oneFontButton = (OneFontButton) ViewBindings.findChildViewById(view, i);
                if (oneFontButton != null && (findChildViewById = ViewBindings.findChildViewById(view, (i = R.id.calendarView))) != null) {
                    i = R.id.firstNameEditText;
                    OneCustomClearableEditText oneCustomClearableEditText = (OneCustomClearableEditText) ViewBindings.findChildViewById(view, i);
                    if (oneCustomClearableEditText != null) {
                        i = R.id.languageSelect;
                        ToggleButton toggleButton = (ToggleButton) ViewBindings.findChildViewById(view, i);
                        if (toggleButton != null) {
                            i = R.id.lastNameEditText;
                            OneCustomClearableEditText oneCustomClearableEditText2 = (OneCustomClearableEditText) ViewBindings.findChildViewById(view, i);
                            if (oneCustomClearableEditText2 != null) {
                                i = R.id.msisdnTextView;
                                OneFontTextView oneFontTextView = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                if (oneFontTextView != null) {
                                    NestedScrollView nestedScrollView = (NestedScrollView) view;
                                    i = R.id.tv_mailing_title;
                                    OneFontTextView oneFontTextView2 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                    if (oneFontTextView2 != null) {
                                        i = R.id.tvProfileTitle;
                                        OneFontTextView oneFontTextView3 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                        if (oneFontTextView3 != null) {
                                            i = R.id.tvTitle;
                                            OneFontTextView oneFontTextView4 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                            if (oneFontTextView4 != null) {
                                                return new FragmentOnePre2postMailingBinding(nestedScrollView, oneEditText, constraintLayout, oneFontButton, findChildViewById, oneCustomClearableEditText, toggleButton, oneCustomClearableEditText2, oneFontTextView, nestedScrollView, oneFontTextView2, oneFontTextView3, oneFontTextView4);
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
    public static FragmentOnePre2postMailingBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentOnePre2postMailingBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_one_pre2post_mailing, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public NestedScrollView getRoot() {
        return this.f84072a;
    }
}
