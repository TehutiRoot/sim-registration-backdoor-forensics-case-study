package kotlin.reflect.jvm.internal.impl.renderer;

import java.lang.reflect.Field;
import java.util.Set;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Delegates;
import kotlin.properties.ObservableProperty;
import kotlin.properties.ReadWriteProperty;
import kotlin.reflect.KClass;
import kotlin.reflect.KProperty;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.renderer.ClassifierNamePolicy;
import kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer;
import kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@SourceDebugExtension({"SMAP\nDescriptorRendererOptionsImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DescriptorRendererOptionsImpl.kt\norg/jetbrains/kotlin/renderer/DescriptorRendererOptionsImpl\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Delegates.kt\nkotlin/properties/Delegates\n*L\n1#1,134:1\n1#2:135\n51#3,3:136\n*S KotlinDebug\n*F\n+ 1 DescriptorRendererOptionsImpl.kt\norg/jetbrains/kotlin/renderer/DescriptorRendererOptionsImpl\n*L\n60#1:136,3\n*E\n"})
/* loaded from: classes6.dex */
public final class DescriptorRendererOptionsImpl implements DescriptorRendererOptions {

    /* renamed from: X */
    public static final /* synthetic */ KProperty[] f69813X = {Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(DescriptorRendererOptionsImpl.class), "classifierNamePolicy", "getClassifierNamePolicy()Lorg/jetbrains/kotlin/renderer/ClassifierNamePolicy;")), Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(DescriptorRendererOptionsImpl.class), "withDefinedIn", "getWithDefinedIn()Z")), Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(DescriptorRendererOptionsImpl.class), "withSourceFileForTopLevel", "getWithSourceFileForTopLevel()Z")), Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(DescriptorRendererOptionsImpl.class), "modifiers", "getModifiers()Ljava/util/Set;")), Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(DescriptorRendererOptionsImpl.class), "startFromName", "getStartFromName()Z")), Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(DescriptorRendererOptionsImpl.class), "startFromDeclarationKeyword", "getStartFromDeclarationKeyword()Z")), Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(DescriptorRendererOptionsImpl.class), "debugMode", "getDebugMode()Z")), Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(DescriptorRendererOptionsImpl.class), "classWithPrimaryConstructor", "getClassWithPrimaryConstructor()Z")), Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(DescriptorRendererOptionsImpl.class), "verbose", "getVerbose()Z")), Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(DescriptorRendererOptionsImpl.class), "unitReturnType", "getUnitReturnType()Z")), Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(DescriptorRendererOptionsImpl.class), "withoutReturnType", "getWithoutReturnType()Z")), Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(DescriptorRendererOptionsImpl.class), "enhancedTypes", "getEnhancedTypes()Z")), Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(DescriptorRendererOptionsImpl.class), "normalizedVisibilities", "getNormalizedVisibilities()Z")), Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(DescriptorRendererOptionsImpl.class), "renderDefaultVisibility", "getRenderDefaultVisibility()Z")), Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(DescriptorRendererOptionsImpl.class), "renderDefaultModality", "getRenderDefaultModality()Z")), Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(DescriptorRendererOptionsImpl.class), "renderConstructorDelegation", "getRenderConstructorDelegation()Z")), Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(DescriptorRendererOptionsImpl.class), "renderPrimaryConstructorParametersAsProperties", "getRenderPrimaryConstructorParametersAsProperties()Z")), Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(DescriptorRendererOptionsImpl.class), "actualPropertiesInPrimaryConstructor", "getActualPropertiesInPrimaryConstructor()Z")), Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(DescriptorRendererOptionsImpl.class), "uninferredTypeParameterAsName", "getUninferredTypeParameterAsName()Z")), Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(DescriptorRendererOptionsImpl.class), "includePropertyConstant", "getIncludePropertyConstant()Z")), Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(DescriptorRendererOptionsImpl.class), "withoutTypeParameters", "getWithoutTypeParameters()Z")), Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(DescriptorRendererOptionsImpl.class), "withoutSuperTypes", "getWithoutSuperTypes()Z")), Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(DescriptorRendererOptionsImpl.class), "typeNormalizer", "getTypeNormalizer()Lkotlin/jvm/functions/Function1;")), Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(DescriptorRendererOptionsImpl.class), "defaultParameterValueRenderer", "getDefaultParameterValueRenderer()Lkotlin/jvm/functions/Function1;")), Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(DescriptorRendererOptionsImpl.class), "secondaryConstructorsAsPrimary", "getSecondaryConstructorsAsPrimary()Z")), Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(DescriptorRendererOptionsImpl.class), "overrideRenderingPolicy", "getOverrideRenderingPolicy()Lorg/jetbrains/kotlin/renderer/OverrideRenderingPolicy;")), Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(DescriptorRendererOptionsImpl.class), "valueParametersHandler", "getValueParametersHandler()Lorg/jetbrains/kotlin/renderer/DescriptorRenderer$ValueParametersHandler;")), Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(DescriptorRendererOptionsImpl.class), "textFormat", "getTextFormat()Lorg/jetbrains/kotlin/renderer/RenderingFormat;")), Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(DescriptorRendererOptionsImpl.class), "parameterNameRenderingPolicy", "getParameterNameRenderingPolicy()Lorg/jetbrains/kotlin/renderer/ParameterNameRenderingPolicy;")), Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(DescriptorRendererOptionsImpl.class), "receiverAfterName", "getReceiverAfterName()Z")), Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(DescriptorRendererOptionsImpl.class), "renderCompanionObjectName", "getRenderCompanionObjectName()Z")), Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(DescriptorRendererOptionsImpl.class), "propertyAccessorRenderingPolicy", "getPropertyAccessorRenderingPolicy()Lorg/jetbrains/kotlin/renderer/PropertyAccessorRenderingPolicy;")), Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(DescriptorRendererOptionsImpl.class), "renderDefaultAnnotationArguments", "getRenderDefaultAnnotationArguments()Z")), Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(DescriptorRendererOptionsImpl.class), "eachAnnotationOnNewLine", "getEachAnnotationOnNewLine()Z")), Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(DescriptorRendererOptionsImpl.class), "excludedAnnotationClasses", "getExcludedAnnotationClasses()Ljava/util/Set;")), Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(DescriptorRendererOptionsImpl.class), "excludedTypeAnnotationClasses", "getExcludedTypeAnnotationClasses()Ljava/util/Set;")), Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(DescriptorRendererOptionsImpl.class), "annotationFilter", "getAnnotationFilter()Lkotlin/jvm/functions/Function1;")), Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(DescriptorRendererOptionsImpl.class), "annotationArgumentsRenderingPolicy", "getAnnotationArgumentsRenderingPolicy()Lorg/jetbrains/kotlin/renderer/AnnotationArgumentsRenderingPolicy;")), Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(DescriptorRendererOptionsImpl.class), "alwaysRenderModifiers", "getAlwaysRenderModifiers()Z")), Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(DescriptorRendererOptionsImpl.class), "renderConstructorKeyword", "getRenderConstructorKeyword()Z")), Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(DescriptorRendererOptionsImpl.class), "renderUnabbreviatedType", "getRenderUnabbreviatedType()Z")), Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(DescriptorRendererOptionsImpl.class), "renderTypeExpansions", "getRenderTypeExpansions()Z")), Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(DescriptorRendererOptionsImpl.class), "includeAdditionalModifiers", "getIncludeAdditionalModifiers()Z")), Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(DescriptorRendererOptionsImpl.class), "parameterNamesInFunctionalTypes", "getParameterNamesInFunctionalTypes()Z")), Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(DescriptorRendererOptionsImpl.class), "renderFunctionContracts", "getRenderFunctionContracts()Z")), Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(DescriptorRendererOptionsImpl.class), "presentableUnresolvedTypes", "getPresentableUnresolvedTypes()Z")), Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(DescriptorRendererOptionsImpl.class), "boldOnlyForNamesInHtml", "getBoldOnlyForNamesInHtml()Z")), Reflection.mutableProperty1(new MutablePropertyReference1Impl(Reflection.getOrCreateKotlinClass(DescriptorRendererOptionsImpl.class), "informativeErrorType", "getInformativeErrorType()Z"))};

    /* renamed from: A */
    public final ReadWriteProperty f69814A;

    /* renamed from: B */
    public final ReadWriteProperty f69815B;

    /* renamed from: C */
    public final ReadWriteProperty f69816C;

    /* renamed from: D */
    public final ReadWriteProperty f69817D;

    /* renamed from: E */
    public final ReadWriteProperty f69818E;

    /* renamed from: F */
    public final ReadWriteProperty f69819F;

    /* renamed from: G */
    public final ReadWriteProperty f69820G;

    /* renamed from: H */
    public final ReadWriteProperty f69821H;

    /* renamed from: I */
    public final ReadWriteProperty f69822I;

    /* renamed from: J */
    public final ReadWriteProperty f69823J;

    /* renamed from: K */
    public final ReadWriteProperty f69824K;

    /* renamed from: L */
    public final ReadWriteProperty f69825L;

    /* renamed from: M */
    public final ReadWriteProperty f69826M;

    /* renamed from: N */
    public final ReadWriteProperty f69827N;

    /* renamed from: O */
    public final ReadWriteProperty f69828O;

    /* renamed from: P */
    public final ReadWriteProperty f69829P;

    /* renamed from: Q */
    public final ReadWriteProperty f69830Q;

    /* renamed from: R */
    public final ReadWriteProperty f69831R;

    /* renamed from: S */
    public final ReadWriteProperty f69832S;

    /* renamed from: T */
    public final ReadWriteProperty f69833T;

    /* renamed from: U */
    public final ReadWriteProperty f69834U;

    /* renamed from: V */
    public final ReadWriteProperty f69835V;

    /* renamed from: W */
    public final ReadWriteProperty f69836W;

    /* renamed from: a */
    public boolean f69837a;

    /* renamed from: b */
    public final ReadWriteProperty f69838b = m27809a(ClassifierNamePolicy.SOURCE_CODE_QUALIFIED.INSTANCE);

    /* renamed from: c */
    public final ReadWriteProperty f69839c;

    /* renamed from: d */
    public final ReadWriteProperty f69840d;

    /* renamed from: e */
    public final ReadWriteProperty f69841e;

    /* renamed from: f */
    public final ReadWriteProperty f69842f;

    /* renamed from: g */
    public final ReadWriteProperty f69843g;

    /* renamed from: h */
    public final ReadWriteProperty f69844h;

    /* renamed from: i */
    public final ReadWriteProperty f69845i;

    /* renamed from: j */
    public final ReadWriteProperty f69846j;

    /* renamed from: k */
    public final ReadWriteProperty f69847k;

    /* renamed from: l */
    public final ReadWriteProperty f69848l;

    /* renamed from: m */
    public final ReadWriteProperty f69849m;

    /* renamed from: n */
    public final ReadWriteProperty f69850n;

    /* renamed from: o */
    public final ReadWriteProperty f69851o;

    /* renamed from: p */
    public final ReadWriteProperty f69852p;

    /* renamed from: q */
    public final ReadWriteProperty f69853q;

    /* renamed from: r */
    public final ReadWriteProperty f69854r;

    /* renamed from: s */
    public final ReadWriteProperty f69855s;

    /* renamed from: t */
    public final ReadWriteProperty f69856t;

    /* renamed from: u */
    public final ReadWriteProperty f69857u;

    /* renamed from: v */
    public final ReadWriteProperty f69858v;

    /* renamed from: w */
    public final ReadWriteProperty f69859w;

    /* renamed from: x */
    public final ReadWriteProperty f69860x;

    /* renamed from: y */
    public final ReadWriteProperty f69861y;

    /* renamed from: z */
    public final ReadWriteProperty f69862z;

    public DescriptorRendererOptionsImpl() {
        Boolean bool = Boolean.TRUE;
        this.f69839c = m27809a(bool);
        this.f69840d = m27809a(bool);
        this.f69841e = m27809a(DescriptorRendererModifier.ALL_EXCEPT_ANNOTATIONS);
        Boolean bool2 = Boolean.FALSE;
        this.f69842f = m27809a(bool2);
        this.f69843g = m27809a(bool2);
        this.f69844h = m27809a(bool2);
        this.f69845i = m27809a(bool2);
        this.f69846j = m27809a(bool2);
        this.f69847k = m27809a(bool);
        this.f69848l = m27809a(bool2);
        this.f69849m = m27809a(bool2);
        this.f69850n = m27809a(bool2);
        this.f69851o = m27809a(bool);
        this.f69852p = m27809a(bool);
        this.f69853q = m27809a(bool2);
        this.f69854r = m27809a(bool2);
        this.f69855s = m27809a(bool2);
        this.f69856t = m27809a(bool2);
        this.f69857u = m27809a(bool2);
        this.f69858v = m27809a(bool2);
        this.f69859w = m27809a(bool2);
        this.f69860x = m27809a(DescriptorRendererOptionsImpl$typeNormalizer$2.INSTANCE);
        this.f69861y = m27809a(DescriptorRendererOptionsImpl$defaultParameterValueRenderer$2.INSTANCE);
        this.f69862z = m27809a(bool);
        this.f69814A = m27809a(OverrideRenderingPolicy.RENDER_OPEN);
        this.f69815B = m27809a(DescriptorRenderer.ValueParametersHandler.DEFAULT.INSTANCE);
        this.f69816C = m27809a(RenderingFormat.PLAIN);
        this.f69817D = m27809a(ParameterNameRenderingPolicy.ALL);
        this.f69818E = m27809a(bool2);
        this.f69819F = m27809a(bool2);
        this.f69820G = m27809a(PropertyAccessorRenderingPolicy.DEBUG);
        this.f69821H = m27809a(bool2);
        this.f69822I = m27809a(bool2);
        this.f69823J = m27809a(DG1.emptySet());
        this.f69824K = m27809a(ExcludedTypeAnnotations.INSTANCE.getInternalAnnotationsForResolve());
        this.f69825L = m27809a(null);
        this.f69826M = m27809a(AnnotationArgumentsRenderingPolicy.NO_ARGUMENTS);
        this.f69827N = m27809a(bool2);
        this.f69828O = m27809a(bool);
        this.f69829P = m27809a(bool);
        this.f69830Q = m27809a(bool2);
        this.f69831R = m27809a(bool);
        this.f69832S = m27809a(bool);
        this.f69833T = m27809a(bool2);
        this.f69834U = m27809a(bool2);
        this.f69835V = m27809a(bool2);
        this.f69836W = m27809a(bool);
    }

    /* renamed from: a */
    public final ReadWriteProperty m27809a(Object obj) {
        Delegates delegates = Delegates.INSTANCE;
        return new ObservableProperty<Object>(obj) { // from class: kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptionsImpl$property$$inlined$vetoable$1
            @Override // kotlin.properties.ObservableProperty
            public boolean beforeChange(@NotNull KProperty<?> property, Object obj2, Object obj3) {
                Intrinsics.checkNotNullParameter(property, "property");
                if (!this.isLocked()) {
                    return true;
                }
                throw new IllegalStateException("Cannot modify readonly DescriptorRendererOptions");
            }
        };
    }

    @NotNull
    public final DescriptorRendererOptionsImpl copy() {
        ObservableProperty observableProperty;
        DescriptorRendererOptionsImpl descriptorRendererOptionsImpl = new DescriptorRendererOptionsImpl();
        Field[] declaredFields = DescriptorRendererOptionsImpl.class.getDeclaredFields();
        Intrinsics.checkNotNullExpressionValue(declaredFields, "this::class.java.declaredFields");
        for (Field field : declaredFields) {
            if ((field.getModifiers() & 8) == 0) {
                field.setAccessible(true);
                Object obj = field.get(this);
                if (obj instanceof ObservableProperty) {
                    observableProperty = (ObservableProperty) obj;
                } else {
                    observableProperty = null;
                }
                if (observableProperty != null) {
                    String name = field.getName();
                    Intrinsics.checkNotNullExpressionValue(name, "field.name");
                    AbstractC20204hN1.startsWith$default(name, "is", false, 2, null);
                    KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(DescriptorRendererOptionsImpl.class);
                    String name2 = field.getName();
                    StringBuilder sb = new StringBuilder();
                    sb.append("get");
                    String name3 = field.getName();
                    Intrinsics.checkNotNullExpressionValue(name3, "field.name");
                    if (name3.length() > 0) {
                        char upperCase = Character.toUpperCase(name3.charAt(0));
                        String substring = name3.substring(1);
                        Intrinsics.checkNotNullExpressionValue(substring, "this as java.lang.String).substring(startIndex)");
                        name3 = upperCase + substring;
                    }
                    sb.append(name3);
                    field.set(descriptorRendererOptionsImpl, descriptorRendererOptionsImpl.m27809a(observableProperty.getValue(this, new PropertyReference1Impl(orCreateKotlinClass, name2, sb.toString()))));
                }
            }
        }
        return descriptorRendererOptionsImpl;
    }

    public boolean getActualPropertiesInPrimaryConstructor() {
        return ((Boolean) this.f69855s.getValue(this, f69813X[17])).booleanValue();
    }

    public boolean getAlwaysRenderModifiers() {
        return ((Boolean) this.f69827N.getValue(this, f69813X[38])).booleanValue();
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    @NotNull
    public AnnotationArgumentsRenderingPolicy getAnnotationArgumentsRenderingPolicy() {
        return (AnnotationArgumentsRenderingPolicy) this.f69826M.getValue(this, f69813X[37]);
    }

    @Nullable
    public Function1<AnnotationDescriptor, Boolean> getAnnotationFilter() {
        return (Function1) this.f69825L.getValue(this, f69813X[36]);
    }

    public boolean getBoldOnlyForNamesInHtml() {
        return ((Boolean) this.f69835V.getValue(this, f69813X[46])).booleanValue();
    }

    public boolean getClassWithPrimaryConstructor() {
        return ((Boolean) this.f69845i.getValue(this, f69813X[7])).booleanValue();
    }

    @NotNull
    public ClassifierNamePolicy getClassifierNamePolicy() {
        return (ClassifierNamePolicy) this.f69838b.getValue(this, f69813X[0]);
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    public boolean getDebugMode() {
        return ((Boolean) this.f69844h.getValue(this, f69813X[6])).booleanValue();
    }

    @Nullable
    public Function1<ValueParameterDescriptor, String> getDefaultParameterValueRenderer() {
        return (Function1) this.f69861y.getValue(this, f69813X[23]);
    }

    public boolean getEachAnnotationOnNewLine() {
        return ((Boolean) this.f69822I.getValue(this, f69813X[33])).booleanValue();
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    public boolean getEnhancedTypes() {
        return ((Boolean) this.f69849m.getValue(this, f69813X[11])).booleanValue();
    }

    @NotNull
    public Set<FqName> getExcludedAnnotationClasses() {
        return (Set) this.f69823J.getValue(this, f69813X[34]);
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    @NotNull
    public Set<FqName> getExcludedTypeAnnotationClasses() {
        return (Set) this.f69824K.getValue(this, f69813X[35]);
    }

    public boolean getIncludeAdditionalModifiers() {
        return ((Boolean) this.f69831R.getValue(this, f69813X[42])).booleanValue();
    }

    public boolean getIncludeAnnotationArguments() {
        return DescriptorRendererOptions.DefaultImpls.getIncludeAnnotationArguments(this);
    }

    public boolean getIncludeEmptyAnnotationArguments() {
        return DescriptorRendererOptions.DefaultImpls.getIncludeEmptyAnnotationArguments(this);
    }

    public boolean getIncludePropertyConstant() {
        return ((Boolean) this.f69857u.getValue(this, f69813X[19])).booleanValue();
    }

    public boolean getInformativeErrorType() {
        return ((Boolean) this.f69836W.getValue(this, f69813X[47])).booleanValue();
    }

    @NotNull
    public Set<DescriptorRendererModifier> getModifiers() {
        return (Set) this.f69841e.getValue(this, f69813X[3]);
    }

    public boolean getNormalizedVisibilities() {
        return ((Boolean) this.f69850n.getValue(this, f69813X[12])).booleanValue();
    }

    @NotNull
    public OverrideRenderingPolicy getOverrideRenderingPolicy() {
        return (OverrideRenderingPolicy) this.f69814A.getValue(this, f69813X[25]);
    }

    @NotNull
    public ParameterNameRenderingPolicy getParameterNameRenderingPolicy() {
        return (ParameterNameRenderingPolicy) this.f69817D.getValue(this, f69813X[28]);
    }

    public boolean getParameterNamesInFunctionalTypes() {
        return ((Boolean) this.f69832S.getValue(this, f69813X[43])).booleanValue();
    }

    public boolean getPresentableUnresolvedTypes() {
        return ((Boolean) this.f69834U.getValue(this, f69813X[45])).booleanValue();
    }

    @NotNull
    public PropertyAccessorRenderingPolicy getPropertyAccessorRenderingPolicy() {
        return (PropertyAccessorRenderingPolicy) this.f69820G.getValue(this, f69813X[31]);
    }

    public boolean getReceiverAfterName() {
        return ((Boolean) this.f69818E.getValue(this, f69813X[29])).booleanValue();
    }

    public boolean getRenderCompanionObjectName() {
        return ((Boolean) this.f69819F.getValue(this, f69813X[30])).booleanValue();
    }

    public boolean getRenderConstructorDelegation() {
        return ((Boolean) this.f69853q.getValue(this, f69813X[15])).booleanValue();
    }

    public boolean getRenderConstructorKeyword() {
        return ((Boolean) this.f69828O.getValue(this, f69813X[39])).booleanValue();
    }

    public boolean getRenderDefaultAnnotationArguments() {
        return ((Boolean) this.f69821H.getValue(this, f69813X[32])).booleanValue();
    }

    public boolean getRenderDefaultModality() {
        return ((Boolean) this.f69852p.getValue(this, f69813X[14])).booleanValue();
    }

    public boolean getRenderDefaultVisibility() {
        return ((Boolean) this.f69851o.getValue(this, f69813X[13])).booleanValue();
    }

    public boolean getRenderPrimaryConstructorParametersAsProperties() {
        return ((Boolean) this.f69854r.getValue(this, f69813X[16])).booleanValue();
    }

    public boolean getRenderTypeExpansions() {
        return ((Boolean) this.f69830Q.getValue(this, f69813X[41])).booleanValue();
    }

    public boolean getRenderUnabbreviatedType() {
        return ((Boolean) this.f69829P.getValue(this, f69813X[40])).booleanValue();
    }

    public boolean getSecondaryConstructorsAsPrimary() {
        return ((Boolean) this.f69862z.getValue(this, f69813X[24])).booleanValue();
    }

    public boolean getStartFromDeclarationKeyword() {
        return ((Boolean) this.f69843g.getValue(this, f69813X[5])).booleanValue();
    }

    public boolean getStartFromName() {
        return ((Boolean) this.f69842f.getValue(this, f69813X[4])).booleanValue();
    }

    @NotNull
    public RenderingFormat getTextFormat() {
        return (RenderingFormat) this.f69816C.getValue(this, f69813X[27]);
    }

    @NotNull
    public Function1<KotlinType, KotlinType> getTypeNormalizer() {
        return (Function1) this.f69860x.getValue(this, f69813X[22]);
    }

    public boolean getUninferredTypeParameterAsName() {
        return ((Boolean) this.f69856t.getValue(this, f69813X[18])).booleanValue();
    }

    public boolean getUnitReturnType() {
        return ((Boolean) this.f69847k.getValue(this, f69813X[9])).booleanValue();
    }

    @NotNull
    public DescriptorRenderer.ValueParametersHandler getValueParametersHandler() {
        return (DescriptorRenderer.ValueParametersHandler) this.f69815B.getValue(this, f69813X[26]);
    }

    public boolean getVerbose() {
        return ((Boolean) this.f69846j.getValue(this, f69813X[8])).booleanValue();
    }

    public boolean getWithDefinedIn() {
        return ((Boolean) this.f69839c.getValue(this, f69813X[1])).booleanValue();
    }

    public boolean getWithSourceFileForTopLevel() {
        return ((Boolean) this.f69840d.getValue(this, f69813X[2])).booleanValue();
    }

    public boolean getWithoutReturnType() {
        return ((Boolean) this.f69848l.getValue(this, f69813X[10])).booleanValue();
    }

    public boolean getWithoutSuperTypes() {
        return ((Boolean) this.f69859w.getValue(this, f69813X[21])).booleanValue();
    }

    public boolean getWithoutTypeParameters() {
        return ((Boolean) this.f69858v.getValue(this, f69813X[20])).booleanValue();
    }

    public final boolean isLocked() {
        return this.f69837a;
    }

    public final void lock() {
        this.f69837a = true;
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    public void setAnnotationArgumentsRenderingPolicy(@NotNull AnnotationArgumentsRenderingPolicy annotationArgumentsRenderingPolicy) {
        Intrinsics.checkNotNullParameter(annotationArgumentsRenderingPolicy, "<set-?>");
        this.f69826M.setValue(this, f69813X[37], annotationArgumentsRenderingPolicy);
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    public void setClassifierNamePolicy(@NotNull ClassifierNamePolicy classifierNamePolicy) {
        Intrinsics.checkNotNullParameter(classifierNamePolicy, "<set-?>");
        this.f69838b.setValue(this, f69813X[0], classifierNamePolicy);
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    public void setDebugMode(boolean z) {
        this.f69844h.setValue(this, f69813X[6], Boolean.valueOf(z));
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    public void setExcludedTypeAnnotationClasses(@NotNull Set<FqName> set) {
        Intrinsics.checkNotNullParameter(set, "<set-?>");
        this.f69824K.setValue(this, f69813X[35], set);
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    public void setModifiers(@NotNull Set<? extends DescriptorRendererModifier> set) {
        Intrinsics.checkNotNullParameter(set, "<set-?>");
        this.f69841e.setValue(this, f69813X[3], set);
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    public void setParameterNameRenderingPolicy(@NotNull ParameterNameRenderingPolicy parameterNameRenderingPolicy) {
        Intrinsics.checkNotNullParameter(parameterNameRenderingPolicy, "<set-?>");
        this.f69817D.setValue(this, f69813X[28], parameterNameRenderingPolicy);
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    public void setReceiverAfterName(boolean z) {
        this.f69818E.setValue(this, f69813X[29], Boolean.valueOf(z));
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    public void setRenderCompanionObjectName(boolean z) {
        this.f69819F.setValue(this, f69813X[30], Boolean.valueOf(z));
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    public void setStartFromName(boolean z) {
        this.f69842f.setValue(this, f69813X[4], Boolean.valueOf(z));
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    public void setTextFormat(@NotNull RenderingFormat renderingFormat) {
        Intrinsics.checkNotNullParameter(renderingFormat, "<set-?>");
        this.f69816C.setValue(this, f69813X[27], renderingFormat);
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    public void setVerbose(boolean z) {
        this.f69846j.setValue(this, f69813X[8], Boolean.valueOf(z));
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    public void setWithDefinedIn(boolean z) {
        this.f69839c.setValue(this, f69813X[1], Boolean.valueOf(z));
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    public void setWithoutSuperTypes(boolean z) {
        this.f69859w.setValue(this, f69813X[21], Boolean.valueOf(z));
    }

    @Override // kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions
    public void setWithoutTypeParameters(boolean z) {
        this.f69858v.setValue(this, f69813X[20], Boolean.valueOf(z));
    }
}
