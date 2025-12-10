package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.GeneratedMessageLite;
import androidx.datastore.preferences.protobuf.WireFormat;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: androidx.datastore.preferences.protobuf.i */
/* loaded from: classes2.dex */
public final class C4418i extends AbstractC4417h {

    /* renamed from: androidx.datastore.preferences.protobuf.i$a */
    /* loaded from: classes2.dex */
    public static /* synthetic */ class C4419a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f35024a;

        static {
            int[] iArr = new int[WireFormat.FieldType.values().length];
            f35024a = iArr;
            try {
                iArr[WireFormat.FieldType.DOUBLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f35024a[WireFormat.FieldType.FLOAT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f35024a[WireFormat.FieldType.INT64.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f35024a[WireFormat.FieldType.UINT64.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f35024a[WireFormat.FieldType.INT32.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f35024a[WireFormat.FieldType.FIXED64.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f35024a[WireFormat.FieldType.FIXED32.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f35024a[WireFormat.FieldType.BOOL.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f35024a[WireFormat.FieldType.UINT32.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f35024a[WireFormat.FieldType.SFIXED32.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f35024a[WireFormat.FieldType.SFIXED64.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f35024a[WireFormat.FieldType.SINT32.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f35024a[WireFormat.FieldType.SINT64.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f35024a[WireFormat.FieldType.ENUM.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f35024a[WireFormat.FieldType.BYTES.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f35024a[WireFormat.FieldType.STRING.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f35024a[WireFormat.FieldType.GROUP.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f35024a[WireFormat.FieldType.MESSAGE.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
        }
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC4417h
    /* renamed from: a */
    public int mo55148a(Map.Entry entry) {
        return ((GeneratedMessageLite.C4354b) entry.getKey()).getNumber();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC4417h
    /* renamed from: b */
    public Object mo55147b(ExtensionRegistryLite extensionRegistryLite, MessageLite messageLite, int i) {
        return extensionRegistryLite.findLiteExtensionByNumber(messageLite, i);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC4417h
    /* renamed from: c */
    public FieldSet mo55146c(Object obj) {
        return ((GeneratedMessageLite.ExtendableMessage) obj).extensions;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC4417h
    /* renamed from: d */
    public FieldSet mo55145d(Object obj) {
        return ((GeneratedMessageLite.ExtendableMessage) obj).m55703r();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC4417h
    /* renamed from: e */
    public boolean mo55144e(MessageLite messageLite) {
        return messageLite instanceof GeneratedMessageLite.ExtendableMessage;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC4417h
    /* renamed from: f */
    public void mo55143f(Object obj) {
        mo55146c(obj).m55730x();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC4417h
    /* renamed from: g */
    public Object mo55142g(InterfaceC4435u interfaceC4435u, Object obj, ExtensionRegistryLite extensionRegistryLite, FieldSet fieldSet, Object obj2, AbstractC4448y abstractC4448y) {
        Object valueOf;
        Object m55744j;
        ArrayList arrayList;
        GeneratedMessageLite.GeneratedExtension generatedExtension = (GeneratedMessageLite.GeneratedExtension) obj;
        int number = generatedExtension.getNumber();
        if (generatedExtension.f34896d.isRepeated() && generatedExtension.f34896d.isPacked()) {
            switch (C4419a.f35024a[generatedExtension.getLiteType().ordinal()]) {
                case 1:
                    arrayList = new ArrayList();
                    interfaceC4435u.mo54981r(arrayList);
                    break;
                case 2:
                    arrayList = new ArrayList();
                    interfaceC4435u.mo54984o(arrayList);
                    break;
                case 3:
                    arrayList = new ArrayList();
                    interfaceC4435u.mo54976w(arrayList);
                    break;
                case 4:
                    arrayList = new ArrayList();
                    interfaceC4435u.mo54977v(arrayList);
                    break;
                case 5:
                    arrayList = new ArrayList();
                    interfaceC4435u.mo54988k(arrayList);
                    break;
                case 6:
                    arrayList = new ArrayList();
                    interfaceC4435u.mo54973z(arrayList);
                    break;
                case 7:
                    arrayList = new ArrayList();
                    interfaceC4435u.mo54987l(arrayList);
                    break;
                case 8:
                    arrayList = new ArrayList();
                    interfaceC4435u.mo54993f(arrayList);
                    break;
                case 9:
                    arrayList = new ArrayList();
                    interfaceC4435u.mo55010A(arrayList);
                    break;
                case 10:
                    arrayList = new ArrayList();
                    interfaceC4435u.mo54979t(arrayList);
                    break;
                case 11:
                    arrayList = new ArrayList();
                    interfaceC4435u.mo54989j(arrayList);
                    break;
                case 12:
                    arrayList = new ArrayList();
                    interfaceC4435u.mo54991h(arrayList);
                    break;
                case 13:
                    arrayList = new ArrayList();
                    interfaceC4435u.mo54998a(arrayList);
                    break;
                case 14:
                    arrayList = new ArrayList();
                    interfaceC4435u.mo54975x(arrayList);
                    obj2 = AbstractC4437w.m54907z(number, arrayList, generatedExtension.f34896d.getEnumType(), obj2, abstractC4448y);
                    break;
                default:
                    throw new IllegalStateException("Type cannot be packed: " + generatedExtension.f34896d.getLiteType());
            }
            fieldSet.m55759C(generatedExtension.f34896d, arrayList);
        } else {
            if (generatedExtension.getLiteType() == WireFormat.FieldType.ENUM) {
                int readInt32 = interfaceC4435u.readInt32();
                if (generatedExtension.f34896d.getEnumType().findValueByNumber(readInt32) == null) {
                    return AbstractC4437w.m54952L(number, readInt32, obj2, abstractC4448y);
                }
                valueOf = Integer.valueOf(readInt32);
            } else {
                switch (C4419a.f35024a[generatedExtension.getLiteType().ordinal()]) {
                    case 1:
                        valueOf = Double.valueOf(interfaceC4435u.readDouble());
                        break;
                    case 2:
                        valueOf = Float.valueOf(interfaceC4435u.readFloat());
                        break;
                    case 3:
                        valueOf = Long.valueOf(interfaceC4435u.readInt64());
                        break;
                    case 4:
                        valueOf = Long.valueOf(interfaceC4435u.mo54990i());
                        break;
                    case 5:
                        valueOf = Integer.valueOf(interfaceC4435u.readInt32());
                        break;
                    case 6:
                        valueOf = Long.valueOf(interfaceC4435u.mo54980s());
                        break;
                    case 7:
                        valueOf = Integer.valueOf(interfaceC4435u.mo55009B());
                        break;
                    case 8:
                        valueOf = Boolean.valueOf(interfaceC4435u.mo54978u());
                        break;
                    case 9:
                        valueOf = Integer.valueOf(interfaceC4435u.mo54996c());
                        break;
                    case 10:
                        valueOf = Integer.valueOf(interfaceC4435u.mo55007D());
                        break;
                    case 11:
                        valueOf = Long.valueOf(interfaceC4435u.mo54997b());
                        break;
                    case 12:
                        valueOf = Integer.valueOf(interfaceC4435u.mo54994e());
                        break;
                    case 13:
                        valueOf = Long.valueOf(interfaceC4435u.mo55008C());
                        break;
                    case 14:
                        throw new IllegalStateException("Shouldn't reach here.");
                    case 15:
                        valueOf = interfaceC4435u.mo54992g();
                        break;
                    case 16:
                        valueOf = interfaceC4435u.readString();
                        break;
                    case 17:
                        valueOf = interfaceC4435u.mo55001J(generatedExtension.getMessageDefaultInstance().getClass(), extensionRegistryLite);
                        break;
                    case 18:
                        valueOf = interfaceC4435u.mo55004G(generatedExtension.getMessageDefaultInstance().getClass(), extensionRegistryLite);
                        break;
                    default:
                        valueOf = null;
                        break;
                }
            }
            if (generatedExtension.isRepeated()) {
                fieldSet.m55753a(generatedExtension.f34896d, valueOf);
            } else {
                int i = C4419a.f35024a[generatedExtension.getLiteType().ordinal()];
                if ((i == 17 || i == 18) && (m55744j = fieldSet.m55744j(generatedExtension.f34896d)) != null) {
                    valueOf = Internal.m55677d(m55744j, valueOf);
                }
                fieldSet.m55759C(generatedExtension.f34896d, valueOf);
            }
        }
        return obj2;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC4417h
    /* renamed from: h */
    public void mo55141h(InterfaceC4435u interfaceC4435u, Object obj, ExtensionRegistryLite extensionRegistryLite, FieldSet fieldSet) {
        GeneratedMessageLite.GeneratedExtension generatedExtension = (GeneratedMessageLite.GeneratedExtension) obj;
        fieldSet.m55759C(generatedExtension.f34896d, interfaceC4435u.mo55004G(generatedExtension.getMessageDefaultInstance().getClass(), extensionRegistryLite));
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC4417h
    /* renamed from: i */
    public void mo55140i(ByteString byteString, Object obj, ExtensionRegistryLite extensionRegistryLite, FieldSet fieldSet) {
        GeneratedMessageLite.GeneratedExtension generatedExtension = (GeneratedMessageLite.GeneratedExtension) obj;
        MessageLite buildPartial = generatedExtension.getMessageDefaultInstance().newBuilderForType().buildPartial();
        AbstractC4408c m55246M = AbstractC4408c.m55246M(ByteBuffer.wrap(byteString.toByteArray()), true);
        C17783Hp1.m68094a().m68093b(buildPartial, m55246M, extensionRegistryLite);
        fieldSet.m55759C(generatedExtension.f34896d, buildPartial);
        if (m55246M.mo54986m() == Integer.MAX_VALUE) {
            return;
        }
        throw InvalidProtocolBufferException.invalidEndTag();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC4417h
    /* renamed from: j */
    public void mo55139j(Writer writer, Map.Entry entry) {
        GeneratedMessageLite.C4354b c4354b = (GeneratedMessageLite.C4354b) entry.getKey();
        if (c4354b.isRepeated()) {
            switch (C4419a.f35024a[c4354b.getLiteType().ordinal()]) {
                case 1:
                    AbstractC4437w.m54948P(c4354b.getNumber(), (List) entry.getValue(), writer, c4354b.isPacked());
                    return;
                case 2:
                    AbstractC4437w.m54944T(c4354b.getNumber(), (List) entry.getValue(), writer, c4354b.isPacked());
                    return;
                case 3:
                    AbstractC4437w.m54941W(c4354b.getNumber(), (List) entry.getValue(), writer, c4354b.isPacked());
                    return;
                case 4:
                    AbstractC4437w.m54928e0(c4354b.getNumber(), (List) entry.getValue(), writer, c4354b.isPacked());
                    return;
                case 5:
                    AbstractC4437w.m54942V(c4354b.getNumber(), (List) entry.getValue(), writer, c4354b.isPacked());
                    return;
                case 6:
                    AbstractC4437w.m54945S(c4354b.getNumber(), (List) entry.getValue(), writer, c4354b.isPacked());
                    return;
                case 7:
                    AbstractC4437w.m54946R(c4354b.getNumber(), (List) entry.getValue(), writer, c4354b.isPacked());
                    return;
                case 8:
                    AbstractC4437w.m54950N(c4354b.getNumber(), (List) entry.getValue(), writer, c4354b.isPacked());
                    return;
                case 9:
                    AbstractC4437w.m54930d0(c4354b.getNumber(), (List) entry.getValue(), writer, c4354b.isPacked());
                    return;
                case 10:
                    AbstractC4437w.m54939Y(c4354b.getNumber(), (List) entry.getValue(), writer, c4354b.isPacked());
                    return;
                case 11:
                    AbstractC4437w.m54938Z(c4354b.getNumber(), (List) entry.getValue(), writer, c4354b.isPacked());
                    return;
                case 12:
                    AbstractC4437w.m54936a0(c4354b.getNumber(), (List) entry.getValue(), writer, c4354b.isPacked());
                    return;
                case 13:
                    AbstractC4437w.m54934b0(c4354b.getNumber(), (List) entry.getValue(), writer, c4354b.isPacked());
                    return;
                case 14:
                    AbstractC4437w.m54942V(c4354b.getNumber(), (List) entry.getValue(), writer, c4354b.isPacked());
                    return;
                case 15:
                    AbstractC4437w.m54949O(c4354b.getNumber(), (List) entry.getValue(), writer);
                    return;
                case 16:
                    AbstractC4437w.m54932c0(c4354b.getNumber(), (List) entry.getValue(), writer);
                    return;
                case 17:
                    List list = (List) entry.getValue();
                    if (list != null && !list.isEmpty()) {
                        AbstractC4437w.m54943U(c4354b.getNumber(), (List) entry.getValue(), writer, C17783Hp1.m68094a().m68091d(list.get(0).getClass()));
                        return;
                    }
                    return;
                case 18:
                    List list2 = (List) entry.getValue();
                    if (list2 != null && !list2.isEmpty()) {
                        AbstractC4437w.m54940X(c4354b.getNumber(), (List) entry.getValue(), writer, C17783Hp1.m68094a().m68091d(list2.get(0).getClass()));
                        return;
                    }
                    return;
                default:
                    return;
            }
        }
        switch (C4419a.f35024a[c4354b.getLiteType().ordinal()]) {
            case 1:
                writer.mo55159y(c4354b.getNumber(), ((Double) entry.getValue()).doubleValue());
                return;
            case 2:
                writer.mo55200E(c4354b.getNumber(), ((Float) entry.getValue()).floatValue());
                return;
            case 3:
                writer.mo55203B(c4354b.getNumber(), ((Long) entry.getValue()).longValue());
                return;
            case 4:
                writer.mo55179e(c4354b.getNumber(), ((Long) entry.getValue()).longValue());
                return;
            case 5:
                writer.writeInt32(c4354b.getNumber(), ((Integer) entry.getValue()).intValue());
                return;
            case 6:
                writer.mo55172l(c4354b.getNumber(), ((Long) entry.getValue()).longValue());
                return;
            case 7:
                writer.mo55181c(c4354b.getNumber(), ((Integer) entry.getValue()).intValue());
                return;
            case 8:
                writer.mo55171m(c4354b.getNumber(), ((Boolean) entry.getValue()).booleanValue());
                return;
            case 9:
                writer.mo55174j(c4354b.getNumber(), ((Integer) entry.getValue()).intValue());
                return;
            case 10:
                writer.mo55170n(c4354b.getNumber(), ((Integer) entry.getValue()).intValue());
                return;
            case 11:
                writer.mo55162v(c4354b.getNumber(), ((Long) entry.getValue()).longValue());
                return;
            case 12:
                writer.mo55197H(c4354b.getNumber(), ((Integer) entry.getValue()).intValue());
                return;
            case 13:
                writer.mo55175i(c4354b.getNumber(), ((Long) entry.getValue()).longValue());
                return;
            case 14:
                writer.writeInt32(c4354b.getNumber(), ((Integer) entry.getValue()).intValue());
                return;
            case 15:
                writer.mo55196I(c4354b.getNumber(), (ByteString) entry.getValue());
                return;
            case 16:
                writer.mo55180d(c4354b.getNumber(), (String) entry.getValue());
                return;
            case 17:
                writer.mo55192M(c4354b.getNumber(), entry.getValue(), C17783Hp1.m68094a().m68091d(entry.getValue().getClass()));
                return;
            case 18:
                writer.mo55195J(c4354b.getNumber(), entry.getValue(), C17783Hp1.m68094a().m68091d(entry.getValue().getClass()));
                return;
            default:
                return;
        }
    }
}