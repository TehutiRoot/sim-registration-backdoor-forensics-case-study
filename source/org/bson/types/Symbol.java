package org.bson.types;

import java.io.Serializable;

/* loaded from: classes4.dex */
public class Symbol implements Serializable {
    private static final long serialVersionUID = 1326269319883146072L;
    private final String symbol;

    public Symbol(String str) {
        this.symbol = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass() && this.symbol.equals(((Symbol) obj).symbol)) {
            return true;
        }
        return false;
    }

    public String getSymbol() {
        return this.symbol;
    }

    public int hashCode() {
        return this.symbol.hashCode();
    }

    public String toString() {
        return this.symbol;
    }
}
