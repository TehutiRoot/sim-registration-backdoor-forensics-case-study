package kotlin.reflect.jvm.internal.impl.resolve.scopes;

import java.util.Collection;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.ResolutionScope;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes6.dex */
public final class SubstitutingScope$_allDescriptors$2 extends Lambda implements Function0<Collection<? extends DeclarationDescriptor>> {
    final /* synthetic */ SubstitutingScope this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SubstitutingScope$_allDescriptors$2(SubstitutingScope substitutingScope) {
        super(0);
        this.this$0 = substitutingScope;
    }

    @Override // kotlin.jvm.functions.Function0
    @NotNull
    public final Collection<? extends DeclarationDescriptor> invoke() {
        MemberScope memberScope;
        Collection<? extends DeclarationDescriptor> m28024b;
        SubstitutingScope substitutingScope = this.this$0;
        memberScope = substitutingScope.f69998a;
        m28024b = substitutingScope.m28024b(ResolutionScope.DefaultImpls.getContributedDescriptors$default(memberScope, null, null, 3, null));
        return m28024b;
    }
}