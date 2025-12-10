package com.airbnb.lottie.compose;

import android.graphics.Bitmap;
import android.graphics.ColorFilter;
import android.graphics.PointF;
import android.graphics.Typeface;
import androidx.compose.runtime.internal.StabilityInferred;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.model.KeyPath;
import com.airbnb.lottie.value.LottieValueCallback;
import com.airbnb.lottie.value.ScaleXY;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@StabilityInferred(parameters = 0)
@Metadata(m28851d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0010\b\u0007\u0018\u00002\u00020\u0001BÁ\u0001\b\u0000\u0012\u0012\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00030\u0002\u0012\u0012\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00030\u0002\u0012\u0012\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u00030\u0002\u0012\u0012\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u00030\u0002\u0012\u0016\u0010\u000f\u001a\u0012\u0012\u000e\u0012\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000e0\u00030\u0002\u0012\u0012\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u00030\u0002\u0012\u0012\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00030\u0002\u0012\u0012\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u00030\u0002¢\u0006\u0004\b\u0016\u0010\u0017B\u001b\b\u0016\u0012\u0010\u0010\u0018\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00030\u0002¢\u0006\u0004\b\u0016\u0010\u0019J\u0017\u0010\u001f\u001a\u00020\u001c2\u0006\u0010\u001b\u001a\u00020\u001aH\u0000¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010!\u001a\u00020\u001c2\u0006\u0010\u001b\u001a\u00020\u001aH\u0000¢\u0006\u0004\b \u0010\u001eR \u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R \u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010#R \u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010#R \u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010#R \u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010#R$\u0010\u000f\u001a\u0012\u0012\u000e\u0012\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000e0\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010#R \u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010#R \u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010#R \u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010#¨\u0006,"}, m28850d2 = {"Lcom/airbnb/lottie/compose/LottieDynamicProperties;", "", "", "Lcom/airbnb/lottie/compose/LottieDynamicProperty;", "", "intProperties", "Landroid/graphics/PointF;", "pointFProperties", "", "floatProperties", "Lcom/airbnb/lottie/value/ScaleXY;", "scaleProperties", "Landroid/graphics/ColorFilter;", "colorFilterProperties", "", "intArrayProperties", "Landroid/graphics/Typeface;", "typefaceProperties", "Landroid/graphics/Bitmap;", "bitmapProperties", "", "charSequenceProperties", "<init>", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "properties", "(Ljava/util/List;)V", "Lcom/airbnb/lottie/LottieDrawable;", "drawable", "", "addTo$lottie_compose_release", "(Lcom/airbnb/lottie/LottieDrawable;)V", "addTo", "removeFrom$lottie_compose_release", "removeFrom", PDPageLabelRange.STYLE_LETTERS_LOWER, "Ljava/util/List;", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, OperatorName.CURVE_TO, "d", "e", OperatorName.FILL_NON_ZERO, OperatorName.NON_STROKING_GRAY, OperatorName.CLOSE_PATH, "i", "lottie-compose_release"}, m28849k = 1, m28848mv = {1, 6, 0})
/* loaded from: classes3.dex */
public final class LottieDynamicProperties {
    public static final int $stable = 8;

    /* renamed from: a */
    public final List f41260a;

    /* renamed from: b */
    public final List f41261b;

    /* renamed from: c */
    public final List f41262c;

    /* renamed from: d */
    public final List f41263d;

    /* renamed from: e */
    public final List f41264e;

    /* renamed from: f */
    public final List f41265f;

    /* renamed from: g */
    public final List f41266g;

    /* renamed from: h */
    public final List f41267h;

    /* renamed from: i */
    public final List f41268i;

    public LottieDynamicProperties(@NotNull List<LottieDynamicProperty<Integer>> intProperties, @NotNull List<LottieDynamicProperty<PointF>> pointFProperties, @NotNull List<LottieDynamicProperty<Float>> floatProperties, @NotNull List<LottieDynamicProperty<ScaleXY>> scaleProperties, @NotNull List<LottieDynamicProperty<ColorFilter>> colorFilterProperties, @NotNull List<LottieDynamicProperty<Object[]>> intArrayProperties, @NotNull List<LottieDynamicProperty<Typeface>> typefaceProperties, @NotNull List<LottieDynamicProperty<Bitmap>> bitmapProperties, @NotNull List<LottieDynamicProperty<CharSequence>> charSequenceProperties) {
        Intrinsics.checkNotNullParameter(intProperties, "intProperties");
        Intrinsics.checkNotNullParameter(pointFProperties, "pointFProperties");
        Intrinsics.checkNotNullParameter(floatProperties, "floatProperties");
        Intrinsics.checkNotNullParameter(scaleProperties, "scaleProperties");
        Intrinsics.checkNotNullParameter(colorFilterProperties, "colorFilterProperties");
        Intrinsics.checkNotNullParameter(intArrayProperties, "intArrayProperties");
        Intrinsics.checkNotNullParameter(typefaceProperties, "typefaceProperties");
        Intrinsics.checkNotNullParameter(bitmapProperties, "bitmapProperties");
        Intrinsics.checkNotNullParameter(charSequenceProperties, "charSequenceProperties");
        this.f41260a = intProperties;
        this.f41261b = pointFProperties;
        this.f41262c = floatProperties;
        this.f41263d = scaleProperties;
        this.f41264e = colorFilterProperties;
        this.f41265f = intArrayProperties;
        this.f41266g = typefaceProperties;
        this.f41267h = bitmapProperties;
        this.f41268i = charSequenceProperties;
    }

    public final void addTo$lottie_compose_release(@NotNull LottieDrawable drawable) {
        LottieDynamicPropertiesKt$toValueCallback$1 m50817b;
        LottieDynamicPropertiesKt$toValueCallback$1 m50817b2;
        LottieDynamicPropertiesKt$toValueCallback$1 m50817b3;
        LottieDynamicPropertiesKt$toValueCallback$1 m50817b4;
        LottieDynamicPropertiesKt$toValueCallback$1 m50817b5;
        LottieDynamicPropertiesKt$toValueCallback$1 m50817b6;
        LottieDynamicPropertiesKt$toValueCallback$1 m50817b7;
        LottieDynamicPropertiesKt$toValueCallback$1 m50817b8;
        LottieDynamicPropertiesKt$toValueCallback$1 m50817b9;
        Intrinsics.checkNotNullParameter(drawable, "drawable");
        for (LottieDynamicProperty lottieDynamicProperty : this.f41260a) {
            KeyPath keyPath$lottie_compose_release = lottieDynamicProperty.getKeyPath$lottie_compose_release();
            Object property$lottie_compose_release = lottieDynamicProperty.getProperty$lottie_compose_release();
            m50817b9 = LottieDynamicPropertiesKt.m50817b(lottieDynamicProperty.getCallback$lottie_compose_release());
            drawable.addValueCallback(keyPath$lottie_compose_release, (KeyPath) property$lottie_compose_release, (LottieValueCallback<KeyPath>) m50817b9);
        }
        for (LottieDynamicProperty lottieDynamicProperty2 : this.f41261b) {
            KeyPath keyPath$lottie_compose_release2 = lottieDynamicProperty2.getKeyPath$lottie_compose_release();
            Object property$lottie_compose_release2 = lottieDynamicProperty2.getProperty$lottie_compose_release();
            m50817b8 = LottieDynamicPropertiesKt.m50817b(lottieDynamicProperty2.getCallback$lottie_compose_release());
            drawable.addValueCallback(keyPath$lottie_compose_release2, (KeyPath) property$lottie_compose_release2, (LottieValueCallback<KeyPath>) m50817b8);
        }
        for (LottieDynamicProperty lottieDynamicProperty3 : this.f41262c) {
            KeyPath keyPath$lottie_compose_release3 = lottieDynamicProperty3.getKeyPath$lottie_compose_release();
            Object property$lottie_compose_release3 = lottieDynamicProperty3.getProperty$lottie_compose_release();
            m50817b7 = LottieDynamicPropertiesKt.m50817b(lottieDynamicProperty3.getCallback$lottie_compose_release());
            drawable.addValueCallback(keyPath$lottie_compose_release3, (KeyPath) property$lottie_compose_release3, (LottieValueCallback<KeyPath>) m50817b7);
        }
        for (LottieDynamicProperty lottieDynamicProperty4 : this.f41263d) {
            KeyPath keyPath$lottie_compose_release4 = lottieDynamicProperty4.getKeyPath$lottie_compose_release();
            Object property$lottie_compose_release4 = lottieDynamicProperty4.getProperty$lottie_compose_release();
            m50817b6 = LottieDynamicPropertiesKt.m50817b(lottieDynamicProperty4.getCallback$lottie_compose_release());
            drawable.addValueCallback(keyPath$lottie_compose_release4, (KeyPath) property$lottie_compose_release4, (LottieValueCallback<KeyPath>) m50817b6);
        }
        for (LottieDynamicProperty lottieDynamicProperty5 : this.f41264e) {
            KeyPath keyPath$lottie_compose_release5 = lottieDynamicProperty5.getKeyPath$lottie_compose_release();
            Object property$lottie_compose_release5 = lottieDynamicProperty5.getProperty$lottie_compose_release();
            m50817b5 = LottieDynamicPropertiesKt.m50817b(lottieDynamicProperty5.getCallback$lottie_compose_release());
            drawable.addValueCallback(keyPath$lottie_compose_release5, (KeyPath) property$lottie_compose_release5, (LottieValueCallback<KeyPath>) m50817b5);
        }
        for (LottieDynamicProperty lottieDynamicProperty6 : this.f41265f) {
            KeyPath keyPath$lottie_compose_release6 = lottieDynamicProperty6.getKeyPath$lottie_compose_release();
            Object property$lottie_compose_release6 = lottieDynamicProperty6.getProperty$lottie_compose_release();
            m50817b4 = LottieDynamicPropertiesKt.m50817b(lottieDynamicProperty6.getCallback$lottie_compose_release());
            drawable.addValueCallback(keyPath$lottie_compose_release6, (KeyPath) property$lottie_compose_release6, (LottieValueCallback<KeyPath>) m50817b4);
        }
        for (LottieDynamicProperty lottieDynamicProperty7 : this.f41266g) {
            KeyPath keyPath$lottie_compose_release7 = lottieDynamicProperty7.getKeyPath$lottie_compose_release();
            Object property$lottie_compose_release7 = lottieDynamicProperty7.getProperty$lottie_compose_release();
            m50817b3 = LottieDynamicPropertiesKt.m50817b(lottieDynamicProperty7.getCallback$lottie_compose_release());
            drawable.addValueCallback(keyPath$lottie_compose_release7, (KeyPath) property$lottie_compose_release7, (LottieValueCallback<KeyPath>) m50817b3);
        }
        for (LottieDynamicProperty lottieDynamicProperty8 : this.f41267h) {
            KeyPath keyPath$lottie_compose_release8 = lottieDynamicProperty8.getKeyPath$lottie_compose_release();
            Object property$lottie_compose_release8 = lottieDynamicProperty8.getProperty$lottie_compose_release();
            m50817b2 = LottieDynamicPropertiesKt.m50817b(lottieDynamicProperty8.getCallback$lottie_compose_release());
            drawable.addValueCallback(keyPath$lottie_compose_release8, (KeyPath) property$lottie_compose_release8, (LottieValueCallback<KeyPath>) m50817b2);
        }
        for (LottieDynamicProperty lottieDynamicProperty9 : this.f41268i) {
            KeyPath keyPath$lottie_compose_release9 = lottieDynamicProperty9.getKeyPath$lottie_compose_release();
            Object property$lottie_compose_release9 = lottieDynamicProperty9.getProperty$lottie_compose_release();
            m50817b = LottieDynamicPropertiesKt.m50817b(lottieDynamicProperty9.getCallback$lottie_compose_release());
            drawable.addValueCallback(keyPath$lottie_compose_release9, (KeyPath) property$lottie_compose_release9, (LottieValueCallback<KeyPath>) m50817b);
        }
    }

    public final void removeFrom$lottie_compose_release(@NotNull LottieDrawable drawable) {
        Intrinsics.checkNotNullParameter(drawable, "drawable");
        for (LottieDynamicProperty lottieDynamicProperty : this.f41260a) {
            drawable.addValueCallback(lottieDynamicProperty.getKeyPath$lottie_compose_release(), (KeyPath) lottieDynamicProperty.getProperty$lottie_compose_release(), (LottieValueCallback<KeyPath>) null);
        }
        for (LottieDynamicProperty lottieDynamicProperty2 : this.f41261b) {
            drawable.addValueCallback(lottieDynamicProperty2.getKeyPath$lottie_compose_release(), (KeyPath) lottieDynamicProperty2.getProperty$lottie_compose_release(), (LottieValueCallback<KeyPath>) null);
        }
        for (LottieDynamicProperty lottieDynamicProperty3 : this.f41262c) {
            drawable.addValueCallback(lottieDynamicProperty3.getKeyPath$lottie_compose_release(), (KeyPath) lottieDynamicProperty3.getProperty$lottie_compose_release(), (LottieValueCallback<KeyPath>) null);
        }
        for (LottieDynamicProperty lottieDynamicProperty4 : this.f41263d) {
            drawable.addValueCallback(lottieDynamicProperty4.getKeyPath$lottie_compose_release(), (KeyPath) lottieDynamicProperty4.getProperty$lottie_compose_release(), (LottieValueCallback<KeyPath>) null);
        }
        for (LottieDynamicProperty lottieDynamicProperty5 : this.f41264e) {
            drawable.addValueCallback(lottieDynamicProperty5.getKeyPath$lottie_compose_release(), (KeyPath) lottieDynamicProperty5.getProperty$lottie_compose_release(), (LottieValueCallback<KeyPath>) null);
        }
        for (LottieDynamicProperty lottieDynamicProperty6 : this.f41265f) {
            drawable.addValueCallback(lottieDynamicProperty6.getKeyPath$lottie_compose_release(), (KeyPath) lottieDynamicProperty6.getProperty$lottie_compose_release(), (LottieValueCallback<KeyPath>) null);
        }
        for (LottieDynamicProperty lottieDynamicProperty7 : this.f41266g) {
            drawable.addValueCallback(lottieDynamicProperty7.getKeyPath$lottie_compose_release(), (KeyPath) lottieDynamicProperty7.getProperty$lottie_compose_release(), (LottieValueCallback<KeyPath>) null);
        }
        for (LottieDynamicProperty lottieDynamicProperty8 : this.f41267h) {
            drawable.addValueCallback(lottieDynamicProperty8.getKeyPath$lottie_compose_release(), (KeyPath) lottieDynamicProperty8.getProperty$lottie_compose_release(), (LottieValueCallback<KeyPath>) null);
        }
        for (LottieDynamicProperty lottieDynamicProperty9 : this.f41268i) {
            drawable.addValueCallback(lottieDynamicProperty9.getKeyPath$lottie_compose_release(), (KeyPath) lottieDynamicProperty9.getProperty$lottie_compose_release(), (LottieValueCallback<KeyPath>) null);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public LottieDynamicProperties(@org.jetbrains.annotations.NotNull java.util.List<? extends com.airbnb.lottie.compose.LottieDynamicProperty<?>> r12) {
        /*
            Method dump skipped, instructions count: 318
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.airbnb.lottie.compose.LottieDynamicProperties.<init>(java.util.List):void");
    }
}
