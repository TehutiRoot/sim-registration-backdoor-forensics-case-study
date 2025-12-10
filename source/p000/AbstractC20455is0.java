package p000;

import com.airbnb.lottie.model.content.MergePaths;
import com.airbnb.lottie.parser.moshi.JsonReader;

/* renamed from: is0  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC20455is0 {

    /* renamed from: a */
    public static final JsonReader.Options f67074a = JsonReader.Options.m50685of("nm", "mm", "hd");

    /* renamed from: a */
    public static MergePaths m29305a(JsonReader jsonReader) {
        String str = null;
        MergePaths.MergePathsMode mergePathsMode = null;
        boolean z = false;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(f67074a);
            if (selectName != 0) {
                if (selectName != 1) {
                    if (selectName != 2) {
                        jsonReader.skipName();
                        jsonReader.skipValue();
                    } else {
                        z = jsonReader.nextBoolean();
                    }
                } else {
                    mergePathsMode = MergePaths.MergePathsMode.forId(jsonReader.nextInt());
                }
            } else {
                str = jsonReader.nextString();
            }
        }
        return new MergePaths(str, mergePathsMode, z);
    }
}
