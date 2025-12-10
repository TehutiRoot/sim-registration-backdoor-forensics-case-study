package com.airbnb.lottie.model.animatable;

import com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation;
import com.airbnb.lottie.animation.keyframe.GradientColorKeyframeAnimation;
import com.airbnb.lottie.model.content.GradientColor;
import com.airbnb.lottie.value.Keyframe;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes3.dex */
public class AnimatableGradientColorValue extends AbstractC14009ta {
    public AnimatableGradientColorValue(List<Keyframe<GradientColor>> list) {
        super(m50795b(list));
    }

    /* renamed from: a */
    public static Keyframe m50796a(Keyframe keyframe) {
        GradientColor gradientColor = (GradientColor) keyframe.startValue;
        GradientColor gradientColor2 = (GradientColor) keyframe.endValue;
        if (gradientColor != null && gradientColor2 != null && gradientColor.getPositions().length != gradientColor2.getPositions().length) {
            float[] m50794c = m50794c(gradientColor.getPositions(), gradientColor2.getPositions());
            return keyframe.copyWith(gradientColor.copyWithPositions(m50794c), gradientColor2.copyWithPositions(m50794c));
        }
        return keyframe;
    }

    /* renamed from: b */
    public static List m50795b(List list) {
        for (int i = 0; i < list.size(); i++) {
            list.set(i, m50796a((Keyframe) list.get(i)));
        }
        return list;
    }

    /* renamed from: c */
    public static float[] m50794c(float[] fArr, float[] fArr2) {
        int length = fArr.length + fArr2.length;
        float[] fArr3 = new float[length];
        System.arraycopy(fArr, 0, fArr3, 0, fArr.length);
        System.arraycopy(fArr2, 0, fArr3, fArr.length, fArr2.length);
        Arrays.sort(fArr3);
        float f = Float.NaN;
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            float f2 = fArr3[i2];
            if (f2 != f) {
                fArr3[i] = f2;
                i++;
                f = fArr3[i2];
            }
        }
        return Arrays.copyOfRange(fArr3, 0, i);
    }

    @Override // com.airbnb.lottie.model.animatable.AnimatableValue
    public BaseKeyframeAnimation<GradientColor, GradientColor> createAnimation() {
        return new GradientColorKeyframeAnimation(this.f80142a);
    }

    @Override // p000.AbstractC14009ta, com.airbnb.lottie.model.animatable.AnimatableValue
    public /* bridge */ /* synthetic */ List getKeyframes() {
        return super.getKeyframes();
    }

    @Override // p000.AbstractC14009ta, com.airbnb.lottie.model.animatable.AnimatableValue
    public /* bridge */ /* synthetic */ boolean isStatic() {
        return super.isStatic();
    }

    @Override // p000.AbstractC14009ta
    public /* bridge */ /* synthetic */ String toString() {
        return super.toString();
    }
}
