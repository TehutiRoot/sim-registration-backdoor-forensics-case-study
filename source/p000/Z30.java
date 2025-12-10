package p000;

import com.airbnb.lottie.model.Font;
import com.airbnb.lottie.parser.moshi.JsonReader;

/* renamed from: Z30 */
/* loaded from: classes3.dex */
public abstract class Z30 {

    /* renamed from: a */
    public static final JsonReader.Options f7945a = JsonReader.Options.m50685of("fFamily", "fName", "fStyle", "ascent");

    /* renamed from: a */
    public static Font m65269a(JsonReader jsonReader) {
        jsonReader.beginObject();
        String str = null;
        String str2 = null;
        String str3 = null;
        float f = 0.0f;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(f7945a);
            if (selectName != 0) {
                if (selectName != 1) {
                    if (selectName != 2) {
                        if (selectName != 3) {
                            jsonReader.skipName();
                            jsonReader.skipValue();
                        } else {
                            f = (float) jsonReader.nextDouble();
                        }
                    } else {
                        str3 = jsonReader.nextString();
                    }
                } else {
                    str2 = jsonReader.nextString();
                }
            } else {
                str = jsonReader.nextString();
            }
        }
        jsonReader.endObject();
        return new Font(str, str2, str3, f);
    }
}
