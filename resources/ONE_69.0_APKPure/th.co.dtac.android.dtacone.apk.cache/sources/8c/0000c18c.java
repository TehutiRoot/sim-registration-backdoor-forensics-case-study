package com.tom_roush.pdfbox.pdmodel.common;

import com.tom_roush.pdfbox.cos.COSBase;
import com.tom_roush.pdfbox.cos.COSBoolean;
import com.tom_roush.pdfbox.cos.COSDictionary;
import com.tom_roush.pdfbox.cos.COSFloat;
import com.tom_roush.pdfbox.cos.COSInteger;
import com.tom_roush.pdfbox.cos.COSName;
import com.tom_roush.pdfbox.cos.COSString;
import java.io.IOException;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* loaded from: classes5.dex */
public class COSDictionaryMap<K, V> implements Map<K, V> {

    /* renamed from: a */
    public final COSDictionary f60161a;

    /* renamed from: b */
    public final Map f60162b;

    public COSDictionaryMap(Map<K, V> map, COSDictionary cOSDictionary) {
        this.f60162b = map;
        this.f60161a = cOSDictionary;
    }

    public static COSDictionary convert(Map<String, ?> map) {
        COSDictionary cOSDictionary = new COSDictionary();
        for (Map.Entry<String, ?> entry : map.entrySet()) {
            cOSDictionary.setItem(COSName.getPDFName(entry.getKey()), ((COSObjectable) entry.getValue()).getCOSObject());
        }
        return cOSDictionary;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static COSDictionaryMap<String, Object> convertBasicTypesToMap(COSDictionary cOSDictionary) throws IOException {
        Object obj;
        if (cOSDictionary != null) {
            HashMap hashMap = new HashMap();
            for (COSName cOSName : cOSDictionary.keySet()) {
                COSBase dictionaryObject = cOSDictionary.getDictionaryObject(cOSName);
                if (dictionaryObject instanceof COSString) {
                    obj = ((COSString) dictionaryObject).getString();
                } else if (dictionaryObject instanceof COSInteger) {
                    obj = Integer.valueOf(((COSInteger) dictionaryObject).intValue());
                } else if (dictionaryObject instanceof COSName) {
                    obj = ((COSName) dictionaryObject).getName();
                } else if (dictionaryObject instanceof COSFloat) {
                    obj = Float.valueOf(((COSFloat) dictionaryObject).floatValue());
                } else if (dictionaryObject instanceof COSBoolean) {
                    if (((COSBoolean) dictionaryObject).getValue()) {
                        obj = Boolean.TRUE;
                    } else {
                        obj = Boolean.FALSE;
                    }
                } else {
                    throw new IOException("Error:unknown type of object to convert:" + dictionaryObject);
                }
                hashMap.put(cOSName.getName(), obj);
            }
            return new COSDictionaryMap<>(hashMap, cOSDictionary);
        }
        return null;
    }

    @Override // java.util.Map
    public void clear() {
        this.f60161a.clear();
        this.f60162b.clear();
    }

    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        return this.f60162b.containsKey(obj);
    }

    @Override // java.util.Map
    public boolean containsValue(Object obj) {
        return this.f60162b.containsValue(obj);
    }

    @Override // java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        return Collections.unmodifiableSet(this.f60162b.entrySet());
    }

    @Override // java.util.Map
    public boolean equals(Object obj) {
        if (obj instanceof COSDictionaryMap) {
            return ((COSDictionaryMap) obj).f60161a.equals(this.f60161a);
        }
        return false;
    }

    @Override // java.util.Map
    public V get(Object obj) {
        return (V) this.f60162b.get(obj);
    }

    @Override // java.util.Map
    public int hashCode() {
        return this.f60161a.hashCode();
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        if (size() == 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.Map
    public Set<K> keySet() {
        return this.f60162b.keySet();
    }

    @Override // java.util.Map
    public V put(K k, V v) {
        this.f60161a.setItem(COSName.getPDFName((String) k), ((COSObjectable) v).getCOSObject());
        return (V) this.f60162b.put(k, v);
    }

    @Override // java.util.Map
    public void putAll(Map<? extends K, ? extends V> map) {
        throw new UnsupportedOperationException("Not yet implemented");
    }

    @Override // java.util.Map
    public V remove(Object obj) {
        this.f60161a.removeItem(COSName.getPDFName((String) obj));
        return (V) this.f60162b.remove(obj);
    }

    @Override // java.util.Map
    public int size() {
        return this.f60161a.size();
    }

    public String toString() {
        return this.f60162b.toString();
    }

    @Override // java.util.Map
    public Collection<V> values() {
        return this.f60162b.values();
    }
}