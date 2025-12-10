package p000;

import android.app.Application;
import androidx.annotation.DoNotInline;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: Z4 */
/* loaded from: classes.dex */
public final class C1779Z4 {

    /* renamed from: a */
    public static final C1779Z4 f8090a = new C1779Z4();

    @DoNotInline
    @NotNull
    /* renamed from: a */
    public final String m65262a() {
        String processName = Application.getProcessName();
        Intrinsics.checkNotNullExpressionValue(processName, "getProcessName()");
        return processName;
    }
}