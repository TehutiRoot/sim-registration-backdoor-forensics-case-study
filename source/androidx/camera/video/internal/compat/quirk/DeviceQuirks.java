package androidx.camera.video.internal.compat.quirk;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.camera.core.impl.Quirk;
import androidx.camera.core.impl.Quirks;
import java.util.List;

@RequiresApi(21)
/* loaded from: classes.dex */
public class DeviceQuirks {

    /* renamed from: a */
    public static final Quirks f11949a = new Quirks(DeviceQuirksLoader.m62114a());

    @Nullable
    public static <T extends Quirk> T get(@NonNull Class<T> cls) {
        return (T) f11949a.get(cls);
    }

    @NonNull
    public static Quirks getAll() {
        return f11949a;
    }

    @NonNull
    public static <T extends Quirk> List<T> getAll(@NonNull Class<T> cls) {
        return f11949a.getAll(cls);
    }
}
