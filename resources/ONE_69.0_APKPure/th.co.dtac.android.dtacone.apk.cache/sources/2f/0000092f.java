package p000;

import java.util.Comparator;
import kotlin.jvm.functions.Function2;
import kotlin.reflect.jvm.internal.KDeclarationContainerImpl;

/* renamed from: Jh0  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C17890Jh0 implements Comparator {

    /* renamed from: a */
    public final Function2 f3074a;

    public C17890Jh0(Function2 function2) {
        this.f3074a = function2;
    }

    @Override // java.util.Comparator
    public int compare(Object obj, Object obj2) {
        int m28984c;
        m28984c = KDeclarationContainerImpl.m28984c(this.f3074a, obj, obj2);
        return m28984c;
    }
}