package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.GeneratedMessageLite;
import androidx.datastore.preferences.protobuf.WireFormat;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: androidx.datastore.preferences.protobuf.i */
/* loaded from: classes2.dex */
public final class C4436i extends AbstractC4435h {

    /* renamed from: androidx.datastore.preferences.protobuf.i$a */
    /* loaded from: classes2.dex */
    public static /* synthetic */ class C4437a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f34936a;

        static {
            int[] iArr = new int[WireFormat.FieldType.values().length];
            f34936a = iArr;
            try {
                iArr[WireFormat.FieldType.DOUBLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f34936a[WireFormat.FieldType.FLOAT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f34936a[WireFormat.FieldType.INT64.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f34936a[WireFormat.FieldType.UINT64.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f34936a[WireFormat.FieldType.INT32.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f34936a[WireFormat.FieldType.FIXED64.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f34936a[WireFormat.FieldType.FIXED32.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f34936a[WireFormat.FieldType.BOOL.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f34936a[WireFormat.FieldType.UINT32.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f34936a[WireFormat.FieldType.SFIXED32.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f34936a[WireFormat.FieldType.SFIXED64.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f34936a[WireFormat.FieldType.SINT32.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f34936a[WireFormat.FieldType.SINT64.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f34936a[WireFormat.FieldType.ENUM.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f34936a[WireFormat.FieldType.BYTES.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f34936a[WireFormat.FieldType.STRING.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f34936a[WireFormat.FieldType.GROUP.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f34936a[WireFormat.FieldType.MESSAGE.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
        }
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC4435h
    /* renamed from: a */
    public int mo55198a(Map.Entry entry) {
        return ((GeneratedMessageLite.C4372b) entry.getKey()).getNumber();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC4435h
    /* renamed from: b */
    public Object mo55197b(ExtensionRegistryLite extensionRegistryLite, MessageLite messageLite, int i) {
        return extensionRegistryLite.findLiteExtensionByNumber(messageLite, i);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC4435h
    /* renamed from: c */
    public FieldSet mo55196c(Object obj) {
        return ((GeneratedMessageLite.ExtendableMessage) obj).extensions;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC4435h
    /* renamed from: d */
    public FieldSet mo55195d(Object obj) {
        return ((GeneratedMessageLite.ExtendableMessage) obj).m55753r();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC4435h
    /* renamed from: e */
    public boolean mo55194e(MessageLite messageLite) {
        return messageLite instanceof GeneratedMessageLite.ExtendableMessage;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC4435h
    /* renamed from: f */
    public void mo55193f(Object obj) {
        mo55196c(obj).m55780x();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC4435h
    /* renamed from: g */
    public Object mo55192g(InterfaceC4453u interfaceC4453u, Object obj, ExtensionRegistryLite extensionRegistryLite, FieldSet fieldSet, Object obj2, AbstractC4466y abstractC4466y) {
        Object valueOf;
        Object m55794j;
        ArrayList arrayList;
        GeneratedMessageLite.GeneratedExtension generatedExtension = (GeneratedMessageLite.GeneratedExtension) obj;
        int number = generatedExtension.getNumber();
        if (generatedExtension.f34808d.isRepeated() && generatedExtension.f34808d.isPacked()) {
            switch (C4437a.f34936a[generatedExtension.getLiteType().ordinal()]) {
                case 1:
                    arrayList = new ArrayList();
                    interfaceC4453u.mo55031r(arrayList);
                    break;
                case 2:
                    arrayList = new ArrayList();
                    interfaceC4453u.mo55034o(arrayList);
                    break;
                case 3:
                    arrayList = new ArrayList();
                    interfaceC4453u.mo55026w(arrayList);
                    break;
                case 4:
                    arrayList = new ArrayList();
                    interfaceC4453u.mo55027v(arrayList);
                    break;
                case 5:
                    arrayList = new ArrayList();
                    interfaceC4453u.mo55038k(arrayList);
                    break;
                case 6:
                    arrayList = new ArrayList();
                    interfaceC4453u.mo55023z(arrayList);
                    break;
                case 7:
                    arrayList = new ArrayList();
                    interfaceC4453u.mo55037l(arrayList);
                    break;
                case 8:
                    arrayList = new ArrayList();
                    interfaceC4453u.mo55043f(arrayList);
                    break;
                case 9:
                    arrayList = new ArrayList();
                    interfaceC4453u.mo55060A(arrayList);
                    break;
                case 10:
                    arrayList = new ArrayList();
                    interfaceC4453u.mo55029t(arrayList);
                    break;
                case 11:
                    arrayList = new ArrayList();
                    interfaceC4453u.mo55039j(arrayList);
                    break;
                case 12:
                    arrayList = new ArrayList();
                    interfaceC4453u.mo55041h(arrayList);
                    break;
                case 13:
                    arrayList = new ArrayList();
                    interfaceC4453u.mo55048a(arrayList);
                    break;
                case 14:
                    arrayList = new ArrayList();
                    interfaceC4453u.mo55025x(arrayList);
                    obj2 = AbstractC4455w.m54957z(number, arrayList, generatedExtension.f34808d.getEnumType(), obj2, abstractC4466y);
                    break;
                default:
                    throw new IllegalStateException("Type cannot be packed: " + generatedExtension.f34808d.getLiteType());
            }
            fieldSet.m55809C(generatedExtension.f34808d, arrayList);
        } else {
            if (generatedExtension.getLiteType() == WireFormat.FieldType.ENUM) {
                int readInt32 = interfaceC4453u.readInt32();
                if (generatedExtension.f34808d.getEnumType().findValueByNumber(readInt32) == null) {
                    return AbstractC4455w.m55002L(number, readInt32, obj2, abstractC4466y);
                }
                valueOf = Integer.valueOf(readInt32);
            } else {
                switch (C4437a.f34936a[generatedExtension.getLiteType().ordinal()]) {
                    case 1:
                        valueOf = Double.valueOf(interfaceC4453u.readDouble());
                        break;
                    case 2:
                        valueOf = Float.valueOf(interfaceC4453u.readFloat());
                        break;
                    case 3:
                        valueOf = Long.valueOf(interfaceC4453u.readInt64());
                        break;
                    case 4:
                        valueOf = Long.valueOf(interfaceC4453u.mo55040i());
                        break;
                    case 5:
                        valueOf = Integer.valueOf(interfaceC4453u.readInt32());
                        break;
                    case 6:
                        valueOf = Long.valueOf(interfaceC4453u.mo55030s());
                        break;
                    case 7:
                        valueOf = Integer.valueOf(interfaceC4453u.mo55059B());
                        break;
                    case 8:
                        valueOf = Boolean.valueOf(interfaceC4453u.mo55028u());
                        break;
                    case 9:
                        valueOf = Integer.valueOf(interfaceC4453u.mo55046c());
                        break;
                    case 10:
                        valueOf = Integer.valueOf(interfaceC4453u.mo55057D());
                        break;
                    case 11:
                        valueOf = Long.valueOf(interfaceC4453u.mo55047b());
                        break;
                    case 12:
                        valueOf = Integer.valueOf(interfaceC4453u.mo55044e());
                        break;
                    case 13:
                        valueOf = Long.valueOf(interfaceC4453u.mo55058C());
                        break;
                    case 14:
                        throw new IllegalStateException("Shouldn't reach here.");
                    case 15:
                        valueOf = interfaceC4453u.mo55042g();
                        break;
                    case 16:
                        valueOf = interfaceC4453u.readString();
                        break;
                    case 17:
                        valueOf = interfaceC4453u.mo55051J(generatedExtension.getMessageDefaultInstance().getClass(), extensionRegistryLite);
                        break;
                    case 18:
                        valueOf = interfaceC4453u.mo55054G(generatedExtension.getMessageDefaultInstance().getClass(), extensionRegistryLite);
                        break;
                    default:
                        valueOf = null;
                        break;
                }
            }
            if (generatedExtension.isRepeated()) {
                fieldSet.m55803a(generatedExtension.f34808d, valueOf);
            } else {
                int i = C4437a.f34936a[generatedExtension.getLiteType().ordinal()];
                if ((i == 17 || i == 18) && (m55794j = fieldSet.m55794j(generatedExtension.f34808d)) != null) {
                    valueOf = Internal.m55727d(m55794j, valueOf);
                }
                fieldSet.m55809C(generatedExtension.f34808d, valueOf);
            }
        }
        return obj2;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC4435h
    /* renamed from: h */
    public void mo55191h(InterfaceC4453u interfaceC4453u, Object obj, ExtensionRegistryLite extensionRegistryLite, FieldSet fieldSet) {
        GeneratedMessageLite.GeneratedExtension generatedExtension = (GeneratedMessageLite.GeneratedExtension) obj;
        fieldSet.m55809C(generatedExtension.f34808d, interfaceC4453u.mo55054G(generatedExtension.getMessageDefaultInstance().getClass(), extensionRegistryLite));
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC4435h
    /* renamed from: i */
    public void mo55190i(ByteString byteString, Object obj, ExtensionRegistryLite extensionRegistryLite, FieldSet fieldSet) {
        GeneratedMessageLite.GeneratedExtension generatedExtension = (GeneratedMessageLite.GeneratedExtension) obj;
        MessageLite buildPartial = generatedExtension.getMessageDefaultInstance().newBuilderForType().buildPartial();
        AbstractC4426c m55296M = AbstractC4426c.m55296M(ByteBuffer.wrap(byteString.toByteArray()), true);
        C17942Ko1.m67586a().m67585b(buildPartial, m55296M, extensionRegistryLite);
        fieldSet.m55809C(generatedExtension.f34808d, buildPartial);
        if (m55296M.mo55036m() == Integer.MAX_VALUE) {
            return;
        }
        throw InvalidProtocolBufferException.invalidEndTag();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC4435h
    /* renamed from: j */
    public void mo55189j(Writer writer, Map.Entry entry) {
        GeneratedMessageLite.C4372b c4372b = (GeneratedMessageLite.C4372b) entry.getKey();
        if (c4372b.isRepeated()) {
            switch (C4437a.f34936a[c4372b.getLiteType().ordinal()]) {
                case 1:
                    AbstractC4455w.m54998P(c4372b.getNumber(), (List) entry.getValue(), writer, c4372b.isPacked());
                    return;
                case 2:
                    AbstractC4455w.m54994T(c4372b.getNumber(), (List) entry.getValue(), writer, c4372b.isPacked());
                    return;
                case 3:
                    AbstractC4455w.m54991W(c4372b.getNumber(), (List) entry.getValue(), writer, c4372b.isPacked());
                    return;
                case 4:
                    AbstractC4455w.m54978e0(c4372b.getNumber(), (List) entry.getValue(), writer, c4372b.isPacked());
                    return;
                case 5:
                    AbstractC4455w.m54992V(c4372b.getNumber(), (List) entry.getValue(), writer, c4372b.isPacked());
                    return;
                case 6:
                    AbstractC4455w.m54995S(c4372b.getNumber(), (List) entry.getValue(), writer, c4372b.isPacked());
                    return;
                case 7:
                    AbstractC4455w.m54996R(c4372b.getNumber(), (List) entry.getValue(), writer, c4372b.isPacked());
                    return;
                case 8:
                    AbstractC4455w.m55000N(c4372b.getNumber(), (List) entry.getValue(), writer, c4372b.isPacked());
                    return;
                case 9:
                    AbstractC4455w.m54980d0(c4372b.getNumber(), (List) entry.getValue(), writer, c4372b.isPacked());
                    return;
                case 10:
                    AbstractC4455w.m54989Y(c4372b.getNumber(), (List) entry.getValue(), writer, c4372b.isPacked());
                    return;
                case 11:
                    AbstractC4455w.m54988Z(c4372b.getNumber(), (List) entry.getValue(), writer, c4372b.isPacked());
                    return;
                case 12:
                    AbstractC4455w.m54986a0(c4372b.getNumber(), (List) entry.getValue(), writer, c4372b.isPacked());
                    return;
                case 13:
                    AbstractC4455w.m54984b0(c4372b.getNumber(), (List) entry.getValue(), writer, c4372b.isPacked());
                    return;
                case 14:
                    AbstractC4455w.m54992V(c4372b.getNumber(), (List) entry.getValue(), writer, c4372b.isPacked());
                    return;
                case 15:
                    AbstractC4455w.m54999O(c4372b.getNumber(), (List) entry.getValue(), writer);
                    return;
                case 16:
                    AbstractC4455w.m54982c0(c4372b.getNumber(), (List) entry.getValue(), writer);
                    return;
                case 17:
                    List list = (List) entry.getValue();
                    if (list != null && !list.isEmpty()) {
                        AbstractC4455w.m54993U(c4372b.getNumber(), (List) entry.getValue(), writer, C17942Ko1.m67586a().m67583d(list.get(0).getClass()));
                        return;
                    }
                    return;
                case 18:
                    List list2 = (List) entry.getValue();
                    if (list2 != null && !list2.isEmpty()) {
                        AbstractC4455w.m54990X(c4372b.getNumber(), (List) entry.getValue(), writer, C17942Ko1.m67586a().m67583d(list2.get(0).getClass()));
                        return;
                    }
                    return;
                default:
                    return;
            }
        }
        switch (C4437a.f34936a[c4372b.getLiteType().ordinal()]) {
            case 1:
                writer.mo55209y(c4372b.getNumber(), ((Double) entry.getValue()).doubleValue());
                return;
            case 2:
                writer.mo55250E(c4372b.getNumber(), ((Float) entry.getValue()).floatValue());
                return;
            case 3:
                writer.mo55253B(c4372b.getNumber(), ((Long) entry.getValue()).longValue());
                return;
            case 4:
                writer.mo55229e(c4372b.getNumber(), ((Long) entry.getValue()).longValue());
                return;
            case 5:
                writer.writeInt32(c4372b.getNumber(), ((Integer) entry.getValue()).intValue());
                return;
            case 6:
                writer.mo55222l(c4372b.getNumber(), ((Long) entry.getValue()).longValue());
                return;
            case 7:
                writer.mo55231c(c4372b.getNumber(), ((Integer) entry.getValue()).intValue());
                return;
            case 8:
                writer.mo55221m(c4372b.getNumber(), ((Boolean) entry.getValue()).booleanValue());
                return;
            case 9:
                writer.mo55224j(c4372b.getNumber(), ((Integer) entry.getValue()).intValue());
                return;
            case 10:
                writer.mo55220n(c4372b.getNumber(), ((Integer) entry.getValue()).intValue());
                return;
            case 11:
                writer.mo55212v(c4372b.getNumber(), ((Long) entry.getValue()).longValue());
                return;
            case 12:
                writer.mo55247H(c4372b.getNumber(), ((Integer) entry.getValue()).intValue());
                return;
            case 13:
                writer.mo55225i(c4372b.getNumber(), ((Long) entry.getValue()).longValue());
                return;
            case 14:
                writer.writeInt32(c4372b.getNumber(), ((Integer) entry.getValue()).intValue());
                return;
            case 15:
                writer.mo55246I(c4372b.getNumber(), (ByteString) entry.getValue());
                return;
            case 16:
                writer.mo55230d(c4372b.getNumber(), (String) entry.getValue());
                return;
            case 17:
                writer.mo55242M(c4372b.getNumber(), entry.getValue(), C17942Ko1.m67586a().m67583d(entry.getValue().getClass()));
                return;
            case 18:
                writer.mo55245J(c4372b.getNumber(), entry.getValue(), C17942Ko1.m67586a().m67583d(entry.getValue().getClass()));
                return;
            default:
                return;
        }
    }
}
