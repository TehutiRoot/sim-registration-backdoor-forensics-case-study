package com.tom_roush.fontbox.afm;

import com.tom_roush.fontbox.util.BoundingBox;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes5.dex */
public class CharMetric {

    /* renamed from: a */
    public int f59168a;

    /* renamed from: b */
    public float f59169b;

    /* renamed from: c */
    public float f59170c;

    /* renamed from: d */
    public float f59171d;

    /* renamed from: e */
    public float f59172e;

    /* renamed from: f */
    public float f59173f;

    /* renamed from: g */
    public float f59174g;

    /* renamed from: h */
    public float[] f59175h;

    /* renamed from: i */
    public float[] f59176i;

    /* renamed from: j */
    public float[] f59177j;

    /* renamed from: k */
    public float[] f59178k;

    /* renamed from: l */
    public String f59179l;

    /* renamed from: m */
    public BoundingBox f59180m;

    /* renamed from: n */
    public List f59181n = new ArrayList();

    public void addLigature(Ligature ligature) {
        this.f59181n.add(ligature);
    }

    public BoundingBox getBoundingBox() {
        return this.f59180m;
    }

    public int getCharacterCode() {
        return this.f59168a;
    }

    public List<Ligature> getLigatures() {
        return this.f59181n;
    }

    public String getName() {
        return this.f59179l;
    }

    public float[] getVv() {
        return this.f59178k;
    }

    public float[] getW() {
        return this.f59175h;
    }

    public float[] getW0() {
        return this.f59176i;
    }

    public float getW0x() {
        return this.f59170c;
    }

    public float getW0y() {
        return this.f59173f;
    }

    public float[] getW1() {
        return this.f59177j;
    }

    public float getW1x() {
        return this.f59171d;
    }

    public float getW1y() {
        return this.f59174g;
    }

    public float getWx() {
        return this.f59169b;
    }

    public float getWy() {
        return this.f59172e;
    }

    public void setBoundingBox(BoundingBox boundingBox) {
        this.f59180m = boundingBox;
    }

    public void setCharacterCode(int i) {
        this.f59168a = i;
    }

    public void setLigatures(List<Ligature> list) {
        this.f59181n = list;
    }

    public void setName(String str) {
        this.f59179l = str;
    }

    public void setVv(float[] fArr) {
        this.f59178k = fArr;
    }

    public void setW(float[] fArr) {
        this.f59175h = fArr;
    }

    public void setW0(float[] fArr) {
        this.f59176i = fArr;
    }

    public void setW0x(float f) {
        this.f59170c = f;
    }

    public void setW0y(float f) {
        this.f59173f = f;
    }

    public void setW1(float[] fArr) {
        this.f59177j = fArr;
    }

    public void setW1x(float f) {
        this.f59171d = f;
    }

    public void setW1y(float f) {
        this.f59174g = f;
    }

    public void setWx(float f) {
        this.f59169b = f;
    }

    public void setWy(float f) {
        this.f59172e = f;
    }
}
