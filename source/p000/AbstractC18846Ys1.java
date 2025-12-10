package p000;

import com.airbnb.lottie.LottieComposition;
import com.airbnb.lottie.model.animatable.AnimatableFloatValue;
import com.airbnb.lottie.model.animatable.AnimatablePointValue;
import com.airbnb.lottie.model.animatable.AnimatableValue;
import com.airbnb.lottie.model.content.RectangleShape;
import com.airbnb.lottie.parser.AnimatablePathValueParser;
import com.airbnb.lottie.parser.AnimatableValueParser;
import com.airbnb.lottie.parser.moshi.JsonReader;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;

/* renamed from: Ys1  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC18846Ys1 {

    /* renamed from: a */
    public static final JsonReader.Options f7883a = JsonReader.Options.m50685of("nm", "p", OperatorName.CLOSE_AND_STROKE, PDPageLabelRange.STYLE_ROMAN_LOWER, "hd");

    /* renamed from: a */
    public static RectangleShape m65287a(JsonReader jsonReader, LottieComposition lottieComposition) {
        String str = null;
        AnimatableValue animatableValue = null;
        AnimatablePointValue animatablePointValue = null;
        AnimatableFloatValue animatableFloatValue = null;
        boolean z = false;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(f7883a);
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
                            animatableFloatValue = AnimatableValueParser.parseFloat(jsonReader, lottieComposition);
                        }
                    } else {
                        animatablePointValue = AnimatableValueParser.m50704g(jsonReader, lottieComposition);
                    }
                } else {
                    animatableValue = AnimatablePathValueParser.m50718a(jsonReader, lottieComposition);
                }
            } else {
                str = jsonReader.nextString();
            }
        }
        return new RectangleShape(str, animatableValue, animatablePointValue, animatableFloatValue, z);
    }
}
