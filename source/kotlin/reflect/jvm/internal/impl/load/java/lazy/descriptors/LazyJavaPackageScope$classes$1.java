package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.JavaClassFinder;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaResolverContext;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaPackageScope;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaClass;
import kotlin.reflect.jvm.internal.impl.load.java.structure.LightClassOriginKind;
import kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinClassFinder;
import kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinClassFinderKt;
import kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmMetadataVersion;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@SourceDebugExtension({"SMAP\nLazyJavaPackageScope.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyJavaPackageScope.kt\norg/jetbrains/kotlin/load/java/lazy/descriptors/LazyJavaPackageScope$classes$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,189:1\n1#2:190\n*E\n"})
/* loaded from: classes6.dex */
public final class LazyJavaPackageScope$classes$1 extends Lambda implements Function1<LazyJavaPackageScope.C11799a, ClassDescriptor> {

    /* renamed from: $c */
    final /* synthetic */ LazyJavaResolverContext f69163$c;
    final /* synthetic */ LazyJavaPackageScope this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LazyJavaPackageScope$classes$1(LazyJavaPackageScope lazyJavaPackageScope, LazyJavaResolverContext lazyJavaResolverContext) {
        super(1);
        this.this$0 = lazyJavaPackageScope;
        this.f69163$c = lazyJavaResolverContext;
    }

    @Override // kotlin.jvm.functions.Function1
    @Nullable
    public final ClassDescriptor invoke(@NotNull LazyJavaPackageScope.C11799a request) {
        JvmMetadataVersion m28344j;
        KotlinClassFinder.Result findKotlinClassOrContent;
        LazyJavaPackageScope.KotlinClassLookupResult m28343k;
        JvmMetadataVersion m28344j2;
        JvmMetadataVersion m28344j3;
        JvmMetadataVersion m28344j4;
        Intrinsics.checkNotNullParameter(request, "request");
        ClassId classId = new ClassId(this.this$0.getOwnerDescriptor().getFqName(), request.m28341b());
        if (request.m28342a() != null) {
            KotlinClassFinder kotlinClassFinder = this.f69163$c.getComponents().getKotlinClassFinder();
            JavaClass m28342a = request.m28342a();
            m28344j4 = this.this$0.m28344j();
            findKotlinClassOrContent = kotlinClassFinder.findKotlinClassOrContent(m28342a, m28344j4);
        } else {
            KotlinClassFinder kotlinClassFinder2 = this.f69163$c.getComponents().getKotlinClassFinder();
            m28344j = this.this$0.m28344j();
            findKotlinClassOrContent = kotlinClassFinder2.findKotlinClassOrContent(classId, m28344j);
        }
        KotlinJvmBinaryClass kotlinJvmBinaryClass = findKotlinClassOrContent != null ? findKotlinClassOrContent.toKotlinJvmBinaryClass() : null;
        ClassId classId2 = kotlinJvmBinaryClass != null ? kotlinJvmBinaryClass.getClassId() : null;
        if (classId2 == null || !(classId2.isNestedClass() || classId2.isLocal())) {
            m28343k = this.this$0.m28343k(kotlinJvmBinaryClass);
            if (m28343k instanceof LazyJavaPackageScope.KotlinClassLookupResult.Found) {
                return ((LazyJavaPackageScope.KotlinClassLookupResult.Found) m28343k).getDescriptor();
            }
            if (m28343k instanceof LazyJavaPackageScope.KotlinClassLookupResult.SyntheticClass) {
                return null;
            }
            if (m28343k instanceof LazyJavaPackageScope.KotlinClassLookupResult.NotFound) {
                JavaClass m28342a2 = request.m28342a();
                if (m28342a2 == null) {
                    JavaClassFinder finder = this.f69163$c.getComponents().getFinder();
                    KotlinClassFinder.Result.ClassFileContent classFileContent = findKotlinClassOrContent instanceof KotlinClassFinder.Result.ClassFileContent ? (KotlinClassFinder.Result.ClassFileContent) findKotlinClassOrContent : null;
                    m28342a2 = finder.findClass(new JavaClassFinder.Request(classId, classFileContent != null ? classFileContent.getContent() : null, null, 4, null));
                }
                JavaClass javaClass = m28342a2;
                if ((javaClass != null ? javaClass.getLightClassOriginKind() : null) != LightClassOriginKind.BINARY) {
                    FqName fqName = javaClass != null ? javaClass.getFqName() : null;
                    if (fqName == null || fqName.isRoot() || !Intrinsics.areEqual(fqName.parent(), this.this$0.getOwnerDescriptor().getFqName())) {
                        return null;
                    }
                    LazyJavaClassDescriptor lazyJavaClassDescriptor = new LazyJavaClassDescriptor(this.f69163$c, this.this$0.getOwnerDescriptor(), javaClass, null, 8, null);
                    this.f69163$c.getComponents().getJavaClassesTracker().reportClass(lazyJavaClassDescriptor);
                    return lazyJavaClassDescriptor;
                }
                StringBuilder sb = new StringBuilder();
                sb.append("Couldn't find kotlin binary class for light class created by kotlin binary file\nJavaClass: ");
                sb.append(javaClass);
                sb.append("\nClassId: ");
                sb.append(classId);
                sb.append("\nfindKotlinClass(JavaClass) = ");
                KotlinClassFinder kotlinClassFinder3 = this.f69163$c.getComponents().getKotlinClassFinder();
                m28344j2 = this.this$0.m28344j();
                sb.append(KotlinClassFinderKt.findKotlinClass(kotlinClassFinder3, javaClass, m28344j2));
                sb.append("\nfindKotlinClass(ClassId) = ");
                KotlinClassFinder kotlinClassFinder4 = this.f69163$c.getComponents().getKotlinClassFinder();
                m28344j3 = this.this$0.m28344j();
                sb.append(KotlinClassFinderKt.findKotlinClass(kotlinClassFinder4, classId, m28344j3));
                sb.append('\n');
                throw new IllegalStateException(sb.toString());
            }
            throw new NoWhenBranchMatchedException();
        }
        return null;
    }
}
