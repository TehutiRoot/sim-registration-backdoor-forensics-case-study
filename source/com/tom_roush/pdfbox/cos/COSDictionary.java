package com.tom_roush.pdfbox.cos;

import com.google.firebase.sessions.settings.RemoteSettings;
import com.tom_roush.pdfbox.p019io.IOUtils;
import com.tom_roush.pdfbox.pdmodel.common.COSObjectable;
import com.tom_roush.pdfbox.util.DateConverter;
import com.tom_roush.pdfbox.util.SmallMap;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* loaded from: classes5.dex */
public class COSDictionary extends COSBase implements COSUpdateInfo {

    /* renamed from: b */
    public boolean f59728b;
    protected Map<COSName, COSBase> items;

    public COSDictionary() {
        this.items = new SmallMap();
    }

    /* renamed from: b */
    public static String m32792b(COSBase cOSBase, List list) {
        if (cOSBase == null) {
            return AbstractJsonLexerKt.NULL;
        }
        if (list.contains(cOSBase)) {
            return String.valueOf(cOSBase.hashCode());
        }
        list.add(cOSBase);
        if (cOSBase instanceof COSDictionary) {
            StringBuilder sb = new StringBuilder("COSDictionary{");
            for (Map.Entry<COSName, COSBase> entry : ((COSDictionary) cOSBase).entrySet()) {
                sb.append(entry.getKey());
                sb.append(":");
                sb.append(m32792b(entry.getValue(), list));
                sb.append(";");
            }
            sb.append("}");
            if (cOSBase instanceof COSStream) {
                InputStream createRawInputStream = ((COSStream) cOSBase).createRawInputStream();
                byte[] byteArray = IOUtils.toByteArray(createRawInputStream);
                sb.append("COSStream{");
                sb.append(Arrays.hashCode(byteArray));
                sb.append("}");
                createRawInputStream.close();
            }
            return sb.toString();
        } else if (cOSBase instanceof COSArray) {
            StringBuilder sb2 = new StringBuilder("COSArray{");
            Iterator<COSBase> it = ((COSArray) cOSBase).iterator();
            while (it.hasNext()) {
                sb2.append(m32792b(it.next(), list));
                sb2.append(";");
            }
            sb2.append("}");
            return sb2.toString();
        } else if (cOSBase instanceof COSObject) {
            return "COSObject{" + m32792b(((COSObject) cOSBase).getObject(), list) + "}";
        } else {
            return cOSBase.toString();
        }
    }

    @Override // com.tom_roush.pdfbox.cos.COSBase
    public Object accept(ICOSVisitor iCOSVisitor) throws IOException {
        return iCOSVisitor.visitFromDictionary(this);
    }

    public void addAll(COSDictionary cOSDictionary) {
        for (Map.Entry<COSName, COSBase> entry : cOSDictionary.entrySet()) {
            setItem(entry.getKey(), entry.getValue());
        }
    }

    public COSDictionary asUnmodifiableDictionary() {
        return new C21946rY1(this);
    }

    public void clear() {
        this.items.clear();
    }

    public boolean containsKey(COSName cOSName) {
        return this.items.containsKey(cOSName);
    }

    public boolean containsValue(Object obj) {
        boolean containsValue = this.items.containsValue(obj);
        if (!containsValue && (obj instanceof COSObject)) {
            return this.items.containsValue(((COSObject) obj).getObject());
        }
        return containsValue;
    }

    public Set<Map.Entry<COSName, COSBase>> entrySet() {
        return this.items.entrySet();
    }

    public boolean getBoolean(String str, boolean z) {
        return getBoolean(COSName.getPDFName(str), z);
    }

    public COSArray getCOSArray(COSName cOSName) {
        COSBase dictionaryObject = getDictionaryObject(cOSName);
        if (dictionaryObject instanceof COSArray) {
            return (COSArray) dictionaryObject;
        }
        return null;
    }

    public COSDictionary getCOSDictionary(COSName cOSName) {
        COSBase dictionaryObject = getDictionaryObject(cOSName);
        if (dictionaryObject instanceof COSDictionary) {
            return (COSDictionary) dictionaryObject;
        }
        return null;
    }

