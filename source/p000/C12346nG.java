package p000;

import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.utils.DFS;

/* renamed from: nG */
/* loaded from: classes6.dex */
public class C12346nG implements DFS.Neighbors {

    /* renamed from: a */
    public final boolean f72173a;

    public C12346nG(boolean z) {
        this.f72173a = z;
    }

    @Override // kotlin.reflect.jvm.internal.impl.utils.DFS.Neighbors
    public Iterable getNeighbors(Object obj) {
        Iterable m27745d;
        m27745d = DescriptorUtilsKt.m27745d(this.f72173a, (CallableMemberDescriptor) obj);
        return m27745d;
    }
}
