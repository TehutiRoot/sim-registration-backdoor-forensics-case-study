package org.bson;

/* loaded from: classes6.dex */
public class BsonBinaryWriterSettings {

    /* renamed from: a */
    public final int f75743a;

    public BsonBinaryWriterSettings(int i) {
        this.f75743a = i;
    }

    public int getMaxDocumentSize() {
        return this.f75743a;
    }

    public BsonBinaryWriterSettings() {
        this(Integer.MAX_VALUE);
    }
}
