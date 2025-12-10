package com.fasterxml.jackson.core.sym;

/* loaded from: classes3.dex */
public final class Name3 extends Name {

    /* renamed from: a */
    public final int f43247a;

    /* renamed from: b */
    public final int f43248b;

    /* renamed from: c */
    public final int f43249c;

    @Override // com.fasterxml.jackson.core.sym.Name
    public boolean equals(int i) {
        return false;
    }

    @Override // com.fasterxml.jackson.core.sym.Name
    public boolean equals(int i, int i2) {
        return false;
    }

    @Override // com.fasterxml.jackson.core.sym.Name
    public boolean equals(int i, int i2, int i3) {
        return this.f43247a == i && this.f43248b == i2 && this.f43249c == i3;
    }

    @Override // com.fasterxml.jackson.core.sym.Name
    public boolean equals(int[] iArr, int i) {
        return i == 3 && iArr[0] == this.f43247a && iArr[1] == this.f43248b && iArr[2] == this.f43249c;
    }
}