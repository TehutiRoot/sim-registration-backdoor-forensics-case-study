package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.Spinner;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.yarolegovich.discretescrollview.DiscreteScrollView;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.app_one.widget.OneFontButton;
import th.p047co.dtac.android.dtacone.app_one.widget.OneFontTextView;

/* renamed from: th.co.dtac.android.dtacone.databinding.FragmentIntroductionBinding */
/* loaded from: classes7.dex */
public final class FragmentIntroductionBinding implements ViewBinding {

    /* renamed from: a */
    public final RelativeLayout f83758a;
    @NonNull
    public final OneFontButton buttonLogin;
    @NonNull
    public final OneFontButton buttonOnline;
    @NonNull
    public final OneFontButton buttonRegister;
    @NonNull
    public final Spinner environmentDropDown;
    @NonNull
    public final DiscreteScrollView itemPicker;
    @NonNull
    public final IncludeIconKeywordLayoutBinding layoutEmptyIntroduction;
    @NonNull
    public final LinearLayout layoutEnvAtRunTime;
    @NonNull
    public final RelativeLayout layoutProgressBar;
    @NonNull
    public final OneFontTextView tvAppOneVersion;

    public FragmentIntroductionBinding(RelativeLayout relativeLayout, OneFontButton oneFontButton, OneFontButton oneFontButton2, OneFontButton oneFontButton3, Spinner spinner, DiscreteScrollView discreteScrollView, IncludeIconKeywordLayoutBinding includeIconKeywordLayoutBinding, LinearLayout linearLayout, RelativeLayout relativeLayout2, OneFontTextView oneFontTextView) {
        this.f83758a = relativeLayout;
        this.buttonLogin = oneFontButton;
        this.buttonOnline = oneFontButton2;
        this.buttonRegister = oneFontButton3;
        this.environmentDropDown = spinner;
        this.itemPicker = discreteScrollView;
        this.layoutEmptyIntroduction = includeIconKeywordLayoutBinding;
        this.layoutEnvAtRunTime = linearLayout;
        this.layoutProgressBar = relativeLayout2;
        this.tvAppOneVersion = oneFontTextView;
    }

    @NonNull
    public static FragmentIntroductionBinding bind(@NonNull View view) {
        View findChildViewById;
        int i = R.id.buttonLogin;
        OneFontButton oneFontButton = (OneFontButton) ViewBindings.findChildViewById(view, i);
        if (oneFontButton != null) {
            i = R.id.buttonOnline;
            OneFontButton oneFontButton2 = (OneFontButton) ViewBindings.findChildViewById(view, i);
            if (oneFontButton2 != null) {
                i = R.id.buttonRegister;
                OneFontButton oneFontButton3 = (OneFontButton) ViewBindings.findChildViewById(view, i);
                if (oneFontButton3 != null) {
                    i = R.id.environmentDropDown;
                    Spinner spinner = (Spinner) ViewBindings.findChildViewById(view, i);
                    if (spinner != null) {
                        i = R.id.itemPicker;
                        DiscreteScrollView discreteScrollView = (DiscreteScrollView) ViewBindings.findChildViewById(view, i);
                        if (discreteScrollView != null && (findChildViewById = ViewBindings.findChildViewById(view, (i = R.id.layoutEmptyIntroduction))) != null) {
                            IncludeIconKeywordLayoutBinding bind = IncludeIconKeywordLayoutBinding.bind(findChildViewById);
                            i = R.id.layoutEnvAtRunTime;
                            LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i);
                            if (linearLayout != null) {
                                i = R.id.layoutProgressBar;
                                RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, i);
                                if (relativeLayout != null) {
                                    i = R.id.tvAppOneVersion;
                                    OneFontTextView oneFontTextView = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                    if (oneFontTextView != null) {
                                        return new FragmentIntroductionBinding((RelativeLayout) view, oneFontButton, oneFontButton2, oneFontButton3, spinner, discreteScrollView, bind, linearLayout, relativeLayout, oneFontTextView);
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
    public static FragmentIntroductionBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentIntroductionBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_introduction, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public RelativeLayout getRoot() {
        return this.f83758a;
    }
}
