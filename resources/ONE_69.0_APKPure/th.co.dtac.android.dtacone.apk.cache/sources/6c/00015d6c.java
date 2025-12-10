package th.p047co.dtac.android.dtacone.widget.view;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.content.res.ResourcesCompat;
import ch.qos.logback.core.CoreConstants;
import com.google.android.material.R;
import com.google.android.material.snackbar.Snackbar;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import th.p047co.dtac.android.dtacone.util.TypefaceUtil;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J,\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\u000b\u001a\u00020\fH\u0007¨\u0006\r"}, m29142d2 = {"Lth/co/dtac/android/dtacone/widget/view/DtacSnackbar;", "", "()V", "snackbar", "Lcom/google/android/material/snackbar/Snackbar;", "viewGroup", "Landroid/view/View;", "message", "", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/content/Context;", TypedValues.TransitionType.S_DURATION, "", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.widget.view.DtacSnackbar */
/* loaded from: classes9.dex */
public final class DtacSnackbar {
    public static final int $stable = 0;
    @NotNull
    public static final DtacSnackbar INSTANCE = new DtacSnackbar();

    @JvmStatic
    @NotNull
    public static final Snackbar snackbar(@NotNull View viewGroup, @NotNull String message, @Nullable Context context, int i) {
        TextView textView;
        Intrinsics.checkNotNullParameter(viewGroup, "viewGroup");
        Intrinsics.checkNotNullParameter(message, "message");
        Snackbar make = Snackbar.make(viewGroup, message, i);
        Intrinsics.checkNotNullExpressionValue(make, "make(viewGroup, message, duration)");
        if (context != null) {
            View view = make.getView();
            Intrinsics.checkNotNullExpressionValue(view, "snackbar.view");
            View findViewById = view.findViewById(R.id.snackbar_text);
            TextView textView2 = null;
            if (findViewById instanceof TextView) {
                textView = (TextView) findViewById;
            } else {
                textView = null;
            }
            if (textView != null) {
                textView.setTypeface(TypefaceUtil.getTypefaceRegular(context));
            }
            if (textView != null) {
                textView.setMaxLines(2);
            }
            if (textView != null) {
                textView.setMinLines(1);
            }
            if (textView != null) {
                textView.setTextSize(2, 14.0f);
            }
            View findViewById2 = view.findViewById(R.id.snackbar_action);
            if (findViewById2 instanceof TextView) {
                textView2 = (TextView) findViewById2;
            }
            if (textView2 != null) {
                textView2.setTypeface(ResourcesCompat.getFont(context, th.p047co.dtac.android.dtacone.R.font.font_style));
            }
            if (textView2 != null) {
                textView2.setTextSize(2, 14.0f);
            }
        }
        return make;
    }

    public static /* synthetic */ Snackbar snackbar$default(View view, String str, Context context, int i, int i2, Object obj) {
        if ((i2 & 8) != 0) {
            i = 0;
        }
        return snackbar(view, str, context, i);
    }
}