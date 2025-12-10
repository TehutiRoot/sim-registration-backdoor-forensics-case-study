package kotlin.reflect.jvm.internal.impl.types;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeAliasDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.types.TypeAliasExpansionReportStrategy;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorUtils;
import kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;
import org.jetbrains.annotations.NotNull;

@SourceDebugExtension({"SMAP\nTypeAliasExpander.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TypeAliasExpander.kt\norg/jetbrains/kotlin/types/TypeAliasExpander\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,278:1\n1#2:279\n1620#3,3:280\n1559#3:283\n1590#3,4:284\n1559#3:288\n1590#3,4:289\n1864#3,3:293\n*S KotlinDebug\n*F\n+ 1 TypeAliasExpander.kt\norg/jetbrains/kotlin/types/TypeAliasExpander\n*L\n148#1:280,3\n197#1:283\n197#1:284,4\n232#1:288\n232#1:289,4\n249#1:293,3\n*E\n"})
/* loaded from: classes6.dex */
public final class TypeAliasExpander {
    @NotNull
    public static final Companion Companion = new Companion(null);

    /* renamed from: c */
    public static final TypeAliasExpander f70260c = new TypeAliasExpander(TypeAliasExpansionReportStrategy.DO_NOTHING.INSTANCE, false);

    /* renamed from: a */
    public final TypeAliasExpansionReportStrategy f70261a;

    /* renamed from: b */
    public final boolean f70262b;

    /* loaded from: classes6.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final void m27548a(int i, TypeAliasDescriptor typeAliasDescriptor) {
            if (i <= 100) {
                return;
            }
            throw new AssertionError("Too deep recursion while expanding type alias " + typeAliasDescriptor.getName());
        }

        public Companion() {
        }
    }

    public TypeAliasExpander(@NotNull TypeAliasExpansionReportStrategy reportStrategy, boolean z) {
        Intrinsics.checkNotNullParameter(reportStrategy, "reportStrategy");
        this.f70261a = reportStrategy;
        this.f70262b = z;
    }

    /* renamed from: a */
    public final void m27560a(Annotations annotations, Annotations annotations2) {
        HashSet hashSet = new HashSet();
        Iterator<AnnotationDescriptor> it = annotations.iterator();
        while (it.hasNext()) {
            hashSet.add(it.next().getFqName());
        }
        for (AnnotationDescriptor annotationDescriptor : annotations2) {
            if (hashSet.contains(annotationDescriptor.getFqName())) {
                this.f70261a.repeatedAnnotation(annotationDescriptor);
            }
        }
    }