    public COSName getCOSName(COSName cOSName) {
        COSBase dictionaryObject = getDictionaryObject(cOSName);
        if (dictionaryObject instanceof COSName) {
            return (COSName) dictionaryObject;
        }
        return null;
    }

    public COSObject getCOSObject(COSName cOSName) {
        COSBase item = getItem(cOSName);
        if (item instanceof COSObject) {
            return (COSObject) item;
        }
        return null;
    }

    public COSStream getCOSStream(COSName cOSName) {
        COSBase dictionaryObject = getDictionaryObject(cOSName);
        if (dictionaryObject instanceof COSStream) {
            return (COSStream) dictionaryObject;
        }
        return null;
    }

    public Calendar getDate(String str) {
        return getDate(COSName.getPDFName(str));
    }

    public COSBase getDictionaryObject(String str) {
        return getDictionaryObject(COSName.getPDFName(str));
    }

    public Calendar getEmbeddedDate(String str, String str2) throws IOException {
        return getEmbeddedDate(str, COSName.getPDFName(str2), (Calendar) null);
    }

    public int getEmbeddedInt(String str, String str2) {
        return getEmbeddedInt(str, COSName.getPDFName(str2));
    }

    public String getEmbeddedString(String str, String str2) {
        return getEmbeddedString(str, COSName.getPDFName(str2), (String) null);
    }

    public boolean getFlag(COSName cOSName, int i) {
        if ((getInt(cOSName, 0) & i) != i) {
            return false;
        }
        return true;
    }

    public float getFloat(String str) {
        return getFloat(COSName.getPDFName(str), -1.0f);
    }

    public int getInt(String str) {
        return getInt(COSName.getPDFName(str), -1);
    }

    public COSBase getItem(COSName cOSName) {
        return this.items.get(cOSName);
    }

    public COSName getKeyForValue(Object obj) {
        for (Map.Entry<COSName, COSBase> entry : this.items.entrySet()) {
            COSBase value = entry.getValue();
            if (value.equals(obj) || ((value instanceof COSObject) && ((COSObject) value).getObject().equals(obj))) {
                return entry.getKey();
            }
        }
        return null;
    }

    public long getLong(String str) {
        return getLong(COSName.getPDFName(str), -1L);
    }

    public String getNameAsString(String str) {
        return getNameAsString(COSName.getPDFName(str));
    }

    public COSBase getObjectFromPath(String str) {
        String[] split = str.split(RemoteSettings.FORWARD_SLASH_STRING);
        int length = split.length;
        int i = 0;
        COSBase cOSBase = this;
        while (i < length) {
            String str2 = split[i];
            if (cOSBase instanceof COSArray) {
                cOSBase = ((COSArray) cOSBase).getObject(Integer.parseInt(str2.replace("\\[", "").replace("\\]", "")));
            } else if (cOSBase instanceof COSDictionary) {
                cOSBase = ((COSDictionary) cOSBase).getDictionaryObject(str2);
            }
            i++;
            cOSBase = cOSBase;
        }
        return cOSBase;
    }

    public String getString(String str) {
        return getString(COSName.getPDFName(str));
    }

    public Collection<COSBase> getValues() {
        return this.items.values();
    }

    @Override // com.tom_roush.pdfbox.cos.COSUpdateInfo
    public boolean isNeedToBeUpdated() {
        return this.f59728b;
    }

    public Set<COSName> keySet() {
        return this.items.keySet();
    }

    @Deprecated
    public void mergeInto(COSDictionary cOSDictionary) {
        for (Map.Entry<COSName, COSBase> entry : cOSDictionary.entrySet()) {
            if (getItem(entry.getKey()) == null) {
                setItem(entry.getKey(), entry.getValue());
            }
        }
    }

    public void removeItem(COSName cOSName) {
        this.items.remove(cOSName);
    }

    public void setBoolean(String str, boolean z) {
        setItem(COSName.getPDFName(str), (COSBase) COSBoolean.getBoolean(z));
    }

