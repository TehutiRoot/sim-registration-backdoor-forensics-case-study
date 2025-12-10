package p000;

import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaStaticClassScope;
import kotlin.reflect.jvm.internal.impl.utils.DFS;

/* renamed from: qi0  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C21801qi0 implements DFS.Neighbors {

    /* renamed from: a */
    public static final C21801qi0 f77043a = new C21801qi0();

    @Override // kotlin.reflect.jvm.internal.impl.utils.DFS.Neighbors
    public Iterable getNeighbors(Object obj) {
        Iterable m28330k;
        m28330k = LazyJavaStaticClassScope.m28330k((ClassDescriptor) obj);
        return m28330k;
    }
}
