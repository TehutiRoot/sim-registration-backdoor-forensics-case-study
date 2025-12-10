package p000;

import com.airbnb.lottie.LottieComposition;
import com.airbnb.lottie.animation.keyframe.PathKeyframe;
import com.airbnb.lottie.parser.PathParser;
import com.airbnb.lottie.parser.moshi.JsonReader;
import com.airbnb.lottie.utils.Utils;

/* renamed from: Th1  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC18499Th1 {
    /* renamed from: a */
    public static PathKeyframe m66183a(JsonReader jsonReader, LottieComposition lottieComposition) {
        boolean z;
        if (jsonReader.peek() == JsonReader.Token.BEGIN_OBJECT) {
            z = true;
        } else {
            z = false;
        }
        return new PathKeyframe(lottieComposition, AbstractC18178Oh0.m66999c(jsonReader, lottieComposition, Utils.dpScale(), PathParser.INSTANCE, z, false));
    }
}
