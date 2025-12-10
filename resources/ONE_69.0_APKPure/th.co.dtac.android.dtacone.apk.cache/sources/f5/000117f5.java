package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.app_one.widget.OneFontButton;
import th.p047co.dtac.android.dtacone.app_one.widget.OneFontTextView;
import th.p047co.dtac.android.dtacone.widget.view.DtacCardView;

/* renamed from: th.co.dtac.android.dtacone.databinding.LayoutOneDevicesaleAdditionPackageBinding */
/* loaded from: classes7.dex */
public final class LayoutOneDevicesaleAdditionPackageBinding implements ViewBinding {

    /* renamed from: a */
    public final View f84516a;
    @NonNull
    public final OneFontButton buttonChangeAdditionalWithDevice;
    @NonNull
    public final DtacCardView layoutAddition;
    @NonNull
    public final View line1;
    @NonNull
    public final RecyclerView listViewAdditionalPackage;
    @NonNull
    public final OneFontTextView textViewEmptyAdditionPackage;

    public LayoutOneDevicesaleAdditionPackageBinding(View view, OneFontButton oneFontButton, DtacCardView dtacCardView, View view2, RecyclerView recyclerView, OneFontTextView oneFontTextView) {
        this.f84516a = view;
        this.buttonChangeAdditionalWithDevice = oneFontButton;
        this.layoutAddition = dtacCardView;
        this.line1 = view2;
        this.listViewAdditionalPackage = recyclerView;
        this.textViewEmptyAdditionPackage = oneFontTextView;
    }

    @NonNull
    public static LayoutOneDevicesaleAdditionPackageBinding bind(@NonNull View view) {
        View findChildViewById;
        int i = R.id.buttonChangeAdditionalWithDevice;
        OneFontButton oneFontButton = (OneFontButton) ViewBindings.findChildViewById(view, i);
        if (oneFontButton != null) {
            i = R.id.layoutAddition;
            DtacCardView dtacCardView = (DtacCardView) ViewBindings.findChildViewById(view, i);
            if (dtacCardView != null && (findChildViewById = ViewBindings.findChildViewById(view, (i = R.id.line1))) != null) {
                i = R.id.listViewAdditionalPackage;
                RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
                if (recyclerView != null) {
                    i = R.id.textViewEmptyAdditionPackage;
                    OneFontTextView oneFontTextView = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                    if (oneFontTextView != null) {
                        return new LayoutOneDevicesaleAdditionPackageBinding(view, oneFontButton, dtacCardView, findChildViewById, recyclerView, oneFontTextView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static LayoutOneDevicesaleAdditionPackageBinding inflate(@NonNull LayoutInflater layoutInflater, @NonNull ViewGroup viewGroup) {
        if (viewGroup != null) {
            layoutInflater.inflate(R.layout.layout_one_devicesale_addition_package, viewGroup);
            return bind(viewGroup);
        }
        throw new NullPointerException("parent");
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public View getRoot() {
        return this.f84516a;
    }
}