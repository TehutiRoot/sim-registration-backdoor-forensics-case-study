package p000;

import android.content.Context;
import android.graphics.Typeface;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: o4 */
/* loaded from: classes2.dex */
public final class C12416o4 {

    /* renamed from: a */
    public static final C12416o4 f72551a = new C12416o4();

    @DoNotInline
    @RequiresApi(26)
    @NotNull
    /* renamed from: a */
    public final Typeface m25971a(@NotNull Context context, int i) {
        Typeface font;
        Intrinsics.checkNotNullParameter(context, "context");
        font = context.getResources().getFont(i);
        Intrinsics.checkNotNullExpressionValue(font, "context.resources.getFont(resourceId)");
        return font;
    }
}
