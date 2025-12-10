package th.p047co.dtac.android.dtacone.app_one.widget.dialog;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.widget.Button;
import android.widget.RelativeLayout;
import androidx.annotation.StringRes;
import androidx.appcompat.app.AppCompatDelegate;
import androidx.appcompat.app.AppCompatDialog;
import androidx.compose.runtime.internal.StabilityInferred;
import ch.qos.logback.core.CoreConstants;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.app_one.widget.OneFontButton;
import th.p047co.dtac.android.dtacone.app_one.widget.OneFontTextView;
import th.p047co.dtac.android.dtacone.app_one.widget.dialog.OneErrorDialogBox;
import th.p047co.dtac.android.dtacone.util.date.DateUtil;
import th.p047co.dtac.android.dtacone.util.density.ScreenSizeHelper;
import th.p047co.dtac.android.dtacone.util.string.StringUtil;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 /2\u00020\u0001:\u00020/B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bB\u001d\b\u0017\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\rJ\u0019\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0014¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0013\u001a\u00020\u0010¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0015\u001a\u00020\u0010¢\u0006\u0004\b\u0015\u0010\u0014J\r\u0010\u0016\u001a\u00020\u0010¢\u0006\u0004\b\u0016\u0010\u0014J\u0015\u0010\u0019\u001a\u00020\u00102\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001c\u001a\u00020\u00102\b\u0010\u001b\u001a\u0004\u0018\u00010\u0017¢\u0006\u0004\b\u001c\u0010\u001aJ\u0015\u0010\u001e\u001a\u00020\u00102\u0006\u0010\u001d\u001a\u00020\u0017¢\u0006\u0004\b\u001e\u0010\u001aJ\r\u0010\u001f\u001a\u00020\u0010¢\u0006\u0004\b\u001f\u0010\u0014J\u0017\u0010!\u001a\u00020\u00102\b\u0010 \u001a\u0004\u0018\u00010\u0017¢\u0006\u0004\b!\u0010\u001aJ\u0017\u0010#\u001a\u00020\u00102\b\u0010\"\u001a\u0004\u0018\u00010\u0017¢\u0006\u0004\b#\u0010\u001aJ\u0017\u0010!\u001a\u00020\u00102\b\b\u0001\u0010%\u001a\u00020$¢\u0006\u0004\b!\u0010&R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0016\u0010\t\u001a\u0004\u0018\u00010\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0018\u0010.\u001a\u0004\u0018\u00010+8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010-¨\u00061"}, m29142d2 = {"Lth/co/dtac/android/dtacone/app_one/widget/dialog/OneErrorDialogBox;", "Landroidx/appcompat/app/AppCompatDialog;", "Landroid/content/Context;", "mContext", "", "cancelable", "Landroid/content/DialogInterface$OnCancelListener;", "cancelListener", "Lth/co/dtac/android/dtacone/app_one/widget/dialog/OneErrorDialogBox$Callback;", "callback", "<init>", "(Landroid/content/Context;ZLandroid/content/DialogInterface$OnCancelListener;Lth/co/dtac/android/dtacone/app_one/widget/dialog/OneErrorDialogBox$Callback;)V", CoreConstants.CONTEXT_SCOPE_VALUE, "(Landroid/content/Context;Lth/co/dtac/android/dtacone/app_one/widget/dialog/OneErrorDialogBox$Callback;)V", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "(Landroid/os/Bundle;)V", "setWarning", "()V", "setError", "showDateTime", "", "dateTime", "showServerDateTime", "(Ljava/lang/String;)V", "userName", "showUsername", "systemMessage", "showSystemMessage", "setSuccess", "message", "setMessage", "errorCode", "setErrorInformation", "", "resId", "(I)V", OperatorName.FILL_NON_ZERO, "Landroid/content/Context;", OperatorName.NON_STROKING_GRAY, "Lth/co/dtac/android/dtacone/app_one/widget/dialog/OneErrorDialogBox$Callback;", "Landroid/widget/RelativeLayout;", OperatorName.CLOSE_PATH, "Landroid/widget/RelativeLayout;", "relativeLayout", "Companion", "Callback", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0})
/* renamed from: th.co.dtac.android.dtacone.app_one.widget.dialog.OneErrorDialogBox */
/* loaded from: classes7.dex */
public final class OneErrorDialogBox extends AppCompatDialog {

