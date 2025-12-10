package p000;

import kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.utils.DFS;

/* renamed from: mG */
/* loaded from: classes6.dex */
public class C12274mG implements DFS.Neighbors {

    /* renamed from: a */
    public static final C12274mG f71864a = new C12274mG();

    @Override // kotlin.reflect.jvm.internal.impl.utils.DFS.Neighbors
    public Iterable getNeighbors(Object obj) {
        Iterable m27746c;
        m27746c = DescriptorUtilsKt.m27746c((ValueParameterDescriptor) obj);
        return m27746c;
    }
}
