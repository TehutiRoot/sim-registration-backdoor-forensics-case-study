package p000;

import android.content.Context;
import androidx.annotation.ColorRes;
import androidx.annotation.DoNotInline;
import androidx.compose.p003ui.graphics.ColorKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: Fs */
/* loaded from: classes2.dex */
public final class C0414Fs {

    /* renamed from: a */
    public static final C0414Fs f1709a = new C0414Fs();

    @DoNotInline
    /* renamed from: a */
    public final long m68345a(@NotNull Context context, @ColorRes int i) {
        int color;
        Intrinsics.checkNotNullParameter(context, "context");
        color = context.getResources().getColor(i, context.getTheme());
        return ColorKt.Color(color);
    }
}
