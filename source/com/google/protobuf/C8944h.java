package com.google.protobuf;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.MessageLite;
import com.google.protobuf.WireFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.protobuf.h */
/* loaded from: classes4.dex */
public final class C8944h extends AbstractC8943g {

    /* renamed from: com.google.protobuf.h$a */
    /* loaded from: classes4.dex */
    public static /* synthetic */ class C8945a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f57469a;

        static {
            int[] iArr = new int[WireFormat.FieldType.values().length];
            f57469a = iArr;
            try {
                iArr[WireFormat.FieldType.DOUBLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f57469a[WireFormat.FieldType.FLOAT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f57469a[WireFormat.FieldType.INT64.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f57469a[WireFormat.FieldType.UINT64.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f57469a[WireFormat.FieldType.INT32.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f57469a[WireFormat.FieldType.FIXED64.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f57469a[WireFormat.FieldType.FIXED32.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f57469a[WireFormat.FieldType.BOOL.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f57469a[WireFormat.FieldType.UINT32.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f57469a[WireFormat.FieldType.SFIXED32.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f57469a[WireFormat.FieldType.SFIXED64.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f57469a[WireFormat.FieldType.SINT32.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f57469a[WireFormat.FieldType.SINT64.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f57469a[WireFormat.FieldType.ENUM.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f57469a[WireFormat.FieldType.BYTES.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f57469a[WireFormat.FieldType.STRING.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f57469a[WireFormat.FieldType.GROUP.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f57469a[WireFormat.FieldType.MESSAGE.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
        }
    }

    @Override // com.google.protobuf.AbstractC8943g
    /* renamed from: a */
    public int mo35304a(Map.Entry entry) {
        return ((GeneratedMessageLite.C8883b) entry.getKey()).getNumber();
    }

    @Override // com.google.protobuf.AbstractC8943g
    /* renamed from: b */
    public Object mo35303b(ExtensionRegistryLite extensionRegistryLite, MessageLite messageLite, int i) {
        return extensionRegistryLite.findLiteExtensionByNumber(messageLite, i);
    }

    @Override // com.google.protobuf.AbstractC8943g
    /* renamed from: c */
    public FieldSet mo35302c(Object obj) {
        return ((GeneratedMessageLite.ExtendableMessage) obj).extensions;
    }

    @Override // com.google.protobuf.AbstractC8943g
    /* renamed from: d */
    public FieldSet mo35301d(Object obj) {
        return ((GeneratedMessageLite.ExtendableMessage) obj).m35809C();
    }

    @Override // com.google.protobuf.AbstractC8943g
    /* renamed from: e */
    public boolean mo35300e(MessageLite messageLite) {
        return messageLite instanceof GeneratedMessageLite.ExtendableMessage;
    }

    @Override // com.google.protobuf.AbstractC8943g
    /* renamed from: f */
    public void mo35299f(Object obj) {
        mo35302c(obj).m35848y();
    }

    @Override // com.google.protobuf.AbstractC8943g
    /* renamed from: g */
    public Object mo35298g(Object obj, InterfaceC8960s interfaceC8960s, Object obj2, ExtensionRegistryLite extensionRegistryLite, FieldSet fieldSet, Object obj3, AbstractC8973w abstractC8973w) {
        Object valueOf;
        Object m35863j;
        ArrayList arrayList;
        GeneratedMessageLite.GeneratedExtension generatedExtension = (GeneratedMessageLite.GeneratedExtension) obj2;
        int number = generatedExtension.getNumber();
        if (generatedExtension.f57348d.isRepeated() && generatedExtension.f57348d.isPacked()) {
            switch (C8945a.f57469a[generatedExtension.getLiteType().ordinal()]) {
                case 1:
                    arrayList = new ArrayList();
                    interfaceC8960s.mo35130r(arrayList);
                    break;
                case 2:
                    arrayList = new ArrayList();
                    interfaceC8960s.mo35133o(arrayList);
                    break;
                case 3:
                    arrayList = new ArrayList();
                    interfaceC8960s.mo35125w(arrayList);
                    break;
                case 4:
                    arrayList = new ArrayList();
                    interfaceC8960s.mo35126v(arrayList);
                    break;
                case 5:
                    arrayList = new ArrayList();
                    interfaceC8960s.mo35137k(arrayList);
                    break;
                case 6:
                    arrayList = new ArrayList();
                    interfaceC8960s.mo35122z(arrayList);
                    break;
                case 7:
                    arrayList = new ArrayList();
                    interfaceC8960s.mo35136l(arrayList);
                    break;
                case 8:
                    arrayList = new ArrayList();
                    interfaceC8960s.mo35142f(arrayList);
                    break;
                case 9:
                    arrayList = new ArrayList();
                    interfaceC8960s.mo35159A(arrayList);
                    break;
                case 10:
                    arrayList = new ArrayList();
                    interfaceC8960s.mo35128t(arrayList);
                    break;
                case 11:
                    arrayList = new ArrayList();
                    interfaceC8960s.mo35138j(arrayList);
                    break;
                case 12:
                    arrayList = new ArrayList();
                    interfaceC8960s.mo35140h(arrayList);
                    break;
                case 13:
                    arrayList = new ArrayList();
                    interfaceC8960s.mo35147a(arrayList);
                    break;
                case 14:
                    arrayList = new ArrayList();
                    interfaceC8960s.mo35124x(arrayList);
                    obj3 = AbstractC8962u.m35056z(obj, number, arrayList, generatedExtension.f57348d.getEnumType(), obj3, abstractC8973w);
                    break;
                default:
                    throw new IllegalStateException("Type cannot be packed: " + generatedExtension.f57348d.getLiteType());
            }
            fieldSet.m35878D(generatedExtension.f57348d, arrayList);
        } else {
            if (generatedExtension.getLiteType() == WireFormat.FieldType.ENUM) {
                int readInt32 = interfaceC8960s.readInt32();
                if (generatedExtension.f57348d.getEnumType().findValueByNumber(readInt32) == null) {
                    return AbstractC8962u.m35101L(obj, number, readInt32, obj3, abstractC8973w);
                }
                valueOf = Integer.valueOf(readInt32);
            } else {
                switch (C8945a.f57469a[generatedExtension.getLiteType().ordinal()]) {
                    case 1:
                        valueOf = Double.valueOf(interfaceC8960s.readDouble());
                        break;
                    case 2:
                        valueOf = Float.valueOf(interfaceC8960s.readFloat());
                        break;
                    case 3:
                        valueOf = Long.valueOf(interfaceC8960s.readInt64());
                        break;
                    case 4:
                        valueOf = Long.valueOf(interfaceC8960s.mo35139i());
                        break;
                    case 5:
                        valueOf = Integer.valueOf(interfaceC8960s.readInt32());
                        break;
                    case 6:
                        valueOf = Long.valueOf(interfaceC8960s.mo35129s());
                        break;
                    case 7:
                        valueOf = Integer.valueOf(interfaceC8960s.mo35158B());
                        break;
                    case 8:
                        valueOf = Boolean.valueOf(interfaceC8960s.mo35127u());
                        break;
                    case 9:
                        valueOf = Integer.valueOf(interfaceC8960s.mo35145c());
                        break;
                    case 10:
                        valueOf = Integer.valueOf(interfaceC8960s.mo35156D());
                        break;
                    case 11:
                        valueOf = Long.valueOf(interfaceC8960s.mo35146b());
                        break;
                    case 12:
                        valueOf = Integer.valueOf(interfaceC8960s.mo35143e());
                        break;
                    case 13:
                        valueOf = Long.valueOf(interfaceC8960s.mo35157C());
                        break;
                    case 14:
                        throw new IllegalStateException("Shouldn't reach here.");
                    case 15:
                        valueOf = interfaceC8960s.mo35141g();
                        break;
                    case 16:
                        valueOf = interfaceC8960s.readString();
                        break;
                    case 17:
                        if (!generatedExtension.isRepeated()) {
                            Object m35863j2 = fieldSet.m35863j(generatedExtension.f57348d);
                            if (m35863j2 instanceof GeneratedMessageLite) {
                                InterfaceC8961t m67676d = C17878Jo1.m67679a().m67676d(m35863j2);
                                if (!((GeneratedMessageLite) m35863j2).m35821t()) {
                                    Object newInstance = m67676d.newInstance();
                                    m67676d.mo35120b(newInstance, m35863j2);
                                    fieldSet.m35878D(generatedExtension.f57348d, newInstance);
                                    m35863j2 = newInstance;
                                }
                                interfaceC8960s.mo35153G(m35863j2, m67676d, extensionRegistryLite);
                                return obj3;
                            }
                        }
                        valueOf = interfaceC8960s.mo35149K(generatedExtension.getMessageDefaultInstance().getClass(), extensionRegistryLite);
                        break;
                    case 18:
                        if (!generatedExtension.isRepeated()) {
                            Object m35863j3 = fieldSet.m35863j(generatedExtension.f57348d);
                            if (m35863j3 instanceof GeneratedMessageLite) {
                                InterfaceC8961t m67676d2 = C17878Jo1.m67679a().m67676d(m35863j3);
                                if (!((GeneratedMessageLite) m35863j3).m35821t()) {
                                    Object newInstance2 = m67676d2.newInstance();
                                    m67676d2.mo35120b(newInstance2, m35863j3);
                                    fieldSet.m35878D(generatedExtension.f57348d, newInstance2);
                                    m35863j3 = newInstance2;
                                }
                                interfaceC8960s.mo35152H(m35863j3, m67676d2, extensionRegistryLite);
                                return obj3;
                            }
                        }
                        valueOf = interfaceC8960s.mo35148L(generatedExtension.getMessageDefaultInstance().getClass(), extensionRegistryLite);
                        break;
                    default:
                        valueOf = null;
                        break;
                }
            }
            if (generatedExtension.isRepeated()) {
                fieldSet.m35872a(generatedExtension.f57348d, valueOf);
            } else {
                int i = C8945a.f57469a[generatedExtension.getLiteType().ordinal()];
                if ((i == 17 || i == 18) && (m35863j = fieldSet.m35863j(generatedExtension.f57348d)) != null) {
                    valueOf = Internal.m35783d(m35863j, valueOf);
                }
                fieldSet.m35878D(generatedExtension.f57348d, valueOf);
            }
        }
        return obj3;
    }

    @Override // com.google.protobuf.AbstractC8943g
    /* renamed from: h */
    public void mo35297h(InterfaceC8960s interfaceC8960s, Object obj, ExtensionRegistryLite extensionRegistryLite, FieldSet fieldSet) {
        GeneratedMessageLite.GeneratedExtension generatedExtension = (GeneratedMessageLite.GeneratedExtension) obj;
        fieldSet.m35878D(generatedExtension.f57348d, interfaceC8960s.mo35148L(generatedExtension.getMessageDefaultInstance().getClass(), extensionRegistryLite));
    }

    @Override // com.google.protobuf.AbstractC8943g
    /* renamed from: i */
    public void mo35296i(ByteString byteString, Object obj, ExtensionRegistryLite extensionRegistryLite, FieldSet fieldSet) {
        GeneratedMessageLite.GeneratedExtension generatedExtension = (GeneratedMessageLite.GeneratedExtension) obj;
        MessageLite.Builder newBuilderForType = generatedExtension.getMessageDefaultInstance().newBuilderForType();
        CodedInputStream newCodedInput = byteString.newCodedInput();
        newBuilderForType.mergeFrom(newCodedInput, extensionRegistryLite);
        fieldSet.m35878D(generatedExtension.f57348d, newBuilderForType.buildPartial());
        newCodedInput.checkLastTagWas(0);
    }

    @Override // com.google.protobuf.AbstractC8943g
    /* renamed from: j */
    public void mo35295j(Writer writer, Map.Entry entry) {
        GeneratedMessageLite.C8883b c8883b = (GeneratedMessageLite.C8883b) entry.getKey();
        if (c8883b.isRepeated()) {
            switch (C8945a.f57469a[c8883b.getLiteType().ordinal()]) {
                case 1:
                    AbstractC8962u.m35097P(c8883b.getNumber(), (List) entry.getValue(), writer, c8883b.isPacked());
                    return;
                case 2:
                    AbstractC8962u.m35093T(c8883b.getNumber(), (List) entry.getValue(), writer, c8883b.isPacked());
                    return;
                case 3:
                    AbstractC8962u.m35090W(c8883b.getNumber(), (List) entry.getValue(), writer, c8883b.isPacked());
                    return;
                case 4:
                    AbstractC8962u.m35077e0(c8883b.getNumber(), (List) entry.getValue(), writer, c8883b.isPacked());
                    return;
                case 5:
                    AbstractC8962u.m35091V(c8883b.getNumber(), (List) entry.getValue(), writer, c8883b.isPacked());
                    return;
                case 6:
                    AbstractC8962u.m35094S(c8883b.getNumber(), (List) entry.getValue(), writer, c8883b.isPacked());
                    return;
                case 7:
                    AbstractC8962u.m35095R(c8883b.getNumber(), (List) entry.getValue(), writer, c8883b.isPacked());
                    return;
                case 8:
                    AbstractC8962u.m35099N(c8883b.getNumber(), (List) entry.getValue(), writer, c8883b.isPacked());
                    return;
                case 9:
                    AbstractC8962u.m35079d0(c8883b.getNumber(), (List) entry.getValue(), writer, c8883b.isPacked());
                    return;
                case 10:
                    AbstractC8962u.m35088Y(c8883b.getNumber(), (List) entry.getValue(), writer, c8883b.isPacked());
                    return;
                case 11:
                    AbstractC8962u.m35087Z(c8883b.getNumber(), (List) entry.getValue(), writer, c8883b.isPacked());
                    return;
                case 12:
                    AbstractC8962u.m35085a0(c8883b.getNumber(), (List) entry.getValue(), writer, c8883b.isPacked());
                    return;
                case 13:
                    AbstractC8962u.m35083b0(c8883b.getNumber(), (List) entry.getValue(), writer, c8883b.isPacked());
                    return;
                case 14:
                    AbstractC8962u.m35091V(c8883b.getNumber(), (List) entry.getValue(), writer, c8883b.isPacked());
                    return;
                case 15:
                    AbstractC8962u.m35098O(c8883b.getNumber(), (List) entry.getValue(), writer);
                    return;
                case 16:
                    AbstractC8962u.m35081c0(c8883b.getNumber(), (List) entry.getValue(), writer);
                    return;
                case 17:
                    List list = (List) entry.getValue();
                    if (list != null && !list.isEmpty()) {
                        AbstractC8962u.m35092U(c8883b.getNumber(), (List) entry.getValue(), writer, C17878Jo1.m67679a().m67677c(list.get(0).getClass()));
                        return;
                    }
                    return;
                case 18:
                    List list2 = (List) entry.getValue();
                    if (list2 != null && !list2.isEmpty()) {
                        AbstractC8962u.m35089X(c8883b.getNumber(), (List) entry.getValue(), writer, C17878Jo1.m67679a().m67677c(list2.get(0).getClass()));
                        return;
                    }
                    return;
                default:
                    return;
            }
        }
        switch (C8945a.f57469a[c8883b.getLiteType().ordinal()]) {
            case 1:
                writer.mo35315y(c8883b.getNumber(), ((Double) entry.getValue()).doubleValue());
                return;
            case 2:
                writer.mo35356E(c8883b.getNumber(), ((Float) entry.getValue()).floatValue());
                return;
            case 3:
                writer.mo35359B(c8883b.getNumber(), ((Long) entry.getValue()).longValue());
                return;
            case 4:
                writer.mo35335e(c8883b.getNumber(), ((Long) entry.getValue()).longValue());
                return;
            case 5:
                writer.writeInt32(c8883b.getNumber(), ((Integer) entry.getValue()).intValue());
                return;
            case 6:
                writer.mo35328l(c8883b.getNumber(), ((Long) entry.getValue()).longValue());
                return;
            case 7:
                writer.mo35337c(c8883b.getNumber(), ((Integer) entry.getValue()).intValue());
                return;
            case 8:
                writer.mo35327m(c8883b.getNumber(), ((Boolean) entry.getValue()).booleanValue());
                return;
            case 9:
                writer.mo35330j(c8883b.getNumber(), ((Integer) entry.getValue()).intValue());
                return;
            case 10:
                writer.mo35326n(c8883b.getNumber(), ((Integer) entry.getValue()).intValue());
                return;
            case 11:
                writer.mo35318v(c8883b.getNumber(), ((Long) entry.getValue()).longValue());
                return;
            case 12:
                writer.mo35353H(c8883b.getNumber(), ((Integer) entry.getValue()).intValue());
                return;
            case 13:
                writer.mo35331i(c8883b.getNumber(), ((Long) entry.getValue()).longValue());
                return;
            case 14:
                writer.writeInt32(c8883b.getNumber(), ((Integer) entry.getValue()).intValue());
                return;
            case 15:
                writer.mo35352I(c8883b.getNumber(), (ByteString) entry.getValue());
                return;
            case 16:
                writer.mo35336d(c8883b.getNumber(), (String) entry.getValue());
                return;
            case 17:
                writer.mo35349L(c8883b.getNumber(), entry.getValue(), C17878Jo1.m67679a().m67677c(entry.getValue().getClass()));
                return;
            case 18:
                writer.mo35347N(c8883b.getNumber(), entry.getValue(), C17878Jo1.m67679a().m67677c(entry.getValue().getClass()));
                return;
            default:
                return;
        }
    }
}
