package th.p047co.dtac.android.dtacone.app_one.widget.dialog;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import androidx.annotation.DrawableRes;
import androidx.annotation.StringRes;
import androidx.appcompat.app.AppCompatDelegate;
import androidx.appcompat.app.AppCompatDialog;
import androidx.compose.runtime.internal.StabilityInferred;
import ch.qos.logback.core.CoreConstants;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import org.bouncycastle.i18n.TextBundle;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.app_one.widget.OneFontButton;
import th.p047co.dtac.android.dtacone.app_one.widget.OneFontTextView;
import th.p047co.dtac.android.dtacone.app_one.widget.dialog.OneCustomDialogBox;
import th.p047co.dtac.android.dtacone.extension.view.ViewVisibleExtKt;
import th.p047co.dtac.android.dtacone.util.date.DateUtil;
import th.p047co.dtac.android.dtacone.util.string.StringUtil;

@StabilityInferred(parameters = 0)
@Metadata(m28851d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0017\u0018\u0000 ,2\u00020\u0001:\u0002-,B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bB\u0011\b\u0016\u0012\u0006\u0010\f\u001a\u00020\u0002¢\u0006\u0004\b\n\u0010\rB\u001d\b\u0016\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000eJ\u0019\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0014¢\u0006\u0004\b\u0012\u0010\u0013J\r\u0010\u0014\u001a\u00020\u0011¢\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\u0016\u001a\u00020\u0011¢\u0006\u0004\b\u0016\u0010\u0015J%\u0010\u001a\u001a\u00020\u00112\n\b\u0003\u0010\u0018\u001a\u0004\u0018\u00010\u00172\n\b\u0003\u0010\u0019\u001a\u0004\u0018\u00010\u0017¢\u0006\u0004\b\u001a\u0010\u001bJ\r\u0010\u001c\u001a\u00020\u0011¢\u0006\u0004\b\u001c\u0010\u0015J\r\u0010\u001d\u001a\u00020\u0011¢\u0006\u0004\b\u001d\u0010\u0015J\r\u0010\u001e\u001a\u00020\u0011¢\u0006\u0004\b\u001e\u0010\u0015J\r\u0010\u001f\u001a\u00020\u0011¢\u0006\u0004\b\u001f\u0010\u0015J\u0017\u0010\"\u001a\u00020\u00112\b\u0010!\u001a\u0004\u0018\u00010 ¢\u0006\u0004\b\"\u0010#J\u0017\u0010%\u001a\u00020\u00112\b\u0010$\u001a\u0004\u0018\u00010 ¢\u0006\u0004\b%\u0010#J\u0017\u0010\"\u001a\u00020\u00112\b\b\u0001\u0010&\u001a\u00020\u0017¢\u0006\u0004\b\"\u0010'R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0016\u0010\t\u001a\u0004\u0018\u00010\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+¨\u0006."}, m28850d2 = {"Lth/co/dtac/android/dtacone/app_one/widget/dialog/OneCustomDialogBox;", "Landroidx/appcompat/app/AppCompatDialog;", "Landroid/content/Context;", "mContext", "", "cancelable", "Landroid/content/DialogInterface$OnCancelListener;", "cancelListener", "Lth/co/dtac/android/dtacone/app_one/widget/dialog/OneCustomDialogBox$Callback;", "callback", "<init>", "(Landroid/content/Context;ZLandroid/content/DialogInterface$OnCancelListener;Lth/co/dtac/android/dtacone/app_one/widget/dialog/OneCustomDialogBox$Callback;)V", CoreConstants.CONTEXT_SCOPE_VALUE, "(Landroid/content/Context;)V", "(Landroid/content/Context;Lth/co/dtac/android/dtacone/app_one/widget/dialog/OneCustomDialogBox$Callback;)V", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "(Landroid/os/Bundle;)V", "setWarning", "()V", "toVisibleLeft", "", "bgDraw", TextBundle.TEXT_ENTRY, "setOneThemeButtonRight", "(Ljava/lang/Integer;Ljava/lang/Integer;)V", "setLayoutParam", "setError", "showDateTime", "setSuccess", "", "message", "setMessage", "(Ljava/lang/String;)V", "errorCode", "setErrorInformation", "resId", "(I)V", OperatorName.FILL_NON_ZERO, "Landroid/content/Context;", OperatorName.NON_STROKING_GRAY, "Lth/co/dtac/android/dtacone/app_one/widget/dialog/OneCustomDialogBox$Callback;", "Companion", "Callback", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0})
/* renamed from: th.co.dtac.android.dtacone.app_one.widget.dialog.OneCustomDialogBox */
/* loaded from: classes7.dex */
public class OneCustomDialogBox extends AppCompatDialog {

