package p000;

import com.google.protobuf.ByteString;

/* renamed from: YR1 */
/* loaded from: classes4.dex */
public abstract class YR1 {

    /* renamed from: YR1$a */
    /* loaded from: classes4.dex */
    public class C1755a implements InterfaceC1756b {

        /* renamed from: a */
        public final /* synthetic */ ByteString f7761a;

        public C1755a(ByteString byteString) {
            this.f7761a = byteString;
        }

        @Override // p000.YR1.InterfaceC1756b
        /* renamed from: a */
        public byte mo65355a(int i) {
            return this.f7761a.byteAt(i);
        }

        @Override // p000.YR1.InterfaceC1756b
        public int size() {
            return this.f7761a.size();
        }
    }

    /* renamed from: YR1$b */
    /* loaded from: classes4.dex */
    public interface InterfaceC1756b {
        /* renamed from: a */
        byte mo65355a(int i);

        int size();
    }

    /* renamed from: a */
    public static String m65358a(InterfaceC1756b interfaceC1756b) {
        StringBuilder sb = new StringBuilder(interfaceC1756b.size());
        for (int i = 0; i < interfaceC1756b.size(); i++) {
            byte mo65355a = interfaceC1756b.mo65355a(i);
            if (mo65355a != 34) {
                if (mo65355a != 39) {
                    if (mo65355a != 92) {
                        switch (mo65355a) {
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
                                if (mo65355a >= 32 && mo65355a <= 126) {
                                    sb.append((char) mo65355a);
                                    continue;
                                } else {
                                    sb.append('\\');
                                    sb.append((char) (((mo65355a >>> 6) & 3) + 48));
                                    sb.append((char) (((mo65355a >>> 3) & 7) + 48));
                                    sb.append((char) ((mo65355a & 7) + 48));
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
    public static String m65357b(ByteString byteString) {
        return m65358a(new C1755a(byteString));
    }

    /* renamed from: c */
    public static String m65356c(String str) {
        return m65357b(ByteString.copyFromUtf8(str));
    }
}
