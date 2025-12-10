package io.fotoapparat.parameter.camera.provide;

import io.fotoapparat.parameter.Resolution;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

@Metadata(m28851d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m28850d2 = {"<anonymous>", "", "it", "Lio/fotoapparat/parameter/Resolution;", "invoke", "(Lio/fotoapparat/parameter/Resolution;)Ljava/lang/Boolean;"}, m28849k = 3, m28848mv = {1, 8, 0}, m28846xi = 48)
/* loaded from: classes5.dex */
public final class CameraParametersProviderKt$validPreviewSizeSelector$1 extends Lambda implements Function1<Resolution, Boolean> {
    final /* synthetic */ Resolution $resolution;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CameraParametersProviderKt$validPreviewSizeSelector$1(Resolution resolution) {
        super(1);
        this.$resolution = resolution;
    }

    @Override // kotlin.jvm.functions.Function1
    @NotNull
    public final Boolean invoke(@NotNull Resolution it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Boolean.valueOf(it.getArea() <= this.$resolution.getArea());
    }
}
