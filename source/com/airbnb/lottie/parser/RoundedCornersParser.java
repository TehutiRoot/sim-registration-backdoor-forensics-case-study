package com.airbnb.lottie.parser;

import com.airbnb.lottie.LottieComposition;
import com.airbnb.lottie.model.animatable.AnimatableFloatValue;
import com.airbnb.lottie.model.content.RoundedCorners;
import com.airbnb.lottie.parser.moshi.JsonReader;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;

/* loaded from: classes3.dex */
public class RoundedCornersParser {

    /* renamed from: a */
    public static final JsonReader.Options f41551a = JsonReader.Options.m50685of("nm", PDPageLabelRange.STYLE_ROMAN_LOWER, "hd");

    /* renamed from: a */
    public static RoundedCorners m50691a(JsonReader jsonReader, LottieComposition lottieComposition) {
        boolean z = false;
        String str = null;
        AnimatableFloatValue animatableFloatValue = null;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(f41551a);
            if (selectName != 0) {
                if (selectName != 1) {
                    if (selectName != 2) {
                        jsonReader.skipValue();
                    } else {
                        z = jsonReader.nextBoolean();
                    }
                } else {
                    animatableFloatValue = AnimatableValueParser.parseFloat(jsonReader, lottieComposition, true);
                }
            } else {
                str = jsonReader.nextString();
            }
        }
        if (z) {
            return null;
        }
        return new RoundedCorners(str, animatableFloatValue);
    }
}
