package com.google.protobuf;

import com.google.protobuf.AbstractC8934b;
import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.FieldSet;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.GeneratedMessageLite.Builder;
import com.google.protobuf.Internal;
import com.google.protobuf.MessageLite;
import com.google.protobuf.WireFormat;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectStreamException;
import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes4.dex */
public abstract class GeneratedMessageLite<MessageType extends GeneratedMessageLite<MessageType, BuilderType>, BuilderType extends Builder<MessageType, BuilderType>> extends AbstractMessageLite<MessageType, BuilderType> {
    private static final int MEMOIZED_SERIALIZED_SIZE_MASK = Integer.MAX_VALUE;
    private static final int MUTABLE_FLAG_MASK = Integer.MIN_VALUE;
    static final int UNINITIALIZED_HASH_CODE = 0;
    static final int UNINITIALIZED_SERIALIZED_SIZE = Integer.MAX_VALUE;
    private static Map<Object, GeneratedMessageLite<?, ?>> defaultInstanceMap = new ConcurrentHashMap();
    private int memoizedSerializedSize = -1;
    protected UnknownFieldSetLite unknownFields = UnknownFieldSetLite.getDefaultInstance();

    /* loaded from: classes4.dex */
    public static abstract class Builder<MessageType extends GeneratedMessageLite<MessageType, BuilderType>, BuilderType extends Builder<MessageType, BuilderType>> extends AbstractMessageLite.Builder<MessageType, BuilderType> {

        /* renamed from: a */
        public final GeneratedMessageLite f57339a;
        protected MessageType instance;

        public Builder(MessageType messagetype) {
            this.f57339a = messagetype;
            if (!messagetype.m35821t()) {
                this.instance = (MessageType) m35813d();
                return;
            }
            throw new IllegalArgumentException("Default instance must be immutable.");
        }

        /* renamed from: c */
        public static void m35814c(Object obj, Object obj2) {
            C17878Jo1.m67679a().m67676d(obj).mo35120b(obj, obj2);
        }

        /* renamed from: d */
        private GeneratedMessageLite m35813d() {
            return this.f57339a.m35819v();
        }

        public final void copyOnWrite() {
            if (!this.instance.m35821t()) {
                copyOnWriteInternal();
            }
        }

        public void copyOnWriteInternal() {
            MessageType messagetype = (MessageType) m35813d();
            m35814c(messagetype, this.instance);
            this.instance = messagetype;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.protobuf.AbstractMessageLite.Builder
        public /* bridge */ /* synthetic */ AbstractMessageLite.Builder internalMergeFrom(AbstractMessageLite abstractMessageLite) {
            return internalMergeFrom((Builder<MessageType, BuilderType>) ((GeneratedMessageLite) abstractMessageLite));
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            return GeneratedMessageLite.isInitialized(this.instance, false);
        }

        @Override // com.google.protobuf.MessageLite.Builder
        public final MessageType build() {
            MessageType buildPartial = buildPartial();
            if (buildPartial.isInitialized()) {
                return buildPartial;
            }
            throw AbstractMessageLite.Builder.newUninitializedMessageException(buildPartial);
        }

        @Override // com.google.protobuf.MessageLite.Builder
        public MessageType buildPartial() {
            if (!this.instance.m35821t()) {
                return this.instance;
            }
            this.instance.makeImmutable();
            return this.instance;
        }

        @Override // com.google.protobuf.MessageLite.Builder
        public final BuilderType clear() {
            if (!this.f57339a.m35821t()) {
                this.instance = (MessageType) m35813d();
                return this;
            }
            throw new IllegalArgumentException("Default instance must be immutable.");
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder
        public MessageType getDefaultInstanceForType() {
            return (MessageType) this.f57339a;
        }

        public BuilderType internalMergeFrom(MessageType messagetype) {
            return mergeFrom((Builder<MessageType, BuilderType>) messagetype);
        }

        @Override // com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder
        public BuilderType clone() {
            BuilderType buildertype = (BuilderType) getDefaultInstanceForType().newBuilderForType();
            buildertype.instance = buildPartial();
            return buildertype;
        }

        public BuilderType mergeFrom(MessageType messagetype) {
            if (getDefaultInstanceForType().equals(messagetype)) {
                return this;
            }
            copyOnWrite();
            m35814c(this.instance, messagetype);
            return this;
        }

        @Override // com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder
        public BuilderType mergeFrom(byte[] bArr, int i, int i2, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            copyOnWrite();
            try {
                C17878Jo1.m67679a().m67676d(this.instance).mo35114h(this.instance, bArr, i, i + i2, new AbstractC8934b.C8936b(extensionRegistryLite));
                return this;
            } catch (InvalidProtocolBufferException e) {
                throw e;
            } catch (IOException e2) {
                throw new RuntimeException("Reading from byte array should not throw IOException.", e2);
            } catch (IndexOutOfBoundsException unused) {
                throw InvalidProtocolBufferException.truncatedMessage();
            }
        }

        @Override // com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder
        public BuilderType mergeFrom(byte[] bArr, int i, int i2) throws InvalidProtocolBufferException {
            return mergeFrom(bArr, i, i2, ExtensionRegistryLite.getEmptyRegistry());
        }

        @Override // com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder
        public BuilderType mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            copyOnWrite();
            try {
                C17878Jo1.m67679a().m67676d(this.instance).mo35113i(this.instance, C8938d.m35371M(codedInputStream), extensionRegistryLite);
                return this;
            } catch (RuntimeException e) {
                if (e.getCause() instanceof IOException) {
                    throw ((IOException) e.getCause());
                }
                throw e;
            }
        }
    }

    /* loaded from: classes4.dex */
    public static abstract class ExtendableBuilder<MessageType extends ExtendableMessage<MessageType, BuilderType>, BuilderType extends ExtendableBuilder<MessageType, BuilderType>> extends Builder<MessageType, BuilderType> implements ExtendableMessageOrBuilder<MessageType, BuilderType> {
        public ExtendableBuilder(MessageType messagetype) {
            super(messagetype);
        }

