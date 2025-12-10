package com.netcetera.threeds.sdk.infrastructure;

/* renamed from: com.netcetera.threeds.sdk.infrastructure.pa */
/* loaded from: classes5.dex */
public class C9685pa {
    public Object get;
    public int values;

    public C9685pa(int i, Object obj) {
        this.values = i;
        this.get = obj;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        switch (this.values) {
            case -1:
                sb.append("END OF FILE");
                break;
            case 0:
                sb.append("VALUE(");
                sb.append(this.get);
                sb.append(")");
                break;
            case 1:
                sb.append("LEFT BRACE({)");
                break;
            case 2:
                sb.append("RIGHT BRACE(})");
                break;
            case 3:
                sb.append("LEFT SQUARE([)");
                break;
            case 4:
                sb.append("RIGHT SQUARE(])");
                break;
            case 5:
                sb.append("COMMA(,)");
                break;
            case 6:
                sb.append("COLON(:)");
                break;
        }
        return sb.toString();
    }
}
