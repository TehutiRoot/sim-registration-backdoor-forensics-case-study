package th.p047co.dtac.android.dtacone.view.fragment;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.FragmentActivity;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.databinding.ZContactDtacBinding;
import th.p047co.dtac.android.dtacone.manager.PermissionManager;
import th.p047co.dtac.android.dtacone.util.FeatureUtil;
import th.p047co.dtac.android.dtacone.widget.dialog.BaseDialogFragment;
import th.p047co.dtac.android.dtacone.widget.dialog.CustomAlertDialog;
import th.p047co.dtac.android.dtacone.widget.view.DtacFontButton;
import th.p047co.dtac.android.dtacone.widget.view.listener.OnSingleClickListenerKt;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J-\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ!\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0011\u001a\u00020\u000e¢\u0006\u0004\b\u0011\u0010\u0003J\r\u0010\u0012\u001a\u00020\u000e¢\u0006\u0004\b\u0012\u0010\u0003J-\u0010\u001a\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u00132\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u00152\u0006\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u001c\u0010\u0003R\u0016\u0010 \u001a\u00020\u001d8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f¨\u0006!"}, m29142d2 = {"Lth/co/dtac/android/dtacone/view/fragment/ContactDtacFragment;", "Lth/co/dtac/android/dtacone/widget/dialog/BaseDialogFragment;", "<init>", "()V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", Promotion.ACTION_VIEW, "", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "contactDtac", "cancel", "", "requestCode", "", "", "permissions", "", "grantResults", "onRequestPermissionsResult", "(I[Ljava/lang/String;[I)V", OperatorName.ENDPATH, "Lth/co/dtac/android/dtacone/databinding/ZContactDtacBinding;", PDPageLabelRange.STYLE_LETTERS_LOWER, "Lth/co/dtac/android/dtacone/databinding/ZContactDtacBinding;", "binding", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0})
/* renamed from: th.co.dtac.android.dtacone.view.fragment.ContactDtacFragment */
/* loaded from: classes10.dex */
public final class ContactDtacFragment extends BaseDialogFragment {
    public static final int $stable = 8;

    /* renamed from: a */
    public ZContactDtacBinding f98654a;

    public final void cancel() {
        Dialog dialog = getDialog();
        if (dialog != null) {
            dialog.dismiss();
        }
    }

    public final void contactDtac() {
        if (!PermissionManager.requestCallPhonePermission(this)) {
            m9081n();
        } else {
            PermissionManager.requestCallPhonePermission(this);
        }
    }

    /* renamed from: n */
    public final void m9081n() {
        Intent intent = new Intent("android.intent.action.CALL");
        Context requireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext()");
        if (new FeatureUtil(requireContext).isTelephoneCallSupport()) {
            intent.setData(Uri.parse("tel:022028400"));
            startActivity(intent);
        } else {
            FragmentActivity activity = getActivity();
            Intrinsics.checkNotNull(activity, "null cannot be cast to non-null type android.app.Activity");
            CustomAlertDialog customAlertDialog = new CustomAlertDialog(activity);
            String string = getString(R.string.phone_not_support_call);
            Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.phone_not_support_call)");
            customAlertDialog.showPositiveButton(string, null);
        }
        Dialog dialog = getDialog();
        if (dialog != null) {
            dialog.dismiss();
        }
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        ZContactDtacBinding inflate = ZContactDtacBinding.inflate(LayoutInflater.from(getContext()), viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(LayoutInflater.f…ntext), container, false)");
        this.f98654a = inflate;
        return getView();
    }

    @Override // androidx.fragment.app.Fragment
    public void onRequestPermissionsResult(int i, @NotNull String[] permissions, @NotNull int[] grantResults) {
        boolean z;
        Intrinsics.checkNotNullParameter(permissions, "permissions");
        Intrinsics.checkNotNullParameter(grantResults, "grantResults");
        if (i == 2) {
            if (grantResults.length == 0) {
                z = true;
            } else {
                z = false;
            }
            if ((!z) && grantResults[0] == 0) {
                m9081n();
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        ZContactDtacBinding zContactDtacBinding = this.f98654a;
        if (zContactDtacBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            zContactDtacBinding = null;
        }
        DtacFontButton btnOk = zContactDtacBinding.btnOk;
        Intrinsics.checkNotNullExpressionValue(btnOk, "btnOk");
        OnSingleClickListenerKt.setOnSingleClickListener(btnOk, new ContactDtacFragment$onViewCreated$1$1(this));
        DtacFontButton btnCancel = zContactDtacBinding.btnCancel;
        Intrinsics.checkNotNullExpressionValue(btnCancel, "btnCancel");
        OnSingleClickListenerKt.setOnSingleClickListener(btnCancel, new ContactDtacFragment$onViewCreated$1$2(this));
    }
}