        /* renamed from: e */
        private FieldSet m35812e() {
            FieldSet fieldSet = ((ExtendableMessage) this.instance).extensions;
            if (fieldSet.m35854s()) {
                FieldSet clone = fieldSet.clone();
                ((ExtendableMessage) this.instance).extensions = clone;
                return clone;
            }
            return fieldSet;
        }

        public final <Type> BuilderType addExtension(ExtensionLite<MessageType, List<Type>> extensionLite, Type type) {
            GeneratedExtension m35832i = GeneratedMessageLite.m35832i(extensionLite);
            m35811f(m35832i);
            copyOnWrite();
            m35812e().m35872a(m35832i.f57348d, m35832i.m35802d(type));
            return this;
        }

        public final BuilderType clearExtension(ExtensionLite<MessageType, ?> extensionLite) {
            GeneratedExtension m35832i = GeneratedMessageLite.m35832i(extensionLite);
            m35811f(m35832i);
            copyOnWrite();
            m35812e().m35871b(m35832i.f57348d);
            return this;
        }

        @Override // com.google.protobuf.GeneratedMessageLite.Builder
        public void copyOnWriteInternal() {
            super.copyOnWriteInternal();
            if (((ExtendableMessage) this.instance).extensions != FieldSet.m35864i()) {
                MessageType messagetype = this.instance;
                ((ExtendableMessage) messagetype).extensions = ((ExtendableMessage) messagetype).extensions.clone();
            }
        }

        /* renamed from: f */
        public final void m35811f(GeneratedExtension generatedExtension) {
            if (generatedExtension.getContainingTypeDefaultInstance() == getDefaultInstanceForType()) {
                return;
            }
            throw new IllegalArgumentException("This extension is for a different message type.  Please make sure that you are not suppressing any generics type warnings.");
        }

        @Override // com.google.protobuf.GeneratedMessageLite.ExtendableMessageOrBuilder
        public final <Type> Type getExtension(ExtensionLite<MessageType, Type> extensionLite) {
            return (Type) ((ExtendableMessage) this.instance).getExtension(extensionLite);
        }

        @Override // com.google.protobuf.GeneratedMessageLite.ExtendableMessageOrBuilder
        public final <Type> int getExtensionCount(ExtensionLite<MessageType, List<Type>> extensionLite) {
            return ((ExtendableMessage) this.instance).getExtensionCount(extensionLite);
        }

        @Override // com.google.protobuf.GeneratedMessageLite.ExtendableMessageOrBuilder
        public final <Type> boolean hasExtension(ExtensionLite<MessageType, Type> extensionLite) {
            return ((ExtendableMessage) this.instance).hasExtension(extensionLite);
        }

        public final <Type> BuilderType setExtension(ExtensionLite<MessageType, Type> extensionLite, Type type) {
            GeneratedExtension m35832i = GeneratedMessageLite.m35832i(extensionLite);
            m35811f(m35832i);
            copyOnWrite();
            m35812e().m35878D(m35832i.f57348d, m35832i.m35801e(type));
            return this;
        }

        @Override // com.google.protobuf.GeneratedMessageLite.ExtendableMessageOrBuilder
        public final <Type> Type getExtension(ExtensionLite<MessageType, List<Type>> extensionLite, int i) {
            return (Type) ((ExtendableMessage) this.instance).getExtension(extensionLite, i);
        }

        @Override // com.google.protobuf.GeneratedMessageLite.Builder, com.google.protobuf.MessageLite.Builder
        public final MessageType buildPartial() {
            if (!((ExtendableMessage) this.instance).m35821t()) {
                return (MessageType) this.instance;
            }
            ((ExtendableMessage) this.instance).extensions.m35848y();
            return (MessageType) super.buildPartial();
        }

        public final <Type> BuilderType setExtension(ExtensionLite<MessageType, List<Type>> extensionLite, int i, Type type) {
            GeneratedExtension m35832i = GeneratedMessageLite.m35832i(extensionLite);
            m35811f(m35832i);
            copyOnWrite();
            m35812e().m35877E(m35832i.f57348d, i, m35832i.m35802d(type));
            return this;
        }
    }

    /* loaded from: classes4.dex */
    public interface ExtendableMessageOrBuilder<MessageType extends ExtendableMessage<MessageType, BuilderType>, BuilderType extends ExtendableBuilder<MessageType, BuilderType>> extends MessageLiteOrBuilder {
        <Type> Type getExtension(ExtensionLite<MessageType, Type> extensionLite);

        <Type> Type getExtension(ExtensionLite<MessageType, List<Type>> extensionLite, int i);

        <Type> int getExtensionCount(ExtensionLite<MessageType, List<Type>> extensionLite);

        <Type> boolean hasExtension(ExtensionLite<MessageType, Type> extensionLite);
    }

    /* loaded from: classes4.dex */
    public static class GeneratedExtension<ContainingType extends MessageLite, Type> extends ExtensionLite<ContainingType, Type> {

        /* renamed from: a */
        public final MessageLite f57345a;

        /* renamed from: b */
        public final Object f57346b;

        /* renamed from: c */
        public final MessageLite f57347c;

        /* renamed from: d */
        public final C8883b f57348d;

        public GeneratedExtension(MessageLite messageLite, Object obj, MessageLite messageLite2, C8883b c8883b, Class cls) {
            if (messageLite != null) {
                if (c8883b.getLiteType() == WireFormat.FieldType.MESSAGE && messageLite2 == null) {
                    throw new IllegalArgumentException("Null messageDefaultInstance");
                }
                this.f57345a = messageLite;
                this.f57346b = obj;
                this.f57347c = messageLite2;
                this.f57348d = c8883b;
                return;
            }
            throw new IllegalArgumentException("Null containingTypeDefaultInstance");
        }

        /* renamed from: b */
        public Object m35804b(Object obj) {
            if (this.f57348d.isRepeated()) {
                if (this.f57348d.getLiteJavaType() == WireFormat.JavaType.ENUM) {
                    ArrayList arrayList = new ArrayList();
                    for (Object obj2 : (List) obj) {
                        arrayList.add(m35803c(obj2));
                    }
                    return arrayList;
                }
                return obj;
            }
            return m35803c(obj);
        }

        /* renamed from: c */
        public Object m35803c(Object obj) {
            if (this.f57348d.getLiteJavaType() == WireFormat.JavaType.ENUM) {
                return this.f57348d.f57350a.findValueByNumber(((Integer) obj).intValue());
            }
            return obj;
        }