    /* renamed from: f */
    public final Context f83065f;

    /* renamed from: g */
    public final Callback f83066g;

    /* renamed from: h */
    public RelativeLayout f83067h;
    @NotNull
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Metadata(m29143d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&¨\u0006\u0004"}, m29142d2 = {"Lth/co/dtac/android/dtacone/app_one/widget/dialog/OneErrorDialogBox$Callback;", "", "onButtonClick", "", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.app_one.widget.dialog.OneErrorDialogBox$Callback */
    /* loaded from: classes7.dex */
    public interface Callback {
        void onButtonClick();
    }

    @Metadata(m29143d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m29142d2 = {"Lth/co/dtac/android/dtacone/app_one/widget/dialog/OneErrorDialogBox$Companion;", "", "()V", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.app_one.widget.dialog.OneErrorDialogBox$Companion */
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
    public OneErrorDialogBox(@NotNull Context context) {
        this(context, (Callback) null, 2, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* renamed from: f */
    public static /* synthetic */ void m19921f(OneErrorDialogBox oneErrorDialogBox, View view) {
        m19920g(oneErrorDialogBox, view);
    }

    /* renamed from: g */
    public static final void m19920g(OneErrorDialogBox this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Callback callback = this$0.f83066g;
        if (callback != null) {
            callback.onButtonClick();
        }
        this$0.dismiss();
    }

    @Override // androidx.appcompat.app.AppCompatDialog, androidx.activity.ComponentDialog, android.app.Dialog
    public void onCreate(@Nullable Bundle bundle) {
        ViewTreeObserver viewTreeObserver;
        ViewGroup.LayoutParams layoutParams;
        super.onCreate(bundle);
        Window window = getWindow();
        if (window != null) {
            window.setBackgroundDrawable(new ColorDrawable(0));
        }
        OneFontButton oneFontButton = (OneFontButton) findViewById(R.id.alert_box_button);
        DisplayMetrics displayMetrics = this.f83065f.getResources().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue(displayMetrics, "mContext.resources.displayMetrics");
        if (ScreenSizeHelper.isTableSW600(displayMetrics)) {
            if (oneFontButton != null) {
                layoutParams = oneFontButton.getLayoutParams();
            } else {
                layoutParams = null;
            }
            if (layoutParams != null) {
                layoutParams.width = 260;
            }
        }
        RelativeLayout relativeLayout = (RelativeLayout) findViewById(R.id.layoutContent);
        this.f83067h = relativeLayout;
        if (relativeLayout != null && (viewTreeObserver = relativeLayout.getViewTreeObserver()) != null) {
            viewTreeObserver.addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: th.co.dtac.android.dtacone.app_one.widget.dialog.OneErrorDialogBox$onCreate$1
                @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
                public void onGlobalLayout() {
                    RelativeLayout relativeLayout2;
                    RelativeLayout relativeLayout3;
                    int i;
                    Context context;
                    RelativeLayout relativeLayout4;
                    ViewGroup.LayoutParams layoutParams2;
                    RelativeLayout relativeLayout5;
                    Context context2;
                    ViewTreeObserver viewTreeObserver2;
                    relativeLayout2 = OneErrorDialogBox.this.f83067h;
                    if (relativeLayout2 != null && (viewTreeObserver2 = relativeLayout2.getViewTreeObserver()) != null) {
                        viewTreeObserver2.removeOnGlobalLayoutListener(this);
                    }
                    relativeLayout3 = OneErrorDialogBox.this.f83067h;
                    if (relativeLayout3 != null) {
                        i = relativeLayout3.getWidth();
                    } else {
                        i = 0;
                    }
                    context = OneErrorDialogBox.this.f83065f;
                    DisplayMetrics displayMetrics2 = context.getResources().getDisplayMetrics();
                    Intrinsics.checkNotNullExpressionValue(displayMetrics2, "mContext.resources.displayMetrics");
                    if (i >= ScreenSizeHelper.getWidthScreenSizePixel(displayMetrics2)) {
                        relativeLayout4 = OneErrorDialogBox.this.f83067h;
                        if (relativeLayout4 != null) {
                            layoutParams2 = relativeLayout4.getLayoutParams();
                        } else {
                            layoutParams2 = null;
                        }
                        if (layoutParams2 != null) {
                            context2 = OneErrorDialogBox.this.f83065f;
                            layoutParams2.width = (int) (context2.getResources().getDisplayMetrics().widthPixels * 0.9d);
                        }
                        relativeLayout5 = OneErrorDialogBox.this.f83067h;
                        if (relativeLayout5 != null) {
                            relativeLayout5.setLayoutParams(layoutParams2);
                        }
                    }
                }
            });
        }
        if (oneFontButton != null) {
            oneFontButton.setOnClickListener(new View.OnClickListener() { // from class: NS0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    OneErrorDialogBox.m19921f(OneErrorDialogBox.this, view);
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
            String format = String.format("%s: %s", Arrays.copyOf(new Object[]{"code", str}, 2));
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

    public final void setMessage(@Nullable String str) {
        OneFontTextView oneFontTextView = (OneFontTextView) findViewById(R.id.alert_message);
        if (oneFontTextView == null) {
            return;
        }
        oneFontTextView.setText(str);
    }

    public final void setSuccess() {
        Button button = (Button) findViewById(R.id.alert_box_button);
        if (button != null) {
            button.setBackgroundResource(R.drawable.z_button_success);
        }
        if (button != null) {
            button.setText(R.string.ok);
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
            oneFontTextView.setVisibility(0);
        }
    }

    public final void showServerDateTime(@NotNull String dateTime) {
        Intrinsics.checkNotNullParameter(dateTime, "dateTime");
        OneFontTextView oneFontTextView = (OneFontTextView) findViewById(R.id.tvDate);
        if (dateTime.length() > 0) {
            if (oneFontTextView != null) {
                StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                String format = String.format("%s %s", Arrays.copyOf(new Object[]{"วันที่", dateTime}, 2));
                Intrinsics.checkNotNullExpressionValue(format, "format(...)");
                oneFontTextView.setText(format);
            }
            if (oneFontTextView != null) {
                oneFontTextView.setVisibility(0);
            }
        } else if (oneFontTextView != null) {
            oneFontTextView.setVisibility(8);
        }
    }

    public final void showSystemMessage(@NotNull String systemMessage) {
        Intrinsics.checkNotNullParameter(systemMessage, "systemMessage");
        OneFontTextView oneFontTextView = (OneFontTextView) findViewById(R.id.tvSystemMessage);
        if (systemMessage.length() > 0) {
            if (oneFontTextView != null) {
                oneFontTextView.setText(systemMessage);
            }
            if (oneFontTextView != null) {
                oneFontTextView.setVisibility(0);
            }
        } else if (oneFontTextView != null) {
            oneFontTextView.setVisibility(8);
        }
    }

    public final void showUsername(@Nullable String str) {
        OneFontTextView oneFontTextView = (OneFontTextView) findViewById(R.id.tvUserName);
        if (str != null && str.length() != 0) {
            if (oneFontTextView != null) {
                StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                String format = String.format("%s %s", Arrays.copyOf(new Object[]{"User :", str}, 2));
                Intrinsics.checkNotNullExpressionValue(format, "format(...)");
                oneFontTextView.setText(format);
            }
            if (oneFontTextView != null) {
                oneFontTextView.setVisibility(0);
            }
        } else if (oneFontTextView != null) {
            oneFontTextView.setVisibility(8);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OneErrorDialogBox(@NotNull Context mContext, boolean z, @Nullable DialogInterface.OnCancelListener onCancelListener, @Nullable Callback callback) {
        super(mContext, z, onCancelListener);
        Intrinsics.checkNotNullParameter(mContext, "mContext");
        this.f83065f = mContext;
        this.f83066g = callback;
        requestWindowFeature(1);
        setContentView(R.layout.one_error_alert_box);
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
    @JvmOverloads
    public OneErrorDialogBox(@NotNull Context context, @Nullable Callback callback) {
        this(context, false, (DialogInterface.OnCancelListener) null, callback);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ OneErrorDialogBox(Context context, Callback callback, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : callback);
    }
}