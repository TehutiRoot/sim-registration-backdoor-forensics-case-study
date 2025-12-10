package p000;

import java.util.Comparator;
import kotlin.jvm.functions.Function2;
import kotlin.reflect.jvm.internal.KDeclarationContainerImpl;

/* renamed from: Dh0  reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C17474Dh0 implements Comparator {

    /* renamed from: a */
    public final Function2 f1073a;

    public C17474Dh0(Function2 function2) {
        this.f1073a = function2;
    }

    @Override // java.util.Comparator
    public int compare(Object obj, Object obj2) {
        int m28692c;
        m28692c = KDeclarationContainerImpl.m28692c(this.f1073a, obj, obj2);
        return m28692c;
    }
}
