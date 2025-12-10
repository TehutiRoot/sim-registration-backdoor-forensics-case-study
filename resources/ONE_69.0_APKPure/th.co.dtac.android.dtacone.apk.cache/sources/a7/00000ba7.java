package p000;

import com.airbnb.lottie.LottieComposition;
import com.airbnb.lottie.model.animatable.AnimatableFloatValue;
import com.airbnb.lottie.model.content.ShapeTrimPath;
import com.airbnb.lottie.parser.AnimatableValueParser;
import com.airbnb.lottie.parser.moshi.JsonReader;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;

/* renamed from: MH1 */
/* loaded from: classes3.dex */
public abstract class MH1 {

    /* renamed from: a */
    public static final JsonReader.Options f3857a = JsonReader.Options.m50682of(OperatorName.CLOSE_AND_STROKE, "e", "o", "nm", OperatorName.MOVE_TO, "hd");

    /* renamed from: a */
    public static ShapeTrimPath m67436a(JsonReader jsonReader, LottieComposition lottieComposition) {
        String str = null;
        ShapeTrimPath.Type type = null;
        AnimatableFloatValue animatableFloatValue = null;
        AnimatableFloatValue animatableFloatValue2 = null;
        AnimatableFloatValue animatableFloatValue3 = null;
        boolean z = false;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(f3857a);
            if (selectName != 0) {
                if (selectName != 1) {
                    if (selectName != 2) {
                        if (selectName != 3) {
                            if (selectName != 4) {
                                if (selectName != 5) {
                                    jsonReader.skipValue();
                                } else {
                                    z = jsonReader.nextBoolean();
                                }
                            } else {
                                type = ShapeTrimPath.Type.forId(jsonReader.nextInt());
                            }
                        } else {
                            str = jsonReader.nextString();
                        }
                    } else {
                        animatableFloatValue3 = AnimatableValueParser.parseFloat(jsonReader, lottieComposition, false);
                    }
                } else {
                    animatableFloatValue2 = AnimatableValueParser.parseFloat(jsonReader, lottieComposition, false);
                }
            } else {
                animatableFloatValue = AnimatableValueParser.parseFloat(jsonReader, lottieComposition, false);
            }
        }
        return new ShapeTrimPath(str, type, animatableFloatValue, animatableFloatValue2, animatableFloatValue3, z);
    }
}