    /* renamed from: f */
    public final Context f82919f;

    /* renamed from: g */
    public final Callback f82920g;
    @NotNull
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Metadata(m28851d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&¨\u0006\u0004"}, m28850d2 = {"Lth/co/dtac/android/dtacone/app_one/widget/dialog/OneCustomDialogBox$Callback;", "", "onButtonClick", "", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.app_one.widget.dialog.OneCustomDialogBox$Callback */
    /* loaded from: classes7.dex */
    public interface Callback {
        void onButtonClick();
    }

    @Metadata(m28851d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m28850d2 = {"Lth/co/dtac/android/dtacone/app_one/widget/dialog/OneCustomDialogBox$Companion;", "", "()V", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.app_one.widget.dialog.OneCustomDialogBox$Companion */
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OneCustomDialogBox(@NotNull Context mContext, boolean z, @Nullable DialogInterface.OnCancelListener onCancelListener, @Nullable Callback callback) {
        super(mContext, z, onCancelListener);
        Intrinsics.checkNotNullParameter(mContext, "mContext");
        this.f82919f = mContext;
        this.f82920g = callback;
        requestWindowFeature(1);
        setContentView(R.layout.one_alert_box);
    }

    /* renamed from: f */
    public static /* synthetic */ void m19805f(OneCustomDialogBox oneCustomDialogBox, View view) {
        m19803h(oneCustomDialogBox, view);
    }

    /* renamed from: g */
    public static /* synthetic */ void m19804g(OneCustomDialogBox oneCustomDialogBox, View view) {
        m19802i(oneCustomDialogBox, view);
    }

    /* renamed from: h */
    public static final void m19803h(OneCustomDialogBox this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Callback callback = this$0.f82920g;
        if (callback != null) {
            callback.onButtonClick();
        }
        this$0.dismiss();
    }

    /* renamed from: i */
    public static final void m19802i(OneCustomDialogBox this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.dismiss();
    }

    public static /* synthetic */ void setOneThemeButtonRight$default(OneCustomDialogBox oneCustomDialogBox, Integer num, Integer num2, int i, Object obj) {
        if (obj == null) {
            if ((i & 1) != 0) {
                num = Integer.valueOf(R.drawable.one_bg_blue_button);
            }
            if ((i & 2) != 0) {
                num2 = Integer.valueOf(R.string.ok);
            }
            oneCustomDialogBox.setOneThemeButtonRight(num, num2);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setOneThemeButtonRight");
    }

    @Override // androidx.appcompat.app.AppCompatDialog, androidx.activity.ComponentDialog, android.app.Dialog
    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        if (window != null) {
            window.setBackgroundDrawable(new ColorDrawable(0));
        }
        Button button = (Button) findViewById(R.id.alert_box_button);
        OneFontButton oneFontButton = (OneFontButton) findViewById(R.id.alert_box_button_cancel);
        if (button != null) {
            button.setOnClickListener(new View.OnClickListener() { // from class: IO0
                {
                    OneCustomDialogBox.this = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    OneCustomDialogBox.m19805f(OneCustomDialogBox.this, view);
                }
            });
        }
        if (oneFontButton != null) {
            oneFontButton.setOnClickListener(new View.OnClickListener() { // from class: JO0
                {
                    OneCustomDialogBox.this = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    OneCustomDialogBox.m19804g(OneCustomDialogBox.this, view);
                }
            });
        }
    }

    public final void setError() {
        OneFontButton oneFontButton = (OneFontButton) findViewById(R.id.alert_box_button);
        if (oneFontButton != null) {
            oneFontButton.setBackgroundResource(R.drawable.z_one_button_error);
        }
        if (oneFontButton != null) {
            oneFontButton.setText(R.string.ok);
        }
    }

    public final void setErrorInformation(@Nullable String str) {
        int i = 0;
        setError();
        OneFontTextView oneFontTextView = (OneFontTextView) findViewById(R.id.tvErrorCode);
        if (oneFontTextView != null) {
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            String format = String.format("%s: %s", Arrays.copyOf(new Object[]{"ข้อผิดพลาด", str}, 2));
            Intrinsics.checkNotNullExpressionValue(format, "format(...)");
            oneFontTextView.setText(format);
        }
        if (oneFontTextView != null) {
            if (!StringUtil.hasText(str)) {
                i = 8;
            }
            oneFontTextView.setVisibility(i);
        }
    }

    public final void setLayoutParam() {
        ViewGroup.LayoutParams layoutParams;
        OneFontButton oneFontButton = (OneFontButton) findViewById(R.id.alert_box_button);
        ViewGroup.LayoutParams layoutParams2 = null;
        if (oneFontButton != null) {
            layoutParams = oneFontButton.getLayoutParams();
        } else {
            layoutParams = null;
        }
        if (layoutParams != null) {
            layoutParams.width = 280;
        }
        if (oneFontButton != null) {
            oneFontButton.setLayoutParams(layoutParams);
        }
        OneFontButton oneFontButton2 = (OneFontButton) findViewById(R.id.alert_box_button_cancel);
        if (oneFontButton2 != null) {
            layoutParams2 = oneFontButton2.getLayoutParams();
        }
        if (layoutParams2 != null) {
            layoutParams2.width = 280;
        }
        if (oneFontButton2 != null) {
            oneFontButton2.setLayoutParams(layoutParams2);
        }
    }

    public final void setMessage(@Nullable String str) {
        OneFontTextView oneFontTextView = (OneFontTextView) findViewById(R.id.alert_message);
        if (oneFontTextView == null) {
            return;
        }
        oneFontTextView.setText(str);
    }

    public final void setOneThemeButtonRight(@DrawableRes @Nullable Integer num, @StringRes @Nullable Integer num2) {
        OneFontButton oneFontButton = (OneFontButton) findViewById(R.id.alert_box_button);
        if (oneFontButton != null) {
            Intrinsics.checkNotNull(num);
            oneFontButton.setBackgroundResource(num.intValue());
        }
        if (oneFontButton != null) {
            Intrinsics.checkNotNull(num2);
            oneFontButton.setText(num2.intValue());
        }
    }

    public final void setSuccess() {
        OneFontButton oneFontButton = (OneFontButton) findViewById(R.id.alert_box_button);
        if (oneFontButton != null) {
            oneFontButton.setBackgroundResource(R.drawable.z_button_success);
        }
        if (oneFontButton != null) {
            oneFontButton.setText(R.string.ok);
        }
    }

    public final void setWarning() {
        OneFontButton oneFontButton = (OneFontButton) findViewById(R.id.alert_box_button);
        if (oneFontButton != null) {
            oneFontButton.setBackgroundResource(R.drawable.z_button_blue);
        }
        if (oneFontButton != null) {
            oneFontButton.setText(R.string.ok);
        }
    }

    public final void showDateTime() {
        OneFontTextView oneFontTextView = (OneFontTextView) findViewById(R.id.tvDate);
        if (oneFontTextView != null) {
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            String format = String.format("%s %s", Arrays.copyOf(new Object[]{"วันที่", DateUtil.displayDateTimeOnErrorDialog()}, 2));
            Intrinsics.checkNotNullExpressionValue(format, "format(...)");
            oneFontTextView.setText(format);
        }
        if (oneFontTextView != null) {
            ViewVisibleExtKt.toVisible(oneFontTextView);
        }
    }

    public final void toVisibleLeft() {
        OneFontButton oneFontButton = (OneFontButton) findViewById(R.id.alert_box_button_cancel);
        if (oneFontButton != null) {
            ViewVisibleExtKt.toVisible(oneFontButton);
        }
    }

    public final void setMessage(@StringRes int i) {
        String string = getContext().getString(i);
        Intrinsics.checkNotNullExpressionValue(string, "context.getString(resId)");
        OneFontTextView oneFontTextView = (OneFontTextView) findViewById(R.id.alert_message);
        if (oneFontTextView == null) {
            return;
        }
        oneFontTextView.setText(string);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public OneCustomDialogBox(@NotNull Context context) {
        this(context, false, (DialogInterface.OnCancelListener) null, (Callback) null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public OneCustomDialogBox(@NotNull Context context, @Nullable Callback callback) {
        this(context, false, (DialogInterface.OnCancelListener) null, callback);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ OneCustomDialogBox(Context context, Callback callback, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : callback);
    }
}
