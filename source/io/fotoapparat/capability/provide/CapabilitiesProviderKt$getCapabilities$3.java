package io.fotoapparat.capability.provide;

import io.fotoapparat.parameter.AntiBandingMode;
import io.fotoapparat.parameter.camera.convert.AntiBandingConverterKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m28849k = 3, m28848mv = {1, 8, 0}, m28846xi = 48)
/* loaded from: classes5.dex */
public /* synthetic */ class CapabilitiesProviderKt$getCapabilities$3 extends FunctionReferenceImpl implements Function1<String, AntiBandingMode> {
    public static final CapabilitiesProviderKt$getCapabilities$3 INSTANCE = new CapabilitiesProviderKt$getCapabilities$3();

    public CapabilitiesProviderKt$getCapabilities$3() {
        super(1, AntiBandingConverterKt.class, "toAntiBandingMode", "toAntiBandingMode(Ljava/lang/String;)Lio/fotoapparat/parameter/AntiBandingMode;", 1);
    }

    @Override // kotlin.jvm.functions.Function1
    @Nullable
    public final AntiBandingMode invoke(@NotNull String p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return AntiBandingConverterKt.toAntiBandingMode(p0);
    }
}
