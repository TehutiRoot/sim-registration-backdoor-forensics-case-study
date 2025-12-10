package androidx.compose.p003ui.graphics;

import android.graphics.Bitmap;
import android.os.Build;
import androidx.compose.p003ui.graphics.colorspace.ColorSpace;
import androidx.compose.p003ui.graphics.colorspace.ColorSpaces;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(m28851d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005JG\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0014\u0010\u000b\u001a\u00020\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u0014\u0010\f\u001a\u00020\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u0019R\u001d\u0010\u001d\u001a\u00020\u001b8VX\u0096\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u0019R\u0014\u0010!\u001a\u00020\u001e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010 R\u0014\u0010%\u001a\u00020\"8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b#\u0010$\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006&"}, m28850d2 = {"Landroidx/compose/ui/graphics/AndroidImageBitmap;", "Landroidx/compose/ui/graphics/ImageBitmap;", "Landroid/graphics/Bitmap;", "bitmap", "<init>", "(Landroid/graphics/Bitmap;)V", "", "buffer", "", "startX", "startY", "width", "height", "bufferOffset", "stride", "", "readPixels", "([IIIIIII)V", "prepareToDraw", "()V", PDPageLabelRange.STYLE_LETTERS_LOWER, "Landroid/graphics/Bitmap;", "getBitmap$ui_graphics_release", "()Landroid/graphics/Bitmap;", "getWidth", "()I", "getHeight", "Landroidx/compose/ui/graphics/ImageBitmapConfig;", "getConfig-_sVssgQ", "config", "Landroidx/compose/ui/graphics/colorspace/ColorSpace;", "getColorSpace", "()Landroidx/compose/ui/graphics/colorspace/ColorSpace;", "colorSpace", "", "getHasAlpha", "()Z", "hasAlpha", "ui-graphics_release"}, m28849k = 1, m28848mv = {1, 8, 0})
/* renamed from: androidx.compose.ui.graphics.AndroidImageBitmap */
/* loaded from: classes2.dex */
public final class AndroidImageBitmap implements ImageBitmap {

    /* renamed from: a */
    public final Bitmap f28973a;

    public AndroidImageBitmap(@NotNull Bitmap bitmap) {
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        this.f28973a = bitmap;
    }

    @NotNull
    public final Bitmap getBitmap$ui_graphics_release() {
        return this.f28973a;
    }

    @Override // androidx.compose.p003ui.graphics.ImageBitmap
    @NotNull
    public ColorSpace getColorSpace() {
        if (Build.VERSION.SDK_INT >= 26) {
            Api26Bitmap api26Bitmap = Api26Bitmap.INSTANCE;
            return Api26Bitmap.composeColorSpace$ui_graphics_release(this.f28973a);
        }
        return ColorSpaces.INSTANCE.getSrgb();
    }

    @Override // androidx.compose.p003ui.graphics.ImageBitmap
    /* renamed from: getConfig-_sVssgQ  reason: not valid java name */
    public int mo71611getConfig_sVssgQ() {
        Bitmap.Config config = this.f28973a.getConfig();
        Intrinsics.checkNotNullExpressionValue(config, "bitmap.config");
        return AndroidImageBitmap_androidKt.toImageConfig(config);
    }

    @Override // androidx.compose.p003ui.graphics.ImageBitmap
    public boolean getHasAlpha() {
        return this.f28973a.hasAlpha();
    }

    @Override // androidx.compose.p003ui.graphics.ImageBitmap
    public int getHeight() {
        return this.f28973a.getHeight();
    }

    @Override // androidx.compose.p003ui.graphics.ImageBitmap
    public int getWidth() {
        return this.f28973a.getWidth();
    }

    @Override // androidx.compose.p003ui.graphics.ImageBitmap
    public void prepareToDraw() {
        this.f28973a.prepareToDraw();
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:13:? A[RETURN, SYNTHETIC] */
    @Override // androidx.compose.p003ui.graphics.ImageBitmap
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void readPixels(@org.jetbrains.annotations.NotNull int[] r11, int r12, int r13, int r14, int r15, int r16, int r17) {
        /*
            r10 = this;
            java.lang.String r0 = "buffer"
            r2 = r11
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r0)
            android.graphics.Bitmap r0 = androidx.compose.p003ui.graphics.AndroidImageBitmap_androidKt.asAndroidBitmap(r10)
            int r1 = android.os.Build.VERSION.SDK_INT
            r3 = 26
            r4 = 0
            if (r1 < r3) goto L25
            android.graphics.Bitmap$Config r1 = r0.getConfig()
            android.graphics.Bitmap$Config r3 = p000.AbstractC5345b4.m52053a()
            if (r1 == r3) goto L1c
            goto L25
        L1c:
            android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.ARGB_8888
            android.graphics.Bitmap r0 = r0.copy(r1, r4)
            r4 = 1
            r9 = 1
            goto L26
        L25:
            r9 = 0
        L26:
            r1 = r0
            r2 = r11
            r3 = r16
            r4 = r17
            r5 = r12
            r6 = r13
            r7 = r14
            r8 = r15
            r1.getPixels(r2, r3, r4, r5, r6, r7, r8)
            if (r9 == 0) goto L38
            r0.recycle()
        L38:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p003ui.graphics.AndroidImageBitmap.readPixels(int[], int, int, int, int, int, int):void");
    }
}
