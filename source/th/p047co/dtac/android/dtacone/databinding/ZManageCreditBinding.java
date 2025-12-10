package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.widget.view.DtacEditText;
import th.p047co.dtac.android.dtacone.widget.view.DtacFontTextView;
import th.p047co.dtac.android.dtacone.widget.view.DtacRadioButton;

/* renamed from: th.co.dtac.android.dtacone.databinding.ZManageCreditBinding */
/* loaded from: classes7.dex */
public final class ZManageCreditBinding implements ViewBinding {

    /* renamed from: a */
    public final RelativeLayout f84661a;
    @NonNull
    public final DtacEditText edtCredit;
    @NonNull
    public final ZButtonOkCancelBinding incLayoutBtnOkCancel;
    @NonNull
    public final DtacRadioButton rdbDefine;
    @NonNull
    public final RadioGroup rdbGroup;
    @NonNull
    public final DtacRadioButton rdbNoDefine;
    @NonNull
    public final DtacFontTextView titleDialog;
    @NonNull
    public final DtacFontTextView tvName;
    @NonNull
    public final DtacFontTextView tvNoDefineText;

    public ZManageCreditBinding(RelativeLayout relativeLayout, DtacEditText dtacEditText, ZButtonOkCancelBinding zButtonOkCancelBinding, DtacRadioButton dtacRadioButton, RadioGroup radioGroup, DtacRadioButton dtacRadioButton2, DtacFontTextView dtacFontTextView, DtacFontTextView dtacFontTextView2, DtacFontTextView dtacFontTextView3) {
        this.f84661a = relativeLayout;
        this.edtCredit = dtacEditText;
        this.incLayoutBtnOkCancel = zButtonOkCancelBinding;
        this.rdbDefine = dtacRadioButton;
        this.rdbGroup = radioGroup;
        this.rdbNoDefine = dtacRadioButton2;
        this.titleDialog = dtacFontTextView;
        this.tvName = dtacFontTextView2;
        this.tvNoDefineText = dtacFontTextView3;
    }

    @NonNull
    public static ZManageCreditBinding bind(@NonNull View view) {
        View findChildViewById;
        int i = R.id.edtCredit;
        DtacEditText dtacEditText = (DtacEditText) ViewBindings.findChildViewById(view, i);
        if (dtacEditText != null && (findChildViewById = ViewBindings.findChildViewById(view, (i = R.id.incLayoutBtnOkCancel))) != null) {
            ZButtonOkCancelBinding bind = ZButtonOkCancelBinding.bind(findChildViewById);
            i = R.id.rdbDefine;
            DtacRadioButton dtacRadioButton = (DtacRadioButton) ViewBindings.findChildViewById(view, i);
            if (dtacRadioButton != null) {
                i = R.id.rdbGroup;
                RadioGroup radioGroup = (RadioGroup) ViewBindings.findChildViewById(view, i);
                if (radioGroup != null) {
                    i = R.id.rdbNoDefine;
                    DtacRadioButton dtacRadioButton2 = (DtacRadioButton) ViewBindings.findChildViewById(view, i);
                    if (dtacRadioButton2 != null) {
                        i = R.id.titleDialog;
                        DtacFontTextView dtacFontTextView = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                        if (dtacFontTextView != null) {
                            i = R.id.tvName;
                            DtacFontTextView dtacFontTextView2 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                            if (dtacFontTextView2 != null) {
                                i = R.id.tvNoDefineText;
                                DtacFontTextView dtacFontTextView3 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                                if (dtacFontTextView3 != null) {
                                    return new ZManageCreditBinding((RelativeLayout) view, dtacEditText, bind, dtacRadioButton, radioGroup, dtacRadioButton2, dtacFontTextView, dtacFontTextView2, dtacFontTextView3);
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
    public static ZManageCreditBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ZManageCreditBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.z_manage_credit, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public RelativeLayout getRoot() {
        return this.f84661a;
    }
}
