package p000;

import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.utils.DFS;

/* renamed from: oG */
/* loaded from: classes6.dex */
public class C12425oG implements DFS.Neighbors {

    /* renamed from: a */
    public final boolean f72720a;

    public C12425oG(boolean z) {
        this.f72720a = z;
    }

    @Override // kotlin.reflect.jvm.internal.impl.utils.DFS.Neighbors
    public Iterable getNeighbors(Object obj) {
        Iterable m28037d;
        m28037d = DescriptorUtilsKt.m28037d(this.f72720a, (CallableMemberDescriptor) obj);
        return m28037d;
    }
}