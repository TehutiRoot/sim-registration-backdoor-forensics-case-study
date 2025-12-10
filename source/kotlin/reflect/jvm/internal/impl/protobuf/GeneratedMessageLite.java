package kotlin.reflect.jvm.internal.impl.protobuf;

import ch.qos.logback.core.CoreConstants;
import java.io.IOException;
import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite;
import kotlin.reflect.jvm.internal.impl.protobuf.FieldSet;
import kotlin.reflect.jvm.internal.impl.protobuf.Internal;
import kotlin.reflect.jvm.internal.impl.protobuf.MessageLite;
import kotlin.reflect.jvm.internal.impl.protobuf.WireFormat;

/* loaded from: classes6.dex */
public abstract class GeneratedMessageLite extends AbstractMessageLite implements Serializable {

    /* loaded from: classes6.dex */
    public interface ExtendableMessageOrBuilder<MessageType extends ExtendableMessage> extends MessageLiteOrBuilder {
    }

    /* loaded from: classes6.dex */
    public static class GeneratedExtension<ContainingType extends MessageLite, Type> {

        /* renamed from: a */
        public final MessageLite f69735a;

        /* renamed from: b */
        public final Object f69736b;

        /* renamed from: c */
        public final MessageLite f69737c;

        /* renamed from: d */
        public final C11905b f69738d;

        /* renamed from: e */
        public final Class f69739e;

        /* renamed from: f */
        public final Method f69740f;

        public GeneratedExtension(MessageLite messageLite, Object obj, MessageLite messageLite2, C11905b c11905b, Class cls) {
            if (messageLite != null) {
                if (c11905b.getLiteType() == WireFormat.FieldType.MESSAGE && messageLite2 == null) {
                    throw new IllegalArgumentException("Null messageDefaultInstance");
                }
                this.f69735a = messageLite;
                this.f69736b = obj;
                this.f69737c = messageLite2;
                this.f69738d = c11905b;
                this.f69739e = cls;
                if (Internal.EnumLite.class.isAssignableFrom(cls)) {
                    this.f69740f = GeneratedMessageLite.getMethodOrDie(cls, CoreConstants.VALUE_OF, Integer.TYPE);
                    return;
                } else {
                    this.f69740f = null;
                    return;
                }
            }
            throw new IllegalArgumentException("Null containingTypeDefaultInstance");
        }

        /* renamed from: a */
        public Object m27958a(Object obj) {
            if (this.f69738d.isRepeated()) {
                if (this.f69738d.getLiteJavaType() == WireFormat.JavaType.ENUM) {
                    ArrayList arrayList = new ArrayList();
                    for (Object obj2 : (List) obj) {
                        arrayList.add(m27957b(obj2));
                    }
                    return arrayList;
                }
                return obj;
            }
            return m27957b(obj);
        }

        /* renamed from: b */
        public Object m27957b(Object obj) {
            if (this.f69738d.getLiteJavaType() == WireFormat.JavaType.ENUM) {
                return GeneratedMessageLite.invokeOrDie(this.f69740f, null, (Integer) obj);
            }
            return obj;
        }

        /* renamed from: c */
        public Object m27956c(Object obj) {
            if (this.f69738d.getLiteJavaType() == WireFormat.JavaType.ENUM) {
                return Integer.valueOf(((Internal.EnumLite) obj).getNumber());
            }
            return obj;
        }

        public ContainingType getContainingTypeDefaultInstance() {
            return (ContainingType) this.f69735a;
        }

        public MessageLite getMessageDefaultInstance() {
            return this.f69737c;
        }

