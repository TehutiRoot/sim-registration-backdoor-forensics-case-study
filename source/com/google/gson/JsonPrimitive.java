package com.google.gson;

import com.google.gson.internal.LazilyParsedNumber;
import com.google.gson.internal.NumberLimits;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Objects;

/* loaded from: classes4.dex */
public final class JsonPrimitive extends JsonElement {

    /* renamed from: a */
    public final Object f56693a;

    public JsonPrimitive(Boolean bool) {
        Objects.requireNonNull(bool);
        this.f56693a = bool;
    }

    /* renamed from: a */
    public static boolean m37570a(JsonPrimitive jsonPrimitive) {
        Object obj = jsonPrimitive.f56693a;
        if (!(obj instanceof Number)) {
            return false;
        }
        Number number = (Number) obj;
        if (!(number instanceof BigInteger) && !(number instanceof Long) && !(number instanceof Integer) && !(number instanceof Short) && !(number instanceof Byte)) {
            return false;
        }
        return true;
    }

    @Override // com.google.gson.JsonElement
    public JsonPrimitive deepCopy() {
        return this;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || JsonPrimitive.class != obj.getClass()) {
            return false;
        }
        JsonPrimitive jsonPrimitive = (JsonPrimitive) obj;
        if (this.f56693a == null) {
            if (jsonPrimitive.f56693a == null) {
                return true;
            }
            return false;
        } else if (m37570a(this) && m37570a(jsonPrimitive)) {
            if (!(this.f56693a instanceof BigInteger) && !(jsonPrimitive.f56693a instanceof BigInteger)) {
                if (getAsNumber().longValue() == jsonPrimitive.getAsNumber().longValue()) {
                    return true;
                }
                return false;
            }
            return getAsBigInteger().equals(jsonPrimitive.getAsBigInteger());
        } else {
            Object obj2 = this.f56693a;
            if (obj2 instanceof Number) {
                Object obj3 = jsonPrimitive.f56693a;
                if (obj3 instanceof Number) {
                    if ((obj2 instanceof BigDecimal) && (obj3 instanceof BigDecimal)) {
                        if (getAsBigDecimal().compareTo(jsonPrimitive.getAsBigDecimal()) == 0) {
                            return true;
                        }
                        return false;
                    }
                    double asDouble = getAsDouble();
                    double asDouble2 = jsonPrimitive.getAsDouble();
                    if (asDouble == asDouble2) {
                        return true;
                    }
                    if (Double.isNaN(asDouble) && Double.isNaN(asDouble2)) {
                        return true;
                    }
                    return false;
                }
            }
            return obj2.equals(jsonPrimitive.f56693a);
        }
    }

    @Override // com.google.gson.JsonElement
    public BigDecimal getAsBigDecimal() {
        Object obj = this.f56693a;
        if (obj instanceof BigDecimal) {
            return (BigDecimal) obj;
        }
        return NumberLimits.parseBigDecimal(getAsString());
    }

    @Override // com.google.gson.JsonElement
    public BigInteger getAsBigInteger() {
        Object obj = this.f56693a;
        if (obj instanceof BigInteger) {
            return (BigInteger) obj;
        }
        if (m37570a(this)) {
            return BigInteger.valueOf(getAsNumber().longValue());
        }
        return NumberLimits.parseBigInteger(getAsString());
    }

    @Override // com.google.gson.JsonElement
    public boolean getAsBoolean() {
        if (isBoolean()) {
            return ((Boolean) this.f56693a).booleanValue();
        }
        return Boolean.parseBoolean(getAsString());
    }

    @Override // com.google.gson.JsonElement
    public byte getAsByte() {
        if (isNumber()) {
            return getAsNumber().byteValue();
        }
        return Byte.parseByte(getAsString());
    }

    @Override // com.google.gson.JsonElement
    @Deprecated
    public char getAsCharacter() {
        String asString = getAsString();
        if (!asString.isEmpty()) {
            return asString.charAt(0);
        }
        throw new UnsupportedOperationException("String value is empty");
    }

    @Override // com.google.gson.JsonElement
    public double getAsDouble() {
        if (isNumber()) {
            return getAsNumber().doubleValue();
        }
        return Double.parseDouble(getAsString());
    }

    @Override // com.google.gson.JsonElement
    public float getAsFloat() {
        if (isNumber()) {
            return getAsNumber().floatValue();
        }
        return Float.parseFloat(getAsString());
    }

    @Override // com.google.gson.JsonElement
    public int getAsInt() {
        if (isNumber()) {
            return getAsNumber().intValue();
        }
        return Integer.parseInt(getAsString());
    }

    @Override // com.google.gson.JsonElement
    public long getAsLong() {
        if (isNumber()) {
            return getAsNumber().longValue();
        }
        return Long.parseLong(getAsString());
    }

    @Override // com.google.gson.JsonElement
    public Number getAsNumber() {
        Object obj = this.f56693a;
        if (obj instanceof Number) {
            return (Number) obj;
        }
        if (obj instanceof String) {
            return new LazilyParsedNumber((String) obj);
        }
        throw new UnsupportedOperationException("Primitive is neither a number nor a string");
    }

    @Override // com.google.gson.JsonElement
    public short getAsShort() {
        if (isNumber()) {
            return getAsNumber().shortValue();
        }
        return Short.parseShort(getAsString());
    }

    @Override // com.google.gson.JsonElement
    public String getAsString() {
        Object obj = this.f56693a;
        if (obj instanceof String) {
            return (String) obj;
        }
        if (isNumber()) {
            return getAsNumber().toString();
        }
        if (isBoolean()) {
            return ((Boolean) this.f56693a).toString();
        }
        throw new AssertionError("Unexpected value type: " + this.f56693a.getClass());
    }

    public int hashCode() {
        long doubleToLongBits;
        if (this.f56693a == null) {
            return 31;
        }
        if (m37570a(this)) {
            doubleToLongBits = getAsNumber().longValue();
        } else {
            Object obj = this.f56693a;
            if (obj instanceof Number) {
                doubleToLongBits = Double.doubleToLongBits(getAsNumber().doubleValue());
            } else {
                return obj.hashCode();
            }
        }
        return (int) ((doubleToLongBits >>> 32) ^ doubleToLongBits);
    }

    public boolean isBoolean() {
        return this.f56693a instanceof Boolean;
    }

    public boolean isNumber() {
        return this.f56693a instanceof Number;
    }

    public boolean isString() {
        return this.f56693a instanceof String;
    }

    public JsonPrimitive(Number number) {
        Objects.requireNonNull(number);
        this.f56693a = number;
    }

    public JsonPrimitive(String str) {
        Objects.requireNonNull(str);
        this.f56693a = str;
    }

    public JsonPrimitive(Character ch2) {
        Objects.requireNonNull(ch2);
        this.f56693a = ch2.toString();
    }
}
