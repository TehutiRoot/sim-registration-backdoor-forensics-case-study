package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.app_one.widget.OneFontTextView;
import th.p047co.dtac.android.dtacone.widget.view.DtacRecyclerView;

/* renamed from: th.co.dtac.android.dtacone.databinding.FragmentOneStvPackageListBinding */
/* loaded from: classes7.dex */
public final class FragmentOneStvPackageListBinding implements ViewBinding {

    /* renamed from: a */
    public final LinearLayoutCompat f84125a;
    @NonNull
    public final LinearLayout descriptionBox;
    @NonNull
    public final DtacRecyclerView rectifyPhoenix;
    @NonNull
    public final OneFontTextView tv30Day;
    @NonNull
    public final OneFontTextView tv60Day;
    @NonNull
    public final OneFontTextView tv7Day;
    @NonNull
    public final OneFontTextView tvDescription;
    @NonNull
    public final OneFontTextView tvSpeed;
    @NonNull
    public final View viewDivide;
    @NonNull
    public final View viewDivideEnd;

    public FragmentOneStvPackageListBinding(LinearLayoutCompat linearLayoutCompat, LinearLayout linearLayout, DtacRecyclerView dtacRecyclerView, OneFontTextView oneFontTextView, OneFontTextView oneFontTextView2, OneFontTextView oneFontTextView3, OneFontTextView oneFontTextView4, OneFontTextView oneFontTextView5, View view, View view2) {
        this.f84125a = linearLayoutCompat;
        this.descriptionBox = linearLayout;
        this.rectifyPhoenix = dtacRecyclerView;
        this.tv30Day = oneFontTextView;
        this.tv60Day = oneFontTextView2;
        this.tv7Day = oneFontTextView3;
        this.tvDescription = oneFontTextView4;
        this.tvSpeed = oneFontTextView5;
        this.viewDivide = view;
        this.viewDivideEnd = view2;
    }

    @NonNull
    public static FragmentOneStvPackageListBinding bind(@NonNull View view) {
        View findChildViewById;
        View findChildViewById2;
        int i = R.id.descriptionBox;
        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(view, i);
        if (linearLayout != null) {
            i = R.id.rectifyPhoenix;
            DtacRecyclerView dtacRecyclerView = (DtacRecyclerView) ViewBindings.findChildViewById(view, i);
            if (dtacRecyclerView != null) {
                i = R.id.tv30Day;
                OneFontTextView oneFontTextView = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                if (oneFontTextView != null) {
                    i = R.id.tv60Day;
                    OneFontTextView oneFontTextView2 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                    if (oneFontTextView2 != null) {
                        i = R.id.tv7Day;
                        OneFontTextView oneFontTextView3 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                        if (oneFontTextView3 != null) {
                            i = R.id.tvDescription;
                            OneFontTextView oneFontTextView4 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                            if (oneFontTextView4 != null) {
                                i = R.id.tvSpeed;
                                OneFontTextView oneFontTextView5 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                                if (oneFontTextView5 != null && (findChildViewById = ViewBindings.findChildViewById(view, (i = R.id.viewDivide))) != null && (findChildViewById2 = ViewBindings.findChildViewById(view, (i = R.id.viewDivideEnd))) != null) {
                                    return new FragmentOneStvPackageListBinding((LinearLayoutCompat) view, linearLayout, dtacRecyclerView, oneFontTextView, oneFontTextView2, oneFontTextView3, oneFontTextView4, oneFontTextView5, findChildViewById, findChildViewById2);
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
    public static FragmentOneStvPackageListBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentOneStvPackageListBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_one_stv_package_list, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayoutCompat getRoot() {
        return this.f84125a;
    }
}
