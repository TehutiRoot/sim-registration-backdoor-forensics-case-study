package androidx.compose.runtime;

import ch.qos.logback.core.net.SyslogConstants;
import kotlin.Metadata;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@Metadata(m29141k = 3, m29140mv = {1, 8, 0}, m29138xi = SyslogConstants.LOG_LOCAL6)
@SourceDebugExtension({"SMAP\nEffects.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Effects.kt\nandroidx/compose/runtime/EffectsKt$rememberCoroutineScope$1\n*L\n1#1,496:1\n*E\n"})
/* loaded from: classes2.dex */
public final class EffectsKt$rememberCoroutineScope$1 extends Lambda implements Function0<EmptyCoroutineContext> {
    public static final EffectsKt$rememberCoroutineScope$1 INSTANCE = new EffectsKt$rememberCoroutineScope$1();

    public EffectsKt$rememberCoroutineScope$1() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    @NotNull
    public final EmptyCoroutineContext invoke() {
        return EmptyCoroutineContext.INSTANCE;
    }
}