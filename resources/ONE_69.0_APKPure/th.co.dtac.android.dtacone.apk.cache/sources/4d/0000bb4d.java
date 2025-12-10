package com.netcetera.threeds.sdk.infrastructure;

import com.netcetera.threeds.sdk.infrastructure.setLineSpacing;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.bouncycastle.pqc.math.linearalgebra.Matrix;
import th.p047co.dtac.android.dtacone.view.activity.CameraActivity;

/* renamed from: com.netcetera.threeds.sdk.infrastructure.cl */
/* loaded from: classes5.dex */
public class C9295cl implements keys {
    public static char[] ThreeDS2ServiceInstance = {'9', 'k', 'h', 'l', 'j', 'W', '3', '6', Matrix.MATRIX_TYPE_RANDOM_LT, 'P', 'N', '4', 'C', 'j', 'k', 'j', 'm', 'r', 'r', AbstractJsonLexerKt.BEGIN_LIST, 'c', '|', 'M', '-', 'Q', 'n', 'n', 'p', 'K'};
    private static int get = 1;
    private static int valueOf;
    private final InterfaceC9641ns ThreeDS2Service = C9642nt.ThreeDS2ServiceInstance(C9295cl.class);
    private final isEmpty values;

    public C9295cl(isEmpty isempty) {
        this.values = isempty;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.keys
    public void valueOf(setLineSpacing.ThreeDS2ServiceInstance threeDS2ServiceInstance) {
        isEmpty isempty = this.values;
        if (isempty instanceof C9262bi) {
            get = (valueOf + 73) % 128;
            threeDS2ServiceInstance.ThreeDS2Service(((C9262bi) isempty).valueOf());
            get = (valueOf + 27) % 128;
        }
        get = (valueOf + CameraActivity.REQUEST_CODE) % 128;
    }
}