        public int getNumber() {
            return this.f69738d.getNumber();
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite$a */
    /* loaded from: classes6.dex */
    public static /* synthetic */ class C11904a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f69741a;

        static {
            int[] iArr = new int[WireFormat.JavaType.values().length];
            f69741a = iArr;
            try {
                iArr[WireFormat.JavaType.MESSAGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f69741a[WireFormat.JavaType.ENUM.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite$b */
    /* loaded from: classes6.dex */
    public static final class C11905b implements FieldSet.FieldDescriptorLite {

        /* renamed from: a */
        public final Internal.EnumLiteMap f69742a;

        /* renamed from: b */
        public final int f69743b;

        /* renamed from: c */
        public final WireFormat.FieldType f69744c;

        /* renamed from: d */
        public final boolean f69745d;

        /* renamed from: e */
        public final boolean f69746e;

        public C11905b(Internal.EnumLiteMap enumLiteMap, int i, WireFormat.FieldType fieldType, boolean z, boolean z2) {
            this.f69742a = enumLiteMap;
            this.f69743b = i;
            this.f69744c = fieldType;
            this.f69745d = z;
            this.f69746e = z2;
        }

        @Override // java.lang.Comparable
        /* renamed from: a */
        public int compareTo(C11905b c11905b) {
            return this.f69743b - c11905b.f69743b;
        }

        /* renamed from: b */
        public Internal.EnumLiteMap m27954b() {
            return this.f69742a;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.FieldSet.FieldDescriptorLite
        public WireFormat.JavaType getLiteJavaType() {
            return this.f69744c.getJavaType();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.FieldSet.FieldDescriptorLite
        public WireFormat.FieldType getLiteType() {
            return this.f69744c;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.FieldSet.FieldDescriptorLite
        public int getNumber() {
            return this.f69743b;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.FieldSet.FieldDescriptorLite
        public MessageLite.Builder internalMergeFrom(MessageLite.Builder builder, MessageLite messageLite) {
            return ((Builder) builder).mergeFrom((GeneratedMessageLite) messageLite);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.FieldSet.FieldDescriptorLite
        public boolean isPacked() {
            return this.f69746e;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.FieldSet.FieldDescriptorLite
        public boolean isRepeated() {
            return this.f69745d;
        }
    }

    public GeneratedMessageLite() {
    }

    public static Method getMethodOrDie(Class cls, String str, Class... clsArr) {
        try {
            return cls.getMethod(str, clsArr);
        } catch (NoSuchMethodException e) {
            String name = cls.getName();
            String valueOf = String.valueOf(str);
            StringBuilder sb = new StringBuilder(name.length() + 45 + valueOf.length());
            sb.append("Generated message class \"");
            sb.append(name);
            sb.append("\" missing method \"");
            sb.append(valueOf);
            sb.append("\".");
            throw new RuntimeException(sb.toString(), e);
        }
    }

    public static Object invokeOrDie(Method method, Object obj, Object... objArr) {
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

    public static <ContainingType extends MessageLite, Type> GeneratedExtension<ContainingType, Type> newRepeatedGeneratedExtension(ContainingType containingtype, MessageLite messageLite, Internal.EnumLiteMap<?> enumLiteMap, int i, WireFormat.FieldType fieldType, boolean z, Class cls) {
        return new GeneratedExtension<>(containingtype, Collections.emptyList(), messageLite, new C11905b(enumLiteMap, i, fieldType, true, z), cls);
    }

    public static <ContainingType extends MessageLite, Type> GeneratedExtension<ContainingType, Type> newSingularGeneratedExtension(ContainingType containingtype, Type type, MessageLite messageLite, Internal.EnumLiteMap<?> enumLiteMap, int i, WireFormat.FieldType fieldType, Class cls) {
        return new GeneratedExtension<>(containingtype, type, messageLite, new C11905b(enumLiteMap, i, fieldType, false, false), cls);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLite
    public Parser<? extends MessageLite> getParserForType() {
        throw new UnsupportedOperationException("This is supposed to be overridden by subclasses.");
    }

    public void makeExtensionsImmutable() {
    }

    public boolean parseUnknownField(CodedInputStream codedInputStream, CodedOutputStream codedOutputStream, ExtensionRegistryLite extensionRegistryLite, int i) throws IOException {
        return codedInputStream.skipField(i, codedOutputStream);
    }

    /* loaded from: classes6.dex */
    public static abstract class Builder<MessageType extends GeneratedMessageLite, BuilderType extends Builder> extends AbstractMessageLite.Builder<BuilderType> {

        /* renamed from: a */
        public ByteString f69728a = ByteString.EMPTY;

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.MessageLiteOrBuilder
        public abstract MessageType getDefaultInstanceForType();

        public final ByteString getUnknownFields() {
            return this.f69728a;
        }

        public abstract BuilderType mergeFrom(MessageType messagetype);

        public final BuilderType setUnknownFields(ByteString byteString) {
            this.f69728a = byteString;
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
        public BuilderType clone() {
            throw new UnsupportedOperationException("This is supposed to be overridden by subclasses.");
        }
    }

    /* loaded from: classes6.dex */
    public static abstract class ExtendableMessage<MessageType extends ExtendableMessage<MessageType>> extends GeneratedMessageLite implements ExtendableMessageOrBuilder<MessageType> {
        private final FieldSet extensions;

        /* loaded from: classes6.dex */
        public class ExtensionWriter {

            /* renamed from: a */
            public final Iterator f69731a;

            /* renamed from: b */
            public Map.Entry f69732b;

            /* renamed from: c */
            public final boolean f69733c;

            public /* synthetic */ ExtensionWriter(ExtendableMessage extendableMessage, boolean z, C11904a c11904a) {
                this(z);
            }

            public void writeUntil(int i, CodedOutputStream codedOutputStream) throws IOException {
                while (true) {
                    Map.Entry entry = this.f69732b;
                    if (entry != null && ((C11905b) entry.getKey()).getNumber() < i) {
                        C11905b c11905b = (C11905b) this.f69732b.getKey();
                        if (this.f69733c && c11905b.getLiteJavaType() == WireFormat.JavaType.MESSAGE && !c11905b.isRepeated()) {
                            codedOutputStream.writeMessageSetExtension(c11905b.getNumber(), (MessageLite) this.f69732b.getValue());
                        } else {
                            FieldSet.m27962z(c11905b, this.f69732b.getValue(), codedOutputStream);
                        }
                        if (this.f69731a.hasNext()) {
                            this.f69732b = (Map.Entry) this.f69731a.next();
                        } else {
                            this.f69732b = null;
                        }
                    } else {
                        return;
                    }
                }
            }

            public ExtensionWriter(boolean z) {
                Iterator m27972p = ExtendableMessage.this.extensions.m27972p();
                this.f69731a = m27972p;
                if (m27972p.hasNext()) {
                    this.f69732b = (Map.Entry) m27972p.next();
                }
                this.f69733c = z;
            }
        }

        public ExtendableMessage() {
            this.extensions = FieldSet.m27968t();
        }

        private void verifyExtensionContainingType(GeneratedExtension<MessageType, ?> generatedExtension) {
            if (generatedExtension.getContainingTypeDefaultInstance() == getDefaultInstanceForType()) {
                return;
            }
            throw new IllegalArgumentException("This extension is for a different message type.  Please make sure that you are not suppressing any generics type warnings.");
        }

        public boolean extensionsAreInitialized() {
            return this.extensions.m27974n();
        }

        public int extensionsSerializedSize() {
            return this.extensions.m27977k();
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final <Type> Type getExtension(GeneratedExtension<MessageType, Type> generatedExtension) {
            verifyExtensionContainingType(generatedExtension);
            Object m27980h = this.extensions.m27980h(generatedExtension.f69738d);
            if (m27980h == null) {
                return (Type) generatedExtension.f69736b;
            }
            return (Type) generatedExtension.m27958a(m27980h);
        }

        public final <Type> int getExtensionCount(GeneratedExtension<MessageType, List<Type>> generatedExtension) {
            verifyExtensionContainingType(generatedExtension);
            return this.extensions.m27978j(generatedExtension.f69738d);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final <Type> boolean hasExtension(GeneratedExtension<MessageType, Type> generatedExtension) {
            verifyExtensionContainingType(generatedExtension);
            return this.extensions.m27975m(generatedExtension.f69738d);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite
        public void makeExtensionsImmutable() {
            this.extensions.m27971q();
        }

        public ExtendableMessage<MessageType>.ExtensionWriter newExtensionWriter() {
            return new ExtensionWriter(this, false, null);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite
        public boolean parseUnknownField(CodedInputStream codedInputStream, CodedOutputStream codedOutputStream, ExtensionRegistryLite extensionRegistryLite, int i) throws IOException {
            return GeneratedMessageLite.parseUnknownField(this.extensions, getDefaultInstanceForType(), codedInputStream, codedOutputStream, extensionRegistryLite, i);
        }

        public ExtendableMessage(ExtendableBuilder<MessageType, ?> extendableBuilder) {
            this.extensions = extendableBuilder.m27960b();
        }

        public final <Type> Type getExtension(GeneratedExtension<MessageType, List<Type>> generatedExtension, int i) {
            verifyExtensionContainingType(generatedExtension);
            return (Type) generatedExtension.m27957b(this.extensions.m27979i(generatedExtension.f69738d, i));
        }
    }

    public GeneratedMessageLite(Builder builder) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:17:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0044  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static <MessageType extends kotlin.reflect.jvm.internal.impl.protobuf.MessageLite> boolean parseUnknownField(kotlin.reflect.jvm.internal.impl.protobuf.FieldSet r5, MessageType r6, kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream r7, kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream r8, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite r9, int r10) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 290
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.parseUnknownField(kotlin.reflect.jvm.internal.impl.protobuf.FieldSet, kotlin.reflect.jvm.internal.impl.protobuf.MessageLite, kotlin.reflect.jvm.internal.impl.protobuf.CodedInputStream, kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream, kotlin.reflect.jvm.internal.impl.protobuf.ExtensionRegistryLite, int):boolean");
    }

    /* loaded from: classes6.dex */
    public static abstract class ExtendableBuilder<MessageType extends ExtendableMessage<MessageType>, BuilderType extends ExtendableBuilder<MessageType, BuilderType>> extends Builder<MessageType, BuilderType> implements ExtendableMessageOrBuilder<MessageType> {

        /* renamed from: b */
        public FieldSet f69729b = FieldSet.m27981g();

        /* renamed from: c */
        public boolean f69730c;

        /* renamed from: b */
        public final FieldSet m27960b() {
            this.f69729b.m27971q();
            this.f69730c = false;
            return this.f69729b;
        }

        /* renamed from: c */
        public final void m27959c() {
            if (!this.f69730c) {
                this.f69729b = this.f69729b.clone();
                this.f69730c = true;
            }
        }

        public boolean extensionsAreInitialized() {
            return this.f69729b.m27974n();
        }

        public final void mergeExtensionFields(MessageType messagetype) {
            m27959c();
            this.f69729b.m27970r(((ExtendableMessage) messagetype).extensions);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite.Builder, kotlin.reflect.jvm.internal.impl.protobuf.AbstractMessageLite.Builder
        public BuilderType clone() {
            throw new UnsupportedOperationException("This is supposed to be overridden by subclasses.");
        }
    }
}
