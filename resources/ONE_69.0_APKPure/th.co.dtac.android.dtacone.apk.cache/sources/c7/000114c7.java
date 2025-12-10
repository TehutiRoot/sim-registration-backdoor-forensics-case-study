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

/* renamed from: th.co.dtac.android.dtacone.databinding.BottomSheetSendQrCodeByEmailBinding */
/* loaded from: classes7.dex */
public final class BottomSheetSendQrCodeByEmailBinding implements ViewBinding {

    /* renamed from: a */
    public final ConstraintLayout f83698a;
    @NonNull
    public final DtacFontButton btnOkByEmail;
    @NonNull
    public final DtacClearableEditText edtEmail;
    @NonNull
    public final ImageView imageView42;
    @NonNull
    public final ImageView ivCloseByEmail;
    @NonNull
    public final ConstraintLayout layoutError;
    @NonNull
    public final DtacFontTextView tvErrorEmailBottomSheet;
    @NonNull
    public final DtacFontTextView tvInputEmailTitle;
    @NonNull
    public final DtacFontTextView tvSendQrCodeByEmailTitle;
    @NonNull
    public final View vLineSeparate;

    public BottomSheetSendQrCodeByEmailBinding(ConstraintLayout constraintLayout, DtacFontButton dtacFontButton, DtacClearableEditText dtacClearableEditText, ImageView imageView, ImageView imageView2, ConstraintLayout constraintLayout2, DtacFontTextView dtacFontTextView, DtacFontTextView dtacFontTextView2, DtacFontTextView dtacFontTextView3, View view) {
        this.f83698a = constraintLayout;
        this.btnOkByEmail = dtacFontButton;
        this.edtEmail = dtacClearableEditText;
        this.imageView42 = imageView;
        this.ivCloseByEmail = imageView2;
        this.layoutError = constraintLayout2;
        this.tvErrorEmailBottomSheet = dtacFontTextView;
        this.tvInputEmailTitle = dtacFontTextView2;
        this.tvSendQrCodeByEmailTitle = dtacFontTextView3;
        this.vLineSeparate = view;
    }

    @NonNull
    public static BottomSheetSendQrCodeByEmailBinding bind(@NonNull View view) {
        View findChildViewById;
        int i = R.id.btnOkByEmail;
        DtacFontButton dtacFontButton = (DtacFontButton) ViewBindings.findChildViewById(view, i);
        if (dtacFontButton != null) {
            i = R.id.edtEmail;
            DtacClearableEditText dtacClearableEditText = (DtacClearableEditText) ViewBindings.findChildViewById(view, i);
            if (dtacClearableEditText != null) {
                i = R.id.imageView42;
                ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
                if (imageView != null) {
                    i = R.id.ivCloseByEmail;
                    ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, i);
                    if (imageView2 != null) {
                        i = R.id.layoutError;
                        ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(view, i);
                        if (constraintLayout != null) {
                            i = R.id.tvErrorEmailBottomSheet;
                            DtacFontTextView dtacFontTextView = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                            if (dtacFontTextView != null) {
                                i = R.id.tvInputEmailTitle;
                                DtacFontTextView dtacFontTextView2 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                                if (dtacFontTextView2 != null) {
                                    i = R.id.tvSendQrCodeByEmailTitle;
                                    DtacFontTextView dtacFontTextView3 = (DtacFontTextView) ViewBindings.findChildViewById(view, i);
                                    if (dtacFontTextView3 != null && (findChildViewById = ViewBindings.findChildViewById(view, (i = R.id.vLineSeparate))) != null) {
                                        return new BottomSheetSendQrCodeByEmailBinding((ConstraintLayout) view, dtacFontButton, dtacClearableEditText, imageView, imageView2, constraintLayout, dtacFontTextView, dtacFontTextView2, dtacFontTextView3, findChildViewById);
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
    public static BottomSheetSendQrCodeByEmailBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static BottomSheetSendQrCodeByEmailBinding inflate(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.bottom_sheet_send_qr_code_by_email, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.f83698a;
    }
}