package kotlin.reflect.jvm.internal.impl.descriptors;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.types.TypeProjection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes6.dex */
public final class PossiblyInnerType {

    /* renamed from: a */
    public final ClassifierDescriptorWithTypeParameters f68637a;

    /* renamed from: b */
    public final List f68638b;

    /* renamed from: c */
    public final PossiblyInnerType f68639c;

    public PossiblyInnerType(@NotNull ClassifierDescriptorWithTypeParameters classifierDescriptor, @NotNull List<? extends TypeProjection> arguments, @Nullable PossiblyInnerType possiblyInnerType) {
        Intrinsics.checkNotNullParameter(classifierDescriptor, "classifierDescriptor");
        Intrinsics.checkNotNullParameter(arguments, "arguments");
        this.f68637a = classifierDescriptor;
        this.f68638b = arguments;
        this.f68639c = possiblyInnerType;
    }

    @NotNull
    public final List<TypeProjection> getArguments() {
        return this.f68638b;
    }

    @NotNull
    public final ClassifierDescriptorWithTypeParameters getClassifierDescriptor() {
        return this.f68637a;
    }

    @Nullable
    public final PossiblyInnerType getOuterType() {
        return this.f68639c;
    }
}
