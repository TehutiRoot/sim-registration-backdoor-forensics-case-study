package p000;

import kotlin.reflect.KType;
import kotlin.reflect.full.KClasses;
import kotlin.reflect.jvm.internal.impl.utils.DFS;

/* renamed from: Hh0  reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C17760Hh0 implements DFS.Neighbors {

    /* renamed from: a */
    public static final C17760Hh0 f2450a = new C17760Hh0();

    @Override // kotlin.reflect.jvm.internal.impl.utils.DFS.Neighbors
    public Iterable getNeighbors(Object obj) {
        Iterable m29007a;
        m29007a = KClasses.m29007a((KType) obj);
        return m29007a;
    }
}