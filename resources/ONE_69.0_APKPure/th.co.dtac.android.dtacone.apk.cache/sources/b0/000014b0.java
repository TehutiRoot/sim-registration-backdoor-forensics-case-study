package p000;

import com.airbnb.lottie.LottieComposition;
import com.airbnb.lottie.animation.keyframe.PathKeyframe;
import com.airbnb.lottie.parser.moshi.JsonReader;
import com.airbnb.lottie.value.Keyframe;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import java.util.ArrayList;
import java.util.List;

/* renamed from: Vh0  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC18670Vh0 {

    /* renamed from: a */
    public static JsonReader.Options f7055a = JsonReader.Options.m50682of(OperatorName.NON_STROKING_CMYK);

    /* renamed from: a */
    public static List m65875a(JsonReader jsonReader, LottieComposition lottieComposition, float f, K12 k12, boolean z) {
        ArrayList arrayList = new ArrayList();
        if (jsonReader.peek() == JsonReader.Token.STRING) {
            lottieComposition.addWarning("Lottie doesn't support expressions.");
            return arrayList;
        }
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            if (jsonReader.selectName(f7055a) != 0) {
                jsonReader.skipValue();
            } else if (jsonReader.peek() == JsonReader.Token.BEGIN_ARRAY) {
                jsonReader.beginArray();
                if (jsonReader.peek() == JsonReader.Token.NUMBER) {
                    arrayList.add(AbstractC18605Uh0.m66111c(jsonReader, lottieComposition, f, k12, false, z));
                } else {
                    while (jsonReader.hasNext()) {
                        arrayList.add(AbstractC18605Uh0.m66111c(jsonReader, lottieComposition, f, k12, true, z));
                    }
                }
                jsonReader.endArray();
            } else {
                arrayList.add(AbstractC18605Uh0.m66111c(jsonReader, lottieComposition, f, k12, false, z));
            }
        }
        jsonReader.endObject();
        m65874b(arrayList);
        return arrayList;
    }

    /* renamed from: b */
    public static void m65874b(List list) {
        int i;
        T t;
        int size = list.size();
        int i2 = 0;
        while (true) {
            i = size - 1;
            if (i2 >= i) {
                break;
            }
            Keyframe keyframe = (Keyframe) list.get(i2);
            i2++;
            Keyframe keyframe2 = (Keyframe) list.get(i2);
            keyframe.endFrame = Float.valueOf(keyframe2.startFrame);
            if (keyframe.endValue == null && (t = keyframe2.startValue) != 0) {
                keyframe.endValue = t;
                if (keyframe instanceof PathKeyframe) {
                    ((PathKeyframe) keyframe).createPath();
                }
            }
        }
        Keyframe keyframe3 = (Keyframe) list.get(i);
        if ((keyframe3.startValue == null || keyframe3.endValue == null) && list.size() > 1) {
            list.remove(keyframe3);
        }
    }
}