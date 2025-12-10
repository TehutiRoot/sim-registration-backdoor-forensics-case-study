package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.widget.view.DtacCardView;
import th.p047co.dtac.android.dtacone.widget.view.DtacFontButton;
import th.p047co.dtac.android.dtacone.widget.view.DtacFontTextView;

/* renamed from: th.co.dtac.android.dtacone.databinding.LayoutDevicesaleAdditionPackageBinding */
/* loaded from: classes7.dex */
public final class LayoutDevicesaleAdditionPackageBinding implements ViewBinding {

    /* renamed from: a */
    public final LinearLayout f84401a;
    @NonNull
    public final DtacFontButton buttonChangeAdditional;
    @NonNull
    public final DtacCardView layoutAddition;
    @NonNull
    public final View line1;
    @NonNull
    public final RecyclerView listViewAdditionalPackage;
    @NonNull
    public final DtacFontTextView textViewEmptyAdditionPackage;

    public LayoutDevicesaleAdditionPackageBinding(LinearLayout linearLayout, DtacFontButton dtacFontButton, DtacCardView dtacCardView, View view, RecyclerView recyclerView, DtacFontTextView dtacFontTextView) {
        this.f84401a = linearLayout;
        this.buttonChangeAdditional = dtacFontButton;
        this.layoutAddition = dtacCardView;
        this.line1 = view;
        this.listViewAdditionalPackage = recyclerView;
        this.textViewEmptyAdditionPackage = dtacFontTextView;
    }

    @NonNull
    public static LayoutDevicesaleAdditionPackageBinding bind(@NonNull View view) {
        View findChildViewById;
        int i = R.id.buttonChangeAdditional;
        DtacFontButton dtacFontButton = (DtacFontButton) ViewBindings.findChildViewById(view, i);
        if (dtacFontButton != null) {
            i = R.id.layoutAddition;
            DtacCardView dtacCardView = (DtacCardView) ViewBindings.findChildViewById(view, i);
            if (dtacCardView != null && (findChildViewById = ViewBindings.findChildViewById(view, (i = R.id.line1))) != null) {
                i = R.id.listViewAdditionalPackage;
                RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
                if (recyclerView != null) {
                    i = R.id.textViewEmptyAdditionPackage;
                    DtacFontTextView dtacFontTextView = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                    if (dtacFontTextView != null) {
                        return new LayoutDevicesaleAdditionPackageBinding((LinearLayout) view, dtacFontButton, dtacCardView, findChildViewById, recyclerView, dtacFontTextView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static LayoutDevicesaleAdditionPackageBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static LayoutDevicesaleAdditionPackageBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.layout_devicesale_addition_package, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayout getRoot() {
        return this.f84401a;
    }
}
