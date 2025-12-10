package kotlin.reflect.jvm.internal.impl.types;

import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@SourceDebugExtension({"SMAP\nErasureTypeAttributes.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ErasureTypeAttributes.kt\norg/jetbrains/kotlin/types/ErasureTypeAttributes\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,35:1\n1#2:36\n*E\n"})
/* loaded from: classes6.dex */
public class ErasureTypeAttributes {

    /* renamed from: a */
    public final TypeUsage f70230a;

    /* renamed from: b */
    public final Set f70231b;

    /* renamed from: c */
    public final SimpleType f70232c;

    public ErasureTypeAttributes(@NotNull TypeUsage howThisTypeIsUsed, @Nullable Set<? extends TypeParameterDescriptor> set, @Nullable SimpleType simpleType) {
        Intrinsics.checkNotNullParameter(howThisTypeIsUsed, "howThisTypeIsUsed");
        this.f70230a = howThisTypeIsUsed;
        this.f70231b = set;
        this.f70232c = simpleType;
    }

    public boolean equals(@Nullable Object obj) {
        if (!(obj instanceof ErasureTypeAttributes)) {
            return false;
        }
        ErasureTypeAttributes erasureTypeAttributes = (ErasureTypeAttributes) obj;
        if (!Intrinsics.areEqual(erasureTypeAttributes.getDefaultType(), getDefaultType()) || erasureTypeAttributes.getHowThisTypeIsUsed() != getHowThisTypeIsUsed()) {
            return false;
        }
        return true;
    }

    @Nullable
    public SimpleType getDefaultType() {
        return this.f70232c;
    }

    @NotNull
    public TypeUsage getHowThisTypeIsUsed() {
        return this.f70230a;
    }

    @Nullable
    public Set<TypeParameterDescriptor> getVisitedTypeParameters() {
        return this.f70231b;
    }

    public int hashCode() {
        int i;
        SimpleType defaultType = getDefaultType();
        if (defaultType != null) {
            i = defaultType.hashCode();
        } else {
            i = 0;
        }
        return i + (i * 31) + getHowThisTypeIsUsed().hashCode();
    }

    @NotNull
    public ErasureTypeAttributes withNewVisitedTypeParameter(@NotNull TypeParameterDescriptor typeParameter) {
        Set of;
        Intrinsics.checkNotNullParameter(typeParameter, "typeParameter");
        TypeUsage howThisTypeIsUsed = getHowThisTypeIsUsed();
        Set<TypeParameterDescriptor> visitedTypeParameters = getVisitedTypeParameters();
        if (visitedTypeParameters == null || (of = EG1.plus(visitedTypeParameters, typeParameter)) == null) {
            of = CG1.setOf(typeParameter);
        }
        return new ErasureTypeAttributes(howThisTypeIsUsed, of, getDefaultType());
    }
}
