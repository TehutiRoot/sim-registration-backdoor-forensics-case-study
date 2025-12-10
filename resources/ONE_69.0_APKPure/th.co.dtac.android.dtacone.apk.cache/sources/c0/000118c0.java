package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.widget.view.DtacFontTextView;

/* renamed from: th.co.dtac.android.dtacone.databinding.ZIncCommissionHistoryHeaderBinding */
/* loaded from: classes7.dex */
public final class ZIncCommissionHistoryHeaderBinding implements ViewBinding {

    /* renamed from: a */
    public final View f84719a;
    @NonNull
    public final DtacFontTextView barCommissionDate;
    @NonNull
    public final ImageView barPaidStatus;
    @NonNull
    public final DtacFontTextView dtacFontTextView;
    @NonNull
    public final ImageView imageView3;

    public ZIncCommissionHistoryHeaderBinding(View view, DtacFontTextView dtacFontTextView, ImageView imageView, DtacFontTextView dtacFontTextView2, ImageView imageView2) {
        this.f84719a = view;
        this.barCommissionDate = dtacFontTextView;
        this.barPaidStatus = imageView;
        this.dtacFontTextView = dtacFontTextView2;
        this.imageView3 = imageView2;
    }

    @NonNull
    public static ZIncCommissionHistoryHeaderBinding bind(@NonNull View view) {
        int i = R.id.barCommissionDate;
        DtacFontTextView dtacFontTextView = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
        if (dtacFontTextView != null) {
            i = R.id.barPaidStatus;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
            if (imageView != null) {
                i = R.id.dtacFontTextView;
                DtacFontTextView dtacFontTextView2 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                if (dtacFontTextView2 != null) {
                    i = R.id.imageView3;
                    ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, i);
                    if (imageView2 != null) {
                        return new ZIncCommissionHistoryHeaderBinding(view, dtacFontTextView, imageView, dtacFontTextView2, imageView2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static ZIncCommissionHistoryHeaderBinding inflate(@NonNull LayoutInflater layoutInflater, @NonNull ViewGroup viewGroup) {
        if (viewGroup != null) {
            layoutInflater.inflate(R.layout.z_inc_commission_history_header, viewGroup);
            return bind(viewGroup);
        }
        throw new NullPointerException("parent");
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public View getRoot() {
        return this.f84719a;
    }
}