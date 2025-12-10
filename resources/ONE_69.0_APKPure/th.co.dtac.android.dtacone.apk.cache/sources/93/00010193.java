package org.bson;

/* loaded from: classes6.dex */
public class BsonWriterSettings {

    /* renamed from: a */
    public final int f75865a;

    public BsonWriterSettings(int i) {
        this.f75865a = i;
    }

    public int getMaxSerializationDepth() {
        return this.f75865a;
    }

    public BsonWriterSettings() {
        this(1024);
    }
}