package androidx.compose.p003ui.graphics;

import android.graphics.Canvas;
import com.chuckerteam.chucker.internal.support.ResponseProcessor;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@Metadata(m28851d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0015\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b\"\u0014\u0010\u000b\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n\"\u0019\u0010\u000f\u001a\u00060\u0005j\u0002`\f*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e*\n\u0010\u0010\"\u00020\u00052\u00020\u0005¨\u0006\u0011"}, m28850d2 = {"Landroidx/compose/ui/graphics/ImageBitmap;", ResponseProcessor.CONTENT_TYPE_IMAGE, "Landroidx/compose/ui/graphics/Canvas;", "ActualCanvas", "(Landroidx/compose/ui/graphics/ImageBitmap;)Landroidx/compose/ui/graphics/Canvas;", "Landroid/graphics/Canvas;", OperatorName.CURVE_TO, "Canvas", "(Landroid/graphics/Canvas;)Landroidx/compose/ui/graphics/Canvas;", PDPageLabelRange.STYLE_LETTERS_LOWER, "Landroid/graphics/Canvas;", "EmptyCanvas", "Landroidx/compose/ui/graphics/NativeCanvas;", "getNativeCanvas", "(Landroidx/compose/ui/graphics/Canvas;)Landroid/graphics/Canvas;", "nativeCanvas", "NativeCanvas", "ui-graphics_release"}, m28849k = 2, m28848mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nAndroidCanvas.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidCanvas.android.kt\nandroidx/compose/ui/graphics/AndroidCanvas_androidKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,431:1\n1#2:432\n*E\n"})
/* renamed from: androidx.compose.ui.graphics.AndroidCanvas_androidKt */
/* loaded from: classes2.dex */
public final class AndroidCanvas_androidKt {

    /* renamed from: a */
    public static final Canvas f28972a = new Canvas();

    @NotNull
    public static final Canvas ActualCanvas(@NotNull ImageBitmap image) {
        Intrinsics.checkNotNullParameter(image, "image");
        AndroidCanvas androidCanvas = new AndroidCanvas();
        androidCanvas.setInternalCanvas(new Canvas(AndroidImageBitmap_androidKt.asAndroidBitmap(image)));
        return androidCanvas;
    }

    @NotNull
    public static final Canvas Canvas(@NotNull Canvas c) {
        Intrinsics.checkNotNullParameter(c, "c");
        AndroidCanvas androidCanvas = new AndroidCanvas();
        androidCanvas.setInternalCanvas(c);
        return androidCanvas;
    }

    @NotNull
    public static final Canvas getNativeCanvas(@NotNull Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "<this>");
        return ((AndroidCanvas) canvas).getInternalCanvas();
    }
}
