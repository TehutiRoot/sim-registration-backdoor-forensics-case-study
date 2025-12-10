package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.widget.view.DtacFontTextView;

/* renamed from: th.co.dtac.android.dtacone.databinding.AlertDialogListItemBinding */
/* loaded from: classes7.dex */
public final class AlertDialogListItemBinding implements ViewBinding {

    /* renamed from: a */
    public final RelativeLayout f83693a;
    @NonNull
    public final DtacFontTextView tvItem;
    @NonNull
    public final View vSeparateLine;

    public AlertDialogListItemBinding(RelativeLayout relativeLayout, DtacFontTextView dtacFontTextView, View view) {
        this.f83693a = relativeLayout;
        this.tvItem = dtacFontTextView;
        this.vSeparateLine = view;
    }

    @NonNull
    public static AlertDialogListItemBinding bind(@NonNull View view) {
        View findChildViewById;
        int i = R.id.tvItem;
        DtacFontTextView dtacFontTextView = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
        if (dtacFontTextView != null && (findChildViewById = ViewBindings.findChildViewById(view, (i = R.id.vSeparateLine))) != null) {
            return new AlertDialogListItemBinding((RelativeLayout) view, dtacFontTextView, findChildViewById);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static AlertDialogListItemBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static AlertDialogListItemBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.alert_dialog_list_item, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public RelativeLayout getRoot() {
        return this.f83693a;
    }
}