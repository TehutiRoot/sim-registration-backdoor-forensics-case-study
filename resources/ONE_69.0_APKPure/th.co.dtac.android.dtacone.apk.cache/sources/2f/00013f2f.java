package th.p047co.dtac.android.dtacone.view.appOne.staff.dialog;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import androidx.appcompat.app.AppCompatDialog;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.content.res.ResourcesCompat;
import ch.qos.logback.core.CoreConstants;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.i18n.MessageBundle;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.app_one.widget.OneFontTextView;
import th.p047co.dtac.android.dtacone.view.appOne.staff.dialog.OneStaffSoldClearDialog;
import th.p047co.dtac.android.dtacone.widget.dialog.CustomDialogBox;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u00002\u00020\u0001BA\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0012\u0010\u0011J\u0019\u0010\u0015\u001a\u00020\u000f2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0014¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0006\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u0018R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0018R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u001aR\u0014\u0010\n\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001aR\u0016\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0018\u0010!\u001a\u0004\u0018\u00010\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0018\u0010#\u001a\u0004\u0018\u00010\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010 R\u0018\u0010%\u001a\u0004\u0018\u00010\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010 R\u0018\u0010'\u001a\u0004\u0018\u00010\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010 R\u0018\u0010)\u001a\u0004\u0018\u00010\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010 ¨\u0006*"}, m29142d2 = {"Lth/co/dtac/android/dtacone/view/appOne/staff/dialog/OneStaffSoldClearDialog;", "Landroidx/appcompat/app/AppCompatDialog;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "", MessageBundle.TITLE_ENTRY, "subTitle", "description", "", "fontColor", "btnConfirmBackground", "Lth/co/dtac/android/dtacone/widget/dialog/CustomDialogBox$Callback;", "callback", "<init>", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IILth/co/dtac/android/dtacone/widget/dialog/CustomDialogBox$Callback;)V", "", "i", "()V", OperatorName.CLOSE_PATH, "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", OperatorName.FILL_NON_ZERO, "Ljava/lang/String;", OperatorName.NON_STROKING_GRAY, "I", OperatorName.SET_LINE_JOINSTYLE, OperatorName.NON_STROKING_CMYK, "Lth/co/dtac/android/dtacone/widget/dialog/CustomDialogBox$Callback;", "Lth/co/dtac/android/dtacone/app_one/widget/OneFontTextView;", OperatorName.LINE_TO, "Lth/co/dtac/android/dtacone/app_one/widget/OneFontTextView;", "tvTitle", OperatorName.MOVE_TO, "tvSubTitle", OperatorName.ENDPATH, "tvDescription", "o", "btnConfirm", "p", "btnCancel", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0})
/* renamed from: th.co.dtac.android.dtacone.view.appOne.staff.dialog.OneStaffSoldClearDialog */
/* loaded from: classes10.dex */
public final class OneStaffSoldClearDialog extends AppCompatDialog {
    public static final int $stable = 8;

    /* renamed from: f */
    public final String f97261f;

    /* renamed from: g */
    public final String f97262g;

    /* renamed from: h */
    public final String f97263h;

    /* renamed from: i */
    public final int f97264i;

    /* renamed from: j */
    public final int f97265j;

    /* renamed from: k */
    public final CustomDialogBox.Callback f97266k;

    /* renamed from: l */
    public OneFontTextView f97267l;

    /* renamed from: m */
    public OneFontTextView f97268m;

    /* renamed from: n */
    public OneFontTextView f97269n;

    /* renamed from: o */
    public OneFontTextView f97270o;

    /* renamed from: p */
    public OneFontTextView f97271p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OneStaffSoldClearDialog(@NotNull Context context, @NotNull String title, @NotNull String subTitle, @NotNull String description, int i, int i2, @Nullable CustomDialogBox.Callback callback) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subTitle, "subTitle");
        Intrinsics.checkNotNullParameter(description, "description");
        this.f97261f = title;
        this.f97262g = subTitle;
        this.f97263h = description;
        this.f97264i = i;
        this.f97265j = i2;
        this.f97266k = callback;
        requestWindowFeature(1);
        setContentView(R.layout.one_dialog_sold_clear);
        setCancelable(true);
    }

    /* renamed from: h */
    private final void m9983h() {
        this.f97267l = (OneFontTextView) findViewById(R.id.tvTitle);
        this.f97268m = (OneFontTextView) findViewById(R.id.tvSubTitle);
        this.f97269n = (OneFontTextView) findViewById(R.id.tvDescription);
        this.f97270o = (OneFontTextView) findViewById(R.id.btnConfirm);
        this.f97271p = (OneFontTextView) findViewById(R.id.btnCancel);
    }

    /* renamed from: i */
    private final void m9982i() {
        OneFontTextView oneFontTextView = this.f97267l;
        if (oneFontTextView != null) {
            oneFontTextView.setText(this.f97261f);
        }
        OneFontTextView oneFontTextView2 = this.f97268m;
        if (oneFontTextView2 != null) {
            oneFontTextView2.setText(this.f97262g);
        }
        OneFontTextView oneFontTextView3 = this.f97269n;
        if (oneFontTextView3 != null) {
            oneFontTextView3.setText(this.f97263h);
        }
        OneFontTextView oneFontTextView4 = this.f97269n;
        if (oneFontTextView4 != null) {
            oneFontTextView4.setTextColor(ResourcesCompat.getColor(getContext().getResources(), this.f97264i, null));
        }
        OneFontTextView oneFontTextView5 = this.f97270o;
        if (oneFontTextView5 != null) {
            oneFontTextView5.setBackgroundResource(this.f97265j);
        }
        OneFontTextView oneFontTextView6 = this.f97270o;
        if (oneFontTextView6 != null) {
            oneFontTextView6.setOnClickListener(new View.OnClickListener() { // from class: Xd1
                {
                    OneStaffSoldClearDialog.this = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    OneStaffSoldClearDialog.m9981j(OneStaffSoldClearDialog.this, view);
                }
            });
        }
        OneFontTextView oneFontTextView7 = this.f97271p;
        if (oneFontTextView7 != null) {
            oneFontTextView7.setOnClickListener(new View.OnClickListener() { // from class: Yd1
                {
                    OneStaffSoldClearDialog.this = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    OneStaffSoldClearDialog.m9980k(OneStaffSoldClearDialog.this, view);
                }
            });
        }
    }

    /* renamed from: j */
    public static final void m9981j(OneStaffSoldClearDialog this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        CustomDialogBox.Callback callback = this$0.f97266k;
        if (callback != null) {
            callback.onButtonClick();
        }
        this$0.dismiss();
    }

    /* renamed from: k */
    public static final void m9980k(OneStaffSoldClearDialog this$0, View view) {
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
        m9983h();
        m9982i();
    }
}