    /* renamed from: b */
    public final void m27559b(KotlinType kotlinType, KotlinType kotlinType2) {
        TypeSubstitutor create = TypeSubstitutor.create(kotlinType2);
        Intrinsics.checkNotNullExpressionValue(create, "create(substitutedType)");
        int i = 0;
        for (Object obj : kotlinType2.getArguments()) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            TypeProjection typeProjection = (TypeProjection) obj;
            if (!typeProjection.isStarProjection()) {
                KotlinType type = typeProjection.getType();
                Intrinsics.checkNotNullExpressionValue(type, "substitutedArgument.type");
                if (!TypeUtilsKt.containsTypeAliasParameters(type)) {
                    TypeProjection typeProjection2 = kotlinType.getArguments().get(i);
                    TypeParameterDescriptor typeParameter = kotlinType.getConstructor().getParameters().get(i);
                    if (this.f70262b) {
                        TypeAliasExpansionReportStrategy typeAliasExpansionReportStrategy = this.f70261a;
                        KotlinType type2 = typeProjection2.getType();
                        Intrinsics.checkNotNullExpressionValue(type2, "unsubstitutedArgument.type");
                        KotlinType type3 = typeProjection.getType();
                        Intrinsics.checkNotNullExpressionValue(type3, "substitutedArgument.type");
                        Intrinsics.checkNotNullExpressionValue(typeParameter, "typeParameter");
                        typeAliasExpansionReportStrategy.boundsViolationInSubstitution(create, type2, type3, typeParameter);
                    }
                }
            }
            i = i2;
        }
    }

    /* renamed from: c */
    public final DynamicType m27558c(DynamicType dynamicType, TypeAttributes typeAttributes) {
        return dynamicType.replaceAttributes(m27553h(dynamicType, typeAttributes));
    }

    /* renamed from: d */
    public final SimpleType m27557d(SimpleType simpleType, TypeAttributes typeAttributes) {
        if (!KotlinTypeKt.isError(simpleType)) {
            return TypeSubstitutionKt.replace$default(simpleType, null, m27553h(simpleType, typeAttributes), 1, null);
        }
        return simpleType;
    }

    /* renamed from: e */
    public final SimpleType m27556e(SimpleType simpleType, KotlinType kotlinType) {
        SimpleType makeNullableIfNeeded = TypeUtils.makeNullableIfNeeded(simpleType, kotlinType.isMarkedNullable());
        Intrinsics.checkNotNullExpressionValue(makeNullableIfNeeded, "makeNullableIfNeeded(thi…romType.isMarkedNullable)");
        return makeNullableIfNeeded;
    }

    @NotNull
    public final SimpleType expand(@NotNull TypeAliasExpansion typeAliasExpansion, @NotNull TypeAttributes attributes) {
        Intrinsics.checkNotNullParameter(typeAliasExpansion, "typeAliasExpansion");
        Intrinsics.checkNotNullParameter(attributes, "attributes");
        return m27551j(typeAliasExpansion, attributes, false, 0, true);
    }

    /* renamed from: f */
    public final SimpleType m27555f(SimpleType simpleType, KotlinType kotlinType) {
        return m27557d(m27556e(simpleType, kotlinType), kotlinType.getAttributes());
    }

    /* renamed from: g */
    public final SimpleType m27554g(TypeAliasExpansion typeAliasExpansion, TypeAttributes typeAttributes, boolean z) {
        TypeConstructor typeConstructor = typeAliasExpansion.getDescriptor().getTypeConstructor();
        Intrinsics.checkNotNullExpressionValue(typeConstructor, "descriptor.typeConstructor");
        return KotlinTypeFactory.simpleTypeWithNonTrivialMemberScope(typeAttributes, typeConstructor, typeAliasExpansion.getArguments(), z, MemberScope.Empty.INSTANCE);
    }

    /* renamed from: h */
    public final TypeAttributes m27553h(KotlinType kotlinType, TypeAttributes typeAttributes) {
        if (KotlinTypeKt.isError(kotlinType)) {
            return kotlinType.getAttributes();
        }
        return typeAttributes.add(kotlinType.getAttributes());
    }

    /* renamed from: i */
    public final TypeProjection m27552i(TypeProjection typeProjection, TypeAliasExpansion typeAliasExpansion, int i) {
        UnwrappedType unwrap = typeProjection.getType().unwrap();
        if (DynamicTypesKt.isDynamic(unwrap)) {
            return typeProjection;
        }
        SimpleType asSimpleType = TypeSubstitutionKt.asSimpleType(unwrap);
        if (!KotlinTypeKt.isError(asSimpleType) && TypeUtilsKt.requiresTypeAliasExpansion(asSimpleType)) {
            TypeConstructor constructor = asSimpleType.getConstructor();
            ClassifierDescriptor declarationDescriptor = constructor.getDeclarationDescriptor();
            constructor.getParameters().size();
            asSimpleType.getArguments().size();
            if (!(declarationDescriptor instanceof TypeParameterDescriptor)) {
                if (declarationDescriptor instanceof TypeAliasDescriptor) {
                    TypeAliasDescriptor typeAliasDescriptor = (TypeAliasDescriptor) declarationDescriptor;
                    if (typeAliasExpansion.isRecursion(typeAliasDescriptor)) {
                        this.f70261a.recursiveTypeAlias(typeAliasDescriptor);
                        Variance variance = Variance.INVARIANT;
                        ErrorTypeKind errorTypeKind = ErrorTypeKind.RECURSIVE_TYPE_ALIAS;
                        String name = typeAliasDescriptor.getName().toString();
                        Intrinsics.checkNotNullExpressionValue(name, "typeDescriptor.name.toString()");
                        return new TypeProjectionImpl(variance, ErrorUtils.createErrorType(errorTypeKind, name));
                    }
                    List<TypeProjection> arguments = asSimpleType.getArguments();
                    ArrayList arrayList = new ArrayList(AbstractC10176es.collectionSizeOrDefault(arguments, 10));
                    int i2 = 0;
                    for (Object obj : arguments) {
                        int i3 = i2 + 1;
                        if (i2 < 0) {
                            CollectionsKt__CollectionsKt.throwIndexOverflow();
                        }
                        arrayList.add(m27550k((TypeProjection) obj, typeAliasExpansion, constructor.getParameters().get(i2), i + 1));
                        i2 = i3;
                    }
                    SimpleType m27551j = m27551j(TypeAliasExpansion.Companion.create(typeAliasExpansion, typeAliasDescriptor, arrayList), asSimpleType.getAttributes(), asSimpleType.isMarkedNullable(), i + 1, false);
                    SimpleType m27549l = m27549l(asSimpleType, typeAliasExpansion, i);
                    if (!DynamicTypesKt.isDynamic(m27551j)) {
                        m27551j = SpecialTypesKt.withAbbreviation(m27551j, m27549l);
                    }
                    return new TypeProjectionImpl(typeProjection.getProjectionKind(), m27551j);
                }
                SimpleType m27549l2 = m27549l(asSimpleType, typeAliasExpansion, i);
                m27559b(asSimpleType, m27549l2);
                return new TypeProjectionImpl(typeProjection.getProjectionKind(), m27549l2);
            }
            return typeProjection;
        }
        return typeProjection;
    }

    /* renamed from: j */
    public final SimpleType m27551j(TypeAliasExpansion typeAliasExpansion, TypeAttributes typeAttributes, boolean z, int i, boolean z2) {
        TypeProjection m27550k = m27550k(new TypeProjectionImpl(Variance.INVARIANT, typeAliasExpansion.getDescriptor().getUnderlyingType()), typeAliasExpansion, null, i);
        KotlinType type = m27550k.getType();
        Intrinsics.checkNotNullExpressionValue(type, "expandedProjection.type");
        SimpleType asSimpleType = TypeSubstitutionKt.asSimpleType(type);
        if (KotlinTypeKt.isError(asSimpleType)) {
            return asSimpleType;
        }
        m27550k.getProjectionKind();
        m27560a(asSimpleType.getAnnotations(), AnnotationsTypeAttributeKt.getAnnotations(typeAttributes));
        SimpleType makeNullableIfNeeded = TypeUtils.makeNullableIfNeeded(m27557d(asSimpleType, typeAttributes), z);
        Intrinsics.checkNotNullExpressionValue(makeNullableIfNeeded, "expandedType.combineAttr…fNeeded(it, isNullable) }");
        if (z2) {
            return SpecialTypesKt.withAbbreviation(makeNullableIfNeeded, m27554g(typeAliasExpansion, typeAttributes, z));
        }
        return makeNullableIfNeeded;
    }

    /* renamed from: k */
    public final TypeProjection m27550k(TypeProjection typeProjection, TypeAliasExpansion typeAliasExpansion, TypeParameterDescriptor typeParameterDescriptor, int i) {
        Variance variance;
        KotlinType m27555f;
        Variance variance2;
        Variance variance3;
        Companion.m27548a(i, typeAliasExpansion.getDescriptor());
        if (typeProjection.isStarProjection()) {
            Intrinsics.checkNotNull(typeParameterDescriptor);
            TypeProjection makeStarProjection = TypeUtils.makeStarProjection(typeParameterDescriptor);
            Intrinsics.checkNotNullExpressionValue(makeStarProjection, "makeStarProjection(typeParameterDescriptor!!)");
            return makeStarProjection;
        }
        KotlinType type = typeProjection.getType();
        Intrinsics.checkNotNullExpressionValue(type, "underlyingProjection.type");
        TypeProjection replacement = typeAliasExpansion.getReplacement(type.getConstructor());
        if (replacement == null) {
            return m27552i(typeProjection, typeAliasExpansion, i);
        }
        if (replacement.isStarProjection()) {
            Intrinsics.checkNotNull(typeParameterDescriptor);
            TypeProjection makeStarProjection2 = TypeUtils.makeStarProjection(typeParameterDescriptor);
            Intrinsics.checkNotNullExpressionValue(makeStarProjection2, "makeStarProjection(typeParameterDescriptor!!)");
            return makeStarProjection2;
        }
        UnwrappedType unwrap = replacement.getType().unwrap();
        Variance projectionKind = replacement.getProjectionKind();
        Intrinsics.checkNotNullExpressionValue(projectionKind, "argument.projectionKind");
        Variance projectionKind2 = typeProjection.getProjectionKind();
        Intrinsics.checkNotNullExpressionValue(projectionKind2, "underlyingProjection.projectionKind");
        if (projectionKind2 != projectionKind && projectionKind2 != (variance3 = Variance.INVARIANT)) {
            if (projectionKind == variance3) {
                projectionKind = projectionKind2;
            } else {
                this.f70261a.conflictingProjection(typeAliasExpansion.getDescriptor(), typeParameterDescriptor, unwrap);
            }
        }
        if (typeParameterDescriptor == null || (variance = typeParameterDescriptor.getVariance()) == null) {
            variance = Variance.INVARIANT;
        }
        Intrinsics.checkNotNullExpressionValue(variance, "typeParameterDescriptor?…nce ?: Variance.INVARIANT");
        if (variance != projectionKind && variance != (variance2 = Variance.INVARIANT)) {
            if (projectionKind == variance2) {
                projectionKind = variance2;
            } else {
                this.f70261a.conflictingProjection(typeAliasExpansion.getDescriptor(), typeParameterDescriptor, unwrap);
            }
        }
        m27560a(type.getAnnotations(), unwrap.getAnnotations());
        if (unwrap instanceof DynamicType) {
            m27555f = m27558c((DynamicType) unwrap, type.getAttributes());
        } else {
            m27555f = m27555f(TypeSubstitutionKt.asSimpleType(unwrap), type);
        }
        return new TypeProjectionImpl(projectionKind, m27555f);
    }

    /* renamed from: l */
    public final SimpleType m27549l(SimpleType simpleType, TypeAliasExpansion typeAliasExpansion, int i) {
        TypeConstructor constructor = simpleType.getConstructor();
        List<TypeProjection> arguments = simpleType.getArguments();
        ArrayList arrayList = new ArrayList(AbstractC10176es.collectionSizeOrDefault(arguments, 10));
        int i2 = 0;
        for (Object obj : arguments) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            TypeProjection typeProjection = (TypeProjection) obj;
            TypeProjection m27550k = m27550k(typeProjection, typeAliasExpansion, constructor.getParameters().get(i2), i + 1);
            if (!m27550k.isStarProjection()) {
                m27550k = new TypeProjectionImpl(m27550k.getProjectionKind(), TypeUtils.makeNullableIfNeeded(m27550k.getType(), typeProjection.getType().isMarkedNullable()));
            }
            arrayList.add(m27550k);
            i2 = i3;
        }
        return TypeSubstitutionKt.replace$default(simpleType, arrayList, null, 2, null);
    }
}
