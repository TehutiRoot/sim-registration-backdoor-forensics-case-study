package com.tom_roush.pdfbox.pdmodel.common;

import android.util.Log;
import com.tom_roush.pdfbox.cos.COSArray;
import com.tom_roush.pdfbox.cos.COSBase;
import com.tom_roush.pdfbox.cos.COSDictionary;
import com.tom_roush.pdfbox.cos.COSInteger;
import com.tom_roush.pdfbox.cos.COSName;
import com.tom_roush.pdfbox.cos.COSNull;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes5.dex */
public class PDNumberTreeNode implements COSObjectable {

    /* renamed from: a */
    public final COSDictionary f60154a;

    /* renamed from: b */
    public Class f60155b;

    public PDNumberTreeNode(Class<? extends COSObjectable> cls) {
        this.f60155b = null;
        this.f60154a = new COSDictionary();
        this.f60155b = cls;
    }

    /* renamed from: a */
    public final void m32563a(Integer num) {
        COSDictionary cOSDictionary = this.f60154a;
        COSName cOSName = COSName.LIMITS;
        COSArray cOSArray = (COSArray) cOSDictionary.getDictionaryObject(cOSName);
        if (cOSArray == null) {
            cOSArray = new COSArray();
            cOSArray.add((COSBase) null);
            cOSArray.add((COSBase) null);
            this.f60154a.setItem(cOSName, (COSBase) cOSArray);
        }
        if (num != null) {
            cOSArray.setInt(0, num.intValue());
        } else {
            cOSArray.set(0, (COSBase) null);
        }
    }

    /* renamed from: b */
    public final void m32562b(Integer num) {
        COSDictionary cOSDictionary = this.f60154a;
        COSName cOSName = COSName.LIMITS;
        COSArray cOSArray = (COSArray) cOSDictionary.getDictionaryObject(cOSName);
        if (cOSArray == null) {
            cOSArray = new COSArray();
            cOSArray.add((COSBase) null);
            cOSArray.add((COSBase) null);
            this.f60154a.setItem(cOSName, (COSBase) cOSArray);
        }
        if (num != null) {
            cOSArray.setInt(1, num.intValue());
        } else {
            cOSArray.set(1, (COSBase) null);
        }
    }

    public COSObjectable convertCOSToPD(COSBase cOSBase) throws IOException {
        try {
            return (COSObjectable) this.f60155b.getDeclaredConstructor(cOSBase.getClass()).newInstance(cOSBase);
        } catch (Throwable th2) {
            throw new IOException("Error while trying to create value in number tree:" + th2.getMessage(), th2);
        }
    }

    public PDNumberTreeNode createChildNode(COSDictionary cOSDictionary) {
        return new PDNumberTreeNode(cOSDictionary, this.f60155b);
    }

