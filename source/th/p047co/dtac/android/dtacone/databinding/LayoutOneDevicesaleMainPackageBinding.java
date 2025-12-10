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

/* renamed from: th.co.dtac.android.dtacone.databinding.LayoutOneDevicesaleMainPackageBinding */
/* loaded from: classes7.dex */
public final class LayoutOneDevicesaleMainPackageBinding implements ViewBinding {

    /* renamed from: a */
    public final View f84409a;
    @NonNull
    public final OneFontButton buttonChangeMainWithDevice;
    @NonNull
    public final View line1;
    @NonNull
    public final RecyclerView listViewMainPackage;

    public LayoutOneDevicesaleMainPackageBinding(View view, OneFontButton oneFontButton, View view2, RecyclerView recyclerView) {
        this.f84409a = view;
        this.buttonChangeMainWithDevice = oneFontButton;
        this.line1 = view2;
        this.listViewMainPackage = recyclerView;
    }

    @NonNull
    public static LayoutOneDevicesaleMainPackageBinding bind(@NonNull View view) {
        View findChildViewById;
        int i = R.id.buttonChangeMainWithDevice;
        OneFontButton oneFontButton = (OneFontButton) ViewBindings.findChildViewById(view, i);
        if (oneFontButton != null && (findChildViewById = ViewBindings.findChildViewById(view, (i = R.id.line1))) != null) {
            i = R.id.listViewMainPackage;
            RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
            if (recyclerView != null) {
                return new LayoutOneDevicesaleMainPackageBinding(view, oneFontButton, findChildViewById, recyclerView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static LayoutOneDevicesaleMainPackageBinding inflate(@NonNull LayoutInflater layoutInflater, @NonNull ViewGroup viewGroup) {
        if (viewGroup != null) {
            layoutInflater.inflate(R.layout.layout_one_devicesale_main_package, viewGroup);
            return bind(viewGroup);
        }
        throw new NullPointerException("parent");
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public View getRoot() {
        return this.f84409a;
    }
}
