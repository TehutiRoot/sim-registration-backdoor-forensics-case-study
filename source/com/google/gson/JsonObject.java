package com.google.gson;

import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.gson.internal.LinkedTreeMap;
import java.util.Map;
import java.util.Set;

/* loaded from: classes4.dex */
public final class JsonObject extends JsonElement {

    /* renamed from: a */
    public final LinkedTreeMap f56692a = new LinkedTreeMap(false);

    public void add(String str, JsonElement jsonElement) {
        LinkedTreeMap linkedTreeMap = this.f56692a;
        if (jsonElement == null) {
            jsonElement = JsonNull.INSTANCE;
        }
        linkedTreeMap.put(str, jsonElement);
    }

    public void addProperty(String str, String str2) {
        add(str, str2 == null ? JsonNull.INSTANCE : new JsonPrimitive(str2));
    }

    public Map<String, JsonElement> asMap() {
        return this.f56692a;
    }

    public Set<Map.Entry<String, JsonElement>> entrySet() {
        return this.f56692a.entrySet();
    }

    public boolean equals(Object obj) {
        if (obj != this && (!(obj instanceof JsonObject) || !((JsonObject) obj).f56692a.equals(this.f56692a))) {
            return false;
        }
        return true;
    }

    public JsonElement get(String str) {
        return (JsonElement) this.f56692a.get(str);
    }

    public JsonArray getAsJsonArray(String str) {
        return (JsonArray) this.f56692a.get(str);
    }

    public JsonObject getAsJsonObject(String str) {
        return (JsonObject) this.f56692a.get(str);
    }

    public JsonPrimitive getAsJsonPrimitive(String str) {
        return (JsonPrimitive) this.f56692a.get(str);
    }

    public boolean has(String str) {
        return this.f56692a.containsKey(str);
    }

    public int hashCode() {
        return this.f56692a.hashCode();
    }

    public boolean isEmpty() {
        if (this.f56692a.size() == 0) {
            return true;
        }
        return false;
    }

    public Set<String> keySet() {
        return this.f56692a.keySet();
    }

    @CanIgnoreReturnValue
    public JsonElement remove(String str) {
        return (JsonElement) this.f56692a.remove(str);
    }

    public int size() {
        return this.f56692a.size();
    }

    public void addProperty(String str, Number number) {
        add(str, number == null ? JsonNull.INSTANCE : new JsonPrimitive(number));
    }

    @Override // com.google.gson.JsonElement
    public JsonObject deepCopy() {
        JsonObject jsonObject = new JsonObject();
        for (Map.Entry entry : this.f56692a.entrySet()) {
            jsonObject.add((String) entry.getKey(), ((JsonElement) entry.getValue()).deepCopy());
        }
        return jsonObject;
    }

    public void addProperty(String str, Boolean bool) {
        add(str, bool == null ? JsonNull.INSTANCE : new JsonPrimitive(bool));
    }

    public void addProperty(String str, Character ch2) {
        add(str, ch2 == null ? JsonNull.INSTANCE : new JsonPrimitive(ch2));
    }
}
