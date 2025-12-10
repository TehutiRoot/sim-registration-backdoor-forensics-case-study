package p000;

import kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltInsCustomizer;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.utils.DFS;

/* renamed from: Gh0  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C17695Gh0 implements DFS.Neighbors {

    /* renamed from: a */
    public final JvmBuiltInsCustomizer f2051a;

    public C17695Gh0(JvmBuiltInsCustomizer jvmBuiltInsCustomizer) {
        this.f2051a = jvmBuiltInsCustomizer;
    }

    @Override // kotlin.reflect.jvm.internal.impl.utils.DFS.Neighbors
    public Iterable getNeighbors(Object obj) {
        Iterable m28872j;
        m28872j = JvmBuiltInsCustomizer.m28872j(this.f2051a, (ClassDescriptor) obj);
        return m28872j;
    }
}