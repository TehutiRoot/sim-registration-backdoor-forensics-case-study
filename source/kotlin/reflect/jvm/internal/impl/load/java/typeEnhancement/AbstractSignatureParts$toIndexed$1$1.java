package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.load.java.JavaTypeQualifiersByElementType;
import kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.AbstractSignatureParts;
import kotlin.reflect.jvm.internal.impl.types.model.FlexibleTypeMarker;
import kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker;
import kotlin.reflect.jvm.internal.impl.types.model.TypeArgumentMarker;
import kotlin.reflect.jvm.internal.impl.types.model.TypeConstructorMarker;
import kotlin.reflect.jvm.internal.impl.types.model.TypeParameterMarker;
import kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@SourceDebugExtension({"SMAP\nAbstractSignatureParts.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AbstractSignatureParts.kt\norg/jetbrains/kotlin/load/java/typeEnhancement/AbstractSignatureParts$toIndexed$1$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,228:1\n3433#2,7:229\n*S KotlinDebug\n*F\n+ 1 AbstractSignatureParts.kt\norg/jetbrains/kotlin/load/java/typeEnhancement/AbstractSignatureParts$toIndexed$1$1\n*L\n209#1:229,7\n*E\n"})
/* loaded from: classes6.dex */
public final class AbstractSignatureParts$toIndexed$1$1 extends Lambda implements Function1<AbstractSignatureParts.C11802a, Iterable<? extends AbstractSignatureParts.C11802a>> {
    final /* synthetic */ TypeSystemContext $this_with;
    final /* synthetic */ AbstractSignatureParts<TAnnotation> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractSignatureParts$toIndexed$1$1(AbstractSignatureParts<TAnnotation> abstractSignatureParts, TypeSystemContext typeSystemContext) {
        super(1);
        this.this$0 = abstractSignatureParts;
        this.$this_with = typeSystemContext;
    }

    @Override // kotlin.jvm.functions.Function1
    @Nullable
    public final Iterable<AbstractSignatureParts.C11802a> invoke(@NotNull AbstractSignatureParts.C11802a it) {
        TypeConstructorMarker typeConstructor;
        List<TypeParameterMarker> parameters;
        JavaTypeQualifiersByElementType m28306a;
        AbstractSignatureParts.C11802a c11802a;
        FlexibleTypeMarker asFlexibleType;
        Intrinsics.checkNotNullParameter(it, "it");
        if (this.this$0.getSkipRawTypeArguments()) {
            KotlinTypeMarker m28296b = it.m28296b();
            if (((m28296b == null || (asFlexibleType = this.$this_with.asFlexibleType(m28296b)) == null) ? null : this.$this_with.asRawType(asFlexibleType)) != null) {
                return null;
            }
        }
        KotlinTypeMarker m28296b2 = it.m28296b();
        if (m28296b2 == null || (typeConstructor = this.$this_with.typeConstructor(m28296b2)) == null || (parameters = this.$this_with.getParameters(typeConstructor)) == null) {
            return null;
        }
        List<TypeParameterMarker> list = parameters;
        List<TypeArgumentMarker> arguments = this.$this_with.getArguments(it.m28296b());
        TypeSystemContext typeSystemContext = this.$this_with;
        AbstractSignatureParts<TAnnotation> abstractSignatureParts = this.this$0;
        Iterator<T> it2 = list.iterator();
        Iterator<T> it3 = arguments.iterator();
        ArrayList arrayList = new ArrayList(Math.min(AbstractC10176es.collectionSizeOrDefault(list, 10), AbstractC10176es.collectionSizeOrDefault(arguments, 10)));
        while (it2.hasNext() && it3.hasNext()) {
            Object next = it2.next();
            TypeArgumentMarker typeArgumentMarker = (TypeArgumentMarker) it3.next();
            TypeParameterMarker typeParameterMarker = (TypeParameterMarker) next;
            if (typeSystemContext.isStarProjection(typeArgumentMarker)) {
                c11802a = new AbstractSignatureParts.C11802a(null, it.m28297a(), typeParameterMarker);
            } else {
                KotlinTypeMarker type = typeSystemContext.getType(typeArgumentMarker);
                m28306a = abstractSignatureParts.m28306a(type, it.m28297a());
                c11802a = new AbstractSignatureParts.C11802a(type, m28306a, typeParameterMarker);
            }
            arrayList.add(c11802a);
        }
        return arrayList;
    }
}
