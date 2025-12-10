package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import th.p047co.dtac.android.dtacone.R;

/* renamed from: th.co.dtac.android.dtacone.databinding.FragmentOneOnlineRegistrationVerifyOTPBinding */
/* loaded from: classes7.dex */
public final class FragmentOneOnlineRegistrationVerifyOTPBinding implements ViewBinding {

    /* renamed from: a */
    public final ConstraintLayout f84110a;
    @NonNull
    public final CardView onlineRegisterTopView;

    public FragmentOneOnlineRegistrationVerifyOTPBinding(ConstraintLayout constraintLayout, CardView cardView) {
        this.f84110a = constraintLayout;
        this.onlineRegisterTopView = cardView;
    }

    @NonNull
    public static FragmentOneOnlineRegistrationVerifyOTPBinding bind(@NonNull View view) {
        int i = R.id.onlineRegisterTopView;
        CardView cardView = (CardView) ViewBindings.findChildViewById(view, i);
        if (cardView != null) {
            return new FragmentOneOnlineRegistrationVerifyOTPBinding((ConstraintLayout) view, cardView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static FragmentOneOnlineRegistrationVerifyOTPBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentOneOnlineRegistrationVerifyOTPBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_one_online_registration_verify_o_t_p, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.f84110a;
    }
}