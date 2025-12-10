package kotlin.reflect.jvm.internal.impl.load.kotlin;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.name.Name;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes6.dex */
public class JvmDescriptorTypeWriter<T> {

    /* renamed from: a */
    public final JvmTypeFactory f69292a;

    /* renamed from: b */
    public int f69293b;

    /* renamed from: c */
    public Object f69294c;

    public void writeArrayEnd() {
    }

    public void writeArrayType() {
        if (this.f69294c == null) {
            this.f69293b++;
        }
    }

    public void writeClass(@NotNull T objectType) {
        Intrinsics.checkNotNullParameter(objectType, "objectType");
        writeJvmTypeAsIs(objectType);
    }

    public final void writeJvmTypeAsIs(@NotNull T type) {
        Intrinsics.checkNotNullParameter(type, "type");
        if (this.f69294c == null) {
            if (this.f69293b > 0) {
                JvmTypeFactory jvmTypeFactory = this.f69292a;
                type = (T) jvmTypeFactory.createFromString(AbstractC20204hN1.repeat("[", this.f69293b) + this.f69292a.toString(type));
            }
            this.f69294c = type;
        }
    }

    public void writeTypeVariable(@NotNull Name name, @NotNull T type) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(type, "type");
        writeJvmTypeAsIs(type);
    }
}
