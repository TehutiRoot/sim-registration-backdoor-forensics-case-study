package p000;

import android.text.StaticLayout;
import androidx.annotation.DoNotInline;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: oM1  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C21406oM1 {

    /* renamed from: a */
    public static final C21406oM1 f72689a = new C21406oM1();

    @JvmStatic
    @DoNotInline
    /* renamed from: a */
    public static final void m25929a(@NotNull StaticLayout.Builder builder, boolean z) {
        Intrinsics.checkNotNullParameter(builder, "builder");
        builder.setUseLineSpacingFromFallbacks(z);
    }
}
