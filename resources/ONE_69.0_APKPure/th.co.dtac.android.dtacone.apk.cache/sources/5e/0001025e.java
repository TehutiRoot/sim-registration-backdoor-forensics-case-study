package org.bson.types;

import ch.qos.logback.core.CoreConstants;
import java.io.Serializable;

/* loaded from: classes4.dex */
public class Code implements Serializable {
    private static final long serialVersionUID = 475535263314046697L;
    private final String code;

    public Code(String str) {
        this.code = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass() && this.code.equals(((Code) obj).code)) {
            return true;
        }
        return false;
    }

    public String getCode() {
        return this.code;
    }

    public int hashCode() {
        return this.code.hashCode();
    }

    public String toString() {
        return "Code{code='" + this.code + CoreConstants.SINGLE_QUOTE_CHAR + '}';
    }
}