package com.tom_roush.pdfbox.pdmodel.documentinterchange.logicalstructure;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes5.dex */
public class Revisions<T> {

    /* renamed from: a */
    public List f60286a;

    /* renamed from: b */
    public List f60287b;

    /* renamed from: a */
    public final List m32516a() {
        if (this.f60286a == null) {
            this.f60286a = new ArrayList();
        }
        return this.f60286a;
    }

    public void addObject(T t, int i) {
        m32516a().add(t);
        m32515b().add(Integer.valueOf(i));
    }

    /* renamed from: b */
    public final List m32515b() {
        if (this.f60287b == null) {
            this.f60287b = new ArrayList();
        }
        return this.f60287b;
    }

    public T getObject(int i) {
        return (T) m32516a().get(i);
    }

    public int getRevisionNumber(int i) {
        return ((Integer) m32515b().get(i)).intValue();
    }

    public void setRevisionNumber(T t, int i) {
        int indexOf = m32516a().indexOf(t);
        if (indexOf > -1) {
            m32515b().set(indexOf, Integer.valueOf(i));
        }
    }

    public int size() {
        return m32516a().size();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < m32516a().size(); i++) {
            if (i > 0) {
                sb.append("; ");
            }
            sb.append("object=");
            sb.append(m32516a().get(i));
            sb.append(", revisionNumber=");
            sb.append(getRevisionNumber(i));
        }
        return sb.toString();
    }
}