package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.widget.view.DtacEditText;

/* renamed from: th.co.dtac.android.dtacone.databinding.IncludePinSectionBinding */
/* loaded from: classes7.dex */
public final class IncludePinSectionBinding implements ViewBinding {

    /* renamed from: a */
    public final RelativeLayout f84289a;
    @NonNull
    public final RelativeLayout dot1;
    @NonNull
    public final RelativeLayout dot2;
    @NonNull
    public final RelativeLayout dot3;
    @NonNull
    public final RelativeLayout dot4;
    @NonNull
    public final RelativeLayout dot5;
    @NonNull
    public final RelativeLayout dot6;
    @NonNull
    public final DtacEditText etPinPassword;
    @NonNull
    public final LinearLayout layoutPinDot;

    public IncludePinSectionBinding(RelativeLayout relativeLayout, RelativeLayout relativeLayout2, RelativeLayout relativeLayout3, RelativeLayout relativeLayout4, RelativeLayout relativeLayout5, RelativeLayout relativeLayout6, RelativeLayout relativeLayout7, DtacEditText dtacEditText, LinearLayout linearLayout) {
        this.f84289a = relativeLayout;
        this.dot1 = relativeLayout2;
        this.dot2 = relativeLayout3;
        this.dot3 = relativeLayout4;
        this.dot4 = relativeLayout5;
        this.dot5 = relativeLayout6;
        this.dot6 = relativeLayout7;
        this.etPinPassword = dtacEditText;
        this.layoutPinDot = linearLayout;
    }

    @NonNull
    public static IncludePinSectionBinding bind(@NonNull View view) {
        int i = R.id.dot1;
        RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(view, i);
        if (relativeLayout != null) {
            i = R.id.dot2;
            RelativeLayout relativeLayout2 = (RelativeLayout) ViewBindings.findChildViewById(view, i);
            if (relativeLayout2 != null) {
                i = R.id.dot3;
                RelativeLayout relativeLayout3 = (RelativeLayout) ViewBindings.findChildViewById(view, i);
                if (relativeLayout3 != null) {
                    i = R.id.dot4;
                    RelativeLayout relativeLayout4 = (RelativeLayout) ViewBindings.findChildViewById(view, i);
                    if (relativeLayout4 != null) {
                        i = R.id.dot5;
                        RelativeLayout relativeLayout5 = (RelativeLayout) ViewBindings.findChildViewById(view, i);
                        if (relativeLayout5 != null) {
                            i = R.id.dot6;
                            RelativeLayout relativeLayout6 = (RelativeLayout) ViewBindings.findChildViewById(view, i);
                            if (relativeLayout6 != null) {
                                i = R.id.etPinPassword;
                                DtacEditText dtacEditText = (DtacEditText) ViewBindings.findChildViewById(view, i);
                                if (dtacEditText != null) {
                                    i = R.id.layoutPinDot;
                                    LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i);
                                    if (linearLayout != null) {
                                        return new IncludePinSectionBinding((RelativeLayout) view, relativeLayout, relativeLayout2, relativeLayout3, relativeLayout4, relativeLayout5, relativeLayout6, dtacEditText, linearLayout);
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
    public static IncludePinSectionBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static IncludePinSectionBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.include_pin_section, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public RelativeLayout getRoot() {
        return this.f84289a;
    }
}