    public void setDate(String str, Calendar calendar) {
        setDate(COSName.getPDFName(str), calendar);
    }

    public void setEmbeddedDate(String str, String str2, Calendar calendar) {
        setEmbeddedDate(str, COSName.getPDFName(str2), calendar);
    }

    public void setEmbeddedInt(String str, String str2, int i) {
        setEmbeddedInt(str, COSName.getPDFName(str2), i);
    }

    public void setEmbeddedString(String str, String str2, String str3) {
        setEmbeddedString(str, COSName.getPDFName(str2), str3);
    }

    public void setFlag(COSName cOSName, int i, boolean z) {
        int i2;
        int i3 = getInt(cOSName, 0);
        if (z) {
            i2 = i | i3;
        } else {
            i2 = (~i) & i3;
        }
        setInt(cOSName, i2);
    }

    public void setFloat(String str, float f) {
        setFloat(COSName.getPDFName(str), f);
    }

    public void setInt(String str, int i) {
        setInt(COSName.getPDFName(str), i);
    }

    public void setItem(COSName cOSName, COSBase cOSBase) {
        if (cOSBase == null) {
            removeItem(cOSName);
        } else {
            this.items.put(cOSName, cOSBase);
        }
    }

    public void setLong(String str, long j) {
        setLong(COSName.getPDFName(str), j);
    }

    public void setName(String str, String str2) {
        setName(COSName.getPDFName(str), str2);
    }

    @Override // com.tom_roush.pdfbox.cos.COSUpdateInfo
    public void setNeedToBeUpdated(boolean z) {
        this.f59728b = z;
    }

    public void setString(String str, String str2) {
        setString(COSName.getPDFName(str), str2);
    }

    public int size() {
        return this.items.size();
    }

    public String toString() {
        try {
            return m32792b(this, new ArrayList());
        } catch (IOException e) {
            return "COSDictionary{" + e.getMessage() + "}";
        }
    }

    public boolean containsKey(String str) {
        return containsKey(COSName.getPDFName(str));
    }

    public boolean getBoolean(COSName cOSName, boolean z) {
        return getBoolean(cOSName, null, z);
    }

    public Calendar getDate(COSName cOSName) {
        COSBase dictionaryObject = getDictionaryObject(cOSName);
        if (dictionaryObject instanceof COSString) {
            return DateConverter.toCalendar((COSString) dictionaryObject);
        }
        return null;
    }

    public COSBase getDictionaryObject(COSName cOSName, COSName cOSName2) {
        COSBase dictionaryObject = getDictionaryObject(cOSName);
        return (dictionaryObject != null || cOSName2 == null) ? dictionaryObject : getDictionaryObject(cOSName2);
    }

    public Calendar getEmbeddedDate(String str, COSName cOSName) throws IOException {
        return getEmbeddedDate(str, cOSName, (Calendar) null);
    }

    public int getEmbeddedInt(String str, COSName cOSName) {
        return getEmbeddedInt(str, cOSName, -1);
    }

    public String getEmbeddedString(String str, COSName cOSName) {
        return getEmbeddedString(str, cOSName, (String) null);
    }

    public float getFloat(COSName cOSName) {
        return getFloat(cOSName, -1.0f);
    }

    public int getInt(COSName cOSName) {
        return getInt(cOSName, -1);
    }

    public COSBase getItem(String str) {
        return getItem(COSName.getPDFName(str));
    }

    public long getLong(COSName cOSName) {
        return getLong(cOSName, -1L);
    }

    public String getNameAsString(COSName cOSName) {
        COSBase dictionaryObject = getDictionaryObject(cOSName);
        if (dictionaryObject instanceof COSName) {
            return ((COSName) dictionaryObject).getName();
        }
        if (dictionaryObject instanceof COSString) {
            return ((COSString) dictionaryObject).getString();
        }
        return null;
    }

    public String getString(COSName cOSName) {
        COSBase dictionaryObject = getDictionaryObject(cOSName);
        if (dictionaryObject instanceof COSString) {
            return ((COSString) dictionaryObject).getString();
        }
        return null;
    }

