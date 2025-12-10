package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.app_one.widget.OneFontTextView;

/* renamed from: th.co.dtac.android.dtacone.databinding.OneIncCommissionHistoryHeaderBinding */
/* loaded from: classes7.dex */
public final class OneIncCommissionHistoryHeaderBinding implements ViewBinding {

    /* renamed from: a */
    public final View f84566a;
    @NonNull
    public final OneFontTextView barCommissionDate;
    @NonNull
    public final ImageView barPaidStatus;
    @NonNull
    public final OneFontTextView dtacFontTextView;
    @NonNull
    public final ImageView imageView3;

    public OneIncCommissionHistoryHeaderBinding(View view, OneFontTextView oneFontTextView, ImageView imageView, OneFontTextView oneFontTextView2, ImageView imageView2) {
        this.f84566a = view;
        this.barCommissionDate = oneFontTextView;
        this.barPaidStatus = imageView;
        this.dtacFontTextView = oneFontTextView2;
        this.imageView3 = imageView2;
    }

    @NonNull
    public static OneIncCommissionHistoryHeaderBinding bind(@NonNull View view) {
        int i = R.id.barCommissionDate;
        OneFontTextView oneFontTextView = (OneFontTextView) ViewBindings.findChildViewById(view, i);
        if (oneFontTextView != null) {
            i = R.id.barPaidStatus;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
            if (imageView != null) {
                i = R.id.dtacFontTextView;
                OneFontTextView oneFontTextView2 = (OneFontTextView) ViewBindings.findChildViewById(view, i);
                if (oneFontTextView2 != null) {
                    i = R.id.imageView3;
                    ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, i);
                    if (imageView2 != null) {
                        return new OneIncCommissionHistoryHeaderBinding(view, oneFontTextView, imageView, oneFontTextView2, imageView2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static OneIncCommissionHistoryHeaderBinding inflate(@NonNull LayoutInflater layoutInflater, @NonNull ViewGroup viewGroup) {
        if (viewGroup != null) {
            layoutInflater.inflate(R.layout.one_inc_commission_history_header, viewGroup);
            return bind(viewGroup);
        }
        throw new NullPointerException("parent");
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public View getRoot() {
        return this.f84566a;
    }
}