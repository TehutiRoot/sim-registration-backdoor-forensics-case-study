package th.p047co.dtac.android.dtacone.widget.dialog;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.ImageView;
import androidx.compose.runtime.internal.StabilityInferred;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import net.lucode.hackware.magicindicator.buildins.UIUtil;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.extension.format.StringExtKt;
import th.p047co.dtac.android.dtacone.widget.dialog.MrtrDialogSuccess;
import th.p047co.dtac.android.dtacone.widget.view.DtacFontTextView;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J-\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ!\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0014\u001a\u00020\u00118\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0018\u001a\u00020\u00158\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u001a"}, m29142d2 = {"Lth/co/dtac/android/dtacone/widget/dialog/MrtrDialogSuccess;", "Lth/co/dtac/android/dtacone/widget/dialog/BaseDialogFragment;", "<init>", "()V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", Promotion.ACTION_VIEW, "", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "Lth/co/dtac/android/dtacone/widget/view/DtacFontTextView;", PDPageLabelRange.STYLE_LETTERS_LOWER, "Lth/co/dtac/android/dtacone/widget/view/DtacFontTextView;", "tvMessage", "Landroid/widget/ImageView;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Landroid/widget/ImageView;", "Icon", "Companion", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0})
/* renamed from: th.co.dtac.android.dtacone.widget.dialog.MrtrDialogSuccess */
/* loaded from: classes9.dex */
public final class MrtrDialogSuccess extends BaseDialogFragment {

    /* renamed from: a */
    public DtacFontTextView f107335a;

    /* renamed from: b */
    public ImageView f107336b;
    @NotNull
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Metadata(m29143d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J*\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\f"}, m29142d2 = {"Lth/co/dtac/android/dtacone/widget/dialog/MrtrDialogSuccess$Companion;", "", "()V", "KEYWORD", "", "MESSAGE", "TYPE", "newInstance", "Lth/co/dtac/android/dtacone/widget/dialog/MrtrDialogSuccess;", "txtMessage", "keyword", "type", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.widget.dialog.MrtrDialogSuccess$Companion */
    /* loaded from: classes9.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ MrtrDialogSuccess newInstance$default(Companion companion, String str, String str2, String str3, int i, Object obj) {
            if ((i & 1) != 0) {
                str = null;
            }
            if ((i & 2) != 0) {
                str2 = null;
            }
            if ((i & 4) != 0) {
                str3 = "email";
            }
            return companion.newInstance(str, str2, str3);
        }

        @NotNull
        public final MrtrDialogSuccess newInstance(@Nullable String str, @Nullable String str2, @Nullable String str3) {
            Bundle bundle = new Bundle();
            if (str != null) {
                bundle.putString("MESSAGE", str);
            }
            if (str2 != null) {
                bundle.putString("KEYWORD", str2);
            }
            if (str3 != null) {
                bundle.putString("TYPE", str3);
            }
            MrtrDialogSuccess mrtrDialogSuccess = new MrtrDialogSuccess();
            mrtrDialogSuccess.setArguments(bundle);
            return mrtrDialogSuccess;
        }

        public Companion() {
        }
    }

    /* renamed from: o */
    public static final void m1588o(MrtrDialogSuccess this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Dialog dialog = this$0.getDialog();
        if (dialog != null) {
            dialog.dismiss();
        }
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View inflate = inflater.inflate(R.layout.layout_dialog_send_qr_success, viewGroup, false);
        Dialog dialog = getDialog();
        if (dialog != null) {
            dialog.setCanceledOnTouchOutside(false);
        }
        return inflate;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        Window window;
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        Dialog dialog = getDialog();
        if (dialog != null && (window = dialog.getWindow()) != null) {
            window.setLayout((int) (UIUtil.getScreenWidth(getActivity()) * 0.9d), -2);
        }
        View findViewById = view.findViewById(R.id.tvMessage);
        Intrinsics.checkNotNullExpressionValue(findViewById, "view.findViewById(R.id.tvMessage)");
        this.f107335a = (DtacFontTextView) findViewById;
        View findViewById2 = view.findViewById(R.id.Icon);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "view.findViewById(R.id.Icon)");
        this.f107336b = (ImageView) findViewById2;
        Bundle arguments = getArguments();
        if (arguments != null) {
            String message = arguments.getString("MESSAGE");
            ImageView imageView = null;
            if (message != null) {
                String string = arguments.getString("KEYWORD");
                if (string == null) {
                    string = "";
                }
                Intrinsics.checkNotNullExpressionValue(string, "bundle.getString(KEYWORD) ?: \"\"");
                DtacFontTextView dtacFontTextView = this.f107335a;
                if (dtacFontTextView == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("tvMessage");
                    dtacFontTextView = null;
                }
                Context requireContext = requireContext();
                Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext()");
                Intrinsics.checkNotNullExpressionValue(message, "message");
                StringExtKt.setSpanText$default(dtacFontTextView, requireContext, message, CollectionsKt__CollectionsKt.arrayListOf(string), null, 8, null);
            }
            String string2 = arguments.getString("TYPE");
            if (string2 != null) {
                if (string2.hashCode() == 96619420 && string2.equals("email")) {
                    ImageView imageView2 = this.f107336b;
                    if (imageView2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("Icon");
                    } else {
                        imageView = imageView2;
                    }
                    imageView.setImageResource(R.drawable.group_mail);
                } else {
                    ImageView imageView3 = this.f107336b;
                    if (imageView3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("Icon");
                    } else {
                        imageView = imageView3;
                    }
                    imageView.setImageResource(R.drawable.group_mms);
                }
            }
        }
        new Handler().postDelayed(new Runnable() { // from class: tv0
            {
                MrtrDialogSuccess.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                MrtrDialogSuccess.m1588o(MrtrDialogSuccess.this);
            }
        }, 3000L);
    }
}