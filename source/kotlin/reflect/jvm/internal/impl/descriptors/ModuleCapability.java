package kotlin.reflect.jvm.internal.impl.descriptors;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes6.dex */
public final class ModuleCapability<T> {

    /* renamed from: a */
    public final String f68624a;

    public ModuleCapability(@NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.f68624a = name;
    }

    @NotNull
    public String toString() {
        return this.f68624a;
    }
}
