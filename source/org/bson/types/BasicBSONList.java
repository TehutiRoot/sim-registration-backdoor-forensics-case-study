package org.bson.types;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import org.bson.BSONObject;

/* loaded from: classes4.dex */
public class BasicBSONList extends ArrayList<Object> implements BSONObject {
    private static final long serialVersionUID = -4415279469780082174L;

    public int _getInt(String str) {
        return _getInt(str, true);
    }

    @Override // org.bson.BSONObject
    public boolean containsField(String str) {
        int _getInt = _getInt(str, false);
        if (_getInt < 0 || _getInt < 0 || _getInt >= size()) {
            return false;
        }
        return true;
    }

    @Override // org.bson.BSONObject
    @Deprecated
    public boolean containsKey(String str) {
        return containsField(str);
    }

    @Override // org.bson.BSONObject
    public Object get(String str) {
        int _getInt = _getInt(str);
        if (_getInt < 0 || _getInt >= size()) {
            return null;
        }
        return get(_getInt);
    }

    @Override // org.bson.BSONObject
    public Set<String> keySet() {
        return new XM1(size());
    }

    @Override // org.bson.BSONObject
    public Object put(String str, Object obj) {
        return put(_getInt(str), obj);
    }

    @Override // org.bson.BSONObject, java.util.AbstractMap, java.util.Map
    public void putAll(Map map) {
        for (Map.Entry entry : map.entrySet()) {
            put(entry.getKey().toString(), entry.getValue());
        }
    }

    @Override // org.bson.BSONObject
    public Object removeField(String str) {
        int _getInt = _getInt(str);
        if (_getInt < 0 || _getInt >= size()) {
            return null;
        }
        return remove(_getInt);
    }

    @Override // org.bson.BSONObject
    public Map toMap() {
        HashMap hashMap = new HashMap();
        for (String str : keySet()) {
            hashMap.put(str, get(String.valueOf(str)));
        }
        return hashMap;
    }

    public int _getInt(String str, boolean z) {
        try {
            return Integer.parseInt(str);
        } catch (Exception unused) {
            if (z) {
                throw new IllegalArgumentException("BasicBSONList can only work with numeric keys, not: [" + str + "]");
            }
            return -1;
        }
    }

    public Object put(int i, Object obj) {
        while (i >= size()) {
            add(null);
        }
        set(i, obj);
        return obj;
    }

    @Override // org.bson.BSONObject
    public void putAll(BSONObject bSONObject) {
        for (String str : bSONObject.keySet()) {
            put(str, bSONObject.get(str));
        }
    }
}
