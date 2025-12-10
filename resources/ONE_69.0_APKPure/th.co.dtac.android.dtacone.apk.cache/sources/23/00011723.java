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

/* renamed from: th.co.dtac.android.dtacone.databinding.FragmentSubscriberCustenqBinding */
/* loaded from: classes7.dex */
public final class FragmentSubscriberCustenqBinding implements ViewBinding {

    /* renamed from: a */
    public final ConstraintLayout f84306a;
    @NonNull
    public final DtacFontButton buttonNext;
    @NonNull
    public final DtacClearableEditText subscriberNumber;

    public FragmentSubscriberCustenqBinding(ConstraintLayout constraintLayout, DtacFontButton dtacFontButton, DtacClearableEditText dtacClearableEditText) {
        this.f84306a = constraintLayout;
        this.buttonNext = dtacFontButton;
        this.subscriberNumber = dtacClearableEditText;
    }

    @NonNull
    public static FragmentSubscriberCustenqBinding bind(@NonNull View view) {
        int i = R.id.buttonNext;
        DtacFontButton dtacFontButton = (DtacFontButton) ViewBindings.findChildViewById(view, i);
        if (dtacFontButton != null) {
            i = R.id.subscriberNumber;
            DtacClearableEditText dtacClearableEditText = (DtacClearableEditText) ViewBindings.findChildViewById(view, i);
            if (dtacClearableEditText != null) {
                return new FragmentSubscriberCustenqBinding((ConstraintLayout) view, dtacFontButton, dtacClearableEditText);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static FragmentSubscriberCustenqBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentSubscriberCustenqBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_subscriber_custenq, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.f84306a;
    }
}