package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageViewDescriptor;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes6.dex */
public final class ModuleDescriptorImpl$packages$1 extends Lambda implements Function1<FqName, PackageViewDescriptor> {
    final /* synthetic */ ModuleDescriptorImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ModuleDescriptorImpl$packages$1(ModuleDescriptorImpl moduleDescriptorImpl) {
        super(1);
        this.this$0 = moduleDescriptorImpl;
    }

    @Override // kotlin.jvm.functions.Function1
    @NotNull
    public final PackageViewDescriptor invoke(@NotNull FqName fqName) {
        PackageViewDescriptorFactory packageViewDescriptorFactory;
        StorageManager storageManager;
        Intrinsics.checkNotNullParameter(fqName, "fqName");
        packageViewDescriptorFactory = this.this$0.f68820h;
        ModuleDescriptorImpl moduleDescriptorImpl = this.this$0;
        storageManager = moduleDescriptorImpl.f68815c;
        return packageViewDescriptorFactory.compute(moduleDescriptorImpl, fqName, storageManager);
    }
}