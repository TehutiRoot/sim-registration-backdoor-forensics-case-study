package p000;

import com.airbnb.lottie.model.content.MergePaths;
import com.airbnb.lottie.parser.moshi.JsonReader;

/* renamed from: os0  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC21548os0 {

    /* renamed from: a */
    public static final JsonReader.Options f76497a = JsonReader.Options.m50682of("nm", "mm", "hd");

    /* renamed from: a */
    public static MergePaths m23939a(JsonReader jsonReader) {
        String str = null;
        MergePaths.MergePathsMode mergePathsMode = null;
        boolean z = false;
        while (jsonReader.hasNext()) {
            int selectName = jsonReader.selectName(f76497a);
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