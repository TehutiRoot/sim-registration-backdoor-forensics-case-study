package com.airbnb.lottie.parser;

import com.airbnb.lottie.LottieComposition;
import com.airbnb.lottie.model.animatable.AnimatableColorValue;
import com.airbnb.lottie.model.animatable.AnimatableFloatValue;
import com.airbnb.lottie.model.animatable.AnimatableGradientColorValue;
import com.airbnb.lottie.model.animatable.AnimatableIntegerValue;
import com.airbnb.lottie.model.animatable.AnimatablePointValue;
import com.airbnb.lottie.model.animatable.AnimatableScaleValue;
import com.airbnb.lottie.model.animatable.AnimatableShapeValue;
import com.airbnb.lottie.model.animatable.AnimatableTextFrame;
import com.airbnb.lottie.parser.moshi.JsonReader;
import com.airbnb.lottie.utils.Utils;
import java.io.IOException;
import java.util.List;

/* loaded from: classes3.dex */
public class AnimatableValueParser {
    /* renamed from: a */
    public static List m50710a(JsonReader jsonReader, float f, LottieComposition lottieComposition, N02 n02) {
        return AbstractC18242Ph0.m66765a(jsonReader, lottieComposition, f, n02, false);
    }

    /* renamed from: b */
    public static List m50709b(JsonReader jsonReader, LottieComposition lottieComposition, N02 n02) {
        return AbstractC18242Ph0.m66765a(jsonReader, lottieComposition, 1.0f, n02, false);
    }

    /* renamed from: c */
    public static AnimatableColorValue m50708c(JsonReader jsonReader, LottieComposition lottieComposition) {
        return new AnimatableColorValue(m50709b(jsonReader, lottieComposition, ColorParser.INSTANCE));
    }

    /* renamed from: d */
    public static AnimatableTextFrame m50707d(JsonReader jsonReader, LottieComposition lottieComposition) {
        return new AnimatableTextFrame(m50710a(jsonReader, Utils.dpScale(), lottieComposition, DocumentDataParser.INSTANCE));
    }

    /* renamed from: e */
    public static AnimatableGradientColorValue m50706e(JsonReader jsonReader, LottieComposition lottieComposition, int i) {
        return new AnimatableGradientColorValue(m50709b(jsonReader, lottieComposition, new GradientColorParser(i)));
    }

    /* renamed from: f */
    public static AnimatableIntegerValue m50705f(JsonReader jsonReader, LottieComposition lottieComposition) {
        return new AnimatableIntegerValue(m50709b(jsonReader, lottieComposition, IntegerParser.INSTANCE));
    }

    /* renamed from: g */
    public static AnimatablePointValue m50704g(JsonReader jsonReader, LottieComposition lottieComposition) {
        return new AnimatablePointValue(AbstractC18242Ph0.m66765a(jsonReader, lottieComposition, Utils.dpScale(), PointFParser.INSTANCE, true));
    }

    /* renamed from: h */
    public static AnimatableScaleValue m50703h(JsonReader jsonReader, LottieComposition lottieComposition) {
        return new AnimatableScaleValue(m50709b(jsonReader, lottieComposition, ScaleXYParser.INSTANCE));
    }

    /* renamed from: i */
    public static AnimatableShapeValue m50702i(JsonReader jsonReader, LottieComposition lottieComposition) {
        return new AnimatableShapeValue(m50710a(jsonReader, Utils.dpScale(), lottieComposition, ShapeDataParser.INSTANCE));
    }

    public static AnimatableFloatValue parseFloat(JsonReader jsonReader, LottieComposition lottieComposition) throws IOException {
        return parseFloat(jsonReader, lottieComposition, true);
    }

    public static AnimatableFloatValue parseFloat(JsonReader jsonReader, LottieComposition lottieComposition, boolean z) throws IOException {
        return new AnimatableFloatValue(m50710a(jsonReader, z ? Utils.dpScale() : 1.0f, lottieComposition, FloatParser.INSTANCE));
    }
}
