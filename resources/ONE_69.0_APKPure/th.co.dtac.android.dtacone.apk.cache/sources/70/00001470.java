package p000;

import com.google.protobuf.ByteString;

/* renamed from: VS1 */
/* loaded from: classes4.dex */
public abstract class VS1 {

    /* renamed from: VS1$a */
    /* loaded from: classes4.dex */
    public class C1518a implements InterfaceC1519b {

        /* renamed from: a */
        public final /* synthetic */ ByteString f6913a;

        public C1518a(ByteString byteString) {
            this.f6913a = byteString;
        }

        @Override // p000.VS1.InterfaceC1519b
        /* renamed from: a */
        public byte mo65985a(int i) {
            return this.f6913a.byteAt(i);
        }

        @Override // p000.VS1.InterfaceC1519b
        public int size() {
            return this.f6913a.size();
        }
    }

    /* renamed from: VS1$b */
    /* loaded from: classes4.dex */
    public interface InterfaceC1519b {
        /* renamed from: a */
        byte mo65985a(int i);

        int size();
    }

    /* renamed from: a */
    public static String m65988a(InterfaceC1519b interfaceC1519b) {
        StringBuilder sb = new StringBuilder(interfaceC1519b.size());
        for (int i = 0; i < interfaceC1519b.size(); i++) {
            byte mo65985a = interfaceC1519b.mo65985a(i);
            if (mo65985a != 34) {
                if (mo65985a != 39) {
                    if (mo65985a != 92) {
                        switch (mo65985a) {
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
                                if (mo65985a >= 32 && mo65985a <= 126) {
                                    sb.append((char) mo65985a);
                                    continue;
                                } else {
                                    sb.append('\\');
                                    sb.append((char) (((mo65985a >>> 6) & 3) + 48));
                                    sb.append((char) (((mo65985a >>> 3) & 7) + 48));
                                    sb.append((char) ((mo65985a & 7) + 48));
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
    public static String m65987b(ByteString byteString) {
        return m65988a(new C1518a(byteString));
    }

    /* renamed from: c */
    public static String m65986c(String str) {
        return m65987b(ByteString.copyFromUtf8(str));
    }
}