package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentProvider;
import org.jetbrains.annotations.NotNull;

@SourceDebugExtension({"SMAP\nModuleDescriptorImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ModuleDescriptorImpl.kt\norg/jetbrains/kotlin/descriptors/impl/ModuleDescriptorImpl$packageFragmentProviderForWholeModuleWithDependencies$2\n+ 2 coreLib.kt\norg/jetbrains/kotlin/utils/CoreLibKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,176:1\n19#2:177\n1#3:178\n1855#4,2:179\n1549#4:181\n1620#4,3:182\n*S KotlinDebug\n*F\n+ 1 ModuleDescriptorImpl.kt\norg/jetbrains/kotlin/descriptors/impl/ModuleDescriptorImpl$packageFragmentProviderForWholeModuleWithDependencies$2\n*L\n91#1:177\n95#1:179,2\n101#1:181\n101#1:182,3\n*E\n"})
/* renamed from: kotlin.reflect.jvm.internal.impl.descriptors.impl.ModuleDescriptorImpl$packageFragmentProviderForWholeModuleWithDependencies$2 */
/* loaded from: classes6.dex */
public final class C11758x39a25915 extends Lambda implements Function0<CompositePackageFragmentProvider> {
    final /* synthetic */ ModuleDescriptorImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11758x39a25915(ModuleDescriptorImpl moduleDescriptorImpl) {
        super(0);
        this.this$0 = moduleDescriptorImpl;
    }

    @Override // kotlin.jvm.functions.Function0
    @NotNull
    public final CompositePackageFragmentProvider invoke() {
        ModuleDependencies moduleDependencies;
        String m28785b;
        PackageFragmentProvider packageFragmentProvider;
        moduleDependencies = this.this$0.f68821i;
        ModuleDescriptorImpl moduleDescriptorImpl = this.this$0;
        if (moduleDependencies != null) {
            List<ModuleDescriptorImpl> allDependencies = moduleDependencies.getAllDependencies();
            this.this$0.assertValid();
            allDependencies.contains(this.this$0);
            List<ModuleDescriptorImpl> list = allDependencies;
            for (ModuleDescriptorImpl moduleDescriptorImpl2 : list) {
                moduleDescriptorImpl2.isInitialized();
            }
            ArrayList arrayList = new ArrayList(AbstractC10172es.collectionSizeOrDefault(list, 10));
            for (ModuleDescriptorImpl moduleDescriptorImpl3 : list) {
                packageFragmentProvider = moduleDescriptorImpl3.f68822j;
                Intrinsics.checkNotNull(packageFragmentProvider);
                arrayList.add(packageFragmentProvider);
            }
            return new CompositePackageFragmentProvider(arrayList, "CompositeProvider@ModuleDescriptor for " + this.this$0.getName());
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Dependencies of module ");
        m28785b = moduleDescriptorImpl.m28785b();
        sb.append(m28785b);
        sb.append(" were not set before querying module content");
        throw new AssertionError(sb.toString());
    }
}