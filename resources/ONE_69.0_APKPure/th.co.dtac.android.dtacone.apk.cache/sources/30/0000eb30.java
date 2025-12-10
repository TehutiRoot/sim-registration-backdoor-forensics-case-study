package p000;

import kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.utils.DFS;

/* renamed from: nG */
/* loaded from: classes6.dex */
public class C12338nG implements DFS.Neighbors {

    /* renamed from: a */
    public static final C12338nG f72308a = new C12338nG();

    @Override // kotlin.reflect.jvm.internal.impl.utils.DFS.Neighbors
    public Iterable getNeighbors(Object obj) {
        Iterable m28038c;
        m28038c = DescriptorUtilsKt.m28038c((ValueParameterDescriptor) obj);
        return m28038c;
    }
}