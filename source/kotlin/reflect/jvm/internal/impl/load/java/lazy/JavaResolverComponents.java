package kotlin.reflect.jvm.internal.impl.load.java.lazy;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.builtins.ReflectionTypes;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SupertypeLoopChecker;
import kotlin.reflect.jvm.internal.impl.incremental.components.LookupTracker;
import kotlin.reflect.jvm.internal.impl.load.java.AnnotationTypeQualifierResolver;
import kotlin.reflect.jvm.internal.impl.load.java.JavaClassFinder;
import kotlin.reflect.jvm.internal.impl.load.java.JavaClassesTracker;
import kotlin.reflect.jvm.internal.impl.load.java.JavaModuleAnnotationsProvider;
import kotlin.reflect.jvm.internal.impl.load.java.JavaTypeEnhancementState;
import kotlin.reflect.jvm.internal.impl.load.java.components.JavaPropertyInitializerEvaluator;
import kotlin.reflect.jvm.internal.impl.load.java.components.JavaResolverCache;
import kotlin.reflect.jvm.internal.impl.load.java.components.SignaturePropagator;
import kotlin.reflect.jvm.internal.impl.load.java.sources.JavaSourceElementFactory;
import kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancement;
import kotlin.reflect.jvm.internal.impl.load.kotlin.DeserializedDescriptorResolver;
import kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinClassFinder;
import kotlin.reflect.jvm.internal.impl.load.kotlin.PackagePartProvider;
import kotlin.reflect.jvm.internal.impl.resolve.jvm.SyntheticJavaPartsProvider;
import kotlin.reflect.jvm.internal.impl.resolve.sam.SamConversionResolver;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.ErrorReporter;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;
import kotlin.reflect.jvm.internal.impl.types.checker.NewKotlinTypeChecker;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes6.dex */
public final class JavaResolverComponents {

    /* renamed from: a */
    public final StorageManager f69056a;

    /* renamed from: b */
    public final JavaClassFinder f69057b;

    /* renamed from: c */
    public final KotlinClassFinder f69058c;

    /* renamed from: d */
    public final DeserializedDescriptorResolver f69059d;

    /* renamed from: e */
    public final SignaturePropagator f69060e;

    /* renamed from: f */
    public final ErrorReporter f69061f;

    /* renamed from: g */
    public final JavaResolverCache f69062g;

    /* renamed from: h */
    public final JavaPropertyInitializerEvaluator f69063h;

    /* renamed from: i */
    public final SamConversionResolver f69064i;

    /* renamed from: j */
    public final JavaSourceElementFactory f69065j;

    /* renamed from: k */
    public final ModuleClassResolver f69066k;

    /* renamed from: l */
    public final PackagePartProvider f69067l;

    /* renamed from: m */
    public final SupertypeLoopChecker f69068m;

    /* renamed from: n */
    public final LookupTracker f69069n;

    /* renamed from: o */
    public final ModuleDescriptor f69070o;

    /* renamed from: p */
    public final ReflectionTypes f69071p;

    /* renamed from: q */
    public final AnnotationTypeQualifierResolver f69072q;

    /* renamed from: r */
    public final SignatureEnhancement f69073r;

    /* renamed from: s */
    public final JavaClassesTracker f69074s;

    /* renamed from: t */
    public final JavaResolverSettings f69075t;

    /* renamed from: u */
    public final NewKotlinTypeChecker f69076u;

    /* renamed from: v */
    public final JavaTypeEnhancementState f69077v;

    /* renamed from: w */
    public final JavaModuleAnnotationsProvider f69078w;

    /* renamed from: x */
    public final SyntheticJavaPartsProvider f69079x;

