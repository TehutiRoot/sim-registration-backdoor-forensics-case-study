package th.p047co.dtac.android.dtacone.util.validation.person;

import androidx.compose.runtime.internal.StabilityInferred;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import th.p047co.dtac.android.dtacone.R;
import th.p047co.dtac.android.dtacone.model.error.ValidatedRuleException;
import th.p047co.dtac.android.dtacone.util.validation.ValidationRule;

@StabilityInferred(parameters = 0)
@Metadata(m29143d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0004J\u0016\u0010\u0005\u001a\u00020\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016¨\u0006\b"}, m29142d2 = {"Lth/co/dtac/android/dtacone/util/validation/person/GenderSelectRule;", "Lth/co/dtac/android/dtacone/util/validation/ValidationRule;", "", "", "()V", "validate", "", "listOfValue", "app_prodRelease"}, m29141k = 1, m29140mv = {1, 8, 0}, m29138xi = 48)
@SourceDebugExtension({"SMAP\nGenderSelectRule.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GenderSelectRule.kt\nth/co/dtac/android/dtacone/util/validation/person/GenderSelectRule\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,13:1\n2661#2,7:14\n*S KotlinDebug\n*F\n+ 1 GenderSelectRule.kt\nth/co/dtac/android/dtacone/util/validation/person/GenderSelectRule\n*L\n9#1:14,7\n*E\n"})
/* renamed from: th.co.dtac.android.dtacone.util.validation.person.GenderSelectRule */
/* loaded from: classes8.dex */
public final class GenderSelectRule implements ValidationRule<List<? extends Boolean>> {
    public static final int $stable = 0;

    @Override // th.p047co.dtac.android.dtacone.util.validation.ValidationRule
    public /* bridge */ /* synthetic */ void validate(List<? extends Boolean> list) {
        validate2((List<Boolean>) list);
    }

    /* renamed from: validate  reason: avoid collision after fix types in other method */
    public void validate2(@NotNull List<Boolean> listOfValue) {
        Intrinsics.checkNotNullParameter(listOfValue, "listOfValue");
        Iterator<T> it = listOfValue.iterator();
        if (it.hasNext()) {
            Object next = it.next();
            while (it.hasNext()) {
                next = Boolean.valueOf(((Boolean) next).booleanValue() || ((Boolean) it.next()).booleanValue());
            }
            if (!((Boolean) next).booleanValue()) {
                throw new ValidatedRuleException(R.string.common_sim_owner_informaion_please_enter_gender);
            }
            return;
        }
        throw new UnsupportedOperationException("Empty collection can't be reduced.");
    }
}