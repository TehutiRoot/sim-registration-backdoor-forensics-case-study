package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.app_one.widget.OneButtonRed;
import th.p047co.dtac.android.dtacone.app_one.widget.OneFontTextView;

/* renamed from: th.co.dtac.android.dtacone.databinding.OneDialogRtrNumberListBinding */
/* loaded from: classes7.dex */
public final class OneDialogRtrNumberListBinding implements ViewBinding {

    /* renamed from: a */
    public final LinearLayoutCompat f84557a;
    @NonNull
    public final OneButtonRed btnRequestOTP;
    @NonNull
    public final ImageView close;
    @NonNull
    public final RecyclerView rvRtrAndPhone;
    @NonNull
    public final OneFontTextView title;

    public OneDialogRtrNumberListBinding(LinearLayoutCompat linearLayoutCompat, OneButtonRed oneButtonRed, ImageView imageView, RecyclerView recyclerView, OneFontTextView oneFontTextView) {
        this.f84557a = linearLayoutCompat;
        this.btnRequestOTP = oneButtonRed;
        this.close = imageView;
        this.rvRtrAndPhone = recyclerView;
        this.title = oneFontTextView;
    }

    @NonNull
    public static OneDialogRtrNumberListBinding bind(@NonNull View view) {
        int i = R.id.btnRequestOTP;
        OneButtonRed oneButtonRed = (OneButtonRed) ViewBindings.findChildViewById(view, i);
        if (oneButtonRed != null) {
            i = R.id.close;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
            if (imageView != null) {
                i = R.id.rvRtrAndPhone;
                RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
                if (recyclerView != null) {
                    i = R.id.title;
                    OneFontTextView oneFontTextView = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                    if (oneFontTextView != null) {
                        return new OneDialogRtrNumberListBinding((LinearLayoutCompat) view, oneButtonRed, imageView, recyclerView, oneFontTextView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static OneDialogRtrNumberListBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static OneDialogRtrNumberListBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.one_dialog_rtr_number_list, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayoutCompat getRoot() {
        return this.f84557a;
    }
}