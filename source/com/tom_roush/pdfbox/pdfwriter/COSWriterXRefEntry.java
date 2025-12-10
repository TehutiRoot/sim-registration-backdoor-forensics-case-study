package com.tom_roush.pdfbox.pdfwriter;

import com.tom_roush.pdfbox.cos.COSBase;
import com.tom_roush.pdfbox.cos.COSObjectKey;

/* loaded from: classes5.dex */
public class COSWriterXRefEntry implements Comparable<COSWriterXRefEntry> {

    /* renamed from: e */
    public static final COSWriterXRefEntry f60082e;

    /* renamed from: a */
    public long f60083a;

    /* renamed from: b */
    public COSBase f60084b;

    /* renamed from: c */
    public COSObjectKey f60085c;

    /* renamed from: d */
    public boolean f60086d = false;

    static {
        COSWriterXRefEntry cOSWriterXRefEntry = new COSWriterXRefEntry(0L, null, new COSObjectKey(0L, 65535));
        f60082e = cOSWriterXRefEntry;
        cOSWriterXRefEntry.setFree(true);
    }

    public COSWriterXRefEntry(long j, COSBase cOSBase, COSObjectKey cOSObjectKey) {
        setOffset(j);
        m32615b(cOSBase);
        m32616a(cOSObjectKey);
    }

    public static COSWriterXRefEntry getNullEntry() {
        return f60082e;
    }

    /* renamed from: a */
    public final void m32616a(COSObjectKey cOSObjectKey) {
        this.f60085c = cOSObjectKey;
    }

    /* renamed from: b */
    public final void m32615b(COSBase cOSBase) {
        this.f60084b = cOSBase;
    }

    public COSObjectKey getKey() {
        return this.f60085c;
    }

    public COSBase getObject() {
        return this.f60084b;
    }

    public long getOffset() {
        return this.f60083a;
    }

    public boolean isFree() {
        return this.f60086d;
    }

    public void setFree(boolean z) {
        this.f60086d = z;
    }

    public final void setOffset(long j) {
        this.f60083a = j;
    }

    @Override // java.lang.Comparable
    public int compareTo(COSWriterXRefEntry cOSWriterXRefEntry) {
        if (cOSWriterXRefEntry == null || getKey().getNumber() < cOSWriterXRefEntry.getKey().getNumber()) {
            return -1;
        }
        return getKey().getNumber() > cOSWriterXRefEntry.getKey().getNumber() ? 1 : 0;
    }
}
