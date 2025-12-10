package kotlin.reflect.jvm.internal.impl.load.java.lazy;

import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.JavaTypeQualifiersByElementType;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.types.JavaTypeResolver;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes6.dex */
public final class LazyJavaResolverContext {

    /* renamed from: a */
    public final JavaResolverComponents f69087a;

    /* renamed from: b */
    public final TypeParameterResolver f69088b;

    /* renamed from: c */
    public final Lazy f69089c;

    /* renamed from: d */
    public final Lazy f69090d;

    /* renamed from: e */
    public final JavaTypeResolver f69091e;

    public LazyJavaResolverContext(@NotNull JavaResolverComponents components, @NotNull TypeParameterResolver typeParameterResolver, @NotNull Lazy<JavaTypeQualifiersByElementType> delegateForDefaultTypeQualifiers) {
        Intrinsics.checkNotNullParameter(components, "components");
        Intrinsics.checkNotNullParameter(typeParameterResolver, "typeParameterResolver");
        Intrinsics.checkNotNullParameter(delegateForDefaultTypeQualifiers, "delegateForDefaultTypeQualifiers");
        this.f69087a = components;
        this.f69088b = typeParameterResolver;
        this.f69089c = delegateForDefaultTypeQualifiers;
        this.f69090d = delegateForDefaultTypeQualifiers;
        this.f69091e = new JavaTypeResolver(this, typeParameterResolver);
    }

    @NotNull
    public final JavaResolverComponents getComponents() {
        return this.f69087a;
    }

    @Nullable
    public final JavaTypeQualifiersByElementType getDefaultTypeQualifiers() {
        return (JavaTypeQualifiersByElementType) this.f69090d.getValue();
    }

    @NotNull
    public final Lazy<JavaTypeQualifiersByElementType> getDelegateForDefaultTypeQualifiers$descriptors_jvm() {
        return this.f69089c;
    }

    @NotNull
    public final ModuleDescriptor getModule() {
        return this.f69087a.getModule();
    }

    @NotNull
    public final StorageManager getStorageManager() {
        return this.f69087a.getStorageManager();
    }

    @NotNull
    public final TypeParameterResolver getTypeParameterResolver() {
        return this.f69088b;
    }

    @NotNull
    public final JavaTypeResolver getTypeResolver() {
        return this.f69091e;
    }
}
