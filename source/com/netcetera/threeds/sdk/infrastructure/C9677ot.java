package com.netcetera.threeds.sdk.infrastructure;

import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;
import java.util.HashMap;
import java.util.Map;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import th.p047co.dtac.android.dtacone.view.activity.CameraActivity;

/* renamed from: com.netcetera.threeds.sdk.infrastructure.ot */
/* loaded from: classes5.dex */
public class C9677ot extends HashMap implements InterfaceC9678ou, InterfaceC9679ov, Map {
    public static String ThreeDS2ServiceInstance(String str) {
        return C9681ox.get(str);
    }

    public static void get(Map map, Writer writer) throws IOException {
        if (map == null) {
            writer.write(AbstractJsonLexerKt.NULL);
            return;
        }
        writer.write(CameraActivity.REQUEST_CODE);
        boolean z = true;
        for (Map.Entry entry : map.entrySet()) {
            if (z) {
                z = false;
            } else {
                writer.write(44);
            }
            writer.write(34);
            writer.write(ThreeDS2ServiceInstance(String.valueOf(entry.getKey())));
            writer.write(34);
            writer.write(58);
            C9681ox.values(entry.getValue(), writer);
        }
        writer.write(125);
    }

    public static String valueOf(Map map) {
        StringWriter stringWriter = new StringWriter();
        try {
            get(map, stringWriter);
            return stringWriter.toString();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.InterfaceC9679ov
    public void ThreeDS2Service(Writer writer) throws IOException {
        get(this, writer);
    }

    @Override // java.util.AbstractMap
    public String toString() {
        return valueOf();
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.InterfaceC9678ou
    public String valueOf() {
        return valueOf(this);
    }
}
