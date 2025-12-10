package com.tom_roush.pdfbox.pdfparser;

import android.util.Log;
import com.tom_roush.pdfbox.cos.COSDictionary;
import com.tom_roush.pdfbox.cos.COSName;
import com.tom_roush.pdfbox.cos.COSObjectKey;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

/* loaded from: classes5.dex */
public class XrefTrailerResolver {

    /* renamed from: a */
    public final Map f60045a = new HashMap();

    /* renamed from: b */
    public C9912b f60046b = null;

    /* renamed from: c */
    public C9912b f60047c = null;

    /* loaded from: classes5.dex */
    public enum XRefType {
        TABLE,
        STREAM
    }

    /* renamed from: com.tom_roush.pdfbox.pdfparser.XrefTrailerResolver$b */
    /* loaded from: classes5.dex */
    public static class C9912b {

        /* renamed from: a */
        public COSDictionary f60048a;

        /* renamed from: b */
        public XRefType f60049b;

        /* renamed from: c */
        public final Map f60050c;

        /* renamed from: d */
        public void m32631d() {
            this.f60050c.clear();
        }

        public C9912b() {
            this.f60048a = null;
            this.f60050c = new HashMap();
            this.f60049b = XRefType.TABLE;
        }
    }

    public Set<Long> getContainedObjectNumbers(int i) {
        if (this.f60047c == null) {
            return null;
        }
        HashSet hashSet = new HashSet();
        long j = -i;
        for (Map.Entry entry : this.f60047c.f60050c.entrySet()) {
            if (((Long) entry.getValue()).longValue() == j) {
                hashSet.add(Long.valueOf(((COSObjectKey) entry.getKey()).getNumber()));
            }
        }
        return hashSet;
    }

    public COSDictionary getCurrentTrailer() {
        return this.f60046b.f60048a;
    }

    public final COSDictionary getFirstTrailer() {
        if (this.f60045a.isEmpty()) {
            return null;
        }
        return ((C9912b) this.f60045a.get(new TreeSet(this.f60045a.keySet()).first())).f60048a;
    }

    public final COSDictionary getLastTrailer() {
        if (this.f60045a.isEmpty()) {
            return null;
        }
        return ((C9912b) this.f60045a.get(new TreeSet(this.f60045a.keySet()).last())).f60048a;
    }

    public COSDictionary getTrailer() {
        C9912b c9912b = this.f60047c;
        if (c9912b == null) {
            return null;
        }
        return c9912b.f60048a;
    }

    public final int getTrailerCount() {
        return this.f60045a.size();
    }

    public Map<COSObjectKey, Long> getXrefTable() {
        C9912b c9912b = this.f60047c;
        if (c9912b != null) {
            return c9912b.f60050c;
        }
        return null;
    }

    public XRefType getXrefType() {
        C9912b c9912b = this.f60047c;
        if (c9912b != null) {
            return c9912b.f60049b;
        }
        return null;
    }

    public void nextXrefObj(long j, XRefType xRefType) {
        this.f60046b = new C9912b();
        this.f60045a.put(Long.valueOf(j), this.f60046b);
        this.f60046b.f60049b = xRefType;
    }

    public void reset() {
        for (C9912b c9912b : this.f60045a.values()) {
            c9912b.m32631d();
        }
        this.f60046b = null;
        this.f60047c = null;
    }

    public void setStartxref(long j) {
        if (this.f60047c != null) {
            Log.w("PdfBox-Android", "Method must be called only ones with last startxref value.");
            return;
        }
        C9912b c9912b = new C9912b();
        this.f60047c = c9912b;
        c9912b.f60048a = new COSDictionary();
        C9912b c9912b2 = (C9912b) this.f60045a.get(Long.valueOf(j));
        ArrayList<Long> arrayList = new ArrayList();
        if (c9912b2 != null) {
            this.f60047c.f60049b = c9912b2.f60049b;
            arrayList.add(Long.valueOf(j));
            while (true) {
                COSDictionary cOSDictionary = c9912b2.f60048a;
                if (cOSDictionary == null) {
                    break;
                }
                long j2 = cOSDictionary.getLong(COSName.PREV, -1L);
                if (j2 == -1) {
                    break;
                }
                c9912b2 = (C9912b) this.f60045a.get(Long.valueOf(j2));
                if (c9912b2 == null) {
                    Log.w("PdfBox-Android", "Did not found XRef object pointed to by 'Prev' key at position " + j2);
                    break;
                }
                arrayList.add(Long.valueOf(j2));
                if (arrayList.size() >= this.f60045a.size()) {
                    break;
                }
            }
            Collections.reverse(arrayList);
        } else {
            Log.w("PdfBox-Android", "Did not found XRef object at specified startxref position " + j);
            arrayList.addAll(this.f60045a.keySet());
            Collections.sort(arrayList);
        }
        for (Long l : arrayList) {
            C9912b c9912b3 = (C9912b) this.f60045a.get(l);
            COSDictionary cOSDictionary2 = c9912b3.f60048a;
            if (cOSDictionary2 != null) {
                this.f60047c.f60048a.addAll(cOSDictionary2);
            }
            this.f60047c.f60050c.putAll(c9912b3.f60050c);
        }
    }

    public void setTrailer(COSDictionary cOSDictionary) {
        C9912b c9912b = this.f60046b;
        if (c9912b == null) {
            Log.w("PdfBox-Android", "Cannot add trailer because XRef start was not signalled.");
        } else {
            c9912b.f60048a = cOSDictionary;
        }
    }

    public void setXRef(COSObjectKey cOSObjectKey, long j) {
        C9912b c9912b = this.f60046b;
        if (c9912b == null) {
            Log.w("PdfBox-Android", "Cannot add XRef entry for '" + cOSObjectKey.getNumber() + "' because XRef start was not signalled.");
        } else if (!c9912b.f60050c.containsKey(cOSObjectKey)) {
            this.f60046b.f60050c.put(cOSObjectKey, Long.valueOf(j));
        }
    }
}
