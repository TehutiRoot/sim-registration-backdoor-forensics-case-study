package com.tom_roush.pdfbox.pdmodel.interactive.form;

import com.tom_roush.pdfbox.cos.COSArray;
import com.tom_roush.pdfbox.cos.COSBase;
import com.tom_roush.pdfbox.cos.COSString;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes5.dex */
public final class FieldUtils {

    /* loaded from: classes5.dex */
    public static class KeyValueKeyComparator implements Serializable, Comparator<C9947a> {
        private static final long serialVersionUID = 6715364290007167694L;

        @Override // java.util.Comparator
        public int compare(C9947a c9947a, C9947a c9947a2) {
            return c9947a.f60702a.compareTo(c9947a2.f60702a);
        }
    }

    /* loaded from: classes5.dex */
    public static class KeyValueValueComparator implements Serializable, Comparator<C9947a> {
        private static final long serialVersionUID = -3984095679894798265L;

        @Override // java.util.Comparator
        public int compare(C9947a c9947a, C9947a c9947a2) {
            return c9947a.f60703b.compareTo(c9947a2.f60703b);
        }
    }

    /* renamed from: com.tom_roush.pdfbox.pdmodel.interactive.form.FieldUtils$a */
    /* loaded from: classes5.dex */
    public static class C9947a {

        /* renamed from: a */
        public final String f60702a;

        /* renamed from: b */
        public final String f60703b;

        public C9947a(String str, String str2) {
            this.f60702a = str;
            this.f60703b = str2;
        }

        /* renamed from: c */
        public String m32246c() {
            return this.f60702a;
        }

        /* renamed from: d */
        public String m32245d() {
            return this.f60703b;
        }

        public String toString() {
            return "(" + this.f60702a + ", " + this.f60703b + ")";
        }
    }

    /* renamed from: a */
    public static List m32251a(COSBase cOSBase, int i) {
        if (i >= 0 && i <= 1) {
            if (cOSBase instanceof COSString) {
                ArrayList arrayList = new ArrayList(1);
                arrayList.add(((COSString) cOSBase).getString());
                return arrayList;
            } else if (cOSBase instanceof COSArray) {
                ArrayList arrayList2 = new ArrayList();
                Iterator<COSBase> it = ((COSArray) cOSBase).iterator();
                while (it.hasNext()) {
                    COSBase next = it.next();
                    if (next instanceof COSString) {
                        arrayList2.add(((COSString) next).getString());
                    } else if (next instanceof COSArray) {
                        COSArray cOSArray = (COSArray) next;
                        if (cOSArray.size() >= i + 1 && (cOSArray.get(i) instanceof COSString)) {
                            arrayList2.add(((COSString) cOSArray.get(i)).getString());
                        }
                    }
                }
                return arrayList2;
            } else {
                return Collections.emptyList();
            }
        }
        throw new IllegalArgumentException("Only 0 and 1 are allowed as an index into two-element arrays");
    }

    /* renamed from: b */
    public static void m32250b(List list) {
        Collections.sort(list, new KeyValueValueComparator());
    }

    /* renamed from: c */
    public static List m32249c(List list, List list2) {
        ArrayList arrayList = new ArrayList(list.size());
        for (int i = 0; i < list.size(); i++) {
            arrayList.add(new C9947a((String) list.get(i), (String) list2.get(i)));
        }
        return arrayList;
    }
}