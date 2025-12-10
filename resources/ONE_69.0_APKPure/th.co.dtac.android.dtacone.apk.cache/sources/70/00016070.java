package p000;

import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaStaticClassScope;
import kotlin.reflect.jvm.internal.impl.utils.DFS;

/* renamed from: wi0  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C22902wi0 implements DFS.Neighbors {

    /* renamed from: a */
    public static final C22902wi0 f108535a = new C22902wi0();

    @Override // kotlin.reflect.jvm.internal.impl.utils.DFS.Neighbors
    public Iterable getNeighbors(Object obj) {
        Iterable m28622k;
        m28622k = LazyJavaStaticClassScope.m28622k((ClassDescriptor) obj);
        return m28622k;
    }
}