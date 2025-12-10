package p000;

import kotlin.reflect.KType;
import kotlin.reflect.full.KClasses;
import kotlin.reflect.jvm.internal.impl.utils.DFS;

/* renamed from: Bh0  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C17346Bh0 implements DFS.Neighbors {

    /* renamed from: a */
    public static final C17346Bh0 f464a = new C17346Bh0();

    @Override // kotlin.reflect.jvm.internal.impl.utils.DFS.Neighbors
    public Iterable getNeighbors(Object obj) {
        Iterable m28715a;
        m28715a = KClasses.m28715a((KType) obj);
        return m28715a;
    }
}
