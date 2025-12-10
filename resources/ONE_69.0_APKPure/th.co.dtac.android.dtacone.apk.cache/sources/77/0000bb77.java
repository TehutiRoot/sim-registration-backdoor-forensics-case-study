package com.netcetera.threeds.sdk.infrastructure;

import com.google.common.base.Ascii;
import com.netcetera.threeds.sdk.infrastructure.setLineSpacing;
import kotlin.text.Typography;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.bouncycastle.pqc.math.linearalgebra.Matrix;

/* renamed from: com.netcetera.threeds.sdk.infrastructure.di */
/* loaded from: classes5.dex */
public class C9322di implements keys {
    private static int ThreeDS2ServiceInstance = 1;
    public static char[] valueOf = {'3', 'j', 'k', 'n', 't', 'l', 'l', 'I', Typography.amp, 'P', 't', 'r', 'o', 'k', 'D', 'I', 'k', 'l', 't', 'J', Matrix.MATRIX_TYPE_RANDOM_LT, 'v', 'r', 'n', 'Y', '9', 'S', AbstractJsonLexerKt.UNICODE_ESC, 's', 'q', 'Y', Matrix.MATRIX_TYPE_ZERO, '^', 'Y', 'f', 'j', 'i', 'h', 'l', 'f', 'd', 'e', 'A', 'O', 144, 150, Typography.registered, Typography.degree, 178, 150, 'j', 138, 185, Typography.nbsp, 152, 175, 175, 170, Typography.section, 168, Typography.section, 128, 't', 148, Typography.section, 171, 172, 170, Ascii.MAX, 'w', 140, 'q', 'p', 148, Typography.section, Typography.copyright, 165, 168, 134, 136, 173, 171, 171, 129, '~', Typography.cent, 161, Typography.pound, Typography.copyright, 165, 166, Typography.section, Typography.pound, 145, 143, Typography.section, '4', 'j', 'l', 'h', 'k', 'I', 'K', 'p', 'n', 'n', 'D', 'A', 'e', 'd', 'f', 'l', 'h', 'i', 'j', 'f', 'T', Matrix.MATRIX_TYPE_RANDOM_REGULAR, 'j', 'j', 'S', 'Y', 'q', 's', AbstractJsonLexerKt.UNICODE_ESC, 'f', 'e', 's', 'T', '-', 'M', '|', 'c', AbstractJsonLexerKt.BEGIN_LIST, 'r', 'r', 'm', 'j', 'k', 'j', 'C', '7', 'W', 'j', 'n', 'o', 'm', 'B', ':', 'O', '4', '3'};
    private static int values;
    private final isEmpty ThreeDS2Service;
    private final InterfaceC9641ns get = C9642nt.ThreeDS2ServiceInstance(C9322di.class);

    public C9322di(isEmpty isempty) {
        this.ThreeDS2Service = isempty;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.keys
    public void valueOf(setLineSpacing.ThreeDS2ServiceInstance threeDS2ServiceInstance) {
        String str;
        String str2;
        values = (ThreeDS2ServiceInstance + 35) % 128;
        isEmpty isempty = this.ThreeDS2Service;
        if (isempty instanceof C9262bi) {
            str = ((C9262bi) isempty).valueOf();
            ThreeDS2ServiceInstance = (values + 23) % 128;
            str2 = null;
        } else if (isempty instanceof C9232aj) {
            C9232aj c9232aj = (C9232aj) isempty;
            String values2 = c9232aj.values();
            str2 = c9232aj.get();
            str = values2;
        } else {
            str = null;
            str2 = null;
        }
        if (C9658om.valueOf(str, str2)) {
            ThreeDS2ServiceInstance = (values + 95) % 128;
            threeDS2ServiceInstance.get(EnumC9560load.ThreeDS2ServiceInstance);
        } else {
            if (C9658om.valueOf(str)) {
                threeDS2ServiceInstance.ThreeDS2ServiceInstance(str);
                ThreeDS2ServiceInstance = (values + 113) % 128;
            }
            if (C9658om.valueOf(str2)) {
                threeDS2ServiceInstance.values(str2);
            }
        }
        int i = values + 29;
        ThreeDS2ServiceInstance = i % 128;
        if (i % 2 != 0) {
            return;
        }
        throw null;
    }
}