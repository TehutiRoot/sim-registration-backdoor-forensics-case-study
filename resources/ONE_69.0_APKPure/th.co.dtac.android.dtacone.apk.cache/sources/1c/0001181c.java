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
import th.p047co.dtac.android.dtacone.app_one.widget.OneFontTextView;

/* renamed from: th.co.dtac.android.dtacone.databinding.OneDialogPhoneNumberListBinding */
/* loaded from: classes7.dex */
public final class OneDialogPhoneNumberListBinding implements ViewBinding {

    /* renamed from: a */
    public final LinearLayoutCompat f84555a;
    @NonNull
    public final ImageView close;
    @NonNull
    public final RecyclerView rvPhone;
    @NonNull
    public final OneFontTextView title;

    public OneDialogPhoneNumberListBinding(LinearLayoutCompat linearLayoutCompat, ImageView imageView, RecyclerView recyclerView, OneFontTextView oneFontTextView) {
        this.f84555a = linearLayoutCompat;
        this.close = imageView;
        this.rvPhone = recyclerView;
        this.title = oneFontTextView;
    }

    @NonNull
    public static OneDialogPhoneNumberListBinding bind(@NonNull View view) {
        int i = R.id.close;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
        if (imageView != null) {
            i = R.id.rvPhone;
            RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(view, i);
            if (recyclerView != null) {
                i = R.id.title;
                OneFontTextView oneFontTextView = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                if (oneFontTextView != null) {
                    return new OneDialogPhoneNumberListBinding((LinearLayoutCompat) view, imageView, recyclerView, oneFontTextView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static OneDialogPhoneNumberListBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static OneDialogPhoneNumberListBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.one_dialog_phone_number_list, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayoutCompat getRoot() {
        return this.f84555a;
    }
}