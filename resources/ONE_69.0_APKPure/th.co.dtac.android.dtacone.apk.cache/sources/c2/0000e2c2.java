package kotlin.reflect.jvm.internal.impl.types.checker;

import org.jetbrains.annotations.NotNull;

/* loaded from: classes6.dex */
public abstract class TypeRefinementSupport {

    /* renamed from: a */
    public final boolean f70355a;

    /* loaded from: classes6.dex */
    public static final class Enabled extends TypeRefinementSupport {

        /* renamed from: b */
        public final KotlinTypeRefiner f70356b;

        @NotNull
        public final KotlinTypeRefiner getTypeRefiner() {
            return this.f70356b;
        }
    }

    public final boolean isEnabled() {
        return this.f70355a;
    }
}