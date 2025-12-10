package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.widget.view.DtacFontButton;
import th.p047co.dtac.android.dtacone.widget.view.DtacFontTextView;

/* renamed from: th.co.dtac.android.dtacone.databinding.ZAlertRemovePackageSummaryBinding */
/* loaded from: classes7.dex */
public final class ZAlertRemovePackageSummaryBinding implements ViewBinding {

    /* renamed from: a */
    public final ConstraintLayout f84695a;
    @NonNull
    public final DtacFontButton btnCancel;
    @NonNull
    public final DtacFontButton btnOk;
    @NonNull
    public final DtacFontTextView dtacFontTextView47;
    @NonNull
    public final DtacFontTextView dtacFontTextView48;
    @NonNull
    public final DtacFontTextView dtacFontTextView50;
    @NonNull
    public final DtacFontTextView tvDateExpire;
    @NonNull
    public final DtacFontTextView tvNote;
    @NonNull
    public final DtacFontTextView tvPackageName;

    public ZAlertRemovePackageSummaryBinding(ConstraintLayout constraintLayout, DtacFontButton dtacFontButton, DtacFontButton dtacFontButton2, DtacFontTextView dtacFontTextView, DtacFontTextView dtacFontTextView2, DtacFontTextView dtacFontTextView3, DtacFontTextView dtacFontTextView4, DtacFontTextView dtacFontTextView5, DtacFontTextView dtacFontTextView6) {
        this.f84695a = constraintLayout;
        this.btnCancel = dtacFontButton;
        this.btnOk = dtacFontButton2;
        this.dtacFontTextView47 = dtacFontTextView;
        this.dtacFontTextView48 = dtacFontTextView2;
        this.dtacFontTextView50 = dtacFontTextView3;
        this.tvDateExpire = dtacFontTextView4;
        this.tvNote = dtacFontTextView5;
        this.tvPackageName = dtacFontTextView6;
    }

    @NonNull
    public static ZAlertRemovePackageSummaryBinding bind(@NonNull View view) {
        int i = R.id.btnCancel;
        DtacFontButton dtacFontButton = (DtacFontButton) ViewBindings.findChildViewById(view, i);
        if (dtacFontButton != null) {
            i = R.id.btnOk;
            DtacFontButton dtacFontButton2 = (DtacFontButton) ViewBindings.findChildViewById(view, i);
            if (dtacFontButton2 != null) {
                i = R.id.dtacFontTextView47;
                DtacFontTextView dtacFontTextView = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                if (dtacFontTextView != null) {
                    i = R.id.dtacFontTextView48;
                    DtacFontTextView dtacFontTextView2 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                    if (dtacFontTextView2 != null) {
                        i = R.id.dtacFontTextView50;
                        DtacFontTextView dtacFontTextView3 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                        if (dtacFontTextView3 != null) {
                            i = R.id.tvDateExpire;
                            DtacFontTextView dtacFontTextView4 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                            if (dtacFontTextView4 != null) {
                                i = R.id.tvNote;
                                DtacFontTextView dtacFontTextView5 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                                if (dtacFontTextView5 != null) {
                                    i = R.id.tvPackageName;
                                    DtacFontTextView dtacFontTextView6 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                                    if (dtacFontTextView6 != null) {
                                        return new ZAlertRemovePackageSummaryBinding((ConstraintLayout) view, dtacFontButton, dtacFontButton2, dtacFontTextView, dtacFontTextView2, dtacFontTextView3, dtacFontTextView4, dtacFontTextView5, dtacFontTextView6);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static ZAlertRemovePackageSummaryBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ZAlertRemovePackageSummaryBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.z_alert_remove_package_summary, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.f84695a;
    }
}