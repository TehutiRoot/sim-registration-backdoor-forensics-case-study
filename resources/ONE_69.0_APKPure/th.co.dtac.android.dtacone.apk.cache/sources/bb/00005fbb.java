package androidx.compose.p003ui.graphics;

import android.graphics.BitmapShader;
import android.graphics.LinearGradient;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.graphics.SweepGradient;
import android.os.Build;
import androidx.annotation.VisibleForTesting;
import androidx.compose.p003ui.geometry.Offset;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.chuckerteam.chucker.internal.support.ResponseProcessor;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m29143d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0002\b\u0003\n\u0002\u0010\u0014\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u001aO\u0010\u000e\u001a\u00060\nj\u0002`\u000b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00032\u0006\u0010\t\u001a\u00020\bH\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\f\u0010\r\u001aO\u0010\u0013\u001a\u00060\nj\u0002`\u000b2\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u00062\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00032\u0006\u0010\t\u001a\u00020\bH\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0011\u0010\u0012\u001a?\u0010\u0016\u001a\u00060\nj\u0002`\u000b2\u0006\u0010\u000f\u001a\u00020\u00002\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003H\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0014\u0010\u0015\u001a1\u0010\u001d\u001a\u00060\nj\u0002`\u000b2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\b2\u0006\u0010\u001a\u001a\u00020\bH\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001b\u0010\u001c\u001a \u0010\u001f\u001a\u00020\u001e2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0001ø\u0001\u0001¢\u0006\u0004\b\u001f\u0010 \u001a(\u0010#\u001a\u00020\"2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010!\u001a\u00020\u001eH\u0001ø\u0001\u0001¢\u0006\u0004\b#\u0010$\u001a:\u0010'\u001a\u0004\u0018\u00010&2\u000e\u0010%\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00032\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010!\u001a\u00020\u001eH\u0001ø\u0001\u0001¢\u0006\u0004\b'\u0010(\u001a0\u0010*\u001a\u00020)2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003H\u0002ø\u0001\u0001¢\u0006\u0004\b*\u0010+*\n\u0010,\"\u00020\n2\u00020\n\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006-"}, m29142d2 = {"Landroidx/compose/ui/geometry/Offset;", "from", TypedValues.TransitionType.S_TO, "", "Landroidx/compose/ui/graphics/Color;", "colors", "", "colorStops", "Landroidx/compose/ui/graphics/TileMode;", "tileMode", "Landroid/graphics/Shader;", "Landroidx/compose/ui/graphics/Shader;", "ActualLinearGradientShader-VjE6UOU", "(JJLjava/util/List;Ljava/util/List;I)Landroid/graphics/Shader;", "ActualLinearGradientShader", "center", "radius", "ActualRadialGradientShader-8uybcMk", "(JFLjava/util/List;Ljava/util/List;I)Landroid/graphics/Shader;", "ActualRadialGradientShader", "ActualSweepGradientShader-9KIMszo", "(JLjava/util/List;Ljava/util/List;)Landroid/graphics/Shader;", "ActualSweepGradientShader", "Landroidx/compose/ui/graphics/ImageBitmap;", ResponseProcessor.CONTENT_TYPE_IMAGE, "tileModeX", "tileModeY", "ActualImageShader-F49vj9s", "(Landroidx/compose/ui/graphics/ImageBitmap;II)Landroid/graphics/Shader;", "ActualImageShader", "", "countTransparentColors", "(Ljava/util/List;)I", "numTransparentColors", "", "makeTransparentColors", "(Ljava/util/List;I)[I", "stops", "", "makeTransparentStops", "(Ljava/util/List;Ljava/util/List;I)[F", "", PDPageLabelRange.STYLE_LETTERS_LOWER, "(Ljava/util/List;Ljava/util/List;)V", "Shader", "ui-graphics_release"}, m29141k = 2, m29140mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nAndroidShader.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidShader.android.kt\nandroidx/compose/ui/graphics/AndroidShader_androidKt\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,205:1\n69#2,6:206\n*S KotlinDebug\n*F\n+ 1 AndroidShader.android.kt\nandroidx/compose/ui/graphics/AndroidShader_androidKt\n*L\n141#1:206,6\n*E\n"})
/* renamed from: androidx.compose.ui.graphics.AndroidShader_androidKt */
/* loaded from: classes2.dex */
public final class AndroidShader_androidKt {
    @NotNull
    /* renamed from: ActualImageShader-F49vj9s  reason: not valid java name */
    public static final Shader m71828ActualImageShaderF49vj9s(@NotNull ImageBitmap image, int i, int i2) {
        Intrinsics.checkNotNullParameter(image, "image");
        return new BitmapShader(AndroidImageBitmap_androidKt.asAndroidBitmap(image), AndroidTileMode_androidKt.m71833toAndroidTileMode0vamqd0(i), AndroidTileMode_androidKt.m71833toAndroidTileMode0vamqd0(i2));
    }

    @NotNull
    /* renamed from: ActualLinearGradientShader-VjE6UOU  reason: not valid java name */
    public static final Shader m71829ActualLinearGradientShaderVjE6UOU(long j, long j2, @NotNull List<Color> colors, @Nullable List<Float> list, int i) {
        Intrinsics.checkNotNullParameter(colors, "colors");
        m59709a(colors, list);
        int countTransparentColors = countTransparentColors(colors);
        return new LinearGradient(Offset.m71686getXimpl(j), Offset.m71687getYimpl(j), Offset.m71686getXimpl(j2), Offset.m71687getYimpl(j2), makeTransparentColors(colors, countTransparentColors), makeTransparentStops(list, colors, countTransparentColors), AndroidTileMode_androidKt.m71833toAndroidTileMode0vamqd0(i));
    }

    @NotNull
    /* renamed from: ActualRadialGradientShader-8uybcMk  reason: not valid java name */
    public static final Shader m71830ActualRadialGradientShader8uybcMk(long j, float f, @NotNull List<Color> colors, @Nullable List<Float> list, int i) {
        Intrinsics.checkNotNullParameter(colors, "colors");
        m59709a(colors, list);
        int countTransparentColors = countTransparentColors(colors);
        return new RadialGradient(Offset.m71686getXimpl(j), Offset.m71687getYimpl(j), f, makeTransparentColors(colors, countTransparentColors), makeTransparentStops(list, colors, countTransparentColors), AndroidTileMode_androidKt.m71833toAndroidTileMode0vamqd0(i));
    }

    @NotNull
    /* renamed from: ActualSweepGradientShader-9KIMszo  reason: not valid java name */
    public static final Shader m71831ActualSweepGradientShader9KIMszo(long j, @NotNull List<Color> colors, @Nullable List<Float> list) {
        Intrinsics.checkNotNullParameter(colors, "colors");
        m59709a(colors, list);
        int countTransparentColors = countTransparentColors(colors);
        return new SweepGradient(Offset.m71686getXimpl(j), Offset.m71687getYimpl(j), makeTransparentColors(colors, countTransparentColors), makeTransparentStops(list, colors, countTransparentColors));
    }

    /* renamed from: a */
    public static final void m59709a(List list, List list2) {
        if (list2 == null) {
            if (list.size() < 2) {
                throw new IllegalArgumentException("colors must have length of at least 2 if colorStops is omitted.");
            }
        } else if (list.size() == list2.size()) {
        } else {
            throw new IllegalArgumentException("colors and colorStops arguments must have equal length.");
        }
    }

    @VisibleForTesting
    public static final int countTransparentColors(@NotNull List<Color> colors) {
        Intrinsics.checkNotNullParameter(colors, "colors");
        int i = 0;
        if (Build.VERSION.SDK_INT >= 26) {
            return 0;
        }
        int lastIndex = CollectionsKt__CollectionsKt.getLastIndex(colors);
        for (int i2 = 1; i2 < lastIndex; i2++) {
            if (Color.m71921getAlphaimpl(colors.get(i2).m71929unboximpl()) == 0.0f) {
                i++;
            }
        }
        return i;
    }

    @VisibleForTesting
    @NotNull
    public static final int[] makeTransparentColors(@NotNull List<Color> colors, int i) {
        int i2;
        Intrinsics.checkNotNullParameter(colors, "colors");
        int i3 = 0;
        if (Build.VERSION.SDK_INT >= 26) {
            int size = colors.size();
            int[] iArr = new int[size];
            while (i3 < size) {
                iArr[i3] = ColorKt.m71972toArgb8_81llA(colors.get(i3).m71929unboximpl());
                i3++;
            }
            return iArr;
        }
        int[] iArr2 = new int[colors.size() + i];
        int lastIndex = CollectionsKt__CollectionsKt.getLastIndex(colors);
        int size2 = colors.size();
        int i4 = 0;
        while (i3 < size2) {
            long m71929unboximpl = colors.get(i3).m71929unboximpl();
            if (Color.m71921getAlphaimpl(m71929unboximpl) == 0.0f) {
                if (i3 == 0) {
                    i2 = i4 + 1;
                    iArr2[i4] = ColorKt.m71972toArgb8_81llA(Color.m71918copywmQWz5c$default(colors.get(1).m71929unboximpl(), 0.0f, 0.0f, 0.0f, 0.0f, 14, null));
                } else if (i3 == lastIndex) {
                    i2 = i4 + 1;
                    iArr2[i4] = ColorKt.m71972toArgb8_81llA(Color.m71918copywmQWz5c$default(colors.get(i3 - 1).m71929unboximpl(), 0.0f, 0.0f, 0.0f, 0.0f, 14, null));
                } else {
                    int i5 = i4 + 1;
                    iArr2[i4] = ColorKt.m71972toArgb8_81llA(Color.m71918copywmQWz5c$default(colors.get(i3 - 1).m71929unboximpl(), 0.0f, 0.0f, 0.0f, 0.0f, 14, null));
                    i4 += 2;
                    iArr2[i5] = ColorKt.m71972toArgb8_81llA(Color.m71918copywmQWz5c$default(colors.get(i3 + 1).m71929unboximpl(), 0.0f, 0.0f, 0.0f, 0.0f, 14, null));
                }
                i4 = i2;
            } else {
                iArr2[i4] = ColorKt.m71972toArgb8_81llA(m71929unboximpl);
                i4++;
            }
            i3++;
        }
        return iArr2;
    }

    @VisibleForTesting
    @Nullable
    public static final float[] makeTransparentStops(@Nullable List<Float> list, @NotNull List<Color> colors, int i) {
        float f;
        float f2;
        float lastIndex;
        Intrinsics.checkNotNullParameter(colors, "colors");
        if (i == 0) {
            if (list != null) {
                return CollectionsKt___CollectionsKt.toFloatArray(list);
            }
            return null;
        }
        float[] fArr = new float[colors.size() + i];
        if (list != null) {
            f = list.get(0).floatValue();
        } else {
            f = 0.0f;
        }
        fArr[0] = f;
        int lastIndex2 = CollectionsKt__CollectionsKt.getLastIndex(colors);
        int i2 = 1;
        for (int i3 = 1; i3 < lastIndex2; i3++) {
            long m71929unboximpl = colors.get(i3).m71929unboximpl();
            if (list != null) {
                lastIndex = list.get(i3).floatValue();
            } else {
                lastIndex = i3 / CollectionsKt__CollectionsKt.getLastIndex(colors);
            }
            int i4 = i2 + 1;
            fArr[i2] = lastIndex;
            if (Color.m71921getAlphaimpl(m71929unboximpl) == 0.0f) {
                i2 += 2;
                fArr[i4] = lastIndex;
            } else {
                i2 = i4;
            }
        }
        if (list != null) {
            f2 = list.get(CollectionsKt__CollectionsKt.getLastIndex(colors)).floatValue();
        } else {
            f2 = 1.0f;
        }
        fArr[i2] = f2;
        return fArr;
    }
}