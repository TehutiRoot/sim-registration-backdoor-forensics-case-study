package com.airbnb.lottie.parser;

import com.airbnb.lottie.LottieComposition;
import com.airbnb.lottie.model.animatable.AnimatableColorValue;
import com.airbnb.lottie.model.animatable.AnimatableFloatValue;
import com.airbnb.lottie.parser.moshi.JsonReader;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;

/* loaded from: classes3.dex */
public class DropShadowEffectParser {

    /* renamed from: f */
    public static final JsonReader.Options f41547f = JsonReader.Options.m50682of("ef");

    /* renamed from: g */
    public static final JsonReader.Options f41548g = JsonReader.Options.m50682of("nm", OperatorName.CURVE_TO_REPLICATE_INITIAL_POINT);

    /* renamed from: a */
    public AnimatableColorValue f41549a;

    /* renamed from: b */
    public AnimatableFloatValue f41550b;

    /* renamed from: c */
    public AnimatableFloatValue f41551c;

    /* renamed from: d */
    public AnimatableFloatValue f41552d;

    /* renamed from: e */
    public AnimatableFloatValue f41553e;

    /* renamed from: a */
    public final void m50698a(JsonReader jsonReader, LottieComposition lottieComposition) {
        jsonReader.beginObject();
        String str = "";
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(f41548g);
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
                            this.f41552d = AnimatableValueParser.parseFloat(jsonReader, lottieComposition);
                            continue;
                        case 1:
                            this.f41550b = AnimatableValueParser.parseFloat(jsonReader, lottieComposition, false);
                            continue;
                        case 2:
                            this.f41551c = AnimatableValueParser.parseFloat(jsonReader, lottieComposition, false);
                            continue;
                        case 3:
                            this.f41549a = AnimatableValueParser.m50705c(jsonReader, lottieComposition);
                            continue;
                        case 4:
                            this.f41553e = AnimatableValueParser.parseFloat(jsonReader, lottieComposition);
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
    public DropShadowEffect m50697b(JsonReader jsonReader, LottieComposition lottieComposition) {
        AnimatableFloatValue animatableFloatValue;
        AnimatableFloatValue animatableFloatValue2;
        AnimatableFloatValue animatableFloatValue3;
        AnimatableFloatValue animatableFloatValue4;
        while (jsonReader.hasNext()) {
            if (jsonReader.selectName(f41547f) != 0) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else {
                jsonReader.beginArray();
                while (jsonReader.hasNext()) {
                    m50698a(jsonReader, lottieComposition);
                }
                jsonReader.endArray();
            }
        }
        AnimatableColorValue animatableColorValue = this.f41549a;
        if (animatableColorValue != null && (animatableFloatValue = this.f41550b) != null && (animatableFloatValue2 = this.f41551c) != null && (animatableFloatValue3 = this.f41552d) != null && (animatableFloatValue4 = this.f41553e) != null) {
            return new DropShadowEffect(animatableColorValue, animatableFloatValue, animatableFloatValue2, animatableFloatValue3, animatableFloatValue4);
        }
        return null;
    }
}