    public List<PDNumberTreeNode> getKids() {
        COSArray cOSArray = (COSArray) this.f60154a.getDictionaryObject(COSName.KIDS);
        if (cOSArray != null) {
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < cOSArray.size(); i++) {
                arrayList.add(createChildNode((COSDictionary) cOSArray.getObject(i)));
            }
            return new COSArrayList(arrayList, cOSArray);
        }
        return null;
    }

    public Integer getLowerLimit() {
        COSArray cOSArray = (COSArray) this.f60154a.getDictionaryObject(COSName.LIMITS);
        if (cOSArray != null && cOSArray.get(0) != null) {
            return Integer.valueOf(cOSArray.getInt(0));
        }
        return null;
    }

    public Map<Integer, COSObjectable> getNumbers() throws IOException {
        COSObjectable convertCOSToPD;
        COSBase dictionaryObject = this.f60154a.getDictionaryObject(COSName.NUMS);
        if (!(dictionaryObject instanceof COSArray)) {
            return null;
        }
        COSArray cOSArray = (COSArray) dictionaryObject;
        HashMap hashMap = new HashMap();
        if (cOSArray.size() % 2 != 0) {
            Log.w("PdfBox-Android", "Numbers array has odd size: " + cOSArray.size());
        }
        int i = 0;
        while (true) {
            int i2 = i + 1;
            if (i2 < cOSArray.size()) {
                COSBase object = cOSArray.getObject(i);
                if (!(object instanceof COSInteger)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("page labels ignored, index ");
                    sb.append(i);
                    sb.append(" should be a number, but is ");
                    sb.append(object);
                    return null;
                }
                COSBase object2 = cOSArray.getObject(i2);
                Integer valueOf = Integer.valueOf(((COSInteger) object).intValue());
                if (object2 == null) {
                    convertCOSToPD = null;
                } else {
                    convertCOSToPD = convertCOSToPD(object2);
                }
                hashMap.put(valueOf, convertCOSToPD);
                i += 2;
            } else {
                return Collections.unmodifiableMap(hashMap);
            }
        }
    }

    public Integer getUpperLimit() {
        COSArray cOSArray = (COSArray) this.f60154a.getDictionaryObject(COSName.LIMITS);
        if (cOSArray != null && cOSArray.get(1) != null) {
            return Integer.valueOf(cOSArray.getInt(1));
        }
        return null;
    }

    public Object getValue(Integer num) throws IOException {
        Map<Integer, COSObjectable> numbers = getNumbers();
        if (numbers != null) {
            return numbers.get(num);
        }
        List<PDNumberTreeNode> kids = getKids();
        Object obj = null;
        if (kids != null) {
            for (int i = 0; i < kids.size() && obj == null; i++) {
                PDNumberTreeNode pDNumberTreeNode = kids.get(i);
                if (pDNumberTreeNode.getLowerLimit().compareTo(num) <= 0 && pDNumberTreeNode.getUpperLimit().compareTo(num) >= 0) {
                    obj = pDNumberTreeNode.getValue(num);
                }
            }
        } else {
            Log.w("PdfBox-Android", "NumberTreeNode does not have \"nums\" nor \"kids\" objects.");
        }
        return obj;
    }

    public void setKids(List<? extends PDNumberTreeNode> list) {
        if (list != null && !list.isEmpty()) {
            m32563a(list.get(0).getLowerLimit());
            m32562b(list.get(list.size() - 1).getUpperLimit());
        } else if (this.f60154a.getDictionaryObject(COSName.NUMS) == null) {
            this.f60154a.setItem(COSName.LIMITS, (COSBase) null);
        }
        this.f60154a.setItem(COSName.KIDS, (COSBase) COSArrayList.converterToCOSArray(list));
    }

    public void setNumbers(Map<Integer, ? extends COSObjectable> map) {
        Integer num;
        Integer num2 = null;
        if (map == null) {
            this.f60154a.setItem(COSName.NUMS, (COSObjectable) null);
            this.f60154a.setItem(COSName.LIMITS, (COSObjectable) null);
            return;
        }
        ArrayList<Integer> arrayList = new ArrayList(map.keySet());
        Collections.sort(arrayList);
        COSArray cOSArray = new COSArray();
        for (Integer num3 : arrayList) {
            cOSArray.add((COSBase) COSInteger.get(num3.intValue()));
            COSObjectable cOSObjectable = map.get(num3);
            if (cOSObjectable == null) {
                cOSObjectable = COSNull.NULL;
            }
            cOSArray.add(cOSObjectable);
        }
        if (!arrayList.isEmpty()) {
            Integer num4 = (Integer) arrayList.get(0);
            num2 = (Integer) arrayList.get(arrayList.size() - 1);
            num = num4;
        } else {
            num = null;
        }
        m32562b(num2);
        m32563a(num);
        this.f60154a.setItem(COSName.NUMS, (COSBase) cOSArray);
    }

    @Override // com.tom_roush.pdfbox.pdmodel.common.COSObjectable
    public COSDictionary getCOSObject() {
        return this.f60154a;
    }

    public PDNumberTreeNode(COSDictionary cOSDictionary, Class<? extends COSObjectable> cls) {
        this.f60154a = cOSDictionary;
        this.f60155b = cls;
    }
}
