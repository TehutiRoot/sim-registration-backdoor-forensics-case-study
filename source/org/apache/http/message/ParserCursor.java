package org.apache.http.message;

import kotlin.text.Typography;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* loaded from: classes6.dex */
public class ParserCursor {

    /* renamed from: a */
    public final int f74554a;

    /* renamed from: b */
    public final int f74555b;

    /* renamed from: c */
    public int f74556c;

    public ParserCursor(int i, int i2) {
        if (i >= 0) {
            if (i <= i2) {
                this.f74554a = i;
                this.f74555b = i2;
                this.f74556c = i;
                return;
            }
            throw new IndexOutOfBoundsException("Lower bound cannot be greater then upper bound");
        }
        throw new IndexOutOfBoundsException("Lower bound cannot be negative");
    }

    public boolean atEnd() {
        if (this.f74556c >= this.f74555b) {
            return true;
        }
        return false;
    }

    public int getLowerBound() {
        return this.f74554a;
    }

    public int getPos() {
        return this.f74556c;
    }

    public int getUpperBound() {
        return this.f74555b;
    }

    public String toString() {
        return AbstractJsonLexerKt.BEGIN_LIST + Integer.toString(this.f74554a) + Typography.greater + Integer.toString(this.f74556c) + Typography.greater + Integer.toString(this.f74555b) + AbstractJsonLexerKt.END_LIST;
    }

    public void updatePos(int i) {
        if (i >= this.f74554a) {
            if (i <= this.f74555b) {
                this.f74556c = i;
                return;
            }
            throw new IndexOutOfBoundsException("pos: " + i + " > upperBound: " + this.f74555b);
        }
        throw new IndexOutOfBoundsException("pos: " + i + " < lowerBound: " + this.f74554a);
    }
}
