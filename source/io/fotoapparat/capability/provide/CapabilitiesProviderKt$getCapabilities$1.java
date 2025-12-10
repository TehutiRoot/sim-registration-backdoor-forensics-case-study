package io.fotoapparat.capability.provide;

import io.fotoapparat.parameter.Flash;
import io.fotoapparat.parameter.camera.convert.FlashConverterKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m28851d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m28850d2 = {"<anonymous>", "Lio/fotoapparat/parameter/Flash;", "it", "", "invoke"}, m28849k = 3, m28848mv = {1, 8, 0}, m28846xi = 48)
/* loaded from: classes5.dex */
public final class CapabilitiesProviderKt$getCapabilities$1 extends Lambda implements Function1<String, Flash> {
    public static final CapabilitiesProviderKt$getCapabilities$1 INSTANCE = new CapabilitiesProviderKt$getCapabilities$1();

    public CapabilitiesProviderKt$getCapabilities$1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    @Nullable
    public final Flash invoke(@NotNull String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return FlashConverterKt.toFlash(it);
    }
}
