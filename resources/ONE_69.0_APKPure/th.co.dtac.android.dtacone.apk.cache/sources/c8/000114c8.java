package th.p047co.dtac.android.dtacone.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.widget.view.DtacClearableEditText;
import th.p047co.dtac.android.dtacone.widget.view.DtacFontButton;
import th.p047co.dtac.android.dtacone.widget.view.DtacFontTextView;

/* renamed from: th.co.dtac.android.dtacone.databinding.BottomSheetSendQrCodeByMmsBinding */
/* loaded from: classes7.dex */
public final class BottomSheetSendQrCodeByMmsBinding implements ViewBinding {

    /* renamed from: a */
    public final ConstraintLayout f83699a;
    @NonNull
    public final DtacFontButton btnOkByMms;
    @NonNull
    public final DtacClearableEditText edtMms;
    @NonNull
    public final ImageView imageView42;
    @NonNull
    public final ImageView ivCloseByMms;
    @NonNull
    public final ConstraintLayout layoutError;
    @NonNull
    public final DtacFontTextView tvErrorMMSBottomSheet;
    @NonNull
    public final DtacFontTextView tvInputMmsTitle;
    @NonNull
    public final DtacFontTextView tvSendQrCodeByMmsTitle;
    @NonNull
    public final View vLineSeparate;

    public BottomSheetSendQrCodeByMmsBinding(ConstraintLayout constraintLayout, DtacFontButton dtacFontButton, DtacClearableEditText dtacClearableEditText, ImageView imageView, ImageView imageView2, ConstraintLayout constraintLayout2, DtacFontTextView dtacFontTextView, DtacFontTextView dtacFontTextView2, DtacFontTextView dtacFontTextView3, View view) {
        this.f83699a = constraintLayout;
        this.btnOkByMms = dtacFontButton;
        this.edtMms = dtacClearableEditText;
        this.imageView42 = imageView;
        this.ivCloseByMms = imageView2;
        this.layoutError = constraintLayout2;
        this.tvErrorMMSBottomSheet = dtacFontTextView;
        this.tvInputMmsTitle = dtacFontTextView2;
        this.tvSendQrCodeByMmsTitle = dtacFontTextView3;
        this.vLineSeparate = view;
    }

    @NonNull
    public static BottomSheetSendQrCodeByMmsBinding bind(@NonNull View view) {
        View findChildViewById;
        int i = R.id.btnOkByMms;
        DtacFontButton dtacFontButton = (DtacFontButton) ViewBindings.findChildViewById(view, i);
        if (dtacFontButton != null) {
            i = R.id.edtMms;
            DtacClearableEditText dtacClearableEditText = (DtacClearableEditText) ViewBindings.findChildViewById(view, i);
            if (dtacClearableEditText != null) {
                i = R.id.imageView42;
                ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
                if (imageView != null) {
                    i = R.id.ivCloseByMms;
                    ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, i);
                    if (imageView2 != null) {
                        i = R.id.layoutError;
                        ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
                        if (constraintLayout != null) {
                            i = R.id.tvErrorMMSBottomSheet;
                            DtacFontTextView dtacFontTextView = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                            if (dtacFontTextView != null) {
                                i = R.id.tvInputMmsTitle;
                                DtacFontTextView dtacFontTextView2 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                                if (dtacFontTextView2 != null) {
                                    i = R.id.tvSendQrCodeByMmsTitle;
                                    DtacFontTextView dtacFontTextView3 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                                    if (dtacFontTextView3 != null && (findChildViewById = ViewBindings.findChildViewById(view, (i = R.id.vLineSeparate))) != null) {
                                        return new BottomSheetSendQrCodeByMmsBinding((ConstraintLayout) view, dtacFontButton, dtacClearableEditText, imageView, imageView2, constraintLayout, dtacFontTextView, dtacFontTextView2, dtacFontTextView3, findChildViewById);
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
    public static BottomSheetSendQrCodeByMmsBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static BottomSheetSendQrCodeByMmsBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.bottom_sheet_send_qr_code_by_mms, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.f83699a;
    }
}