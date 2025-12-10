package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.app_one.widget.OneFontButton;

/* renamed from: th.co.dtac.android.dtacone.databinding.FragmentOneDeviceSaleModelInfoTrueBinding */
/* loaded from: classes7.dex */
public final class FragmentOneDeviceSaleModelInfoTrueBinding implements ViewBinding {

    /* renamed from: a */
    public final ConstraintLayout f84027a;
    @NonNull
    public final RecyclerView deviceSaleModelInfoRecyclerView;
    @NonNull
    public final Guideline guideTopContent;
    @NonNull
    public final OneFontButton nextToMaterialFragmentCodeButton;

    public FragmentOneDeviceSaleModelInfoTrueBinding(ConstraintLayout constraintLayout, RecyclerView recyclerView, Guideline guideline, OneFontButton oneFontButton) {
        this.f84027a = constraintLayout;
        this.deviceSaleModelInfoRecyclerView = recyclerView;
        this.guideTopContent = guideline;
        this.nextToMaterialFragmentCodeButton = oneFontButton;
    }

    @NonNull
    public static FragmentOneDeviceSaleModelInfoTrueBinding bind(@NonNull View view) {
        int i = R.id.deviceSaleModelInfoRecyclerView;
        RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
        if (recyclerView != null) {
            i = R.id.guideTopContent;
            Guideline guideline = (Guideline) ViewBindings.findChildViewById(view, i);
            if (guideline != null) {
                i = R.id.nextToMaterialFragmentCodeButton;
                OneFontButton oneFontButton = (OneFontButton) ViewBindings.findChildViewById(view, i);
                if (oneFontButton != null) {
                    return new FragmentOneDeviceSaleModelInfoTrueBinding((ConstraintLayout) view, recyclerView, guideline, oneFontButton);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static FragmentOneDeviceSaleModelInfoTrueBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FragmentOneDeviceSaleModelInfoTrueBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.fragment_one_device_sale_model_info_true, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.f84027a;
    }
}