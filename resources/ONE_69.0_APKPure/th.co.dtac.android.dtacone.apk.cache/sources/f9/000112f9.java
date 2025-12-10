package th.p047co.dtac.android.dtacone.app_one.widget.dialog;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.ImageView;
import androidx.appcompat.app.AppCompatDelegate;
import androidx.appcompat.app.AppCompatDialog;
import androidx.compose.runtime.internal.StabilityInferred;
import ch.qos.logback.core.CoreConstants;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.i18n.TextBundle;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.app_one.widget.OneButtonBlue;
import th.p047co.dtac.android.dtacone.app_one.widget.OneFontTextView;
import th.p047co.dtac.android.dtacone.app_one.widget.dialog.OnePasswordDialogSuccess;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 '2\u00020\u0001:\u0002('BC\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\r\u0010\u000eB-\b\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000fJ\u0019\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0014¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0017\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u0019\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0019\u0010\u0018R\u0016\u0010\t\u001a\u0004\u0018\u00010\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0016\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0016\u0010\f\u001a\u0004\u0018\u00010\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001dR\u0018\u0010\"\u001a\u0004\u0018\u00010\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!R\u0018\u0010&\u001a\u0004\u0018\u00010#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010%¨\u0006)"}, m29142d2 = {"Lth/co/dtac/android/dtacone/app_one/widget/dialog/OnePasswordDialogSuccess;", "Landroidx/appcompat/app/AppCompatDialog;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "cancelable", "Landroid/content/DialogInterface$OnCancelListener;", "cancelListener", "Lth/co/dtac/android/dtacone/app_one/widget/dialog/OnePasswordDialogSuccess$Callback;", "callback", "", "icon", "buttonColor", "<init>", "(Landroid/content/Context;ZLandroid/content/DialogInterface$OnCancelListener;Lth/co/dtac/android/dtacone/app_one/widget/dialog/OnePasswordDialogSuccess$Callback;Ljava/lang/Integer;Ljava/lang/Integer;)V", "(Landroid/content/Context;Lth/co/dtac/android/dtacone/app_one/widget/dialog/OnePasswordDialogSuccess$Callback;II)V", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "(Landroid/os/Bundle;)V", "", TextBundle.TEXT_ENTRY, "setTextTitle", "(Ljava/lang/String;)V", "setTextSubTitle", OperatorName.FILL_NON_ZERO, "Lth/co/dtac/android/dtacone/app_one/widget/dialog/OnePasswordDialogSuccess$Callback;", OperatorName.NON_STROKING_GRAY, "Ljava/lang/Integer;", OperatorName.CLOSE_PATH, "Landroid/widget/ImageView;", "i", "Landroid/widget/ImageView;", "iconSuccess", "Lth/co/dtac/android/dtacone/app_one/widget/OneButtonBlue;", OperatorName.SET_LINE_JOINSTYLE, "Lth/co/dtac/android/dtacone/app_one/widget/OneButtonBlue;", "btnOK", "Companion", "Callback", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0})
/* renamed from: th.co.dtac.android.dtacone.app_one.widget.dialog.OnePasswordDialogSuccess */
/* loaded from: classes7.dex */
public final class OnePasswordDialogSuccess extends AppCompatDialog {

    /* renamed from: f */
    public final Callback f83079f;

    /* renamed from: g */
    public final Integer f83080g;

    /* renamed from: h */
    public final Integer f83081h;

    /* renamed from: i */
    public ImageView f83082i;

    /* renamed from: j */
    public OneButtonBlue f83083j;
    @NotNull
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Metadata(m29143d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&¨\u0006\u0004"}, m29142d2 = {"Lth/co/dtac/android/dtacone/app_one/widget/dialog/OnePasswordDialogSuccess$Callback;", "", "onButtonClick", "", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.app_one.widget.dialog.OnePasswordDialogSuccess$Callback */
    /* loaded from: classes7.dex */
    public interface Callback {
        void onButtonClick();
    }

    @Metadata(m29143d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m29142d2 = {"Lth/co/dtac/android/dtacone/app_one/widget/dialog/OnePasswordDialogSuccess$Companion;", "", "()V", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.app_one.widget.dialog.OnePasswordDialogSuccess$Companion */
    /* loaded from: classes7.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    static {
        AppCompatDelegate.setCompatVectorFromResourcesEnabled(true);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public OnePasswordDialogSuccess(@NotNull Context context, int i, int i2) {
        this(context, (Callback) null, i, i2, 2, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* renamed from: f */
    public static /* synthetic */ void m19907f(OnePasswordDialogSuccess onePasswordDialogSuccess, View view) {
        m19906g(onePasswordDialogSuccess, view);
    }

    /* renamed from: g */
    public static final void m19906g(OnePasswordDialogSuccess this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Callback callback = this$0.f83079f;
        if (callback != null) {
            callback.onButtonClick();
        }
        this$0.dismiss();
    }

    @Override // androidx.appcompat.app.AppCompatDialog, androidx.activity.ComponentDialog, android.app.Dialog
    public void onCreate(@Nullable Bundle bundle) {
        ImageView imageView;
        super.onCreate(bundle);
        int i = (int) (getContext().getResources().getDisplayMetrics().widthPixels * 0.9d);
        Window window = getWindow();
        if (window != null) {
            window.setLayout(i, -2);
        }
        Window window2 = getWindow();
        if (window2 != null) {
            window2.setBackgroundDrawable(new ColorDrawable(0));
        }
        this.f83083j = (OneButtonBlue) findViewById(R.id.btnOK);
        this.f83082i = (ImageView) findViewById(R.id.iconSuccess);
        OneButtonBlue oneButtonBlue = this.f83083j;
        if (oneButtonBlue != null) {
            oneButtonBlue.setOnClickListener(new View.OnClickListener() { // from class: d11
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    OnePasswordDialogSuccess.m19907f(OnePasswordDialogSuccess.this, view);
                }
            });
        }
        if (this.f83080g != null && (imageView = this.f83082i) != null) {
            imageView.setImageResource(this.f83080g.intValue());
        }
        Integer num = this.f83081h;
        if (num != null) {
            int intValue = num.intValue();
            OneButtonBlue oneButtonBlue2 = this.f83083j;
            if (oneButtonBlue2 != null) {
                oneButtonBlue2.setButtonBackground(intValue);
            }
        }
    }

    public final void setTextSubTitle(@NotNull String text) {
        Intrinsics.checkNotNullParameter(text, "text");
        OneFontTextView oneFontTextView = (OneFontTextView) findViewById(R.id.tvSubTitle);
        if (oneFontTextView != null) {
            oneFontTextView.setText(text);
        }
    }

    public final void setTextTitle(@NotNull String text) {
        Intrinsics.checkNotNullParameter(text, "text");
        OneFontTextView oneFontTextView = (OneFontTextView) findViewById(R.id.tvTitle);
        if (oneFontTextView != null) {
            oneFontTextView.setText(text);
        }
    }

    public /* synthetic */ OnePasswordDialogSuccess(Context context, boolean z, DialogInterface.OnCancelListener onCancelListener, Callback callback, Integer num, Integer num2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, z, onCancelListener, callback, (i & 16) != 0 ? null : num, (i & 32) != 0 ? null : num2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OnePasswordDialogSuccess(@NotNull Context context, boolean z, @Nullable DialogInterface.OnCancelListener onCancelListener, @Nullable Callback callback, @Nullable Integer num, @Nullable Integer num2) {
        super(context, z, onCancelListener);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f83079f = callback;
        this.f83080g = num;
        this.f83081h = num2;
        requestWindowFeature(1);
        setContentView(R.layout.one_dialog_password_success);
    }

    public /* synthetic */ OnePasswordDialogSuccess(Context context, Callback callback, int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i3 & 2) != 0 ? null : callback, i, i2);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public OnePasswordDialogSuccess(@NotNull Context context, @Nullable Callback callback, int i, int i2) {
        this(context, false, (DialogInterface.OnCancelListener) null, callback, Integer.valueOf(i), Integer.valueOf(i2));
        Intrinsics.checkNotNullParameter(context, "context");
    }
}