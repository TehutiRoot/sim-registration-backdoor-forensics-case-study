package io.fotoapparat.view;

import android.graphics.SurfaceTexture;
import android.view.SurfaceHolder;
import io.fotoapparat.view.Preview;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(m28851d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000\u001a\f\u0010\u0000\u001a\u00020\u0003*\u00020\u0004H\u0000¨\u0006\u0005"}, m28850d2 = {"toPreview", "Lio/fotoapparat/view/Preview$Texture;", "Landroid/graphics/SurfaceTexture;", "Lio/fotoapparat/view/Preview$Surface;", "Landroid/view/SurfaceHolder;", "fotoapparat_release"}, m28849k = 2, m28848mv = {1, 8, 0}, m28846xi = 48)
/* loaded from: classes5.dex */
public final class PreviewKt {
    @NotNull
    public static final Preview.Texture toPreview(@NotNull SurfaceTexture surfaceTexture) {
        Intrinsics.checkNotNullParameter(surfaceTexture, "<this>");
        return new Preview.Texture(surfaceTexture);
    }

    @NotNull
    public static final Preview.Surface toPreview(@NotNull SurfaceHolder surfaceHolder) {
        Intrinsics.checkNotNullParameter(surfaceHolder, "<this>");
        return new Preview.Surface(surfaceHolder);
    }
}
