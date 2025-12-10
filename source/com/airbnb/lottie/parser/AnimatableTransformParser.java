package com.airbnb.lottie.parser;

import android.graphics.PointF;
import com.airbnb.lottie.model.animatable.AnimatableFloatValue;
import com.airbnb.lottie.model.animatable.AnimatablePathValue;
import com.airbnb.lottie.model.animatable.AnimatableScaleValue;
import com.airbnb.lottie.model.animatable.AnimatableSplitDimensionPathValue;
import com.airbnb.lottie.model.animatable.AnimatableValue;
import com.airbnb.lottie.parser.moshi.JsonReader;
import com.airbnb.lottie.value.Keyframe;
import com.airbnb.lottie.value.ScaleXY;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;

/* loaded from: classes3.dex */
public class AnimatableTransformParser {

    /* renamed from: a */
    public static final JsonReader.Options f41527a = JsonReader.Options.m50685of(PDPageLabelRange.STYLE_LETTERS_LOWER, "p", OperatorName.CLOSE_AND_STROKE, "rz", PDPageLabelRange.STYLE_ROMAN_LOWER, "o", "so", "eo", "sk", "sa");

    /* renamed from: b */
    public static final JsonReader.Options f41528b = JsonReader.Options.m50685of(OperatorName.NON_STROKING_CMYK);

    /* renamed from: a */
    public static boolean m50716a(AnimatablePathValue animatablePathValue) {
        if (animatablePathValue != null && (!animatablePathValue.isStatic() || !animatablePathValue.getKeyframes().get(0).startValue.equals(0.0f, 0.0f))) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public static boolean m50715b(AnimatableValue animatableValue) {
        if (animatableValue != null && ((animatableValue instanceof AnimatableSplitDimensionPathValue) || !animatableValue.isStatic() || !((PointF) ((Keyframe) animatableValue.getKeyframes().get(0)).startValue).equals(0.0f, 0.0f))) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    public static boolean m50714c(AnimatableFloatValue animatableFloatValue) {
        if (animatableFloatValue != null && (!animatableFloatValue.isStatic() || ((Float) ((Keyframe) animatableFloatValue.getKeyframes().get(0)).startValue).floatValue() != 0.0f)) {
            return false;
        }
        return true;
    }

    /* renamed from: d */
    public static boolean m50713d(AnimatableScaleValue animatableScaleValue) {
        if (animatableScaleValue != null && (!animatableScaleValue.isStatic() || !((ScaleXY) ((Keyframe) animatableScaleValue.getKeyframes().get(0)).startValue).equals(1.0f, 1.0f))) {
            return false;
        }
        return true;
    }

    /* renamed from: e */
    public static boolean m50712e(AnimatableFloatValue animatableFloatValue) {
        if (animatableFloatValue != null && (!animatableFloatValue.isStatic() || ((Float) ((Keyframe) animatableFloatValue.getKeyframes().get(0)).startValue).floatValue() != 0.0f)) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public static boolean m50711f(AnimatableFloatValue animatableFloatValue) {
        if (animatableFloatValue != null && (!animatableFloatValue.isStatic() || ((Float) ((Keyframe) animatableFloatValue.getKeyframes().get(0)).startValue).floatValue() != 0.0f)) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0090  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.airbnb.lottie.model.animatable.AnimatableTransform parse(com.airbnb.lottie.parser.moshi.JsonReader r27, com.airbnb.lottie.LottieComposition r28) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 346
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.airbnb.lottie.parser.AnimatableTransformParser.parse(com.airbnb.lottie.parser.moshi.JsonReader, com.airbnb.lottie.LottieComposition):com.airbnb.lottie.model.animatable.AnimatableTransform");
    }
}
