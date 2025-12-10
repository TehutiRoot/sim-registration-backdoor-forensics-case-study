package coil.transform;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.RectF;
import android.graphics.Shader;
import androidx.annotation.InterfaceC2037Px;
import coil.decode.DecodeUtils;
import coil.size.Dimension;
import coil.size.Scale;
import coil.size.Size;
import coil.size.Sizes;
import coil.util.Bitmaps;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m29143d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u00002\u00020\u0001B/\u0012\b\b\u0003\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bB\u0013\b\u0016\u0012\b\b\u0001\u0010\t\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\nJ#\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0096@ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0096\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J+\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00160\u00192\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001cR\u0014\u0010\u0004\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001cR\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001cR\u0014\u0010\u0006\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u001cR\u001a\u0010%\u001a\u00020 8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006&"}, m29142d2 = {"Lcoil/transform/RoundedCornersTransformation;", "Lcoil/transform/Transformation;", "", "topLeft", "topRight", "bottomLeft", "bottomRight", "<init>", "(FFFF)V", "radius", "(F)V", "Landroid/graphics/Bitmap;", "input", "Lcoil/size/Size;", "size", "transform", "(Landroid/graphics/Bitmap;Lcoil/size/Size;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Lkotlin/Pair;", PDPageLabelRange.STYLE_LETTERS_LOWER, "(Landroid/graphics/Bitmap;Lcoil/size/Size;)Lkotlin/Pair;", "F", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, OperatorName.CURVE_TO, "d", "", "e", "Ljava/lang/String;", "getCacheKey", "()Ljava/lang/String;", "cacheKey", "coil-base_release"}, m29141k = 1, m29140mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nRoundedCornersTransformation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RoundedCornersTransformation.kt\ncoil/transform/RoundedCornersTransformation\n+ 2 Bitmap.kt\nandroidx/core/graphics/BitmapKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 Dimension.kt\ncoil/size/-Dimensions\n*L\n1#1,132:1\n95#2:133\n43#2,2:134\n45#2:137\n1#3:136\n57#4:138\n57#4:139\n*S KotlinDebug\n*F\n+ 1 RoundedCornersTransformation.kt\ncoil/transform/RoundedCornersTransformation\n*L\n58#1:133\n59#1:134,2\n59#1:137\n106#1:138\n107#1:139\n*E\n"})
/* loaded from: classes3.dex */
public final class RoundedCornersTransformation implements Transformation {

    /* renamed from: a */
    public final float f40853a;

    /* renamed from: b */
    public final float f40854b;

    /* renamed from: c */
    public final float f40855c;

    /* renamed from: d */
    public final float f40856d;

    /* renamed from: e */
    public final String f40857e;

    public RoundedCornersTransformation() {
        this(0.0f, 0.0f, 0.0f, 0.0f, 15, null);
    }

