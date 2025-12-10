package com.fasterxml.jackson.core.sym;

/* loaded from: classes3.dex */
public final class Name2 extends Name {

    /* renamed from: a */
    public final int f43245a;

    /* renamed from: b */
    public final int f43246b;

    @Override // com.fasterxml.jackson.core.sym.Name
    public boolean equals(int i) {
        return false;
    }

    @Override // com.fasterxml.jackson.core.sym.Name
    public boolean equals(int i, int i2, int i3) {
        return false;
    }

    @Override // com.fasterxml.jackson.core.sym.Name
    public boolean equals(int i, int i2) {
        return i == this.f43245a && i2 == this.f43246b;
    }

    @Override // com.fasterxml.jackson.core.sym.Name
    public boolean equals(int[] iArr, int i) {
        return i == 2 && iArr[0] == this.f43245a && iArr[1] == this.f43246b;
    }
}