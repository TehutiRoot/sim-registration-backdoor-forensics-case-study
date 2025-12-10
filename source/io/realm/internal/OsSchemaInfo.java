package io.realm.internal;

import java.util.Collection;
import java.util.Iterator;

/* loaded from: classes5.dex */
public class OsSchemaInfo implements NativeObject {

    /* renamed from: c */
    public static final long f66753c = nativeGetFinalizerPtr();

    /* renamed from: a */
    public long f66754a;

    /* renamed from: b */
    public final OsSharedRealm f66755b;

    public OsSchemaInfo(Collection<OsObjectSchemaInfo> collection) {
        this.f66754a = nativeCreateFromList(m29534a(collection));
        NativeContext.dummyContext.addReference(this);
        this.f66755b = null;
    }

    /* renamed from: a */
    public static long[] m29534a(Collection collection) {
        long[] jArr = new long[collection.size()];
        Iterator it = collection.iterator();
        int i = 0;
        while (it.hasNext()) {
            jArr[i] = ((OsObjectSchemaInfo) it.next()).getNativePtr();
            i++;
        }
        return jArr;
    }

    private static native long nativeCreateFromList(long[] jArr);

    private static native long nativeGetFinalizerPtr();

    private static native long nativeGetObjectSchemaInfo(long j, String str);

    @Override // io.realm.internal.NativeObject
    public long getNativeFinalizerPtr() {
        return f66753c;
    }

    @Override // io.realm.internal.NativeObject
    public long getNativePtr() {
        return this.f66754a;
    }

    public OsObjectSchemaInfo getObjectSchemaInfo(String str) {
        return new OsObjectSchemaInfo(nativeGetObjectSchemaInfo(this.f66754a, str));
    }

    public OsSchemaInfo(long j, OsSharedRealm osSharedRealm) {
        this.f66754a = j;
        this.f66755b = osSharedRealm;
    }
}
