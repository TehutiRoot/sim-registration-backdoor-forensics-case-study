package p000;

import androidx.datastore.preferences.protobuf.ByteString;

/* renamed from: ZR1 */
/* loaded from: classes2.dex */
public abstract class ZR1 {

    /* renamed from: ZR1$a */
    /* loaded from: classes2.dex */
    public static class C1824a implements InterfaceC1825b {

        /* renamed from: a */
        public final /* synthetic */ ByteString f8038a;

        public C1824a(ByteString byteString) {
            this.f8038a = byteString;
        }

        @Override // p000.ZR1.InterfaceC1825b
        /* renamed from: a */
        public byte mo65234a(int i) {
            return this.f8038a.byteAt(i);
        }

        @Override // p000.ZR1.InterfaceC1825b
        public int size() {
            return this.f8038a.size();
        }
    }

    /* renamed from: ZR1$b */
    /* loaded from: classes2.dex */
    public interface InterfaceC1825b {
        /* renamed from: a */
        byte mo65234a(int i);

        int size();
    }

    /* renamed from: a */
    public static String m65237a(InterfaceC1825b interfaceC1825b) {
        StringBuilder sb = new StringBuilder(interfaceC1825b.size());
        for (int i = 0; i < interfaceC1825b.size(); i++) {
            byte mo65234a = interfaceC1825b.mo65234a(i);
            if (mo65234a != 34) {
                if (mo65234a != 39) {
                    if (mo65234a != 92) {
                        switch (mo65234a) {
                            case 7:
                                sb.append("\\a");
                                continue;
                            case 8:
                                sb.append("\\b");
                                continue;
                            case 9:
                                sb.append("\\t");
                                continue;
                            case 10:
                                sb.append("\\n");
                                continue;
                            case 11:
                                sb.append("\\v");
                                continue;
                            case 12:
                                sb.append("\\f");
                                continue;
                            case 13:
                                sb.append("\\r");
                                continue;
                            default:
                                if (mo65234a >= 32 && mo65234a <= 126) {
                                    sb.append((char) mo65234a);
                                    continue;
                                } else {
                                    sb.append('\\');
                                    sb.append((char) (((mo65234a >>> 6) & 3) + 48));
                                    sb.append((char) (((mo65234a >>> 3) & 7) + 48));
                                    sb.append((char) ((mo65234a & 7) + 48));
                                    break;
                                }
                                break;
                        }
                    } else {
                        sb.append("\\\\");
                    }
                } else {
                    sb.append("\\'");
                }
            } else {
                sb.append("\\\"");
            }
        }
        return sb.toString();
    }

    /* renamed from: b */
    public static String m65236b(ByteString byteString) {
        return m65237a(new C1824a(byteString));
    }

    /* renamed from: c */
    public static String m65235c(String str) {
        return m65236b(ByteString.copyFromUtf8(str));
    }
}
