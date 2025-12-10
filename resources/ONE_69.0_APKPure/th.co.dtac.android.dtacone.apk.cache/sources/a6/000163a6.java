package p000;

import android.content.Context;
import android.graphics.Typeface;
import androidx.annotation.DoNotInline;
import androidx.compose.p003ui.text.font.ResourceFont;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: zy1  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C23470zy1 {

    /* renamed from: a */
    public static final C23470zy1 f109544a = new C23470zy1();

    @DoNotInline
    @NotNull
    /* renamed from: a */
    public final Typeface m37a(@NotNull Context context, @NotNull ResourceFont font) {
        Typeface font2;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(font, "font");
        font2 = context.getResources().getFont(font.getResId());
        Intrinsics.checkNotNullExpressionValue(font2, "context.resources.getFont(font.resId)");
        return font2;
    }
}