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
import th.p047co.dtac.android.dtacone.widget.view.DtacCheckBox;
import th.p047co.dtac.android.dtacone.widget.view.DtacClearableEditText;
import th.p047co.dtac.android.dtacone.widget.view.DtacFontButton;
import th.p047co.dtac.android.dtacone.widget.view.DtacFontTextView;

/* renamed from: th.co.dtac.android.dtacone.databinding.FragmentChangePackIdentityBinding */
/* loaded from: classes7.dex */
public final class FragmentChangePackIdentityBinding implements ViewBinding {

    /* renamed from: a */
    public final ConstraintLayout f83667a;
    @NonNull
    public final DtacFontButton buttonSubmit;
    @NonNull
    public final DtacCheckBox checkIdExpiration;
    @NonNull
    public final DtacFontTextView identityLabel;
    @NonNull
    public final DtacClearableEditText identityNumber;
    @NonNull
    public final ConstraintLayout smartCardFragment;

    public FragmentChangePackIdentityBinding(ConstraintLayout constraintLayout, DtacFontButton dtacFontButton, DtacCheckBox dtacCheckBox, DtacFontTextView dtacFontTextView, DtacClearableEditText dtacClearableEditText, ConstraintLayout constraintLayout2) {
        this.f83667a = constraintLayout;
        this.buttonSubmit = dtacFontButton;
        this.checkIdExpiration = dtacCheckBox;
        this.identityLabel = dtacFontTextView;
        this.identityNumber = dtacClearableEditText;
        this.smartCardFragment = constraintLayout2;
    }

    @NonNull
    public static FragmentChangePackIdentityBinding bind(@NonNull View view) {
        int i = R.id.buttonSubmit;
        DtacFontButton dtacFontButton = (DtacFontButton) ViewBindings.findChildViewById(view, i);
        if (dtacFontButton != null) {
            i = R.id.checkIdExpiration;
            DtacCheckBox dtacCheckBox = (DtacCheckBox) ViewBindings.findChildViewById(view, i);
            if (dtacCheckBox != null) {
                i = R.id.identityLabel;
                DtacFontTextView dtacFontTextView = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                if (dtacFontTextView != null) {
                    i = R.id.identityNumber;
                    DtacClearableEditText dtacClearableEditText = (DtacClearableEditText) ViewBindings.findChildViewById(view, i);
                    if (dtacClearableEditText != null) {
                        ConstraintLayout constraintLayout = (ConstraintLayout) view;
                        return new FragmentChangePackIdentityBinding(constraintLayout, dtacFontButton, dtacCheckBox, dtacFontTextView, dtacClearableEditText, constraintLayout);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static FragmentChangePackIdentityBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentChangePackIdentityBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_change_pack_identity, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.f83667a;
    }
}
