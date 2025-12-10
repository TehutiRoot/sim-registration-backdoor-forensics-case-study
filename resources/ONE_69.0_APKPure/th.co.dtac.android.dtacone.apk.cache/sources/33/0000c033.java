package com.tom_roush.fontbox.afm;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes5.dex */
public class Composite {

    /* renamed from: a */
    public String f59194a;

    /* renamed from: b */
    public List f59195b = new ArrayList();

    public void addPart(CompositePart compositePart) {
        this.f59195b.add(compositePart);
    }

    public String getName() {
        return this.f59194a;
    }

    public List<CompositePart> getParts() {
        return this.f59195b;
    }

    public void setName(String str) {
        this.f59194a = str;
    }

    public void setParts(List<CompositePart> list) {
        this.f59195b = list;
    }
}