    public JavaResolverComponents(@NotNull StorageManager storageManager, @NotNull JavaClassFinder finder, @NotNull KotlinClassFinder kotlinClassFinder, @NotNull DeserializedDescriptorResolver deserializedDescriptorResolver, @NotNull SignaturePropagator signaturePropagator, @NotNull ErrorReporter errorReporter, @NotNull JavaResolverCache javaResolverCache, @NotNull JavaPropertyInitializerEvaluator javaPropertyInitializerEvaluator, @NotNull SamConversionResolver samConversionResolver, @NotNull JavaSourceElementFactory sourceElementFactory, @NotNull ModuleClassResolver moduleClassResolver, @NotNull PackagePartProvider packagePartProvider, @NotNull SupertypeLoopChecker supertypeLoopChecker, @NotNull LookupTracker lookupTracker, @NotNull ModuleDescriptor module, @NotNull ReflectionTypes reflectionTypes, @NotNull AnnotationTypeQualifierResolver annotationTypeQualifierResolver, @NotNull SignatureEnhancement signatureEnhancement, @NotNull JavaClassesTracker javaClassesTracker, @NotNull JavaResolverSettings settings, @NotNull NewKotlinTypeChecker kotlinTypeChecker, @NotNull JavaTypeEnhancementState javaTypeEnhancementState, @NotNull JavaModuleAnnotationsProvider javaModuleResolver, @NotNull SyntheticJavaPartsProvider syntheticPartsProvider) {
        Intrinsics.checkNotNullParameter(storageManager, "storageManager");
        Intrinsics.checkNotNullParameter(finder, "finder");
        Intrinsics.checkNotNullParameter(kotlinClassFinder, "kotlinClassFinder");
        Intrinsics.checkNotNullParameter(deserializedDescriptorResolver, "deserializedDescriptorResolver");
        Intrinsics.checkNotNullParameter(signaturePropagator, "signaturePropagator");
        Intrinsics.checkNotNullParameter(errorReporter, "errorReporter");
        Intrinsics.checkNotNullParameter(javaResolverCache, "javaResolverCache");
        Intrinsics.checkNotNullParameter(javaPropertyInitializerEvaluator, "javaPropertyInitializerEvaluator");
        Intrinsics.checkNotNullParameter(samConversionResolver, "samConversionResolver");
        Intrinsics.checkNotNullParameter(sourceElementFactory, "sourceElementFactory");
        Intrinsics.checkNotNullParameter(moduleClassResolver, "moduleClassResolver");
        Intrinsics.checkNotNullParameter(packagePartProvider, "packagePartProvider");
        Intrinsics.checkNotNullParameter(supertypeLoopChecker, "supertypeLoopChecker");
        Intrinsics.checkNotNullParameter(lookupTracker, "lookupTracker");
        Intrinsics.checkNotNullParameter(module, "module");
        Intrinsics.checkNotNullParameter(reflectionTypes, "reflectionTypes");
        Intrinsics.checkNotNullParameter(annotationTypeQualifierResolver, "annotationTypeQualifierResolver");
        Intrinsics.checkNotNullParameter(signatureEnhancement, "signatureEnhancement");
        Intrinsics.checkNotNullParameter(javaClassesTracker, "javaClassesTracker");
        Intrinsics.checkNotNullParameter(settings, "settings");
        Intrinsics.checkNotNullParameter(kotlinTypeChecker, "kotlinTypeChecker");
        Intrinsics.checkNotNullParameter(javaTypeEnhancementState, "javaTypeEnhancementState");
        Intrinsics.checkNotNullParameter(javaModuleResolver, "javaModuleResolver");
        Intrinsics.checkNotNullParameter(syntheticPartsProvider, "syntheticPartsProvider");
        this.f69056a = storageManager;
        this.f69057b = finder;
        this.f69058c = kotlinClassFinder;
        this.f69059d = deserializedDescriptorResolver;
        this.f69060e = signaturePropagator;
        this.f69061f = errorReporter;
        this.f69062g = javaResolverCache;
        this.f69063h = javaPropertyInitializerEvaluator;
        this.f69064i = samConversionResolver;
        this.f69065j = sourceElementFactory;
        this.f69066k = moduleClassResolver;
        this.f69067l = packagePartProvider;
        this.f69068m = supertypeLoopChecker;
        this.f69069n = lookupTracker;
        this.f69070o = module;
        this.f69071p = reflectionTypes;
        this.f69072q = annotationTypeQualifierResolver;
        this.f69073r = signatureEnhancement;
        this.f69074s = javaClassesTracker;
        this.f69075t = settings;
        this.f69076u = kotlinTypeChecker;
        this.f69077v = javaTypeEnhancementState;
        this.f69078w = javaModuleResolver;
        this.f69079x = syntheticPartsProvider;
    }

    @NotNull
    public final AnnotationTypeQualifierResolver getAnnotationTypeQualifierResolver() {
        return this.f69072q;
    }

    @NotNull
    public final DeserializedDescriptorResolver getDeserializedDescriptorResolver() {
        return this.f69059d;
    }

    @NotNull
    public final ErrorReporter getErrorReporter() {
        return this.f69061f;
    }

    @NotNull
    public final JavaClassFinder getFinder() {
        return this.f69057b;
    }

    @NotNull
    public final JavaClassesTracker getJavaClassesTracker() {
        return this.f69074s;
    }

    @NotNull
    public final JavaModuleAnnotationsProvider getJavaModuleResolver() {
        return this.f69078w;
    }

