package th.p047co.dtac.android.dtacone.app_one.util.font;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.Log;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import ch.qos.logback.core.CoreConstants;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.google.android.material.textfield.TextInputLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.manager.Contextor;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bJ\u001e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nJ\u0016\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u000b¨\u0006\f"}, m29142d2 = {"Lth/co/dtac/android/dtacone/app_one/util/font/OneMultiLanguageUtil;", "", "()V", "setLanguageToView", "", "typedArray", "Landroid/content/res/TypedArray;", Promotion.ACTION_VIEW, "Landroid/widget/TextView;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/content/Context;", "Lcom/google/android/material/textfield/TextInputLayout;", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: th.co.dtac.android.dtacone.app_one.util.font.OneMultiLanguageUtil */
/* loaded from: classes7.dex */
public final class OneMultiLanguageUtil {
    public static final int $stable = 0;
    @NotNull
    public static final OneMultiLanguageUtil INSTANCE = new OneMultiLanguageUtil();

    public final void setLanguageToView(@NotNull TypedArray typedArray, @NotNull TextView view) {
        Intrinsics.checkNotNullParameter(typedArray, "typedArray");
        Intrinsics.checkNotNullParameter(view, "view");
        int resourceId = typedArray.getResourceId(R.styleable.OneFontTextView_android_text, 0);
        int resourceId2 = typedArray.getResourceId(R.styleable.OneFontTextView_android_hint, 0);
        if (resourceId != 0) {
            try {
                view.setText(Contextor.getInstance().getContext().getString(resourceId));
            } catch (Exception unused) {
                String hexString = Integer.toHexString(resourceId);
                Log.w("MultiLanguageUtil", "Not found Message ID #0x" + hexString + " to set text");
            }
        }
        if (resourceId2 != 0) {
            try {
                view.setHint(Contextor.getInstance().getContext().getString(resourceId2));
            } catch (Exception unused2) {
                String hexString2 = Integer.toHexString(resourceId2);
                Log.w("MultiLanguageUtil", "Not found Message ID #0x" + hexString2 + " to set hint");
            }
        }
    }

    public final void setLanguageToView(@NotNull TypedArray typedArray, @NotNull TextView view, @NotNull Context context) {
        Intrinsics.checkNotNullParameter(typedArray, "typedArray");
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(context, "context");
        int resourceId = typedArray.getResourceId(R.styleable.OneFontTextView_android_text, 0);
        int resourceId2 = typedArray.getResourceId(R.styleable.OneFontTextView_android_hint, 0);
        if (resourceId != 0) {
            try {
                view.setText(context.getString(resourceId));
            } catch (Exception unused) {
                String hexString = Integer.toHexString(resourceId);
                Log.w("MultiLanguageUtil", "Not found Message ID #0x" + hexString + " to set text");
            }
        }
        if (resourceId2 != 0) {
            try {
                view.setHint(context.getString(resourceId2));
            } catch (Exception unused2) {
                String hexString2 = Integer.toHexString(resourceId2);
                Log.w("MultiLanguageUtil", "Not found Message ID #0x" + hexString2 + " to set hint");
            }
        }
    }

    public final void setLanguageToView(@NotNull TypedArray typedArray, @NotNull TextInputLayout view) {
        Intrinsics.checkNotNullParameter(typedArray, "typedArray");
        Intrinsics.checkNotNullParameter(view, "view");
        int resourceId = typedArray.getResourceId(R.styleable.OneFontTextView_android_text, 0);
        int resourceId2 = typedArray.getResourceId(R.styleable.OneFontTextView_android_hint, 0);
        if (resourceId != 0) {
            try {
                view.setHint(Contextor.getInstance().getContext().getString(resourceId));
            } catch (Exception unused) {
                String hexString = Integer.toHexString(resourceId);
                Log.w("MultiLanguageUtil", "Not found Message ID #0x" + hexString + " to set text");
            }
        }
        if (resourceId2 != 0) {
            try {
                view.setHint(Contextor.getInstance().getContext().getString(resourceId2));
            } catch (Exception unused2) {
                String hexString2 = Integer.toHexString(resourceId2);
                Log.w("MultiLanguageUtil", "Not found Message ID #0x" + hexString2 + " to set hint");
            }
        }
    }
}