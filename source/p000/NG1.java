package p000;

import com.airbnb.lottie.LottieComposition;
import com.airbnb.lottie.model.animatable.AnimatableShapeValue;
import com.airbnb.lottie.model.content.ShapePath;
import com.airbnb.lottie.parser.AnimatableValueParser;
import com.airbnb.lottie.parser.moshi.JsonReader;

/* renamed from: NG1 */
/* loaded from: classes3.dex */
public abstract class NG1 {

    /* renamed from: a */
    public static JsonReader.Options f4054a = JsonReader.Options.m50685of("nm", "ind", "ks", "hd");

    /* renamed from: a */
    public static ShapePath m67234a(JsonReader jsonReader, LottieComposition lottieComposition) {
        String str = null;
        AnimatableShapeValue animatableShapeValue = null;
        int i = 0;
        boolean z = false;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(f4054a);
            if (selectName != 0) {
                if (selectName != 1) {
                    if (selectName != 2) {
                        if (selectName != 3) {
                            jsonReader.skipValue();
                        } else {
                            z = jsonReader.nextBoolean();
                        }
                    } else {
                        animatableShapeValue = AnimatableValueParser.m50702i(jsonReader, lottieComposition);
                    }
                } else {
                    i = jsonReader.nextInt();
                }
            } else {
                str = jsonReader.nextString();
            }
        }
        return new ShapePath(str, i, animatableShapeValue, z);
    }
}