        /* renamed from: d */
        public Object m35802d(Object obj) {
            if (this.f57348d.getLiteJavaType() == WireFormat.JavaType.ENUM) {
                return Integer.valueOf(((Internal.EnumLite) obj).getNumber());
            }
            return obj;
        }

        /* renamed from: e */
        public Object m35801e(Object obj) {
            if (this.f57348d.isRepeated()) {
                if (this.f57348d.getLiteJavaType() == WireFormat.JavaType.ENUM) {
                    ArrayList arrayList = new ArrayList();
                    for (Object obj2 : (List) obj) {
                        arrayList.add(m35802d(obj2));
                    }
                    return arrayList;
                }
                return obj;
            }
            return m35802d(obj);
        }

        public ContainingType getContainingTypeDefaultInstance() {
            return (ContainingType) this.f57345a;
        }

        @Override // com.google.protobuf.ExtensionLite
        public Type getDefaultValue() {
            return (Type) this.f57346b;
        }

        @Override // com.google.protobuf.ExtensionLite
        public WireFormat.FieldType getLiteType() {
            return this.f57348d.getLiteType();
        }

        @Override // com.google.protobuf.ExtensionLite
        public MessageLite getMessageDefaultInstance() {
            return this.f57347c;
        }

        @Override // com.google.protobuf.ExtensionLite
        public int getNumber() {
            return this.f57348d.getNumber();
        }

        @Override // com.google.protobuf.ExtensionLite
        public boolean isRepeated() {
            return this.f57348d.f57353d;
        }
    }

    /* loaded from: classes4.dex */
    public enum MethodToInvoke {
        GET_MEMOIZED_IS_INITIALIZED,
        SET_MEMOIZED_IS_INITIALIZED,
        BUILD_MESSAGE_INFO,
        NEW_MUTABLE_INSTANCE,
        NEW_BUILDER,
        GET_DEFAULT_INSTANCE,
        GET_PARSER
    }

    /* loaded from: classes4.dex */
    public static final class SerializedForm implements Serializable {
        private static final long serialVersionUID = 0;
        private final byte[] asBytes;
        private final Class<?> messageClass;
        private final String messageClassName;

        public SerializedForm(MessageLite messageLite) {
            Class<?> cls = messageLite.getClass();
            this.messageClass = cls;
            this.messageClassName = cls.getName();
            this.asBytes = messageLite.toByteArray();
        }

        /* renamed from: of */
        public static SerializedForm m35800of(MessageLite messageLite) {
            return new SerializedForm(messageLite);
        }

        @Deprecated
        private Object readResolveFallback() throws ObjectStreamException {
            try {
                java.lang.reflect.Field declaredField = resolveMessageClass().getDeclaredField("defaultInstance");
                declaredField.setAccessible(true);
                return ((MessageLite) declaredField.get(null)).newBuilderForType().mergeFrom(this.asBytes).buildPartial();
            } catch (InvalidProtocolBufferException e) {
                throw new RuntimeException("Unable to understand proto buffer", e);
            } catch (ClassNotFoundException e2) {
                throw new RuntimeException("Unable to find proto buffer class: " + this.messageClassName, e2);
            } catch (IllegalAccessException e3) {
                throw new RuntimeException("Unable to call parsePartialFrom", e3);
            } catch (NoSuchFieldException e4) {
                throw new RuntimeException("Unable to find defaultInstance in " + this.messageClassName, e4);
            } catch (SecurityException e5) {
                throw new RuntimeException("Unable to call defaultInstance in " + this.messageClassName, e5);
            }
        }

        private Class<?> resolveMessageClass() throws ClassNotFoundException {
            Class<?> cls = this.messageClass;
            if (cls == null) {
                return Class.forName(this.messageClassName);
            }
            return cls;
        }

        public Object readResolve() throws ObjectStreamException {
            try {
                java.lang.reflect.Field declaredField = resolveMessageClass().getDeclaredField("DEFAULT_INSTANCE");
                declaredField.setAccessible(true);
                return ((MessageLite) declaredField.get(null)).newBuilderForType().mergeFrom(this.asBytes).buildPartial();
            } catch (InvalidProtocolBufferException e) {
                throw new RuntimeException("Unable to understand proto buffer", e);
            } catch (ClassNotFoundException e2) {
                throw new RuntimeException("Unable to find proto buffer class: " + this.messageClassName, e2);
            } catch (IllegalAccessException e3) {
                throw new RuntimeException("Unable to call parsePartialFrom", e3);
            } catch (NoSuchFieldException unused) {
                return readResolveFallback();
            } catch (SecurityException e4) {
                throw new RuntimeException("Unable to call DEFAULT_INSTANCE in " + this.messageClassName, e4);
            }
        }
    }

    /* renamed from: com.google.protobuf.GeneratedMessageLite$a */
    /* loaded from: classes4.dex */
    public static /* synthetic */ class C8882a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f57349a;

