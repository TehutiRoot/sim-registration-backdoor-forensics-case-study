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
import th.p047co.dtac.android.dtacone.widget.view.DtacFontTextView;
import th.p047co.dtac.android.dtacone.widget.view.DtacRecyclerView;

/* renamed from: th.co.dtac.android.dtacone.databinding.FragmentStvListBinding */
/* loaded from: classes7.dex */
public final class FragmentStvListBinding implements ViewBinding {

    /* renamed from: a */
    public final RelativeLayout f84199a;
    @NonNull
    public final LinearLayout descriptionBox;
    @NonNull
    public final DtacRecyclerView rectifyPhoenix;
    @NonNull
    public final RelativeLayout rootLayout;
    @NonNull
    public final DtacFontTextView tv30Day;
    @NonNull
    public final DtacFontTextView tv7Day;
    @NonNull
    public final DtacFontTextView tvDescription;
    @NonNull
    public final DtacFontTextView tvSpeed;
    @NonNull
    public final View viewDivide;
    @NonNull
    public final View viewDivideEnd;

    public FragmentStvListBinding(RelativeLayout relativeLayout, LinearLayout linearLayout, DtacRecyclerView dtacRecyclerView, RelativeLayout relativeLayout2, DtacFontTextView dtacFontTextView, DtacFontTextView dtacFontTextView2, DtacFontTextView dtacFontTextView3, DtacFontTextView dtacFontTextView4, View view, View view2) {
        this.f84199a = relativeLayout;
        this.descriptionBox = linearLayout;
        this.rectifyPhoenix = dtacRecyclerView;
        this.rootLayout = relativeLayout2;
        this.tv30Day = dtacFontTextView;
        this.tv7Day = dtacFontTextView2;
        this.tvDescription = dtacFontTextView3;
        this.tvSpeed = dtacFontTextView4;
        this.viewDivide = view;
        this.viewDivideEnd = view2;
    }

    @NonNull
    public static FragmentStvListBinding bind(@NonNull View view) {
        View findChildViewById;
        View findChildViewById2;
        int i = R.id.descriptionBox;
        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i);
        if (linearLayout != null) {
            i = R.id.rectifyPhoenix;
            DtacRecyclerView dtacRecyclerView = (DtacRecyclerView) ViewBindings.findChildViewById(view, i);
            if (dtacRecyclerView != null) {
                RelativeLayout relativeLayout = (RelativeLayout) view;
                i = R.id.tv30Day;
                DtacFontTextView dtacFontTextView = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                if (dtacFontTextView != null) {
                    i = R.id.tv7Day;
                    DtacFontTextView dtacFontTextView2 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                    if (dtacFontTextView2 != null) {
                        i = R.id.tvDescription;
                        DtacFontTextView dtacFontTextView3 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                        if (dtacFontTextView3 != null) {
                            i = R.id.tvSpeed;
                            DtacFontTextView dtacFontTextView4 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                            if (dtacFontTextView4 != null && (findChildViewById = ViewBindings.findChildViewById(view, (i = R.id.viewDivide))) != null && (findChildViewById2 = ViewBindings.findChildViewById(view, (i = R.id.viewDivideEnd))) != null) {
                                return new FragmentStvListBinding(relativeLayout, linearLayout, dtacRecyclerView, relativeLayout, dtacFontTextView, dtacFontTextView2, dtacFontTextView3, dtacFontTextView4, findChildViewById, findChildViewById2);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static FragmentStvListBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentStvListBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_stv_list, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public RelativeLayout getRoot() {
        return this.f84199a;
    }
}
