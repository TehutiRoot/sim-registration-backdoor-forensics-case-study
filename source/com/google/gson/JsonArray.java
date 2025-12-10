package com.google.gson;

import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.gson.internal.NonNullElementWrapperList;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes4.dex */
public final class JsonArray extends JsonElement implements Iterable<JsonElement> {

    /* renamed from: a */
    public final ArrayList f56691a;

    public JsonArray() {
        this.f56691a = new ArrayList();
    }

    /* renamed from: a */
    public final JsonElement m37571a() {
        int size = this.f56691a.size();
        if (size == 1) {
            return (JsonElement) this.f56691a.get(0);
        }
        throw new IllegalStateException("Array must have size 1, but has size " + size);
    }

    public void add(Boolean bool) {
        this.f56691a.add(bool == null ? JsonNull.INSTANCE : new JsonPrimitive(bool));
    }

    public void addAll(JsonArray jsonArray) {
        this.f56691a.addAll(jsonArray.f56691a);
    }

    public List<JsonElement> asList() {
        return new NonNullElementWrapperList(this.f56691a);
    }

    public boolean contains(JsonElement jsonElement) {
        return this.f56691a.contains(jsonElement);
    }

    public boolean equals(Object obj) {
        if (obj != this && (!(obj instanceof JsonArray) || !((JsonArray) obj).f56691a.equals(this.f56691a))) {
            return false;
        }
        return true;
    }

    public JsonElement get(int i) {
        return (JsonElement) this.f56691a.get(i);
    }

    @Override // com.google.gson.JsonElement
    public BigDecimal getAsBigDecimal() {
        return m37571a().getAsBigDecimal();
    }

    @Override // com.google.gson.JsonElement
    public BigInteger getAsBigInteger() {
        return m37571a().getAsBigInteger();
    }

    @Override // com.google.gson.JsonElement
    public boolean getAsBoolean() {
        return m37571a().getAsBoolean();
    }

    @Override // com.google.gson.JsonElement
    public byte getAsByte() {
        return m37571a().getAsByte();
    }

    @Override // com.google.gson.JsonElement
    @Deprecated
    public char getAsCharacter() {
        return m37571a().getAsCharacter();
    }

    @Override // com.google.gson.JsonElement
    public double getAsDouble() {
        return m37571a().getAsDouble();
    }

    @Override // com.google.gson.JsonElement
    public float getAsFloat() {
        return m37571a().getAsFloat();
    }

    @Override // com.google.gson.JsonElement
    public int getAsInt() {
        return m37571a().getAsInt();
    }

    @Override // com.google.gson.JsonElement
    public long getAsLong() {
        return m37571a().getAsLong();
    }

    @Override // com.google.gson.JsonElement
    public Number getAsNumber() {
        return m37571a().getAsNumber();
    }

    @Override // com.google.gson.JsonElement
    public short getAsShort() {
        return m37571a().getAsShort();
    }

    @Override // com.google.gson.JsonElement
    public String getAsString() {
        return m37571a().getAsString();
    }

    public int hashCode() {
        return this.f56691a.hashCode();
    }

    public boolean isEmpty() {
        return this.f56691a.isEmpty();
    }

    @Override // java.lang.Iterable
    public Iterator<JsonElement> iterator() {
        return this.f56691a.iterator();
    }

    @CanIgnoreReturnValue
    public boolean remove(JsonElement jsonElement) {
        return this.f56691a.remove(jsonElement);
    }

    @CanIgnoreReturnValue
    public JsonElement set(int i, JsonElement jsonElement) {
        ArrayList arrayList = this.f56691a;
        if (jsonElement == null) {
            jsonElement = JsonNull.INSTANCE;
        }
        return (JsonElement) arrayList.set(i, jsonElement);
    }

    public int size() {
        return this.f56691a.size();
    }

    public void add(Character ch2) {
        this.f56691a.add(ch2 == null ? JsonNull.INSTANCE : new JsonPrimitive(ch2));
    }

    @Override // com.google.gson.JsonElement
    public JsonArray deepCopy() {
        if (!this.f56691a.isEmpty()) {
            JsonArray jsonArray = new JsonArray(this.f56691a.size());
            Iterator it = this.f56691a.iterator();
            while (it.hasNext()) {
                jsonArray.add(((JsonElement) it.next()).deepCopy());
            }
            return jsonArray;
        }
        return new JsonArray();
    }

    @CanIgnoreReturnValue
    public JsonElement remove(int i) {
        return (JsonElement) this.f56691a.remove(i);
    }

    public JsonArray(int i) {
        this.f56691a = new ArrayList(i);
    }

    public void add(Number number) {
        this.f56691a.add(number == null ? JsonNull.INSTANCE : new JsonPrimitive(number));
    }

    public void add(String str) {
        this.f56691a.add(str == null ? JsonNull.INSTANCE : new JsonPrimitive(str));
    }

    public void add(JsonElement jsonElement) {
        if (jsonElement == null) {
            jsonElement = JsonNull.INSTANCE;
        }
        this.f56691a.add(jsonElement);
    }
}
