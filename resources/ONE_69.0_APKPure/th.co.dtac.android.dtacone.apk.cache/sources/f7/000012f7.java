package p000;

import com.airbnb.lottie.LottieComposition;
import com.airbnb.lottie.model.animatable.AnimatableFloatValue;
import com.airbnb.lottie.model.animatable.AnimatableTransform;
import com.airbnb.lottie.model.content.Repeater;
import com.airbnb.lottie.parser.AnimatableTransformParser;
import com.airbnb.lottie.parser.AnimatableValueParser;
import com.airbnb.lottie.parser.moshi.JsonReader;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;

/* renamed from: Tx1  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC18579Tx1 {

    /* renamed from: a */
    public static final JsonReader.Options f6457a = JsonReader.Options.m50682of("nm", OperatorName.CURVE_TO, "o", "tr", "hd");

    /* renamed from: a */
    public static Repeater m66290a(JsonReader jsonReader, LottieComposition lottieComposition) {
        String str = null;
        AnimatableFloatValue animatableFloatValue = null;
        AnimatableFloatValue animatableFloatValue2 = null;
        AnimatableTransform animatableTransform = null;
        boolean z = false;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(f6457a);
            if (selectName != 0) {
                if (selectName != 1) {
                    if (selectName != 2) {
                        if (selectName != 3) {
                            if (selectName != 4) {
                                jsonReader.skipValue();
                            } else {
                                z = jsonReader.nextBoolean();
                            }
                        } else {
                            animatableTransform = AnimatableTransformParser.parse(jsonReader, lottieComposition);
                        }
                    } else {
                        animatableFloatValue2 = AnimatableValueParser.parseFloat(jsonReader, lottieComposition, false);
                    }
                } else {
                    animatableFloatValue = AnimatableValueParser.parseFloat(jsonReader, lottieComposition, false);
                }
            } else {
                str = jsonReader.nextString();
            }
        }
        return new Repeater(str, animatableFloatValue, animatableFloatValue2, animatableTransform, z);
    }
}