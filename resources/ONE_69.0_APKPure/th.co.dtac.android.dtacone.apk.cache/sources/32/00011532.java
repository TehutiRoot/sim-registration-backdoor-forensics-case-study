package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import th.p047co.dtac.android.dtacone.R;

/* renamed from: th.co.dtac.android.dtacone.databinding.FragmentDtacAtHomeChooseFlowBinding */
/* loaded from: classes7.dex */
public final class FragmentDtacAtHomeChooseFlowBinding implements ViewBinding {

    /* renamed from: a */
    public final LinearLayout f83808a;
    @NonNull
    public final LinearLayout btnGotoPostpaid;
    @NonNull
    public final LinearLayout btnGotoPrepaid;

    public FragmentDtacAtHomeChooseFlowBinding(LinearLayout linearLayout, LinearLayout linearLayout2, LinearLayout linearLayout3) {
        this.f83808a = linearLayout;
        this.btnGotoPostpaid = linearLayout2;
        this.btnGotoPrepaid = linearLayout3;
    }

    @NonNull
    public static FragmentDtacAtHomeChooseFlowBinding bind(@NonNull View view) {
        int i = R.id.btnGotoPostpaid;
        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i);
        if (linearLayout != null) {
            i = R.id.btnGotoPrepaid;
            LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(view, i);
            if (linearLayout2 != null) {
                return new FragmentDtacAtHomeChooseFlowBinding((LinearLayout) view, linearLayout, linearLayout2);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static FragmentDtacAtHomeChooseFlowBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentDtacAtHomeChooseFlowBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_dtac_at_home_choose_flow, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayout getRoot() {
        return this.f83808a;
    }
}