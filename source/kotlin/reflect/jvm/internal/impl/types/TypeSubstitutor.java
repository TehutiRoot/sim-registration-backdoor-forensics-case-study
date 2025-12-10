package kotlin.reflect.jvm.internal.impl.types;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.builtins.StandardNames;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.CompositeAnnotations;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.FilteredAnnotations;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.resolve.calls.inference.CapturedTypeConstructorKt;
import kotlin.reflect.jvm.internal.impl.types.checker.NewCapturedTypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorType;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorUtils;
import kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;
import kotlin.reflect.jvm.internal.impl.types.typesApproximation.CapturedTypeApproximationKt;
import kotlin.reflect.jvm.internal.impl.utils.ExceptionUtilsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes6.dex */
public class TypeSubstitutor {
    public static final TypeSubstitutor EMPTY = create(TypeSubstitution.EMPTY);

    /* renamed from: a */
    public final TypeSubstitution f70293a;

    /* loaded from: classes6.dex */
    public static final class SubstitutionException extends Exception {
        public SubstitutionException(String str) {
            super(str);
        }
    }

    /* loaded from: classes6.dex */
    public enum VarianceConflictType {
        NO_CONFLICT,
        IN_IN_OUT_POSITION,
        OUT_IN_IN_POSITION
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor$a */
    /* loaded from: classes6.dex */
    public static class C11999a implements Function1 {
        /* renamed from: a */
        private static /* synthetic */ void m27531a(int i) {
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "name", "kotlin/reflect/jvm/internal/impl/types/TypeSubstitutor$1", "invoke"));
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: b */
        public Boolean invoke(FqName fqName) {
            if (fqName == null) {
                m27531a(0);
            }
            return Boolean.valueOf(!fqName.equals(StandardNames.FqNames.unsafeVariance));
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor$b */
    /* loaded from: classes6.dex */
    public static /* synthetic */ class C12000b {

        /* renamed from: a */
        public static final /* synthetic */ int[] f70294a;

        static {
            int[] iArr = new int[VarianceConflictType.values().length];
            f70294a = iArr;
            try {
                iArr[VarianceConflictType.OUT_IN_IN_POSITION.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f70294a[VarianceConflictType.IN_IN_OUT_POSITION.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f70294a[VarianceConflictType.NO_CONFLICT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public TypeSubstitutor(@NotNull TypeSubstitution typeSubstitution) {
        if (typeSubstitution == null) {
            m27540a(7);
        }
        this.f70293a = typeSubstitution;
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x003b A[FALL_THROUGH] */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x00fc A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0021 A[FALL_THROUGH] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static /* synthetic */ void m27540a(int r13) {
        /*
            Method dump skipped, instructions count: 660
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor.m27540a(int):void");
    }

    /* renamed from: b */
    public static void m27539b(int i, TypeProjection typeProjection, TypeSubstitution typeSubstitution) {
        if (i <= 100) {
            return;
        }
        throw new IllegalStateException("Recursion too deep. Most likely infinite loop while substituting " + m27535f(typeProjection) + "; substitution: " + m27535f(typeSubstitution));
    }

    /* renamed from: c */
    public static VarianceConflictType m27538c(Variance variance, Variance variance2) {
        Variance variance3 = Variance.IN_VARIANCE;
        if (variance == variance3 && variance2 == Variance.OUT_VARIANCE) {
            return VarianceConflictType.OUT_IN_IN_POSITION;
        }
        if (variance == Variance.OUT_VARIANCE && variance2 == variance3) {
            return VarianceConflictType.IN_IN_OUT_POSITION;
        }
        return VarianceConflictType.NO_CONFLICT;
    }

    @NotNull
    public static Variance combine(@NotNull Variance variance, @NotNull TypeProjection typeProjection) {
        if (variance == null) {
            m27540a(35);
        }
        if (typeProjection == null) {
            m27540a(36);
        }
        if (typeProjection.isStarProjection()) {
            Variance variance2 = Variance.OUT_VARIANCE;
            if (variance2 == null) {
                m27540a(37);
            }
            return variance2;
        }
        return combine(variance, typeProjection.getProjectionKind());
    }

    @NotNull
    public static TypeSubstitutor create(@NotNull TypeSubstitution typeSubstitution) {
        if (typeSubstitution == null) {
            m27540a(0);
        }
        return new TypeSubstitutor(typeSubstitution);
    }

    @NotNull
    public static TypeSubstitutor createChainedSubstitutor(@NotNull TypeSubstitution typeSubstitution, @NotNull TypeSubstitution typeSubstitution2) {
        if (typeSubstitution == null) {
            m27540a(3);
        }
        if (typeSubstitution2 == null) {
            m27540a(4);
        }
        return create(DisjointKeysUnionTypeSubstitution.create(typeSubstitution, typeSubstitution2));
    }

    /* renamed from: d */
    public static Annotations m27537d(Annotations annotations) {
        if (annotations == null) {
            m27540a(33);
        }
        if (!annotations.hasAnnotation(StandardNames.FqNames.unsafeVariance)) {
            return annotations;
        }
        return new FilteredAnnotations(annotations, new C11999a());
    }

    /* renamed from: e */
    public static TypeProjection m27536e(KotlinType kotlinType, TypeProjection typeProjection, TypeParameterDescriptor typeParameterDescriptor, TypeProjection typeProjection2) {
        if (kotlinType == null) {
            m27540a(26);
        }
        if (typeProjection == null) {
            m27540a(27);
        }
        if (typeProjection2 == null) {
            m27540a(28);
        }
        if (!kotlinType.getAnnotations().hasAnnotation(StandardNames.FqNames.unsafeVariance)) {
            if (typeProjection == null) {
                m27540a(29);
            }
            return typeProjection;
        }
        TypeConstructor constructor = typeProjection.getType().getConstructor();
        if (!(constructor instanceof NewCapturedTypeConstructor)) {
            return typeProjection;
        }
        TypeProjection projection = ((NewCapturedTypeConstructor) constructor).getProjection();
        Variance projectionKind = projection.getProjectionKind();
        VarianceConflictType m27538c = m27538c(typeProjection2.getProjectionKind(), projectionKind);
        VarianceConflictType varianceConflictType = VarianceConflictType.OUT_IN_IN_POSITION;
        if (m27538c == varianceConflictType) {
            return new TypeProjectionImpl(projection.getType());
        }
        if (typeParameterDescriptor == null) {
            return typeProjection;
        }
        if (m27538c(typeParameterDescriptor.getVariance(), projectionKind) == varianceConflictType) {
            return new TypeProjectionImpl(projection.getType());
        }
        return typeProjection;
    }

    /* renamed from: f */
    public static String m27535f(Object obj) {
        try {
            return obj.toString();
        } catch (Throwable th2) {
            if (!ExceptionUtilsKt.isProcessCanceledException(th2)) {
                return "[Exception while computing toString(): " + th2 + "]";
            }
            throw th2;
        }
    }

    /* renamed from: g */
    public final TypeProjection m27534g(TypeProjection typeProjection, int i) {
        KotlinType kotlinType;
        KotlinType type = typeProjection.getType();
        Variance projectionKind = typeProjection.getProjectionKind();
        if (type.getConstructor().getDeclarationDescriptor() instanceof TypeParameterDescriptor) {
            return typeProjection;
        }
        SimpleType abbreviation = SpecialTypesKt.getAbbreviation(type);
        if (abbreviation != null) {
            kotlinType = replaceWithNonApproximatingSubstitution().substitute(abbreviation, Variance.INVARIANT);
        } else {
            kotlinType = null;
        }
        KotlinType replace = TypeSubstitutionKt.replace(type, m27533h(type.getConstructor().getParameters(), type.getArguments(), i), this.f70293a.filterAnnotations(type.getAnnotations()));
        if ((replace instanceof SimpleType) && (kotlinType instanceof SimpleType)) {
            replace = SpecialTypesKt.withAbbreviation((SimpleType) replace, (SimpleType) kotlinType);
        }
        return new TypeProjectionImpl(projectionKind, replace);
    }

    @NotNull
    public TypeSubstitution getSubstitution() {
        TypeSubstitution typeSubstitution = this.f70293a;
        if (typeSubstitution == null) {
            m27540a(8);
        }
        return typeSubstitution;
    }

    /* renamed from: h */
    public final List m27533h(List list, List list2, int i) {
        ArrayList arrayList = new ArrayList(list.size());
        boolean z = false;
        for (int i2 = 0; i2 < list.size(); i2++) {
            TypeParameterDescriptor typeParameterDescriptor = (TypeParameterDescriptor) list.get(i2);
            TypeProjection typeProjection = (TypeProjection) list2.get(i2);
            TypeProjection m27532i = m27532i(typeProjection, typeParameterDescriptor, i + 1);
            int i3 = C12000b.f70294a[m27538c(typeParameterDescriptor.getVariance(), m27532i.getProjectionKind()).ordinal()];
            if (i3 != 1 && i3 != 2) {
                if (i3 == 3) {
                    Variance variance = typeParameterDescriptor.getVariance();
                    Variance variance2 = Variance.INVARIANT;
                    if (variance != variance2 && !m27532i.isStarProjection()) {
                        m27532i = new TypeProjectionImpl(variance2, m27532i.getType());
                    }
                }
            } else {
                m27532i = TypeUtils.makeStarProjection(typeParameterDescriptor);
            }
            if (m27532i != typeProjection) {
                z = true;
            }
            arrayList.add(m27532i);
        }
        if (!z) {
            return list2;
        }
        return arrayList;
    }

    /* renamed from: i */
    public final TypeProjection m27532i(TypeProjection typeProjection, TypeParameterDescriptor typeParameterDescriptor, int i) {
        TypeProjection typeProjection2;
        KotlinType makeNullableIfNeeded;
        if (typeProjection == null) {
            m27540a(18);
        }
        m27539b(i, typeProjection, this.f70293a);
        if (typeProjection.isStarProjection()) {
            return typeProjection;
        }
        KotlinType type = typeProjection.getType();
        if (type instanceof TypeWithEnhancement) {
            TypeWithEnhancement typeWithEnhancement = (TypeWithEnhancement) type;
            UnwrappedType origin = typeWithEnhancement.getOrigin();
            KotlinType enhancement = typeWithEnhancement.getEnhancement();
            TypeProjection m27532i = m27532i(new TypeProjectionImpl(typeProjection.getProjectionKind(), origin), typeParameterDescriptor, i + 1);
            if (m27532i.isStarProjection()) {
                return m27532i;
            }
            return new TypeProjectionImpl(m27532i.getProjectionKind(), TypeWithEnhancementKt.wrapEnhancement(m27532i.getType().unwrap(), substitute(enhancement, typeProjection.getProjectionKind())));
        }
        if (!DynamicTypesKt.isDynamic(type) && !(type.unwrap() instanceof RawType)) {
            TypeProjection typeProjection3 = this.f70293a.get(type);
            if (typeProjection3 != null) {
                typeProjection2 = m27536e(type, typeProjection3, typeParameterDescriptor, typeProjection);
            } else {
                typeProjection2 = null;
            }
            Variance projectionKind = typeProjection.getProjectionKind();
            if (typeProjection2 == null && FlexibleTypesKt.isFlexible(type) && !TypeCapabilitiesKt.isCustomTypeParameter(type)) {
                FlexibleType asFlexibleType = FlexibleTypesKt.asFlexibleType(type);
                int i2 = i + 1;
                TypeProjection m27532i2 = m27532i(new TypeProjectionImpl(projectionKind, asFlexibleType.getLowerBound()), typeParameterDescriptor, i2);
                TypeProjection m27532i3 = m27532i(new TypeProjectionImpl(projectionKind, asFlexibleType.getUpperBound()), typeParameterDescriptor, i2);
                Variance projectionKind2 = m27532i2.getProjectionKind();
                if (m27532i2.getType() == asFlexibleType.getLowerBound() && m27532i3.getType() == asFlexibleType.getUpperBound()) {
                    return typeProjection;
                }
                return new TypeProjectionImpl(projectionKind2, KotlinTypeFactory.flexibleType(TypeSubstitutionKt.asSimpleType(m27532i2.getType()), TypeSubstitutionKt.asSimpleType(m27532i3.getType())));
            } else if (!KotlinBuiltIns.isNothing(type) && !KotlinTypeKt.isError(type)) {
                if (typeProjection2 != null) {
                    VarianceConflictType m27538c = m27538c(projectionKind, typeProjection2.getProjectionKind());
                    if (!CapturedTypeConstructorKt.isCaptured(type)) {
                        int i3 = C12000b.f70294a[m27538c.ordinal()];
                        if (i3 != 1) {
                            if (i3 == 2) {
                                return new TypeProjectionImpl(Variance.OUT_VARIANCE, type.getConstructor().getBuiltIns().getNullableAnyType());
                            }
                        } else {
                            throw new SubstitutionException("Out-projection in in-position");
                        }
                    }
                    CustomTypeParameter customTypeParameter = TypeCapabilitiesKt.getCustomTypeParameter(type);
                    if (typeProjection2.isStarProjection()) {
                        return typeProjection2;
                    }
                    if (customTypeParameter != null) {
                        makeNullableIfNeeded = customTypeParameter.substitutionResult(typeProjection2.getType());
                    } else {
                        makeNullableIfNeeded = TypeUtils.makeNullableIfNeeded(typeProjection2.getType(), type.isMarkedNullable());
                    }
                    if (!type.getAnnotations().isEmpty()) {
                        makeNullableIfNeeded = TypeUtilsKt.replaceAnnotations(makeNullableIfNeeded, new CompositeAnnotations(makeNullableIfNeeded.getAnnotations(), m27537d(this.f70293a.filterAnnotations(type.getAnnotations()))));
                    }
                    if (m27538c == VarianceConflictType.NO_CONFLICT) {
                        projectionKind = combine(projectionKind, typeProjection2.getProjectionKind());
                    }
                    return new TypeProjectionImpl(projectionKind, makeNullableIfNeeded);
                }
                typeProjection = m27534g(typeProjection, i);
                if (typeProjection == null) {
                    m27540a(25);
                }
            }
        }
        return typeProjection;
    }

    public boolean isEmpty() {
        return this.f70293a.isEmpty();
    }

    @NotNull
    public TypeSubstitutor replaceWithNonApproximatingSubstitution() {
        TypeSubstitution typeSubstitution = this.f70293a;
        if ((typeSubstitution instanceof IndexedParametersSubstitution) && typeSubstitution.approximateContravariantCapturedTypes()) {
            return new TypeSubstitutor(new IndexedParametersSubstitution(((IndexedParametersSubstitution) this.f70293a).getParameters(), ((IndexedParametersSubstitution) this.f70293a).getArguments(), false));
        }
        return this;
    }

    @NotNull
    public KotlinType safeSubstitute(@NotNull KotlinType kotlinType, @NotNull Variance variance) {
        if (kotlinType == null) {
            m27540a(9);
        }
        if (variance == null) {
            m27540a(10);
        }
        if (isEmpty()) {
            if (kotlinType == null) {
                m27540a(11);
            }
            return kotlinType;
        }
        try {
            KotlinType type = m27532i(new TypeProjectionImpl(variance, kotlinType), null, 0).getType();
            if (type == null) {
                m27540a(12);
            }
            return type;
        } catch (SubstitutionException e) {
            ErrorType createErrorType = ErrorUtils.createErrorType(ErrorTypeKind.UNABLE_TO_SUBSTITUTE_TYPE, e.getMessage());
            if (createErrorType == null) {
                m27540a(13);
            }
            return createErrorType;
        }
    }

    @Nullable
    public KotlinType substitute(@NotNull KotlinType kotlinType, @NotNull Variance variance) {
        if (kotlinType == null) {
            m27540a(14);
        }
        if (variance == null) {
            m27540a(15);
        }
        TypeProjection substitute = substitute(new TypeProjectionImpl(variance, getSubstitution().prepareTopLevelType(kotlinType, variance)));
        if (substitute == null) {
            return null;
        }
        return substitute.getType();
    }

    @Nullable
    public TypeProjection substituteWithoutApproximation(@NotNull TypeProjection typeProjection) {
        if (typeProjection == null) {
            m27540a(17);
        }
        if (isEmpty()) {
            return typeProjection;
        }
        try {
            return m27532i(typeProjection, null, 0);
        } catch (SubstitutionException unused) {
            return null;
        }
    }

    @NotNull
    public static TypeSubstitutor create(@NotNull KotlinType kotlinType) {
        if (kotlinType == null) {
            m27540a(6);
        }
        return create(TypeConstructorSubstitution.create(kotlinType.getConstructor(), kotlinType.getArguments()));
    }

    @NotNull
    public static Variance combine(@NotNull Variance variance, @NotNull Variance variance2) {
        if (variance == null) {
            m27540a(38);
        }
        if (variance2 == null) {
            m27540a(39);
        }
        Variance variance3 = Variance.INVARIANT;
        if (variance == variance3) {
            if (variance2 == null) {
                m27540a(40);
            }
            return variance2;
        } else if (variance2 == variance3) {
            if (variance == null) {
                m27540a(41);
            }
            return variance;
        } else if (variance == variance2) {
            if (variance2 == null) {
                m27540a(42);
            }
            return variance2;
        } else {
            throw new AssertionError("Variance conflict: type parameter variance '" + variance + "' and projection kind '" + variance2 + "' cannot be combined");
        }
    }

    @Nullable
    public TypeProjection substitute(@NotNull TypeProjection typeProjection) {
        if (typeProjection == null) {
            m27540a(16);
        }
        TypeProjection substituteWithoutApproximation = substituteWithoutApproximation(typeProjection);
        return (this.f70293a.approximateCapturedTypes() || this.f70293a.approximateContravariantCapturedTypes()) ? CapturedTypeApproximationKt.approximateCapturedTypesIfNecessary(substituteWithoutApproximation, this.f70293a.approximateContravariantCapturedTypes()) : substituteWithoutApproximation;
    }
}
