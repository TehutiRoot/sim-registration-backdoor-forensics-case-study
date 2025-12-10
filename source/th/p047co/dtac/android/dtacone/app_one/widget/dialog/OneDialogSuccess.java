package th.p047co.dtac.android.dtacone.app_one.widget.dialog;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import androidx.appcompat.app.AppCompatDelegate;
import androidx.appcompat.app.AppCompatDialog;
import androidx.compose.runtime.internal.StabilityInferred;
import ch.qos.logback.core.CoreConstants;
import com.feitian.readerdk.Tool.C6150DK;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.i18n.MessageBundle;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.app_one.widget.dialog.OneDialogSuccess;
import th.p047co.dtac.android.dtacone.databinding.OneDialogSuccessBinding;

@StabilityInferred(parameters = 0)
@Metadata(m28851d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 (2\u00020\u0001:\u0002)(B[\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u000f\u0010\u0010B\u001d\b\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u000f\u0010\u0011B5\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\n\u0012\u0006\u0010\u000e\u001a\u00020\n¢\u0006\u0004\b\u000f\u0010\u0012B=\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\n\u0012\u0006\u0010\u000e\u001a\u00020\n¢\u0006\u0004\b\u000f\u0010\u0013J\u0019\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0014¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u001b\u001a\u00020\u00162\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001b\u0010\u001cR\u0016\u0010\t\u001a\u0004\u0018\u00010\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0016\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0016\u0010\f\u001a\u0004\u0018\u00010\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010 R\u0016\u0010\r\u001a\u0004\u0018\u00010\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010 R\u0016\u0010\u000e\u001a\u0004\u0018\u00010\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010 R\u0016\u0010'\u001a\u00020$8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b%\u0010&¨\u0006*"}, m28850d2 = {"Lth/co/dtac/android/dtacone/app_one/widget/dialog/OneDialogSuccess;", "Landroidx/appcompat/app/AppCompatDialog;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "cancelable", "Landroid/content/DialogInterface$OnCancelListener;", "cancelListener", "Lth/co/dtac/android/dtacone/app_one/widget/dialog/OneDialogSuccess$Callback;", "callback", "", MessageBundle.TITLE_ENTRY, "desc", "icon", "buttonColor", "<init>", "(Landroid/content/Context;ZLandroid/content/DialogInterface$OnCancelListener;Lth/co/dtac/android/dtacone/app_one/widget/dialog/OneDialogSuccess$Callback;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)V", "(Landroid/content/Context;Lth/co/dtac/android/dtacone/app_one/widget/dialog/OneDialogSuccess$Callback;)V", "(Landroid/content/Context;Lth/co/dtac/android/dtacone/app_one/widget/dialog/OneDialogSuccess$Callback;III)V", "(Landroid/content/Context;Lth/co/dtac/android/dtacone/app_one/widget/dialog/OneDialogSuccess$Callback;IIII)V", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "(Landroid/os/Bundle;)V", "", OperatorName.CLOSE_AND_STROKE, "setMessage", "(Ljava/lang/String;)V", OperatorName.FILL_NON_ZERO, "Lth/co/dtac/android/dtacone/app_one/widget/dialog/OneDialogSuccess$Callback;", OperatorName.NON_STROKING_GRAY, "Ljava/lang/Integer;", OperatorName.CLOSE_PATH, "i", OperatorName.SET_LINE_JOINSTYLE, "Lth/co/dtac/android/dtacone/databinding/OneDialogSuccessBinding;", OperatorName.NON_STROKING_CMYK, "Lth/co/dtac/android/dtacone/databinding/OneDialogSuccessBinding;", "binding", "Companion", "Callback", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0})
/* renamed from: th.co.dtac.android.dtacone.app_one.widget.dialog.OneDialogSuccess */
/* loaded from: classes7.dex */
public final class OneDialogSuccess extends AppCompatDialog {

    /* renamed from: f */
    public final Callback f82967f;

    /* renamed from: g */
    public final Integer f82968g;

    /* renamed from: h */
    public final Integer f82969h;

    /* renamed from: i */
    public final Integer f82970i;

    /* renamed from: j */
    public final Integer f82971j;

    /* renamed from: k */
    public OneDialogSuccessBinding f82972k;
    @NotNull
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Metadata(m28851d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&¨\u0006\u0004"}, m28850d2 = {"Lth/co/dtac/android/dtacone/app_one/widget/dialog/OneDialogSuccess$Callback;", "", "onButtonClick", "", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.app_one.widget.dialog.OneDialogSuccess$Callback */
    /* loaded from: classes7.dex */
    public interface Callback {
        void onButtonClick();
    }

    @Metadata(m28851d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, m28850d2 = {"Lth/co/dtac/android/dtacone/app_one/widget/dialog/OneDialogSuccess$Companion;", "", "()V", "app_prodRelease"}, m28849k = 1, m28848mv = {1, 8, 0}, m28846xi = 48)
    /* renamed from: th.co.dtac.android.dtacone.app_one.widget.dialog.OneDialogSuccess$Companion */
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
    public OneDialogSuccess(@NotNull Context context) {
        this(context, null, 2, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* renamed from: f */
    public static /* synthetic */ void m19748f(OneDialogSuccess oneDialogSuccess, View view) {
        m19747g(oneDialogSuccess, view);
    }

    /* renamed from: g */
    public static final void m19747g(OneDialogSuccess this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Callback callback = this$0.f82967f;
        if (callback != null) {
            callback.onButtonClick();
        }
        this$0.dismiss();
    }

    @Override // androidx.appcompat.app.AppCompatDialog, androidx.activity.ComponentDialog, android.app.Dialog
    public void onCreate(@Nullable Bundle bundle) {
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
        OneDialogSuccessBinding inflate = OneDialogSuccessBinding.inflate(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(layoutInflater)");
        this.f82972k = inflate;
        OneDialogSuccessBinding oneDialogSuccessBinding = null;
        if (inflate == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            inflate = null;
        }
        inflate.btnOK.setOnClickListener(new View.OnClickListener() { // from class: BS0
            {
                OneDialogSuccess.this = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                OneDialogSuccess.m19748f(OneDialogSuccess.this, view);
            }
        });
        Integer num = this.f82968g;
        if (num != null) {
            int intValue = num.intValue();
            OneDialogSuccessBinding oneDialogSuccessBinding2 = this.f82972k;
            if (oneDialogSuccessBinding2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                oneDialogSuccessBinding2 = null;
            }
            oneDialogSuccessBinding2.tvSuccessTitle.setText(intValue);
        }
        Integer num2 = this.f82969h;
        if (num2 != null) {
            int intValue2 = num2.intValue();
            OneDialogSuccessBinding oneDialogSuccessBinding3 = this.f82972k;
            if (oneDialogSuccessBinding3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                oneDialogSuccessBinding3 = null;
            }
            oneDialogSuccessBinding3.tvSuccessDescription.setVisibility(0);
            OneDialogSuccessBinding oneDialogSuccessBinding4 = this.f82972k;
            if (oneDialogSuccessBinding4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                oneDialogSuccessBinding4 = null;
            }
            oneDialogSuccessBinding4.tvSuccessDescription.setText(intValue2);
        }
        if (this.f82970i != null) {
            OneDialogSuccessBinding oneDialogSuccessBinding5 = this.f82972k;
            if (oneDialogSuccessBinding5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                oneDialogSuccessBinding5 = null;
            }
            oneDialogSuccessBinding5.ivIconCheck.setImageResource(this.f82970i.intValue());
        }
        Integer num3 = this.f82971j;
        if (num3 != null) {
            int intValue3 = num3.intValue();
            OneDialogSuccessBinding oneDialogSuccessBinding6 = this.f82972k;
            if (oneDialogSuccessBinding6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                oneDialogSuccessBinding6 = null;
            }
            oneDialogSuccessBinding6.btnOK.setButtonBackground(intValue3);
        }
        OneDialogSuccessBinding oneDialogSuccessBinding7 = this.f82972k;
        if (oneDialogSuccessBinding7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
        } else {
            oneDialogSuccessBinding = oneDialogSuccessBinding7;
        }
        setContentView(oneDialogSuccessBinding.getRoot());
    }

    public final void setMessage(@NotNull String s) {
        Intrinsics.checkNotNullParameter(s, "s");
        OneDialogSuccessBinding oneDialogSuccessBinding = this.f82972k;
        if (oneDialogSuccessBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            oneDialogSuccessBinding = null;
        }
        oneDialogSuccessBinding.tvSuccessTitle.setText(s);
    }

    public /* synthetic */ OneDialogSuccess(Context context, boolean z, DialogInterface.OnCancelListener onCancelListener, Callback callback, Integer num, Integer num2, Integer num3, Integer num4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, z, onCancelListener, callback, (i & 16) != 0 ? null : num, (i & 32) != 0 ? null : num2, (i & 64) != 0 ? null : num3, (i & 128) != 0 ? null : num4);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OneDialogSuccess(@NotNull Context context, boolean z, @Nullable DialogInterface.OnCancelListener onCancelListener, @Nullable Callback callback, @Nullable Integer num, @Nullable Integer num2, @Nullable Integer num3, @Nullable Integer num4) {
        super(context, z, onCancelListener);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f82967f = callback;
        this.f82968g = num;
        this.f82969h = num2;
        this.f82970i = num3;
        this.f82971j = num4;
        requestWindowFeature(1);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public OneDialogSuccess(@NotNull Context context, @Nullable Callback callback) {
        this(context, false, null, callback, null, null, null, null, C6150DK.ERROR_RECEIVE_LRC, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ OneDialogSuccess(Context context, Callback callback, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : callback);
    }

    public /* synthetic */ OneDialogSuccess(Context context, Callback callback, int i, int i2, int i3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i4 & 2) != 0 ? null : callback, i, i2, i3);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public OneDialogSuccess(@NotNull Context context, @Nullable Callback callback, int i, int i2, int i3) {
        this(context, false, (DialogInterface.OnCancelListener) null, callback, Integer.valueOf(i), (Integer) null, Integer.valueOf(i2), Integer.valueOf(i3));
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ OneDialogSuccess(Context context, Callback callback, int i, int i2, int i3, int i4, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i5 & 2) != 0 ? null : callback, i, i2, i3, i4);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public OneDialogSuccess(@NotNull Context context, @Nullable Callback callback, int i, int i2, int i3, int i4) {
        this(context, false, (DialogInterface.OnCancelListener) null, callback, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4));
        Intrinsics.checkNotNullParameter(context, "context");
    }
}
