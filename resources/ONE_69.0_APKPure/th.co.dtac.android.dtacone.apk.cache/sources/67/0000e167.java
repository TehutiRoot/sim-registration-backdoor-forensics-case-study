package kotlin.reflect.jvm.internal.impl.resolve.scopes;

import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.resolve.DescriptorFactory;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes6.dex */
public final class StaticScopeForKotlinEnum$functions$2 extends Lambda implements Function0<List<? extends SimpleFunctionDescriptor>> {
    final /* synthetic */ StaticScopeForKotlinEnum this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StaticScopeForKotlinEnum$functions$2(StaticScopeForKotlinEnum staticScopeForKotlinEnum) {
        super(0);
        this.this$0 = staticScopeForKotlinEnum;
    }

    @Override // kotlin.jvm.functions.Function0
    @NotNull
    public final List<? extends SimpleFunctionDescriptor> invoke() {
        ClassDescriptor classDescriptor;
        ClassDescriptor classDescriptor2;
        classDescriptor = this.this$0.f69995a;
        SimpleFunctionDescriptor createEnumValueOfMethod = DescriptorFactory.createEnumValueOfMethod(classDescriptor);
        classDescriptor2 = this.this$0.f69995a;
        return CollectionsKt__CollectionsKt.listOf((Object[]) new SimpleFunctionDescriptor[]{createEnumValueOfMethod, DescriptorFactory.createEnumValuesMethod(classDescriptor2)});
    }
}