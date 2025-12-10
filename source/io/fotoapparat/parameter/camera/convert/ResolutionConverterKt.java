package io.fotoapparat.parameter.camera.convert;

import android.hardware.Camera;
import io.fotoapparat.parameter.Resolution;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(m28851d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u000e\u0010\u0000\u001a\u00020\u0001*\u00060\u0002R\u00020\u0003¨\u0006\u0004"}, m28850d2 = {"toResolution", "Lio/fotoapparat/parameter/Resolution;", "Landroid/hardware/Camera$Size;", "Landroid/hardware/Camera;", "fotoapparat_release"}, m28849k = 2, m28848mv = {1, 8, 0}, m28846xi = 48)
/* loaded from: classes5.dex */
public final class ResolutionConverterKt {
    @NotNull
    public static final Resolution toResolution(@NotNull Camera.Size size) {
        Intrinsics.checkNotNullParameter(size, "<this>");
        return new Resolution(size.width, size.height);
    }
}
