package androidx.compose.p003ui.graphics;

import android.graphics.ColorSpace;
import androidx.annotation.RequiresApi;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(m29143d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0007\u001a\f\u0010\u0003\u001a\u00020\u0002*\u00020\u0001H\u0007¨\u0006\u0004"}, m29142d2 = {"toAndroidColorSpace", "Landroid/graphics/ColorSpace;", "Landroidx/compose/ui/graphics/colorspace/ColorSpace;", "toComposeColorSpace", "ui-graphics_release"}, m29141k = 2, m29140mv = {1, 8, 0}, m29138xi = 48)
/* renamed from: androidx.compose.ui.graphics.AndroidColorSpace_androidKt */
/* loaded from: classes2.dex */
public final class AndroidColorSpace_androidKt {
    @RequiresApi(26)
    @NotNull
    public static final ColorSpace toAndroidColorSpace(@NotNull androidx.compose.p003ui.graphics.colorspace.ColorSpace colorSpace) {
        Intrinsics.checkNotNullParameter(colorSpace, "<this>");
        return C0965Nt.m67179e(colorSpace);
    }

    @RequiresApi(26)
    @NotNull
    public static final androidx.compose.p003ui.graphics.colorspace.ColorSpace toComposeColorSpace(@NotNull ColorSpace colorSpace) {
        Intrinsics.checkNotNullParameter(colorSpace, "<this>");
        return C0965Nt.m67176h(colorSpace);
    }
}