        static {
            int[] iArr = new int[WireFormat.JavaType.values().length];
            f57349a = iArr;
            try {
                iArr[WireFormat.JavaType.MESSAGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f57349a[WireFormat.JavaType.ENUM.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* renamed from: com.google.protobuf.GeneratedMessageLite$b */
    /* loaded from: classes4.dex */
    public static final class C8883b implements FieldSet.FieldDescriptorLite {

        /* renamed from: a */
        public final Internal.EnumLiteMap f57350a;

        /* renamed from: b */
        public final int f57351b;

        /* renamed from: c */
        public final WireFormat.FieldType f57352c;

        /* renamed from: d */
        public final boolean f57353d;

        /* renamed from: e */
        public final boolean f57354e;

        public C8883b(Internal.EnumLiteMap enumLiteMap, int i, WireFormat.FieldType fieldType, boolean z, boolean z2) {
            this.f57350a = enumLiteMap;
            this.f57351b = i;
            this.f57352c = fieldType;
            this.f57353d = z;
            this.f57354e = z2;
        }

        @Override // java.lang.Comparable
        /* renamed from: a */
        public int compareTo(C8883b c8883b) {
            return this.f57351b - c8883b.f57351b;
        }

        @Override // com.google.protobuf.FieldSet.FieldDescriptorLite
        public Internal.EnumLiteMap getEnumType() {
            return this.f57350a;
        }

        @Override // com.google.protobuf.FieldSet.FieldDescriptorLite
        public WireFormat.JavaType getLiteJavaType() {
            return this.f57352c.getJavaType();
        }

        @Override // com.google.protobuf.FieldSet.FieldDescriptorLite
        public WireFormat.FieldType getLiteType() {
            return this.f57352c;
        }

        @Override // com.google.protobuf.FieldSet.FieldDescriptorLite
        public int getNumber() {
            return this.f57351b;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.protobuf.FieldSet.FieldDescriptorLite
        public MessageLite.Builder internalMergeFrom(MessageLite.Builder builder, MessageLite messageLite) {
            return ((Builder) builder).mergeFrom((Builder) ((GeneratedMessageLite) messageLite));
        }

        @Override // com.google.protobuf.FieldSet.FieldDescriptorLite
        public boolean isPacked() {
            return this.f57354e;
        }

        @Override // com.google.protobuf.FieldSet.FieldDescriptorLite
        public boolean isRepeated() {
            return this.f57353d;
        }
    }

    public static Internal.BooleanList emptyBooleanList() {
        return C8937c.m35377d();
    }

    public static Internal.DoubleList emptyDoubleList() {
        return C8942f.m35310d();
    }

    public static Internal.FloatList emptyFloatList() {
        return C8946i.m35291d();
    }

    public static Internal.IntList emptyIntList() {
        return C8947j.m35282d();
    }

    public static Internal.LongList emptyLongList() {
        return C8952l.m35265d();
    }

    public static <E> Internal.ProtobufList<E> emptyProtobufList() {
        return C8959r.m35163b();
    }

    /* renamed from: i */
    public static GeneratedExtension m35832i(ExtensionLite extensionLite) {
        if (extensionLite.m35981a()) {
            return (GeneratedExtension) extensionLite;
        }
        throw new IllegalArgumentException("Expected a lite extension.");
    }

    /* renamed from: j */
    public static GeneratedMessageLite m35831j(GeneratedMessageLite generatedMessageLite) {
        if (generatedMessageLite != null && !generatedMessageLite.isInitialized()) {
            throw generatedMessageLite.m37151d().asInvalidProtocolBufferException().setUnfinishedMessage(generatedMessageLite);
        }
        return generatedMessageLite;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [com.google.protobuf.Internal$IntList] */
    public static Internal.IntList mutableCopy(Internal.IntList intList) {
        int size = intList.size();
        return intList.mutableCopyWithCapacity(size == 0 ? 10 : size * 2);
    }

    public static Object newMessageInfo(MessageLite messageLite, String str, Object[] objArr) {
        return new C18524Tr1(messageLite, str, objArr);
    }

    public static <ContainingType extends MessageLite, Type> GeneratedExtension<ContainingType, Type> newRepeatedGeneratedExtension(ContainingType containingtype, MessageLite messageLite, Internal.EnumLiteMap<?> enumLiteMap, int i, WireFormat.FieldType fieldType, boolean z, Class cls) {
        return new GeneratedExtension<>(containingtype, Collections.emptyList(), messageLite, new C8883b(enumLiteMap, i, fieldType, true, z), cls);
    }

    public static <ContainingType extends MessageLite, Type> GeneratedExtension<ContainingType, Type> newSingularGeneratedExtension(ContainingType containingtype, Type type, MessageLite messageLite, Internal.EnumLiteMap<?> enumLiteMap, int i, WireFormat.FieldType fieldType, Class cls) {
        return new GeneratedExtension<>(containingtype, type, messageLite, new C8883b(enumLiteMap, i, fieldType, false, false), cls);
    }

    /* renamed from: p */
    public static GeneratedMessageLite m35825p(Class cls) {
        GeneratedMessageLite<?, ?> generatedMessageLite = defaultInstanceMap.get(cls);
        if (generatedMessageLite == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                generatedMessageLite = defaultInstanceMap.get(cls);
            } catch (ClassNotFoundException e) {
                throw new IllegalStateException("Class initialization cannot fail.", e);
            }
        }
        if (generatedMessageLite == null) {
            generatedMessageLite = ((GeneratedMessageLite) AbstractC22806wY1.m789l(cls)).getDefaultInstanceForType();
            if (generatedMessageLite != null) {
                defaultInstanceMap.put(cls, generatedMessageLite);
            } else {
                throw new IllegalStateException();
            }
        }
        return generatedMessageLite;
    }

    public static <T extends GeneratedMessageLite<T, ?>> T parseDelimitedFrom(T t, InputStream inputStream) throws InvalidProtocolBufferException {
        return (T) m35831j(m35818w(t, inputStream, ExtensionRegistryLite.getEmptyRegistry()));
    }

    public static <T extends GeneratedMessageLite<T, ?>> T parseFrom(T t, ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (T) m35831j(parseFrom(t, CodedInputStream.newInstance(byteBuffer), extensionRegistryLite));
    }

    public static <T extends GeneratedMessageLite<T, ?>> T parsePartialFrom(T t, CodedInputStream codedInputStream) throws InvalidProtocolBufferException {
        return (T) m35816y(t, codedInputStream, ExtensionRegistryLite.getEmptyRegistry());
    }

    public static <T extends GeneratedMessageLite<?, ?>> void registerDefaultInstance(Class<T> cls, T t) {
        t.m35820u();
        defaultInstanceMap.put(cls, t);
    }

    /* renamed from: s */
    public static Object m35822s(java.lang.reflect.Method method, Object obj, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e);
        } catch (InvocationTargetException e2) {
            Throwable cause = e2.getCause();
            if (!(cause instanceof RuntimeException)) {
                if (cause instanceof Error) {
                    throw ((Error) cause);
                }
                throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
            }
            throw ((RuntimeException) cause);
        }
    }

    /* renamed from: w */
    public static GeneratedMessageLite m35818w(GeneratedMessageLite generatedMessageLite, InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        try {
            int read = inputStream.read();
            if (read == -1) {
                return null;
            }
            CodedInputStream newInstance = CodedInputStream.newInstance(new AbstractMessageLite.Builder.C8828a(inputStream, CodedInputStream.readRawVarint32(read, inputStream)));
            GeneratedMessageLite m35816y = m35816y(generatedMessageLite, newInstance, extensionRegistryLite);
            try {
                newInstance.checkLastTagWas(0);
                return m35816y;
            } catch (InvalidProtocolBufferException e) {
                throw e.setUnfinishedMessage(m35816y);
            }
        } catch (InvalidProtocolBufferException e2) {
            if (e2.getThrownFromInputStream()) {
                throw new InvalidProtocolBufferException((IOException) e2);
            }
            throw e2;
        } catch (IOException e3) {
            throw new InvalidProtocolBufferException(e3);
        }
    }

    /* renamed from: x */
    public static GeneratedMessageLite m35817x(GeneratedMessageLite generatedMessageLite, ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        CodedInputStream newCodedInput = byteString.newCodedInput();
        GeneratedMessageLite m35816y = m35816y(generatedMessageLite, newCodedInput, extensionRegistryLite);
        try {
            newCodedInput.checkLastTagWas(0);
            return m35816y;
        } catch (InvalidProtocolBufferException e) {
            throw e.setUnfinishedMessage(m35816y);
        }
    }

    /* renamed from: y */
    public static GeneratedMessageLite m35816y(GeneratedMessageLite generatedMessageLite, CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        GeneratedMessageLite m35819v = generatedMessageLite.m35819v();
        try {
            InterfaceC8961t m67676d = C17878Jo1.m67679a().m67676d(m35819v);
            m67676d.mo35113i(m35819v, C8938d.m35371M(codedInputStream), extensionRegistryLite);
            m67676d.mo35117e(m35819v);
            return m35819v;
        } catch (InvalidProtocolBufferException e) {
            e = e;
            if (e.getThrownFromInputStream()) {
                e = new InvalidProtocolBufferException((IOException) e);
            }
            throw e.setUnfinishedMessage(m35819v);
        } catch (UninitializedMessageException e2) {
            throw e2.asInvalidProtocolBufferException().setUnfinishedMessage(m35819v);
        } catch (IOException e3) {
            if (e3.getCause() instanceof InvalidProtocolBufferException) {
                throw ((InvalidProtocolBufferException) e3.getCause());
            }
            throw new InvalidProtocolBufferException(e3).setUnfinishedMessage(m35819v);
        } catch (RuntimeException e4) {
            if (e4.getCause() instanceof InvalidProtocolBufferException) {
                throw ((InvalidProtocolBufferException) e4.getCause());
            }
            throw e4;
        }
    }

    /* renamed from: z */
    public static GeneratedMessageLite m35815z(GeneratedMessageLite generatedMessageLite, byte[] bArr, int i, int i2, ExtensionRegistryLite extensionRegistryLite) {
        GeneratedMessageLite m35819v = generatedMessageLite.m35819v();
        try {
            InterfaceC8961t m67676d = C17878Jo1.m67679a().m67676d(m35819v);
            m67676d.mo35114h(m35819v, bArr, i, i + i2, new AbstractC8934b.C8936b(extensionRegistryLite));
            m67676d.mo35117e(m35819v);
            return m35819v;
        } catch (InvalidProtocolBufferException e) {
            e = e;
            if (e.getThrownFromInputStream()) {
                e = new InvalidProtocolBufferException((IOException) e);
            }
            throw e.setUnfinishedMessage(m35819v);
        } catch (UninitializedMessageException e2) {
            throw e2.asInvalidProtocolBufferException().setUnfinishedMessage(m35819v);
        } catch (IOException e3) {
            if (e3.getCause() instanceof InvalidProtocolBufferException) {
                throw ((InvalidProtocolBufferException) e3.getCause());
            }
            throw new InvalidProtocolBufferException(e3).setUnfinishedMessage(m35819v);
        } catch (IndexOutOfBoundsException unused) {
            throw InvalidProtocolBufferException.truncatedMessage().setUnfinishedMessage(m35819v);
        }
    }

    /* renamed from: A */
    public void m35839A(int i) {
        this.memoizedHashCode = i;
    }

    @Override // com.google.protobuf.AbstractMessageLite
    /* renamed from: a */
    public int mo35838a() {
        return this.memoizedSerializedSize & Integer.MAX_VALUE;
    }

    @Override // com.google.protobuf.AbstractMessageLite
    /* renamed from: b */
    public int mo35837b(InterfaceC8961t interfaceC8961t) {
        if (m35821t()) {
            int m35827n = m35827n(interfaceC8961t);
            if (m35827n >= 0) {
                return m35827n;
            }
            throw new IllegalStateException("serialized size must be non-negative, was " + m35827n);
        } else if (mo35838a() != Integer.MAX_VALUE) {
            return mo35838a();
        } else {
            int m35827n2 = m35827n(interfaceC8961t);
            mo35836e(m35827n2);
            return m35827n2;
        }
    }

    public final <MessageType extends GeneratedMessageLite<MessageType, BuilderType>, BuilderType extends Builder<MessageType, BuilderType>> BuilderType createBuilder() {
        return (BuilderType) dynamicMethod(MethodToInvoke.NEW_BUILDER);
    }

    public Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj) {
        return dynamicMethod(methodToInvoke, obj, null);
    }

    public abstract Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2);

    @Override // com.google.protobuf.AbstractMessageLite
    /* renamed from: e */
    public void mo35836e(int i) {
        if (i >= 0) {
            this.memoizedSerializedSize = (i & Integer.MAX_VALUE) | (this.memoizedSerializedSize & Integer.MIN_VALUE);
            return;
        }
        throw new IllegalStateException("serialized size must be non-negative, was " + i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return C17878Jo1.m67679a().m67676d(this).mo35121a(this, (GeneratedMessageLite) obj);
    }

    @Override // com.google.protobuf.MessageLite
    public final Parser<MessageType> getParserForType() {
        return (Parser) dynamicMethod(MethodToInvoke.GET_PARSER);
    }

    @Override // com.google.protobuf.MessageLite
    public int getSerializedSize() {
        return mo35837b(null);
    }

    /* renamed from: h */
    public Object m35833h() {
        return dynamicMethod(MethodToInvoke.BUILD_MESSAGE_INFO);
    }

    public int hashCode() {
        if (m35821t()) {
            return m35828m();
        }
        if (m35823r()) {
            m35839A(m35828m());
        }
        return m35824q();
    }

    @Override // com.google.protobuf.MessageLiteOrBuilder
    public final boolean isInitialized() {
        return isInitialized(this, true);
    }

    /* renamed from: k */
    public void m35830k() {
        this.memoizedHashCode = 0;
    }

    /* renamed from: l */
    public void m35829l() {
        mo35836e(Integer.MAX_VALUE);
    }

    /* renamed from: m */
    public int m35828m() {
        return C17878Jo1.m67679a().m67676d(this).mo35119c(this);
    }

    public void makeImmutable() {
        C17878Jo1.m67679a().m67676d(this).mo35117e(this);
        m35820u();
    }

    public void mergeLengthDelimitedField(int i, ByteString byteString) {
        m35826o();
        this.unknownFields.m35540h(i, byteString);
    }

    public final void mergeUnknownFields(UnknownFieldSetLite unknownFieldSetLite) {
        this.unknownFields = UnknownFieldSetLite.m35538j(this.unknownFields, unknownFieldSetLite);
    }

    public void mergeVarintField(int i, int i2) {
        m35826o();
        this.unknownFields.m35539i(i, i2);
    }

    /* renamed from: n */
    public final int m35827n(InterfaceC8961t interfaceC8961t) {
        if (interfaceC8961t == null) {
            return C17878Jo1.m67679a().m67676d(this).mo35116f(this);
        }
        return interfaceC8961t.mo35116f(this);
    }

    /* renamed from: o */
    public final void m35826o() {
        if (this.unknownFields == UnknownFieldSetLite.getDefaultInstance()) {
            this.unknownFields = UnknownFieldSetLite.m35537k();
        }
    }

    public boolean parseUnknownField(int i, CodedInputStream codedInputStream) throws IOException {
        if (WireFormat.getTagWireType(i) == 4) {
            return false;
        }
        m35826o();
        return this.unknownFields.m35543e(i, codedInputStream);
    }

    /* renamed from: q */
    public int m35824q() {
        return this.memoizedHashCode;
    }

    /* renamed from: r */
    public boolean m35823r() {
        if (m35824q() == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: t */
    public boolean m35821t() {
        if ((this.memoizedSerializedSize & Integer.MIN_VALUE) != 0) {
            return true;
        }
        return false;
    }

    public String toString() {
        return AbstractC8955o.m35244f(this, super.toString());
    }

    /* renamed from: u */
    public void m35820u() {
        this.memoizedSerializedSize &= Integer.MAX_VALUE;
    }

    /* renamed from: v */
    public GeneratedMessageLite m35819v() {
        return (GeneratedMessageLite) dynamicMethod(MethodToInvoke.NEW_MUTABLE_INSTANCE);
    }

    @Override // com.google.protobuf.MessageLite
    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        C17878Jo1.m67679a().m67676d(this).mo35115g(this, C8940e.m35346O(codedOutputStream));
    }

    public static final <T extends GeneratedMessageLite<T, ?>> boolean isInitialized(T t, boolean z) {
        byte byteValue = ((Byte) t.dynamicMethod(MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        boolean mo35118d = C17878Jo1.m67679a().m67676d(t).mo35118d(t);
        if (z) {
            t.dynamicMethod(MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED, mo35118d ? t : null);
        }
        return mo35118d;
    }

    public final <MessageType extends GeneratedMessageLite<MessageType, BuilderType>, BuilderType extends Builder<MessageType, BuilderType>> BuilderType createBuilder(MessageType messagetype) {
        return (BuilderType) createBuilder().mergeFrom(messagetype);
    }

    public Object dynamicMethod(MethodToInvoke methodToInvoke) {
        return dynamicMethod(methodToInvoke, null, null);
    }

    @Override // com.google.protobuf.MessageLiteOrBuilder
    public final MessageType getDefaultInstanceForType() {
        return (MessageType) dynamicMethod(MethodToInvoke.GET_DEFAULT_INSTANCE);
    }

    @Override // com.google.protobuf.MessageLite
    public final BuilderType newBuilderForType() {
        return (BuilderType) dynamicMethod(MethodToInvoke.NEW_BUILDER);
    }

    @Override // com.google.protobuf.MessageLite
    public final BuilderType toBuilder() {
        return (BuilderType) ((Builder) dynamicMethod(MethodToInvoke.NEW_BUILDER)).mergeFrom((Builder) this);
    }

    /* loaded from: classes4.dex */
    public static class DefaultInstanceBasedParser<T extends GeneratedMessageLite<T, ?>> extends AbstractParser<T> {

        /* renamed from: b */
        public final GeneratedMessageLite f57340b;

        public DefaultInstanceBasedParser(T t) {
            this.f57340b = t;
        }

        @Override // com.google.protobuf.Parser
        public T parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (T) GeneratedMessageLite.m35816y(this.f57340b, codedInputStream, extensionRegistryLite);
        }

        @Override // com.google.protobuf.AbstractParser, com.google.protobuf.Parser
        public T parsePartialFrom(byte[] bArr, int i, int i2, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (T) GeneratedMessageLite.m35815z(this.f57340b, bArr, i, i2, extensionRegistryLite);
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [com.google.protobuf.Internal$LongList] */
    public static Internal.LongList mutableCopy(Internal.LongList longList) {
        int size = longList.size();
        return longList.mutableCopyWithCapacity(size == 0 ? 10 : size * 2);
    }

    public static <T extends GeneratedMessageLite<T, ?>> T parseFrom(T t, ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (T) parseFrom(t, byteBuffer, ExtensionRegistryLite.getEmptyRegistry());
    }

    public static <T extends GeneratedMessageLite<T, ?>> T parseDelimitedFrom(T t, InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (T) m35831j(m35818w(t, inputStream, extensionRegistryLite));
    }

    public static <T extends GeneratedMessageLite<T, ?>> T parseFrom(T t, ByteString byteString) throws InvalidProtocolBufferException {
        return (T) m35831j(parseFrom(t, byteString, ExtensionRegistryLite.getEmptyRegistry()));
    }

    /* loaded from: classes4.dex */
    public static abstract class ExtendableMessage<MessageType extends ExtendableMessage<MessageType, BuilderType>, BuilderType extends ExtendableBuilder<MessageType, BuilderType>> extends GeneratedMessageLite<MessageType, BuilderType> implements ExtendableMessageOrBuilder<MessageType, BuilderType> {
        protected FieldSet extensions = FieldSet.m35864i();

        /* loaded from: classes4.dex */
        public class ExtensionWriter {

            /* renamed from: a */
            public final Iterator f57341a;

            /* renamed from: b */
            public Map.Entry f57342b;

            /* renamed from: c */
            public final boolean f57343c;

            public /* synthetic */ ExtensionWriter(ExtendableMessage extendableMessage, boolean z, C8882a c8882a) {
                this(z);
            }

            public void writeUntil(int i, CodedOutputStream codedOutputStream) throws IOException {
                while (true) {
                    Map.Entry entry = this.f57342b;
                    if (entry != null && ((C8883b) entry.getKey()).getNumber() < i) {
                        C8883b c8883b = (C8883b) this.f57342b.getKey();
                        if (this.f57343c && c8883b.getLiteJavaType() == WireFormat.JavaType.MESSAGE && !c8883b.isRepeated()) {
                            codedOutputStream.writeMessageSetExtension(c8883b.getNumber(), (MessageLite) this.f57342b.getValue());
                        } else {
                            FieldSet.m35873I(c8883b, this.f57342b.getValue(), codedOutputStream);
                        }
                        if (this.f57341a.hasNext()) {
                            this.f57342b = (Map.Entry) this.f57341a.next();
                        } else {
                            this.f57342b = null;
                        }
                    } else {
                        return;
                    }
                }
            }

            public ExtensionWriter(boolean z) {
                ExtendableMessage.this = r2;
                Iterator m35849x = r2.extensions.m35849x();
                this.f57341a = m35849x;
                if (m35849x.hasNext()) {
                    this.f57342b = (Map.Entry) m35849x.next();
                }
                this.f57343c = z;
            }
        }

        /* renamed from: G */
        private void m35805G(GeneratedExtension generatedExtension) {
            if (generatedExtension.getContainingTypeDefaultInstance() == getDefaultInstanceForType()) {
                return;
            }
            throw new IllegalArgumentException("This extension is for a different message type.  Please make sure that you are not suppressing any generics type warnings.");
        }

        /* renamed from: B */
        public final void m35810B(CodedInputStream codedInputStream, GeneratedExtension generatedExtension, ExtensionRegistryLite extensionRegistryLite, int i) {
            m35806F(codedInputStream, extensionRegistryLite, generatedExtension, WireFormat.m35424a(i, 2), i);
        }

        /* renamed from: C */
        public FieldSet m35809C() {
            if (this.extensions.m35854s()) {
                this.extensions = this.extensions.clone();
            }
            return this.extensions;
        }

        /* renamed from: D */
        public final void m35808D(ByteString byteString, ExtensionRegistryLite extensionRegistryLite, GeneratedExtension generatedExtension) {
            MessageLite.Builder builder;
            MessageLite messageLite = (MessageLite) this.extensions.m35863j(generatedExtension.f57348d);
            if (messageLite != null) {
                builder = messageLite.toBuilder();
            } else {
                builder = null;
            }
            if (builder == null) {
                builder = generatedExtension.getMessageDefaultInstance().newBuilderForType();
            }
            builder.mergeFrom(byteString, extensionRegistryLite);
            m35809C().m35878D(generatedExtension.f57348d, generatedExtension.m35802d(builder.build()));
        }

        /* renamed from: E */
        public final void m35807E(MessageLite messageLite, CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            int i = 0;
            ByteString byteString = null;
            GeneratedExtension generatedExtension = null;
            while (true) {
                int readTag = codedInputStream.readTag();
                if (readTag == 0) {
                    break;
                } else if (readTag == WireFormat.f57447c) {
                    i = codedInputStream.readUInt32();
                    if (i != 0) {
                        generatedExtension = extensionRegistryLite.findLiteExtensionByNumber(messageLite, i);
                    }
                } else if (readTag == WireFormat.f57448d) {
                    if (i != 0 && generatedExtension != null) {
                        m35810B(codedInputStream, generatedExtension, extensionRegistryLite, i);
                        byteString = null;
                    } else {
                        byteString = codedInputStream.readBytes();
                    }
                } else if (!codedInputStream.skipField(readTag)) {
                    break;
                }
            }
            codedInputStream.checkLastTagWas(WireFormat.f57446b);
            if (byteString != null && i != 0) {
                if (generatedExtension != null) {
                    m35808D(byteString, extensionRegistryLite, generatedExtension);
                } else {
                    mergeLengthDelimitedField(i, byteString);
                }
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:81:0x0037  */
        /* JADX WARN: Removed duplicated region for block: B:83:0x003c  */
        /* renamed from: F */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final boolean m35806F(com.google.protobuf.CodedInputStream r6, com.google.protobuf.ExtensionRegistryLite r7, com.google.protobuf.GeneratedMessageLite.GeneratedExtension r8, int r9, int r10) {
            /*
                Method dump skipped, instructions count: 292
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.GeneratedMessageLite.ExtendableMessage.m35806F(com.google.protobuf.CodedInputStream, com.google.protobuf.ExtensionRegistryLite, com.google.protobuf.GeneratedMessageLite$GeneratedExtension, int, int):boolean");
        }

        public boolean extensionsAreInitialized() {
            return this.extensions.m35853t();
        }

        public int extensionsSerializedSize() {
            return this.extensions.m35858o();
        }

        public int extensionsSerializedSizeAsMessageSet() {
            return this.extensions.m35862k();
        }

        @Override // com.google.protobuf.GeneratedMessageLite, com.google.protobuf.MessageLiteOrBuilder
        public /* bridge */ /* synthetic */ MessageLite getDefaultInstanceForType() {
            return super.getDefaultInstanceForType();
        }

        @Override // com.google.protobuf.GeneratedMessageLite.ExtendableMessageOrBuilder
        public final <Type> Type getExtension(ExtensionLite<MessageType, Type> extensionLite) {
            GeneratedExtension m35832i = GeneratedMessageLite.m35832i(extensionLite);
            m35805G(m35832i);
            Object m35863j = this.extensions.m35863j(m35832i.f57348d);
            if (m35863j == null) {
                return (Type) m35832i.f57346b;
            }
            return (Type) m35832i.m35804b(m35863j);
        }

        @Override // com.google.protobuf.GeneratedMessageLite.ExtendableMessageOrBuilder
        public final <Type> int getExtensionCount(ExtensionLite<MessageType, List<Type>> extensionLite) {
            GeneratedExtension m35832i = GeneratedMessageLite.m35832i(extensionLite);
            m35805G(m35832i);
            return this.extensions.m35859n(m35832i.f57348d);
        }

        @Override // com.google.protobuf.GeneratedMessageLite.ExtendableMessageOrBuilder
        public final <Type> boolean hasExtension(ExtensionLite<MessageType, Type> extensionLite) {
            GeneratedExtension m35832i = GeneratedMessageLite.m35832i(extensionLite);
            m35805G(m35832i);
            return this.extensions.m35856q(m35832i.f57348d);
        }

        public final void mergeExtensionFields(MessageType messagetype) {
            if (this.extensions.m35854s()) {
                this.extensions = this.extensions.clone();
            }
            this.extensions.m35847z(messagetype.extensions);
        }

        @Override // com.google.protobuf.GeneratedMessageLite, com.google.protobuf.MessageLite
        public /* bridge */ /* synthetic */ MessageLite.Builder newBuilderForType() {
            return super.newBuilderForType();
        }

        public ExtendableMessage<MessageType, BuilderType>.ExtensionWriter newExtensionWriter() {
            return new ExtensionWriter(this, false, null);
        }

        public ExtendableMessage<MessageType, BuilderType>.ExtensionWriter newMessageSetExtensionWriter() {
            return new ExtensionWriter(this, true, null);
        }

        public <MessageType extends MessageLite> boolean parseUnknownField(MessageType messagetype, CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite, int i) throws IOException {
            int tagFieldNumber = WireFormat.getTagFieldNumber(i);
            return m35806F(codedInputStream, extensionRegistryLite, extensionRegistryLite.findLiteExtensionByNumber(messagetype, tagFieldNumber), i, tagFieldNumber);
        }

        public <MessageType extends MessageLite> boolean parseUnknownFieldAsMessageSet(MessageType messagetype, CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite, int i) throws IOException {
            if (i == WireFormat.f57445a) {
                m35807E(messagetype, codedInputStream, extensionRegistryLite);
                return true;
            } else if (WireFormat.getTagWireType(i) == 2) {
                return parseUnknownField(messagetype, codedInputStream, extensionRegistryLite, i);
            } else {
                return codedInputStream.skipField(i);
            }
        }

        @Override // com.google.protobuf.GeneratedMessageLite, com.google.protobuf.MessageLite
        public /* bridge */ /* synthetic */ MessageLite.Builder toBuilder() {
            return super.toBuilder();
        }

        @Override // com.google.protobuf.GeneratedMessageLite.ExtendableMessageOrBuilder
        public final <Type> Type getExtension(ExtensionLite<MessageType, List<Type>> extensionLite, int i) {
            GeneratedExtension m35832i = GeneratedMessageLite.m35832i(extensionLite);
            m35805G(m35832i);
            return (Type) m35832i.m35803c(this.extensions.m35860m(m35832i.f57348d, i));
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [com.google.protobuf.Internal$FloatList] */
    public static Internal.FloatList mutableCopy(Internal.FloatList floatList) {
        int size = floatList.size();
        return floatList.mutableCopyWithCapacity(size == 0 ? 10 : size * 2);
    }

    public static <T extends GeneratedMessageLite<T, ?>> T parseFrom(T t, ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (T) m35831j(m35817x(t, byteString, extensionRegistryLite));
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [com.google.protobuf.Internal$DoubleList] */
    public static Internal.DoubleList mutableCopy(Internal.DoubleList doubleList) {
        int size = doubleList.size();
        return doubleList.mutableCopyWithCapacity(size == 0 ? 10 : size * 2);
    }

    public static <T extends GeneratedMessageLite<T, ?>> T parseFrom(T t, byte[] bArr) throws InvalidProtocolBufferException {
        return (T) m35831j(m35815z(t, bArr, 0, bArr.length, ExtensionRegistryLite.getEmptyRegistry()));
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [com.google.protobuf.Internal$BooleanList] */
    public static Internal.BooleanList mutableCopy(Internal.BooleanList booleanList) {
        int size = booleanList.size();
        return booleanList.mutableCopyWithCapacity(size == 0 ? 10 : size * 2);
    }

    public static <T extends GeneratedMessageLite<T, ?>> T parseFrom(T t, byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (T) m35831j(m35815z(t, bArr, 0, bArr.length, extensionRegistryLite));
    }

    public static <E> Internal.ProtobufList<E> mutableCopy(Internal.ProtobufList<E> protobufList) {
        int size = protobufList.size();
        return protobufList.mutableCopyWithCapacity(size == 0 ? 10 : size * 2);
    }

    public static <T extends GeneratedMessageLite<T, ?>> T parseFrom(T t, InputStream inputStream) throws InvalidProtocolBufferException {
        return (T) m35831j(m35816y(t, CodedInputStream.newInstance(inputStream), ExtensionRegistryLite.getEmptyRegistry()));
    }

    public static <T extends GeneratedMessageLite<T, ?>> T parseFrom(T t, InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (T) m35831j(m35816y(t, CodedInputStream.newInstance(inputStream), extensionRegistryLite));
    }

    public static <T extends GeneratedMessageLite<T, ?>> T parseFrom(T t, CodedInputStream codedInputStream) throws InvalidProtocolBufferException {
        return (T) parseFrom(t, codedInputStream, ExtensionRegistryLite.getEmptyRegistry());
    }

    public static <T extends GeneratedMessageLite<T, ?>> T parseFrom(T t, CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (T) m35831j(m35816y(t, codedInputStream, extensionRegistryLite));
    }
}
