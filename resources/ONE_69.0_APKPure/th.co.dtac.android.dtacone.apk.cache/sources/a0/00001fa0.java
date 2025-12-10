package androidx.camera.core.impl;

import android.util.ArrayMap;
import android.util.Pair;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import java.util.Map;
import java.util.Set;

@RequiresApi(21)
/* loaded from: classes.dex */
public class TagBundle {

    /* renamed from: a */
    public static final TagBundle f11299a = new TagBundle(new ArrayMap());
    protected final Map<String, Object> mTagMap;

    public TagBundle(@NonNull Map<String, Object> map) {
        this.mTagMap = map;
    }

    @NonNull
    public static TagBundle create(@NonNull Pair<String, Object> pair) {
        ArrayMap arrayMap = new ArrayMap();
        arrayMap.put((String) pair.first, pair.second);
        return new TagBundle(arrayMap);
    }

    @NonNull
    public static TagBundle emptyBundle() {
        return f11299a;
    }

    @NonNull
    public static TagBundle from(@NonNull TagBundle tagBundle) {
        ArrayMap arrayMap = new ArrayMap();
        for (String str : tagBundle.listKeys()) {
            arrayMap.put(str, tagBundle.getTag(str));
        }
        return new TagBundle(arrayMap);
    }

    @Nullable
    public Object getTag(@NonNull String str) {
        return this.mTagMap.get(str);
    }

    @NonNull
    public Set<String> listKeys() {
        return this.mTagMap.keySet();
    }

    @NonNull
    public final String toString() {
        return "android.hardware.camera2.CaptureRequest.setTag.CX";
    }
}