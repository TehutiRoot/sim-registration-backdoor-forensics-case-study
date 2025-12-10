package org.apache.http.message;

import kotlin.text.Typography;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* loaded from: classes6.dex */
public class ParserCursor {

    /* renamed from: a */
    public final int f74638a;

    /* renamed from: b */
    public final int f74639b;

    /* renamed from: c */
    public int f74640c;

    public ParserCursor(int i, int i2) {
        if (i >= 0) {
            if (i <= i2) {
                this.f74638a = i;
                this.f74639b = i2;
                this.f74640c = i;
                return;
            }
            throw new IndexOutOfBoundsException("Lower bound cannot be greater then upper bound");
        }
        throw new IndexOutOfBoundsException("Lower bound cannot be negative");
    }

    public boolean atEnd() {
        if (this.f74640c >= this.f74639b) {
            return true;
        }
        return false;
    }

    public int getLowerBound() {
        return this.f74638a;
    }

    public int getPos() {
        return this.f74640c;
    }

    public int getUpperBound() {
        return this.f74639b;
    }

    public String toString() {
        return AbstractJsonLexerKt.BEGIN_LIST + Integer.toString(this.f74638a) + Typography.greater + Integer.toString(this.f74640c) + Typography.greater + Integer.toString(this.f74639b) + AbstractJsonLexerKt.END_LIST;
    }

    public void updatePos(int i) {
        if (i >= this.f74638a) {
            if (i <= this.f74639b) {
                this.f74640c = i;
                return;
            }
            throw new IndexOutOfBoundsException("pos: " + i + " > upperBound: " + this.f74639b);
        }
        throw new IndexOutOfBoundsException("pos: " + i + " < lowerBound: " + this.f74638a);
    }
}