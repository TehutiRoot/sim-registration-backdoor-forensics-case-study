package com.airbnb.lottie.parser;

import com.airbnb.lottie.LottieComposition;
import com.airbnb.lottie.model.animatable.AnimatableColorValue;
import com.airbnb.lottie.model.animatable.AnimatableFloatValue;
import com.airbnb.lottie.model.animatable.AnimatableTextProperties;
import com.airbnb.lottie.parser.moshi.JsonReader;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.io.IOException;

/* loaded from: classes3.dex */
public class AnimatableTextPropertiesParser {

    /* renamed from: a */
    public static final JsonReader.Options f41525a = JsonReader.Options.m50685of(PDPageLabelRange.STYLE_LETTERS_LOWER);

    /* renamed from: b */
    public static final JsonReader.Options f41526b = JsonReader.Options.m50685of("fc", OperatorName.NON_STROKING_COLOR, "sw", "t");

    /* renamed from: a */
    public static AnimatableTextProperties m50717a(JsonReader jsonReader, LottieComposition lottieComposition) {
        jsonReader.beginObject();
        AnimatableColorValue animatableColorValue = null;
        AnimatableColorValue animatableColorValue2 = null;
        AnimatableFloatValue animatableFloatValue = null;
        AnimatableFloatValue animatableFloatValue2 = null;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(f41526b);
            if (selectName != 0) {
                if (selectName != 1) {
                    if (selectName != 2) {
                        if (selectName != 3) {
                            jsonReader.skipName();
                            jsonReader.skipValue();
                        } else {
                            animatableFloatValue2 = AnimatableValueParser.parseFloat(jsonReader, lottieComposition);
                        }
                    } else {
                        animatableFloatValue = AnimatableValueParser.parseFloat(jsonReader, lottieComposition);
                    }
                } else {
                    animatableColorValue2 = AnimatableValueParser.m50708c(jsonReader, lottieComposition);
                }
            } else {
                animatableColorValue = AnimatableValueParser.m50708c(jsonReader, lottieComposition);
            }
        }
        jsonReader.endObject();
        return new AnimatableTextProperties(animatableColorValue, animatableColorValue2, animatableFloatValue, animatableFloatValue2);
    }

    public static AnimatableTextProperties parse(JsonReader jsonReader, LottieComposition lottieComposition) throws IOException {
        jsonReader.beginObject();
        AnimatableTextProperties animatableTextProperties = null;
        while (jsonReader.hasNext()) {
            if (jsonReader.selectName(f41525a) != 0) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else {
                animatableTextProperties = m50717a(jsonReader, lottieComposition);
            }
        }
        jsonReader.endObject();
        if (animatableTextProperties == null) {
            return new AnimatableTextProperties(null, null, null, null);
        }
        return animatableTextProperties;
    }
}
