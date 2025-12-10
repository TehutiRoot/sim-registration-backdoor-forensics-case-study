package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.widget.NestedScrollView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.widget.view.DtacClearableEditText;
import th.p047co.dtac.android.dtacone.widget.view.DtacFontTextView;

/* renamed from: th.co.dtac.android.dtacone.databinding.FragmentMrtrChangeSimFormBinding */
/* loaded from: classes7.dex */
public final class FragmentMrtrChangeSimFormBinding implements ViewBinding {

    /* renamed from: a */
    public final NestedScrollView f83865a;
    @NonNull
    public final DtacFontTextView btnNext;
    @NonNull
    public final DtacClearableEditText edtPhoneNumber;
    @NonNull
    public final DtacFontTextView tvChangeSimReason;

    public FragmentMrtrChangeSimFormBinding(NestedScrollView nestedScrollView, DtacFontTextView dtacFontTextView, DtacClearableEditText dtacClearableEditText, DtacFontTextView dtacFontTextView2) {
        this.f83865a = nestedScrollView;
        this.btnNext = dtacFontTextView;
        this.edtPhoneNumber = dtacClearableEditText;
        this.tvChangeSimReason = dtacFontTextView2;
    }

    @NonNull
    public static FragmentMrtrChangeSimFormBinding bind(@NonNull View view) {
        int i = R.id.btnNext;
        DtacFontTextView dtacFontTextView = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
        if (dtacFontTextView != null) {
            i = R.id.edtPhoneNumber;
            DtacClearableEditText dtacClearableEditText = (DtacClearableEditText) ViewBindings.findChildViewById(view, i);
            if (dtacClearableEditText != null) {
                i = R.id.tvChangeSimReason;
                DtacFontTextView dtacFontTextView2 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                if (dtacFontTextView2 != null) {
                    return new FragmentMrtrChangeSimFormBinding((NestedScrollView) view, dtacFontTextView, dtacClearableEditText, dtacFontTextView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static FragmentMrtrChangeSimFormBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentMrtrChangeSimFormBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_mrtr_change_sim_form, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public NestedScrollView getRoot() {
        return this.f83865a;
    }
}