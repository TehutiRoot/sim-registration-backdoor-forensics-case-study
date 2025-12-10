package p000;

import android.content.Context;
import android.graphics.Typeface;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: a4 */
/* loaded from: classes2.dex */
public final class C1846a4 {

    /* renamed from: a */
    public static final C1846a4 f8340a = new C1846a4();

    @DoNotInline
    @RequiresApi(26)
    @NotNull
    /* renamed from: a */
    public final Typeface m65181a(@NotNull Context context, int i) {
        Typeface font;
        Intrinsics.checkNotNullParameter(context, "context");
        font = context.getResources().getFont(i);
        Intrinsics.checkNotNullExpressionValue(font, "context.resources.getFont(resourceId)");
        return font;
    }
}