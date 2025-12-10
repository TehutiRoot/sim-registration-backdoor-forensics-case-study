package kotlinx.coroutines.debug.internal;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.debug.internal.DebugProbesImpl;
import org.jetbrains.annotations.NotNull;

@Metadata(m29143d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\n\u0010\u0001\u001a\u0006\u0012\u0002\b\u00030\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m29142d2 = {"Lkotlinx/coroutines/debug/internal/DebugProbesImpl$a;", "it", "", "invoke", "(Lkotlinx/coroutines/debug/internal/DebugProbesImpl$a;)Ljava/lang/Boolean;", "<anonymous>"}, m29141k = 3, m29140mv = {1, 8, 0})
/* loaded from: classes6.dex */
public final class DebugProbesImpl$dumpCoroutinesSynchronized$2 extends Lambda implements Function1<DebugProbesImpl.C12029a, Boolean> {
    public static final DebugProbesImpl$dumpCoroutinesSynchronized$2 INSTANCE = new DebugProbesImpl$dumpCoroutinesSynchronized$2();

    public DebugProbesImpl$dumpCoroutinesSynchronized$2() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    @NotNull
    public final Boolean invoke(@NotNull DebugProbesImpl.C12029a c12029a) {
        boolean m27384j;
        m27384j = DebugProbesImpl.INSTANCE.m27384j(c12029a);
        return Boolean.valueOf(!m27384j);
    }
}