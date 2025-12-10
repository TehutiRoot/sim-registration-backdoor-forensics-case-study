package com.tom_roush.pdfbox.pdmodel.common;

import android.util.Log;
import com.tom_roush.pdfbox.cos.COSArray;
import com.tom_roush.pdfbox.cos.COSBase;
import com.tom_roush.pdfbox.cos.COSDictionary;
import com.tom_roush.pdfbox.cos.COSName;
import com.tom_roush.pdfbox.cos.COSString;
import com.tom_roush.pdfbox.pdmodel.common.COSObjectable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes5.dex */
public abstract class PDNameTreeNode<T extends COSObjectable> implements COSObjectable {

    /* renamed from: a */
    public final COSDictionary f60152a;

    /* renamed from: b */
    public PDNameTreeNode f60153b;

    public PDNameTreeNode() {
        this.f60152a = new COSDictionary();
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x006f -> B:19:0x0076). Please submit an issue!!! */
    /* renamed from: a */
    public final void m32566a() {
        if (isRootNode()) {
            this.f60152a.setItem(COSName.LIMITS, (COSBase) null);
            return;
        }
        List<PDNameTreeNode<T>> kids = getKids();
        if (kids != null && !kids.isEmpty()) {
            m32565b(kids.get(0).getLowerLimit());
            m32564c(kids.get(kids.size() - 1).getUpperLimit());
            return;
        }
        try {
            Map<String, T> names = getNames();
            if (names != null && names.size() > 0) {
                Set<String> keySet = names.keySet();
                String[] strArr = (String[]) keySet.toArray(new String[keySet.size()]);
                m32565b(strArr[0]);
                m32564c(strArr[strArr.length - 1]);
            } else {
                this.f60152a.setItem(COSName.LIMITS, (COSBase) null);
            }
        } catch (IOException unused) {
            this.f60152a.setItem(COSName.LIMITS, (COSBase) null);
        }
    }

    /* renamed from: b */
    public final void m32565b(String str) {
        COSDictionary cOSDictionary = this.f60152a;
        COSName cOSName = COSName.LIMITS;
        COSArray cOSArray = cOSDictionary.getCOSArray(cOSName);
        if (cOSArray == null) {
            cOSArray = new COSArray();
            cOSArray.add((COSBase) null);
            cOSArray.add((COSBase) null);
            this.f60152a.setItem(cOSName, (COSBase) cOSArray);
        }
        cOSArray.setString(0, str);
    }

    /* renamed from: c */
    public final void m32564c(String str) {
        COSDictionary cOSDictionary = this.f60152a;
        COSName cOSName = COSName.LIMITS;
        COSArray cOSArray = cOSDictionary.getCOSArray(cOSName);
        if (cOSArray == null) {
            cOSArray = new COSArray();
            cOSArray.add((COSBase) null);
            cOSArray.add((COSBase) null);
            this.f60152a.setItem(cOSName, (COSBase) cOSArray);
        }
        cOSArray.setString(1, str);
    }

    public abstract T convertCOSToPD(COSBase cOSBase) throws IOException;

    public abstract PDNameTreeNode<T> createChildNode(COSDictionary cOSDictionary);

    public List<PDNameTreeNode<T>> getKids() {
        COSArray cOSArray = this.f60152a.getCOSArray(COSName.KIDS);
        if (cOSArray != null) {
            ArrayList arrayList = new ArrayList(cOSArray.size());
            for (int i = 0; i < cOSArray.size(); i++) {
                arrayList.add(createChildNode((COSDictionary) cOSArray.getObject(i)));
            }
            return new COSArrayList(arrayList, cOSArray);
        }
        return null;
    }

    public String getLowerLimit() {
        COSArray cOSArray = this.f60152a.getCOSArray(COSName.LIMITS);
        if (cOSArray != null) {
            return cOSArray.getString(0);
        }
        return null;
    }

