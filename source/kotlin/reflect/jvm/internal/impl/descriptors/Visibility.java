package kotlin.reflect.jvm.internal.impl.descriptors;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes6.dex */
public abstract class Visibility {

    /* renamed from: a */
    public final String f68647a;

    /* renamed from: b */
    public final boolean f68648b;

    public Visibility(@NotNull String name, boolean z) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.f68647a = name;
        this.f68648b = z;
    }

    @Nullable
    public Integer compareTo(@NotNull Visibility visibility) {
        Intrinsics.checkNotNullParameter(visibility, "visibility");
        return Visibilities.INSTANCE.compareLocal$compiler_common(this, visibility);
    }

    @NotNull
    public String getInternalDisplayName() {
        return this.f68647a;
    }

    public final boolean isPublicAPI() {
        return this.f68648b;
    }

    @NotNull
    public Visibility normalize() {
        return this;
    }

    @NotNull
    public final String toString() {
        return getInternalDisplayName();
    }
}