    public void setBoolean(COSName cOSName, boolean z) {
        setItem(cOSName, (COSBase) COSBoolean.getBoolean(z));
    }

    public void setDate(COSName cOSName, Calendar calendar) {
        setString(cOSName, DateConverter.toString(calendar));
    }

    public void setEmbeddedDate(String str, COSName cOSName, Calendar calendar) {
        COSDictionary cOSDictionary = (COSDictionary) getDictionaryObject(str);
        if (cOSDictionary == null && calendar != null) {
            cOSDictionary = new COSDictionary();
            setItem(str, (COSBase) cOSDictionary);
        }
        if (cOSDictionary != null) {
            cOSDictionary.setDate(cOSName, calendar);
        }
    }

    public void setEmbeddedInt(String str, COSName cOSName, int i) {
        COSDictionary cOSDictionary = (COSDictionary) getDictionaryObject(str);
        if (cOSDictionary == null) {
            cOSDictionary = new COSDictionary();
            setItem(str, (COSBase) cOSDictionary);
        }
        cOSDictionary.setInt(cOSName, i);
    }

    public void setEmbeddedString(String str, COSName cOSName, String str2) {
        COSDictionary cOSDictionary = (COSDictionary) getDictionaryObject(str);
        if (cOSDictionary == null && str2 != null) {
            cOSDictionary = new COSDictionary();
            setItem(str, (COSBase) cOSDictionary);
        }
        if (cOSDictionary != null) {
            cOSDictionary.setString(cOSName, str2);
        }
    }

    public void setFloat(COSName cOSName, float f) {
        setItem(cOSName, (COSBase) new COSFloat(f));
    }

    public void setInt(COSName cOSName, int i) {
        setItem(cOSName, (COSBase) COSInteger.get(i));
    }

    public void setLong(COSName cOSName, long j) {
        setItem(cOSName, (COSBase) COSInteger.get(j));
    }

    public void setName(COSName cOSName, String str) {
        setItem(cOSName, (COSBase) (str != null ? COSName.getPDFName(str) : null));
    }

    public void setString(COSName cOSName, String str) {
        setItem(cOSName, (COSBase) (str != null ? new COSString(str) : null));
    }

    public COSDictionary(COSDictionary cOSDictionary) {
        SmallMap smallMap = new SmallMap();
        this.items = smallMap;
        smallMap.putAll(cOSDictionary.items);
    }

    public boolean getBoolean(COSName cOSName, COSName cOSName2, boolean z) {
        COSBase dictionaryObject = getDictionaryObject(cOSName, cOSName2);
        return dictionaryObject instanceof COSBoolean ? dictionaryObject == COSBoolean.TRUE : z;
    }

    public Calendar getEmbeddedDate(String str, String str2, Calendar calendar) throws IOException {
        return getEmbeddedDate(str, COSName.getPDFName(str2), calendar);
    }

    public int getEmbeddedInt(String str, String str2, int i) {
        return getEmbeddedInt(str, COSName.getPDFName(str2), i);
    }

    public String getEmbeddedString(String str, String str2, String str3) {
        return getEmbeddedString(str, COSName.getPDFName(str2), str3);
    }

    public float getFloat(String str, float f) {
        return getFloat(COSName.getPDFName(str), f);
    }

    public int getInt(String[] strArr, int i) {
        COSBase dictionaryObject = getDictionaryObject(strArr);
        return dictionaryObject instanceof COSNumber ? ((COSNumber) dictionaryObject).intValue() : i;
    }

    public COSBase getItem(COSName cOSName, COSName cOSName2) {
        COSBase item = getItem(cOSName);
        return (item != null || cOSName2 == null) ? item : getItem(cOSName2);
    }

    public long getLong(String[] strArr, long j) {
        COSBase dictionaryObject = getDictionaryObject(strArr);
        return dictionaryObject instanceof COSNumber ? ((COSNumber) dictionaryObject).longValue() : j;
    }

