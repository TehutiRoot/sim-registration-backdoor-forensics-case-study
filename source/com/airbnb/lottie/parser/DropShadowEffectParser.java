package com.airbnb.lottie.parser;

import com.airbnb.lottie.LottieComposition;
import com.airbnb.lottie.model.animatable.AnimatableColorValue;
import com.airbnb.lottie.model.animatable.AnimatableFloatValue;
import com.airbnb.lottie.parser.moshi.JsonReader;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;

/* loaded from: classes3.dex */
public class DropShadowEffectParser {

    /* renamed from: f */
    public static final JsonReader.Options f41535f = JsonReader.Options.m50685of("ef");

    /* renamed from: g */
    public static final JsonReader.Options f41536g = JsonReader.Options.m50685of("nm", OperatorName.CURVE_TO_REPLICATE_INITIAL_POINT);

    /* renamed from: a */
    public AnimatableColorValue f41537a;

    /* renamed from: b */
    public AnimatableFloatValue f41538b;

    /* renamed from: c */
    public AnimatableFloatValue f41539c;

    /* renamed from: d */
    public AnimatableFloatValue f41540d;

    /* renamed from: e */
    public AnimatableFloatValue f41541e;

    /* renamed from: a */
    public final void m50701a(JsonReader jsonReader, LottieComposition lottieComposition) {
        jsonReader.beginObject();
        String str = "";
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(f41536g);
            if (selectName != 0) {
                if (selectName != 1) {
                    jsonReader.skipName();
                    jsonReader.skipValue();
                } else {
                    str.hashCode();
                    char c = 65535;
                    switch (str.hashCode()) {
                        case 353103893:
                            if (str.equals("Distance")) {
                                c = 0;
                                break;
                            }
                            break;
                        case 397447147:
                            if (str.equals("Opacity")) {
                                c = 1;
                                break;
                            }
                            break;
                        case 1041377119:
                            if (str.equals("Direction")) {
                                c = 2;
                                break;
                            }
                            break;
                        case 1379387491:
                            if (str.equals("Shadow Color")) {
                                c = 3;
                                break;
                            }
                            break;
                        case 1383710113:
                            if (str.equals("Softness")) {
                                c = 4;
                                break;
                            }
                            break;
                    }
                    switch (c) {
                        case 0:
                            this.f41540d = AnimatableValueParser.parseFloat(jsonReader, lottieComposition);
                            continue;
                        case 1:
                            this.f41538b = AnimatableValueParser.parseFloat(jsonReader, lottieComposition, false);
                            continue;
                        case 2:
                            this.f41539c = AnimatableValueParser.parseFloat(jsonReader, lottieComposition, false);
                            continue;
                        case 3:
                            this.f41537a = AnimatableValueParser.m50708c(jsonReader, lottieComposition);
                            continue;
                        case 4:
                            this.f41541e = AnimatableValueParser.parseFloat(jsonReader, lottieComposition);
                            continue;
                        default:
                            jsonReader.skipValue();
                            continue;
                    }
                }
            } else {
                str = jsonReader.nextString();
            }
        }
        jsonReader.endObject();
    }

    /* renamed from: b */
    public DropShadowEffect m50700b(JsonReader jsonReader, LottieComposition lottieComposition) {
        AnimatableFloatValue animatableFloatValue;
        AnimatableFloatValue animatableFloatValue2;
        AnimatableFloatValue animatableFloatValue3;
        AnimatableFloatValue animatableFloatValue4;
        while (jsonReader.hasNext()) {
            if (jsonReader.selectName(f41535f) != 0) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else {
                jsonReader.beginArray();
                while (jsonReader.hasNext()) {
                    m50701a(jsonReader, lottieComposition);
                }
                jsonReader.endArray();
            }
        }
        AnimatableColorValue animatableColorValue = this.f41537a;
        if (animatableColorValue != null && (animatableFloatValue = this.f41538b) != null && (animatableFloatValue2 = this.f41539c) != null && (animatableFloatValue3 = this.f41540d) != null && (animatableFloatValue4 = this.f41541e) != null) {
            return new DropShadowEffect(animatableColorValue, animatableFloatValue, animatableFloatValue2, animatableFloatValue3, animatableFloatValue4);
        }
        return null;
    }
}
