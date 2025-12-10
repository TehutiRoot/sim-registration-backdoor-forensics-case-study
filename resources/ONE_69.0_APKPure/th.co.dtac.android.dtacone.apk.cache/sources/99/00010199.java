package org.bson;

import java.util.List;
import org.bson.types.ObjectId;

/* loaded from: classes6.dex */
public class LazyBSONCallback extends EmptyBSONCallback {

    /* renamed from: a */
    public Object f75868a;

    /* renamed from: b */
    private void m24509b(Object obj) {
        this.f75868a = obj;
    }

    /* renamed from: a */
    public final Object m24510a() {
        return this.f75868a;
    }

    public List createArray(byte[] bArr, int i) {
        return new LazyBSONList(bArr, i, this);
    }

    public Object createDBRef(String str, ObjectId objectId) {
        return new BasicBSONObject("$ns", str).append("$id", objectId);
    }

    public Object createObject(byte[] bArr, int i) {
        return new LazyBSONObject(bArr, i, this);
    }

    @Override // org.bson.EmptyBSONCallback, org.bson.BSONCallback
    public Object get() {
        return m24510a();
    }

    @Override // org.bson.EmptyBSONCallback, org.bson.BSONCallback
    public void gotBinary(String str, byte b, byte[] bArr) {
        m24509b(createObject(bArr, 0));
    }

    @Override // org.bson.EmptyBSONCallback, org.bson.BSONCallback
    public void reset() {
        this.f75868a = null;
    }
}