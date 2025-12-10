package kotlinx.coroutines.debug;

import android.annotation.SuppressLint;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.lang.instrument.ClassFileTransformer;
import java.lang.instrument.Instrumentation;
import java.security.ProtectionDomain;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.p023io.ByteStreamsKt;
import kotlinx.coroutines.debug.internal.AgentInstallationType;
import kotlinx.coroutines.debug.internal.DebugProbesImpl;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import sun.misc.Signal;
import sun.misc.SignalHandler;

@Metadata(m29143d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\bÁ\u0002\u0018\u00002\u00020\u0001:\u0001\u000fB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\t\u001a\u00020\b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\u0003R\u0014\u0010\u000e\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\r¨\u0006\u0010"}, m29142d2 = {"Lkotlinx/coroutines/debug/AgentPremain;", "", "<init>", "()V", "", "args", "Ljava/lang/instrument/Instrumentation;", "instrumentation", "", "premain", "(Ljava/lang/String;Ljava/lang/instrument/Instrumentation;)V", PDPageLabelRange.STYLE_LETTERS_LOWER, "", "Z", "enableCreationStackTraces", "DebugProbesTransformer", "kotlinx-coroutines-core"}, m29141k = 1, m29140mv = {1, 8, 0})
@SuppressLint({"all"})
@IgnoreJRERequirement
/* loaded from: classes6.dex */
public final class AgentPremain {
    @NotNull
    public static final AgentPremain INSTANCE = new AgentPremain();

    /* renamed from: a */
    public static final boolean f70738a;

    @Metadata(m29143d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J<\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\b2\f\u0010\t\u001a\b\u0012\u0002\b\u0003\u0018\u00010\n2\u0006\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0004H\u0016¨\u0006\u000e"}, m29142d2 = {"Lkotlinx/coroutines/debug/AgentPremain$DebugProbesTransformer;", "Ljava/lang/instrument/ClassFileTransformer;", "()V", "transform", "", "loader", "Ljava/lang/ClassLoader;", "className", "", "classBeingRedefined", "Ljava/lang/Class;", "protectionDomain", "Ljava/security/ProtectionDomain;", "classfileBuffer", "kotlinx-coroutines-core"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
    /* loaded from: classes6.dex */
    public static final class DebugProbesTransformer implements ClassFileTransformer {
        @NotNull
        public static final DebugProbesTransformer INSTANCE = new DebugProbesTransformer();

        @Nullable
        public byte[] transform(@Nullable ClassLoader classLoader, @NotNull String str, @Nullable Class<?> cls, @NotNull ProtectionDomain protectionDomain, @Nullable byte[] bArr) {
            if (classLoader != null && Intrinsics.areEqual(str, "kotlin/coroutines/jvm/internal/DebugProbesKt")) {
                AgentInstallationType.INSTANCE.setInstalledStatically$kotlinx_coroutines_core(true);
                return ByteStreamsKt.readBytes(classLoader.getResourceAsStream("DebugProbesKt.bin"));
            }
            return null;
        }
    }

    static {
        Object m74271constructorimpl;
        boolean enableCreationStackTraces;
        Boolean bool;
        Boolean bool2 = null;
        try {
            Result.Companion companion = Result.Companion;
            String property = System.getProperty("kotlinx.coroutines.debug.enable.creation.stack.trace");
            if (property != null) {
                bool = Boolean.valueOf(Boolean.parseBoolean(property));
            } else {
                bool = null;
            }
            m74271constructorimpl = Result.m74271constructorimpl(bool);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.Companion;
            m74271constructorimpl = Result.m74271constructorimpl(ResultKt.createFailure(th2));
        }
        if (!Result.m74277isFailureimpl(m74271constructorimpl)) {
            bool2 = m74271constructorimpl;
        }
        Boolean bool3 = bool2;
        if (bool3 != null) {
            enableCreationStackTraces = bool3.booleanValue();
        } else {
            enableCreationStackTraces = DebugProbesImpl.INSTANCE.getEnableCreationStackTraces();
        }
        f70738a = enableCreationStackTraces;
    }

    @JvmStatic
    public static final void premain(@Nullable String str, @NotNull Instrumentation instrumentation) {
        AgentInstallationType.INSTANCE.setInstalledStatically$kotlinx_coroutines_core(true);
        instrumentation.addTransformer(DebugProbesTransformer.INSTANCE);
        DebugProbesImpl debugProbesImpl = DebugProbesImpl.INSTANCE;
        debugProbesImpl.setEnableCreationStackTraces(f70738a);
        debugProbesImpl.install();
        INSTANCE.m27414a();
    }

    /* renamed from: a */
    public final void m27414a() {
        try {
            Signal.handle(new Signal("TRAP"), new SignalHandler() { // from class: z2
            });
        } catch (Throwable unused) {
        }
    }
}