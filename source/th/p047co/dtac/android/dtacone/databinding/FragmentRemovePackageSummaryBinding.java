package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RadioGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.widget.NestedScrollView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.widget.view.DtacCardView;
import th.p047co.dtac.android.dtacone.widget.view.DtacClearableEditText;
import th.p047co.dtac.android.dtacone.widget.view.DtacFontButton;
import th.p047co.dtac.android.dtacone.widget.view.DtacFontTextView;
import th.p047co.dtac.android.dtacone.widget.view.DtacRadioButton;

/* renamed from: th.co.dtac.android.dtacone.databinding.FragmentRemovePackageSummaryBinding */
/* loaded from: classes7.dex */
public final class FragmentRemovePackageSummaryBinding implements ViewBinding {

    /* renamed from: a */
    public final NestedScrollView f84169a;
    @NonNull
    public final DtacFontButton buttonNext;
    @NonNull
    public final DtacCardView dtacCardView;
    @NonNull
    public final DtacFontTextView dtacFontTextView45;
    @NonNull
    public final DtacClearableEditText edtInputDateExpire;
    @NonNull
    public final FrameLayout frameDateExpire;
    @NonNull
    public final ItemPackageSummaryBinding incPackageSummary;
    @NonNull
    public final FrameLayout layoutInputDateExpire;
    @NonNull
    public final DtacRadioButton rbEndOfCycle;
    @NonNull
    public final DtacRadioButton rbImmediately;
    @NonNull
    public final DtacRadioButton rbSpecificDate;
    @NonNull
    public final RadioGroup rdbGroup;

    public FragmentRemovePackageSummaryBinding(NestedScrollView nestedScrollView, DtacFontButton dtacFontButton, DtacCardView dtacCardView, DtacFontTextView dtacFontTextView, DtacClearableEditText dtacClearableEditText, FrameLayout frameLayout, ItemPackageSummaryBinding itemPackageSummaryBinding, FrameLayout frameLayout2, DtacRadioButton dtacRadioButton, DtacRadioButton dtacRadioButton2, DtacRadioButton dtacRadioButton3, RadioGroup radioGroup) {
        this.f84169a = nestedScrollView;
        this.buttonNext = dtacFontButton;
        this.dtacCardView = dtacCardView;
        this.dtacFontTextView45 = dtacFontTextView;
        this.edtInputDateExpire = dtacClearableEditText;
        this.frameDateExpire = frameLayout;
        this.incPackageSummary = itemPackageSummaryBinding;
        this.layoutInputDateExpire = frameLayout2;
        this.rbEndOfCycle = dtacRadioButton;
        this.rbImmediately = dtacRadioButton2;
        this.rbSpecificDate = dtacRadioButton3;
        this.rdbGroup = radioGroup;
    }

    @NonNull
    public static FragmentRemovePackageSummaryBinding bind(@NonNull View view) {
        View findChildViewById;
        int i = R.id.buttonNext;
        DtacFontButton dtacFontButton = (DtacFontButton) ViewBindings.findChildViewById(view, i);
        if (dtacFontButton != null) {
            i = R.id.dtacCardView;
            DtacCardView dtacCardView = (DtacCardView) ViewBindings.findChildViewById(view, i);
            if (dtacCardView != null) {
                i = R.id.dtacFontTextView45;
                DtacFontTextView dtacFontTextView = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                if (dtacFontTextView != null) {
                    i = R.id.edtInputDateExpire;
                    DtacClearableEditText dtacClearableEditText = (DtacClearableEditText) ViewBindings.findChildViewById(view, i);
                    if (dtacClearableEditText != null) {
                        i = R.id.frameDateExpire;
                        FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(view, i);
                        if (frameLayout != null && (findChildViewById = ViewBindings.findChildViewById(view, (i = R.id.incPackageSummary))) != null) {
                            ItemPackageSummaryBinding bind = ItemPackageSummaryBinding.bind(findChildViewById);
                            i = R.id.layoutInputDateExpire;
                            FrameLayout frameLayout2 = (FrameLayout) ViewBindings.findChildViewById(view, i);
                            if (frameLayout2 != null) {
                                i = R.id.rbEndOfCycle;
                                DtacRadioButton dtacRadioButton = (DtacRadioButton) ViewBindings.findChildViewById(view, i);
                                if (dtacRadioButton != null) {
                                    i = R.id.rbImmediately;
                                    DtacRadioButton dtacRadioButton2 = (DtacRadioButton) ViewBindings.findChildViewById(view, i);
                                    if (dtacRadioButton2 != null) {
                                        i = R.id.rbSpecificDate;
                                        DtacRadioButton dtacRadioButton3 = (DtacRadioButton) ViewBindings.findChildViewById(view, i);
                                        if (dtacRadioButton3 != null) {
                                            i = R.id.rdbGroup;
                                            RadioGroup radioGroup = (RadioGroup) ViewBindings.findChildViewById(view, i);
                                            if (radioGroup != null) {
                                                return new FragmentRemovePackageSummaryBinding((NestedScrollView) view, dtacFontButton, dtacCardView, dtacFontTextView, dtacClearableEditText, frameLayout, bind, frameLayout2, dtacRadioButton, dtacRadioButton2, dtacRadioButton3, radioGroup);
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
    public static FragmentRemovePackageSummaryBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentRemovePackageSummaryBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_remove_package_summary, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public NestedScrollView getRoot() {
        return this.f84169a;
    }
}
