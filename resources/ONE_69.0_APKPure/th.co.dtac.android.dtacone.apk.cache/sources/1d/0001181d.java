package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.app_one.widget.OneButtonBlue;

/* renamed from: th.co.dtac.android.dtacone.databinding.OneDialogRemainingPackagesBinding */
/* loaded from: classes7.dex */
public final class OneDialogRemainingPackagesBinding implements ViewBinding {

    /* renamed from: a */
    public final LinearLayoutCompat f84556a;
    @NonNull
    public final OneButtonBlue btnOk;
    @NonNull
    public final RecyclerView rvPackage;

    public OneDialogRemainingPackagesBinding(LinearLayoutCompat linearLayoutCompat, OneButtonBlue oneButtonBlue, RecyclerView recyclerView) {
        this.f84556a = linearLayoutCompat;
        this.btnOk = oneButtonBlue;
        this.rvPackage = recyclerView;
    }

    @NonNull
    public static OneDialogRemainingPackagesBinding bind(@NonNull View view) {
        int i = R.id.btnOk;
        OneButtonBlue oneButtonBlue = (OneButtonBlue) ViewBindings.findChildViewById(view, i);
        if (oneButtonBlue != null) {
            i = R.id.rvPackage;
            RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
            if (recyclerView != null) {
                return new OneDialogRemainingPackagesBinding((LinearLayoutCompat) view, oneButtonBlue, recyclerView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static OneDialogRemainingPackagesBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static OneDialogRemainingPackagesBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.one_dialog_remaining_packages, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayoutCompat getRoot() {
        return this.f84556a;
    }
}