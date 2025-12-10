package p000;

import androidx.datastore.preferences.protobuf.ByteString;

/* renamed from: WS1 */
/* loaded from: classes2.dex */
public abstract class WS1 {

    /* renamed from: WS1$a */
    /* loaded from: classes2.dex */
    public static class C1597a implements InterfaceC1598b {

        /* renamed from: a */
        public final /* synthetic */ ByteString f7284a;

        public C1597a(ByteString byteString) {
            this.f7284a = byteString;
        }

        @Override // p000.WS1.InterfaceC1598b
        /* renamed from: a */
        public byte mo65754a(int i) {
            return this.f7284a.byteAt(i);
        }

        @Override // p000.WS1.InterfaceC1598b
        public int size() {
            return this.f7284a.size();
        }
    }

    /* renamed from: WS1$b */
    /* loaded from: classes2.dex */
    public interface InterfaceC1598b {
        /* renamed from: a */
        byte mo65754a(int i);

        int size();
    }

    /* renamed from: a */
    public static String m65757a(InterfaceC1598b interfaceC1598b) {
        StringBuilder sb = new StringBuilder(interfaceC1598b.size());
        for (int i = 0; i < interfaceC1598b.size(); i++) {
            byte mo65754a = interfaceC1598b.mo65754a(i);
            if (mo65754a != 34) {
                if (mo65754a != 39) {
                    if (mo65754a != 92) {
                        switch (mo65754a) {
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
                                if (mo65754a >= 32 && mo65754a <= 126) {
                                    sb.append((char) mo65754a);
                                    continue;
                                } else {
                                    sb.append('\\');
                                    sb.append((char) (((mo65754a >>> 6) & 3) + 48));
                                    sb.append((char) (((mo65754a >>> 3) & 7) + 48));
                                    sb.append((char) ((mo65754a & 7) + 48));
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
    public static String m65756b(ByteString byteString) {
        return m65757a(new C1597a(byteString));
    }

    /* renamed from: c */
    public static String m65755c(String str) {
        return m65756b(ByteString.copyFromUtf8(str));
    }
}