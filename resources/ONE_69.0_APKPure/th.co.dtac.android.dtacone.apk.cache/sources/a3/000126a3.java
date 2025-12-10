package th.p047co.dtac.android.dtacone.util;

import android.content.Context;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import androidx.compose.runtime.internal.StabilityInferred;
import ch.qos.logback.core.CoreConstants;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0011\b\u0007\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\r\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\r\u001a\u00020\n¢\u0006\u0004\b\r\u0010\fR\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR$\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\"\u0010\u0007\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0007\u0010\u0018\"\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, m29142d2 = {"Lth/co/dtac/android/dtacone/util/KeyboardUtil;", "", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/view/View;", Promotion.ACTION_VIEW, "", "isShow", "<init>", "(Landroid/content/Context;Landroid/view/View;Z)V", "", "showKeyboard", "()V", "hideKeyboard", PDPageLabelRange.STYLE_LETTERS_LOWER, "Landroid/content/Context;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "Landroid/view/View;", "getView", "()Landroid/view/View;", "setView", "(Landroid/view/View;)V", OperatorName.CURVE_TO, "Z", "()Z", "setShow", "(Z)V", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0})
/* renamed from: th.co.dtac.android.dtacone.util.KeyboardUtil */
/* loaded from: classes8.dex */
public final class KeyboardUtil {
    public static final int $stable = 8;

    /* renamed from: a */
    public Context f87061a;

    /* renamed from: b */
    public View f87062b;

    /* renamed from: c */
    public boolean f87063c;

    public KeyboardUtil(@NotNull Context context, @Nullable View view, boolean z) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f87061a = context;
        this.f87062b = view;
        this.f87063c = z;
    }

    @Nullable
    public final View getView() {
        return this.f87062b;
    }

    public final void hideKeyboard() {
        if (this.f87063c) {
            InputMethodManager inputMethodManager = (InputMethodManager) this.f87061a.getSystemService("input_method");
            View view = this.f87062b;
            if (view != null && inputMethodManager != null) {
                inputMethodManager.hideSoftInputFromWindow(view.getWindowToken(), 0);
                this.f87063c = false;
            }
        }
    }

    public final boolean isShow() {
        return this.f87063c;
    }

    public final void setShow(boolean z) {
        this.f87063c = z;
    }

    public final void setView(@Nullable View view) {
        this.f87062b = view;
    }

    public final void showKeyboard() {
        InputMethodManager inputMethodManager;
        if (!this.f87063c && (inputMethodManager = (InputMethodManager) this.f87061a.getSystemService("input_method")) != null) {
            inputMethodManager.toggleSoftInput(1, 1);
            this.f87063c = true;
        }
    }

    public /* synthetic */ KeyboardUtil(Context context, View view, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : view, (i & 4) != 0 ? false : z);
    }
}