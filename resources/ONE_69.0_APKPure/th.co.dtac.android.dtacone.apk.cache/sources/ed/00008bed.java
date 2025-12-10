package com.google.android.gms.common.images;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;

/* loaded from: classes3.dex */
public final class Size {

    /* renamed from: a */
    public final int f45018a;

    /* renamed from: b */
    public final int f45019b;

    public Size(int i, int i2) {
        this.f45018a = i;
        this.f45019b = i2;
    }

    /* renamed from: a */
    public static NumberFormatException m48425a(String str) {
        throw new NumberFormatException("Invalid Size: \"" + str + OperatorName.SHOW_TEXT_LINE_AND_SPACE);
    }

    @NonNull
    public static Size parseSize(@NonNull String str) throws NumberFormatException {
        if (str != null) {
            int indexOf = str.indexOf(42);
            if (indexOf < 0) {
                indexOf = str.indexOf(120);
            }
            if (indexOf >= 0) {
                try {
                    return new Size(Integer.parseInt(str.substring(0, indexOf)), Integer.parseInt(str.substring(indexOf + 1)));
                } catch (NumberFormatException unused) {
                    throw m48425a(str);
                }
            }
            throw m48425a(str);
        }
        throw new IllegalArgumentException("string must not be null");
    }

    public boolean equals(@Nullable Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof Size) {
            Size size = (Size) obj;
            if (this.f45018a == size.f45018a && this.f45019b == size.f45019b) {
                return true;
            }
        }
        return false;
    }

    public int getHeight() {
        return this.f45019b;
    }

    public int getWidth() {
        return this.f45018a;
    }

    public int hashCode() {
        int i = this.f45018a;
        return ((i >>> 16) | (i << 16)) ^ this.f45019b;
    }

    @NonNull
    public String toString() {
        return this.f45018a + "x" + this.f45019b;
    }
}