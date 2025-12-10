package p000;

import com.airbnb.lottie.LottieComposition;
import com.airbnb.lottie.model.animatable.AnimatableShapeValue;
import com.airbnb.lottie.model.content.ShapePath;
import com.airbnb.lottie.parser.AnimatableValueParser;
import com.airbnb.lottie.parser.moshi.JsonReader;

/* renamed from: KH1 */
/* loaded from: classes3.dex */
public abstract class KH1 {

    /* renamed from: a */
    public static JsonReader.Options f3271a = JsonReader.Options.m50682of("nm", "ind", "ks", "hd");

    /* renamed from: a */
    public static ShapePath m67729a(JsonReader jsonReader, LottieComposition lottieComposition) {
        String str = null;
        AnimatableShapeValue animatableShapeValue = null;
        int i = 0;
        boolean z = false;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(f3271a);
            if (selectName != 0) {
                if (selectName != 1) {
                    if (selectName != 2) {
                        if (selectName != 3) {
                            jsonReader.skipValue();
                        } else {
                            z = jsonReader.nextBoolean();
                        }
                    } else {
                        animatableShapeValue = AnimatableValueParser.m50699i(jsonReader, lottieComposition);
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