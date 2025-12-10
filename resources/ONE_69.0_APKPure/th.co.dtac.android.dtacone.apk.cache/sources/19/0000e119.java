package kotlin.reflect.jvm.internal.impl.resolve.constants;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes6.dex */
public abstract class ConstantValue<T> {

    /* renamed from: a */
    public final Object f69937a;

    public ConstantValue(T t) {
        this.f69937a = t;
    }

    public boolean equals(@Nullable Object obj) {
        ConstantValue constantValue;
        if (this != obj) {
            T value = getValue();
            Object obj2 = null;
            if (obj instanceof ConstantValue) {
                constantValue = (ConstantValue) obj;
            } else {
                constantValue = null;
            }
            if (constantValue != null) {
                obj2 = constantValue.getValue();
            }
            if (!Intrinsics.areEqual(value, obj2)) {
                return false;
            }
        }
        return true;
    }

    @NotNull
    public abstract KotlinType getType(@NotNull ModuleDescriptor moduleDescriptor);

    public T getValue() {
        return (T) this.f69937a;
    }

    public int hashCode() {
        T value = getValue();
        if (value != null) {
            return value.hashCode();
        }
        return 0;
    }

    @NotNull
    public String toString() {
        return String.valueOf(getValue());
    }
}