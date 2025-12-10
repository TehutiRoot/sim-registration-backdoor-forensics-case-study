package kotlin.reflect.jvm.internal;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.KClassImpl;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.FindClassInModuleKt;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.RuntimeModuleData;
import kotlin.reflect.jvm.internal.impl.name.ClassId;

@Metadata(m28851d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001\"\b\b\u0000\u0010\u0003*\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, m28850d2 = {"<anonymous>", "Lkotlin/reflect/jvm/internal/impl/descriptors/ClassDescriptor;", "kotlin.jvm.PlatformType", "T", "", "invoke"}, m28849k = 3, m28848mv = {1, 8, 0}, m28846xi = 48)
/* loaded from: classes6.dex */
public final class KClassImpl$Data$descriptor$2 extends Lambda implements Function0<ClassDescriptor> {
    final /* synthetic */ KClassImpl<T> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KClassImpl$Data$descriptor$2(KClassImpl<T> kClassImpl) {
        super(0);
        this.this$0 = kClassImpl;
    }

    @Override // kotlin.jvm.functions.Function0
    public final ClassDescriptor invoke() {
        ClassId m28700j;
        m28700j = this.this$0.m28700j();
        RuntimeModuleData moduleData = ((KClassImpl.Data) this.this$0.getData().invoke()).getModuleData();
        ClassDescriptor deserializeClass = m28700j.isLocal() ? moduleData.getDeserialization().deserializeClass(m28700j) : FindClassInModuleKt.findClassAcrossModuleDependencies(moduleData.getModule(), m28700j);
        if (deserializeClass != null) {
            return deserializeClass;
        }
        this.this$0.m28699k();
        throw null;
    }
}
