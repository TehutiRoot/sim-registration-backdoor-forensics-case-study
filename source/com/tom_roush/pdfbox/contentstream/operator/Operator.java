package com.tom_roush.pdfbox.contentstream.operator;

import com.google.firebase.sessions.settings.RemoteSettings;
import com.tom_roush.pdfbox.cos.COSDictionary;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* loaded from: classes5.dex */
public final class Operator {

    /* renamed from: d */
    public static final ConcurrentMap f59720d = new ConcurrentHashMap();

    /* renamed from: a */
    public final String f59721a;

    /* renamed from: b */
    public byte[] f59722b;

    /* renamed from: c */
    public COSDictionary f59723c;

    public Operator(String str) {
        this.f59721a = str;
        if (!str.startsWith(RemoteSettings.FORWARD_SLASH_STRING)) {
            return;
        }
        throw new IllegalArgumentException("Operators are not allowed to start with / '" + str + OperatorName.SHOW_TEXT_LINE);
    }

    public static Operator getOperator(String str) {
        if (!str.equals(OperatorName.BEGIN_INLINE_IMAGE_DATA) && !OperatorName.BEGIN_INLINE_IMAGE.equals(str)) {
            ConcurrentMap concurrentMap = f59720d;
            Operator operator = (Operator) concurrentMap.get(str);
            if (operator == null) {
                Operator operator2 = (Operator) concurrentMap.putIfAbsent(str, new Operator(str));
                if (operator2 == null) {
                    return (Operator) concurrentMap.get(str);
                }
                return operator2;
            }
            return operator;
        }
        return new Operator(str);
    }

    public byte[] getImageData() {
        return this.f59722b;
    }

    public COSDictionary getImageParameters() {
        return this.f59723c;
    }

    public String getName() {
        return this.f59721a;
    }

    public void setImageData(byte[] bArr) {
        this.f59722b = bArr;
    }

    public void setImageParameters(COSDictionary cOSDictionary) {
        this.f59723c = cOSDictionary;
    }

    public String toString() {
        return "PDFOperator{" + this.f59721a + "}";
    }
}
