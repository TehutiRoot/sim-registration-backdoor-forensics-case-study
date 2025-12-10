package io.fotoapparat.result.transformer;

import io.fotoapparat.parameter.Resolution;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

@Metadata(m28851d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, m28850d2 = {"<anonymous>", "Lio/fotoapparat/parameter/Resolution;", "it", "invoke"}, m28849k = 3, m28848mv = {1, 8, 0}, m28846xi = 48)
/* loaded from: classes5.dex */
public final class ResolutionTransformersKt$originalResolution$1 extends Lambda implements Function1<Resolution, Resolution> {
    public static final ResolutionTransformersKt$originalResolution$1 INSTANCE = new ResolutionTransformersKt$originalResolution$1();

    public ResolutionTransformersKt$originalResolution$1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    @NotNull
    public final Resolution invoke(@NotNull Resolution it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it;
    }
}