    @NotNull
    public final JavaPropertyInitializerEvaluator getJavaPropertyInitializerEvaluator() {
        return this.f69063h;
    }

    @NotNull
    public final JavaResolverCache getJavaResolverCache() {
        return this.f69062g;
    }

    @NotNull
    public final JavaTypeEnhancementState getJavaTypeEnhancementState() {
        return this.f69077v;
    }

    @NotNull
    public final KotlinClassFinder getKotlinClassFinder() {
        return this.f69058c;
    }

    @NotNull
    public final NewKotlinTypeChecker getKotlinTypeChecker() {
        return this.f69076u;
    }

    @NotNull
    public final LookupTracker getLookupTracker() {
        return this.f69069n;
    }

    @NotNull
    public final ModuleDescriptor getModule() {
        return this.f69070o;
    }

    @NotNull
    public final ModuleClassResolver getModuleClassResolver() {
        return this.f69066k;
    }

    @NotNull
    public final PackagePartProvider getPackagePartProvider() {
        return this.f69067l;
    }

    @NotNull
    public final ReflectionTypes getReflectionTypes() {
        return this.f69071p;
    }

    @NotNull
    public final JavaResolverSettings getSettings() {
        return this.f69075t;
    }

    @NotNull
    public final SignatureEnhancement getSignatureEnhancement() {
        return this.f69073r;
    }

    @NotNull
    public final SignaturePropagator getSignaturePropagator() {
        return this.f69060e;
    }

    @NotNull
    public final JavaSourceElementFactory getSourceElementFactory() {
        return this.f69065j;
    }

    @NotNull
    public final StorageManager getStorageManager() {
        return this.f69056a;
    }

    @NotNull
    public final SupertypeLoopChecker getSupertypeLoopChecker() {
        return this.f69068m;
    }

    @NotNull
    public final SyntheticJavaPartsProvider getSyntheticPartsProvider() {
        return this.f69079x;
    }

    @NotNull
    public final JavaResolverComponents replace(@NotNull JavaResolverCache javaResolverCache) {
        Intrinsics.checkNotNullParameter(javaResolverCache, "javaResolverCache");
        return new JavaResolverComponents(this.f69056a, this.f69057b, this.f69058c, this.f69059d, this.f69060e, this.f69061f, javaResolverCache, this.f69063h, this.f69064i, this.f69065j, this.f69066k, this.f69067l, this.f69068m, this.f69069n, this.f69070o, this.f69071p, this.f69072q, this.f69073r, this.f69074s, this.f69075t, this.f69076u, this.f69077v, this.f69078w, null, 8388608, null);
    }

    public /* synthetic */ JavaResolverComponents(StorageManager storageManager, JavaClassFinder javaClassFinder, KotlinClassFinder kotlinClassFinder, DeserializedDescriptorResolver deserializedDescriptorResolver, SignaturePropagator signaturePropagator, ErrorReporter errorReporter, JavaResolverCache javaResolverCache, JavaPropertyInitializerEvaluator javaPropertyInitializerEvaluator, SamConversionResolver samConversionResolver, JavaSourceElementFactory javaSourceElementFactory, ModuleClassResolver moduleClassResolver, PackagePartProvider packagePartProvider, SupertypeLoopChecker supertypeLoopChecker, LookupTracker lookupTracker, ModuleDescriptor moduleDescriptor, ReflectionTypes reflectionTypes, AnnotationTypeQualifierResolver annotationTypeQualifierResolver, SignatureEnhancement signatureEnhancement, JavaClassesTracker javaClassesTracker, JavaResolverSettings javaResolverSettings, NewKotlinTypeChecker newKotlinTypeChecker, JavaTypeEnhancementState javaTypeEnhancementState, JavaModuleAnnotationsProvider javaModuleAnnotationsProvider, SyntheticJavaPartsProvider syntheticJavaPartsProvider, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(storageManager, javaClassFinder, kotlinClassFinder, deserializedDescriptorResolver, signaturePropagator, errorReporter, javaResolverCache, javaPropertyInitializerEvaluator, samConversionResolver, javaSourceElementFactory, moduleClassResolver, packagePartProvider, supertypeLoopChecker, lookupTracker, moduleDescriptor, reflectionTypes, annotationTypeQualifierResolver, signatureEnhancement, javaClassesTracker, javaResolverSettings, newKotlinTypeChecker, javaTypeEnhancementState, javaModuleAnnotationsProvider, (i & 8388608) != 0 ? SyntheticJavaPartsProvider.Companion.getEMPTY() : syntheticJavaPartsProvider);
    }
}
