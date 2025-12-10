package androidx.camera.camera2.internal.compat.quirk;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.camera.core.impl.Quirk;
import androidx.camera.core.impl.Quirks;

@RequiresApi(21)
/* loaded from: classes.dex */
public class DeviceQuirks {

    /* renamed from: a */
    public static final Quirks f10525a = new Quirks(DeviceQuirksLoader.m63634a());

    @Nullable
    public static <T extends Quirk> T get(@NonNull Class<T> cls) {
        return (T) f10525a.get(cls);
    }

    @NonNull
    public static Quirks getAll() {
        return f10525a;
    }
}
