package p000;

import com.airbnb.lottie.LottieComposition;
import com.airbnb.lottie.model.content.BlurEffect;
import com.airbnb.lottie.parser.AnimatableValueParser;
import com.airbnb.lottie.parser.moshi.JsonReader;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;

/* renamed from: ac */
/* loaded from: classes3.dex */
public abstract class AbstractC1887ac {

    /* renamed from: a */
    public static final JsonReader.Options f8452a = JsonReader.Options.m50682of("ef");

    /* renamed from: b */
    public static final JsonReader.Options f8453b = JsonReader.Options.m50682of("ty", OperatorName.CURVE_TO_REPLICATE_INITIAL_POINT);

    /* renamed from: a */
    public static BlurEffect m65111a(JsonReader jsonReader, LottieComposition lottieComposition) {
        jsonReader.beginObject();
        BlurEffect blurEffect = null;
        while (true) {
            boolean z = false;
            while (jsonReader.hasNext()) {
                int selectName = jsonReader.selectName(f8453b);
                if (selectName != 0) {
                    if (selectName != 1) {
                        jsonReader.skipName();
                        jsonReader.skipValue();
                    } else if (z) {
                        blurEffect = new BlurEffect(AnimatableValueParser.parseFloat(jsonReader, lottieComposition));
                    } else {
                        jsonReader.skipValue();
                    }
                } else if (jsonReader.nextInt() == 0) {
                    z = true;
                }
            }
            jsonReader.endObject();
            return blurEffect;
        }
    }

    /* renamed from: b */
    public static BlurEffect m65110b(JsonReader jsonReader, LottieComposition lottieComposition) {
        BlurEffect blurEffect = null;
        while (jsonReader.hasNext()) {
            if (jsonReader.selectName(f8452a) != 0) {
                jsonReader.skipName();
                jsonReader.skipValue();
            } else {
                jsonReader.beginArray();
                while (jsonReader.hasNext()) {
                    BlurEffect m65111a = m65111a(jsonReader, lottieComposition);
                    if (m65111a != null) {
                        blurEffect = m65111a;
                    }
                }
                jsonReader.endArray();
            }
        }
        return blurEffect;
    }
}