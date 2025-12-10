package com.fasterxml.jackson.databind.jsontype;

import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import java.io.Serializable;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* loaded from: classes3.dex */
public final class NamedType implements Serializable {
    private static final long serialVersionUID = 1;
    protected final Class<?> _class;
    protected final int _hashCode;
    protected String _name;

    public NamedType(Class<?> cls) {
        this(cls, null);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && obj.getClass() == NamedType.class && this._class == ((NamedType) obj)._class) {
            return true;
        }
        return false;
    }

    public String getName() {
        return this._name;
    }

    public Class<?> getType() {
        return this._class;
    }

    public boolean hasName() {
        if (this._name != null) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this._hashCode;
    }

    public void setName(String str) {
        this._name = (str == null || str.length() == 0) ? null : null;
    }

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append("[NamedType, class ");
        sb.append(this._class.getName());
        sb.append(", name: ");
        if (this._name == null) {
            str = AbstractJsonLexerKt.NULL;
        } else {
            str = OperatorName.SHOW_TEXT_LINE + this._name + OperatorName.SHOW_TEXT_LINE;
        }
        sb.append(str);
        sb.append("]");
        return sb.toString();
    }

    public NamedType(Class<?> cls, String str) {
        this._class = cls;
        this._hashCode = cls.getName().hashCode();
        setName(str);
    }
}
