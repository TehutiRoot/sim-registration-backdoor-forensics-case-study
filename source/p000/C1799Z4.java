package p000;

import android.app.Application;
import androidx.annotation.DoNotInline;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: Z4 */
/* loaded from: classes.dex */
public final class C1799Z4 {

    /* renamed from: a */
    public static final C1799Z4 f7948a = new C1799Z4();

    @DoNotInline
    @NotNull
    /* renamed from: a */
    public final String m65268a() {
        String processName = Application.getProcessName();
        Intrinsics.checkNotNullExpressionValue(processName, "getProcessName()");
        return processName;
    }
}
