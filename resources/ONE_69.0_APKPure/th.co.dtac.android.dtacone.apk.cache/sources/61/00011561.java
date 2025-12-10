package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.widget.view.DtacClearableEditText;
import th.p047co.dtac.android.dtacone.widget.view.DtacFontButton;
import th.p047co.dtac.android.dtacone.widget.view.DtacFontTextView;

/* renamed from: th.co.dtac.android.dtacone.databinding.FragmentInputPostpaidSubscriberBinding */
/* loaded from: classes7.dex */
public final class FragmentInputPostpaidSubscriberBinding implements ViewBinding {

    /* renamed from: a */
    public final ConstraintLayout f83855a;
    @NonNull
    public final DtacFontButton buttonNext;
    @NonNull
    public final DtacFontTextView label1;
    @NonNull
    public final DtacClearableEditText subscriberNumber;

    public FragmentInputPostpaidSubscriberBinding(ConstraintLayout constraintLayout, DtacFontButton dtacFontButton, DtacFontTextView dtacFontTextView, DtacClearableEditText dtacClearableEditText) {
        this.f83855a = constraintLayout;
        this.buttonNext = dtacFontButton;
        this.label1 = dtacFontTextView;
        this.subscriberNumber = dtacClearableEditText;
    }

    @NonNull
    public static FragmentInputPostpaidSubscriberBinding bind(@NonNull View view) {
        int i = R.id.buttonNext;
        DtacFontButton dtacFontButton = (DtacFontButton) ViewBindings.findChildViewById(view, i);
        if (dtacFontButton != null) {
            i = R.id.label1;
            DtacFontTextView dtacFontTextView = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
            if (dtacFontTextView != null) {
                i = R.id.subscriberNumber;
                DtacClearableEditText dtacClearableEditText = (DtacClearableEditText) ViewBindings.findChildViewById(view, i);
                if (dtacClearableEditText != null) {
                    return new FragmentInputPostpaidSubscriberBinding((ConstraintLayout) view, dtacFontButton, dtacFontTextView, dtacClearableEditText);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static FragmentInputPostpaidSubscriberBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentInputPostpaidSubscriberBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_input_postpaid_subscriber, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.f83855a;
    }
}