    public Map<String, T> getNames() throws IOException {
        COSArray cOSArray = this.f60152a.getCOSArray(COSName.NAMES);
        if (cOSArray != null) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            if (cOSArray.size() % 2 != 0) {
                Log.w("PdfBox-Android", "Names array has odd size: " + cOSArray.size());
            }
            int i = 0;
            while (true) {
                int i2 = i + 1;
                if (i2 < cOSArray.size()) {
                    COSBase object = cOSArray.getObject(i);
                    if (object instanceof COSString) {
                        linkedHashMap.put(((COSString) object).getString(), convertCOSToPD(cOSArray.getObject(i2)));
                        i += 2;
                    } else {
                        throw new IOException("Expected string, found " + object + " in name tree at index " + i);
                    }
                } else {
                    return Collections.unmodifiableMap(linkedHashMap);
                }
            }
        } else {
            return null;
        }
    }

    public PDNameTreeNode<T> getParent() {
        return this.f60153b;
    }

    public String getUpperLimit() {
        COSArray cOSArray = this.f60152a.getCOSArray(COSName.LIMITS);
        if (cOSArray != null) {
            return cOSArray.getString(1);
        }
        return null;
    }

    public T getValue(String str) throws IOException {
        Map<String, T> names = getNames();
        if (names != null) {
            return names.get(str);
        }
        List<PDNameTreeNode<T>> kids = getKids();
        if (kids != null) {
            for (int i = 0; i < kids.size(); i++) {
                PDNameTreeNode<T> pDNameTreeNode = kids.get(i);
                String upperLimit = pDNameTreeNode.getUpperLimit();
                String lowerLimit = pDNameTreeNode.getLowerLimit();
                if (upperLimit == null || lowerLimit == null || upperLimit.compareTo(lowerLimit) < 0 || (lowerLimit.compareTo(str) <= 0 && upperLimit.compareTo(str) >= 0)) {
                    return pDNameTreeNode.getValue(str);
                }
            }
            return null;
        }
        Log.w("PdfBox-Android", "NameTreeNode does not have \"names\" nor \"kids\" objects.");
        return null;
    }

    public boolean isRootNode() {
        if (this.f60153b == null) {
            return true;
        }
        return false;
    }

    public void setKids(List<? extends PDNameTreeNode<T>> list) {
        if (list != null && !list.isEmpty()) {
            for (PDNameTreeNode<T> pDNameTreeNode : list) {
                pDNameTreeNode.setParent(this);
            }
            this.f60152a.setItem(COSName.KIDS, (COSBase) COSArrayList.converterToCOSArray(list));
            if (isRootNode()) {
                this.f60152a.setItem(COSName.NAMES, (COSBase) null);
            }
        } else {
            this.f60152a.setItem(COSName.KIDS, (COSBase) null);
            this.f60152a.setItem(COSName.LIMITS, (COSBase) null);
        }
        m32566a();
    }

    public void setNames(Map<String, T> map) {
        if (map == null) {
            this.f60152a.setItem(COSName.NAMES, (COSObjectable) null);
            this.f60152a.setItem(COSName.LIMITS, (COSObjectable) null);
            return;
        }
        COSArray cOSArray = new COSArray();
        ArrayList<String> arrayList = new ArrayList(map.keySet());
        Collections.sort(arrayList);
        for (String str : arrayList) {
            cOSArray.add((COSBase) new COSString(str));
            cOSArray.add(map.get(str));
        }
        this.f60152a.setItem(COSName.NAMES, (COSBase) cOSArray);
        m32566a();
    }

    public void setParent(PDNameTreeNode<T> pDNameTreeNode) {
        this.f60153b = pDNameTreeNode;
        m32566a();
    }

    @Override // com.tom_roush.pdfbox.pdmodel.common.COSObjectable
    public COSDictionary getCOSObject() {
        return this.f60152a;
    }

    public PDNameTreeNode(COSDictionary cOSDictionary) {
        this.f60152a = cOSDictionary;
    }
}
