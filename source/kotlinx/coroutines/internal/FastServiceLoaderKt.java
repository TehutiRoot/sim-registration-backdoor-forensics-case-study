package kotlinx.coroutines.internal;

import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(m28851d1 = {"\u0000\b\n\u0002\u0010\u000b\n\u0002\b\u0005\"\u001a\u0010\u0001\u001a\u00020\u00008\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0001\u0010\u0002\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m28850d2 = {"", "ANDROID_DETECTED", "Z", "getANDROID_DETECTED", "()Z", "kotlinx-coroutines-core"}, m28849k = 2, m28848mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nFastServiceLoader.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FastServiceLoader.kt\nkotlinx/coroutines/internal/FastServiceLoaderKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,161:1\n1#2:162\n*E\n"})
/* loaded from: classes6.dex */
public final class FastServiceLoaderKt {
    static {
        Object m74087constructorimpl;
        try {
            Result.Companion companion = Result.Companion;
            m74087constructorimpl = Result.m74087constructorimpl(Class.forName("android.os.Build"));
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.Companion;
            m74087constructorimpl = Result.m74087constructorimpl(ResultKt.createFailure(th2));
        }
        Result.m74094isSuccessimpl(m74087constructorimpl);
    }

    public static final boolean getANDROID_DETECTED() {
        return true;
    }
}
