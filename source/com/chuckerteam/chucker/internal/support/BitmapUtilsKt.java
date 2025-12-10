package com.chuckerteam.chucker.internal.support;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.graphics.ColorUtils;
import androidx.palette.graphics.Palette;
import com.chuckerteam.chucker.internal.support.BitmapUtilsKt;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m28851d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0019\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u0080@ø\u0001\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u001d\u0010\u0006\u001a\u00020\u0000*\u00020\u00002\b\b\u0001\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u001f\u0010\t\u001a\u0004\u0018\u00010\u0001*\u00020\u00002\b\b\u0001\u0010\b\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\t\u0010\n\"\u0014\u0010\u000e\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000f"}, m28850d2 = {"Landroid/graphics/Bitmap;", "", "calculateLuminance", "(Landroid/graphics/Bitmap;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", TypedValues.Custom.S_COLOR, "d", "(Landroid/graphics/Bitmap;I)Landroid/graphics/Bitmap;", "alphaSubstitute", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "(Landroid/graphics/Bitmap;I)Ljava/lang/Double;", "Landroid/graphics/Paint;", PDPageLabelRange.STYLE_LETTERS_LOWER, "Landroid/graphics/Paint;", "BITMAP_PAINT", "com.github.ChuckerTeam.Chucker.library"}, m28849k = 2, m28848mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nBitmapUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BitmapUtils.kt\ncom/chuckerteam/chucker/internal/support/BitmapUtilsKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,41:1\n1#2:42\n*E\n"})
/* loaded from: classes3.dex */
public final class BitmapUtilsKt {

    /* renamed from: a */
    public static final Paint f42928a = new Paint(2);

    /* renamed from: a */
    public static /* synthetic */ boolean m49936a(int i, int i2, float[] fArr) {
        return m49934c(i, i2, fArr);
    }

    /* renamed from: b */
    public static final Double m49935b(Bitmap bitmap, final int i) {
        Palette generate = Palette.from(bitmap).clearFilters().addFilter(new Palette.Filter() { // from class: Ib
            @Override // androidx.palette.graphics.Palette.Filter
            public final boolean isAllowed(int i2, float[] fArr) {
                return BitmapUtilsKt.m49936a(i, i2, fArr);
            }
        }).generate();
        Intrinsics.checkNotNullExpressionValue(generate, "from(this)\n        .clea…te) }\n        .generate()");
        Palette.Swatch dominantSwatch = generate.getDominantSwatch();
        if (dominantSwatch != null) {
            return Double.valueOf(ColorUtils.calculateLuminance(dominantSwatch.getRgb()));
        }
        return null;
    }

    /* renamed from: c */
    public static final boolean m49934c(int i, int i2, float[] fArr) {
        Intrinsics.checkNotNullParameter(fArr, "<anonymous parameter 1>");
        return i2 != i;
    }

    @Nullable
    public static final Object calculateLuminance(@NotNull Bitmap bitmap, @NotNull Continuation<? super Double> continuation) {
        return BuildersKt.withContext(Dispatchers.getDefault(), new BitmapUtilsKt$calculateLuminance$2(bitmap, -65281, null), continuation);
    }

    /* renamed from: d */
    public static final Bitmap m49933d(Bitmap bitmap, int i) {
        Bitmap result = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
        result.eraseColor(i);
        new Canvas(result).drawBitmap(bitmap, new Matrix(), f42928a);
        Intrinsics.checkNotNullExpressionValue(result, "result");
        return result;
    }
}
