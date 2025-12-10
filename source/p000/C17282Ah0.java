package p000;

import kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltInsCustomizer;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.utils.DFS;

/* renamed from: Ah0  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C17282Ah0 implements DFS.Neighbors {

    /* renamed from: a */
    public final JvmBuiltInsCustomizer f168a;

    public C17282Ah0(JvmBuiltInsCustomizer jvmBuiltInsCustomizer) {
        this.f168a = jvmBuiltInsCustomizer;
    }

    @Override // kotlin.reflect.jvm.internal.impl.utils.DFS.Neighbors
    public Iterable getNeighbors(Object obj) {
        Iterable m28580j;
        m28580j = JvmBuiltInsCustomizer.m28580j(this.f168a, (ClassDescriptor) obj);
        return m28580j;
    }
}
