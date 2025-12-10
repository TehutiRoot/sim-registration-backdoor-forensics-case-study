package com.tom_roush.fontbox.afm;

import com.tom_roush.fontbox.util.BoundingBox;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes5.dex */
public class CharMetric {

    /* renamed from: a */
    public int f59180a;

    /* renamed from: b */
    public float f59181b;

    /* renamed from: c */
    public float f59182c;

    /* renamed from: d */
    public float f59183d;

    /* renamed from: e */
    public float f59184e;

    /* renamed from: f */
    public float f59185f;

    /* renamed from: g */
    public float f59186g;

    /* renamed from: h */
    public float[] f59187h;

    /* renamed from: i */
    public float[] f59188i;

    /* renamed from: j */
    public float[] f59189j;

    /* renamed from: k */
    public float[] f59190k;

    /* renamed from: l */
    public String f59191l;

    /* renamed from: m */
    public BoundingBox f59192m;

    /* renamed from: n */
    public List f59193n = new ArrayList();

    public void addLigature(Ligature ligature) {
        this.f59193n.add(ligature);
    }

    public BoundingBox getBoundingBox() {
        return this.f59192m;
    }

    public int getCharacterCode() {
        return this.f59180a;
    }

    public List<Ligature> getLigatures() {
        return this.f59193n;
    }

    public String getName() {
        return this.f59191l;
    }

    public float[] getVv() {
        return this.f59190k;
    }

    public float[] getW() {
        return this.f59187h;
    }

    public float[] getW0() {
        return this.f59188i;
    }

    public float getW0x() {
        return this.f59182c;
    }

    public float getW0y() {
        return this.f59185f;
    }

    public float[] getW1() {
        return this.f59189j;
    }

    public float getW1x() {
        return this.f59183d;
    }

    public float getW1y() {
        return this.f59186g;
    }

    public float getWx() {
        return this.f59181b;
    }

    public float getWy() {
        return this.f59184e;
    }

    public void setBoundingBox(BoundingBox boundingBox) {
        this.f59192m = boundingBox;
    }

    public void setCharacterCode(int i) {
        this.f59180a = i;
    }

    public void setLigatures(List<Ligature> list) {
        this.f59193n = list;
    }

    public void setName(String str) {
        this.f59191l = str;
    }

    public void setVv(float[] fArr) {
        this.f59190k = fArr;
    }

    public void setW(float[] fArr) {
        this.f59187h = fArr;
    }

    public void setW0(float[] fArr) {
        this.f59188i = fArr;
    }

    public void setW0x(float f) {
        this.f59182c = f;
    }

    public void setW0y(float f) {
        this.f59185f = f;
    }

    public void setW1(float[] fArr) {
        this.f59189j = fArr;
    }

    public void setW1x(float f) {
        this.f59183d = f;
    }

    public void setW1y(float f) {
        this.f59186g = f;
    }

    public void setWx(float f) {
        this.f59181b = f;
    }

    public void setWy(float f) {
        this.f59184e = f;
    }
}