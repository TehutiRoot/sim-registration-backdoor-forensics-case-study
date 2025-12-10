package com.tom_roush.pdfbox.pdmodel.interactive.form;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Queue;
import java.util.Set;

/* loaded from: classes5.dex */
public class PDFieldTree implements Iterable<PDField> {

    /* renamed from: a */
    public final PDAcroForm f60699a;

    /* renamed from: com.tom_roush.pdfbox.pdmodel.interactive.form.PDFieldTree$b */
    /* loaded from: classes5.dex */
    public static final class C9960b implements Iterator {

        /* renamed from: a */
        public final Queue f60700a;

        /* renamed from: b */
        public final Set f60701b;

        /* renamed from: a */
        public final void m32234a(PDField pDField) {
            this.f60700a.add(pDField);
            this.f60701b.add(pDField.getCOSObject());
            if (pDField instanceof PDNonTerminalField) {
                for (PDField pDField2 : ((PDNonTerminalField) pDField).getChildren()) {
                    if (this.f60701b.contains(pDField2.getCOSObject())) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("Child of field '");
                        sb.append(pDField.getFullyQualifiedName());
                        sb.append("' already exists elsewhere, ignored to avoid recursion");
                    } else {
                        m32234a(pDField2);
                    }
                }
            }
        }

        @Override // java.util.Iterator
        /* renamed from: b */
        public PDField next() {
            if (hasNext()) {
                return (PDField) this.f60700a.poll();
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return !this.f60700a.isEmpty();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }

        public C9960b(PDAcroForm pDAcroForm) {
            this.f60700a = new ArrayDeque();
            this.f60701b = Collections.newSetFromMap(new IdentityHashMap());
            for (PDField pDField : pDAcroForm.getFields()) {
                m32234a(pDField);
            }
        }
    }

    public PDFieldTree(PDAcroForm pDAcroForm) {
        if (pDAcroForm != null) {
            this.f60699a = pDAcroForm;
            return;
        }
        throw new IllegalArgumentException("root cannot be null");
    }

    @Override // java.lang.Iterable
    public Iterator<PDField> iterator() {
        return new C9960b(this.f60699a);
    }
}
