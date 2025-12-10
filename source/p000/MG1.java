package p000;

import com.airbnb.lottie.LottieComposition;
import com.airbnb.lottie.model.content.ContentModel;
import com.airbnb.lottie.model.content.ShapeGroup;
import com.airbnb.lottie.parser.moshi.JsonReader;
import java.util.ArrayList;

/* renamed from: MG1 */
/* loaded from: classes3.dex */
public abstract class MG1 {

    /* renamed from: a */
    public static final JsonReader.Options f3726a = JsonReader.Options.m50685of("nm", "hd", "it");

    /* renamed from: a */
    public static ShapeGroup m67419a(JsonReader jsonReader, LottieComposition lottieComposition) {
        ArrayList arrayList = new ArrayList();
        String str = null;
        boolean z = false;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(f3726a);
            if (selectName != 0) {
                if (selectName != 1) {
                    if (selectName != 2) {
                        jsonReader.skipValue();
                    } else {
                        jsonReader.beginArray();
                        while (jsonReader.hasNext()) {
                            ContentModel m65547a = AbstractC1643Wx.m65547a(jsonReader, lottieComposition);
                            if (m65547a != null) {
                                arrayList.add(m65547a);
                            }
                        }
                        jsonReader.endArray();
                    }
                } else {
                    z = jsonReader.nextBoolean();
                }
            } else {
                str = jsonReader.nextString();
            }
        }
        return new ShapeGroup(str, arrayList, z);
    }
}
