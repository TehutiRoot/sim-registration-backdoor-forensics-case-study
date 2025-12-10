package p000;

import com.airbnb.lottie.LottieComposition;
import com.airbnb.lottie.model.FontCharacter;
import com.airbnb.lottie.model.content.ShapeGroup;
import com.airbnb.lottie.parser.moshi.JsonReader;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import java.util.ArrayList;

/* renamed from: W30 */
/* loaded from: classes3.dex */
public abstract class W30 {

    /* renamed from: a */
    public static final JsonReader.Options f7112a = JsonReader.Options.m50685of("ch", "size", OperatorName.SET_LINE_WIDTH, "style", "fFamily", "data");

    /* renamed from: b */
    public static final JsonReader.Options f7113b = JsonReader.Options.m50685of("shapes");

    /* renamed from: a */
    public static FontCharacter m65692a(JsonReader jsonReader, LottieComposition lottieComposition) {
        ArrayList arrayList = new ArrayList();
        jsonReader.beginObject();
        double d = 0.0d;
        String str = null;
        String str2 = null;
        double d2 = 0.0d;
        char c = 0;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(f7112a);
            if (selectName != 0) {
                if (selectName != 1) {
                    if (selectName != 2) {
                        if (selectName != 3) {
                            if (selectName != 4) {
                                if (selectName != 5) {
                                    jsonReader.skipName();
                                    jsonReader.skipValue();
                                } else {
                                    jsonReader.beginObject();
                                    while (jsonReader.hasNext()) {
                                        if (jsonReader.selectName(f7113b) != 0) {
                                            jsonReader.skipName();
                                            jsonReader.skipValue();
                                        } else {
                                            jsonReader.beginArray();
                                            while (jsonReader.hasNext()) {
                                                arrayList.add((ShapeGroup) AbstractC1643Wx.m65547a(jsonReader, lottieComposition));
                                            }
                                            jsonReader.endArray();
                                        }
                                    }
                                    jsonReader.endObject();
                                }
                            } else {
                                str2 = jsonReader.nextString();
                            }
                        } else {
                            str = jsonReader.nextString();
                        }
                    } else {
                        d = jsonReader.nextDouble();
                    }
                } else {
                    d2 = jsonReader.nextDouble();
                }
            } else {
                c = jsonReader.nextString().charAt(0);
            }
        }
        jsonReader.endObject();
        return new FontCharacter(arrayList, c, d2, d, str, str2);
    }
}
