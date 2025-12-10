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
import th.p047co.dtac.android.dtacone.widget.view.DtacFontButton;

/* renamed from: th.co.dtac.android.dtacone.databinding.LayoutDevicesaleMainPackageBinding */
/* loaded from: classes7.dex */
public final class LayoutDevicesaleMainPackageBinding implements ViewBinding {

    /* renamed from: a */
    public final LinearLayout f84403a;
    @NonNull
    public final DtacFontButton buttonChangeMain;
    @NonNull
    public final View line1;
    @NonNull
    public final RecyclerView listViewMainPackage;

    public LayoutDevicesaleMainPackageBinding(LinearLayout linearLayout, DtacFontButton dtacFontButton, View view, RecyclerView recyclerView) {
        this.f84403a = linearLayout;
        this.buttonChangeMain = dtacFontButton;
        this.line1 = view;
        this.listViewMainPackage = recyclerView;
    }

    @NonNull
    public static LayoutDevicesaleMainPackageBinding bind(@NonNull View view) {
        View findChildViewById;
        int i = R.id.buttonChangeMain;
        DtacFontButton dtacFontButton = (DtacFontButton) ViewBindings.findChildViewById(view, i);
        if (dtacFontButton != null && (findChildViewById = ViewBindings.findChildViewById(view, (i = R.id.line1))) != null) {
            i = R.id.listViewMainPackage;
            RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
            if (recyclerView != null) {
                return new LayoutDevicesaleMainPackageBinding((LinearLayout) view, dtacFontButton, findChildViewById, recyclerView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static LayoutDevicesaleMainPackageBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static LayoutDevicesaleMainPackageBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.layout_devicesale_main_package, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayout getRoot() {
        return this.f84403a;
    }
}
