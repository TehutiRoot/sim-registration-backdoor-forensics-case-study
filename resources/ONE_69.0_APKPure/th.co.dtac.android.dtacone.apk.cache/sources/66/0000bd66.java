package com.netcetera.threeds.sdk.infrastructure;

/* renamed from: com.netcetera.threeds.sdk.infrastructure.oz */
/* loaded from: classes5.dex */
public class C9672oz extends Exception {
    private int ThreeDS2Service;
    private Object ThreeDS2ServiceInstance;
    private int get;

    public C9672oz(int i, int i2, Object obj) {
        this.ThreeDS2Service = i;
        this.get = i2;
        this.ThreeDS2ServiceInstance = obj;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        StringBuilder sb = new StringBuilder();
        int i = this.get;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    sb.append("Unknown error at position ");
                    sb.append(this.ThreeDS2Service);
                    sb.append(".");
                } else {
                    sb.append("Unexpected exception at position ");
                    sb.append(this.ThreeDS2Service);
                    sb.append(": ");
                    sb.append(this.ThreeDS2ServiceInstance);
                }
            } else {
                sb.append("Unexpected token ");
                sb.append(this.ThreeDS2ServiceInstance);
                sb.append(" at position ");
                sb.append(this.ThreeDS2Service);
                sb.append(".");
            }
        } else {
            sb.append("Unexpected character (");
            sb.append(this.ThreeDS2ServiceInstance);
            sb.append(") at position ");
            sb.append(this.ThreeDS2Service);
            sb.append(".");
        }
        return sb.toString();
    }
}