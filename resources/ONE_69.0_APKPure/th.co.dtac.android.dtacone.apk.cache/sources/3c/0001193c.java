package th.p047co.dtac.android.dtacone.extension;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Handler;
import android.os.Looper;
import androidx.core.content.res.ResourcesCompat;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import es.dmoral.toasty.Toasty;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.extension.ContextExtenKt;

@Metadata(m29143d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0019\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0013\u0010\u0006\u001a\u00020\u0003*\u00020\u0000H\u0002¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0011\u0010\n\u001a\u00020\t*\u00020\b¢\u0006\u0004\b\n\u0010\u000b\u001a\u0011\u0010\n\u001a\u00020\t*\u00020\f¢\u0006\u0004\b\n\u0010\r¨\u0006\u000e"}, m29142d2 = {"Landroid/app/Activity;", "", "message", "", "showToastCenterLong", "(Landroid/app/Activity;Ljava/lang/String;)V", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "(Landroid/app/Activity;)V", "Landroid/content/Context;", "", "isLargeScreen", "(Landroid/content/Context;)Z", "Landroid/content/res/Resources;", "(Landroid/content/res/Resources;)Z", "app_prodRelease"}, m29141k = 2, m29140mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nContextExten.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ContextExten.kt\nth/co/dtac/android/dtacone/extension/ContextExtenKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,37:1\n1#2:38\n*E\n"})
/* renamed from: th.co.dtac.android.dtacone.extension.ContextExtenKt */
/* loaded from: classes7.dex */
public final class ContextExtenKt {
    /* renamed from: a */
    public static /* synthetic */ void m19680a(Activity activity, String str) {
        m19678c(activity, str);
    }

    /* renamed from: b */
    public static final void m19679b(Activity activity) {
        Typeface font = ResourcesCompat.getFont(activity, R.font.dtac_regular);
        if (font != null) {
            Toasty.Config.getInstance().setToastTypeface(font);
        }
    }

    /* renamed from: c */
    public static final void m19678c(Activity this_showToastCenterLong, String message) {
        Intrinsics.checkNotNullParameter(this_showToastCenterLong, "$this_showToastCenterLong");
        Intrinsics.checkNotNullParameter(message, "$message");
        Toasty.normal(this_showToastCenterLong, message).show();
    }

    public static final boolean isLargeScreen(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        Resources resources = context.getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "resources");
        return isLargeScreen(resources);
    }

    public static final void showToastCenterLong(@NotNull final Activity activity, @NotNull final String message) {
        Intrinsics.checkNotNullParameter(activity, "<this>");
        Intrinsics.checkNotNullParameter(message, "message");
        m19679b(activity);
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: hy
            @Override // java.lang.Runnable
            public final void run() {
                ContextExtenKt.m19680a(activity, message);
            }
        });
    }

    public static final boolean isLargeScreen(@NotNull Resources resources) {
        Intrinsics.checkNotNullParameter(resources, "<this>");
        return (resources.getConfiguration().screenLayout & 15) == 3;
    }
}