package p000;

import android.graphics.Path;
import com.airbnb.lottie.LottieComposition;
import com.airbnb.lottie.model.animatable.AnimatableColorValue;
import com.airbnb.lottie.model.animatable.AnimatableIntegerValue;
import com.airbnb.lottie.model.content.ShapeFill;
import com.airbnb.lottie.parser.AnimatableValueParser;
import com.airbnb.lottie.parser.moshi.JsonReader;
import com.airbnb.lottie.value.Keyframe;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.util.Collections;

/* renamed from: LG1 */
/* loaded from: classes3.dex */
public abstract class LG1 {

    /* renamed from: a */
    public static final JsonReader.Options f3428a = JsonReader.Options.m50685of("nm", OperatorName.CURVE_TO, "o", "fillEnabled", PDPageLabelRange.STYLE_ROMAN_LOWER, "hd");

    /* renamed from: a */
    public static ShapeFill m67536a(JsonReader jsonReader, LottieComposition lottieComposition) {
        Path.FillType fillType;
        AnimatableIntegerValue animatableIntegerValue = null;
        String str = null;
        AnimatableColorValue animatableColorValue = null;
        int i = 1;
        boolean z = false;
        boolean z2 = false;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(f3428a);
            if (selectName != 0) {
                if (selectName != 1) {
                    if (selectName != 2) {
                        if (selectName != 3) {
                            if (selectName != 4) {
                                if (selectName != 5) {
                                    jsonReader.skipName();
                                    jsonReader.skipValue();
                                } else {
                                    z2 = jsonReader.nextBoolean();
                                }
                            } else {
                                i = jsonReader.nextInt();
                            }
                        } else {
                            z = jsonReader.nextBoolean();
                        }
                    } else {
                        animatableIntegerValue = AnimatableValueParser.m50705f(jsonReader, lottieComposition);
                    }
                } else {
                    animatableColorValue = AnimatableValueParser.m50708c(jsonReader, lottieComposition);
                }
            } else {
                str = jsonReader.nextString();
            }
        }
        if (animatableIntegerValue == null) {
            animatableIntegerValue = new AnimatableIntegerValue(Collections.singletonList(new Keyframe(100)));
        }
        AnimatableIntegerValue animatableIntegerValue2 = animatableIntegerValue;
        if (i == 1) {
            fillType = Path.FillType.WINDING;
        } else {
            fillType = Path.FillType.EVEN_ODD;
        }
        return new ShapeFill(str, z, fillType, animatableColorValue, animatableIntegerValue2, z2);
    }
}