    /* renamed from: a */
    public final Pair m51017a(Bitmap bitmap, Size size) {
        int i;
        if (Sizes.isOriginal(size)) {
            return TuplesKt.m29136to(Integer.valueOf(bitmap.getWidth()), Integer.valueOf(bitmap.getHeight()));
        }
        Dimension component1 = size.component1();
        Dimension component2 = size.component2();
        if ((component1 instanceof Dimension.Pixels) && (component2 instanceof Dimension.Pixels)) {
            return TuplesKt.m29136to(Integer.valueOf(((Dimension.Pixels) component1).f40839px), Integer.valueOf(((Dimension.Pixels) component2).f40839px));
        }
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        Dimension width2 = size.getWidth();
        int i2 = Integer.MIN_VALUE;
        if (width2 instanceof Dimension.Pixels) {
            i = ((Dimension.Pixels) width2).f40839px;
        } else {
            i = Integer.MIN_VALUE;
        }
        Dimension height2 = size.getHeight();
        if (height2 instanceof Dimension.Pixels) {
            i2 = ((Dimension.Pixels) height2).f40839px;
        }
        double computeSizeMultiplier = DecodeUtils.computeSizeMultiplier(width, height, i, i2, Scale.FILL);
        return TuplesKt.m29136to(Integer.valueOf(AbstractC22237sr0.roundToInt(bitmap.getWidth() * computeSizeMultiplier)), Integer.valueOf(AbstractC22237sr0.roundToInt(computeSizeMultiplier * bitmap.getHeight())));
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof RoundedCornersTransformation) {
            RoundedCornersTransformation roundedCornersTransformation = (RoundedCornersTransformation) obj;
            if (this.f40853a == roundedCornersTransformation.f40853a && this.f40854b == roundedCornersTransformation.f40854b && this.f40855c == roundedCornersTransformation.f40855c && this.f40856d == roundedCornersTransformation.f40856d) {
                return true;
            }
        }
        return false;
    }

    @Override // coil.transform.Transformation
    @NotNull
    public String getCacheKey() {
        return this.f40857e;
    }

    public int hashCode() {
        return (((((Float.floatToIntBits(this.f40853a) * 31) + Float.floatToIntBits(this.f40854b)) * 31) + Float.floatToIntBits(this.f40855c)) * 31) + Float.floatToIntBits(this.f40856d);
    }

    @Override // coil.transform.Transformation
    @Nullable
    public Object transform(@NotNull Bitmap bitmap, @NotNull Size size, @NotNull Continuation<? super Bitmap> continuation) {
        Paint paint = new Paint(3);
        Pair m51017a = m51017a(bitmap, size);
        int intValue = ((Number) m51017a.component1()).intValue();
        int intValue2 = ((Number) m51017a.component2()).intValue();
        Bitmap createBitmap = Bitmap.createBitmap(intValue, intValue2, Bitmaps.getSafeConfig(bitmap));
        Intrinsics.checkNotNullExpressionValue(createBitmap, "createBitmap(width, height, config)");
        Canvas canvas = new Canvas(createBitmap);
        canvas.drawColor(0, PorterDuff.Mode.CLEAR);
        Matrix matrix = new Matrix();
        float computeSizeMultiplier = (float) DecodeUtils.computeSizeMultiplier(bitmap.getWidth(), bitmap.getHeight(), intValue, intValue2, Scale.FILL);
        float f = 2;
        matrix.setTranslate((intValue - (bitmap.getWidth() * computeSizeMultiplier)) / f, (intValue2 - (bitmap.getHeight() * computeSizeMultiplier)) / f);
        matrix.preScale(computeSizeMultiplier, computeSizeMultiplier);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
        bitmapShader.setLocalMatrix(matrix);
        paint.setShader(bitmapShader);
        float f2 = this.f40853a;
        float f3 = this.f40854b;
        float f4 = this.f40856d;
        float f5 = this.f40855c;
        float[] fArr = {f2, f2, f3, f3, f4, f4, f5, f5};
        RectF rectF = new RectF(0.0f, 0.0f, canvas.getWidth(), canvas.getHeight());
        Path path = new Path();
        path.addRoundRect(rectF, fArr, Path.Direction.CW);
        canvas.drawPath(path, paint);
        return createBitmap;
    }

    public RoundedCornersTransformation(@InterfaceC2037Px float f, @InterfaceC2037Px float f2, @InterfaceC2037Px float f3, @InterfaceC2037Px float f4) {
        this.f40853a = f;
        this.f40854b = f2;
        this.f40855c = f3;
        this.f40856d = f4;
        if (f >= 0.0f && f2 >= 0.0f && f3 >= 0.0f && f4 >= 0.0f) {
            this.f40857e = RoundedCornersTransformation.class.getName() + '-' + f + ',' + f2 + ',' + f3 + ',' + f4;
            return;
        }
        throw new IllegalArgumentException("All radii must be >= 0.".toString());
    }

    public /* synthetic */ RoundedCornersTransformation(float f, float f2, float f3, float f4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0.0f : f, (i & 2) != 0 ? 0.0f : f2, (i & 4) != 0 ? 0.0f : f3, (i & 8) != 0 ? 0.0f : f4);
    }

    public RoundedCornersTransformation(@InterfaceC2037Px float f) {
        this(f, f, f, f);
    }
}