package com.tom_roush.pdfbox.pdmodel.documentinterchange.logicalstructure;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes5.dex */
public class Revisions<T> {

    /* renamed from: a */
    public List f60274a;

    /* renamed from: b */
    public List f60275b;

    /* renamed from: a */
    public final List m32524a() {
        if (this.f60274a == null) {
            this.f60274a = new ArrayList();
        }
        return this.f60274a;
    }

    public void addObject(T t, int i) {
        m32524a().add(t);
        m32523b().add(Integer.valueOf(i));
    }

    /* renamed from: b */
    public final List m32523b() {
        if (this.f60275b == null) {
            this.f60275b = new ArrayList();
        }
        return this.f60275b;
    }

    public T getObject(int i) {
        return (T) m32524a().get(i);
    }

    public int getRevisionNumber(int i) {
        return ((Integer) m32523b().get(i)).intValue();
    }

    public void setRevisionNumber(T t, int i) {
        int indexOf = m32524a().indexOf(t);
        if (indexOf > -1) {
            m32523b().set(indexOf, Integer.valueOf(i));
        }
    }

    public int size() {
        return m32524a().size();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < m32524a().size(); i++) {
            if (i > 0) {
                sb.append("; ");
            }
            sb.append("object=");
            sb.append(m32524a().get(i));
            sb.append(", revisionNumber=");
            sb.append(getRevisionNumber(i));
        }
        return sb.toString();
    }
}
