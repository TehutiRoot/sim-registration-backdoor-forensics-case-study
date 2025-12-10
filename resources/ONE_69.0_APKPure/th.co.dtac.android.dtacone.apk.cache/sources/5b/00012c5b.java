package th.p047co.dtac.android.dtacone.view.appOne.common.dialog;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import androidx.appcompat.app.AppCompatDialog;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.content.ContextCompat;
import ch.qos.logback.core.CoreConstants;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.i18n.MessageBundle;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.app_one.widget.OneFontTextView;
import th.p047co.dtac.android.dtacone.view.appOne.common.dialog.OneCustomConfirmDialog;
import th.p047co.dtac.android.dtacone.widget.dialog.CustomDialogBox;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001BE\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\f\u001a\u00020\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0012\u0010\u0011J\u0019\u0010\u0015\u001a\u00020\u000f2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0014¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0006\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u0018R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u001aR\u0016\u0010\n\u001a\u0004\u0018\u00010\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u001bR\u0014\u0010\u000b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001aR\u0014\u0010\f\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001aR\u0018\u0010!\u001a\u0004\u0018\u00010\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0018\u0010#\u001a\u0004\u0018\u00010\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010 R\u0018\u0010%\u001a\u0004\u0018\u00010\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010 R\u0018\u0010'\u001a\u0004\u0018\u00010\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010 ¨\u0006("}, m29142d2 = {"Lth/co/dtac/android/dtacone/view/appOne/common/dialog/OneCustomConfirmDialog;", "Landroidx/appcompat/app/AppCompatDialog;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "", MessageBundle.TITLE_ENTRY, "description", "", "btnConfirmBackground", "Lth/co/dtac/android/dtacone/widget/dialog/CustomDialogBox$Callback;", "callback", "btnCancelBackground", "btnCancelTextColor", "<init>", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;ILth/co/dtac/android/dtacone/widget/dialog/CustomDialogBox$Callback;II)V", "", "i", "()V", OperatorName.CLOSE_PATH, "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", OperatorName.FILL_NON_ZERO, "Ljava/lang/String;", OperatorName.NON_STROKING_GRAY, "I", "Lth/co/dtac/android/dtacone/widget/dialog/CustomDialogBox$Callback;", OperatorName.SET_LINE_JOINSTYLE, OperatorName.NON_STROKING_CMYK, "Lth/co/dtac/android/dtacone/app_one/widget/OneFontTextView;", OperatorName.LINE_TO, "Lth/co/dtac/android/dtacone/app_one/widget/OneFontTextView;", "tvTitle", OperatorName.MOVE_TO, "tvDescription", OperatorName.ENDPATH, "btnConfirm", "o", "btnCancel", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0})
/* renamed from: th.co.dtac.android.dtacone.view.appOne.common.dialog.OneCustomConfirmDialog */
/* loaded from: classes10.dex */
public final class OneCustomConfirmDialog extends AppCompatDialog {
    public static final int $stable = 8;

    /* renamed from: f */
    public final String f89534f;

    /* renamed from: g */
    public final String f89535g;

    /* renamed from: h */
    public final int f89536h;

    /* renamed from: i */
    public final CustomDialogBox.Callback f89537i;

    /* renamed from: j */
    public final int f89538j;

    /* renamed from: k */
    public final int f89539k;

    /* renamed from: l */
    public OneFontTextView f89540l;

    /* renamed from: m */
    public OneFontTextView f89541m;

    /* renamed from: n */
    public OneFontTextView f89542n;

    /* renamed from: o */
    public OneFontTextView f89543o;

    public /* synthetic */ OneCustomConfirmDialog(Context context, String str, String str2, int i, CustomDialogBox.Callback callback, int i2, int i3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, str, str2, i, callback, (i4 & 32) != 0 ? R.drawable.one_bg_grey_button : i2, (i4 & 64) != 0 ? R.color.warmGrey : i3);
    }

    /* renamed from: f */
    public static /* synthetic */ void m15242f(OneCustomConfirmDialog oneCustomConfirmDialog, View view) {
        m15238j(oneCustomConfirmDialog, view);
    }

    /* renamed from: g */
    public static /* synthetic */ void m15241g(OneCustomConfirmDialog oneCustomConfirmDialog, View view) {
        m15237k(oneCustomConfirmDialog, view);
    }

    /* renamed from: h */
    private final void m15240h() {
        this.f89540l = (OneFontTextView) findViewById(R.id.tvTitle);
        this.f89541m = (OneFontTextView) findViewById(R.id.tvDescription);
        this.f89542n = (OneFontTextView) findViewById(R.id.btnConfirm);
        this.f89543o = (OneFontTextView) findViewById(R.id.btnCancel);
    }

    /* renamed from: i */
    private final void m15239i() {
        OneFontTextView oneFontTextView = this.f89540l;
        if (oneFontTextView != null) {
            oneFontTextView.setText(this.f89534f);
        }
        OneFontTextView oneFontTextView2 = this.f89541m;
        if (oneFontTextView2 != null) {
            oneFontTextView2.setText(this.f89535g);
        }
        OneFontTextView oneFontTextView3 = this.f89542n;
        if (oneFontTextView3 != null) {
            oneFontTextView3.setBackgroundResource(this.f89536h);
        }
        OneFontTextView oneFontTextView4 = this.f89542n;
        if (oneFontTextView4 != null) {
            oneFontTextView4.setOnClickListener(new View.OnClickListener() { // from class: MO0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    OneCustomConfirmDialog.m15242f(OneCustomConfirmDialog.this, view);
                }
            });
        }
        OneFontTextView oneFontTextView5 = this.f89543o;
        if (oneFontTextView5 != null) {
            oneFontTextView5.setBackgroundResource(this.f89538j);
        }
        OneFontTextView oneFontTextView6 = this.f89543o;
        if (oneFontTextView6 != null) {
            oneFontTextView6.setTextColor(ContextCompat.getColor(getContext(), this.f89539k));
        }
        OneFontTextView oneFontTextView7 = this.f89543o;
        if (oneFontTextView7 != null) {
            oneFontTextView7.setOnClickListener(new View.OnClickListener() { // from class: NO0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    OneCustomConfirmDialog.m15241g(OneCustomConfirmDialog.this, view);
                }
            });
        }
    }

    /* renamed from: j */
    public static final void m15238j(OneCustomConfirmDialog this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        CustomDialogBox.Callback callback = this$0.f89537i;
        if (callback != null) {
            callback.onButtonClick();
        }
        this$0.dismiss();
    }

    /* renamed from: k */
    public static final void m15237k(OneCustomConfirmDialog this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.dismiss();
    }

    @Override // androidx.appcompat.app.AppCompatDialog, androidx.activity.ComponentDialog, android.app.Dialog
    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        int i = (int) (getContext().getResources().getDisplayMetrics().widthPixels * 0.88d);
        Window window = getWindow();
        if (window != null) {
            window.setLayout(i, -2);
        }
        Window window2 = getWindow();
        if (window2 != null) {
            window2.setBackgroundDrawable(new ColorDrawable(0));
        }
        m15240h();
        m15239i();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OneCustomConfirmDialog(@NotNull Context context, @NotNull String title, @NotNull String description, int i, @Nullable CustomDialogBox.Callback callback, int i2, int i3) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        this.f89534f = title;
        this.f89535g = description;
        this.f89536h = i;
        this.f89537i = callback;
        this.f89538j = i2;
        this.f89539k = i3;
        requestWindowFeature(1);
        setContentView(R.layout.dialog_one_custom_confirm);
        setCancelable(true);
    }
}