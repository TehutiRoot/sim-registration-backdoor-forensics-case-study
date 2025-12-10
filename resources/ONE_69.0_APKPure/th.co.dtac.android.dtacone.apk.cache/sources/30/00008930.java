package com.google.android.cameraview;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.collection.SparseArrayCompat;

/* loaded from: classes3.dex */
public class AspectRatio implements Comparable<AspectRatio>, Parcelable {

    /* renamed from: a */
    public final int f43811a;

    /* renamed from: b */
    public final int f43812b;

    /* renamed from: c */
    public static final SparseArrayCompat f43810c = new SparseArrayCompat(16);
    public static final Parcelable.Creator<AspectRatio> CREATOR = new C6177a();

    /* renamed from: com.google.android.cameraview.AspectRatio$a */
    /* loaded from: classes3.dex */
    public class C6177a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public AspectRatio createFromParcel(Parcel parcel) {
            return AspectRatio.m49245of(parcel.readInt(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public AspectRatio[] newArray(int i) {
            return new AspectRatio[i];
        }
    }

    public AspectRatio(int i, int i2) {
        this.f43811a = i;
        this.f43812b = i2;
    }

    /* renamed from: a */
    public static int m49246a(int i, int i2) {
        while (true) {
            int i3 = i2;
            int i4 = i;
            i = i3;
            if (i != 0) {
                i2 = i4 % i;
            } else {
                return i4;
            }
        }
    }

    /* renamed from: of */
    public static AspectRatio m49245of(int i, int i2) {
        int m49246a = m49246a(i, i2);
        int i3 = i / m49246a;
        int i4 = i2 / m49246a;
        SparseArrayCompat sparseArrayCompat = f43810c;
        SparseArrayCompat sparseArrayCompat2 = (SparseArrayCompat) sparseArrayCompat.get(i3);
        if (sparseArrayCompat2 == null) {
            AspectRatio aspectRatio = new AspectRatio(i3, i4);
            SparseArrayCompat sparseArrayCompat3 = new SparseArrayCompat();
            sparseArrayCompat3.put(i4, aspectRatio);
            sparseArrayCompat.put(i3, sparseArrayCompat3);
            return aspectRatio;
        }
        AspectRatio aspectRatio2 = (AspectRatio) sparseArrayCompat2.get(i4);
        if (aspectRatio2 == null) {
            AspectRatio aspectRatio3 = new AspectRatio(i3, i4);
            sparseArrayCompat2.put(i4, aspectRatio3);
            return aspectRatio3;
        }
        return aspectRatio2;
    }

    public static AspectRatio parse(String str) {
        int indexOf = str.indexOf(58);
        if (indexOf != -1) {
            try {
                return m49245of(Integer.parseInt(str.substring(0, indexOf)), Integer.parseInt(str.substring(indexOf + 1)));
            } catch (NumberFormatException e) {
                throw new IllegalArgumentException("Malformed aspect ratio: " + str, e);
            }
        }
        throw new IllegalArgumentException("Malformed aspect ratio: " + str);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AspectRatio)) {
            return false;
        }
        AspectRatio aspectRatio = (AspectRatio) obj;
        if (this.f43811a != aspectRatio.f43811a || this.f43812b != aspectRatio.f43812b) {
            return false;
        }
        return true;
    }

    public int getX() {
        return this.f43811a;
    }

    public int getY() {
        return this.f43812b;
    }

    public int hashCode() {
        int i = this.f43812b;
        int i2 = this.f43811a;
        return i ^ ((i2 >>> 16) | (i2 << 16));
    }

    public AspectRatio inverse() {
        return m49245of(this.f43812b, this.f43811a);
    }

    public boolean matches(Size size) {
        int m49246a = m49246a(size.getWidth(), size.getHeight());
        int width = size.getWidth() / m49246a;
        int height = size.getHeight() / m49246a;
        if (this.f43811a == width && this.f43812b == height) {
            return true;
        }
        return false;
    }

    public float toFloat() {
        return this.f43811a / this.f43812b;
    }

    public String toString() {
        return this.f43811a + ":" + this.f43812b;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f43811a);
        parcel.writeInt(this.f43812b);
    }

    @Override // java.lang.Comparable
    public int compareTo(@NonNull AspectRatio aspectRatio) {
        if (equals(aspectRatio)) {
            return 0;
        }
        return toFloat() - aspectRatio.toFloat() > 0.0f ? 1 : -1;
    }
}