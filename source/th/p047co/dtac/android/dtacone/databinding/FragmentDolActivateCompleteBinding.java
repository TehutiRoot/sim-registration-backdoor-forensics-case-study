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
import th.p047co.dtac.android.dtacone.widget.view.DtacFontButton;

/* renamed from: th.co.dtac.android.dtacone.databinding.FragmentDolActivateCompleteBinding */
/* loaded from: classes7.dex */
public final class FragmentDolActivateCompleteBinding implements ViewBinding {

    /* renamed from: a */
    public final NestedScrollView f83706a;
    @NonNull
    public final DtacFontButton btnOk;

    public FragmentDolActivateCompleteBinding(NestedScrollView nestedScrollView, DtacFontButton dtacFontButton) {
        this.f83706a = nestedScrollView;
        this.btnOk = dtacFontButton;
    }

    @NonNull
    public static FragmentDolActivateCompleteBinding bind(@NonNull View view) {
        int i = R.id.btnOk;
        DtacFontButton dtacFontButton = (DtacFontButton) ViewBindings.findChildViewById(view, i);
        if (dtacFontButton != null) {
            return new FragmentDolActivateCompleteBinding((NestedScrollView) view, dtacFontButton);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static FragmentDolActivateCompleteBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentDolActivateCompleteBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_dol_activate_complete, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public NestedScrollView getRoot() {
        return this.f83706a;
    }
}