    public void setItem(COSName cOSName, COSObjectable cOSObjectable) {
        setItem(cOSName, cOSObjectable != null ? cOSObjectable.getCOSObject() : null);
    }

    public COSName getCOSName(COSName cOSName, COSName cOSName2) {
        COSBase dictionaryObject = getDictionaryObject(cOSName);
        return dictionaryObject instanceof COSName ? (COSName) dictionaryObject : cOSName2;
    }

    public COSBase getDictionaryObject(String[] strArr) {
        COSBase cOSBase = null;
        for (int i = 0; i < strArr.length && cOSBase == null; i++) {
            cOSBase = getDictionaryObject(COSName.getPDFName(strArr[i]));
        }
        return cOSBase;
    }

    public Calendar getEmbeddedDate(String str, COSName cOSName, Calendar calendar) throws IOException {
        COSDictionary cOSDictionary = (COSDictionary) getDictionaryObject(str);
        return cOSDictionary != null ? cOSDictionary.getDate(cOSName, calendar) : calendar;
    }

    public int getEmbeddedInt(String str, COSName cOSName, int i) {
        COSDictionary cOSDictionary = (COSDictionary) getDictionaryObject(str);
        return cOSDictionary != null ? cOSDictionary.getInt(cOSName, i) : i;
    }

    public String getEmbeddedString(String str, COSName cOSName, String str2) {
        COSBase dictionaryObject = getDictionaryObject(str);
        return dictionaryObject instanceof COSDictionary ? ((COSDictionary) dictionaryObject).getString(cOSName, str2) : str2;
    }

    public float getFloat(COSName cOSName, float f) {
        COSBase dictionaryObject = getDictionaryObject(cOSName);
        return dictionaryObject instanceof COSNumber ? ((COSNumber) dictionaryObject).floatValue() : f;
    }

    public Calendar getDate(String str, Calendar calendar) {
        return getDate(COSName.getPDFName(str), calendar);
    }

    public String getString(String str, String str2) {
        return getString(COSName.getPDFName(str), str2);
    }

    public void setItem(String str, COSObjectable cOSObjectable) {
        setItem(COSName.getPDFName(str), cOSObjectable);
    }

    public Calendar getDate(COSName cOSName, Calendar calendar) {
        Calendar date = getDate(cOSName);
        return date == null ? calendar : date;
    }

    public COSBase getDictionaryObject(COSName cOSName) {
        COSBase cOSBase = this.items.get(cOSName);
        if (cOSBase instanceof COSObject) {
            cOSBase = ((COSObject) cOSBase).getObject();
        }
        if (cOSBase instanceof COSNull) {
            return null;
        }
        return cOSBase;
    }

    public int getInt(String str, int i) {
        return getInt(COSName.getPDFName(str), i);
    }

    public long getLong(String str, long j) {
        return getLong(COSName.getPDFName(str), j);
    }

    public String getString(COSName cOSName, String str) {
        String string = getString(cOSName);
        return string == null ? str : string;
    }

    public void setItem(String str, COSBase cOSBase) {
        setItem(COSName.getPDFName(str), cOSBase);
    }

    public int getInt(COSName cOSName, int i) {
        return getInt(cOSName, null, i);
    }

    public long getLong(COSName cOSName, long j) {
        COSBase dictionaryObject = getDictionaryObject(cOSName);
        return dictionaryObject instanceof COSNumber ? ((COSNumber) dictionaryObject).longValue() : j;
    }

    public String getNameAsString(String str, String str2) {
        return getNameAsString(COSName.getPDFName(str), str2);
    }

    public int getInt(COSName cOSName, COSName cOSName2) {
        return getInt(cOSName, cOSName2, -1);
    }

    public String getNameAsString(COSName cOSName, String str) {
        String nameAsString = getNameAsString(cOSName);
        return nameAsString == null ? str : nameAsString;
    }

    public int getInt(COSName cOSName, COSName cOSName2, int i) {
        COSBase dictionaryObject = getDictionaryObject(cOSName, cOSName2);
        return dictionaryObject instanceof COSNumber ? ((COSNumber) dictionaryObject).intValue() : i;
    }
}
